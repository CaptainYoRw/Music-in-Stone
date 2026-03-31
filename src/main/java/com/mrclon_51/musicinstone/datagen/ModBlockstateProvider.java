package com.mrclon_51.musicinstone.datagen;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.BlocksRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ItemModelProvider;
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
        generateStoneVariants(BlocksRegistry.BRICKS_TILES, BlocksRegistry.BRICK_TILES_SLAB, BlocksRegistry.BRICK_TILES_STAIRS, BlocksRegistry.BRICK_TILES_WALL);
        generateStoneVariants(BlocksRegistry.BRICKS_TILES_STACK, BlocksRegistry.BRICK_TILES_STACK_SLAB, BlocksRegistry.BRICK_TILES_STACK_STAIRS, BlocksRegistry.BRICK_TILES_STACK_WALL);
        generateStoneVariants(BlocksRegistry.BRICKS_ROMAN, BlocksRegistry.BRICK_ROMAN_SLAB, BlocksRegistry.BRICK_ROMAN_STAIRS, BlocksRegistry.BRICK_ROMAN_WALL);
        generateStoneVariants(BlocksRegistry.BRICKS_ROMAN_STACK, BlocksRegistry.BRICK_ROMAN_STACK_SLAB, BlocksRegistry.BRICK_ROMAN_STACK_STAIRS, BlocksRegistry.BRICK_ROMAN_STACK_WALL);
        generateStoneVariants(BlocksRegistry.BRICKS_LONG, BlocksRegistry.BRICK_LONG_SLAB, BlocksRegistry.BRICK_LONG_STAIRS, BlocksRegistry.BRICK_LONG_WALL);
        generateStoneVariants(BlocksRegistry.BRICKS_LONG_STACK, BlocksRegistry.BRICK_LONG_STACK_SLAB, BlocksRegistry.BRICK_LONG_STACK_STAIRS, BlocksRegistry.BRICK_LONG_STACK_WALL);


        // Custom Shapes using your existing templates
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

    }

    private void generateSingleBlockVariant(Block baseBlock, Block variantBlock)
    {
        ResourceLocation texture = blockTexture(baseBlock);

        if (variantBlock instanceof SlabBlock) {
            slabBlock((SlabBlock) variantBlock, texture, texture);
        }
        else if (variantBlock instanceof StairBlock) {
            stairsBlock((StairBlock) variantBlock, texture);
        }
        else if (variantBlock instanceof WallBlock) {
            wallBlock((WallBlock) variantBlock, texture);
        }
        // You can add more cases here for different block types!
    }

    private void generateStoneVariants(RegistryObject<Block> base, RegistryObject<SlabBlock> slab, RegistryObject<StairBlock> stairs, RegistryObject<WallBlock> wall)
    {
        ResourceLocation tex = blockTexture(base.get());

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



    private void generateHorizontalCustomShape(RegistryObject<Block> block, String templateName, Block textureSource)
    {
        ResourceLocation tex = blockTexture(textureSource);

        // 1. Create the Model (pointing to your template)
        var model = models().withExistingParent(block.getId().getPath(),
                        new ResourceLocation(MusicinStone.MODID, "block/" + templateName))
                .texture("texture", tex); // Ensure "texture" matches the key in your JSON template

        // 2. Apply Horizontal Rotation (Anvil-style)
        // This assumes your Block class in BlocksRegistry extends HorizontalDirectionalBlock
        horizontalBlock(block.get(), model, 0);
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
}