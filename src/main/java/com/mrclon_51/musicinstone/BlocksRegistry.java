package com.mrclon_51.musicinstone;

import com.mrclon_51.musicinstone.block.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlocksRegistry
{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MusicinStone.MODID);

    public static final RegistryObject<Block> BRICKS_FANCY = registerBlock("bricks_fancy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BRICKS_LONG = registerBlock("bricks_long",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BRICKS_LONG_STACK = registerBlock("bricks_long_stack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BRICKS_ROMAN = registerBlock("bricks_roman",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BRICKS_ROMAN_STACK = registerBlock("bricks_roman_stack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BRICKS_TILES = registerBlock("bricks_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BRICKS_TILES_STACK = registerBlock("bricks_tiles_stack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BRICKS_WIDE_ARCH = registerBlock("bricks_wide_arch",
        () -> new BlockOffsettable(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICKS_SMALL_ARCH = registerBlock("bricks_small_arch",
            () -> new BlockOffsettable(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICKS_SEGMENTAL_ARCH = registerBlock("bricks_segmental_arch",
            () -> new BlockOffsettable(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICKS_LARGE_ARCH = registerBlock("bricks_large_arch",
            () -> new BlockSideChangeable(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICKS_JACK_ARCH = registerBlock("bricks_jack_arch",
            () -> new BlockOffsettable(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICKS_ROWLOCK_ARCH = registerBlock("bricks_rowlock_arch",
            () -> new BlockOffsettable(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<SlabBlock> BRICK_FANCY_SLAB = registerBlock("brick_fancy_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB)));
    public static final RegistryObject<StairBlock> BRICK_FANCY_STAIRS = registerBlock("brick_fancy_stairs",
            () -> new StairBlock(() -> BlocksRegistry.BRICKS_FANCY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<WallBlock> BRICK_FANCY_WALL = registerBlock("brick_fancy_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL)));
    public static final RegistryObject<Block> BRICKS_ROMAN_TRIPLE = registerBlock("bricks_roman_triple",
            () -> new BlockTripleRepeatable(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BRICKS_ROAD = registerBlock("bricks_road",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BRICK_FLORENTINE_ARCH = registerBlock("brick_florentine_arch",
            () -> new BlockOffsettable(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_FLORENTINE_POINTED_ARCH = registerBlock("brick_florentine_pointed_arch",
            () -> new BlockOffsettable(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_LARGE_FLORENTINE_ARCH = registerBlock("brick_large_florentine_arch",
            () -> new BlockSideChangeable(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_LARGE_FLORENTINE_POINTED_ARCH = registerBlock("brick_large_florentine_pointed_arch",

            () -> new BlockSideChangeable(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> QUARTZ_COLUMN_SMALL = registerBlock("quartz_column_small",
            () -> new BlockColumnSmall(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> QUARTZ_IONIC_CAPITAL_SMALL = registerBlock("quartz_ionic_capital_small",
            () -> new BlockColumnCapital(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> QUARTZ_IONIC_BASE_SMALL = registerBlock("quartz_ionic_base_small",
            () -> new BlockColumnBase(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_IONIC_BASE_SMALL = registerBlock("sandstone_ionic_base_small",
            () -> new BlockColumnBase(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_CAPITAL_SMALL = registerBlock("sandstone_ionic_capital_small",
            () -> new BlockColumnCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> BRICK_FINIAL = registerBlock("brick_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_PEDESTAL = registerBlock("brick_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<SlabBlock> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_SLAB)));
    public static final RegistryObject<StairBlock> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairBlock(() -> BlocksRegistry.BRICKS_FANCY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_STAIRS)));
    public static final RegistryObject<WallBlock> QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));
    public static final RegistryObject<WallBlock> SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));
    public static final RegistryObject<WallBlock> PURPUR_WALL = registerBlock("purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)));
    public static final RegistryObject<Block> BRICK_LAYER = registerBlock("brick_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));


    public static final RegistryObject<Block> BRICK_FANCY_FINIAL = registerBlock("brick_fancy_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_FANCY_PEDESTAL = registerBlock("brick_fancy_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<SlabBlock> BRICK_TILES_SLAB = registerBlock("brick_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB)));
    public static final RegistryObject<StairBlock> BRICK_TILES_STAIRS = registerBlock("brick_tiles_stairs",
            () -> new StairBlock(() -> BlocksRegistry.BRICKS_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<WallBlock> BRICK_TILES_WALL = registerBlock("brick_tiles_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL)));
    public static final RegistryObject<Block> BRICK_TILES_FINIAL = registerBlock("brick_tiles_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_TILES_PEDESTAL = registerBlock("brick_tiles_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<SlabBlock> BRICK_TILES_STACK_SLAB = registerBlock("brick_tiles_stack_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB)));
    public static final RegistryObject<StairBlock> BRICK_TILES_STACK_STAIRS = registerBlock("brick_tiles_stack_stairs",
            () -> new StairBlock(() -> BlocksRegistry.BRICKS_TILES_STACK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<WallBlock> BRICK_TILES_STACK_WALL = registerBlock("brick_tiles_stack_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL)));
    public static final RegistryObject<Block> BRICK_TILES_STACK_FINIAL = registerBlock("brick_tiles_stack_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_TILES_STACK_PEDESTAL = registerBlock("brick_tiles_stack_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<SlabBlock> BRICK_ROMAN_SLAB = registerBlock("brick_roman_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB)));
    public static final RegistryObject<StairBlock> BRICK_ROMAN_STAIRS = registerBlock("brick_roman_stairs",
            () -> new StairBlock(() -> BlocksRegistry.BRICKS_ROMAN.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<WallBlock> BRICK_ROMAN_WALL = registerBlock("brick_roman_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL)));
    public static final RegistryObject<Block> BRICK_ROMAN_FINIAL = registerBlock("brick_roman_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_ROMAN_PEDESTAL = registerBlock("brick_roman_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<SlabBlock> BRICK_ROMAN_STACK_SLAB = registerBlock("brick_roman_stack_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB)));
    public static final RegistryObject<StairBlock> BRICK_ROMAN_STACK_STAIRS = registerBlock("brick_roman_stack_stairs",
            () -> new StairBlock(() -> BlocksRegistry.BRICKS_ROMAN_STACK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<WallBlock> BRICK_ROMAN_STACK_WALL = registerBlock("brick_roman_stack_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL)));
    public static final RegistryObject<Block> BRICK_ROMAN_STACK_FINIAL = registerBlock("brick_roman_stack_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_ROMAN_STACK_PEDESTAL = registerBlock("brick_roman_stack_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<SlabBlock> GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE)));
    public static final RegistryObject<StairBlock> GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs",
            () -> new StairBlock(() -> Blocks.GILDED_BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE)));
    public static final RegistryObject<WallBlock> GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE).sound(SoundType.GILDED_BLACKSTONE)));

    public static final RegistryObject<WallBlock> PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)));
    public static final RegistryObject<WallBlock> DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

    public static final RegistryObject<WallBlock> STONE_WALL = registerBlock("stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)));
    public static final RegistryObject<WallBlock> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)));
    public static final RegistryObject<WallBlock> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)));

    public static final RegistryObject<Block> GILDED_BLACKSTONE_FINIAL = registerBlock("gilded_blackstone_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_PEDESTAL = registerBlock("gilded_blackstone_stack_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<SlabBlock> BRICK_LONG_SLAB = registerBlock("brick_long_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB)));
    public static final RegistryObject<StairBlock> BRICK_LONG_STAIRS = registerBlock("brick_long_stairs",
            () -> new StairBlock(() -> BlocksRegistry.BRICKS_ROMAN.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<WallBlock> BRICK_LONG_WALL = registerBlock("brick_long_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL)));
    public static final RegistryObject<Block> BRICK_LONG_FINIAL = registerBlock("brick_long_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_LONG_PEDESTAL = registerBlock("brick_long_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<SlabBlock> BRICK_LONG_STACK_SLAB = registerBlock("brick_long_stack_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB)));
    public static final RegistryObject<StairBlock> BRICK_LONG_STACK_STAIRS = registerBlock("brick_long_stack_stairs",
            () -> new StairBlock(() -> BlocksRegistry.BRICKS_ROMAN.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<WallBlock> BRICK_LONG_STACK_WALL = registerBlock("brick_long_stack_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL)));
    public static final RegistryObject<Block> BRICK_LONG_STACK_FINIAL = registerBlock("brick_long_stack_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_LONG_STACK_PEDESTAL = registerBlock("brick_long_stack_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<SlabBlock> BRICK_ROAD_SLAB = registerBlock("brick_road_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB)));
    public static final RegistryObject<StairBlock> BRICK_ROAD_STAIRS = registerBlock("brick_road_stairs",
            () -> new StairBlock(() -> BlocksRegistry.BRICKS_ROAD.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> BRICK_FANCY_LAYER = registerBlock("brick_fancy_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_TILES_LAYER = registerBlock("brick_tiles_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_TILES_STACK_LAYER = registerBlock("brick_tiles_stack_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_ROMAN_LAYER = registerBlock("brick_roman_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_ROMAN_STACK_LAYER = registerBlock("brick_roman_stack_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_LONG_LAYER = registerBlock("brick_long_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_LONG_STACK_LAYER = registerBlock("brick_long_stack_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_ROAD_LAYER = registerBlock("brick_road_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> BRICK_ARROWSLIT = registerBlock("brick_arrowslit",
            () -> new BlockArrowslit(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> COBBLESTONE_FINIAL = registerBlock("cobblestone_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> COBBLESTONE_PEDESTAL = registerBlock("cobblestone_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> COBBLESTONE_LAYER = registerBlock("cobblestone_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> COBBLESTONE_ARROWSLIT = registerBlock("cobblestone_arrowslit",
            () -> new BlockArrowslit(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> COBBLESTONE_CROSS_ARROWSLIT = registerBlock("cobblestone_cross_arrowslit",
            () -> new BlockCrossArrowslit(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> GILDED_BLACKSTONE_LAYER = registerBlock("gilded_blackstone_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_ARROWSLIT = registerBlock("gilded_blackstone_arrowslit",
            () -> new BlockArrowslit(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<SlabBlock> POLISHED_BASALT_SLAB = registerBlock("polished_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT)));
    public static final RegistryObject<StairBlock> POLISHED_BASALT_STAIRS = registerBlock("polished_basalt_stairs",
            () -> new StairBlock(() -> Blocks.POLISHED_BASALT.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<WallBlock> POLISHED_BASALT_WALL = registerBlock("polished_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT)));

    public static final RegistryObject<Block> SANDSTONE_COLUMN_SMALL = registerBlock("sandstone_column_small",
            () -> new BlockColumnSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> STONE_FINIAL = registerBlock("stone_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> STONE_PEDESTAL = registerBlock("stone_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> STONE_LAYER = registerBlock("stone_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> STONE_ARROWSLIT = registerBlock("stone_arrowslit",
            () -> new BlockArrowslit(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> STONE_CROSS_ARROWSLIT = registerBlock("stone_cross_arrowslit",
            () -> new BlockCrossArrowslit(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> STONE_BRICK_FINIAL = registerBlock("stone_brick_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> STONE_BRICK_PEDESTAL = registerBlock("stone_brick_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> STONE_BRICK_LAYER = registerBlock("stone_brick_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> STONE_BRICK_ARROWSLIT = registerBlock("stone_brick_arrowslit",
            () -> new BlockArrowslit(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> STONE_BRICK_CROSS_ARROWSLIT = registerBlock("stone_brick_cross_arrowslit",
            () -> new BlockCrossArrowslit(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ItemsRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
