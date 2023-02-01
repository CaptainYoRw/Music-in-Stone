package com.mrclon_51.musicinstone.blocks;

import java.util.Random;

import javax.annotation.Nonnull;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.init.MusicinStoneBlocks;
import com.mrclon_51.musicinstone.util.RegistryUtil;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class StoneSlab extends BlockSlab
{
    public static final PropertyEnum<Variant> VARIANT = PropertyEnum.<Variant>create("variant", Variant.class);
    
    public StoneSlab(@Nonnull final String name)
    {
        super(Material.ROCK);
        RegistryUtil.setBlockName(this, name);
        setCreativeTab(MusicinStone.MISC);
        setHardness(1.5f);
        setResistance(10.0F);
        setSoundType(SoundType.STONE);
        setHarvestLevel("Pickaxe", 0);
        
        IBlockState iblockstate = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);
        
        if(!this.isDouble()) 
        {
            iblockstate.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
        }
        
        this.setDefaultState(iblockstate);
        this.useNeighborBrightness = !this.isDouble();
    }
    
    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        return MapColor.STONE;
    }

    @Override
    public String getUnlocalizedName(int meta)
    {
        return super.getUnlocalizedName();
    }

    @Override
    public IProperty<?> getVariantProperty()
    {
        return VARIANT;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack)
    {
        return  Variant.DEFAULT;
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) 
    {
        return Item.getItemFromBlock(MusicinStoneBlocks.STONE_SLAB_HALF);
    }
    
    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) 
    {
        return new ItemStack(MusicinStoneBlocks.STONE_SLAB_HALF);
    }
    
    @Override
    public final IBlockState getStateFromMeta(final int meta) 
    {
        IBlockState blockstate = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);
        
        if(!this.isDouble()) 
        {
            blockstate = blockstate.withProperty(HALF, ((meta&8)!=0)?EnumBlockHalf.TOP:EnumBlockHalf.BOTTOM);
        }
        
        return blockstate;
    }
    
    @Override
    public final int getMetaFromState(final IBlockState state) 
    {
        int meta = 0;
        
        if(!this.isDouble()&& state.getValue(HALF)==EnumBlockHalf.TOP) 
        {
            meta |= 8;
        }
        
        return meta;
    }
    
    @Override
    protected BlockStateContainer createBlockState() {
        if(!this.isDouble()){
            return new BlockStateContainer(this, new IProperty[] {VARIANT, HALF});
        }
        return new BlockStateContainer(this, new IProperty[] {VARIANT});
    }
    
    public static class Double extends StoneSlab
    {

        public Double(String name, Material material) {
            super(name);
        }

        @Override
        public boolean isDouble() {
            return true;
        }

    }

    public static class Half extends StoneSlab
    {

        public Half(String name) {
            super(name);
        }

        @Override
        public boolean isDouble() {
            return false;
        }

    }
    
    public static enum Variant implements IStringSerializable
    {
        DEFAULT;

        @Override
        public String getName() 
        {
            return "default";
        }
    
    }
}
