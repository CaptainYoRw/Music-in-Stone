package com.mrclon_51.musicinstone.datagen;

import com.mrclon_51.musicinstone.BlocksRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

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
        makeStonecutter(consumer, Blocks.BRICKS, BlocksRegistry.BRICKS_FANCY.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_FANCY.get(), BlocksRegistry.BRICK_FANCY_SLAB.get(), 2);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_FANCY.get(), BlocksRegistry.BRICK_FANCY_STAIRS.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_FANCY.get(), BlocksRegistry.BRICK_FANCY_WALL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_FANCY.get(), BlocksRegistry.BRICK_FANCY_FINIAL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_FANCY.get(), BlocksRegistry.BRICK_FANCY_PEDESTAL.get(), 1);

        makeStonecutter(consumer, Blocks.BRICKS, BlocksRegistry.BRICKS_TILES.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES.get(), BlocksRegistry.BRICK_TILES_SLAB.get(), 2);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES.get(), BlocksRegistry.BRICK_TILES_STAIRS.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES.get(), BlocksRegistry.BRICK_TILES_WALL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES.get(), BlocksRegistry.BRICK_TILES_FINIAL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES.get(), BlocksRegistry.BRICK_TILES_PEDESTAL.get(), 1);

        makeStonecutter(consumer, Blocks.BRICKS, BlocksRegistry.BRICKS_TILES_STACK.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES_STACK.get(), BlocksRegistry.BRICK_TILES_STACK_SLAB.get(), 2);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES_STACK.get(), BlocksRegistry.BRICK_TILES_STACK_STAIRS.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES_STACK.get(), BlocksRegistry.BRICK_TILES_STACK_WALL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES_STACK.get(), BlocksRegistry.BRICK_TILES_STACK_FINIAL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_TILES_STACK.get(), BlocksRegistry.BRICK_TILES_STACK_PEDESTAL.get(), 1);

        makeStonecutter(consumer, Blocks.BRICKS, BlocksRegistry.BRICKS_ROMAN.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN.get(), BlocksRegistry.BRICK_ROMAN_SLAB.get(), 2);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN.get(), BlocksRegistry.BRICK_ROMAN_STAIRS.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN.get(), BlocksRegistry.BRICK_ROMAN_WALL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN.get(), BlocksRegistry.BRICK_ROMAN_FINIAL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN.get(), BlocksRegistry.BRICK_ROMAN_PEDESTAL.get(), 1);

        makeStonecutter(consumer, Blocks.BRICKS, BlocksRegistry.BRICKS_ROMAN_STACK.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN_STACK.get(), BlocksRegistry.BRICK_ROMAN_STACK_SLAB.get(), 2);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN_STACK.get(), BlocksRegistry.BRICK_ROMAN_STACK_STAIRS.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN_STACK.get(), BlocksRegistry.BRICK_ROMAN_STACK_WALL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN_STACK.get(), BlocksRegistry.BRICK_ROMAN_STACK_FINIAL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_ROMAN_STACK.get(), BlocksRegistry.BRICK_ROMAN_STACK_PEDESTAL.get(), 1);

        makeStonecutter(consumer, Blocks.BRICKS, BlocksRegistry.BRICKS_LONG.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG.get(), BlocksRegistry.BRICK_LONG_SLAB.get(), 2);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG.get(), BlocksRegistry.BRICK_LONG_STAIRS.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG.get(), BlocksRegistry.BRICK_LONG_WALL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG.get(), BlocksRegistry.BRICK_LONG_FINIAL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG.get(), BlocksRegistry.BRICK_LONG_PEDESTAL.get(), 1);

        makeStonecutter(consumer, Blocks.BRICKS, BlocksRegistry.BRICKS_LONG_STACK.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG_STACK.get(), BlocksRegistry.BRICK_LONG_STACK_SLAB.get(), 2);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG_STACK.get(), BlocksRegistry.BRICK_LONG_STACK_STAIRS.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG_STACK.get(), BlocksRegistry.BRICK_LONG_STACK_WALL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG_STACK.get(), BlocksRegistry.BRICK_LONG_STACK_FINIAL.get(), 1);
        makeStonecutter(consumer, BlocksRegistry.BRICKS_LONG_STACK.get(), BlocksRegistry.BRICK_LONG_STACK_PEDESTAL.get(), 1);

        makeStonecutter(consumer, Blocks.BRICKS, BlocksRegistry.BRICKS_ROAD.get(), 1);
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

        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_WINDOW_FRAME.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_WINDOW_UPPER_FRAME.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_WINDOW_KEYSTONE.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_WINDOW_STRAIGHT_PEDIMENT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_WINDOW_GREEK_PEDIMENT.get(), 2);

        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_PILASTER_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_PILASTER_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_PILASTER_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_PILASTER_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_PILASTER_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_PILASTER_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_PILASTER_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_PILASTER_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_FLUTED_PILASTER_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_FLUTED_PILASTER_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_FLUTED_PILASTER_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_FLUTED_PILASTER_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_PILASTER_BASE_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_PILASTER_BASE_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_PILASTER_BASE_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_PILASTER_BASE_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_PILASTER_BASE_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_PILASTER_BASE_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_PILASTER_BASE_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_PILASTER_BASE_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_PILASTER_BASE_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_PILASTER_BASE_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_PILASTER_BASE_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_PILASTER_BASE_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_PILASTER_BASE_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_PILASTER_BASE_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_PILASTER_BASE_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_PILASTER_BASE_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_PILASTER_BASE_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_PILASTER_BASE_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_PILASTER_BASE_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_PILASTER_BASE_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_PILASTER_BASE_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_PILASTER_BASE_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_PILASTER_BASE_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_PILASTER_BASE_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_PILASTER_CAPITAL_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_PILASTER_CAPITAL_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_PILASTER_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_PILASTER_CAPITAL_GIANT.get(), 2);;
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_PILASTER_CAPITAL_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_PILASTER_CAPITAL_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_PILASTER_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_PILASTER_CAPITAL_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_PILASTER_CAPITAL_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_PILASTER_CAPITAL_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_PILASTER_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_PILASTER_CAPITAL_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORNER_IONIC_PILASTER_CAPITAL_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORNER_IONIC_PILASTER_CAPITAL_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORNER_IONIC_PILASTER_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORNER_IONIC_PILASTER_CAPITAL_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_PILASTER_CAPITAL_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_PILASTER_CAPITAL_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_PILASTER_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_PILASTER_CAPITAL_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_PILASTER_CAPITAL_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_PILASTER_CAPITAL_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_PILASTER_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_PILASTER_CAPITAL_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_PILASTER_CAPITAL_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_PILASTER_CAPITAL_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_PILASTER_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_PILASTER_CAPITAL_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_PILASTER_CAPITAL_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_PILASTER_CAPITAL_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_PILASTER_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_PILASTER_CAPITAL_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_PILASTER_CAPITAL_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_PILASTER_CAPITAL_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_PILASTER_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_PILASTER_CAPITAL_GIANT.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_COMPOSITE_PILASTER_CAPITAL_SMALL.get(), 8);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_COMPOSITE_PILASTER_CAPITAL_MEDIUM.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_COMPOSITE_PILASTER_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_COMPOSITE_PILASTER_CAPITAL_GIANT.get(), 2);

        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_HALF_COLUMN_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_HALF_COLUMN_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_HALF_COLUMN_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_HALF_COLUMN_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_HALF_COLUMN_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_HALF_COLUMN_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_FLUTED_HALF_COLUMN_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_FLUTED_HALF_COLUMN_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_FLUTED_HALF_COLUMN_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_HALF_COLUMN_BASE_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_HALF_COLUMN_BASE_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_HALF_COLUMN_BASE_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_HALF_COLUMN_BASE_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_HALF_COLUMN_BASE_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_HALF_COLUMN_BASE_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_HALF_COLUMN_BASE_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_HALF_COLUMN_BASE_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_HALF_COLUMN_BASE_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_HALF_COLUMN_BASE_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_HALF_COLUMN_BASE_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_HALF_COLUMN_BASE_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_HALF_COLUMN_BASE_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_HALF_COLUMN_BASE_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_HALF_COLUMN_BASE_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_HALF_COLUMN_BASE_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_HALF_COLUMN_BASE_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_HALF_COLUMN_BASE_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_HALF_COLUMN_CAPITAL_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_HALF_COLUMN_CAPITAL_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_HALF_COLUMN_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_HALF_COLUMN_CAPITAL_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_HALF_COLUMN_CAPITAL_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_HALF_COLUMN_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_HALF_COLUMN_CAPITAL_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_HALF_COLUMN_CAPITAL_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_HALF_COLUMN_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORNER_IONIC_HALF_COLUMN_CAPITAL_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORNER_IONIC_HALF_COLUMN_CAPITAL_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORNER_IONIC_HALF_COLUMN_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_HALF_COLUMN_CAPITAL_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_HALF_COLUMN_CAPITAL_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_HALF_COLUMN_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_HALF_COLUMN_CAPITAL_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_HALF_COLUMN_CAPITAL_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_HALF_COLUMN_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_HALF_COLUMN_CAPITAL_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_HALF_COLUMN_CAPITAL_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_HALF_COLUMN_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_HALF_COLUMN_CAPITAL_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_HALF_COLUMN_CAPITAL_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_HALF_COLUMN_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_HALF_COLUMN_CAPITAL_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_HALF_COLUMN_CAPITAL_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_HALF_COLUMN_CAPITAL_LARGE.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_COMPOSITE_HALF_COLUMN_CAPITAL_SMALL.get(), 4);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_COMPOSITE_HALF_COLUMN_CAPITAL_MEDIUM.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_COMPOSITE_HALF_COLUMN_CAPITAL_LARGE.get(), 2);

        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_COLUMN_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_COLUMN_REGULAR.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_COLUMN_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_COLUMN_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_COLUMN_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_COLUMN_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_COLUMN_REGULAR.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_COLUMN_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_COLUMN_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_COLUMN_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_FLUTED_COLUMN_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_FLUTED_COLUMN_REGULAR.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_FLUTED_COLUMN_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_FLUTED_COLUMN_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_FLUTED_COLUMN_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_BASE_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_BASE_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_BASE_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_BASE_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_BASE_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_BASE_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_BASE_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_BASE_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_BASE_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_BASE_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_BASE_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_BASE_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_BASE_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_BASE_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_BASE_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_BASE_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_BASE_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_BASE_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_BASE_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_BASE_REGULAR.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_BASE_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_BASE_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_CAPITAL_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_CAPITAL_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_CAPITAL_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_DORIC_CAPITAL_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_CAPITAL_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_CAPITAL_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_CAPITAL_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_DORIC_CAPITAL_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_CAPITAL_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_CAPITAL_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_CAPITAL_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_IONIC_CAPITAL_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORNER_IONIC_CAPITAL_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORNER_IONIC_CAPITAL_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORNER_IONIC_CAPITAL_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORNER_IONIC_CAPITAL_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_CAPITAL_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_CAPITAL_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_CAPITAL_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_IONIC_CAPITAL_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_CAPITAL_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_CAPITAL_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_CAPITAL_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_SCAMOZZI_IONIC_CAPITAL_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_CAPITAL_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_CAPITAL_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_CAPITAL_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_CORINTHIAN_CAPITAL_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_CAPITAL_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_CAPITAL_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_CAPITAL_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_ROMAN_CORINTHIAN_CAPITAL_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_CAPITAL_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_CAPITAL_REGULAR.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_CAPITAL_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_CAPITAL_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_TUSCAN_CAPITAL_GIANT.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_COMPOSITE_CAPITAL_SMALL.get(), 2);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_COMPOSITE_CAPITAL_MEDIUM.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_COMPOSITE_CAPITAL_LARGE.get(), 1);
        makeStonecutter(consumer, Blocks.SANDSTONE, BlocksRegistry.SANDSTONE_COMPOSITE_CAPITAL_GIANT.get(), 1);

        makeStonecutter(consumer, Blocks.GILDED_BLACKSTONE, BlocksRegistry.GILDED_BLACKSTONE_STAIRS.get(), 1);
        makeStonecutter(consumer, Blocks.GILDED_BLACKSTONE, BlocksRegistry.GILDED_BLACKSTONE_SLAB.get(), 2);
        makeStonecutter(consumer, Blocks.GILDED_BLACKSTONE, BlocksRegistry.GILDED_BLACKSTONE_WALL.get(), 1);
        makeStonecutter(consumer, Blocks.GILDED_BLACKSTONE, BlocksRegistry.GILDED_BLACKSTONE_ARROWSLIT.get(), 1);

        makeStonecutter(consumer, Blocks.PURPUR_BLOCK, BlocksRegistry.PURPUR_WALL.get(), 1);

        makeStonecutter(consumer, Blocks.QUARTZ_BRICKS, BlocksRegistry.QUARTZ_BRICK_STAIRS.get(), 1);
        makeStonecutter(consumer, Blocks.QUARTZ_BRICKS, BlocksRegistry.QUARTZ_BRICK_SLAB.get(), 2);
        makeStonecutter(consumer, Blocks.QUARTZ_BRICKS, BlocksRegistry.QUARTZ_BRICK_WALL.get(), 1);
        makeStonecutter(consumer, Blocks.SMOOTH_QUARTZ, BlocksRegistry.SMOOTH_QUARTZ_WALL.get(), 1);


    }

    private void makeStonecutter(Consumer<FinishedRecipe> consumer, ItemLike input, ItemLike output, int count)
    {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, output, count)
                .unlockedBy(getHasName(input), has(input))
                .save(consumer, output.asItem().toString() + "_from_stonecutting");
    }

    private void makeStonecutter(Consumer<FinishedRecipe> consumer, Ingredient input, ItemLike output, int count)
    {
        SingleItemRecipeBuilder.stonecutting(input, RecipeCategory.BUILDING_BLOCKS, output, count)
                .unlockedBy(getHasName(output), has(output))
                .save(consumer, output.asItem().toString() + "_from_tag_stonecutting");
    }
}
