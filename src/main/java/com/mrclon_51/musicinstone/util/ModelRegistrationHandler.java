package com.mrclon_51.musicinstone.util;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.init.MusicinStoneBlocks;
import com.mrclon_51.musicinstone.init.MusicinStoneItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = MusicinStone.MODID)
public class ModelRegistrationHandler 
{

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) 
	{
		registerModel(MusicinStoneItems.ARCH_TOOLS, 0);
		
		registerModel(Item.getItemFromBlock(MusicinStoneBlocks.SANDSTONE_ALL), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.RED_SANDSTONE_ALL), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.STONE_SLAB_HALF), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.STONE_STAIRS), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.STONE_WALL), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.STONE_ALL), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.STONE_TILES_REGULAR), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.STONE_TILES_IRREGULAR), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.STONE_STAIRS_POLISHED), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.STONE_WALL_POLISHED), 0);
		
		registerModel(Item.getItemFromBlock(MusicinStoneBlocks.GREY_SAND), 0);
		registerModel(Item.getItemFromBlock(MusicinStoneBlocks.GREY_SANDSTONE), 0);
	    registerModel(Item.getItemFromBlock(MusicinStoneBlocks.GREY_SANDSTONE_CHISELED), 0);
		registerModel(Item.getItemFromBlock(MusicinStoneBlocks.GREY_SANDSTONE_SMOOTH), 0);
		registerModel(Item.getItemFromBlock(MusicinStoneBlocks.GREY_SANDSTONE_ALL), 0);
		registerModel(Item.getItemFromBlock(MusicinStoneBlocks.PINK_SAND), 0);
		registerModel(Item.getItemFromBlock(MusicinStoneBlocks.PINK_SANDSTONE), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.PINK_SANDSTONE_CHISELED), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.PINK_SANDSTONE_SMOOTH), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.PINK_SANDSTONE_ALL), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.SLATE_CRUSHED), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.SLATE), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.SLATE_POLISHED), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.DIABASE), 0);
        registerModel(Item.getItemFromBlock(MusicinStoneBlocks.DIABASE_POLISHED), 0);
		
		registerModel(Item.getItemFromBlock(MusicinStoneBlocks.MYSTICAL_WISE_TREE), 0);
		//registerModel(Item.getItemFromBlock(MusicinStoneBlocks.NELIPERAL), 0);
	}
	
	private static void registerModel(Item item, int meta) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
