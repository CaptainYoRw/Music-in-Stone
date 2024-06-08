package com.mrclon_51.musicinstone.init;

import javax.annotation.ParametersAreNonnullByDefault;

import com.mrclon_51.musicinstone.MusicinStone;
import com.mrclon_51.musicinstone.blocks.BlockWallMiS;
import com.mrclon_51.musicinstone.blocks.Diabase;
import com.mrclon_51.musicinstone.blocks.DiabasePolished;
import com.mrclon_51.musicinstone.blocks.GreySand;
import com.mrclon_51.musicinstone.blocks.GreySandstone;
import com.mrclon_51.musicinstone.blocks.GreySandstoneAll;
import com.mrclon_51.musicinstone.blocks.GreySandstoneChiseled;
import com.mrclon_51.musicinstone.blocks.GreySandstoneSmooth;
import com.mrclon_51.musicinstone.blocks.MysticalWiseTree;
import com.mrclon_51.musicinstone.blocks.Neliperal;
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
import com.mrclon_51.musicinstone.blocks.StoneSlab;
import com.mrclon_51.musicinstone.blocks.StoneStairs;
import com.mrclon_51.musicinstone.blocks.StoneStairsPolished;
import com.mrclon_51.musicinstone.blocks.StoneTilesIrregular;
import com.mrclon_51.musicinstone.blocks.StoneTilesRegular;
import com.mrclon_51.musicinstone.blocks.StoneWall;
import com.mrclon_51.musicinstone.blocks.StoneWallPolished;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(MusicinStone.MODID)
@ParametersAreNonnullByDefault
public class MusicinStoneBlocks
{
    //Vanilla extension
    public static final Block SANDSTONE_ALL = new SandstoneAll("sandstone_all");
    public static final Block RED_SANDSTONE_ALL = new RedSandstoneAll("red_sandstone_all");
    public static final BlockSlab STONE_SLAB_HALF = new StoneSlab.Half("stone_slab_half");
    public static final BlockSlab STONE_SLAB_DOUBLE = new StoneSlab.Double("stone_slab_double", Material.ROCK);
    public static final BlockStairs STONE_STAIRS = new StoneStairs("stone_stairs", Blocks.STONE);
    public static final BlockWallMiS STONE_WALL = new StoneWall("stone_wall");
    public static final Block STONE_ALL = new StoneAll("stone_all");
    public static final Block STONE_TILES_REGULAR = new StoneTilesRegular("stone_tiles_regular");
    public static final Block STONE_TILES_IRREGULAR = new StoneTilesIrregular("stone_tiles_irregular");
    public static final BlockStairs STONE_STAIRS_POLISHED = new StoneStairsPolished("stone_stairs_polished", Blocks.STONE_SLAB);
    public static final BlockWallMiS STONE_WALL_POLISHED = new StoneWallPolished("stone_wall_polished");
    //Original blocks
    public static final BlockFalling GREY_SAND = new GreySand("grey_sand");
	public static final Block GREY_SANDSTONE = new GreySandstone("grey_sandstone");
	public static final Block GREY_SANDSTONE_CHISELED = new GreySandstoneChiseled("grey_sandstone_chiseled");
	public static final Block GREY_SANDSTONE_SMOOTH = new GreySandstoneSmooth("grey_sandstone_smooth");
	public static final Block GREY_SANDSTONE_ALL = new GreySandstoneAll("grey_sandstone_all");
	public static final BlockFalling PINK_SAND = new PinkSand("pink_sand");
	public static final Block PINK_SANDSTONE = new PinkSandstone("pink_sandstone");
	public static final Block PINK_SANDSTONE_CHISELED = new PinkSandstoneChiseled("pink_sandstone_chiseled");
    public static final Block PINK_SANDSTONE_SMOOTH = new PinkSandstoneSmooth("pink_sandstone_smooth");
	public static final Block PINK_SANDSTONE_ALL = new PinkSandstoneAll("pink_sandstone_all");
    public static final Block SLATE_CRUSHED = new SlateCrushed("slate_crushed");
	public static final BlockRotatedPillar SLATE = new Slate("slate");
	public static final Block SLATE_POLISHED = new SlatePolished("slate_polished");
	public static final Block DIABASE = new Diabase("diabase");
	public static final Block DIABASE_POLISHED = new DiabasePolished("diabase_polished");
	/**
	public static final Block RUBBLESTONE = new Rubblestone("rubblestone");
	public static final Block RUBBLESTONE_WALL = new RubblestoneWall("rubblestone_wall");
	public static final Block LIMESTONE = new Limestone("limestone");
	public static final Block LIMESTONE_BRICKS_MEDIUM = new LimestoneBricksMedium("limestone_bricks_medium");
	public static final Block LIMESTONE_BRICKS = new LimestoneBricks("limestone_bricks");
	public static final Block BASALT = new Basalt("basalt");
	public static final Block DIABASE = new Diabase("diabase");
	
	public static final Block GRAY_GRANITE = new GrayGranite("gray_granite");
	public static final Block GRAY_GRANITE_POLISHED = new GrayGranitePolished("gray_granite_polished");
	public static final Block BLACK_GRANITE = new BlackGranite("black_granite");
	public static final Block BLACK_GRANITE_POLISHED = new BlackGranitePolished("black_granite_polished");

    public static final Block TUFF = new Tuff("tuff");
    public static final Block TUFF_POLISHED = new TuffPolished("tuff_polished");
    public static final Block PINK_TUFF = new PinkTuff("pink_tuff");
    public static final Block PINK_TUFF_POLISHED = new PinkTuffPolished("pink_tuff_polished");
    public static final Block BLACK_TUFF = new BlackTuff("black_tuff");
    public static final Block BLACK_TUFF_POLISHED = new BlackTuffPolished("black_tuff_polished");
	
	public static final Block MARBLE = new Marble("marble");
	public static final Block MARBLE_POLISHED = new MarblePolished("marble_polished");
	public static final Block GREEN_MARBLE = new GreenMarble("green_marble");
    public static final Block GREEN_MARBLE_POLISHED = new GreenMarblePolished("green_marble_polished");
    public static final Block PINK_MARBLE = new PinkMarble("pink_marble");
    public static final Block PINK_MARBLE_POLISHED = new PinkMarblePolished("pink_marble_polished");
    public static final Block RED_MARBLE = new RedMarble("red_marble");
    public static final Block RED_MARBLE_POLISHED = new RedMarblePolished("red_marble_polished");
    public static final Block BLACK_MARBLE = new BlackMarble("black_marble");
    public static final Block BLACK_MARBLE_POLISHED = new BlackMarblePolished("marble_polished");
	**/
	//Test objects
	public static final Block MYSTICAL_WISE_TREE = new MysticalWiseTree("mystical_wise_tree");
	public static final Block NELIPERAL = new Neliperal("neliperal");
}
