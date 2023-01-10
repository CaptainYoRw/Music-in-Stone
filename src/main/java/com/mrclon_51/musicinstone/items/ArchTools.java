package com.mrclon_51.musicinstone.items;

import java.util.List;

import javax.annotation.Nonnull;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.util.RegistryUtil;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ArchTools extends Item
{	
    
	public ArchTools(@Nonnull final String name)
	{
	    RegistryUtil.setItemName(this, name);
	    setCreativeTab(MusicinStone.MISC);
	}
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) 
	{
        super.addInformation(stack, worldIn, tooltip, flagIn);

        tooltip.add(I18n.format("Some description"));
	}
	
}
