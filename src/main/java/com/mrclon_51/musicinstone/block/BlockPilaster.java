package com.mrclon_51.musicinstone.block;

import com.mrclon_51.musicinstone.TagsRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockPilaster extends BlockColumn
{
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    private static final VoxelShape SHAPE_NORTH = Block.box(3, 0, 0, 13, 16, 2);
    private static final VoxelShape SHAPE_SOUTH = Block.box(3, 0, 14, 13, 16, 16);
    private static final VoxelShape SHAPE_EAST = Block.box(14, 0, 3, 16, 16, 13);
    private static final VoxelShape SHAPE_WEST = Block.box(0, 0, 3, 2, 16, 13);

    public BlockPilaster(Properties properties)
    {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(WATERLOGGED, false)
                .setValue(CONNECTED_UP, false)
                .setValue(FACING, Direction.NORTH)
                .setValue(CONNECTED_DOWN, false));
    }

    protected boolean isBase(LevelReader level, BlockPos pos)
    {
        return level.getBlockState(pos.below()).is(TagsRegistry.Blocks.PILASTER_BASE_SMALL);
    }

    protected boolean isCapital(LevelReader level, BlockPos pos)
    {
        return level.getBlockState(pos.above()).is(TagsRegistry.Blocks.PILASTER_CAPITAL_SMALL);
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
    public int getLightBlock(BlockState state, BlockGetter world, BlockPos pos)
    {
        return 0; // Ensures light passes through the block's "air" space correctly
    }

    @Override
    public VoxelShape getOcclusionShape(BlockState state, BlockGetter world, BlockPos pos) {
        return Shapes.empty();
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        BlockPos pos = context.getClickedPos();
        FluidState fluidState = context.getLevel().getFluidState(pos);

        return this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection())
                .setValue(CONNECTED_UP, isCapital(context.getLevel(), context.getClickedPos()))
                .setValue(CONNECTED_DOWN, isBase(context.getLevel(), context.getClickedPos()))
                .setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(CONNECTED_UP, CONNECTED_DOWN, FACING, WATERLOGGED);
    }
}
