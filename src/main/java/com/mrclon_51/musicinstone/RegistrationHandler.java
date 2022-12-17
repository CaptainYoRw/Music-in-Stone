package com.mrclon_51.musicinstone;

import com.mrclon_51.musicinstone.init.MusicinStoneBlocks;
import com.mrclon_51.musicinstone.util.RegistryUtil;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = MusicinStone.MODID)
public class RegistrationHandler 
{

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) 
	{
		final Item[] items = 
		{
			RegistryUtil.setItemName(new Item(), "arch_tools").setCreativeTab(MusicinStone.MISC),
		};
		
		final Item[] itemBlocks = 
		{
				new ItemBlock(MusicinStoneBlocks.GREY_SAND).setRegistryName(MusicinStoneBlocks.GREY_SAND.getRegistryName()),
				new ItemBlock(MusicinStoneBlocks.GREY_SANDSTONE).setRegistryName(MusicinStoneBlocks.GREY_SANDSTONE.getRegistryName())
		};

		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) 
	{
		final Block[] blocks = 
		{
			RegistryUtil.setBlockName(new Block(Material.SAND), "grey_sand").setCreativeTab(MusicinStone.MISC),
			RegistryUtil.setBlockName(new Block(Material.ROCK), "grey_sandstone").setCreativeTab(MusicinStone.MISC)
		};

		event.getRegistry().registerAll(blocks);
	}

}
