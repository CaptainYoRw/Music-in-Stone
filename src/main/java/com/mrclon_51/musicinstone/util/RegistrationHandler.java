package com.mrclon_51.musicinstone.util;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.init.MusicinStoneBlocks;
import com.mrclon_51.musicinstone.init.MusicinStoneItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = MusicinStone.MODID)
public class RegistrationHandler 
{

    @SubscribeEvent 
    public static void registerBlocks(RegistryEvent.Register<Block> event) 
    {
        event.getRegistry().registerAll(MusicinStoneBlocks.GREY_SAND);
        //event.getRegistry().registerAll(MusicinStoneBlocks.GREY_SANDSTONE);
        event.getRegistry().registerAll(MusicinStoneBlocks.MYSTICAL_WISE_TREE);
    }

    @SubscribeEvent 
    public static void registerItemsBlocks(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.MYSTICAL_WISE_TREE).setRegistryName(MusicinStoneBlocks.MYSTICAL_WISE_TREE.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(MusicinStoneBlocks.GREY_SAND).setRegistryName(MusicinStoneBlocks.GREY_SAND.getRegistryName()));
        
        event.getRegistry().registerAll(MusicinStoneItems.ARCH_TOOLS);
    }
        
}
