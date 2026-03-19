package com.mrclon_51.musicinstone;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

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
                        output.accept(Blocks.BRICKS);
                        output.accept(BlocksRegistry.BRICKS_FANCY.get());
                        output.accept(BlocksRegistry.BRICKS_TILES.get());
                        output.accept(BlocksRegistry.BRICKS_TILES_STACK.get());
                        output.accept(BlocksRegistry.BRICKS_ROMAN.get());
                        output.accept(BlocksRegistry.BRICKS_ROMAN_STACK.get());
                        output.accept(BlocksRegistry.BRICKS_ROMAN_STONE.get());
                        output.accept(BlocksRegistry.BRICKS_LONG.get());
                        output.accept(BlocksRegistry.BRICKS_LONG_STACK.get());

                        output.accept(Blocks.BRICK_SLAB);
                        output.accept(BlocksRegistry.BRICK_FANCY_SLAB.get());
                        output.accept(Blocks.BRICK_STAIRS);
                        output.accept(BlocksRegistry.BRICK_FANCY_STAIRS.get());
                        output.accept(Blocks.BRICK_WALL);
                        output.accept(BlocksRegistry.BRICK_FANCY_WALL.get());

                        output.accept(BlocksRegistry.SEGMENTAL_ARCH_BRICKS.get());
                        output.accept(BlocksRegistry.JACK_ARCH_BRICKS.get());
                        output.accept(BlocksRegistry.SMALL_ARCH_BRICKS.get());
                        output.accept(BlocksRegistry.ROWLOCK_ARCH_BRICKS.get());
                        output.accept(BlocksRegistry.WIDE_ARCH_BRICKS.get());
                        output.accept(BlocksRegistry.LARGE_ARCH_BRICKS.get());

                        output.accept(BlocksRegistry.TEST_COLUMN_A.get());
                        output.accept(BlocksRegistry.TEST_COLUMN_B.get());

                        output.accept(ItemsRegistry.TEST_ITEM.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
