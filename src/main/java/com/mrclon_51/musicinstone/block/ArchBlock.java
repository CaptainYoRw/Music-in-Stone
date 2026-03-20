package com.mrclon_51.musicinstone.block;

import com.mrclon_51.musicinstone.ItemsRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ArchBlock extends Block implements SimpleWaterloggedBlock
{
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<Half> HALF = BlockStateProperties.HALF;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    protected static final VoxelShape BOTTOM_SHAPE = Block.box(0, 0, 0, 16, 4, 16);
    protected static final VoxelShape TOP_SHAPE = Block.box(0, 12, 0, 16, 16, 16);

    public static final IntegerProperty OFFSET = IntegerProperty.create("offset", 0, 2);

    public ArchBlock(Properties properties)
    {
        super(properties);
        // Set the default state (what the block is when you first get it)
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(HALF, Half.TOP)
                .setValue(WATERLOGGED, false)
                .setValue(OFFSET, 0));
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit)
    {
        ItemStack stack = player.getItemInHand(hand);
        // Replaces Items.STICK with my own item
        if (stack.getItem() == ItemsRegistry.TEST_ITEM.get() && !level.isClientSide)
        {
            int current = state.getValue(OFFSET);
            int next = (current + 1) % 3; // Cycle 0->1->2->0
            level.setBlock(pos, state.setValue(OFFSET, next), 3);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    // This controls PHYSICS (walking into it).
    // Returning Shapes.empty() means you can walk right through it (Phantom block).
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context)
    {
        return Shapes.empty();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context)
    {
        // Get the current HALF (Top or Bottom)
        Half half = state.getValue(HALF);

        // Return the correct shape
        if (half == Half.TOP)
        {
            return BOTTOM_SHAPE;
        } else
        {
            return TOP_SHAPE;
        }
    }

    // Logic for placing the block (checking player rotation & click height)

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx)
    {
        BlockPos pos = ctx.getClickedPos();
        FluidState fluidState = ctx.getLevel().getFluidState(pos);
        Direction face = ctx.getClickedFace();

        // Determine if we are placing the "Top" or "Bottom" half
        Direction direction = ctx.getClickedFace();
        Half half = (face == Direction.DOWN || (face != Direction.UP && ctx.getClickLocation().y - pos.getY() > 0.5))
                ? Half.BOTTOM : Half.TOP;

        return this.defaultBlockState()
                .setValue(FACING, ctx.getHorizontalDirection().getOpposite()) // Face player
                .setValue(HALF, half)
                .setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER); // Handle placing IN water
    }

    // Handle water physics (flowing)
    @SuppressWarnings("deprecation")
    @Override
    public FluidState getFluidState(BlockState state)
    {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    // Update shape when neighbors change (crucial for water flow updates)
    @SuppressWarnings("deprecation")
    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos currentPos, BlockPos neighborPos)
    {
        if (state.getValue(WATERLOGGED))
        {
            level.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return super.updateShape(state, direction, neighborState, level, currentPos, neighborPos);
    }

    // Register the properties so the game knows they exist
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, HALF, WATERLOGGED, OFFSET);
    }
}

