package com.mrclon_51.musicinstone.blocks;

import javax.annotation.Nonnull;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.util.RegistryUtil;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Neliperal extends BlockFalling
{
	
	public Neliperal(@Nonnull final String name)
	{
		super(Material.SAND);
		RegistryUtil.setBlockName(this, name);
		setCreativeTab(MusicinStone.MISC);
		setHardness(0.2f);
		setResistance(2000.0F);
		setSoundType(SoundType.PLANT);
		setBurning();
	}	
	
	@Override
    public MapColor getMapColor(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        return MapColor.GREEN;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public int getDustColor(IBlockState state)
    {
        return 12114690;
    }
    
    public Block setBurning() 
	{
        Blocks.FIRE.setFireInfo(this, 30, 60);
        return this;
    }
    //Sosy
}
