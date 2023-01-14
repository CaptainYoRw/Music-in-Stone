package com.mrclon_51.musicinstone.init;

import javax.annotation.ParametersAreNonnullByDefault;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.blocks.GreySand;
import com.mrclon_51.musicinstone.blocks.GreySandstone;
import com.mrclon_51.musicinstone.blocks.GreySandstoneAll;
import com.mrclon_51.musicinstone.blocks.GreySandstoneChiseled;
import com.mrclon_51.musicinstone.blocks.GreySandstoneSmooth;
import com.mrclon_51.musicinstone.blocks.MysticalWiseTree;
import com.mrclon_51.musicinstone.blocks.RedSandstoneAll;
import com.mrclon_51.musicinstone.blocks.SandstoneAll;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(MusicinStone.MODID)
@ParametersAreNonnullByDefault
public class MusicinStoneBlocks
{
    
	public static final Block GREY_SAND = new GreySand("grey_sand");
	public static final Block GREY_SANDSTONE = new GreySandstone("grey_sandstone");
	public static final Block GREY_SANDSTONE_SMOOTH = new GreySandstoneSmooth("grey_sandstone_smooth");
	public static final Block GREY_SANDSTONE_CHISELED = new GreySandstoneChiseled("grey_sandstone_chiseled");
	public static final Block GREY_SANDSTONE_ALL = new GreySandstoneAll("grey_sandstone_all");
	public static final Block SANDSTONE_ALL = new SandstoneAll("sandstone_all");
	public static final Block RED_SANDSTONE_ALL = new RedSandstoneAll("red_sandstone_all");
	public static final Block MYSTICAL_WISE_TREE = new MysticalWiseTree("mystical_wise_tree");
	
}
