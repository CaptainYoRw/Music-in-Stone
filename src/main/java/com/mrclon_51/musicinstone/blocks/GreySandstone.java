package com.mrclon_51.musicinstone.blocks;

import java.util.Locale;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class GreySandstone extends Block
{
	
	public enum StoneType implements IStringSerializable
    {
        DEFAULT, CHISELED, SMOOTH;
        @Override
        public String getName()
        {
            return this.name().toLowerCase(Locale.ENGLISH);
        }
        @Override
        public String toString()
        {
            return this.getName();
        }
    }
	public static final PropertyEnum<StoneType> VARIANT = PropertyEnum.create("variant", StoneType.class);
	@Override
	protected BlockStateContainer createBlockState() 
	{
		 return new BlockStateContainer(this, VARIANT);
	}
	
	public String getStateName(IBlockState state)
    {
        switch ((StoneType) state.getValue(VARIANT))
        {
            case CHISELED:
                return "chiseled_grey_sandstone";
            case SMOOTH:
                return "smooth_grey_sandstone";
            default:
                return "grey_sandstone";
        }
    }
	
	public GreySandstone()
    {
        super(Material.ROCK);
        this.setHardness(0.8F);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 0);
        this.setDefaultState( this.blockState.getBaseState().withProperty(VARIANT, StoneType.DEFAULT) );
    }
	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess world, BlockPos pos)
	{
		return MapColor.SILVER_STAINED_HARDENED_CLAY;
	}
	
}
