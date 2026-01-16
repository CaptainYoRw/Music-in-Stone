package com.mrclon_51.musicinstone.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ArchBlock extends Block implements SimpleWaterloggedBlock
{
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<Half> HALF = BlockStateProperties.HALF;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public ArchBlock(Properties properties)
    {

        super(properties);
        // Set the default state (what the block is when you first get it)
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(HALF, Half.BOTTOM)
                .setValue(WATERLOGGED, false));
    }

    // This controls PHYSICS (walking into it).
    // Returning Shapes.empty() means you can walk right through it (Phantom block).
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    // This controls the BLACK OUTLINE (selection).
    // If you want to see the outline when you look at it, DELETE this entire function.
    // If you want it to be totally un-selectable (ghost), keep this as Shapes.empty().
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        // currently standard full block outline. Change to Shapes.empty() to make it invisible to mouse.
        return super.getShape(state, level, pos, context);
    }

    // 3. Logic for placing the block (checking player rotation & click height)

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx)
    {
        BlockPos pos = ctx.getClickedPos();
        FluidState fluidState = ctx.getLevel().getFluidState(pos);

        // Determine if we are placing the "Top" or "Bottom" half
        Direction direction = ctx.getClickedFace();
        Half half;
        if (direction == Direction.DOWN || (direction != Direction.UP && ctx.getClickLocation().y - (double)pos.getY() > 0.5D))
        {
            half = Half.TOP;
        } else
        {
            half = Half.BOTTOM;
        }

        return this.defaultBlockState()
                .setValue(FACING, ctx.getHorizontalDirection().getOpposite()) // Face player
                .setValue(HALF, half)
                .setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER); // Handle placing IN water
    }

    // 4. Handle water physics (flowing)
    @SuppressWarnings("deprecation")
    @Override
    public FluidState getFluidState(BlockState state)
    {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    // 5. Update shape when neighbors change (crucial for water flow updates)
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

    // 6. Register the properties so the game knows they exist
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, HALF, WATERLOGGED);
    }
}

