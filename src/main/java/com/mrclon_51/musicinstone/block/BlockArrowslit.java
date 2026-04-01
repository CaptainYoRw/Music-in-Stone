package com.mrclon_51.musicinstone.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockArrowslit extends Block
{
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    private static final VoxelShape SHAPE_EAST = Shapes.or
            (
            Block.box(0, 0, 0, 2, 16, 16), Block.box(2, 0, 0, 4, 16, 6),
            Block.box(4, 0, 0, 6, 16, 3), Block.box(6, 0, 0, 7, 16, 2),
            Block.box(9, 0, 0, 11, 16, 2), Block.box(11, 0, 0, 13, 16, 3),
            Block.box(13, 0, 0, 14, 16, 6), Block.box(14, 0, 0, 16, 16, 16)
            );

    private static final VoxelShape SHAPE_WEST = Shapes.or
            (
            Block.box(14, 0, 0, 16, 16, 16), Block.box(12, 0, 10, 14, 16, 16),
            Block.box(10, 0, 13, 12, 16, 16), Block.box(9, 0, 14, 10, 16, 16),
            Block.box(5, 0, 14, 7, 16, 16), Block.box(3, 0, 13, 5, 16, 16),
            Block.box(2, 0, 10, 3, 16, 16), Block.box(0, 0, 0, 2, 16, 16)
            );
    private static final VoxelShape SHAPE_NORTH = Shapes.or
            (
            Block.box(0, 0, 0, 16, 16, 2), Block.box(0, 0, 2, 6, 16, 4),
            Block.box(0, 0, 4, 3, 16, 6), Block.box(0, 0, 6, 2, 16, 7),
            Block.box(0, 0, 9, 2, 16, 11), Block.box(0, 0, 11, 3, 16, 13),
            Block.box(0, 0, 13, 6, 16, 14), Block.box(0, 0, 14, 16, 16, 16)
            );

    // WEST (270° Clockwise)
    private static final VoxelShape SHAPE_SOUTH = Shapes.or
            (
            Block.box(0, 0, 14, 16, 16, 16), Block.box(10, 0, 12, 16, 16, 14),
            Block.box(13, 0, 10, 16, 16, 12), Block.box(14, 0, 9, 16, 16, 10),
            Block.box(14, 0, 5, 16, 16, 7), Block.box(13, 0, 3, 16, 16, 5),
            Block.box(10, 0, 2, 16, 16, 3), Block.box(0, 0, 0, 16, 16, 2)
            );

    public BlockArrowslit(Properties pProperties)
    {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH));
    }

    public BlockState getStateForPlacement(BlockPlaceContext pContext)
    {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getClockWise());
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

    public BlockState rotate(BlockState pState, Rotation pRot)
    {
        return pState.setValue(FACING, pRot.rotate(pState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING);
    }
}
