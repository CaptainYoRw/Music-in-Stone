package com.mrclon_51.musicinstone.item;

import com.mrclon_51.musicinstone.MusicinStone;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS=
                DeferredRegister.create(ForgeRegistries.ITEMS, MusicinStone.MODID);

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
