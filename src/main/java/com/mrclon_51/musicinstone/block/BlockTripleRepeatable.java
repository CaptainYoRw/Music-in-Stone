package com.mrclon_51.musicinstone.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

import javax.annotation.Nullable;

public class BlockTripleRepeatable extends Block
{
    // Define a property from 0 to 2
    public static final IntegerProperty STATE_INDEX = IntegerProperty.create("state_index", 0, 2);

    public BlockTripleRepeatable(Properties properties)
    {
        super(properties);
        // Set the default state to index 0
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(STATE_INDEX, 0));
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(STATE_INDEX);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        BlockPos pos = context.getClickedPos();
        int y = pos.getY();

        // Calculate the index based on Y coordinate
        // We use Math.floorMod to handle negative Y coordinates (below Y=0)
        int index = Math.floorMod(y, 3);

        return this.defaultBlockState().setValue(STATE_INDEX, index);
    }
}
