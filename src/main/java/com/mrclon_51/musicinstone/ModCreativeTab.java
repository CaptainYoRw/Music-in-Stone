package com.mrclon_51.musicinstone;

import com.mrclon_51.musicinstone.block.ModBlocks;
import com.mrclon_51.musicinstone.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MusicinStone.MODID);

    public static final RegistryObject<CreativeModeTab> MUSICINSTONE_TAB = CREATIVE_MODE_TABS.register("musicinstone_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.TEST_ITEM.get()))
                    .title(Component.translatable("creativetab.musicinstone_tab"))
                    .displayItems((fParameters, fOutput) ->
                    {
                        fOutput.accept(ModBlocks.TH_BRICK_ARCH.get());



                        fOutput.accept(ModItems.TEST_ITEM.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
