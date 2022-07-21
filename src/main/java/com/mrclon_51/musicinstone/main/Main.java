package com.mrclon_51.musicinstone.main;

import com.mrclon_51.musicinstone.init.ModBlocks;
import com.mrclon_51.musicinstone.proxy.IProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION, acceptedMinecraftVersions = Main.MC_VERSION)
public class Main 
{
	
	public static final String MODID = "musicinstone";
	public static final String NAME = "Music in Stone";
	public static final String VERSION = "0.1 alpha";
	public static final String MC_VERSION = "1.12.2";

	@Instance
	public static Main instance;

	@SidedProxy(clientSide = Main.CLIENT, serverSide = Main.SERVER)
	public static IProxy proxy;

	public static final String CLIENT = "com.mrclon_51.musicinstone.proxy.ClientProxy";
	public static final String SERVER = "com.mrclon_51.musicinstone.proxy.ServerProxy";

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		System.out.println(Main.MODID + ":preInit");
		ModBlocks.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		System.out.println(Main.MODID + ":Init");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		System.out.println(Main.MODID + ":postInit");
	}

}
