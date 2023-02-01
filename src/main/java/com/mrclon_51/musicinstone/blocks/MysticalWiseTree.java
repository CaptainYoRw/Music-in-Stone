package com.mrclon_51.musicinstone.blocks;

import java.util.List;

import javax.annotation.Nonnull;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.util.RegistryUtil;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MysticalWiseTree extends Block
{

	public MysticalWiseTree(@Nonnull final String name)
	{
	    super(Material.WOOD);
	    RegistryUtil.setBlockName(this, name);
	    setCreativeTab(MusicinStone.MISC);
	    setHardness(10.0f);
	    setSoundType(SoundType.SNOW);
	    setHarvestLevel("Axe", 3);
	    setResistance(100);
	    setBurning();
        
	}
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) 
	{
        super.addInformation(stack, worldIn, tooltip, flagIn);

        tooltip.add(I18n.format("tooltip.musicinstone.mystical_wise_tree"));
    }
	
	public Block setBurning() 
	{
        Blocks.FIRE.setFireInfo(this, 5, 20);
        return this;
    }
	
}
