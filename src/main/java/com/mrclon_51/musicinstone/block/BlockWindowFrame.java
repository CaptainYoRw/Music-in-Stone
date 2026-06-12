package com.mrclon_51.musicinstone.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockWindowFrame extends Block implements SimpleWaterloggedBlock
{
    private static final VoxelShape SHAPE_NORTH = Block.box(7, 0, 0, 9, 16, 2);
    private static final VoxelShape SHAPE_SOUTH = Block.box(7, 0, 14, 9, 16, 16);
    private static final VoxelShape SHAPE_EAST = Block.box(14, 0, 7, 16, 16, 9);
    private static final VoxelShape SHAPE_WEST = Block.box(0, 0, 7, 2, 16, 9);

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public static final EnumProperty<ClickZone> ZONE = EnumProperty.create("zone", ClickZone.class);

    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public enum ClickZone implements StringRepresentable
    {
        LEFT("left"),
        MIDDLE("middle"),
        RIGHT("right");

        private final String name;
        ClickZone(String name) { this.name = name; }

        @Override
        public String getSerializedName() { return this.name; }
    }

    public BlockWindowFrame(Properties pProperties)
    {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, false)
                .setValue(ZONE, ClickZone.MIDDLE));
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
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context)
    {
        return Shapes.empty();
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
        boolean isWaterlogged = fluidState.getType() == Fluids.WATER;

        BlockState state = super.getStateForPlacement(context);
        if (state == null) return null;

        Direction facing = context.getHorizontalDirection();

        double hitX = context.getClickLocation().x - (double)context.getClickedPos().getX();
        double hitZ = context.getClickLocation().z - (double)context.getClickedPos().getZ();

        double relativeX = switch (facing)
        {
            case NORTH -> hitX;
            case SOUTH -> 1.0 - hitX;
            case WEST  -> 1.0 - hitZ;
            case EAST  -> hitZ;
            default    -> hitX;
        };

        ClickZone zone = ClickZone.MIDDLE;
        if (relativeX <= 0.3125)      zone = ClickZone.LEFT;
        else if (relativeX >= 0.6875) zone = ClickZone.RIGHT;

        return this.defaultBlockState()
                .setValue(FACING, facing)
                .setValue(ZONE, zone)
                .setValue(WATERLOGGED, isWaterlogged);

    }

    @Override
    public FluidState getFluidState(BlockState state)
    {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

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

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, ZONE, WATERLOGGED);
    }
}
