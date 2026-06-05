package com.mrclon_51.musicinstone.datagen;

import com.mrclon_51.musicinstone.BlocksRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider
{
    public ModRecipeProvider(PackOutput output)
    {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer)
    {
        // Define your transformations manually here
        makeStonecutter(consumer, BlocksRegistry.BRICKS_FANCY.get(), BlocksRegistry.BRICK_FANCY_SLAB.get(), 2);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_FANCY.get(), BlocksRegistry.BRICK_FANCY_STAIRS.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_FANCY.get(), BlocksRegistry.BRICK_FANCY_WALL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_FANCY.get(), BlocksRegistry.BRICK_FANCY_FINIAL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_FANCY.get(), BlocksRegistry.BRICK_FANCY_PEDESTAL.get(), 1);

        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES.get(), BlocksRegistry.BRICK_TILES_SLAB.get(), 2);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES.get(), BlocksRegistry.BRICK_TILES_STAIRS.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES.get(), BlocksRegistry.BRICK_TILES_WALL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES.get(), BlocksRegistry.BRICK_TILES_FINIAL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES.get(), BlocksRegistry.BRICK_TILES_PEDESTAL.get(), 1);

        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES_STACK.get(), BlocksRegistry.BRICK_TILES_STACK_SLAB.get(), 2);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES_STACK.get(), BlocksRegistry.BRICK_TILES_STACK_STAIRS.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES_STACK.get(), BlocksRegistry.BRICK_TILES_STACK_WALL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES_STACK.get(), BlocksRegistry.BRICK_TILES_STACK_FINIAL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES_STACK.get(), BlocksRegistry.BRICK_TILES_STACK_PEDESTAL.get(), 1);

        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN.get(), BlocksRegistry.BRICK_ROMAN_SLAB.get(), 2);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN.get(), BlocksRegistry.BRICK_ROMAN_STAIRS.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN.get(), BlocksRegistry.BRICK_ROMAN_WALL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN.get(), BlocksRegistry.BRICK_ROMAN_FINIAL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN.get(), BlocksRegistry.BRICK_ROMAN_PEDESTAL.get(), 1);

        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN_STACK.get(), BlocksRegistry.BRICK_ROMAN_STACK_SLAB.get(), 2);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN_STACK.get(), BlocksRegistry.BRICK_ROMAN_STACK_STAIRS.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN_STACK.get(), BlocksRegistry.BRICK_ROMAN_STACK_WALL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN_STACK.get(), BlocksRegistry.BRICK_ROMAN_STACK_FINIAL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN_STACK.get(), BlocksRegistry.BRICK_ROMAN_STACK_PEDESTAL.get(), 1);

        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG.get(), BlocksRegistry.BRICK_LONG_SLAB.get(), 2);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG.get(), BlocksRegistry.BRICK_LONG_STAIRS.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG.get(), BlocksRegistry.BRICK_LONG_WALL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG.get(), BlocksRegistry.BRICK_LONG_FINIAL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG.get(), BlocksRegistry.BRICK_LONG_PEDESTAL.get(), 1);

        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG_STACK.get(), BlocksRegistry.BRICK_LONG_STACK_SLAB.get(), 2);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG_STACK.get(), BlocksRegistry.BRICK_LONG_STACK_STAIRS.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG_STACK.get(), BlocksRegistry.BRICK_LONG_STACK_WALL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG_STACK.get(), BlocksRegistry.BRICK_LONG_STACK_FINIAL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG_STACK.get(), BlocksRegistry.BRICK_LONG_STACK_PEDESTAL.get(), 1);

        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROAD.get(), BlocksRegistry.BRICK_ROAD_SLAB.get(), 2);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROAD.get(), BlocksRegistry.BRICK_ROAD_STAIRS.get(), 1);

        makeStonecutter(consumer, Blocks.DARK_PRISMARINE, BlocksRegistry.DARK_PRISMARINE_WALL.get(), 1);
        makeStonecutter(consumer, Blocks.PRISMARINE_BRICKS, BlocksRegistry.PRISMARINE_BRICK_WALL.get(), 1);
        makeStonecutter(consumer, Blocks.STONE, BlocksRegistry.STONE_WALL.get(), 1);
        makeStonecutter(consumer, Blocks.POLISHED_ANDESITE, BlocksRegistry.POLISHED_ANDESITE_WALL.get(), 1);
        makeStonecutter(consumer, Blocks.POLISHED_DIORITE, BlocksRegistry.POLISHED_DIORITE_WALL.get(), 1);
        makeStonecutter(consumer, Blocks.POLISHED_GRANITE, BlocksRegistry.POLISHED_GRANITE_WALL.get(), 1);

        makeStonecutter(consumer, Blocks.GILDED_BLACKSTONE, BlocksRegistry.GILDED_BLACKSTONE_FINIAL.get(), 1);
        makeStonecutter(consumer, Blocks.GILDED_BLACKSTONE, BlocksRegistry.GILDED_BLACKSTONE_PEDESTAL.get(), 1);

        makeStonecutter(consumer, Blocks.BRICKS, BlocksRegistry.BRICK_LAYER.get(), 8);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_FANCY.get(), BlocksRegistry.BRICK_FANCY_LAYER.get(), 8);


    }

    private void makeStonecutter(Consumer<FinishedRecipe> consumer, ItemLike input, ItemLike output, int count) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, output, count)
                .unlockedBy(getHasName(input), has(input))
                .save(consumer, output.asItem().toString() + "_from_stonecutting");
    }
}
