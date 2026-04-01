package com.mrclon_51.musicinstone.datagen;

import com.mrclon_51.musicinstone.BlocksRegistry;
import com.mrclon_51.musicinstone.MusicinStone;
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
