package com.mrclon_51.musicinstone.util;

import com.mrclon_51.musicinstone.MusicinStone;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
 
public class RegistryUtil
{

    public static Item setItemName(final Item item, final String name) 
    {
        item.setRegistryName(MusicinStone.MODID, name).setUnlocalizedName(MusicinStone.MODID + "." + name);
        return item;
    }

    public static Block setBlockName(final Block block, final String name) 
    {
        block.setRegistryName(MusicinStone.MODID, name).setUnlocalizedName(MusicinStone.MODID + "." + name);
        return block;
    }

}