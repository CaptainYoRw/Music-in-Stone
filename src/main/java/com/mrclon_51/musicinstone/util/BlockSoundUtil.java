package com.mrclon_51.musicinstone.util;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockSoundUtil 
{
	
	    public static SoundType getDefaultSound(Material material)
	    {
	        if (material == Material.WOOD)
	        {
	            return SoundType.WOOD;
	        }
	        
	        if (material == Material.IRON)
	        {
	            return SoundType.METAL;
	        }
	        
	        if (material == Material.ANVIL)
	        {
	            return SoundType.ANVIL;
	        }
	        
	        if (material == Material.GLASS)
	        {
	            return SoundType.GLASS;
	        }
	        
	        if (material == Material.CLOTH)
	        {
	            return SoundType.CLOTH;
	        }
	        
	        if (material == Material.GOURD)
	        {
	            return SoundType.GROUND;
	        }
	        
	        if (material == Material.GRASS || material == Material.PLANTS || material == Material.LEAVES)
	        {
	            return SoundType.PLANT;
	        }
	        
	        if (material == Material.SAND)
	        {
	            return SoundType.SAND;
	        }
	        
	        if (material == Material.CARPET)
	        {
	            return SoundType.CLOTH;
	        }
	        
	        return SoundType.STONE;
	    }
	
}
