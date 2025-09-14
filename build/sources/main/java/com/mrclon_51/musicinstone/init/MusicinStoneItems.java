package com.mrclon_51.musicinstone.init;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.items.ArchTools;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(MusicinStone.MODID)
public class MusicinStoneItems 
{

	public static final Item ARCH_TOOLS = new ArchTools("arch_tools");
	
}
