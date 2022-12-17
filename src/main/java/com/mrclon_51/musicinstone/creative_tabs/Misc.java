package com.mrclon_51.musicinstone.creative_tabs;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.init.MusicinStoneItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Misc extends CreativeTabs
{

	public Misc()
	{
		super(MusicinStone.MODID + "." + "misc");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(MusicinStoneItems.ARCH_TOOLS);
	}

}
