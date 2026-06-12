package com.mrclon_51.musicinstone.block;

import com.mrclon_51.musicinstone.ItemsRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
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
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockWindowPediment extends Block implements SimpleWaterloggedBlock
{
    public enum Frame implements StringRepresentable
    {
        FRAMED("frame"),
        FRAMELESS("frameless");

        private final String name;

        Frame(String name)
        {
            this.name = name;
        }

        @Override
        public String getSerializedName()
        {
            return this.name;
        }
    }

    public static final EnumProperty<Frame> FRAME = EnumProperty.create("frame", Frame.class);

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public static final BooleanProperty CONNECTED_LEFT = BooleanProperty.create("connected_left");
    public static final BooleanProperty CONNECTED_RIGHT = BooleanProperty.create("connected_right");

    private static final VoxelShape SHAPE_NORTH = Block.box(0, 0, 0, 16, 16, 5);
    private static final VoxelShape SHAPE_SOUTH = Block.box(0, 0, 11, 16, 16, 16);
    private static final VoxelShape SHAPE_EAST = Block.box(11, 0, 0, 16, 16, 16);
    private static final VoxelShape SHAPE_WEST = Block.box(0, 0, 0, 2, 16, 16);

    public BlockWindowPediment(Properties properties)
    {
        super(properties);

        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(FRAME, Frame.FRAMELESS)
                .setValue(CONNECTED_LEFT, false)
                .setValue(CONNECTED_RIGHT, false)
                .setValue(WATERLOGGED, false));
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext)
    {
        switch (pState.getValue(FACING))
        {
            case SOUTH:
                return SHAPE_SOUTH;
            case EAST:
                return SHAPE_EAST;
            case WEST:
                return SHAPE_WEST;
            default:
                return SHAPE_NORTH;
        }
    }

    @Override
    public FluidState getFluidState(BlockState state)
    {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    private boolean isConnectable(BlockState state)
    {
        return state.is(this);
    }

    @SuppressWarnings("deprecation")
    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos currentPos, BlockPos neighborPos)
    {
        Direction facing = state.getValue(FACING);
        Direction leftDir = facing.getCounterClockWise();
        Direction rightDir = facing.getClockWise();

        boolean connectLeft = isConnectable(level.getBlockState(currentPos.relative(leftDir)));
        boolean connectRight = isConnectable(level.getBlockState(currentPos.relative(rightDir)));

        if (state.getValue(WATERLOGGED))
        {
            level.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return state
                .setValue(CONNECTED_LEFT, connectLeft)
                .setValue(CONNECTED_RIGHT, connectRight);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
        boolean isWaterlogged = fluidState.getType() == Fluids.WATER;

        Direction facing = context.getHorizontalDirection();
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();

        boolean connectLeft = isConnectable(level.getBlockState(pos.relative(facing.getCounterClockWise())));
        boolean connectRight = isConnectable(level.getBlockState(pos.relative(facing.getClockWise())));

        return this.defaultBlockState()
                .setValue(FACING, facing)
                .setValue(CONNECTED_LEFT, connectLeft)
                .setValue(CONNECTED_RIGHT, connectRight)
                .setValue(FRAME, Frame.FRAMELESS)
                .setValue(WATERLOGGED, isWaterlogged);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit)
    {
        ItemStack stack = player.getItemInHand(hand);
        if (stack.getItem() == ItemsRegistry.ARCHITECT_TOOLS.get() && !level.isClientSide && hand == InteractionHand.MAIN_HAND)
        {
            Frame current = state.getValue(FRAME);
            Frame next = (current == Frame.FRAMED) ? Frame.FRAMELESS : Frame.FRAMED;
            level.setBlock(pos, state.setValue(FRAME, next), 3);

            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, FRAME, CONNECTED_LEFT, CONNECTED_RIGHT, WATERLOGGED);
    }

}


