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

public class StoneAll extends Block
{
        
        public StoneAll(@Nonnull final String name)
        {
            super(Material.ROCK);
            RegistryUtil.setBlockName(this, name);
            setCreativeTab(MusicinStone.MISC);
            setHardness(2.0f);
            setResistance(10.0F);
            setSoundType(SoundType.STONE);
            setHarvestLevel("Pickaxe", 0);
        }   
        
        @Override
        public MapColor getMapColor(IBlockState state, IBlockAccess world, BlockPos pos)
        {
            return MapColor.STONE;
        }
}
