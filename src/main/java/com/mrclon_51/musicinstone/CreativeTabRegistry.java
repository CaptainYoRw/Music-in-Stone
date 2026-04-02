package com.mrclon_51.musicinstone;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabRegistry
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MusicinStone.MODID);

    public static final RegistryObject<CreativeModeTab> MUSICINSTONE_TAB = CREATIVE_MODE_TABS.register("musicinstone_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Blocks.BRICKS))
                    .title(Component.translatable("creativetab.musicinstone_tab"))
                    .displayItems((parameters, output) ->
                    {

                        output.accept(Blocks.COBBLESTONE);
                        output.accept(Blocks.COBBLESTONE_STAIRS);
                        output.accept(Blocks.COBBLESTONE_SLAB);
                        output.accept(Blocks.COBBLESTONE_WALL);
                        output.accept(BlocksRegistry.COBBLESTONE_FINIAL.get());
                        output.accept(BlocksRegistry.COBBLESTONE_PEDESTAL.get());
                        output.accept(BlocksRegistry.COBBLESTONE_LAYER.get());
                        output.accept(BlocksRegistry.COBBLESTONE_ARROWSLIT.get());
                        output.accept(BlocksRegistry.COBBLESTONE_CROSS_ARROWSLIT.get());

                        output.accept(Blocks.STONE);
                        output.accept(Blocks.STONE_STAIRS);
                        output.accept(Blocks.STONE_SLAB);
                        output.accept(BlocksRegistry.STONE_WALL.get());
                        output.accept(BlocksRegistry.STONE_FINIAL.get());
                        output.accept(BlocksRegistry.STONE_PEDESTAL.get());
                        output.accept(BlocksRegistry.STONE_LAYER.get());
                        output.accept(BlocksRegistry.STONE_ARROWSLIT.get());
                        output.accept(BlocksRegistry.STONE_CROSS_ARROWSLIT.get());

                        output.accept(Blocks.STONE_BRICKS);
                        output.accept(Blocks.STONE_BRICK_STAIRS);
                        output.accept(Blocks.STONE_BRICK_SLAB);
                        output.accept(Blocks.STONE_BRICK_WALL);
                        output.accept(BlocksRegistry.STONE_BRICK_FINIAL.get());
                        output.accept(BlocksRegistry.STONE_BRICK_PEDESTAL.get());
                        output.accept(BlocksRegistry.STONE_BRICK_LAYER.get());
                        output.accept(BlocksRegistry.STONE_BRICK_ARROWSLIT.get());
                        output.accept(BlocksRegistry.STONE_BRICK_CROSS_ARROWSLIT.get());

                        output.accept(Blocks.GRANITE);
                        output.accept(Blocks.GRANITE_STAIRS);
                        output.accept(Blocks.GRANITE_SLAB);
                        output.accept(Blocks.GRANITE_WALL);

                        output.accept(Blocks.POLISHED_GRANITE);
                        output.accept(Blocks.POLISHED_GRANITE_STAIRS);
                        output.accept(Blocks.POLISHED_GRANITE_SLAB);
                        output.accept(BlocksRegistry.POLISHED_GRANITE_WALL.get());

                        output.accept(Blocks.DIORITE);
                        output.accept(Blocks.DIORITE_STAIRS);
                        output.accept(Blocks.DIORITE_SLAB);
                        output.accept(Blocks.DIORITE_WALL);

                        output.accept(Blocks.POLISHED_DIORITE);
                        output.accept(Blocks.POLISHED_DIORITE_STAIRS);
                        output.accept(Blocks.POLISHED_DIORITE_SLAB);
                        output.accept(BlocksRegistry.POLISHED_DIORITE_WALL.get());

                        output.accept(Blocks.ANDESITE);
                        output.accept(Blocks.ANDESITE_STAIRS);
                        output.accept(Blocks.ANDESITE_SLAB);
                        output.accept(Blocks.ANDESITE_WALL);

                        output.accept(Blocks.POLISHED_ANDESITE);
                        output.accept(Blocks.POLISHED_ANDESITE_STAIRS);
                        output.accept(Blocks.POLISHED_ANDESITE_SLAB);
                        output.accept(BlocksRegistry.POLISHED_ANDESITE_WALL.get());

                        output.accept(Blocks.COBBLED_DEEPSLATE);
                        output.accept(Blocks.COBBLED_DEEPSLATE_STAIRS);
                        output.accept(Blocks.COBBLED_DEEPSLATE_SLAB);
                        output.accept(Blocks.COBBLED_DEEPSLATE_WALL);

                        output.accept(Blocks.DEEPSLATE_BRICKS);
                        output.accept(Blocks.DEEPSLATE_BRICK_STAIRS);
                        output.accept(Blocks.DEEPSLATE_BRICK_SLAB);
                        output.accept(Blocks.DEEPSLATE_BRICK_WALL);

                        output.accept(Blocks.DEEPSLATE_TILES);
                        output.accept(Blocks.DEEPSLATE_TILE_STAIRS);
                        output.accept(Blocks.DEEPSLATE_TILE_SLAB);
                        output.accept(Blocks.DEEPSLATE_TILE_WALL);

                        output.accept(Blocks.BRICKS);
                        output.accept(Blocks.BRICK_STAIRS);
                        output.accept(Blocks.BRICK_SLAB);
                        output.accept(Blocks.BRICK_WALL);
                        output.accept(BlocksRegistry.BRICK_FINIAL.get());
                        output.accept(BlocksRegistry.BRICK_PEDESTAL.get());
                        output.accept(BlocksRegistry.BRICK_LAYER.get());
                        output.accept(BlocksRegistry.BRICK_ARROWSLIT.get());


                        output.accept(BlocksRegistry.BRICKS_FANCY.get());
                        output.accept(BlocksRegistry.BRICK_FANCY_SLAB.get());
                        output.accept(BlocksRegistry.BRICK_FANCY_STAIRS.get());
                        output.accept(BlocksRegistry.BRICK_FANCY_WALL.get());
                        output.accept(BlocksRegistry.BRICK_FANCY_FINIAL.get());
                        output.accept(BlocksRegistry.BRICK_FANCY_PEDESTAL.get());
                        output.accept(BlocksRegistry.BRICK_FANCY_LAYER.get());

                        output.accept(BlocksRegistry.BRICKS_TILES.get());
                        output.accept(BlocksRegistry.BRICK_TILES_SLAB.get());
                        output.accept(BlocksRegistry.BRICK_TILES_STAIRS.get());
                        output.accept(BlocksRegistry.BRICK_TILES_WALL.get());
                        output.accept(BlocksRegistry.BRICK_TILES_FINIAL.get());
                        output.accept(BlocksRegistry.BRICK_TILES_PEDESTAL.get());
                        output.accept(BlocksRegistry.BRICK_TILES_LAYER.get());

                        output.accept(BlocksRegistry.BRICKS_TILES_STACK.get());
                        output.accept(BlocksRegistry.BRICK_TILES_STACK_SLAB.get());
                        output.accept(BlocksRegistry.BRICK_TILES_STACK_STAIRS.get());
                        output.accept(BlocksRegistry.BRICK_TILES_STACK_WALL.get());
                        output.accept(BlocksRegistry.BRICK_TILES_STACK_FINIAL.get());
                        output.accept(BlocksRegistry.BRICK_TILES_STACK_PEDESTAL.get());
                        output.accept(BlocksRegistry.BRICK_TILES_STACK_LAYER.get());

                        output.accept(BlocksRegistry.BRICKS_ROMAN.get());
                        output.accept(BlocksRegistry.BRICK_ROMAN_SLAB.get());
                        output.accept(BlocksRegistry.BRICK_ROMAN_STAIRS.get());
                        output.accept(BlocksRegistry.BRICK_ROMAN_WALL.get());
                        output.accept(BlocksRegistry.BRICK_ROMAN_FINIAL.get());
                        output.accept(BlocksRegistry.BRICK_ROMAN_PEDESTAL.get());
                        output.accept(BlocksRegistry.BRICK_ROMAN_LAYER.get());

                        output.accept(BlocksRegistry.BRICKS_ROMAN_STACK.get());
                        output.accept(BlocksRegistry.BRICK_ROMAN_STACK_SLAB.get());
                        output.accept(BlocksRegistry.BRICK_ROMAN_STACK_STAIRS.get());
                        output.accept(BlocksRegistry.BRICK_ROMAN_STACK_WALL.get());
                        output.accept(BlocksRegistry.BRICK_ROMAN_STACK_FINIAL.get());
                        output.accept(BlocksRegistry.BRICK_ROMAN_STACK_PEDESTAL.get());
                        output.accept(BlocksRegistry.BRICK_ROMAN_STACK_LAYER.get());

                        output.accept(BlocksRegistry.BRICKS_ROMAN_TRIPLE.get());

                        output.accept(BlocksRegistry.BRICKS_LONG.get());
                        output.accept(BlocksRegistry.BRICK_LONG_SLAB.get());
                        output.accept(BlocksRegistry.BRICK_LONG_STAIRS.get());
                        output.accept(BlocksRegistry.BRICK_LONG_WALL.get());
                        output.accept(BlocksRegistry.BRICK_LONG_FINIAL.get());
                        output.accept(BlocksRegistry.BRICK_LONG_PEDESTAL.get());
                        output.accept(BlocksRegistry.BRICK_LONG_LAYER.get());

                        output.accept(BlocksRegistry.BRICKS_LONG_STACK.get());
                        output.accept(BlocksRegistry.BRICK_LONG_STACK_SLAB.get());
                        output.accept(BlocksRegistry.BRICK_LONG_STACK_STAIRS.get());
                        output.accept(BlocksRegistry.BRICK_LONG_STACK_WALL.get());
                        output.accept(BlocksRegistry.BRICK_LONG_STACK_FINIAL.get());
                        output.accept(BlocksRegistry.BRICK_LONG_STACK_PEDESTAL.get());
                        output.accept(BlocksRegistry.BRICK_LONG_STACK_LAYER.get());

                        output.accept(BlocksRegistry.BRICKS_ROAD.get());
                        output.accept(BlocksRegistry.BRICK_ROAD_SLAB.get());
                        output.accept(BlocksRegistry.BRICK_ROAD_STAIRS.get());
                        output.accept(BlocksRegistry.BRICK_ROAD_LAYER.get());

                        output.accept(BlocksRegistry.BRICKS_JACK_ARCH.get());
                        output.accept(BlocksRegistry.BRICKS_SEGMENTAL_ARCH.get());
                        output.accept(BlocksRegistry.BRICKS_SMALL_ARCH.get());
                        output.accept(BlocksRegistry.BRICKS_ROWLOCK_ARCH.get());
                        output.accept(BlocksRegistry.BRICKS_WIDE_ARCH.get());
                        output.accept(BlocksRegistry.BRICK_FLORENTINE_ARCH.get());
                        output.accept(BlocksRegistry.BRICK_FLORENTINE_POINTED_ARCH.get());
                        output.accept(BlocksRegistry.BRICKS_LARGE_ARCH.get());
                        output.accept(BlocksRegistry.BRICK_LARGE_FLORENTINE_ARCH.get());
                        output.accept(BlocksRegistry.BRICK_LARGE_FLORENTINE_POINTED_ARCH.get());

                        output.accept(Blocks.MUD_BRICKS);
                        output.accept(Blocks.MUD_BRICK_STAIRS);
                        output.accept(Blocks.MUD_BRICK_SLAB);
                        output.accept(Blocks.MUD_BRICK_WALL);

                        output.accept(Blocks.SMOOTH_SANDSTONE);
                        output.accept(Blocks.SMOOTH_SANDSTONE_STAIRS);
                        output.accept(Blocks.SMOOTH_SANDSTONE_SLAB);
                        //output.accept(BlocksRegistry.SMOOTH_SANDSTONE_WALL.get());
                        output.accept(BlocksRegistry.SANDSTONE_IONIC_BASE_SMALL.get());
                        output.accept(BlocksRegistry.SANDSTONE_COLUMN_SMALL.get());
                        output.accept(BlocksRegistry.SANDSTONE_IONIC_CAPITAL_SMALL.get());

                        output.accept(Blocks.SMOOTH_RED_SANDSTONE);
                        output.accept(Blocks.SMOOTH_RED_SANDSTONE_STAIRS);
                        output.accept(Blocks.SMOOTH_RED_SANDSTONE_SLAB);
                        //output.accept(BlocksRegistry.SMOOTH_RED_SANDSTONE_WALL.get());

                        output.accept(Blocks.PRISMARINE_BRICKS);
                        output.accept(Blocks.PRISMARINE_BRICK_STAIRS);
                        output.accept(Blocks.PRISMARINE_BRICK_SLAB);
                        output.accept(BlocksRegistry.PRISMARINE_BRICK_WALL.get());

                        output.accept(Blocks.DARK_PRISMARINE);
                        output.accept(Blocks.DARK_PRISMARINE_STAIRS);
                        output.accept(Blocks.DARK_PRISMARINE_SLAB);
                        output.accept(BlocksRegistry.DARK_PRISMARINE_WALL.get());

                        output.accept(Blocks.NETHER_BRICKS);
                        output.accept(Blocks.NETHER_BRICK_STAIRS);
                        output.accept(Blocks.NETHER_BRICK_SLAB);
                        output.accept(Blocks.NETHER_BRICK_WALL);

                        output.accept(Blocks.RED_NETHER_BRICKS);
                        output.accept(Blocks.RED_NETHER_BRICK_STAIRS);
                        output.accept(Blocks.RED_NETHER_BRICK_SLAB);
                        output.accept(Blocks.RED_NETHER_BRICK_WALL);

                        output.accept(Blocks.POLISHED_BASALT);
                        output.accept(BlocksRegistry.POLISHED_BASALT_STAIRS.get());
                        output.accept(BlocksRegistry.POLISHED_BASALT_SLAB.get());
                        output.accept(BlocksRegistry.POLISHED_BASALT_WALL.get());

                        output.accept(Blocks.BLACKSTONE);
                        output.accept(Blocks.BLACKSTONE_STAIRS);
                        output.accept(Blocks.BLACKSTONE_SLAB);
                        output.accept(Blocks.BLACKSTONE_WALL);

                        output.accept(Blocks.POLISHED_BLACKSTONE);
                        output.accept(Blocks.POLISHED_BLACKSTONE_STAIRS);
                        output.accept(Blocks.POLISHED_BLACKSTONE_SLAB);
                        output.accept(Blocks.POLISHED_BLACKSTONE_WALL);

                        output.accept(Blocks.POLISHED_BLACKSTONE_BRICKS);
                        output.accept(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS);
                        output.accept(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB);
                        output.accept(Blocks.POLISHED_BLACKSTONE_BRICK_WALL);

                        output.accept(Blocks.GILDED_BLACKSTONE);
                        output.accept(BlocksRegistry.GILDED_BLACKSTONE_STAIRS.get());
                        output.accept(BlocksRegistry.GILDED_BLACKSTONE_SLAB.get());
                        output.accept(BlocksRegistry.GILDED_BLACKSTONE_WALL.get());
                        output.accept(BlocksRegistry.GILDED_BLACKSTONE_FINIAL.get());
                        output.accept(BlocksRegistry.GILDED_BLACKSTONE_PEDESTAL.get());
                        output.accept(BlocksRegistry.GILDED_BLACKSTONE_LAYER.get());
                        output.accept(BlocksRegistry.GILDED_BLACKSTONE_ARROWSLIT.get());

                        output.accept(Blocks.END_STONE_BRICKS);
                        output.accept(Blocks.END_STONE_BRICK_STAIRS);
                        output.accept(Blocks.END_STONE_BRICK_SLAB);
                        output.accept(Blocks.END_STONE_BRICK_WALL);

                        output.accept(Blocks.PURPUR_BLOCK);
                        output.accept(Blocks.PURPUR_STAIRS);
                        output.accept(Blocks.PURPUR_SLAB);
                        output.accept(BlocksRegistry.PURPUR_WALL.get());

                        output.accept(Blocks.QUARTZ_BRICKS);
                        output.accept(BlocksRegistry.QUARTZ_BRICK_STAIRS.get());
                        output.accept(BlocksRegistry.QUARTZ_BRICK_SLAB.get());
                        output.accept(BlocksRegistry.QUARTZ_BRICK_WALL.get());
                        output.accept(Blocks.SMOOTH_QUARTZ);
                        output.accept(Blocks.SMOOTH_QUARTZ_STAIRS);
                        output.accept(Blocks.SMOOTH_QUARTZ_SLAB);
                        output.accept(BlocksRegistry.SMOOTH_QUARTZ_WALL.get());
                        output.accept(BlocksRegistry.QUARTZ_IONIC_BASE_SMALL.get());
                        output.accept(BlocksRegistry.QUARTZ_COLUMN_SMALL.get());
                        output.accept(BlocksRegistry.QUARTZ_IONIC_CAPITAL_SMALL.get());

                        output.accept(ItemsRegistry.TEST_ITEM.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
