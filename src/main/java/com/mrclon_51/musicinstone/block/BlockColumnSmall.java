package com.mrclon_51.musicinstone.block;

import com.mrclon_51.musicinstone.TagsRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockColumnSmall extends BlockColumn
{
    private static final VoxelShape SHAPE = Shapes.or
            (
                    Block.box(3, 0, 3, 13, 16, 13)  // The Shaft (The main vertical part)
            );

    public BlockColumnSmall(BlockBehaviour.Properties properties)
    {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
        .setValue(WATERLOGGED, false)
        .setValue(CONNECTED_UP, false)
        .setValue(CONNECTED_DOWN, false));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context)
    {
        // This returns a tiny box in the center or a full box that doesn't trigger culling
        return SHAPE;
    }

    @Override
    protected boolean isBase(LevelReader level, BlockPos pos)
    {
        return level.getBlockState(pos.below()).is(TagsRegistry.Blocks.COLUMN_BASE_SMALL);
    }

    @Override
    protected boolean isCapital(LevelReader level, BlockPos pos)
    {
        return level.getBlockState(pos.above()).is(TagsRegistry.Blocks.COLUMN_CAPITAL_SMALL);
    }
}

