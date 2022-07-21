package com.mrclon_51.musicinstone.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class GraniteBricksLarge extends Block
{

	public GraniteBricksLarge(String name, Material material) 
	{
		super(material);  
		setUnlocalizedName(name); 
		setRegistryName(name);
		setHardness(7f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("Pickaxe", 2);
		setResistance(18);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
}
