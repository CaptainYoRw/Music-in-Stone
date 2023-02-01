package com.mrclon_51.musicinstone.blocks;

import java.util.Random;

import javax.annotation.Nonnull;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.init.MusicinStoneBlocks;
import com.mrclon_51.musicinstone.util.RegistryUtil;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Slate extends Block
{
    public Slate(@Nonnull final String name)
    {
        super(Material.ROCK);
        RegistryUtil.setBlockName(this, name);
        setCreativeTab(MusicinStone.MISC);
        setHardness(1.25f);
        setResistance(8.0F);
        setSoundType(SoundType.STONE);
        setHarvestLevel("Pickaxe", 0);
    }
    
    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        return MapColor.OBSIDIAN;
    }
        
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return MusicinStoneBlocks.SLATE_CRUSHED.getItemDropped(state, rand, fortune);
    }
}
