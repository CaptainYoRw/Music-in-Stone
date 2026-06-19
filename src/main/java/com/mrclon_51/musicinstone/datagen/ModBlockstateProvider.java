package com.mrclon_51.musicinstone.datagen;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.BlocksRegistry;
import com.mrclon_51.musicinstone.block.*;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("removal")
public class ModBlockstateProvider extends BlockStateProvider
{
    public ModBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, MusicinStone.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        // Example: Manual control over specific blocks
        generateBlockVariants(BlocksRegistry.BRICKS_TILES.get(), BlocksRegistry.BRICK_TILES_SLAB, BlocksRegistry.BRICK_TILES_STAIRS, BlocksRegistry.BRICK_TILES_WALL);
        generateBlockVariants(BlocksRegistry.BRICKS_TILES_STACK.get(), BlocksRegistry.BRICK_TILES_STACK_SLAB, BlocksRegistry.BRICK_TILES_STACK_STAIRS, BlocksRegistry.BRICK_TILES_STACK_WALL);
        generateBlockVariants(BlocksRegistry.BRICKS_ROMAN.get(), BlocksRegistry.BRICK_ROMAN_SLAB, BlocksRegistry.BRICK_ROMAN_STAIRS, BlocksRegistry.BRICK_ROMAN_WALL);
        generateBlockVariants(BlocksRegistry.BRICKS_ROMAN_STACK.get(), BlocksRegistry.BRICK_ROMAN_STACK_SLAB, BlocksRegistry.BRICK_ROMAN_STACK_STAIRS, BlocksRegistry.BRICK_ROMAN_STACK_WALL);
        generateBlockVariants(BlocksRegistry.BRICKS_LONG.get(), BlocksRegistry.BRICK_LONG_SLAB, BlocksRegistry.BRICK_LONG_STAIRS, BlocksRegistry.BRICK_LONG_WALL);
        generateBlockVariants(BlocksRegistry.BRICKS_LONG_STACK.get(), BlocksRegistry.BRICK_LONG_STACK_SLAB, BlocksRegistry.BRICK_LONG_STACK_STAIRS, BlocksRegistry.BRICK_LONG_STACK_WALL);
        generateBlockVariants(BlocksRegistry.CLINKER_BRICKS.get(), BlocksRegistry.CLINKER_BRICK_SLAB, BlocksRegistry.CLINKER_BRICK_STAIRS, BlocksRegistry.CLINKER_BRICK_WALL);

        // Custom Shapes using existing templates
        generateDefaultCustomShape(BlocksRegistry.BRICK_TILES_FINIAL, "template_finial", BlocksRegistry.BRICKS_TILES.get());
        generateHorizontalCustomShape(BlocksRegistry.BRICK_TILES_PEDESTAL, "template_pedestal", BlocksRegistry.BRICKS_TILES.get());
        generateDefaultCustomShape(BlocksRegistry.BRICK_TILES_STACK_FINIAL, "template_finial", BlocksRegistry.BRICKS_TILES_STACK.get());
        generateHorizontalCustomShape(BlocksRegistry.BRICK_TILES_STACK_PEDESTAL, "template_pedestal", BlocksRegistry.BRICKS_TILES_STACK.get());
        generateDefaultCustomShape(BlocksRegistry.BRICK_ROMAN_FINIAL, "template_finial", BlocksRegistry.BRICKS_ROMAN.get());
        generateHorizontalCustomShape(BlocksRegistry.BRICK_ROMAN_PEDESTAL, "template_pedestal", BlocksRegistry.BRICKS_ROMAN.get());
        generateDefaultCustomShape(BlocksRegistry.BRICK_ROMAN_STACK_FINIAL, "template_finial", BlocksRegistry.BRICKS_ROMAN_STACK.get());
        generateHorizontalCustomShape(BlocksRegistry.BRICK_ROMAN_STACK_PEDESTAL, "template_pedestal", BlocksRegistry.BRICKS_ROMAN_STACK.get());
        generateDefaultCustomShape(BlocksRegistry.BRICK_LONG_STACK_FINIAL, "template_finial", BlocksRegistry.BRICKS_LONG_STACK.get());
        generateHorizontalCustomShape(BlocksRegistry.BRICK_LONG_STACK_PEDESTAL, "template_pedestal", BlocksRegistry.BRICKS_LONG_STACK.get());
        generateDefaultCustomShape(BlocksRegistry.BRICK_LONG_FINIAL, "template_finial", BlocksRegistry.BRICKS_LONG.get());
        generateHorizontalCustomShape(BlocksRegistry.BRICK_LONG_PEDESTAL, "template_pedestal", BlocksRegistry.BRICKS_LONG.get());

        generateDefaultCustomShape(BlocksRegistry.COBBLESTONE_FINIAL, "template_finial", Blocks.COBBLESTONE);
        generateHorizontalCustomShape(BlocksRegistry.COBBLESTONE_PEDESTAL, "template_pedestal", Blocks.COBBLESTONE);

        generateDefaultCustomShape(BlocksRegistry.STONE_FINIAL, "template_finial", Blocks.STONE);
        generateHorizontalCustomShape(BlocksRegistry.STONE_PEDESTAL, "template_pedestal", Blocks.STONE);
        generateLayerCustomShape(BlocksRegistry.STONE_LAYER.get(), Blocks.STONE);
        generateHorizontalCustomShape(BlocksRegistry.STONE_ARROWSLIT, "template_arrowslit", Blocks.STONE);
        generateHorizontalCustomShape(BlocksRegistry.STONE_CROSS_ARROWSLIT, "template_cross_arrowslit", Blocks.STONE);

        generateDefaultCustomShape(BlocksRegistry.STONE_BRICK_FINIAL, "template_finial", Blocks.STONE_BRICKS);
        generateHorizontalCustomShape(BlocksRegistry.STONE_BRICK_PEDESTAL, "template_pedestal", Blocks.STONE_BRICKS);
        generateLayerCustomShape(BlocksRegistry.STONE_BRICK_LAYER.get(), Blocks.STONE_BRICKS);
        generateHorizontalCustomShape(BlocksRegistry.STONE_BRICK_ARROWSLIT, "template_arrowslit", Blocks.STONE_BRICKS);
        generateHorizontalCustomShape(BlocksRegistry.STONE_BRICK_CROSS_ARROWSLIT, "template_cross_arrowslit", Blocks.STONE_BRICKS);

        generateDefaultCustomShape(BlocksRegistry.GILDED_BLACKSTONE_FINIAL, "template_finial", Blocks.GILDED_BLACKSTONE);
        generateHorizontalCustomShape(BlocksRegistry.GILDED_BLACKSTONE_PEDESTAL, "template_pedestal", Blocks.GILDED_BLACKSTONE);

        //Single block generation
        generateSingleBlockVariant(Blocks.DARK_PRISMARINE, BlocksRegistry.DARK_PRISMARINE_WALL.get());
        generateSingleBlockVariant(Blocks.PRISMARINE_BRICKS, BlocksRegistry.PRISMARINE_BRICK_WALL.get());
        generateSingleBlockVariant(Blocks.POLISHED_ANDESITE, BlocksRegistry.POLISHED_ANDESITE_WALL.get());
        generateSingleBlockVariant(Blocks.STONE, BlocksRegistry.STONE_WALL.get());
        generateSingleBlockVariant(Blocks.POLISHED_DIORITE, BlocksRegistry.POLISHED_DIORITE_WALL.get());
        generateSingleBlockVariant(Blocks.POLISHED_GRANITE, BlocksRegistry.POLISHED_GRANITE_WALL.get());

        generateSingleBlockVariant(BlocksRegistry.BRICKS_ROAD.get(), BlocksRegistry.BRICK_ROAD_SLAB.get());
        generateSingleBlockVariant(BlocksRegistry.BRICKS_ROAD.get(), BlocksRegistry.BRICK_ROAD_STAIRS.get());

        //Layer block generation
        generateLayerCustomShape(BlocksRegistry.BRICK_FANCY_LAYER.get(), BlocksRegistry.BRICKS_FANCY.get());
        generateLayerCustomShape(BlocksRegistry.BRICK_TILES_LAYER.get(), BlocksRegistry.BRICKS_TILES.get());
        generateLayerCustomShape(BlocksRegistry.BRICK_TILES_STACK_LAYER.get(), BlocksRegistry.BRICKS_TILES_STACK.get());
        generateLayerCustomShape(BlocksRegistry.BRICK_ROMAN_LAYER.get(), BlocksRegistry.BRICKS_ROMAN.get());
        generateLayerCustomShape(BlocksRegistry.BRICK_ROMAN_STACK_LAYER.get(), BlocksRegistry.BRICKS_ROMAN_STACK.get());
        generateLayerCustomShape(BlocksRegistry.BRICK_LONG_LAYER.get(), BlocksRegistry.BRICKS_LONG.get());
        generateLayerCustomShape(BlocksRegistry.BRICK_LONG_STACK_LAYER.get(), BlocksRegistry.BRICKS_LONG_STACK.get());
        generateLayerCustomShape(BlocksRegistry.BRICK_ROAD_LAYER.get(), BlocksRegistry.BRICKS_ROAD.get());
        generateLayerCustomShape(BlocksRegistry.COBBLESTONE_LAYER.get(), Blocks.COBBLESTONE);
        generateLayerCustomShape(BlocksRegistry.GILDED_BLACKSTONE_LAYER.get(), Blocks.GILDED_BLACKSTONE);

        generateHorizontalCustomShape(BlocksRegistry.COBBLESTONE_ARROWSLIT, "template_arrowslit", Blocks.COBBLESTONE);
        generateHorizontalCustomShape(BlocksRegistry.GILDED_BLACKSTONE_ARROWSLIT, "template_arrowslit", Blocks.GILDED_BLACKSTONE);
        generateHorizontalCustomShape(BlocksRegistry.COBBLESTONE_CROSS_ARROWSLIT, "template_cross_arrowslit", Blocks.COBBLESTONE);

        generateDefaultCustomShape(BlocksRegistry.QUARTZ_DORIC_CAPITAL_SMALL, "template_doric_capital_small", mcLoc("block/quartz_block_bottom"));

        generateColumn(BlocksRegistry.QUARTZ_FLUTED_COLUMN_MEDIUM, "template_column_medium", mcLoc("block/quartz_pillar"), mcLoc("block/quartz_pillar_top"));
        generateColumn(BlocksRegistry.QUARTZ_FLUTED_COLUMN_LARGE, "template_column_large", mcLoc("block/quartz_pillar"), mcLoc("block/quartz_block_bottom"));
        generateRotatingColumn(BlocksRegistry.QUARTZ_FLUTED_COLUMN_GIANT, "template_column_giant", mcLoc("block/quartz_pillar"), mcLoc("block/quartz_block_bottom"));

