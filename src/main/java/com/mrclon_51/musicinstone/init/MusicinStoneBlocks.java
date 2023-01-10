package com.mrclon_51.musicinstone.init;

import javax.annotation.ParametersAreNonnullByDefault;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.blocks.GreySand;
//import com.mrclon_51.musicinstone.blocks.GreySandstone;
import com.mrclon_51.musicinstone.blocks.MysticalWiseTree;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(MusicinStone.MODID)
@ParametersAreNonnullByDefault
public class MusicinStoneBlocks
{
    
	public static final Block GREY_SAND = new GreySand("grey_sand");
	//public static final Block GREY_SANDSTONE = new GreySandstone("grey_sandstone");
	public static final Block MYSTICAL_WISE_TREE = new MysticalWiseTree("mystical_wise_tree");
	
}
