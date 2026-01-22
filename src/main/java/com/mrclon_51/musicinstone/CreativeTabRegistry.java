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
                        output.accept(BlocksRegistry.SMALL_ARCH_BRICKS.get());
                        output.accept(BlocksRegistry.WIDE_ARCH_BRICKS.get());




                        output.accept(ItemsRegistry.TEST_ITEM.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
