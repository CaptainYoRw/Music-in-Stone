package com.mrclon_51.musicinstone.datagen;

import com.mrclon_51.musicinstone.MusicinStone;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MusicinStone.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class DataGenerators
{

        @SubscribeEvent
        public static void gatherData(GatherDataEvent event)
        {
            DataGenerator generator = event.getGenerator();
            PackOutput packOutput = generator.getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

            generator.addProvider(event.includeClient(), new ModBlockstateProvider(packOutput, existingFileHelper));

            generator.addProvider(event.includeClient(), new ModRecipeProvider(packOutput));

            generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));

            generator.addProvider(event.includeClient(), new ModBlockTagsProvider(packOutput, event.getLookupProvider(), event.getExistingFileHelper()));
        }
    }
