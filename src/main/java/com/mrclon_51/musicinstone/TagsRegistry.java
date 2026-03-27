package com.mrclon_51.musicinstone;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static net.minecraft.tags.TagEntry.tag;

public class TagsRegistry
{
       public static class Blocks
       {
               public static final TagKey<Block> COLUMN_BASE = tag("bases");
               public static final TagKey<Block> COLUMN_CAPITAL = tag("capitals");

           private static TagKey<Block> tag(String name)
           {
               return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("musicinstone", name));
           }
       }
}
