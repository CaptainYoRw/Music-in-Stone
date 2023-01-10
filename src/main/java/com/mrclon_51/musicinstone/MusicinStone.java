package com.mrclon_51.musicinstone;


import org.apache.logging.log4j.Logger;

import com.mrclon_51.musicinstone.creative_tabs.Misc;
import com.mrclon_51.musicinstone.proxy.IProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MusicinStone.MODID, name = MusicinStone.NAME, version = MusicinStone.VERSION, acceptedMinecraftVersions = MusicinStone.MC_VERSION)
public class MusicinStone 
{
	
	public static final String MODID = "musicinstone";
	public static final String NAME = "Music in Stone";
	public static final String VERSION = "0.1 alpha";
	public static final String MC_VERSION = "1.12.2";
	
	public static Logger logger;
	
	public static final CreativeTabs MISC = new Misc();

	@Instance
	public static MusicinStone instance;

	@SidedProxy(clientSide = MusicinStone.CLIENT, serverSide = MusicinStone.SERVER)
	public static IProxy proxy;

	public static final String CLIENT = "com.mrclon_51.musicinstone.proxy.ClientProxy";
	public static final String SERVER = "com.mrclon_51.musicinstone.proxy.ServerProxy";

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		System.out.println(MusicinStone.MODID + ":preInit");
		
		logger = event.getModLog();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		System.out.println(MusicinStone.MODID + ":Init");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		System.out.println(MusicinStone.MODID + ":postInit");
	}

}
