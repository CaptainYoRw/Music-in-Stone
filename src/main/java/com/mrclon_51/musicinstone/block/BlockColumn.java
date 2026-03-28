package com.mrclon_51.musicinstone.block;

import com.mrclon_51.musicinstone.TagsRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockColumn extends Block implements SimpleWaterloggedBlock
{
    public static final BooleanProperty CONNECTED_UP = BooleanProperty.create("up");
    public static final BooleanProperty CONNECTED_DOWN = BooleanProperty.create("down");

    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public BlockColumn(BlockBehaviour.Properties properties)
    {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(WATERLOGGED, false)
                .setValue(CONNECTED_UP, false)
                .setValue(CONNECTED_DOWN, false));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        BlockPos pos = context.getClickedPos();
        FluidState fluidState = context.getLevel().getFluidState(pos);

        return this.defaultBlockState()
                .setValue(CONNECTED_UP, isCapital(context.getLevel(), context.getClickedPos()))
                .setValue(CONNECTED_DOWN, isBase(context.getLevel(), context.getClickedPos()))
                .setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER); // Handle placing IN water
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

    // Handle water physics (flowing)
    @SuppressWarnings("deprecation")
    @Override
    public FluidState getFluidState(BlockState state)
    {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    private boolean isBase(LevelReader level, BlockPos pos)
    {
        return level.getBlockState(pos.below()).is(TagsRegistry.Blocks.COLUMN_BASE);
    }

    private boolean isCapital(LevelReader level, BlockPos pos)
    {
        return level.getBlockState(pos.above()).is(TagsRegistry.Blocks.COLUMN_CAPITAL);
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
        if (direction == Direction.UP)
        {
            return state.setValue(CONNECTED_UP, isCapital(level, currentPos));
        }
        if (direction == Direction.DOWN)
        {
            return state.setValue(CONNECTED_DOWN, isBase(level, currentPos));
        }
        return super.updateShape(state, direction, neighborState, level, currentPos, neighborPos);
    }

    // Register the properties so the game knows they exist
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(CONNECTED_UP, CONNECTED_DOWN, WATERLOGGED);
    }
}
