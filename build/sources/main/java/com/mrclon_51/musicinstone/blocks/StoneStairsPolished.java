package com.mrclon_51.musicinstone.blocks;

import javax.annotation.Nonnull;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.util.RegistryUtil;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;

public class StoneStairsPolished extends BlockStairs
{

    public StoneStairsPolished(@Nonnull final String name, IBlockState modelState)
    {
        super(modelState);
        RegistryUtil.setBlockName(this, name);
        setCreativeTab(MusicinStone.MISC);
        setHardness(2.0f);
        setResistance(10.0F);
        setSoundType(SoundType.STONE);
        setHarvestLevel("Pickaxe", 0);
        useNeighborBrightness = true;
    }

    public StoneStairsPolished(String name, Block block, int meta) 
    {
        this(name, block.getBlockState().getValidStates().get(meta));
    }

    public StoneStairsPolished(String name, Block block) 
    {
        this(name, block.getDefaultState());
    }
}