        generateDefaultCustomShape(BlocksRegistry.QUARTZ_IONIC_BASE_MEDIUM, "template_ionic_base_medium", mcLoc("block/quartz_block_bottom"));

        generateIonic90CustomShape(BlocksRegistry.QUARTZ_IONIC_CAPITAL_MEDIUM, "template_ionic_capital_medium", mcLoc("block/quartz_block_bottom"), modLoc("block/quartz_ionic"), modLoc("block/quartz_volute"));

        generateDefaultCustomShape(BlocksRegistry.QUARTZ_IONIC_BASE_LARGE, "template_ionic_base_large", mcLoc("block/quartz_block_bottom"));

        generateIonic90CustomShape(BlocksRegistry.QUARTZ_IONIC_CAPITAL_LARGE, "template_ionic_capital_large", mcLoc("block/quartz_block_bottom"), modLoc("block/quartz_ionic"), modLoc("block/quartz_volute"));

        generateCornerIonicCustomShape(BlocksRegistry.QUARTZ_CORNER_IONIC_CAPITAL_SMALL, "template_corner_ionic_capital_small", mcLoc("block/quartz_block_bottom"), modLoc("block/quartz_ionic"), modLoc("block/quartz_volute"));

        generateFixedIonicShape(BlocksRegistry.QUARTZ_ROMAN_IONIC_CAPITAL_SMALL, "template_roman_ionic_capital_small", mcLoc("block/quartz_block_bottom"), modLoc("block/quartz_ionic"), modLoc("block/quartz_volute"));
        generateFixedIonicShape(BlocksRegistry.QUARTZ_SCAMOZZI_IONIC_CAPITAL_SMALL, "template_scamozzi_ionic_capital_small", mcLoc("block/quartz_block_bottom"), modLoc("block/quartz_ionic"), modLoc("block/quartz_volute"));

        generateDefaultCorinthianShape(BlocksRegistry.QUARTZ_GREEK_CORINTHIAN_CAPITAL_SMALL, "template_greek_corinthian_capital_small", mcLoc("block/quartz_block_bottom"), modLoc("block/quartz_corinthian"), modLoc("block/quartz_volute"));

        generateDefaultCustomShape(BlocksRegistry.CLINKER_BRICK_FINIAL, "template_finial", BlocksRegistry.CLINKER_BRICKS.get());
        generateHorizontalCustomShape(BlocksRegistry.CLINKER_BRICK_PEDESTAL, "template_pedestal", BlocksRegistry.CLINKER_BRICKS.get());
        generateLayerCustomShape(BlocksRegistry.CLINKER_BRICK_LAYER.get(), BlocksRegistry.CLINKER_BRICKS.get());
        generateHorizontalCustomShape(BlocksRegistry.CLINKER_BRICK_ARROWSLIT, "template_arrowslit", BlocksRegistry.CLINKER_BRICKS.get());
        generateHorizontalCustomShape(BlocksRegistry.CLINKER_BRICK_CROSS_ARROWSLIT, "template_cross_arrowslit", BlocksRegistry.CLINKER_BRICKS.get());

        generateColumn(BlocksRegistry.GILDED_BLACKSTONE_COLUMN_SMALL, "template_column_small", mcLoc("block/gilded_blackstone"), mcLoc("block/blackstone"));

        generateDefaultCorinthianShape(BlocksRegistry.GOLD_GREEK_CORINTHIAN_CAPITAL_SMALL, "template_greek_corinthian_capital_small", modLoc("block/gold_block_seamless"), modLoc("block/gold_corinthian"), modLoc("block/gold_volute"));
        generateFixedIonicShape(BlocksRegistry.GOLD_SCAMOZZI_IONIC_CAPITAL_SMALL, "template_scamozzi_ionic_capital_small", modLoc("block/gold_block_seamless"), modLoc("block/gold_ionic"), modLoc("block/gold_volute"));
        generateFixedIonicShape(BlocksRegistry.GOLD_ROMAN_IONIC_CAPITAL_SMALL, "template_roman_ionic_capital_small", modLoc("block/gold_block_seamless"), modLoc("block/gold_ionic"), modLoc("block/gold_volute"));
        generateCornerIonicCustomShape(BlocksRegistry.GOLD_CORNER_IONIC_CAPITAL_SMALL, "template_corner_ionic_capital_small", modLoc("block/gold_block_seamless"), modLoc("block/gold_ionic"), modLoc("block/gold_volute"));
        generateDefaultCustomShape(BlocksRegistry.GOLD_IONIC_BASE_SMALL, "template_ionic_base_small", modLoc("block/gold_block_seamless"));
        generateIonic90CustomShape(BlocksRegistry.GOLD_IONIC_CAPITAL_SMALL, "template_ionic_capital_small", modLoc("block/gold_block_seamless"), modLoc("block/gold_ionic"), modLoc("block/gold_volute"));

        generateDefaultCustomShape(BlocksRegistry.GRANITE_FINIAL, "template_finial", Blocks.GRANITE);
        generateHorizontalCustomShape(BlocksRegistry.GRANITE_PEDESTAL, "template_pedestal", Blocks.GRANITE);
        generateLayerCustomShape(BlocksRegistry.GRANITE_LAYER.get(), Blocks.GRANITE);
        generateHorizontalCustomShape(BlocksRegistry.GRANITE_ARROWSLIT, "template_arrowslit", Blocks.GRANITE);
        generateHorizontalCustomShape(BlocksRegistry.GRANITE_CROSS_ARROWSLIT, "template_cross_arrowslit", Blocks.GRANITE);

        generateDefaultCustomShape(BlocksRegistry.POLISHED_GRANITE_FINIAL, "template_finial", Blocks.POLISHED_GRANITE);
        generateHorizontalCustomShape(BlocksRegistry.POLISHED_GRANITE_PEDESTAL, "template_pedestal", Blocks.POLISHED_GRANITE);
        generateLayerCustomShape(BlocksRegistry.POLISHED_GRANITE_LAYER.get(), Blocks.POLISHED_GRANITE);
        generateHorizontalCustomShape(BlocksRegistry.POLISHED_GRANITE_ARROWSLIT, "template_arrowslit", Blocks.POLISHED_GRANITE);
        generateHorizontalCustomShape(BlocksRegistry.POLISHED_GRANITE_CROSS_ARROWSLIT, "template_cross_arrowslit", Blocks.POLISHED_GRANITE);

