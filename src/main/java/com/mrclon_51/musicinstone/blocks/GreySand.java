package com.mrclon_51.musicinstone.blocks;

import javax.annotation.Nonnull;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.util.RegistryUtil;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GreySand extends BlockFalling
{
	
	public GreySand(@Nonnull final String name)
	{
		super(Material.SAND);
		RegistryUtil.setBlockName(this, name);
		setCreativeTab(MusicinStone.MISC);
		setHardness(0.5f);
		setSoundType(SoundType.SAND);
	}	
	
	@Override
    public MapColor getMapColor(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        return MapColor.SILVER_STAINED_HARDENED_CLAY;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public int getDustColor(IBlockState state)
    {
        return -8221799;
    }
	
}
