package com.mrclon_51.musicinstone.block;

import com.mrclon_51.musicinstone.TagsRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockColumnLarge extends BlockColumn
{
    public BlockColumnLarge(Properties properties)
    {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
        .setValue(WATERLOGGED, false)
        .setValue(CONNECTED_UP, false)
        .setValue(CONNECTED_DOWN, false));
    }

    @Override
    protected boolean isBase(LevelReader level, BlockPos pos)
    {
        return level.getBlockState(pos.below()).is(TagsRegistry.Blocks.COLUMN_BASE_LARGE);
    }

    @Override
    protected boolean isCapital(LevelReader level, BlockPos pos)
    {
        return level.getBlockState(pos.above()).is(TagsRegistry.Blocks.COLUMN_CAPITAL_LARGE);
    }
}