        generateDefaultCustomShape(BlocksRegistry.DIORITE_FINIAL, "template_finial", Blocks.DIORITE);
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_PEDESTAL, "template_pedestal", Blocks.DIORITE);
        generateLayerCustomShape(BlocksRegistry.DIORITE_LAYER.get(), Blocks.DIORITE);
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_ARROWSLIT, "template_arrowslit", Blocks.DIORITE);
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_CROSS_ARROWSLIT, "template_cross_arrowslit", Blocks.DIORITE);

        generateDefaultCustomShape(BlocksRegistry.POLISHED_DIORITE_FINIAL, "template_finial", Blocks.POLISHED_DIORITE);
        generateHorizontalCustomShape(BlocksRegistry.POLISHED_DIORITE_PEDESTAL, "template_pedestal", Blocks.POLISHED_DIORITE);
        generateLayerCustomShape(BlocksRegistry.POLISHED_DIORITE_LAYER.get(), Blocks.POLISHED_DIORITE);
        generateHorizontalCustomShape(BlocksRegistry.POLISHED_DIORITE_ARROWSLIT, "template_arrowslit", Blocks.POLISHED_DIORITE);
        generateHorizontalCustomShape(BlocksRegistry.POLISHED_DIORITE_CROSS_ARROWSLIT, "template_cross_arrowslit", Blocks.POLISHED_DIORITE);

        generateDefaultCustomShape(BlocksRegistry.ANDESITE_FINIAL, "template_finial", Blocks.ANDESITE);
        generateHorizontalCustomShape(BlocksRegistry.ANDESITE_PEDESTAL, "template_pedestal", Blocks.ANDESITE);
        generateLayerCustomShape(BlocksRegistry.ANDESITE_LAYER.get(), Blocks.ANDESITE);
        generateHorizontalCustomShape(BlocksRegistry.ANDESITE_ARROWSLIT, "template_arrowslit", Blocks.ANDESITE);
        generateHorizontalCustomShape(BlocksRegistry.ANDESITE_CROSS_ARROWSLIT, "template_cross_arrowslit", Blocks.ANDESITE);

        generateDefaultCustomShape(BlocksRegistry.POLISHED_ANDESITE_FINIAL, "template_finial", Blocks.POLISHED_ANDESITE);
        generateHorizontalCustomShape(BlocksRegistry.POLISHED_ANDESITE_PEDESTAL, "template_pedestal", Blocks.POLISHED_ANDESITE);
        generateLayerCustomShape(BlocksRegistry.POLISHED_ANDESITE_LAYER.get(), Blocks.POLISHED_ANDESITE);
        generateHorizontalCustomShape(BlocksRegistry.POLISHED_ANDESITE_ARROWSLIT, "template_arrowslit", Blocks.POLISHED_ANDESITE);
        generateHorizontalCustomShape(BlocksRegistry.POLISHED_ANDESITE_CROSS_ARROWSLIT, "template_cross_arrowslit", Blocks.POLISHED_ANDESITE);



        generateColumn(BlocksRegistry.DIORITE_COLUMN_SMALL, "template_column_small", modLoc("block/diorite_seamless"), modLoc("block/diorite_pillar_top"));
        generateColumn(BlocksRegistry.DIORITE_COLUMN_REGULAR, "template_column_regular", modLoc("block/diorite_seamless"), modLoc("block/diorite_pillar_top"));
        generateColumn(BlocksRegistry.DIORITE_COLUMN_MEDIUM, "template_column_medium", modLoc("block/diorite_seamless"), modLoc("block/diorite_pillar_top"));
        generateColumn(BlocksRegistry.DIORITE_COLUMN_LARGE, "template_column_large", modLoc("block/diorite_seamless"), modLoc("block/diorite_seamless"));
        generateRotatingColumn(BlocksRegistry.DIORITE_COLUMN_GIANT, "template_column_giant", modLoc("block/diorite_seamless"), modLoc("block/diorite_seamless"));

        generateColumn(BlocksRegistry.DIORITE_DORIC_COLUMN_SMALL, "template_column_small", modLoc("block/diorite_pillar_doric"), modLoc("block/diorite_pillar_top"));
        generateColumn(BlocksRegistry.DIORITE_DORIC_COLUMN_REGULAR, "template_column_regular", modLoc("block/diorite_pillar_doric"), modLoc("block/diorite_pillar_top"));
        generateColumn(BlocksRegistry.DIORITE_DORIC_COLUMN_MEDIUM, "template_column_medium", modLoc("block/diorite_pillar_doric"), modLoc("block/diorite_pillar_top"));
        generateColumn(BlocksRegistry.DIORITE_DORIC_COLUMN_LARGE, "template_column_large", modLoc("block/diorite_pillar_doric"), modLoc("block/diorite_seamless"));
        generateRotatingColumn(BlocksRegistry.DIORITE_DORIC_COLUMN_GIANT, "template_column_giant", modLoc("block/diorite_pillar_doric"), modLoc("block/diorite_seamless"));

        generateColumn(BlocksRegistry.DIORITE_FLUTED_COLUMN_SMALL, "template_column_small", modLoc("block/diorite_pillar"), modLoc("block/diorite_pillar_top"));
        generateColumn(BlocksRegistry.DIORITE_FLUTED_COLUMN_REGULAR, "template_column_regular", modLoc("block/diorite_pillar"), modLoc("block/diorite_pillar_top"));
        generateColumn(BlocksRegistry.DIORITE_FLUTED_COLUMN_MEDIUM, "template_column_medium", modLoc("block/diorite_pillar"), modLoc("block/diorite_pillar_top"));
        generateColumn(BlocksRegistry.DIORITE_FLUTED_COLUMN_LARGE, "template_column_large", modLoc("block/diorite_pillar"), modLoc("block/diorite_seamless"));
        generateRotatingColumn(BlocksRegistry.DIORITE_FLUTED_COLUMN_GIANT, "template_column_giant", modLoc("block/diorite_pillar"), modLoc("block/diorite_seamless"));

        generateDefaultCustomShape(BlocksRegistry.DIORITE_ROMAN_DORIC_BASE_SMALL, "template_roman_doric_base_small", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_ROMAN_DORIC_BASE_MEDIUM, "template_roman_doric_base_medium", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_ROMAN_DORIC_BASE_LARGE, "template_roman_doric_base_large", modLoc("block/diorite_seamless"));
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_ROMAN_DORIC_BASE_GIANT, "template_roman_doric_base_giant", modLoc("block/diorite_seamless"));

        generateDefaultCustomShape(BlocksRegistry.DIORITE_IONIC_BASE_SMALL, "template_ionic_base_small", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_IONIC_BASE_MEDIUM, "template_ionic_base_medium", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_IONIC_BASE_LARGE, "template_ionic_base_large", modLoc("block/diorite_seamless"));
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_IONIC_BASE_GIANT, "template_ionic_base_giant", modLoc("block/diorite_seamless"));

        generateDefaultCustomShape(BlocksRegistry.DIORITE_ROMAN_IONIC_BASE_SMALL, "template_roman_ionic_base_small", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_ROMAN_IONIC_BASE_MEDIUM, "template_roman_ionic_base_medium", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_ROMAN_IONIC_BASE_LARGE, "template_roman_ionic_base_large", modLoc("block/diorite_seamless"));
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_ROMAN_IONIC_BASE_GIANT, "template_roman_ionic_base_giant", modLoc("block/diorite_seamless"));

        generateDefaultCustomShape(BlocksRegistry.DIORITE_CORINTHIAN_BASE_SMALL, "template_greek_corinthian_base_small", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_CORINTHIAN_BASE_MEDIUM, "template_greek_corinthian_base_medium", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_CORINTHIAN_BASE_LARGE, "template_greek_corinthian_base_large", modLoc("block/diorite_seamless"));
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_CORINTHIAN_BASE_GIANT, "template_greek_corinthian_base_giant", modLoc("block/diorite_seamless"));

        generateDefaultCustomShape(BlocksRegistry.DIORITE_ROMAN_CORINTHIAN_BASE_SMALL, "template_roman_corinthian_base_small", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_ROMAN_CORINTHIAN_BASE_MEDIUM, "template_roman_corinthian_base_medium", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_ROMAN_CORINTHIAN_BASE_LARGE, "template_roman_corinthian_base_large", modLoc("block/diorite_seamless"));
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_ROMAN_CORINTHIAN_BASE_GIANT, "template_roman_corinthian_base_giant", modLoc("block/diorite_seamless"));

        generateDefaultCustomShape(BlocksRegistry.DIORITE_TUSCAN_BASE_SMALL, "template_tuscan_base_small", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_TUSCAN_BASE_REGULAR, "template_tuscan_base_regular", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_TUSCAN_BASE_MEDIUM, "template_tuscan_base_medium", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_TUSCAN_BASE_LARGE, "template_tuscan_base_large", modLoc("block/diorite_seamless"));
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_TUSCAN_BASE_GIANT, "template_tuscan_base_giant", modLoc("block/diorite_seamless"));

        generateDefaultCustomShape(BlocksRegistry.DIORITE_DORIC_CAPITAL_SMALL, "template_doric_capital_small", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_DORIC_CAPITAL_MEDIUM, "template_doric_capital_medium", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_DORIC_CAPITAL_LARGE, "template_doric_capital_large", modLoc("block/diorite_seamless"));
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_DORIC_CAPITAL_GIANT, "template_doric_capital_giant", modLoc("block/diorite_seamless"));

        generateDefaultCustomShape(BlocksRegistry.DIORITE_ROMAN_DORIC_CAPITAL_SMALL, "template_roman_doric_capital_small", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_ROMAN_DORIC_CAPITAL_MEDIUM, "template_roman_doric_capital_medium", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_ROMAN_DORIC_CAPITAL_LARGE, "template_roman_doric_capital_large", modLoc("block/diorite_seamless"));
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_ROMAN_DORIC_CAPITAL_GIANT, "template_roman_doric_capital_giant", modLoc("block/diorite_seamless"));

        generateIonic90CustomShape(BlocksRegistry.DIORITE_IONIC_CAPITAL_SMALL, "template_ionic_capital_small", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_volute"));
        generateIonic90CustomShape(BlocksRegistry.DIORITE_IONIC_CAPITAL_MEDIUM, "template_ionic_capital_medium", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_volute"));
        generateIonic90CustomShape(BlocksRegistry.DIORITE_IONIC_CAPITAL_LARGE, "template_ionic_capital_large", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_volute"));
        generateSplitFacingBlock(BlocksRegistry.DIORITE_IONIC_CAPITAL_GIANT, "template_ionic_capital_giant_left", "template_ionic_capital_giant_right", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_volute"));

        generateCornerIonicCustomShape(BlocksRegistry.DIORITE_CORNER_IONIC_CAPITAL_SMALL, "template_corner_ionic_capital_small", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_volute"));
        generateCornerIonicCustomShape(BlocksRegistry.DIORITE_CORNER_IONIC_CAPITAL_MEDIUM, "template_corner_ionic_capital_medium", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_volute"));
        generateCornerIonicCustomShape(BlocksRegistry.DIORITE_CORNER_IONIC_CAPITAL_LARGE, "template_corner_ionic_capital_large", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_volute"));
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_CORNER_IONIC_CAPITAL_GIANT, "template_corner_ionic_capital_giant", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_volute"));

        generateFixedIonicShape(BlocksRegistry.DIORITE_SCAMOZZI_IONIC_CAPITAL_SMALL, "template_scamozzi_ionic_capital_small", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_volute"));
        generateFixedIonicShape(BlocksRegistry.DIORITE_SCAMOZZI_IONIC_CAPITAL_MEDIUM, "template_scamozzi_ionic_capital_medium", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_volute"));
        generateFixedIonicShape(BlocksRegistry.DIORITE_SCAMOZZI_IONIC_CAPITAL_LARGE, "template_scamozzi_ionic_capital_large", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_volute"));
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_SCAMOZZI_IONIC_CAPITAL_GIANT, "template_scamozzi_ionic_capital_giant", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_volute"));

        generateFixedIonicShape(BlocksRegistry.DIORITE_ROMAN_IONIC_CAPITAL_SMALL, "template_roman_ionic_capital_small", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_volute"));
        generateFixedIonicShape(BlocksRegistry.DIORITE_ROMAN_IONIC_CAPITAL_MEDIUM, "template_roman_ionic_capital_medium", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_volute"));
        generateFixedIonicShape(BlocksRegistry.DIORITE_ROMAN_IONIC_CAPITAL_LARGE, "template_roman_ionic_capital_large", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_volute"));
        generateFixedIonicShape(BlocksRegistry.DIORITE_ROMAN_IONIC_CAPITAL_GIANT, "template_roman_ionic_capital_giant", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_volute"));

        generateDefaultCorinthianShape(BlocksRegistry.DIORITE_GREEK_CORINTHIAN_CAPITAL_SMALL, "template_greek_corinthian_capital_small", modLoc("block/diorite_seamless"), modLoc("block/diorite_corinthian"), modLoc("block/diorite_volute"));
        generateDefaultCorinthianShape(BlocksRegistry.DIORITE_GREEK_CORINTHIAN_CAPITAL_MEDIUM, "template_greek_corinthian_capital_medium", modLoc("block/diorite_seamless"), modLoc("block/diorite_corinthian"), modLoc("block/diorite_volute"));
        generateDefaultCorinthianShape(BlocksRegistry.DIORITE_GREEK_CORINTHIAN_CAPITAL_LARGE, "template_greek_corinthian_capital_large", modLoc("block/diorite_seamless"), modLoc("block/diorite_corinthian"), modLoc("block/diorite_volute"));
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_GREEK_CORINTHIAN_CAPITAL_GIANT, "template_greek_corinthian_capital_giant", modLoc("block/diorite_seamless"), modLoc("block/diorite_corinthian"), modLoc("block/diorite_volute"));

        generateDefaultCorinthianShape(BlocksRegistry.DIORITE_ROMAN_CORINTHIAN_CAPITAL_SMALL, "template_roman_corinthian_capital_small", modLoc("block/diorite_seamless"), modLoc("block/diorite_corinthian"), modLoc("block/diorite_volute"));
        generateDefaultCorinthianShape(BlocksRegistry.DIORITE_ROMAN_CORINTHIAN_CAPITAL_MEDIUM, "template_roman_corinthian_capital_medium", modLoc("block/diorite_seamless"), modLoc("block/diorite_corinthian"), modLoc("block/diorite_volute"));
        generateDefaultCorinthianShape(BlocksRegistry.DIORITE_ROMAN_CORINTHIAN_CAPITAL_LARGE, "template_roman_corinthian_capital_large", modLoc("block/diorite_seamless"), modLoc("block/diorite_corinthian"), modLoc("block/diorite_volute"));
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_ROMAN_CORINTHIAN_CAPITAL_GIANT, "template_roman_corinthian_capital_giant", modLoc("block/diorite_seamless"), modLoc("block/diorite_corinthian"), modLoc("block/diorite_volute"));

        generateDefaultCustomShape(BlocksRegistry.DIORITE_TUSCAN_CAPITAL_SMALL, "template_tuscan_capital_small", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_TUSCAN_CAPITAL_REGULAR, "template_tuscan_capital_regular", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_TUSCAN_CAPITAL_MEDIUM, "template_tuscan_capital_medium", modLoc("block/diorite_seamless"));
        generateDefaultCustomShape(BlocksRegistry.DIORITE_TUSCAN_CAPITAL_LARGE, "template_tuscan_capital_large", modLoc("block/diorite_seamless"));
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_TUSCAN_CAPITAL_GIANT, "template_tuscan_capital_giant", modLoc("block/diorite_seamless"));

        generateDefaultCompositeShape(BlocksRegistry.DIORITE_COMPOSITE_CAPITAL_SMALL, "template_composite_capital_small", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_corinthian"), modLoc("block/diorite_volute"));
        generateDefaultCompositeShape(BlocksRegistry.DIORITE_COMPOSITE_CAPITAL_MEDIUM, "template_composite_capital_medium", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_corinthian"), modLoc("block/diorite_volute"));
        generateDefaultCompositeShape(BlocksRegistry.DIORITE_COMPOSITE_CAPITAL_LARGE, "template_composite_capital_large", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_corinthian"), modLoc("block/diorite_volute"));
        generateHorizontalCustomShape(BlocksRegistry.DIORITE_COMPOSITE_CAPITAL_GIANT, "template_composite_capital_giant", modLoc("block/diorite_seamless"), modLoc("block/diorite_ionic"), modLoc("block/diorite_corinthian"), modLoc("block/diorite_volute"));





        generateColumn(BlocksRegistry.SANDSTONE_COLUMN_SMALL, "template_column_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_pillar_top"));
        generateColumn(BlocksRegistry.SANDSTONE_COLUMN_REGULAR, "template_column_regular", mcLoc("block/sandstone_top"), modLoc("block/sandstone_pillar_top"));
        generateColumn(BlocksRegistry.SANDSTONE_COLUMN_MEDIUM, "template_column_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_pillar_top"));
        generateColumn(BlocksRegistry.SANDSTONE_COLUMN_LARGE, "template_column_large", mcLoc("block/sandstone_top"), mcLoc("block/sandstone_top"));
        generateRotatingColumn(BlocksRegistry.SANDSTONE_COLUMN_GIANT, "template_column_giant", mcLoc("block/sandstone_top"), mcLoc("block/sandstone_top"));

        generateColumn(BlocksRegistry.SANDSTONE_DORIC_COLUMN_SMALL, "template_column_small", modLoc("block/sandstone_pillar_doric"), modLoc("block/sandstone_pillar_top"));
        generateColumn(BlocksRegistry.SANDSTONE_DORIC_COLUMN_REGULAR, "template_column_regular", modLoc("block/sandstone_pillar_doric"), modLoc("block/sandstone_pillar_top"));
        generateColumn(BlocksRegistry.SANDSTONE_DORIC_COLUMN_MEDIUM, "template_column_medium", modLoc("block/sandstone_pillar_doric"), modLoc("block/sandstone_pillar_top"));
        generateColumn(BlocksRegistry.SANDSTONE_DORIC_COLUMN_LARGE, "template_column_large", modLoc("block/sandstone_pillar_doric"), mcLoc("block/sandstone_top"));
        generateRotatingColumn(BlocksRegistry.SANDSTONE_DORIC_COLUMN_GIANT, "template_column_giant", modLoc("block/sandstone_pillar_doric"), mcLoc("block/sandstone_top"));

        generateColumn(BlocksRegistry.SANDSTONE_FLUTED_COLUMN_SMALL, "template_column_small", modLoc("block/sandstone_pillar"), modLoc("block/sandstone_pillar_top"));
        generateColumn(BlocksRegistry.SANDSTONE_FLUTED_COLUMN_REGULAR, "template_column_regular", modLoc("block/sandstone_pillar"), modLoc("block/sandstone_pillar_top"));
        generateColumn(BlocksRegistry.SANDSTONE_FLUTED_COLUMN_MEDIUM, "template_column_medium", modLoc("block/sandstone_pillar"), modLoc("block/sandstone_pillar_top"));
        generateColumn(BlocksRegistry.SANDSTONE_FLUTED_COLUMN_LARGE, "template_column_large", modLoc("block/sandstone_pillar"), mcLoc("block/sandstone_top"));
        generateRotatingColumn(BlocksRegistry.SANDSTONE_FLUTED_COLUMN_GIANT, "template_column_giant", modLoc("block/sandstone_pillar"), mcLoc("block/sandstone_top"));

        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_ROMAN_DORIC_BASE_SMALL, "template_roman_doric_base_small", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_ROMAN_DORIC_BASE_MEDIUM, "template_roman_doric_base_medium", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_ROMAN_DORIC_BASE_LARGE, "template_roman_doric_base_large", mcLoc("block/sandstone_top"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_ROMAN_DORIC_BASE_GIANT, "template_roman_doric_base_giant", mcLoc("block/sandstone_top"));

        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_IONIC_BASE_SMALL, "template_ionic_base_small", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_IONIC_BASE_MEDIUM, "template_ionic_base_medium", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_IONIC_BASE_LARGE, "template_ionic_base_large", mcLoc("block/sandstone_top"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_IONIC_BASE_GIANT, "template_ionic_base_giant", mcLoc("block/sandstone_top"));

        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_SMALL, "template_roman_ionic_base_small", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_MEDIUM, "template_roman_ionic_base_medium", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_LARGE, "template_roman_ionic_base_large", mcLoc("block/sandstone_top"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_GIANT, "template_roman_ionic_base_giant", mcLoc("block/sandstone_top"));

        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_CORINTHIAN_BASE_SMALL, "template_greek_corinthian_base_small", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_CORINTHIAN_BASE_MEDIUM, "template_greek_corinthian_base_medium", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_CORINTHIAN_BASE_LARGE, "template_greek_corinthian_base_large", mcLoc("block/sandstone_top"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_CORINTHIAN_BASE_GIANT, "template_greek_corinthian_base_giant", mcLoc("block/sandstone_top"));

        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_BASE_SMALL, "template_roman_corinthian_base_small", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_BASE_MEDIUM, "template_roman_corinthian_base_medium", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_BASE_LARGE, "template_roman_corinthian_base_large", mcLoc("block/sandstone_top"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_BASE_GIANT, "template_roman_corinthian_base_giant", mcLoc("block/sandstone_top"));

        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_TUSCAN_BASE_SMALL, "template_tuscan_base_small", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_TUSCAN_BASE_REGULAR, "template_tuscan_base_regular", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_TUSCAN_BASE_MEDIUM, "template_tuscan_base_medium", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_TUSCAN_BASE_LARGE, "template_tuscan_base_large", mcLoc("block/sandstone_top"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_TUSCAN_BASE_GIANT, "template_tuscan_base_giant", mcLoc("block/sandstone_top"));

        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_DORIC_CAPITAL_SMALL, "template_doric_capital_small", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_DORIC_CAPITAL_MEDIUM, "template_doric_capital_medium", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_DORIC_CAPITAL_LARGE, "template_doric_capital_large", mcLoc("block/sandstone_top"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_DORIC_CAPITAL_GIANT, "template_doric_capital_giant", mcLoc("block/sandstone_top"));

        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_ROMAN_DORIC_CAPITAL_SMALL, "template_roman_doric_capital_small", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_ROMAN_DORIC_CAPITAL_MEDIUM, "template_roman_doric_capital_medium", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_ROMAN_DORIC_CAPITAL_LARGE, "template_roman_doric_capital_large", mcLoc("block/sandstone_top"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_ROMAN_DORIC_CAPITAL_GIANT, "template_roman_doric_capital_giant", mcLoc("block/sandstone_top"));

        generateIonic90CustomShape(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_SMALL, "template_ionic_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateIonic90CustomShape(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_MEDIUM, "template_ionic_capital_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateIonic90CustomShape(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_LARGE, "template_ionic_capital_large", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateSplitFacingBlock(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_GIANT, "template_ionic_capital_giant_left", "template_ionic_capital_giant_right", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));

        generateCornerIonicCustomShape(BlocksRegistry.SANDSTONE_CORNER_IONIC_CAPITAL_SMALL, "template_corner_ionic_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateCornerIonicCustomShape(BlocksRegistry.SANDSTONE_CORNER_IONIC_CAPITAL_MEDIUM, "template_corner_ionic_capital_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateCornerIonicCustomShape(BlocksRegistry.SANDSTONE_CORNER_IONIC_CAPITAL_LARGE, "template_corner_ionic_capital_large", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_CORNER_IONIC_CAPITAL_GIANT, "template_corner_ionic_capital_giant", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));

        generateFixedIonicShape(BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_CAPITAL_SMALL, "template_scamozzi_ionic_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateFixedIonicShape(BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_CAPITAL_MEDIUM, "template_scamozzi_ionic_capital_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateFixedIonicShape(BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_CAPITAL_LARGE, "template_scamozzi_ionic_capital_large", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_CAPITAL_GIANT, "template_scamozzi_ionic_capital_giant", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));

        generateFixedIonicShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_CAPITAL_SMALL, "template_roman_ionic_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateFixedIonicShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_CAPITAL_MEDIUM, "template_roman_ionic_capital_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateFixedIonicShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_CAPITAL_LARGE, "template_roman_ionic_capital_large", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_CAPITAL_GIANT, "template_roman_ionic_capital_giant", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));

        generateDefaultCorinthianShape(BlocksRegistry.SANDSTONE_CORINTHIAN_CAPITAL_SMALL, "template_greek_corinthian_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));
        generateDefaultCorinthianShape(BlocksRegistry.SANDSTONE_CORINTHIAN_CAPITAL_MEDIUM, "template_greek_corinthian_capital_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));
        generateDefaultCorinthianShape(BlocksRegistry.SANDSTONE_CORINTHIAN_CAPITAL_LARGE, "template_greek_corinthian_capital_large", mcLoc("block/sandstone_top"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_CORINTHIAN_CAPITAL_GIANT, "template_greek_corinthian_capital_giant", mcLoc("block/sandstone_top"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));

        generateDefaultCorinthianShape(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_CAPITAL_SMALL, "template_roman_corinthian_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));
        generateDefaultCorinthianShape(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_CAPITAL_MEDIUM, "template_roman_corinthian_capital_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));
        generateDefaultCorinthianShape(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_CAPITAL_LARGE, "template_roman_corinthian_capital_large", mcLoc("block/sandstone_top"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_CAPITAL_GIANT, "template_roman_corinthian_capital_giant", mcLoc("block/sandstone_top"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));


        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_TUSCAN_CAPITAL_SMALL, "template_tuscan_capital_small", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_TUSCAN_CAPITAL_REGULAR, "template_tuscan_capital_regular", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_TUSCAN_CAPITAL_MEDIUM, "template_tuscan_capital_medium", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_TUSCAN_CAPITAL_LARGE, "template_tuscan_capital_large", mcLoc("block/sandstone_top"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_TUSCAN_CAPITAL_GIANT, "template_tuscan_capital_giant", mcLoc("block/sandstone_top"));

        generateDefaultCompositeShape(BlocksRegistry.SANDSTONE_COMPOSITE_CAPITAL_SMALL, "template_composite_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));
        generateDefaultCompositeShape(BlocksRegistry.SANDSTONE_COMPOSITE_CAPITAL_MEDIUM, "template_composite_capital_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));
        generateDefaultCompositeShape(BlocksRegistry.SANDSTONE_COMPOSITE_CAPITAL_LARGE, "template_composite_capital_large", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_COMPOSITE_CAPITAL_GIANT, "template_composite_capital_giant", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));


        generateRotatingColumn(BlocksRegistry.SANDSTONE_FLUTED_PILASTER_SMALL, "template_pilaster_small", modLoc("block/sandstone_pillar"), modLoc("block/sandstone_pillar_top"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_IONIC_PILASTER_BASE_SMALL, "template_ionic_pilaster_base_small", mcLoc("block/sandstone_top"));
        generateCornerIonicCustomShape(BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_PILASTER_CAPITAL_SMALL, "template_scamozzi_ionic_pilaster_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));


        generateRotatingHalfColumn(BlocksRegistry.SANDSTONE_FLUTED_HALF_COLUMN_SMALL, "template_half_column_small", modLoc("block/sandstone_pillar"), modLoc("block/sandstone_pillar_top"));
        generateRotatingHalfColumn(BlocksRegistry.SANDSTONE_HALF_COLUMN_SMALL, "template_half_column_small", modLoc("block/sandstone_pillar_doric"), modLoc("block/sandstone_pillar_top"));
        generateRotatingHalfColumn(BlocksRegistry.SANDSTONE_DORIC_HALF_COLUMN_SMALL, "template_half_column_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_pillar_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_DORIC_HALF_COLUMN_CAPITAL_SMALL, "template_half_doric_capital_small", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_ROMAN_DORIC_HALF_COLUMN_CAPITAL_SMALL, "template_half_roman_doric_capital_small", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_ROMAN_DORIC_HALF_COLUMN_BASE_SMALL, "template_half_roman_doric_base_small", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_IONIC_HALF_COLUMN_CAPITAL_SMALL, "template_half_ionic_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_HALF_COLUMN_CAPITAL_SMALL, "template_half_roman_ionic_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_IONIC_HALF_COLUMN_BASE_SMALL, "template_half_roman_ionic_base_small", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_HALF_COLUMN_BASE_SMALL, "template_half_roman_ionic_base_small", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_HALF_COLUMN_CAPITAL_SMALL, "template_half_scamozzi_ionic_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateHorizontalHalfCorinthianColumnCustomShape(BlocksRegistry.SANDSTONE_CORINTHIAN_HALF_COLUMN_CAPITAL_SMALL, "template_half_greek_corinthian_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));
        generateHorizontalHalfCorinthianColumnCustomShape(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_HALF_COLUMN_CAPITAL_SMALL, "template_half_roman_corinthian_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_CORINTHIAN_HALF_COLUMN_BASE_SMALL, "template_half_roman_corinthian_base_small", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_HALF_COLUMN_BASE_SMALL, "template_half_roman_ionic_base_small", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_COMPOSITE_HALF_COLUMN_CAPITAL_SMALL, "template_half_composite_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"), modLoc("block/sandstone_corinthian"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_TUSCAN_HALF_COLUMN_CAPITAL_SMALL, "template_half_tuscan_capital_small", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_TUSCAN_HALF_COLUMN_BASE_SMALL, "template_half_tuscan_base_small", mcLoc("block/sandstone_top"));
        generateRotatingHalfColumn(BlocksRegistry.SANDSTONE_FLUTED_HALF_COLUMN_REGULAR, "template_half_column_regular", modLoc("block/sandstone_pillar"), modLoc("block/sandstone_pillar_top"));
        generateRotatingHalfColumn(BlocksRegistry.SANDSTONE_HALF_COLUMN_REGULAR, "template_half_column_regular", modLoc("block/sandstone_pillar_doric"), modLoc("block/sandstone_pillar_top"));
        generateRotatingHalfColumn(BlocksRegistry.SANDSTONE_DORIC_HALF_COLUMN_REGULAR, "template_half_column_regular", mcLoc("block/sandstone_top"), modLoc("block/sandstone_pillar_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_TUSCAN_HALF_COLUMN_CAPITAL_REGULAR, "template_half_tuscan_capital_regular", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_TUSCAN_HALF_COLUMN_BASE_REGULAR, "template_half_tuscan_base_regular", mcLoc("block/sandstone_top"));
        generateRotatingHalfColumn(BlocksRegistry.SANDSTONE_FLUTED_HALF_COLUMN_MEDIUM, "template_half_column_medium", modLoc("block/sandstone_pillar"), modLoc("block/sandstone_pillar_top"));
        generateRotatingHalfColumn(BlocksRegistry.SANDSTONE_HALF_COLUMN_MEDIUM, "template_half_column_medium", modLoc("block/sandstone_pillar_doric"), modLoc("block/sandstone_pillar_top"));
        generateRotatingHalfColumn(BlocksRegistry.SANDSTONE_DORIC_HALF_COLUMN_MEDIUM, "template_half_column_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_pillar_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_DORIC_HALF_COLUMN_CAPITAL_MEDIUM, "template_half_doric_capital_medium", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_ROMAN_DORIC_HALF_COLUMN_CAPITAL_MEDIUM, "template_half_roman_doric_capital_medium", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_ROMAN_DORIC_HALF_COLUMN_BASE_MEDIUM, "template_half_roman_doric_base_medium", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_IONIC_HALF_COLUMN_CAPITAL_MEDIUM, "template_half_ionic_capital_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_HALF_COLUMN_CAPITAL_MEDIUM, "template_half_roman_ionic_capital_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_IONIC_HALF_COLUMN_BASE_MEDIUM, "template_half_roman_ionic_base_medium", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_HALF_COLUMN_BASE_MEDIUM, "template_half_roman_ionic_base_medium", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_HALF_COLUMN_CAPITAL_MEDIUM, "template_half_scamozzi_ionic_capital_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateHorizontalHalfCorinthianColumnCustomShape(BlocksRegistry.SANDSTONE_CORINTHIAN_HALF_COLUMN_CAPITAL_MEDIUM, "template_half_greek_corinthian_capital_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));
        generateHorizontalHalfCorinthianColumnCustomShape(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_HALF_COLUMN_CAPITAL_MEDIUM, "template_half_roman_corinthian_capital_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_CORINTHIAN_HALF_COLUMN_BASE_MEDIUM, "template_half_roman_corinthian_base_medium", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_HALF_COLUMN_BASE_MEDIUM, "template_half_roman_ionic_base_medium", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_COMPOSITE_HALF_COLUMN_CAPITAL_MEDIUM, "template_half_composite_capital_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"), modLoc("block/sandstone_corinthian"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_TUSCAN_HALF_COLUMN_CAPITAL_MEDIUM, "template_half_tuscan_capital_medium", mcLoc("block/sandstone_top"));
        generateHorizontalHalfColumnCustomShape(BlocksRegistry.SANDSTONE_TUSCAN_HALF_COLUMN_BASE_MEDIUM, "template_half_tuscan_base_medium", mcLoc("block/sandstone_top"));



        generateWindowFrame(BlocksRegistry.SANDSTONE_WINDOW_FRAME, "template_window_frame", modLoc("block/sandstone_pillar"), mcLoc("block/sandstone_top"));
        generateWindowPediment(BlocksRegistry.SANDSTONE_WINDOW_UPPER_FRAME, "template_window_upper_frame", modLoc("block/sandstone_frame"), mcLoc("block/sandstone_top"));
        generateWindowPediment(BlocksRegistry.SANDSTONE_WINDOW_KEYSTONE, "template_window_keystone", modLoc("block/sandstone_frame"), mcLoc("block/sandstone_top"));
        generateComplexPediment(BlocksRegistry.SANDSTONE_WINDOW_STRAIGHT_PEDIMENT, "block/pediment/", "straight", mcLoc("block/sandstone_top"), modLoc("block/sandstone_frame"), modLoc("block/sandstone_volute"));
        generateComplexPediment(BlocksRegistry.SANDSTONE_WINDOW_GREEK_PEDIMENT, "block/pediment/", "greek", mcLoc("block/sandstone_top"), modLoc("block/sandstone_frame"), modLoc("block/sandstone_volute"));



        generateDefaultCustomShape(BlocksRegistry.COBBLED_DEEPSLATE_FINIAL, "template_finial", Blocks.COBBLED_DEEPSLATE);
        generateHorizontalCustomShape(BlocksRegistry.COBBLED_DEEPSLATE_PEDESTAL, "template_pedestal", Blocks.COBBLED_DEEPSLATE);
        generateLayerCustomShape(BlocksRegistry.COBBLED_DEEPSLATE_LAYER.get(), Blocks.COBBLED_DEEPSLATE);
        generateHorizontalCustomShape(BlocksRegistry.COBBLED_DEEPSLATE_ARROWSLIT, "template_arrowslit", Blocks.COBBLED_DEEPSLATE);
        generateHorizontalCustomShape(BlocksRegistry.COBBLED_DEEPSLATE_CROSS_ARROWSLIT, "template_cross_arrowslit", Blocks.COBBLED_DEEPSLATE);

        generateDefaultCustomShape(BlocksRegistry.DEEPSLATE_TILES_FINIAL, "template_finial", Blocks.DEEPSLATE_TILES);
        generateHorizontalCustomShape(BlocksRegistry.DEEPSLATE_TILES_PEDESTAL, "template_pedestal", Blocks.DEEPSLATE_TILES);
        generateLayerCustomShape(BlocksRegistry.DEEPSLATE_TILES_LAYER.get(), Blocks.DEEPSLATE_TILES);
        generateHorizontalCustomShape(BlocksRegistry.DEEPSLATE_TILES_ARROWSLIT, "template_arrowslit", Blocks.DEEPSLATE_TILES);
        generateHorizontalCustomShape(BlocksRegistry.DEEPSLATE_TILES_CROSS_ARROWSLIT, "template_cross_arrowslit", Blocks.DEEPSLATE_TILES);

        generateDefaultCustomShape(BlocksRegistry.DEEPSLATE_BRICKS_FINIAL, "template_finial", Blocks.DEEPSLATE_BRICKS);
        generateHorizontalCustomShape(BlocksRegistry.DEEPSLATE_BRICKS_PEDESTAL, "template_pedestal", Blocks.DEEPSLATE_BRICKS);
        generateLayerCustomShape(BlocksRegistry.DEEPSLATE_BRICKS_LAYER.get(), Blocks.DEEPSLATE_BRICKS);
        generateHorizontalCustomShape(BlocksRegistry.DEEPSLATE_BRICKS_ARROWSLIT, "template_arrowslit", Blocks.DEEPSLATE_BRICKS);
        generateHorizontalCustomShape(BlocksRegistry.DEEPSLATE_BRICKS_CROSS_ARROWSLIT, "template_cross_arrowslit", Blocks.DEEPSLATE_BRICKS);
    }

    private void generateComplexPediment(RegistryObject<Block> blockRegistryObject, String templatePath, String templateName, ResourceLocation tex, ResourceLocation frame, ResourceLocation volute)
    {

        Block block = blockRegistryObject.get();
        MultiPartBlockStateBuilder builder = getMultipartBuilder(block);

        Direction[] facings = { Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST };
        Boolean[] bools = { false, true };
        String blockName = blockRegistryObject.getId().getPath();

        for (Direction facing : facings) {
            int rotationY = ((int) facing.get2DDataValue() * 90 + 180) % 360;

            for (boolean left : bools) {
                for (boolean right : bools) {
                    String connection = getConnectionName(left, right);

                    String baseTemplate = templatePath + "template_window_" + templateName + "_";

                    // Теперь у ВСЕХ моделей пути генерируются строго симметрично
                    var pedimentModel = createLayerModel(blockName + "_pediment_" + connection, baseTemplate + "pediment_" + connection, tex, frame, volute);
                    var frameModel    = createLayerModel(blockName + "_frame_" + connection,    baseTemplate + "frame_" + connection,    tex, frame, volute);
                    var bracketsModel = connection.equals("both") ? null : createLayerModel(blockName + "_brackets_" + connection, baseTemplate + "brackets_" + connection, tex, frame, volute);
                    var supportModel  = createLayerModel(blockName + "_support_" + connection,   baseTemplate + "support_" + connection,  tex, frame, volute);
                    var dentilsModel  = createLayerModel(blockName + "_dentils_" + connection,   baseTemplate + "dentils_" + connection,  tex, frame, volute);

                    // ==================== [ КОСТЫЛЬ ДЛЯ TYPE0 ] ====================
                    createLayerModel(blockName + "_type0_" + connection, baseTemplate + "pediment_" + connection, tex, frame, volute);
                    // ===============================================================
                    // ТЕПЕРЬ ДЛЯ КАЖДОГО СУЩЕСТВУЮЩЕГО ТИПА МЫ ЯВНО ПРОПИСЫВАЕМ ПЕДИМЕНТ
                    // Это закроет wildcard-проблему, из-за которой лезет type0!
                    for (BlockWindowPedimentComplex.Type typeVal : BlockWindowPedimentComplex.Type.values()) {

                        // 1. Базовый педимент должен быть при ВСЕХ типах
                        builder.part().modelFile(pedimentModel).rotationY(rotationY).addModel()
                                .condition(BlockStateProperties.HORIZONTAL_FACING, facing)
                                .condition(BlockWindowPedimentComplex.CONNECTED_LEFT, left)
                                .condition(BlockWindowPedimentComplex.CONNECTED_RIGHT, right)
                                .condition(BlockWindowPedimentComplex.TYPE, typeVal); // ЯВНО УКАЗАЛИ
                    }

                    // 2. Слой фрейма (Только при Type.NONE)
                    builder.part().modelFile(frameModel).rotationY(rotationY).addModel()
                            .condition(BlockStateProperties.HORIZONTAL_FACING, facing)
                            .condition(BlockWindowPedimentComplex.CONNECTED_LEFT, left)
                            .condition(BlockWindowPedimentComplex.CONNECTED_RIGHT, right)
                            .condition(BlockWindowPedimentComplex.FRAME, BlockWindowPedimentComplex.Frame.FRAMED);
                    // 3. Слой кронштейнов (Только при Type.BRACKETS)
                    if (bracketsModel != null) {
                        builder.part().modelFile(bracketsModel).rotationY(rotationY).addModel()
                                .condition(BlockStateProperties.HORIZONTAL_FACING, facing)
                                .condition(BlockWindowPedimentComplex.TYPE, BlockWindowPedimentComplex.Type.BRACKETS)
                                .condition(BlockWindowPedimentComplex.CONNECTED_LEFT, left)
                                .condition(BlockWindowPedimentComplex.CONNECTED_RIGHT, right);
                    }

                    // 4. Слой опоры (Только при Type.SUPPORT)
                    builder.part().modelFile(supportModel).rotationY(rotationY).addModel()
                            .condition(BlockStateProperties.HORIZONTAL_FACING, facing)
                            .condition(BlockWindowPedimentComplex.TYPE, BlockWindowPedimentComplex.Type.SUPPORT)
                            .condition(BlockWindowPedimentComplex.CONNECTED_LEFT, left)
                            .condition(BlockWindowPedimentComplex.CONNECTED_RIGHT, right);

                    // 5. Слой дентикул (Независим от типа, но зависит от DENTILS)
                    builder.part().modelFile(dentilsModel).rotationY(rotationY).addModel()
                            .condition(BlockStateProperties.HORIZONTAL_FACING, facing)
                            .condition(BlockWindowPedimentComplex.DENTILS, true)
                            .condition(BlockWindowPedimentComplex.CONNECTED_LEFT, left)
                            .condition(BlockWindowPedimentComplex.CONNECTED_RIGHT, right);
                }
            }
        }
    }

        // Вспомогательный метод определения суффикса модели на основе коннектов
        private String getConnectionName(boolean left, boolean right)
        {
            if (left && right) return "both";
            if (left) return "left";
            if (right) return "right";
            return "single";
        }

    private BlockModelBuilder createLayerModel(String newModelName, String templatePath, ResourceLocation tex, ResourceLocation frame, ResourceLocation volute)
    {
        return models().withExistingParent(newModelName, modLoc(templatePath))
                .texture("texture", tex)
                .texture("frame", frame)
                .texture("volute", volute);
    }





    //Вращающийся блок по горизонтали но с заданным путём текстуры. Четыре текстуры
    private void generateHorizontalCustomShape(RegistryObject<Block> block, String templateName, ResourceLocation tex, ResourceLocation ionic, ResourceLocation volute, ResourceLocation corinthian)
    {
        //Создание модели
        var model = models().withExistingParent(block.getId().getPath(),
                        new ResourceLocation(MusicinStone.MODID, "block/" + templateName))
                .texture("texture", tex)
                .texture("ionic", ionic)
                .texture("volute", volute)
                .texture("corinthian", corinthian);

        //Применение вращения
        horizontalBlock(block.get(), model);
    }

    //Вращающийся блок по горизонтали но с заданным путём текстуры. Три текстуры
    private void generateHorizontalCustomShape(RegistryObject<Block> block, String templateName, ResourceLocation tex, ResourceLocation ionic, ResourceLocation volute)
    {
        //Создание модели
        var model = models().withExistingParent(block.getId().getPath(),
                        new ResourceLocation(MusicinStone.MODID, "block/" + templateName))
                .texture("texture", tex)
                .texture("ionic", ionic)
                .texture("volute", volute);

        //Применение вращения
        horizontalBlock(block.get(), model);
    }

    private void generateSplitFacingBlock(RegistryObject<Block> block, String templateLeft, String templateRight,
                                          ResourceLocation tex, ResourceLocation ionic, ResourceLocation volute)
    {

        //Используем шаблон и создаём файл модели с трёмя текстурами
        ModelFile modelLeft = models().withExistingParent(block.getId().getPath() + "_left", modLoc("block/" + templateLeft))
                .texture("texture", tex)
                .texture("ionic", ionic)
                .texture("volute", volute);

        ModelFile modelRight = models().withExistingParent(block.getId().getPath() + "_right", modLoc("block/" + templateRight))
                .texture("texture", tex)
                .texture("ionic", ionic)
                .texture("volute", volute);

        //Создаём варианты блока
        VariantBlockStateBuilder builder = getVariantBuilder(block.get());

        for (Direction dir : BlockStateProperties.HORIZONTAL_FACING.getPossibleValues())
        {
            int rotationY = (int) dir.toYRot();

            //Левая сторона
            builder.partialState()
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .with(BlockIonicCapitalGiant.SIDE, BlockIonicCapitalGiant.ModBlockProperties.SideHalf.LEFT) // Replace with your actual property name
                    .setModels(new ConfiguredModel(modelLeft, 0, rotationY, false));

            //Правая сторона
            builder.partialState()
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .with(BlockIonicCapitalGiant.SIDE, BlockIonicCapitalGiant.ModBlockProperties.SideHalf.RIGHT) // Replace with your actual property name
                    .setModels(new ConfiguredModel(modelRight, 0, rotationY, false));
        }
    }

    //Создаёт обычный блок с заданной текстурой
    private void generateDefaultShape(RegistryObject<Block> block)
    {
        ModelFile model = cubeAll(block.get());

        simpleBlock(block.get(), model);
    }

    //Или полублок, или ступеньки, или стена
    private void generateSingleBlockVariant(Block baseBlock, Block variantBlock)
    {
        ResourceLocation texture = blockTexture(baseBlock);

        if (variantBlock instanceof SlabBlock)
        {
            slabBlock((SlabBlock) variantBlock, texture, texture);
        }
        else if (variantBlock instanceof StairBlock)
        {
            stairsBlock((StairBlock) variantBlock, texture);
        }
        else if (variantBlock instanceof WallBlock)
        {
            wallBlock((WallBlock) variantBlock, texture);
        }
    }
    //Сразу несколько блоков из исходного - полублок, ступеньки и стена
    private void generateBlockVariants(Block baseBlock, RegistryObject<SlabBlock> slab, RegistryObject<StairBlock> stairs, RegistryObject<WallBlock> wall)
    {
        ResourceLocation tex = blockTexture(baseBlock);

        slabBlock(slab.get(), tex, tex);
        stairsBlock(stairs.get(), tex);
        wallBlock(wall.get(), tex);
    }
    //Создаёт блок по шаблону, беря текстуру у другого блока
    private void generateDefaultCustomShape(RegistryObject<Block> block, String templateName, Block textureSource)
    {
        ResourceLocation tex = blockTexture(textureSource);

        simpleBlock(block.get(), models().withExistingParent(block.getId().getPath(),
                        new ResourceLocation(MusicinStone.MODID, "block/" + templateName))
                .texture("texture", tex)); // "texture" must match the key inside your template JSON
    }

    //Создаёт кастомный блок с заданной текстурой, но стандартным хитбоксом
    private void generateDefaultCustomShape(RegistryObject<Block> block, String templateName, ResourceLocation manualTexture)
    {

        simpleBlock(block.get(), models().withExistingParent(block.getId().getPath(),
                        new ResourceLocation(MusicinStone.MODID, "block/" + templateName))
                .texture("texture", manualTexture));
    }
    //Капитель колонны с трёмя текстурами, но без поворота
    private void generateFixedIonicShape(RegistryObject<Block> block, String templateName,
                                          ResourceLocation tex, ResourceLocation ionic, ResourceLocation volute)
    {

        //Создание модели
        var model = models().withExistingParent(block.getId().getPath(), modLoc("block/" + templateName))
                .texture("texture", tex)
                .texture("ionic", ionic)
                .texture("volute", volute);

        simpleBlock(block.get(), model);
    }

    //Капитель колонны с четырьмя текстурами, но без поворота
    private void generateDefaultCompositeShape(RegistryObject<Block> block, String templateName,
                                                ResourceLocation tex, ResourceLocation ionic, ResourceLocation corinthian, ResourceLocation volute)
    {

        //Создание модели
        var model = models().withExistingParent(block.getId().getPath(), modLoc("block/" + templateName))
                .texture("texture", tex)
                .texture("ionic", ionic)
                .texture("corinthian", corinthian)
                .texture("volute", volute);

        simpleBlock(block.get(), model);

    }

    //Капитель колонны с трёмя текстурами, но без поворота
    private void generateDefaultCorinthianShape(RegistryObject<Block> block, String templateName,
                                           ResourceLocation tex, ResourceLocation corinthian, ResourceLocation volute)
    {

        //Создание модели
        var model = models().withExistingParent(block.getId().getPath(), modLoc("block/" + templateName))
                .texture("texture", tex)
                .texture("corinthian", corinthian)
                .texture("volute", volute);

        simpleBlock(block.get(), model);
    }

    //Вращающийся блок по горизонтали
    private void generateHorizontalCustomShape(RegistryObject<Block> block, String templateName, Block textureSource)
    {
        ResourceLocation tex = blockTexture(textureSource);

        //Создание модели
        var model = models().withExistingParent(block.getId().getPath(),
                        new ResourceLocation(MusicinStone.MODID, "block/" + templateName))
                .texture("texture", tex);

        //Применение вращения
        horizontalBlock(block.get(), model);
    }

    //Вращающийся блок по горизонтали но с заданным путём текстуры
    private void generateHorizontalCustomShape(RegistryObject<Block> block, String templateName, ResourceLocation tex)
    {
        //Создание модели
        var model = models().withExistingParent(block.getId().getPath(),
                        new ResourceLocation(MusicinStone.MODID, "block/" + templateName))
                .texture("texture", tex);

        //Применение вращения
        horizontalBlock(block.get(), model);
    }

    //Вращающийся блок по горизонтали но с заданным путём текстуры и отражением на 180
    private void generateHorizontalHalfColumnCustomShape(RegistryObject<Block> block, String templateName, ResourceLocation tex)
    {
        // Создание модели
        var model = models().withExistingParent(block.getId().getPath(),
                        new ResourceLocation(MusicinStone.MODID, "block/half_column/" + templateName))
                .texture("texture", tex);


        getVariantBuilder(block.get()).forAllStates(state ->
        {
            Direction dir = state.getValue(BlockStateProperties.HORIZONTAL_FACING);

            int rotationY = (int) (dir.toYRot()) % 360;

            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationY(rotationY)
                    .build();
        });
    }

    //Вращающийся блок по горизонтали но с заданными трёмя текстурами ы и отражением на 180
    private void generateHorizontalHalfColumnCustomShape(RegistryObject<Block> block, String templateName, ResourceLocation tex, ResourceLocation ionic, ResourceLocation volute)
    {
        // Создание модели
        var model = models().withExistingParent(block.getId().getPath(),
                        new ResourceLocation(MusicinStone.MODID, "block/half_column/" + templateName))
                .texture("texture", tex)
                .texture("ionic", ionic)
                .texture("volute", volute);


        getVariantBuilder(block.get()).forAllStates(state ->
        {
            Direction dir = state.getValue(BlockStateProperties.HORIZONTAL_FACING);

            int rotationY = (int) (dir.toYRot()) % 360;

            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationY(rotationY)
                    .build();
        });
    }

    //Вращающийся блок по горизонтали но с заданными трёмя текстурами ы и отражением на 180
    private void generateHorizontalHalfCorinthianColumnCustomShape(RegistryObject<Block> block, String templateName, ResourceLocation tex, ResourceLocation corinthian, ResourceLocation volute)
    {
        // Создание модели
        var model = models().withExistingParent(block.getId().getPath(),
                        new ResourceLocation(MusicinStone.MODID, "block/half_column/" + templateName))
                .texture("texture", tex)
                .texture("corinthian", corinthian)
                .texture("volute", volute);


        getVariantBuilder(block.get()).forAllStates(state ->
        {
            Direction dir = state.getValue(BlockStateProperties.HORIZONTAL_FACING);

            int rotationY = (int) (dir.toYRot()) % 360;

            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationY(rotationY)
                    .build();
        });
    }

    //Вращающийся блок по горизонтали но с заданными четырьмя текстурами и отражением на 180
    private void generateHorizontalHalfColumnCustomShape(RegistryObject<Block> block, String templateName, ResourceLocation tex, ResourceLocation ionic, ResourceLocation volute, ResourceLocation corinthian)
    {
        // Создание модели
        var model = models().withExistingParent(block.getId().getPath(),
                        new ResourceLocation(MusicinStone.MODID, "block/half_column/" + templateName))
                .texture("texture", tex)
                .texture("ionic", ionic)
                .texture("volute", volute)
                .texture("corinthian", corinthian);


        getVariantBuilder(block.get()).forAllStates(state ->
        {
            Direction dir = state.getValue(BlockStateProperties.HORIZONTAL_FACING);

            int rotationY = (int) (dir.toYRot()) % 360;

            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationY(rotationY)
                    .build();
        });
    }

    //Берёт с уже существующих блоков текстуры
    private void generateIonic90CustomShape(RegistryObject<Block> block, String templateName, Block base)
    {
        String path = ForgeRegistries.BLOCKS.getKey(base).getPath();
        generateIonic90CustomShape(block, templateName,
                mcLoc("block/" + path),                       // main texture
                modLoc("block/" + path + "_ionic"),           // ionic texture
                modLoc("block/" + path + "_volute")           // volute texture
        );
    }

    //Ручками задаёшь текстуры
    private void generateIonic90CustomShape(RegistryObject<Block> block, String templateName,
                                          ResourceLocation tex, ResourceLocation ionic, ResourceLocation volute)
    {

        //Создание модели
        var model = models().withExistingParent(block.getId().getPath(), modLoc("block/" + templateName))
                .texture("texture", tex)
                .texture("ionic", ionic)
                .texture("volute", volute);

        //Вращение по 90 градусов
        getVariantBuilder(block.get()).forAllStates(state ->
        {
            Direction dir = state.getValue(BlockIonicCapitalSmall.FACING);

            //Север и Юг = 0, Восток и Запад = 90
            int rotationY = (dir == Direction.NORTH || dir == Direction.SOUTH) ? 0 : 90;

            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationY(rotationY)
                    .build();
        });
    }

    //Создание блока, вращающего на все четыре стороны
    private void generateCornerIonicCustomShape(RegistryObject<Block> block, String templateName,
                                          ResourceLocation tex, ResourceLocation ionic, ResourceLocation volute) {

        var model = models().withExistingParent(block.getId().getPath(), modLoc("block/" + templateName))
                .texture("texture", tex)
                .texture("ionic", ionic)
                .texture("volute", volute);

        getVariantBuilder(block.get()).forAllStates(state ->
        {
            Direction dir = state.getValue(BlockIonicCapitalSmall.FACING);

            // North=0, East=90, South=180, West=270
            int rotationY = (int) dir.toYRot();

            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationY(rotationY)
                    .build();
        });
    }

    //Создание слоистого блока
    private void generateLayerCustomShape(Block layeredBlock, Block textureSource)
    {
        ResourceLocation tex = blockTexture(textureSource);
        String name = ForgeRegistries.BLOCKS.getKey(layeredBlock).getPath();

        this.getVariantBuilder(layeredBlock).forAllStates(state ->
        {
            int layers = state.getValue(SnowLayerBlock.LAYERS);

            // If it's a full block, use cubeAll
            if (layers == 8) {
                return ConfiguredModel.builder()
                        .modelFile(models().cubeAll(name + "_all", tex))
                        .build();
            }

            // For layers 1-7, we define the height manually (each layer is 2 units high)
            // This replaces the need for the "minecraft:block/snow_layer" parent
            var model = models().withExistingParent(name + "_height" + layers, "block/thin_block")
                    .element()
                    .from(0, 0, 0)
                    .to(16, layers * 2, 16) // Height is layers * 2
                    .allFaces((direction, faceBuilder) -> faceBuilder.texture("#all").cullface(direction))
                    .end()
                    .texture("all", tex)
                    .texture("particle", tex);

            return ConfiguredModel.builder().modelFile(model).build();
        });
    }

    private void generateColumn(RegistryObject<Block> block, String templateName,
                                      ResourceLocation sideTex, ResourceLocation topTex)
    {

        //Создаём четыре модели
        //Назначаем на определённое состояние определённый шаблон
        ModelFile modelNone = models().withExistingParent(block.getId().getPath(),
                        modLoc("block/" + templateName))
                .texture("side", sideTex).texture("top", topTex);

        ModelFile modelBottom = models().withExistingParent(block.getId().getPath() + "_bottom",
                        modLoc("block/" + templateName + "_bottom"))
                .texture("side", sideTex).texture("top", topTex);

        ModelFile modelTop = models().withExistingParent(block.getId().getPath() + "_top",
                        modLoc("block/" + templateName + "_top"))
                .texture("side", sideTex).texture("top", topTex);

        ModelFile modelBoth = models().withExistingParent(block.getId().getPath() + "_both",
                        modLoc("block/" + templateName + "_both"))
                .texture("side", sideTex).texture("top", topTex);

        //Назначаем варианты на каждый boolean "up" и "down"
        getVariantBuilder(block.get())
                .partialState().with(BlockColumnSmall.CONNECTED_UP, false).with(BlockColumnSmall.CONNECTED_DOWN, false).setModels(new ConfiguredModel(modelNone))
                .partialState().with(BlockColumnSmall.CONNECTED_UP, false).with(BlockColumnSmall.CONNECTED_DOWN, true).setModels(new ConfiguredModel(modelBottom))
                .partialState().with(BlockColumnSmall.CONNECTED_UP, true).with(BlockColumnSmall.CONNECTED_DOWN, false).setModels(new ConfiguredModel(modelTop))
                .partialState().with(BlockColumnSmall.CONNECTED_UP, true).with(BlockColumnSmall.CONNECTED_DOWN, true).setModels(new ConfiguredModel(modelBoth));

    }


    public void generateWindowFrame(RegistryObject<Block> block, String templateName, ResourceLocation front, ResourceLocation side)
    {

        ModelFile modelLeft = models().withExistingParent(block.getId().getPath() + "_left", modLoc("block/" + templateName + "_left"))
                .texture("1", side)
                .texture("2", front);

        ModelFile modelMiddle = models().withExistingParent(block.getId().getPath() + "_middle", modLoc("block/" + templateName + "_middle"))
                .texture("1", side)
                .texture("2", front);

        ModelFile modelRight = models().withExistingParent(block.getId().getPath() + "_right", modLoc("block/" + templateName + "_right"))
                .texture("1", side)
                .texture("2", front);

        getVariantBuilder(block.get()).forAllStates(state -> {
            Direction facing = state.getValue(BlockWindowFrame.FACING);
            BlockWindowFrame.ClickZone zone = state.getValue(BlockWindowFrame.ZONE);

            ModelFile chosenModel = switch (zone)
            {
                case LEFT -> modelLeft;
                case MIDDLE -> modelMiddle;
                case RIGHT -> modelRight;
            };

            int rotationY = switch (facing)
            {
                case SOUTH -> 180;
                case WEST -> 270;
                case EAST -> 90;
                default -> 0; // NORTH
            };

            return ConfiguredModel.builder()
                    .modelFile(chosenModel)
                    .rotationY(rotationY)
                    .build();
        });
    }



    private void generateWindowPediment(RegistryObject<Block> block, String templateName, ResourceLocation front, ResourceLocation side)
    {

            // Генерируем базовые модели для TYPE = 0 (Normal) и сразу биндим к ним текстуры "1" и "2"
            ModelFile normalSingle = models().withExistingParent(block.getId().getPath() + "_type0_single", modLoc("block/" + templateName + "_type0_single"))
                    .texture("1", side)
                    .texture("2", front);

            ModelFile normalLeft   = models().withExistingParent(block.getId().getPath() + "_type0_left",   modLoc("block/" + templateName + "_type0_left"))
                    .texture("1", side)
                    .texture("2", front);

            ModelFile normalRight  = models().withExistingParent(block.getId().getPath() + "_type0_right",  modLoc("block/" + templateName + "_type0_right"))
                    .texture("1", side)
                    .texture("2", front);

            ModelFile normalFull   = models().withExistingParent(block.getId().getPath() + "_type0_both",   modLoc("block/" + templateName + "_type0_both"))
                    .texture("1", side)
                    .texture("2", front);

            // Генерируем базовые модели для TYPE = 1 (Alternative) и биндим те же (или другие) текстуры
            ModelFile altSingle = models().withExistingParent(block.getId().getPath() + "_type1_single", modLoc("block/" + templateName + "_type1_single"))
                    .texture("1", side)
                    .texture("2", front);

            ModelFile altLeft   = models().withExistingParent(block.getId().getPath() + "_type1_left",   modLoc("block/" + templateName + "_type1_left"))
                    .texture("1", side)
                    .texture("2", front);

            ModelFile altRight  = models().withExistingParent(block.getId().getPath() + "_type1_right",  modLoc("block/" + templateName + "_type1_right"))
                    .texture("1", side)
                    .texture("2", front);

            ModelFile altFull   = models().withExistingParent(block.getId().getPath() + "_type1_both",   modLoc("block/" + templateName + "_type1_both"))
                    .texture("1", side)
                    .texture("2", front);

            // Строим все 32 комбинации состояний
            getVariantBuilder(block.get()).forAllStates(state ->
            {
                Direction facing = state.getValue(BlockWindowPediment.FACING);
                boolean left = state.getValue(BlockWindowPediment.CONNECTED_LEFT);
                boolean right = state.getValue(BlockWindowPediment.CONNECTED_RIGHT);
                BlockWindowPediment.Frame type = state.getValue(BlockWindowPediment.FRAME);

                // Выбираем уже текстурированную модель
                ModelFile chosenModel;
                if (type == BlockWindowPediment.Frame.FRAMELESS)
                {
                    if (left && right) chosenModel = normalFull;
                    else if (left)      chosenModel = normalLeft;
                    else if (right)     chosenModel = normalRight;
                    else                chosenModel = normalSingle;
                } else
                {
                    if (left && right) chosenModel = altFull;
                    else if (left)      chosenModel = altLeft;
                    else if (right)     chosenModel = altRight;
                    else                chosenModel = altSingle;
                }

                // Рассчитываем вращение
                int rotationY = switch (facing)
                {
                    case SOUTH -> 180;
                    case WEST -> 270;
                    case EAST -> 90;
                    default -> 0; // NORTH
                };

                return ConfiguredModel.builder()
                        .modelFile(chosenModel)
                        .rotationY(rotationY)
                        .build();
            });
        }


    private void generateRotatingColumn(RegistryObject<Block> block, String templateName,
                ResourceLocation sideTex, ResourceLocation topTex)
    {
        ModelFile modelNone = models().withExistingParent(block.getId().getPath(),
                            modLoc("block/" + templateName))
                    .texture("side", sideTex).texture("top", topTex);

        ModelFile modelBottom = models().withExistingParent(block.getId().getPath() + "_bottom",
                            modLoc("block/" + templateName + "_bottom"))
                    .texture("side", sideTex).texture("top", topTex);

        ModelFile modelTop = models().withExistingParent(block.getId().getPath() + "_top",
                            modLoc("block/" + templateName + "_top"))
                    .texture("side", sideTex).texture("top", topTex);

        ModelFile modelBoth = models().withExistingParent(block.getId().getPath() + "_both",
                            modLoc("block/" + templateName + "_both"))
                    .texture("side", sideTex).texture("top", topTex);

        VariantBlockStateBuilder builder = getVariantBuilder(block.get());

        for (Direction dir : BlockStateProperties.HORIZONTAL_FACING.getPossibleValues())
        {
            int rotationY = (int) dir.toYRot();


            builder.partialState()
                    .with(BlockColumnSmall.CONNECTED_UP, false)
                    .with(BlockColumnSmall.CONNECTED_DOWN, false)
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .setModels(new ConfiguredModel(modelNone, 0, rotationY, false));


            builder.partialState()
                    .with(BlockColumnSmall.CONNECTED_UP, false)
                    .with(BlockColumnSmall.CONNECTED_DOWN, true)
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .setModels(new ConfiguredModel(modelBottom, 0, rotationY, false));


            builder.partialState()
                    .with(BlockColumnSmall.CONNECTED_UP, true)
                    .with(BlockColumnSmall.CONNECTED_DOWN, false)
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .setModels(new ConfiguredModel(modelTop, 0, rotationY, false));


            builder.partialState()
                    .with(BlockColumnSmall.CONNECTED_UP, true)
                    .with(BlockColumnSmall.CONNECTED_DOWN, true)
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .setModels(new ConfiguredModel(modelBoth, 0, rotationY, false));
        }
    }

    private void generateRotatingPilaster(RegistryObject<Block> block, String templateName,
                                        ResourceLocation sideTex, ResourceLocation topTex)
    {
        ModelFile modelNone = models().withExistingParent(block.getId().getPath(),
                        modLoc("block/pilaster/" + templateName))
                .texture("side", sideTex).texture("top", topTex);

        ModelFile modelBottom = models().withExistingParent(block.getId().getPath() + "_bottom",
                        modLoc("block/pilaster/" + templateName + "_bottom"))
                .texture("side", sideTex).texture("top", topTex);

        ModelFile modelTop = models().withExistingParent(block.getId().getPath() + "_top",
                        modLoc("block/pilaster/" + templateName + "_top"))
                .texture("side", sideTex).texture("top", topTex);

        ModelFile modelBoth = models().withExistingParent(block.getId().getPath() + "_both",
                        modLoc("block/pilaster/" + templateName + "_both"))
                .texture("side", sideTex).texture("top", topTex);

        VariantBlockStateBuilder builder = getVariantBuilder(block.get());

        for (Direction dir : BlockStateProperties.HORIZONTAL_FACING.getPossibleValues())
        {
            int rotationY = (int) dir.toYRot();


            builder.partialState()
                    .with(BlockColumnSmall.CONNECTED_UP, false)
                    .with(BlockColumnSmall.CONNECTED_DOWN, false)
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .setModels(new ConfiguredModel(modelNone, 0, rotationY, false));


            builder.partialState()
                    .with(BlockColumnSmall.CONNECTED_UP, false)
                    .with(BlockColumnSmall.CONNECTED_DOWN, true)
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .setModels(new ConfiguredModel(modelBottom, 0, rotationY, false));


            builder.partialState()
                    .with(BlockColumnSmall.CONNECTED_UP, true)
                    .with(BlockColumnSmall.CONNECTED_DOWN, false)
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .setModels(new ConfiguredModel(modelTop, 0, rotationY, false));


            builder.partialState()
                    .with(BlockColumnSmall.CONNECTED_UP, true)
                    .with(BlockColumnSmall.CONNECTED_DOWN, true)
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .setModels(new ConfiguredModel(modelBoth, 0, rotationY, false));
        }
    }

    private void generateRotatingHalfColumn(RegistryObject<Block> block, String templateName,
                                          ResourceLocation sideTex, ResourceLocation topTex)
    {
        ModelFile modelNone = models().withExistingParent(block.getId().getPath(),
                        modLoc("block/half_column/" + templateName))
                .texture("side", sideTex).texture("top", topTex);

        ModelFile modelBottom = models().withExistingParent(block.getId().getPath() + "_bottom",
                        modLoc("block/half_column/" + templateName + "_bottom"))
                .texture("side", sideTex).texture("top", topTex);

        ModelFile modelTop = models().withExistingParent(block.getId().getPath() + "_top",
                        modLoc("block/half_column/" + templateName + "_top"))
                .texture("side", sideTex).texture("top", topTex);

        ModelFile modelBoth = models().withExistingParent(block.getId().getPath() + "_both",
                        modLoc("block/half_column/" + templateName + "_both"))
                .texture("side", sideTex).texture("top", topTex);

        VariantBlockStateBuilder builder = getVariantBuilder(block.get());

        for (Direction dir : BlockStateProperties.HORIZONTAL_FACING.getPossibleValues())
        {
            int rotationY = (int) dir.toYRot();


            builder.partialState()
                    .with(BlockColumnSmall.CONNECTED_UP, false)
                    .with(BlockColumnSmall.CONNECTED_DOWN, false)
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .setModels(new ConfiguredModel(modelNone, 0, rotationY, false));


            builder.partialState()
                    .with(BlockColumnSmall.CONNECTED_UP, false)
                    .with(BlockColumnSmall.CONNECTED_DOWN, true)
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .setModels(new ConfiguredModel(modelBottom, 0, rotationY, false));


            builder.partialState()
                    .with(BlockColumnSmall.CONNECTED_UP, true)
                    .with(BlockColumnSmall.CONNECTED_DOWN, false)
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .setModels(new ConfiguredModel(modelTop, 0, rotationY, false));


            builder.partialState()
                    .with(BlockColumnSmall.CONNECTED_UP, true)
                    .with(BlockColumnSmall.CONNECTED_DOWN, true)
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .setModels(new ConfiguredModel(modelBoth, 0, rotationY, false));
        }
    }
}