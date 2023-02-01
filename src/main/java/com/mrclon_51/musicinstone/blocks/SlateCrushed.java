package com.mrclon_51.musicinstone.blocks;

import javax.annotation.Nonnull;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.util.RegistryUtil;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class SlateCrushed extends Block
{
    public SlateCrushed(@Nonnull final String name)
    {
        super(Material.ROCK);
        RegistryUtil.setBlockName(this, name);
        setCreativeTab(MusicinStone.MISC);
        setHardness(1.0f);
        setResistance(5.0F);
        setSoundType(SoundType.STONE);
        setHarvestLevel("Pickaxe", 0);
    }
    
    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        return MapColor.OBSIDIAN;
    }
}
