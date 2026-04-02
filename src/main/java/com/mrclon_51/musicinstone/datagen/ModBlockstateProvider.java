package com.mrclon_51.musicinstone.datagen;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.BlocksRegistry;
import com.mrclon_51.musicinstone.block.BlockColumnCapital;
import com.mrclon_51.musicinstone.block.BlockColumnSmall;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
        generateStoneVariants(BlocksRegistry.BRICKS_TILES.get(), BlocksRegistry.BRICK_TILES_SLAB, BlocksRegistry.BRICK_TILES_STAIRS, BlocksRegistry.BRICK_TILES_WALL);
        generateStoneVariants(BlocksRegistry.BRICKS_TILES_STACK.get(), BlocksRegistry.BRICK_TILES_STACK_SLAB, BlocksRegistry.BRICK_TILES_STACK_STAIRS, BlocksRegistry.BRICK_TILES_STACK_WALL);
        generateStoneVariants(BlocksRegistry.BRICKS_ROMAN.get(), BlocksRegistry.BRICK_ROMAN_SLAB, BlocksRegistry.BRICK_ROMAN_STAIRS, BlocksRegistry.BRICK_ROMAN_WALL);
        generateStoneVariants(BlocksRegistry.BRICKS_ROMAN_STACK.get(), BlocksRegistry.BRICK_ROMAN_STACK_SLAB, BlocksRegistry.BRICK_ROMAN_STACK_STAIRS, BlocksRegistry.BRICK_ROMAN_STACK_WALL);
        generateStoneVariants(BlocksRegistry.BRICKS_LONG.get(), BlocksRegistry.BRICK_LONG_SLAB, BlocksRegistry.BRICK_LONG_STAIRS, BlocksRegistry.BRICK_LONG_WALL);
        generateStoneVariants(BlocksRegistry.BRICKS_LONG_STACK.get(), BlocksRegistry.BRICK_LONG_STACK_SLAB, BlocksRegistry.BRICK_LONG_STACK_STAIRS, BlocksRegistry.BRICK_LONG_STACK_WALL);



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
        generateColumn(BlocksRegistry.SANDSTONE_COLUMN_SMALL, "template_column_small", modLoc("block/sandstone_pillar"), modLoc("block/sandstone_pillar_top"));
        generate90DegThreeTex(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_SMALL, "template_ionic_capital_small", mcLoc("block/sandstone_top"), modLoc("block/sandstone_ionic"), modLoc("block/sandstone_volute"));

    }

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

    private void generateStoneVariants(Block baseBlock, RegistryObject<SlabBlock> slab, RegistryObject<StairBlock> stairs, RegistryObject<WallBlock> wall)
    {
        ResourceLocation tex = blockTexture(baseBlock);

        slabBlock(slab.get(), tex, tex);
        stairsBlock(stairs.get(), tex);
        wallBlock(wall.get(), tex);
    }

    private void generateDefaultCustomShape(RegistryObject<Block> block, String templateName, Block textureSource)
    {
        ResourceLocation tex = blockTexture(textureSource);

        // This creates a model for the specific block that "inherits" from your template
        // and applies the texture of your base block to it.
        simpleBlock(block.get(), models().withExistingParent(block.getId().getPath(),
                        new ResourceLocation(MusicinStone.MODID, "block/" + templateName))
                .texture("texture", tex)); // "texture" must match the key inside your template JSON
    }

    private void generateDefaultCustomShape(RegistryObject<Block> block, String templateName, ResourceLocation manualTexture) {
        // This creates the model for the specific block that "inherits" from your template
        // and applies the passed-in texture to it.
        simpleBlock(block.get(), models().withExistingParent(block.getId().getPath(),
                        new ResourceLocation(MusicinStone.MODID, "block/" + templateName))
                .texture("texture", manualTexture));
    }

    private void generateHorizontalCustomShape(RegistryObject<Block> block, String templateName, Block textureSource)
    {
        ResourceLocation tex = blockTexture(textureSource);

        // 1. Create the Model (pointing to template)
        var model = models().withExistingParent(block.getId().getPath(),
                        new ResourceLocation(MusicinStone.MODID, "block/" + templateName))
                .texture("texture", tex); // Ensure "texture" matches the key in your JSON template

        // 2. Apply Horizontal Rotation (Anvil-style)
        // This assumes your Block class in BlocksRegistry extends HorizontalDirectionalBlock
        horizontalBlock(block.get(), model);
    }

    // Helper to get the registry path of the block
    private String name(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block).getPath();
    }

    // 1. The "Shortcut" version - uses a base Block to guess the 3 textures
    private void generate90DegThreeTex(RegistryObject<Block> block, String template, Block base) {
        String path = ForgeRegistries.BLOCKS.getKey(base).getPath();
        generate90DegThreeTex(block, template,
                mcLoc("block/" + path),                       // main texture
                modLoc("block/" + path + "_ionic"),           // ionic texture
                modLoc("block/" + path + "_volute")           // volute texture
        );
    }

    // 2. The "Manual" version - total control over all 3 textures
    private void generate90DegThreeTex(RegistryObject<Block> block, String template,
                                       ResourceLocation tex, ResourceLocation ionic, ResourceLocation volute) {

        // Create the model pointing to your multi-texture template
        var model = models().withExistingParent(block.getId().getPath(), modLoc("block/" + template))
                .texture("texture", tex)
                .texture("ionic", ionic)
                .texture("volute", volute);

        // Apply the 90-degree logic based on facing
        getVariantBuilder(block.get()).forAllStates(state -> {
            Direction dir = state.getValue(BlockColumnCapital.FACING);

            // If North/South -> 0 deg. If East/West -> 90 deg.
            int rotationY = (dir == Direction.NORTH || dir == Direction.SOUTH) ? 0 : 90;

            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationY(rotationY)
                    .build();
        });
    }

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

    private void generateColumn(RegistryObject<Block> block, String baseTemplate,
                                      ResourceLocation sideTex, ResourceLocation topTex) {

        // 1. Create the four models based on your templates
        // We point to the specific templates for each height state
        ModelFile modelNone = models().withExistingParent(block.getId().getPath(),
                        modLoc("block/" + baseTemplate))
                .texture("side", sideTex).texture("top", topTex);

        ModelFile modelBottom = models().withExistingParent(block.getId().getPath() + "_bottom",
                        modLoc("block/" + baseTemplate + "_bottom"))
                .texture("side", sideTex).texture("top", topTex);

        ModelFile modelTop = models().withExistingParent(block.getId().getPath() + "_top",
                        modLoc("block/" + baseTemplate + "_top"))
                .texture("side", sideTex).texture("top", topTex);

        ModelFile modelBoth = models().withExistingParent(block.getId().getPath() + "_both",
                        modLoc("block/" + baseTemplate + "_both"))
                .texture("side", sideTex).texture("top", topTex);

        // 2. Map the variants to the boolean properties 'up' and 'down'
        getVariantBuilder(block.get())
                .partialState().with(BlockColumnSmall.CONNECTED_UP, false).with(BlockColumnSmall.CONNECTED_DOWN, false).setModels(new ConfiguredModel(modelNone))
                .partialState().with(BlockColumnSmall.CONNECTED_UP, false).with(BlockColumnSmall.CONNECTED_DOWN, true).setModels(new ConfiguredModel(modelBottom))
                .partialState().with(BlockColumnSmall.CONNECTED_UP, true).with(BlockColumnSmall.CONNECTED_DOWN, false).setModels(new ConfiguredModel(modelTop))
                .partialState().with(BlockColumnSmall.CONNECTED_UP, true).with(BlockColumnSmall.CONNECTED_DOWN, true).setModels(new ConfiguredModel(modelBoth));
    }

}