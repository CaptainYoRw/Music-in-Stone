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

public class BlockColumnGiant extends BlockColumn
{
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public BlockColumnGiant(Properties properties)
    {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
        .setValue(WATERLOGGED, false)
        .setValue(CONNECTED_UP, false)
        .setValue(FACING, Direction.NORTH)
        .setValue(CONNECTED_DOWN, false));
    }

    @Override
    protected boolean isBase(LevelReader level, BlockPos pos)
    {
        return level.getBlockState(pos.below()).is(TagsRegistry.Blocks.COLUMN_BASE_GIANT);
    }

    @Override
    protected boolean isCapital(LevelReader level, BlockPos pos)
    {
        return level.getBlockState(pos.above()).is(TagsRegistry.Blocks.COLUMN_CAPITAL_GIANT);
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

