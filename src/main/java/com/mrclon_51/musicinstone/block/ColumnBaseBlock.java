package com.mrclon_51.musicinstone.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ColumnBaseBlock extends Block
{
    private static final VoxelShape SHAPE = Shapes.or
            (
            Block.box(0, 0, 0, 16, 3, 16),   // Lower Base (The large square bottom)
            Block.box(3, 3, 3, 13, 16, 13)  // The Shaft (The main vertical part)
            );

    public ColumnBaseBlock(Properties properties)
    {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context)
    {
        // This returns a tiny box in the center or a full box that doesn't trigger culling
        return SHAPE;
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter world, BlockPos pos) {
        return 0; // Ensures light passes through the block's "air" space correctly
    }

    @Override
    public VoxelShape getOcclusionShape(BlockState state, BlockGetter world, BlockPos pos) {
        return Shapes.empty();
    }

}
