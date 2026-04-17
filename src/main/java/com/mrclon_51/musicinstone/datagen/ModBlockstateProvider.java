package com.mrclon_51.musicinstone.datagen;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.BlocksRegistry;
import com.mrclon_51.musicinstone.block.BlockIonicCapitalGiant;
import com.mrclon_51.musicinstone.block.BlockIonicCapitalSmall;
import com.mrclon_51.musicinstone.block.BlockColumnSmall;
import com.mrclon_51.musicinstone.block.ModBlockProperties;
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

        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_IONIC_BASE_SMALL, "template_ionic_base_small", mcLoc("block/sandstone_top"));
        generateColumn(BlocksRegistry.SANDSTONE_FLUTED_COLUMN_SMALL, "template_column_small", modLoc("block/sandstone_pillar"), modLoc("block/sandstone_pillar_top"));
        generateIonicCustomShape(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_SMALL, "template_ionic_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));

        generateDefaultCustomShape(BlocksRegistry.QUARTZ_DORIC_CAPITAL_SMALL, "template_doric_capital_small", mcLoc("block/quartz_block_bottom"));

        generateColumn(BlocksRegistry.QUARTZ_FLUTED_COLUMN_MEDIUM, "template_column_medium", mcLoc("block/quartz_pillar"), mcLoc("block/quartz_pillar_top"));
        generateColumn(BlocksRegistry.QUARTZ_FLUTED_COLUMN_LARGE, "template_column_large", mcLoc("block/quartz_pillar"), mcLoc("block/quartz_block_bottom"));
        generateRotatingColumn(BlocksRegistry.QUARTZ_FLUTED_COLUMN_GIANT, "template_column_giant", mcLoc("block/quartz_pillar"), mcLoc("block/quartz_block_bottom"));

        generateDefaultCustomShape(BlocksRegistry.QUARTZ_IONIC_BASE_MEDIUM, "template_ionic_base_medium", mcLoc("block/quartz_block_bottom"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_IONIC_BASE_MEDIUM, "template_ionic_base_medium", mcLoc("block/sandstone_top"));

        generateIonicCustomShape(BlocksRegistry.QUARTZ_IONIC_CAPITAL_MEDIUM, "template_ionic_capital_medium", mcLoc("block/quartz_block_bottom"), modLoc("block/quartz_ionic"), modLoc("block/quartz_volute"));
        generateIonicCustomShape(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_MEDIUM, "template_ionic_capital_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));

        generateColumn(BlocksRegistry.SANDSTONE_FLUTED_COLUMN_MEDIUM, "template_column_medium", modLoc("block/sandstone_pillar"), modLoc("block/sandstone_pillar_top"));
        generateColumn(BlocksRegistry.SANDSTONE_FLUTED_COLUMN_LARGE, "template_column_large", modLoc("block/sandstone_pillar"), mcLoc("block/sandstone_top"));
        generateRotatingColumn(BlocksRegistry.SANDSTONE_FLUTED_COLUMN_GIANT, "template_column_giant", modLoc("block/sandstone_pillar"), mcLoc("block/sandstone_top"));

        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_DORIC_CAPITAL_SMALL, "template_doric_capital_small", mcLoc("block/sandstone_top"));

        generateDefaultCustomShape(BlocksRegistry.QUARTZ_IONIC_BASE_LARGE, "template_ionic_base_large", mcLoc("block/quartz_block_bottom"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_IONIC_BASE_LARGE, "template_ionic_base_large", mcLoc("block/sandstone_top"));

        generateIonicCustomShape(BlocksRegistry.QUARTZ_IONIC_CAPITAL_LARGE, "template_ionic_capital_large", mcLoc("block/quartz_block_bottom"), modLoc("block/quartz_ionic"), modLoc("block/quartz_volute"));
        generateIonicCustomShape(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_LARGE, "template_ionic_capital_large", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));

        generateCornerIonicCustomShape(BlocksRegistry.QUARTZ_CORNER_IONIC_CAPITAL_SMALL, "template_corner_ionic_capital_small", mcLoc("block/quartz_block_bottom"), modLoc("block/quartz_ionic"), modLoc("block/quartz_volute"));
        generateCornerIonicCustomShape(BlocksRegistry.SANDSTONE_CORNER_IONIC_CAPITAL_SMALL, "template_corner_ionic_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));

        generateDefaultIonicShape(BlocksRegistry.QUARTZ_ROMAN_IONIC_CAPITAL_SMALL, "template_roman_ionic_capital_small", mcLoc("block/quartz_block_bottom"), modLoc("block/quartz_ionic"), modLoc("block/quartz_volute"));
        generateDefaultIonicShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_CAPITAL_SMALL, "template_roman_ionic_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateDefaultIonicShape(BlocksRegistry.QUARTZ_SCAMOZZI_IONIC_CAPITAL_SMALL, "template_scamozzi_ionic_capital_small", mcLoc("block/quartz_block_bottom"), modLoc("block/quartz_ionic"), modLoc("block/quartz_volute"));
        generateDefaultIonicShape(BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_CAPITAL_SMALL, "template_scamozzi_ionic_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));

        generateDefaultCorinthianShape(BlocksRegistry.QUARTZ_GREEK_CORINTHIAN_CAPITAL_SMALL, "template_greek_corinthian_capital_small", mcLoc("block/quartz_block_bottom"), modLoc("block/quartz_corinthian"), modLoc("block/quartz_volute"));
        generateDefaultCorinthianShape(BlocksRegistry.SANDSTONE_GREEK_CORINTHIAN_CAPITAL_SMALL, "template_greek_corinthian_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));

        generateDefaultCustomShape(BlocksRegistry.CLINKER_BRICK_FINIAL, "template_finial", BlocksRegistry.CLINKER_BRICKS.get());
        generateHorizontalCustomShape(BlocksRegistry.CLINKER_BRICK_PEDESTAL, "template_pedestal", BlocksRegistry.CLINKER_BRICKS.get());
        generateLayerCustomShape(BlocksRegistry.CLINKER_BRICK_LAYER.get(), BlocksRegistry.CLINKER_BRICKS.get());
        generateHorizontalCustomShape(BlocksRegistry.CLINKER_BRICK_ARROWSLIT, "template_arrowslit", BlocksRegistry.CLINKER_BRICKS.get());
        generateHorizontalCustomShape(BlocksRegistry.CLINKER_BRICK_CROSS_ARROWSLIT, "template_cross_arrowslit", BlocksRegistry.CLINKER_BRICKS.get());

        generateColumn(BlocksRegistry.GILDED_BLACKSTONE_COLUMN_SMALL, "template_column_small", mcLoc("block/gilded_blackstone"), mcLoc("block/blackstone"));

        generateDefaultCorinthianShape(BlocksRegistry.GOLD_GREEK_CORINTHIAN_CAPITAL_SMALL, "template_greek_corinthian_capital_small", modLoc("block/seamless_gold_block"), modLoc("block/gold_corinthian"), modLoc("block/gold_volute"));
        generateDefaultIonicShape(BlocksRegistry.GOLD_SCAMOZZI_IONIC_CAPITAL_SMALL, "template_scamozzi_ionic_capital_small", modLoc("block/seamless_gold_block"), modLoc("block/gold_ionic"), modLoc("block/gold_volute"));
        generateDefaultIonicShape(BlocksRegistry.GOLD_ROMAN_IONIC_CAPITAL_SMALL, "template_roman_ionic_capital_small", modLoc("block/seamless_gold_block"), modLoc("block/gold_ionic"), modLoc("block/gold_volute"));
        generateCornerIonicCustomShape(BlocksRegistry.GOLD_CORNER_IONIC_CAPITAL_SMALL, "template_corner_ionic_capital_small", modLoc("block/seamless_gold_block"), modLoc("block/gold_ionic"), modLoc("block/gold_volute"));
        generateDefaultCustomShape(BlocksRegistry.GOLD_IONIC_BASE_SMALL, "template_ionic_base_small", modLoc("block/seamless_gold_block"));
        generateIonicCustomShape(BlocksRegistry.GOLD_IONIC_CAPITAL_SMALL, "template_ionic_capital_small", modLoc("block/seamless_gold_block"), modLoc("block/gold_ionic"), modLoc("block/gold_volute"));

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

        generateSplitFacingBlock(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_GIANT, "template_ionic_capital_giant_left", "template_ionic_capital_giant_right", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_IONIC_BASE_GIANT, "template_ionic_base_giant", mcLoc("block/sandstone_top"));

        generateColumn(BlocksRegistry.SANDSTONE_COLUMN_SMALL, "template_column_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_pillar_top"));
        generateColumn(BlocksRegistry.SANDSTONE_COLUMN_MEDIUM, "template_column_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_pillar_top"));
        generateColumn(BlocksRegistry.SANDSTONE_COLUMN_LARGE, "template_column_large", mcLoc("block/sandstone_top"), mcLoc("block/sandstone_top"));
        generateRotatingColumn(BlocksRegistry.SANDSTONE_COLUMN_GIANT, "template_column_giant", mcLoc("block/sandstone_top"), mcLoc("block/sandstone_top"));

        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_SMALL, "template_roman_ionic_base_small", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_MEDIUM, "template_roman_ionic_base_medium", mcLoc("block/sandstone_top"));
        generateDefaultCustomShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_LARGE, "template_roman_ionic_base_large", mcLoc("block/sandstone_top"));
        generateHorizontalCustomShape(BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_GIANT, "template_roman_ionic_base_giant", mcLoc("block/sandstone_top"));

        generateDefaultCorinthianShape(BlocksRegistry.SANDSTONE_GREEK_CORINTHIAN_CAPITAL_MEDIUM, "template_greek_corinthian_capital_medium", mcLoc("block/sandstone_top"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));
        generateDefaultCorinthianShape(BlocksRegistry.SANDSTONE_GREEK_CORINTHIAN_CAPITAL_LARGE, "template_greek_corinthian_capital_large", mcLoc("block/sandstone_top"), modLoc("block/sandstone_corinthian"), modLoc("block/sandstone_volute"));



        generatePilasterCustomShape(BlocksRegistry.SANDSTONE_FLUTED_PILASTER_SMALL, "template_pilaster_small", modLoc("block/sandstone_pillar"), modLoc("block/sandstone_pillar_top"));

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
                    .with(BlockIonicCapitalGiant.SIDE, ModBlockProperties.SideHalf.LEFT) // Replace with your actual property name
                    .setModels(new ConfiguredModel(modelLeft, 0, rotationY, false));

            //Правая сторона
            builder.partialState()
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .with(BlockIonicCapitalGiant.SIDE, ModBlockProperties.SideHalf.RIGHT) // Replace with your actual property name
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
    //Сразу несколько блоков их исходного - полублок, ступеньки и стена
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
    private void generateDefaultIonicShape(RegistryObject<Block> block, String templateName,
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

    //Вращающийся блок по горизонтали но с двумя заданными текстурами
    private void generatePilasterCustomShape(RegistryObject<Block> block, String templateName, ResourceLocation side, ResourceLocation top)
    {
        //Создание модели
        var model = models().withExistingParent(block.getId().getPath(),
                        new ResourceLocation(MusicinStone.MODID, "block/" + templateName))
                .texture("texture", side)
                .texture("texture", top);

        //Применение вращения
        horizontalBlock(block.get(), model);
    }

    //Берёт с уже существующих блоков текстуры
    private void generateIonicCustomShape(RegistryObject<Block> block, String templateName, Block base)
    {
        String path = ForgeRegistries.BLOCKS.getKey(base).getPath();
        generateIonicCustomShape(block, templateName,
                mcLoc("block/" + path),                       // main texture
                modLoc("block/" + path + "_ionic"),           // ionic texture
                modLoc("block/" + path + "_volute")           // volute texture
        );
    }

    //Ручками задаёшь текстуры
    private void generateIonicCustomShape(RegistryObject<Block> block, String templateName,
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

        // 1. Create the four models based on your templates
        // We point to the specific templates for each height state
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

        // 2. Map the variants to the boolean properties 'up' and 'down'
        getVariantBuilder(block.get())
                .partialState().with(BlockColumnSmall.CONNECTED_UP, false).with(BlockColumnSmall.CONNECTED_DOWN, false).setModels(new ConfiguredModel(modelNone))
                .partialState().with(BlockColumnSmall.CONNECTED_UP, false).with(BlockColumnSmall.CONNECTED_DOWN, true).setModels(new ConfiguredModel(modelBottom))
                .partialState().with(BlockColumnSmall.CONNECTED_UP, true).with(BlockColumnSmall.CONNECTED_DOWN, false).setModels(new ConfiguredModel(modelTop))
                .partialState().with(BlockColumnSmall.CONNECTED_UP, true).with(BlockColumnSmall.CONNECTED_DOWN, true).setModels(new ConfiguredModel(modelBoth));

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

        for (Direction dir : BlockStateProperties.HORIZONTAL_FACING.getPossibleValues()) {
            int rotationY = (int) dir.toYRot(); // North=0, East=90, South=180, West=270//

            // Connection: None
            builder.partialState()
                    .with(BlockColumnSmall.CONNECTED_UP, false)
                    .with(BlockColumnSmall.CONNECTED_DOWN, false)
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .setModels(new ConfiguredModel(modelNone, 0, rotationY, false));

            // Connection: Down Only
            builder.partialState()
                    .with(BlockColumnSmall.CONNECTED_UP, false)
                    .with(BlockColumnSmall.CONNECTED_DOWN, true)
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .setModels(new ConfiguredModel(modelBottom, 0, rotationY, false));

            // Connection: Up Only
            builder.partialState()
                    .with(BlockColumnSmall.CONNECTED_UP, true)
                    .with(BlockColumnSmall.CONNECTED_DOWN, false)
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .setModels(new ConfiguredModel(modelTop, 0, rotationY, false));

            // Connection: Both
            builder.partialState()
                    .with(BlockColumnSmall.CONNECTED_UP, true)
                    .with(BlockColumnSmall.CONNECTED_DOWN, true)
                    .with(BlockStateProperties.HORIZONTAL_FACING, dir)
                    .setModels(new ConfiguredModel(modelBoth, 0, rotationY, false));
        }
    }
}