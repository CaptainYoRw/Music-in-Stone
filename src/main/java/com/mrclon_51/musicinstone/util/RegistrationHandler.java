package com.mrclon_51.musicinstone.util;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.init.MusicinStoneBlocks;
import com.mrclon_51.musicinstone.init.MusicinStoneItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = MusicinStone.MODID)
public class RegistrationHandler 
{

    @SubscribeEvent 
    public static void registerBlocks(RegistryEvent.Register<Block> event) 
    {
        event.getRegistry().registerAll(MusicinStoneBlocks.SANDSTONE_ALL);
        event.getRegistry().registerAll(MusicinStoneBlocks.RED_SANDSTONE_ALL);
        event.getRegistry().registerAll(MusicinStoneBlocks.STONE_SLAB_HALF);
        event.getRegistry().registerAll(MusicinStoneBlocks.STONE_SLAB_DOUBLE);
        event.getRegistry().registerAll(MusicinStoneBlocks.STONE_STAIRS);
        event.getRegistry().registerAll(MusicinStoneBlocks.STONE_WALL);
        event.getRegistry().registerAll(MusicinStoneBlocks.STONE_ALL);
        event.getRegistry().registerAll(MusicinStoneBlocks.STONE_TILES_REGULAR);
        event.getRegistry().registerAll(MusicinStoneBlocks.STONE_TILES_IRREGULAR);
        event.getRegistry().registerAll(MusicinStoneBlocks.STONE_STAIRS_POLISHED);
        event.getRegistry().registerAll(MusicinStoneBlocks.STONE_WALL_POLISHED);
        
        event.getRegistry().registerAll(MusicinStoneBlocks.GREY_SAND);
        event.getRegistry().registerAll(MusicinStoneBlocks.GREY_SANDSTONE);
        event.getRegistry().registerAll(MusicinStoneBlocks.GREY_SANDSTONE_SMOOTH);
        event.getRegistry().registerAll(MusicinStoneBlocks.GREY_SANDSTONE_CHISELED);
        event.getRegistry().registerAll(MusicinStoneBlocks.GREY_SANDSTONE_ALL);
        event.getRegistry().registerAll(MusicinStoneBlocks.PINK_SAND);
        event.getRegistry().registerAll(MusicinStoneBlocks.PINK_SANDSTONE);
        event.getRegistry().registerAll(MusicinStoneBlocks.PINK_SANDSTONE_CHISELED);
        event.getRegistry().registerAll(MusicinStoneBlocks.PINK_SANDSTONE_SMOOTH);
        event.getRegistry().registerAll(MusicinStoneBlocks.PINK_SANDSTONE_ALL);
        event.getRegistry().registerAll(MusicinStoneBlocks.SLATE_CRUSHED);
        event.getRegistry().registerAll(MusicinStoneBlocks.SLATE);
        event.getRegistry().registerAll(MusicinStoneBlocks.SLATE_POLISHED);
        event.getRegistry().registerAll(MusicinStoneBlocks.DIABASE);
        event.getRegistry().registerAll(MusicinStoneBlocks.DIABASE_POLISHED);
        
        event.getRegistry().registerAll(MusicinStoneBlocks.MYSTICAL_WISE_TREE);
        event.getRegistry().registerAll(MusicinStoneBlocks.NELIPERAL);
    }

    @SubscribeEvent 
    public static void registerItemsBlocks(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(MusicinStoneItems.ARCH_TOOLS);
        
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.SANDSTONE_ALL).setRegistryName(MusicinStoneBlocks.SANDSTONE_ALL.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.RED_SANDSTONE_ALL).setRegistryName(MusicinStoneBlocks.RED_SANDSTONE_ALL.getRegistryName()));
        event.getRegistry().registerAll(new ItemSlab(MusicinStoneBlocks.STONE_SLAB_HALF, MusicinStoneBlocks.STONE_SLAB_HALF, MusicinStoneBlocks.STONE_SLAB_DOUBLE).setRegistryName(MusicinStoneBlocks.STONE_SLAB_HALF.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.STONE_STAIRS).setRegistryName(MusicinStoneBlocks.STONE_STAIRS.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.STONE_WALL).setRegistryName(MusicinStoneBlocks.STONE_WALL.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.STONE_ALL).setRegistryName(MusicinStoneBlocks.STONE_ALL.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.STONE_TILES_REGULAR).setRegistryName(MusicinStoneBlocks.STONE_TILES_REGULAR.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.STONE_TILES_IRREGULAR).setRegistryName(MusicinStoneBlocks.STONE_TILES_IRREGULAR.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.STONE_STAIRS_POLISHED).setRegistryName(MusicinStoneBlocks.STONE_STAIRS_POLISHED.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.STONE_WALL_POLISHED).setRegistryName(MusicinStoneBlocks.STONE_WALL_POLISHED.getRegistryName()));
        
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.GREY_SAND).setRegistryName(MusicinStoneBlocks.GREY_SAND.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.GREY_SANDSTONE).setRegistryName(MusicinStoneBlocks.GREY_SANDSTONE.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.GREY_SANDSTONE_CHISELED).setRegistryName(MusicinStoneBlocks.GREY_SANDSTONE_CHISELED.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.GREY_SANDSTONE_SMOOTH).setRegistryName(MusicinStoneBlocks.GREY_SANDSTONE_SMOOTH.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.GREY_SANDSTONE_ALL).setRegistryName(MusicinStoneBlocks.GREY_SANDSTONE_ALL.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.PINK_SAND).setRegistryName(MusicinStoneBlocks.PINK_SAND.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.PINK_SANDSTONE).setRegistryName(MusicinStoneBlocks.PINK_SANDSTONE.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.PINK_SANDSTONE_CHISELED).setRegistryName(MusicinStoneBlocks.PINK_SANDSTONE_CHISELED.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.PINK_SANDSTONE_SMOOTH).setRegistryName(MusicinStoneBlocks.PINK_SANDSTONE_SMOOTH.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.PINK_SANDSTONE_ALL).setRegistryName(MusicinStoneBlocks.PINK_SANDSTONE_ALL.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.SLATE_CRUSHED).setRegistryName(MusicinStoneBlocks.SLATE_CRUSHED.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.SLATE).setRegistryName(MusicinStoneBlocks.SLATE.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.SLATE_POLISHED).setRegistryName(MusicinStoneBlocks.SLATE_POLISHED.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.DIABASE).setRegistryName(MusicinStoneBlocks.DIABASE.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.DIABASE_POLISHED).setRegistryName(MusicinStoneBlocks.DIABASE_POLISHED.getRegistryName()));
        
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.MYSTICAL_WISE_TREE).setRegistryName(MusicinStoneBlocks.MYSTICAL_WISE_TREE.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.NELIPERAL).setRegistryName(MusicinStoneBlocks.NELIPERAL.getRegistryName()));
    }
        
}
