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
           public static final TagKey<Block> PILASTER_BASE_SMALL = tag("small_pilaster_bases");
           public static final TagKey<Block> PILASTER_CAPITAL_SMALL = tag("small_pilaster_capitals");
           public static final TagKey<Block> PILASTER_BASE_MEDIUM = tag("medium_pilaster_bases");
           public static final TagKey<Block> PILASTER_CAPITAL_MEDIUM = tag("medium_pilaster_capitals");
           public static final TagKey<Block> PILASTER_BASE_LARGE = tag("large_pilaster_bases");
           public static final TagKey<Block> PILASTER_CAPITAL_LARGE = tag("large_pilaster_capitals");
           public static final TagKey<Block> PILASTER_BASE_GIANT = tag("giant_pilaster_bases");
           public static final TagKey<Block> PILASTER_CAPITAL_GIANT = tag("giant_pilaster_capitals");

           public static final TagKey<Block> HALF_COLUMN_BASE_SMALL = tag("small_half_column_bases");
           public static final TagKey<Block> HALF_COLUMN_CAPITAL_SMALL = tag("small_half_column_capitals");
           public static final TagKey<Block> HALF_COLUMN_BASE_MEDIUM = tag("medium_half_column_bases");
           public static final TagKey<Block> HALF_COLUMN_CAPITAL_MEDIUM = tag("medium_half_column_capitals");
           public static final TagKey<Block> HALF_COLUMN_BASE_LARGE = tag("large_half_column_bases");
           public static final TagKey<Block> HALF_COLUMN_CAPITAL_LARGE = tag("large_half_column_capitals");
           public static final TagKey<Block> HALF_COLUMN_BASE_GIANT = tag("giant_half_column_bases");
           public static final TagKey<Block> HALF_COLUMN_CAPITAL_GIANT = tag("giant_half_column_capitals");

           public static final TagKey<Block> COLUMN_BASE_SMALL = tag("small_bases");
           public static final TagKey<Block> COLUMN_CAPITAL_SMALL = tag("small_capitals");
           public static final TagKey<Block> COLUMN_BASE_REGULAR = tag("regular_bases");
           public static final TagKey<Block> COLUMN_CAPITAL_REGULAR = tag("regular_capitals");
           public static final TagKey<Block> COLUMN_BASE_MEDIUM = tag("medium_bases");
           public static final TagKey<Block> COLUMN_CAPITAL_MEDIUM = tag("medium_capitals");
           public static final TagKey<Block> COLUMN_BASE_LARGE = tag("large_bases");
           public static final TagKey<Block> COLUMN_CAPITAL_LARGE = tag("large_capitals");
           public static final TagKey<Block> COLUMN_BASE_GIANT = tag("giant_bases");
           public static final TagKey<Block> COLUMN_CAPITAL_GIANT = tag("giant_capitals");

           public static final TagKey<Block> LEFT_CLICKABLE = tag("left_clickable");

           private static TagKey<Block> tag(String name)
           {
               return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("musicinstone", name));
           }
       }
}
