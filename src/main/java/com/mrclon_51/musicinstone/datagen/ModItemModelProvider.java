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

@SuppressWarnings("removal")
public class ModItemModelProvider extends ItemModelProvider
{
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, MusicinStone.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {


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
        registerWallItem(BlocksRegistry.CLINKER_BRICK_WALL.get(), BlocksRegistry.CLINKER_BRICKS.get());


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
        registerLayerItem(BlocksRegistry.GILDED_BLACKSTONE_LAYER.get());
        registerObjItemModel(BlocksRegistry.GILDED_BLACKSTONE_ARROWSLIT.get());

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

        registerBlockItem(BlocksRegistry.COBBLESTONE_FINIAL.get());
        registerBlockItem(BlocksRegistry.COBBLESTONE_PEDESTAL.get());
        registerLayerItem(BlocksRegistry.COBBLESTONE_LAYER.get());
        registerObjItemModel(BlocksRegistry.COBBLESTONE_ARROWSLIT.get());
        registerObjItemModel(BlocksRegistry.COBBLESTONE_CROSS_ARROWSLIT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_IONIC_BASE_SMALL.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_FLUTED_COLUMN_SMALL.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_SMALL.get());

        registerBlockItem(BlocksRegistry.STONE_FINIAL.get());
        registerBlockItem(BlocksRegistry.STONE_PEDESTAL.get());
        registerLayerItem(BlocksRegistry.STONE_LAYER.get());
        registerObjItemModel(BlocksRegistry.STONE_ARROWSLIT.get());
        registerObjItemModel(BlocksRegistry.STONE_CROSS_ARROWSLIT.get());

        registerBlockItem(BlocksRegistry.STONE_BRICK_FINIAL.get());
        registerBlockItem(BlocksRegistry.STONE_BRICK_PEDESTAL.get());
        registerLayerItem(BlocksRegistry.STONE_BRICK_LAYER.get());
        registerObjItemModel(BlocksRegistry.STONE_BRICK_ARROWSLIT.get());
        registerObjItemModel(BlocksRegistry.STONE_BRICK_CROSS_ARROWSLIT.get());

        registerObjItemModel(BlocksRegistry.QUARTZ_DORIC_CAPITAL_SMALL.get());

        registerObjItemModel(BlocksRegistry.QUARTZ_FLUTED_COLUMN_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.QUARTZ_FLUTED_COLUMN_LARGE.get());
        registerObjItemModel(BlocksRegistry.QUARTZ_FLUTED_COLUMN_GIANT.get());

        registerObjItemModel(BlocksRegistry.QUARTZ_IONIC_BASE_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_IONIC_BASE_MEDIUM.get());

        registerObjItemModel(BlocksRegistry.QUARTZ_IONIC_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_MEDIUM.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_FLUTED_COLUMN_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_FLUTED_COLUMN_LARGE.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_FLUTED_COLUMN_GIANT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_DORIC_CAPITAL_SMALL.get());

        registerObjItemModel(BlocksRegistry.QUARTZ_IONIC_BASE_LARGE.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_IONIC_BASE_LARGE.get());

        registerObjItemModel(BlocksRegistry.QUARTZ_IONIC_CAPITAL_LARGE.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_LARGE.get());

        registerObjItemModel(BlocksRegistry.QUARTZ_CORNER_IONIC_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_CORNER_IONIC_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.QUARTZ_ROMAN_IONIC_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_IONIC_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.QUARTZ_SCAMOZZI_IONIC_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_CAPITAL_SMALL.get());

        registerObjItemModel(BlocksRegistry.QUARTZ_GREEK_CORINTHIAN_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_GREEK_CORINTHIAN_CAPITAL_SMALL.get());

        registerBlockItem(BlocksRegistry.CLINKER_BRICK_STAIRS.get());
        registerBlockItem(BlocksRegistry.CLINKER_BRICK_SLAB.get());
        registerBlockItem(BlocksRegistry.CLINKER_BRICK_FINIAL.get());
        registerBlockItem(BlocksRegistry.CLINKER_BRICK_PEDESTAL.get());
        registerLayerItem(BlocksRegistry.CLINKER_BRICK_LAYER.get());
        registerObjItemModel(BlocksRegistry.CLINKER_BRICK_ARROWSLIT.get());
        registerObjItemModel(BlocksRegistry.CLINKER_BRICK_CROSS_ARROWSLIT.get());

        registerObjItemModel(BlocksRegistry.GILDED_BLACKSTONE_COLUMN_SMALL.get());

        registerObjItemModel(BlocksRegistry.GOLD_CORNER_IONIC_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.GOLD_GREEK_CORINTHIAN_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.GOLD_IONIC_BASE_SMALL.get());
        registerObjItemModel(BlocksRegistry.GOLD_IONIC_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.GOLD_ROMAN_IONIC_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.GOLD_SCAMOZZI_IONIC_CAPITAL_SMALL.get());

        registerBlockItem(BlocksRegistry.GRANITE_FINIAL.get());
        registerBlockItem(BlocksRegistry.GRANITE_PEDESTAL.get());
        registerLayerItem(BlocksRegistry.GRANITE_LAYER.get());
        registerObjItemModel(BlocksRegistry.GRANITE_ARROWSLIT.get());
        registerObjItemModel(BlocksRegistry.GRANITE_CROSS_ARROWSLIT.get());

        registerBlockItem(BlocksRegistry.POLISHED_GRANITE_FINIAL.get());
        registerBlockItem(BlocksRegistry.POLISHED_GRANITE_PEDESTAL.get());
        registerLayerItem(BlocksRegistry.POLISHED_GRANITE_LAYER.get());
        registerObjItemModel(BlocksRegistry.POLISHED_GRANITE_ARROWSLIT.get());
        registerObjItemModel(BlocksRegistry.POLISHED_GRANITE_CROSS_ARROWSLIT.get());

        registerBlockItem(BlocksRegistry.DIORITE_FINIAL.get());
        registerBlockItem(BlocksRegistry.DIORITE_PEDESTAL.get());
        registerLayerItem(BlocksRegistry.DIORITE_LAYER.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ARROWSLIT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_CROSS_ARROWSLIT.get());

        registerBlockItem(BlocksRegistry.POLISHED_DIORITE_FINIAL.get());
        registerBlockItem(BlocksRegistry.POLISHED_DIORITE_PEDESTAL.get());
        registerLayerItem(BlocksRegistry.POLISHED_DIORITE_LAYER.get());
        registerObjItemModel(BlocksRegistry.POLISHED_DIORITE_ARROWSLIT.get());
        registerObjItemModel(BlocksRegistry.POLISHED_DIORITE_CROSS_ARROWSLIT.get());

        registerBlockItem(BlocksRegistry.ANDESITE_FINIAL.get());
        registerBlockItem(BlocksRegistry.ANDESITE_PEDESTAL.get());
        registerLayerItem(BlocksRegistry.ANDESITE_LAYER.get());
        registerObjItemModel(BlocksRegistry.ANDESITE_ARROWSLIT.get());
        registerObjItemModel(BlocksRegistry.ANDESITE_CROSS_ARROWSLIT.get());

        registerBlockItem(BlocksRegistry.POLISHED_ANDESITE_FINIAL.get());
        registerBlockItem(BlocksRegistry.POLISHED_ANDESITE_PEDESTAL.get());
        registerLayerItem(BlocksRegistry.POLISHED_ANDESITE_LAYER.get());
        registerObjItemModel(BlocksRegistry.POLISHED_ANDESITE_ARROWSLIT.get());
        registerObjItemModel(BlocksRegistry.POLISHED_ANDESITE_CROSS_ARROWSLIT.get());

        registerObjItemModelLeft(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_GIANT.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_IONIC_BASE_GIANT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_COLUMN_SMALL.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_COLUMN_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_COLUMN_LARGE.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_COLUMN_GIANT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_SMALL.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_LARGE.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_GIANT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_GREEK_CORINTHIAN_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_GREEK_CORINTHIAN_CAPITAL_LARGE.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_FLUTED_PILASTER_SMALL.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_IONIC_PILASTER_BASE_SMALL.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_PILASTER_CAPITAL_SMALL.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_GREEK_CORINTHIAN_CAPITAL_GIANT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_CAPITAL_LARGE.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_CAPITAL_GIANT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_CAPITAL_SMALL.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_CORINTHIAN_BASE_SMALL.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_CORINTHIAN_BASE_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_CORINTHIAN_BASE_LARGE.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_CORINTHIAN_BASE_GIANT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_BASE_SMALL.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_BASE_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_BASE_LARGE.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_DORIC_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_DORIC_CAPITAL_LARGE.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_TUSCAN_CAPITAL_SMALL.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_TUSCAN_BASE_SMALL.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_DORIC_CAPITAL_GIANT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_BASE_GIANT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_DORIC_COLUMN_SMALL.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_DORIC_COLUMN_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_DORIC_COLUMN_LARGE.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_DORIC_COLUMN_GIANT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_TUSCAN_BASE_REGULAR.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_TUSCAN_BASE_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_TUSCAN_BASE_LARGE.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_TUSCAN_BASE_GIANT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_TUSCAN_CAPITAL_REGULAR.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_TUSCAN_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_TUSCAN_CAPITAL_LARGE.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_TUSCAN_CAPITAL_GIANT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_DORIC_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_DORIC_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_DORIC_CAPITAL_LARGE.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_DORIC_CAPITAL_GIANT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_DORIC_BASE_SMALL.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_DORIC_BASE_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_DORIC_BASE_LARGE.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_DORIC_BASE_GIANT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_COMPOSITE_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_COMPOSITE_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_COMPOSITE_CAPITAL_LARGE.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_COMPOSITE_CAPITAL_GIANT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_COLUMN_REGULAR.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_DORIC_COLUMN_REGULAR.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_FLUTED_COLUMN_REGULAR.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_CAPITAL_LARGE.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_CAPITAL_GIANT.get());

        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_IONIC_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_IONIC_CAPITAL_LARGE.get());
        registerObjItemModel(BlocksRegistry.SANDSTONE_ROMAN_IONIC_CAPITAL_GIANT.get());

