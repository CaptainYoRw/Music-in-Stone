package com.mrclon_51.musicinstone.datagen;

import com.mrclon_51.musicinstone.BlocksRegistry;
import com.mrclon_51.musicinstone.MusicinStone;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItemModelProvider extends ItemModelProvider
{
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, MusicinStone.MODID, existingFileHelper);
    }

    private void registerWallItem(Block wallBlock, Block textureSource)
    {
        // Get the Registry IDs (e.g., "minecraft:dark_prismarine" or "musicinstone:brick_tiles")
        ResourceLocation sourceKey = ForgeRegistries.BLOCKS.getKey(textureSource);
        ResourceLocation wallKey = ForgeRegistries.BLOCKS.getKey(wallBlock);

        // This part makes it universal: it uses the source's own namespace (minecraft or yours)
        ResourceLocation texturePath = new ResourceLocation(sourceKey.getNamespace(), "block/" + sourceKey.getPath());

        // Registers the wall inventory model using that dynamic path
        wallInventory(wallKey.getPath(), texturePath);
    }

    private void registerBlockItem(Block block)
    {
        // ForgeRegistries is the standard way to get the ID for a block in 1.20.1
        String name = ForgeRegistries.BLOCKS.getKey(block).getPath();

        withExistingParent(name,
                new ResourceLocation(MusicinStone.MODID, "block/" + name));
    }

    private void registerLayerItem(Block block) {
        String name = ForgeRegistries.BLOCKS.getKey(block).getPath();

        // Points the item icon to the 2-pixel-high model (height1)
        // that we created in the BlockStateProvider
        withExistingParent(name, new ResourceLocation(MusicinStone.MODID, "block/" + name + "_height1"));
    }

    @Override
    protected void registerModels() {

        // 2. Use your new helper for walls (It handles the texturePath for you!)
        registerWallItem(BlocksRegistry.BRICK_TILES_WALL.get(), BlocksRegistry.BRICKS_TILES.get());
        registerWallItem(BlocksRegistry.BRICK_TILES_STACK_WALL.get(), BlocksRegistry.BRICKS_TILES_STACK.get());
        registerWallItem(BlocksRegistry.DARK_PRISMARINE_WALL.get(), Blocks.DARK_PRISMARINE);
        registerWallItem(BlocksRegistry.PRISMARINE_BRICK_WALL.get(), Blocks.PRISMARINE_BRICKS);
        registerWallItem(BlocksRegistry.STONE_WALL.get(), Blocks.STONE);
        registerWallItem(BlocksRegistry.POLISHED_ANDESITE_WALL.get(), Blocks.POLISHED_ANDESITE);
        registerWallItem(BlocksRegistry.POLISHED_DIORITE_WALL.get(), Blocks.POLISHED_DIORITE);
        registerWallItem(BlocksRegistry.POLISHED_GRANITE_WALL.get(), Blocks.POLISHED_GRANITE);
        registerWallItem(BlocksRegistry.BRICK_ROMAN_WALL.get(), BlocksRegistry.BRICKS_ROMAN.get());
        registerWallItem(BlocksRegistry.BRICK_ROMAN_STACK_WALL.get(), BlocksRegistry.BRICKS_ROMAN_STACK.get());
        registerWallItem(BlocksRegistry.BRICK_LONG_WALL.get(), BlocksRegistry.BRICKS_LONG.get());
        registerWallItem(BlocksRegistry.BRICK_LONG_STACK_WALL.get(), BlocksRegistry.BRICKS_LONG_STACK.get());

        // 3. Use your registerBlockItem for everything else
        registerBlockItem(BlocksRegistry.BRICK_TILES_SLAB.get());
        registerBlockItem(BlocksRegistry.BRICK_TILES_STAIRS.get());
        registerBlockItem(BlocksRegistry.BRICK_TILES_PEDESTAL.get());
        registerBlockItem(BlocksRegistry.BRICK_TILES_FINIAL.get());

        registerBlockItem(BlocksRegistry.BRICK_TILES_STACK_SLAB.get());
        registerBlockItem(BlocksRegistry.BRICK_TILES_STACK_STAIRS.get());
        registerBlockItem(BlocksRegistry.BRICK_TILES_STACK_PEDESTAL.get());
        registerBlockItem(BlocksRegistry.BRICK_TILES_STACK_FINIAL.get());

        registerBlockItem(BlocksRegistry.BRICK_ROMAN_SLAB.get());
        registerBlockItem(BlocksRegistry.BRICK_ROMAN_STAIRS.get());
        registerBlockItem(BlocksRegistry.BRICK_ROMAN_PEDESTAL.get());
        registerBlockItem(BlocksRegistry.BRICK_ROMAN_FINIAL.get());

        registerBlockItem(BlocksRegistry.BRICK_ROMAN_STACK_SLAB.get());
        registerBlockItem(BlocksRegistry.BRICK_ROMAN_STACK_STAIRS.get());
        registerBlockItem(BlocksRegistry.BRICK_ROMAN_STACK_PEDESTAL.get());
        registerBlockItem(BlocksRegistry.BRICK_ROMAN_STACK_FINIAL.get());

        registerBlockItem(BlocksRegistry.GILDED_BLACKSTONE_PEDESTAL.get());
        registerBlockItem(BlocksRegistry.GILDED_BLACKSTONE_FINIAL.get());

        registerBlockItem(BlocksRegistry.BRICK_LONG_SLAB.get());
        registerBlockItem(BlocksRegistry.BRICK_LONG_STAIRS.get());
        registerBlockItem(BlocksRegistry.BRICK_LONG_PEDESTAL.get());
        registerBlockItem(BlocksRegistry.BRICK_LONG_FINIAL.get());

        registerBlockItem(BlocksRegistry.BRICK_LONG_STACK_SLAB.get());
        registerBlockItem(BlocksRegistry.BRICK_LONG_STACK_STAIRS.get());
        registerBlockItem(BlocksRegistry.BRICK_LONG_STACK_PEDESTAL.get());
        registerBlockItem(BlocksRegistry.BRICK_LONG_STACK_FINIAL.get());

        registerBlockItem(BlocksRegistry.BRICK_ROAD_SLAB.get());
        registerBlockItem(BlocksRegistry.BRICK_ROAD_STAIRS.get());

        registerLayerItem(BlocksRegistry.BRICK_FANCY_LAYER.get());
        registerLayerItem(BlocksRegistry.BRICK_TILES_LAYER.get());
        registerLayerItem(BlocksRegistry.BRICK_TILES_STACK_LAYER.get());
        registerLayerItem(BlocksRegistry.BRICK_ROMAN_LAYER.get());
        registerLayerItem(BlocksRegistry.BRICK_ROMAN_STACK_LAYER.get());
        registerLayerItem(BlocksRegistry.BRICK_LONG_LAYER.get());
        registerLayerItem(BlocksRegistry.BRICK_LONG_STACK_LAYER.get());
        registerLayerItem(BlocksRegistry.BRICK_ROAD_LAYER.get());

    }
}
