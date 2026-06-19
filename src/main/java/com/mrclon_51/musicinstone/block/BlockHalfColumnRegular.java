package com.mrclon_51.musicinstone.block;

import com.mrclon_51.musicinstone.TagsRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockHalfColumnRegular extends BlockHalfColumnSmall
{
    private static final VoxelShape SHAPE_NORTH = Block.box(2, 0, 0, 14, 16, 6);
    private static final VoxelShape SHAPE_SOUTH = Block.box(2, 0, 10, 14, 16, 16);
    private static final VoxelShape SHAPE_EAST = Block.box(10, 0, 2, 16, 16, 14);
    private static final VoxelShape SHAPE_WEST = Block.box(0, 0, 2, 6, 16, 14);

    public BlockHalfColumnRegular(Properties properties)
    {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(WATERLOGGED, false)
                .setValue(CONNECTED_UP, false)
                .setValue(FACING, Direction.NORTH)
                .setValue(CONNECTED_DOWN, false));
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
    protected boolean isBase(LevelReader level, BlockPos pos)
    {
        return level.getBlockState(pos.below()).is(TagsRegistry.Blocks.HALF_COLUMN_BASE_REGULAR);
    }

    @Override
    protected boolean isCapital(LevelReader level, BlockPos pos)
    {
        return level.getBlockState(pos.above()).is(TagsRegistry.Blocks.HALF_COLUMN_CAPITAL_REGULAR);
    }
}