        //registerObjItemModel(BlocksRegistry.SANDSTONE_RUSTICATED_COLUMN_SMALL.get());

        registerObjItemModel(BlocksRegistry.DIORITE_IONIC_BASE_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_IONIC_BASE_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_IONIC_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_IONIC_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_FLUTED_COLUMN_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_FLUTED_COLUMN_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_FLUTED_COLUMN_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_FLUTED_COLUMN_GIANT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_DORIC_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_IONIC_BASE_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_IONIC_CAPITAL_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_CORNER_IONIC_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_IONIC_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_IONIC_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_IONIC_CAPITAL_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_IONIC_CAPITAL_GIANT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_SCAMOZZI_IONIC_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_GREEK_CORINTHIAN_CAPITAL_SMALL.get());
        registerObjItemModelLeft(BlocksRegistry.DIORITE_IONIC_CAPITAL_GIANT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_IONIC_BASE_GIANT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_COLUMN_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_COLUMN_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_COLUMN_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_COLUMN_GIANT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_IONIC_BASE_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_IONIC_BASE_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_IONIC_BASE_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_IONIC_BASE_GIANT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_GREEK_CORINTHIAN_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_GREEK_CORINTHIAN_CAPITAL_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_GREEK_CORINTHIAN_CAPITAL_GIANT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_SCAMOZZI_IONIC_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_SCAMOZZI_IONIC_CAPITAL_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_SCAMOZZI_IONIC_CAPITAL_GIANT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_CORINTHIAN_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_CORINTHIAN_BASE_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_CORINTHIAN_BASE_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_CORINTHIAN_BASE_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_CORINTHIAN_BASE_GIANT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_CORINTHIAN_BASE_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_CORINTHIAN_BASE_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_CORINTHIAN_BASE_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_DORIC_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_DORIC_CAPITAL_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_TUSCAN_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_TUSCAN_BASE_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_DORIC_CAPITAL_GIANT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_CORINTHIAN_BASE_GIANT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_DORIC_COLUMN_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_DORIC_COLUMN_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_DORIC_COLUMN_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_DORIC_COLUMN_GIANT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_TUSCAN_BASE_REGULAR.get());
        registerObjItemModel(BlocksRegistry.DIORITE_TUSCAN_BASE_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_TUSCAN_BASE_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_TUSCAN_BASE_GIANT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_TUSCAN_CAPITAL_REGULAR.get());
        registerObjItemModel(BlocksRegistry.DIORITE_TUSCAN_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_TUSCAN_CAPITAL_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_TUSCAN_CAPITAL_GIANT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_DORIC_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_DORIC_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_DORIC_CAPITAL_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_DORIC_CAPITAL_GIANT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_DORIC_BASE_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_DORIC_BASE_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_DORIC_BASE_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_DORIC_BASE_GIANT.get());
        registerObjItemModel(BlocksRegistry.DIORITE_COMPOSITE_CAPITAL_SMALL.get());
        registerObjItemModel(BlocksRegistry.DIORITE_COLUMN_REGULAR.get());
        registerObjItemModel(BlocksRegistry.DIORITE_DORIC_COLUMN_REGULAR.get());
        registerObjItemModel(BlocksRegistry.DIORITE_FLUTED_COLUMN_REGULAR.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_CORINTHIAN_CAPITAL_MEDIUM.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_CORINTHIAN_CAPITAL_LARGE.get());
        registerObjItemModel(BlocksRegistry.DIORITE_ROMAN_CORINTHIAN_CAPITAL_GIANT.get());
    }

    public void registerObjItemModel(Block block)
    {
        String name = ForgeRegistries.BLOCKS.getKey(block).getPath();
        withExistingParent(name, modLoc("block/" + name));
    }

    public void registerObjItemModelLeft(Block block)
    {
        String name = ForgeRegistries.BLOCKS.getKey(block).getPath();
        withExistingParent(name, modLoc("block/" + name + "_left"));
    }

    private void registerWallItem(Block wallBlock, Block textureSource)
    {
        // Get the Registry IDs (e.g., "minecraft:dark_prismarine" or "musicinstone:brick_tiles")
        ResourceLocation sourceKey = ForgeRegistries.BLOCKS.getKey(textureSource);
        ResourceLocation wallKey = ForgeRegistries.BLOCKS.getKey(wallBlock);

        // This part makes it universal: it uses the source's own namespace (minecraft or yours)
        //noinspection removal
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
}
