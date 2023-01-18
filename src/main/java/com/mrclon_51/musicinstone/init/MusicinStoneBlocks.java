package com.mrclon_51.musicinstone.init;

import javax.annotation.ParametersAreNonnullByDefault;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.blocks.GreySand;
import com.mrclon_51.musicinstone.blocks.GreySandstone;
import com.mrclon_51.musicinstone.blocks.GreySandstoneAll;
import com.mrclon_51.musicinstone.blocks.GreySandstoneChiseled;
import com.mrclon_51.musicinstone.blocks.GreySandstoneSmooth;
import com.mrclon_51.musicinstone.blocks.MysticalWiseTree;
import com.mrclon_51.musicinstone.blocks.PinkSand;
import com.mrclon_51.musicinstone.blocks.PinkSandstone;
import com.mrclon_51.musicinstone.blocks.PinkSandstoneAll;
import com.mrclon_51.musicinstone.blocks.PinkSandstoneChiseled;
import com.mrclon_51.musicinstone.blocks.PinkSandstoneSmooth;
import com.mrclon_51.musicinstone.blocks.RedSandstoneAll;
import com.mrclon_51.musicinstone.blocks.SandstoneAll;
import com.mrclon_51.musicinstone.blocks.Slate;
import com.mrclon_51.musicinstone.blocks.SlateCrushed;
import com.mrclon_51.musicinstone.blocks.SlatePolished;
import com.mrclon_51.musicinstone.blocks.StoneAll;

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
	public static final Block PINK_SAND = new PinkSand("pink_sand");
	public static final Block PINK_SANDSTONE = new PinkSandstone("pink_sandstone");
    public static final Block PINK_SANDSTONE_SMOOTH = new PinkSandstoneSmooth("pink_sandstone_smooth");
	public static final Block PINK_SANDSTONE_CHISELED = new PinkSandstoneChiseled("pink_sandstone_chiseled");
	public static final Block PINK_SANDSTONE_ALL = new PinkSandstoneAll("pink_sandstone_all");
	public static final Block STONE_ALL = new StoneAll("stone_all");
    public static final Block SLATE_CRUSHED = new SlateCrushed("slate_crushed");
	public static final Block SLATE = new Slate("slate");
	public static final Block SLATE_POLISHED = new SlatePolished("slate_polished");
	
	public static final Block MYSTICAL_WISE_TREE = new MysticalWiseTree("mystical_wise_tree");
	
}
