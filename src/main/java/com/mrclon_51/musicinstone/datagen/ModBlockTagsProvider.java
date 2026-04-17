package com.mrclon_51.musicinstone.datagen;

import com.mrclon_51.musicinstone.BlocksRegistry;
import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.TagsRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider
{
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MusicinStone.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        // This is the magic line that adds walls to the 'walls' tag
        this.tag(BlockTags.WALLS)
                .add(BlocksRegistry.BRICK_FANCY_WALL.get())
                .add(BlocksRegistry.GILDED_BLACKSTONE_WALL.get())
                .add(BlocksRegistry.PURPUR_WALL.get())
                .add(BlocksRegistry.BRICK_TILES_STACK_WALL.get())
                .add(BlocksRegistry.SMOOTH_QUARTZ_WALL.get())
                .add(BlocksRegistry.QUARTZ_BRICK_WALL.get())
                .add(BlocksRegistry.BRICK_TILES_WALL.get())
                .add(BlocksRegistry.DARK_PRISMARINE_WALL.get())
                .add(BlocksRegistry.PRISMARINE_BRICK_WALL.get())
                .add(BlocksRegistry.STONE_WALL.get())
                .add(BlocksRegistry.POLISHED_GRANITE_WALL.get())
                .add(BlocksRegistry.POLISHED_DIORITE_WALL.get())
                .add(BlocksRegistry.POLISHED_ANDESITE_WALL.get())
                .add(BlocksRegistry.BRICK_ROMAN_WALL.get())
                .add(BlocksRegistry.BRICK_ROMAN_STACK_WALL.get())
                .add(BlocksRegistry.BRICK_LONG_WALL.get())
                .add(BlocksRegistry.BRICK_LONG_STACK_WALL.get());

        this.tag(TagsRegistry.Blocks.COLUMN_BASE_SMALL)
                .add(BlocksRegistry.QUARTZ_IONIC_BASE_SMALL.get())
                .add(BlocksRegistry.SANDSTONE_IONIC_BASE_SMALL.get())
                .add(BlocksRegistry.GOLD_IONIC_BASE_SMALL.get())
                .add(BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_SMALL.get());

        this.tag(TagsRegistry.Blocks.COLUMN_CAPITAL_SMALL)
                .add(BlocksRegistry.QUARTZ_IONIC_CAPITAL_SMALL.get())
                .add(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_SMALL.get())
                .add(BlocksRegistry.QUARTZ_DORIC_CAPITAL_SMALL.get())
                .add(BlocksRegistry.SANDSTONE_DORIC_CAPITAL_SMALL.get())
                .add(BlocksRegistry.QUARTZ_CORNER_IONIC_CAPITAL_SMALL.get())
                .add(BlocksRegistry.SANDSTONE_CORNER_IONIC_CAPITAL_SMALL.get())
                .add(BlocksRegistry.QUARTZ_ROMAN_IONIC_CAPITAL_SMALL.get())
                .add(BlocksRegistry.SANDSTONE_ROMAN_IONIC_CAPITAL_SMALL.get())
                .add(BlocksRegistry.QUARTZ_SCAMOZZI_IONIC_CAPITAL_SMALL.get())
                .add(BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_CAPITAL_SMALL.get())
                .add(BlocksRegistry.GOLD_IONIC_CAPITAL_SMALL.get())
                .add(BlocksRegistry.GOLD_CORNER_IONIC_CAPITAL_SMALL.get())
                .add(BlocksRegistry.GOLD_ROMAN_IONIC_CAPITAL_SMALL.get())
                .add(BlocksRegistry.GOLD_SCAMOZZI_IONIC_CAPITAL_SMALL.get());

        this.tag(TagsRegistry.Blocks.COLUMN_BASE_MEDIUM)
                .add(BlocksRegistry.QUARTZ_IONIC_BASE_MEDIUM.get())
                .add(BlocksRegistry.SANDSTONE_IONIC_BASE_MEDIUM.get())
                .add(BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_MEDIUM.get());

        this.tag(TagsRegistry.Blocks.COLUMN_CAPITAL_MEDIUM)
                .add(BlocksRegistry.QUARTZ_IONIC_CAPITAL_MEDIUM.get())
                .add(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_MEDIUM.get());

        this.tag(TagsRegistry.Blocks.COLUMN_BASE_LARGE)
                .add(BlocksRegistry.QUARTZ_IONIC_BASE_LARGE.get())
                .add(BlocksRegistry.SANDSTONE_IONIC_BASE_LARGE.get())
                .add(BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_LARGE.get());

        this.tag(TagsRegistry.Blocks.COLUMN_CAPITAL_LARGE)
                .add(BlocksRegistry.QUARTZ_IONIC_CAPITAL_LARGE.get())
                .add(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_LARGE.get());

        //this.tag(TagsRegistry.Blocks.COLUMN_BASE_GIANT)
                //.add(BlocksRegistry.SANDSTONE_IONIC_BASE_GIANT.get());

        this.tag(TagsRegistry.Blocks.COLUMN_CAPITAL_GIANT)
                .add(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_GIANT.get());

        //this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
           //     .add()

        //this.tag(BlockTags.NEEDS_STONE_TOOL)
                //.add()

        //this.tag(BlockTags.NEEDS_IRON_TOOL)
                //.add()

        //this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                //.add()
    }
}
