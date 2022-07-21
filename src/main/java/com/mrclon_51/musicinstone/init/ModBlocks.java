package com.mrclon_51.musicinstone.init;

import com.mrclon_51.musicinstone.main.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.mrclon_51.musicinstone.blocks.*;

@Mod.EventBusSubscriber(modid = Main.MODID)
public class ModBlocks 
{

	static Block GRANITEBRICKSLARGE;

	public static void init()
	{
		GRANITEBRICKSLARGE = new GraniteBricksLarge("granite_bricks_large", Material.ROCK);
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(GRANITEBRICKSLARGE);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(new ItemBlock(GRANITEBRICKSLARGE).setRegistryName(GRANITEBRICKSLARGE.getRegistryName()));
	}
	
	@SubscribeEvent 
 	public static void registerRenders(ModelRegistryEvent event) 
	{ 
 		registerRender(Item.getItemFromBlock(GRANITEBRICKSLARGE));
	}
	
	public static void registerRender(Item item) 
	{ 
 		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory")); 
 	} 
	
}
