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
    public static final RegistryObject<Block> QUARTZ_FLUTED_COLUMN_SMALL = registerBlock("quartz_fluted_column_small",
            () -> new BlockColumnSmall(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> QUARTZ_IONIC_CAPITAL_SMALL = registerBlock("quartz_ionic_capital_small",
            () -> new BlockIonicCapitalSmall(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> QUARTZ_IONIC_BASE_SMALL = registerBlock("quartz_ionic_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> BRICK_FINIAL = registerBlock("brick_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_PEDESTAL = registerBlock("brick_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<SlabBlock> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_SLAB)));
    public static final RegistryObject<StairBlock> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairBlock(() -> Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_STAIRS)));
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

    public static final RegistryObject<Block> QUARTZ_DORIC_CAPITAL_SMALL = registerBlock("quartz_doric_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> QUARTZ_FLUTED_COLUMN_MEDIUM = registerBlock("quartz_fluted_column_medium",
            () -> new BlockColumn(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> QUARTZ_FLUTED_COLUMN_LARGE = registerBlock("quartz_fluted_column_large",
            () -> new BlockColumnLarge(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> QUARTZ_FLUTED_COLUMN_GIANT = registerBlock("quartz_fluted_column_giant",
            () -> new BlockColumnGiant(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> QUARTZ_IONIC_BASE_MEDIUM = registerBlock("quartz_ionic_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> QUARTZ_IONIC_CAPITAL_MEDIUM = registerBlock("quartz_ionic_capital_medium",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> QUARTZ_IONIC_CAPITAL_LARGE = registerBlock("quartz_ionic_capital_large",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> QUARTZ_IONIC_BASE_LARGE = registerBlock("quartz_ionic_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> QUARTZ_CORNER_IONIC_CAPITAL_SMALL = registerBlock("quartz_corner_ionic_capital_small",
            () -> new BlockIonicCapitalSmall(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> QUARTZ_ROMAN_IONIC_CAPITAL_SMALL = registerBlock("quartz_roman_ionic_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> QUARTZ_SCAMOZZI_IONIC_CAPITAL_SMALL = registerBlock("quartz_scamozzi_ionic_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> MULTICOLORED_CLINKER_BRICKS = registerBlock("multicolored_clinker_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CLINKER_BRICKS = registerBlock("clinker_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> QUARTZ_GREEK_CORINTHIAN_CAPITAL_SMALL = registerBlock("quartz_greek_corinthian_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<SlabBlock> CLINKER_BRICK_SLAB = registerBlock("clinker_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<StairBlock> CLINKER_BRICK_STAIRS = registerBlock("clinker_brick_stairs",
            () -> new StairBlock(() -> Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<WallBlock> CLINKER_BRICK_WALL = registerBlock("clinker_brick__wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CLINKER_BRICK_FINIAL = registerBlock("clinker_brick_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> CLINKER_BRICK_PEDESTAL = registerBlock("clinker_brick_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> CLINKER_BRICK_LAYER = registerBlock("clinker_brick_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> CLINKER_BRICK_ARROWSLIT = registerBlock("clinker_brick_arrowslit",
            () -> new BlockArrowslit(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> CLINKER_BRICK_CROSS_ARROWSLIT = registerBlock("clinker_brick_cross_arrowslit",
            () -> new BlockCrossArrowslit(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> GILDED_BLACKSTONE_COLUMN_SMALL = registerBlock("gilded_blackstone_column_small",
            () -> new BlockColumnSmall(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

     public static final RegistryObject<Block> GOLD_GREEK_CORINTHIAN_CAPITAL_SMALL = registerBlock("gold_greek_corinthian_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> GOLD_CORNER_IONIC_CAPITAL_SMALL = registerBlock("gold_corner_ionic_capital_small",
            () -> new BlockIonicCapitalSmall(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> GOLD_ROMAN_IONIC_CAPITAL_SMALL = registerBlock("gold_roman_ionic_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> GOLD_SCAMOZZI_IONIC_CAPITAL_SMALL = registerBlock("gold_scamozzi_ionic_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> GOLD_IONIC_BASE_SMALL = registerBlock("gold_ionic_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> GOLD_IONIC_CAPITAL_SMALL = registerBlock("gold_ionic_capital_small",
            () -> new BlockIonicCapitalSmall(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> GRANITE_FINIAL = registerBlock("granite_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.GRANITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> GRANITE_PEDESTAL = registerBlock("granite_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.GRANITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> GRANITE_LAYER = registerBlock("granite_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> GRANITE_ARROWSLIT = registerBlock("granite_arrowslit",
            () -> new BlockArrowslit(BlockBehaviour.Properties.copy(Blocks.GRANITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> GRANITE_CROSS_ARROWSLIT = registerBlock("granite_cross_arrowslit",
            () -> new BlockCrossArrowslit(BlockBehaviour.Properties.copy(Blocks.GRANITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> POLISHED_GRANITE_FINIAL = registerBlock("polished_granite_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> POLISHED_GRANITE_PEDESTAL = registerBlock("polished_granite_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> POLISHED_GRANITE_LAYER = registerBlock("polished_granite_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> POLISHED_GRANITE_ARROWSLIT = registerBlock("polished_granite_arrowslit",
            () -> new BlockArrowslit(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> POLISHED_GRANITE_CROSS_ARROWSLIT = registerBlock("polished_granite_cross_arrowslit",
            () -> new BlockCrossArrowslit(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_FINIAL = registerBlock("diorite_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_PEDESTAL = registerBlock("diorite_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_LAYER = registerBlock("diorite_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ARROWSLIT = registerBlock("diorite_arrowslit",
            () -> new BlockArrowslit(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_CROSS_ARROWSLIT = registerBlock("diorite_cross_arrowslit",
            () -> new BlockCrossArrowslit(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> POLISHED_DIORITE_FINIAL = registerBlock("polished_diorite_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> POLISHED_DIORITE_PEDESTAL = registerBlock("polished_diorite_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> POLISHED_DIORITE_LAYER = registerBlock("polished_diorite_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> POLISHED_DIORITE_ARROWSLIT = registerBlock("polished_diorite_arrowslit",
            () -> new BlockArrowslit(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> POLISHED_DIORITE_CROSS_ARROWSLIT = registerBlock("polished_diorite_cross_arrowslit",
            () -> new BlockCrossArrowslit(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> ANDESITE_FINIAL = registerBlock("andesite_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.ANDESITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> ANDESITE_PEDESTAL = registerBlock("andesite_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.ANDESITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> ANDESITE_LAYER = registerBlock("andesite_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> ANDESITE_ARROWSLIT = registerBlock("andesite_arrowslit",
            () -> new BlockArrowslit(BlockBehaviour.Properties.copy(Blocks.ANDESITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> ANDESITE_CROSS_ARROWSLIT = registerBlock("andesite_cross_arrowslit",
            () -> new BlockCrossArrowslit(BlockBehaviour.Properties.copy(Blocks.ANDESITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> POLISHED_ANDESITE_FINIAL = registerBlock("polished_andesite_finial",
            () -> new BlockFinial(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> POLISHED_ANDESITE_PEDESTAL = registerBlock("polished_andesite_pedestal",
            () -> new BlockPedestal(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> POLISHED_ANDESITE_LAYER = registerBlock("polished_andesite_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> POLISHED_ANDESITE_ARROWSLIT = registerBlock("polished_andesite_arrowslit",
            () -> new BlockArrowslit(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> POLISHED_ANDESITE_CROSS_ARROWSLIT = registerBlock("polished_andesite_cross_arrowslit",
            () -> new BlockCrossArrowslit(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));



    public static final RegistryObject<Block> SANDSTONE_COLUMN_SMALL = registerBlock("sandstone_column_small",
            () -> new BlockColumnSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_COLUMN_REGULAR = registerBlock("sandstone_column_regular",
            () -> new BlockColumnRegular(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_COLUMN_MEDIUM = registerBlock("sandstone_column_medium",
            () -> new BlockColumn(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_COLUMN_LARGE = registerBlock("sandstone_column_large",
            () -> new BlockColumnLarge(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_COLUMN_GIANT = registerBlock("sandstone_column_giant",
            () -> new BlockColumnGiant(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_DORIC_COLUMN_SMALL = registerBlock("sandstone_doric_column_small",
            () -> new BlockColumnSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_COLUMN_REGULAR = registerBlock("sandstone_doric_column_regular",
            () -> new BlockColumnRegular(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_COLUMN_MEDIUM = registerBlock("sandstone_doric_column_medium",
            () -> new BlockColumn(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_COLUMN_LARGE = registerBlock("sandstone_doric_column_large",
            () -> new BlockColumnLarge(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_COLUMN_GIANT = registerBlock("sandstone_doric_column_giant",
            () -> new BlockColumnGiant(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_FLUTED_COLUMN_SMALL = registerBlock("sandstone_fluted_column_small",
            () -> new BlockColumnSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_FLUTED_COLUMN_REGULAR = registerBlock("sandstone_fluted_column_regular",
            () -> new BlockColumnRegular(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_FLUTED_COLUMN_MEDIUM = registerBlock("sandstone_fluted_column_medium",
            () -> new BlockColumn(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_FLUTED_COLUMN_LARGE = registerBlock("sandstone_fluted_column_large",
            () -> new BlockColumnLarge(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_FLUTED_COLUMN_GIANT = registerBlock("sandstone_fluted_column_giant",
            () -> new BlockColumnGiant(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
/*
    public static final RegistryObject<Block> SANDSTONE_RUSTICATED_COLUMN_SMALL = registerBlock("sandstone_rusticated_column_small",
            () -> new BlockColumnSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_RUSTICATED_COLUMN_REGULAR = registerBlock("sandstone_rusticated_column_regular",
            () -> new BlockColumnRegular(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_RUSTICATED_COLUMN_MEDIUM = registerBlock("sandstone_rusticated_column_medium",
            () -> new BlockColumn(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_RUSTICATED_COLUMN_LARGE = registerBlock("sandstone_rusticated_column_large",
            () -> new BlockColumnLarge(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
*/
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_BASE_SMALL = registerBlock("sandstone_roman_doric_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_BASE_MEDIUM = registerBlock("sandstone_roman_doric_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_BASE_LARGE = registerBlock("sandstone_roman_doric_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_BASE_GIANT = registerBlock("sandstone_roman_doric_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_IONIC_BASE_SMALL = registerBlock("sandstone_ionic_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_BASE_MEDIUM = registerBlock("sandstone_ionic_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_BASE_LARGE = registerBlock("sandstone_ionic_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_BASE_GIANT = registerBlock("sandstone_ionic_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_BASE_SMALL = registerBlock("sandstone_roman_ionic_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_BASE_MEDIUM = registerBlock("sandstone_roman_ionic_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_BASE_LARGE = registerBlock("sandstone_roman_ionic_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_BASE_GIANT = registerBlock("sandstone_roman_ionic_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_CORINTHIAN_BASE_SMALL = registerBlock("sandstone_corinthian_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CORINTHIAN_BASE_MEDIUM = registerBlock("sandstone_corinthian_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CORINTHIAN_BASE_LARGE = registerBlock("sandstone_corinthian_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CORINTHIAN_BASE_GIANT = registerBlock("sandstone_corinthian_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_BASE_SMALL = registerBlock("sandstone_roman_corinthian_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_BASE_MEDIUM = registerBlock("sandstone_roman_corinthian_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_BASE_LARGE = registerBlock("sandstone_roman_corinthian_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_BASE_GIANT = registerBlock("sandstone_roman_corinthian_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_TUSCAN_BASE_SMALL = registerBlock("sandstone_tuscan_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_BASE_REGULAR = registerBlock("sandstone_tuscan_base_regular",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_BASE_MEDIUM = registerBlock("sandstone_tuscan_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_BASE_LARGE = registerBlock("sandstone_tuscan_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_BASE_GIANT = registerBlock("sandstone_tuscan_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_DORIC_CAPITAL_SMALL = registerBlock("sandstone_doric_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_CAPITAL_MEDIUM = registerBlock("sandstone_doric_capital_medium",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_CAPITAL_LARGE = registerBlock("sandstone_doric_capital_large",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_CAPITAL_GIANT = registerBlock("sandstone_doric_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_CAPITAL_SMALL = registerBlock("sandstone_roman_doric_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_CAPITAL_MEDIUM = registerBlock("sandstone_roman_doric_capital_medium",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_CAPITAL_LARGE = registerBlock("sandstone_roman_doric_capital_large",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_CAPITAL_GIANT = registerBlock("sandstone_roman_doric_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_IONIC_CAPITAL_SMALL = registerBlock("sandstone_ionic_capital_small",
            () -> new BlockIonicCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_CAPITAL_MEDIUM = registerBlock("sandstone_ionic_capital_medium",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_CAPITAL_LARGE = registerBlock("sandstone_ionic_capital_large",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_CAPITAL_GIANT = registerBlock("sandstone_ionic_capital_giant",
            () -> new BlockIonicCapitalGiant(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_CORNER_IONIC_CAPITAL_SMALL = registerBlock("sandstone_corner_ionic_capital_small",
            () -> new BlockIonicCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CORNER_IONIC_CAPITAL_MEDIUM = registerBlock("sandstone_corner_ionic_capital_medium",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CORNER_IONIC_CAPITAL_LARGE = registerBlock("sandstone_corner_ionic_capital_large",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CORNER_IONIC_CAPITAL_GIANT = registerBlock("sandstone_corner_ionic_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_CAPITAL_SMALL = registerBlock("sandstone_roman_ionic_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_CAPITAL_MEDIUM = registerBlock("sandstone_roman_ionic_capital_medium",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_CAPITAL_LARGE = registerBlock("sandstone_roman_ionic_capital_large",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_CAPITAL_GIANT = registerBlock("sandstone_roman_ionic_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_SCAMOZZI_IONIC_CAPITAL_SMALL = registerBlock("sandstone_scamozzi_ionic_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_SCAMOZZI_IONIC_CAPITAL_MEDIUM = registerBlock("sandstone_scamozzi_ionic_capital_medium",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_SCAMOZZI_IONIC_CAPITAL_LARGE = registerBlock("sandstone_scamozzi_ionic_capital_large",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_SCAMOZZI_IONIC_CAPITAL_GIANT = registerBlock("sandstone_scamozzi_ionic_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_GREEK_CORINTHIAN_CAPITAL_SMALL = registerBlock("sandstone_greek_corinthian_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_GREEK_CORINTHIAN_CAPITAL_MEDIUM = registerBlock("sandstone_greek_corinthian_capital_medium",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_GREEK_CORINTHIAN_CAPITAL_LARGE = registerBlock("sandstone_greek_corinthian_capital_large",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_GREEK_CORINTHIAN_CAPITAL_GIANT = registerBlock("sandstone_greek_corinthian_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_CAPITAL_SMALL = registerBlock("sandstone_roman_corinthian_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_CAPITAL_MEDIUM = registerBlock("sandstone_roman_corinthian_capital_medium",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_CAPITAL_LARGE = registerBlock("sandstone_roman_corinthian_capital_large",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_CAPITAL_GIANT = registerBlock("sandstone_roman_corinthian_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_TUSCAN_CAPITAL_SMALL = registerBlock("sandstone_tuscan_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_CAPITAL_REGULAR = registerBlock("sandstone_tuscan_capital_regular",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_CAPITAL_MEDIUM = registerBlock("sandstone_tuscan_capital_medium",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_CAPITAL_LARGE = registerBlock("sandstone_tuscan_capital_large",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_CAPITAL_GIANT = registerBlock("sandstone_tuscan_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_COMPOSITE_CAPITAL_SMALL = registerBlock("sandstone_composite_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_COMPOSITE_CAPITAL_MEDIUM = registerBlock("sandstone_composite_capital_medium",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_COMPOSITE_CAPITAL_LARGE = registerBlock("sandstone_composite_capital_large",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_COMPOSITE_CAPITAL_GIANT = registerBlock("sandstone_composite_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));



    public static final RegistryObject<Block> SANDSTONE_HALF_COLUMN_SMALL = registerBlock("sandstone_half_column_small",
            () -> new BlockColumnSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_HALF_COLUMN_MEDIUM = registerBlock("sandstone_half_column_medium",
            () -> new BlockColumn(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_HALF_COLUMN_LARGE = registerBlock("sandstone_half_column_large",
            () -> new BlockColumnLarge(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_DORIC_HALF_COLUMN_SMALL = registerBlock("sandstone_doric_half_column_small",
            () -> new BlockColumnSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_HALF_COLUMN_MEDIUM = registerBlock("sandstone_doric_half_column_medium",
            () -> new BlockColumn(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_HALF_COLUMN_LARGE = registerBlock("sandstone_doric_half_column_large",
            () -> new BlockColumnLarge(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_FLUTED_HALF_COLUMN_SMALL = registerBlock("sandstone_fluted_half_column_small",
            () -> new BlockColumnSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_FLUTED_HALF_COLUMN_MEDIUM = registerBlock("sandstone_fluted_half_column_medium",
            () -> new BlockColumn(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_FLUTED_HALF_COLUMN_LARGE = registerBlock("sandstone_fluted_half_column_large",
            () -> new BlockColumnLarge(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_HALF_COLUMN_BASE_SMALL = registerBlock("sandstone_roman_doric_half_column_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_HALF_COLUMN_BASE_MEDIUM = registerBlock("sandstone_roman_doric_half_column_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_HALF_COLUMN_BASE_LARGE = registerBlock("sandstone_roman_doric_half_column_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_IONIC_HALF_COLUMN_BASE_SMALL = registerBlock("sandstone_ionic_half_column_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_HALF_COLUMN_BASE_MEDIUM = registerBlock("sandstone_ionic_half_column_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_HALF_COLUMN_BASE_LARGE = registerBlock("sandstone_ionic_half_column_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_HALF_COLUMN_BASE_SMALL = registerBlock("sandstone_roman_ionic_half_column_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_HALF_COLUMN_BASE_MEDIUM = registerBlock("sandstone_roman_ionic_half_column_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_HALF_COLUMN_BASE_LARGE = registerBlock("sandstone_roman_ionic_half_column_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_CORINTHIAN_HALF_COLUMN_BASE_SMALL = registerBlock("sandstone_corinthian_half_column_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CORINTHIAN_HALF_COLUMN_BASE_MEDIUM = registerBlock("sandstone_corinthian_half_column_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CORINTHIAN_HALF_COLUMN_BASE_LARGE = registerBlock("sandstone_corinthian_half_column_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_HALF_COLUMN_BASE_SMALL = registerBlock("sandstone_roman_corinthian_half_column_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_HALF_COLUMN_BASE_MEDIUM = registerBlock("sandstone_roman_corinthian_half_column_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_HALF_COLUMN_BASE_LARGE = registerBlock("sandstone_roman_corinthian_half_column_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_TUSCAN_HALF_COLUMN_BASE_SMALL = registerBlock("sandstone_tuscan_half_column_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_HALF_COLUMN_BASE_MEDIUM = registerBlock("sandstone_tuscan_half_column_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_HALF_COLUMN_BASE_LARGE = registerBlock("sandstone_tuscan_half_column_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_DORIC_HALF_COLUMN_CAPITAL_SMALL = registerBlock("sandstone_doric_half_column_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_HALF_COLUMN_CAPITAL_MEDIUM = registerBlock("sandstone_doric_half_column_capital_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_HALF_COLUMN_CAPITAL_LARGE = registerBlock("sandstone_doric_half_column_capital_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_HALF_COLUMN_CAPITAL_SMALL = registerBlock("sandstone_roman_doric_half_column_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_HALF_COLUMN_CAPITAL_MEDIUM = registerBlock("sandstone_roman_doric_half_column_capital_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_HALF_COLUMN_CAPITAL_LARGE = registerBlock("sandstone_roman_doric_half_column_capital_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_IONIC_HALF_COLUMN_CAPITAL_SMALL = registerBlock("sandstone_ionic_half_column_capital_small",
            () -> new BlockIonicCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_HALF_COLUMN_CAPITAL_MEDIUM = registerBlock("sandstone_ionic_half_column_capital_medium",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_HALF_COLUMN_CAPITAL_LARGE = registerBlock("sandstone_ionic_half_column_capital_large",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_CORNER_IONIC_HALF_COLUMN_CAPITAL_SMALL = registerBlock("sandstone_corner_ionic_half_column_capital_small",
            () -> new BlockIonicCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CORNER_IONIC_HALF_COLUMN_CAPITAL_MEDIUM = registerBlock("sandstone_corner_ionic_half_column_capital_medium",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CORNER_IONIC_HALF_COLUMN_CAPITAL_LARGE = registerBlock("sandstone_corner_ionic_half_column_capital_large",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_HALF_COLUMN_CAPITAL_SMALL = registerBlock("sandstone_roman_ionic_half_column_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_HALF_COLUMN_CAPITAL_MEDIUM = registerBlock("sandstone_roman_ionic_half_column_capital_medium",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_HALF_COLUMN_CAPITAL_LARGE = registerBlock("sandstone_roman_ionic_half_column_capital_large",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_SCAMOZZI_IONIC_HALF_COLUMN_CAPITAL_SMALL = registerBlock("sandstone_scamozzi_ionic_half_column_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_SCAMOZZI_IONIC_HALF_COLUMN_CAPITAL_MEDIUM = registerBlock("sandstone_scamozzi_ionic_half_column_capital_medium",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_SCAMOZZI_IONIC_HALF_COLUMN_CAPITAL_LARGE = registerBlock("sandstone_scamozzi_ionic_half_column_capital_large",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_GREEK_CORINTHIAN_HALF_COLUMN_CAPITAL_SMALL = registerBlock("sandstone_greek_corinthian_half_column_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_GREEK_CORINTHIAN_HALF_COLUMN_CAPITAL_MEDIUM = registerBlock("sandstone_greek_corinthian_half_column_capital_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_GREEK_CORINTHIAN_HALF_COLUMN_CAPITAL_LARGE = registerBlock("sandstone_greek_corinthian_half_column_capital_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_HALF_COLUMN_CAPITAL_SMALL = registerBlock("sandstone_roman_corinthian_half_column_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_HALF_COLUMN_CAPITAL_MEDIUM = registerBlock("sandstone_roman_corinthian_half_column_capital_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_HALF_COLUMN_CAPITAL_LARGE = registerBlock("sandstone_roman_corinthian_half_column_capital_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_TUSCAN_HALF_COLUMN_CAPITAL_SMALL = registerBlock("sandstone_tuscan_half_column_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_HALF_COLUMN_CAPITAL_MEDIUM = registerBlock("sandstone_tuscan_half_column_capital_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_HALF_COLUMN_CAPITAL_LARGE = registerBlock("sandstone_tuscan_half_column_capital_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_COMPOSITE_HALF_COLUMN_CAPITAL_SMALL = registerBlock("sandstone_composite_half_column_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_COMPOSITE_HALF_COLUMN_CAPITAL_MEDIUM = registerBlock("sandstone_composite_half_column_capital_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_COMPOSITE_HALF_COLUMN_CAPITAL_LARGE = registerBlock("sandstone_composite_half_column_capital_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));



        public static final RegistryObject<Block> SANDSTONE_PILASTER_SMALL = registerBlock("sandstone_pilaster_small",
            () -> new BlockPilaster(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_PILASTER_MEDIUM = registerBlock("sandstone_pilaster_medium",
            () -> new BlockColumn(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_PILASTER_LARGE = registerBlock("sandstone_pilaster_large",
            () -> new BlockColumnLarge(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_PILASTER_GIANT = registerBlock("sandstone_pilaster_giant",
            () -> new BlockColumnGiant(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_FLUTED_PILASTER_SMALL = registerBlock("sandstone_fluted_pilaster_small",
            () -> new BlockPilaster(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_FLUTED_PILASTER_MEDIUM = registerBlock("sandstone_fluted_pilaster_medium",
            () -> new BlockColumn(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_FLUTED_PILASTER_LARGE = registerBlock("sandstone_fluted_pilaster_large",
            () -> new BlockColumnLarge(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_FLUTED_PILASTER_GIANT = registerBlock("sandstone_fluted_pilaster_giant",
            () -> new BlockColumnGiant(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_DORIC_PILASTER_SMALL = registerBlock("sandstone_doric_pilaster_small",
            () -> new BlockPilaster(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_PILASTER_MEDIUM = registerBlock("sandstone_doric_pilaster_medium",
            () -> new BlockColumn(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_PILASTER_LARGE = registerBlock("sandstone_doric_pilaster_large",
            () -> new BlockColumnLarge(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_PILASTER_GIANT = registerBlock("sandstone_doric_pilaster_giant",
            () -> new BlockColumnGiant(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_PILASTER_BASE_SMALL = registerBlock("sandstone_roman_doric_pilaster_base_small",
            () -> new BlockPilasterBaseCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_PILASTER_BASE_MEDIUM = registerBlock("sandstone_roman_doric_pilaster_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_PILASTER_BASE_LARGE = registerBlock("sandstone_roman_doric_pilaster_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_PILASTER_BASE_GIANT = registerBlock("sandstone_roman_doric_pilaster_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_IONIC_PILASTER_BASE_SMALL = registerBlock("sandstone_ionic_pilaster_base_small",
            () -> new BlockPilasterBaseCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_PILASTER_BASE_MEDIUM = registerBlock("sandstone_ionic_pilaster_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_PILASTER_BASE_LARGE = registerBlock("sandstone_ionic_pilaster_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_PILASTER_BASE_GIANT = registerBlock("sandstone_ionic_pilaster_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_PILASTER_BASE_SMALL = registerBlock("sandstone_roman_ionic_pilaster_base_small",
            () -> new BlockPilasterBaseCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_PILASTER_BASE_MEDIUM = registerBlock("sandstone_roman_ionic_pilaster_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_PILASTER_BASE_LARGE = registerBlock("sandstone_roman_ionic_pilaster_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_PILASTER_BASE_GIANT = registerBlock("sandstone_roman_ionic_pilaster_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_CORINTHIAN_PILASTER_BASE_SMALL = registerBlock("sandstone_corinthian_pilaster_base_small",
            () -> new BlockPilasterBaseCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CORINTHIAN_PILASTER_BASE_MEDIUM = registerBlock("sandstone_corinthian_pilaster_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CORINTHIAN_PILASTER_BASE_LARGE = registerBlock("sandstone_corinthian_pilaster_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CORINTHIAN_PILASTER_BASE_GIANT = registerBlock("sandstone_corinthian_pilaster_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_PILASTER_BASE_SMALL = registerBlock("sandstone_roman_corinthian_pilaster_base_small",
            () -> new BlockPilasterBaseCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_PILASTER_BASE_MEDIUM = registerBlock("sandstone_roman_corinthian_pilaster_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_PILASTER_BASE_LARGE = registerBlock("sandstone_roman_corinthian_pilaster_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_PILASTER_BASE_GIANT = registerBlock("sandstone_roman_corinthian_pilaster_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_TUSCAN_PILASTER_BASE_SMALL = registerBlock("sandstone_tuscan_pilaster_base_small",
            () -> new BlockPilasterBaseCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_PILASTER_BASE_MEDIUM = registerBlock("sandstone_tuscan_pilaster_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_PILASTER_BASE_LARGE = registerBlock("sandstone_tuscan_pilaster_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_PILASTER_BASE_GIANT = registerBlock("sandstone_tuscan_pilaster_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_DORIC_PILASTER_CAPITAL_SMALL = registerBlock("sandstone_doric_pilaster_capital_small",
            () -> new BlockPilasterBaseCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_PILASTER_CAPITAL_MEDIUM = registerBlock("sandstone_doric_pilaster_capital_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_PILASTER_CAPITAL_LARGE = registerBlock("sandstone_doric_pilaster_capital_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_DORIC_PILASTER_CAPITAL_GIANT = registerBlock("sandstone_doric_pilaster_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_PILASTER_CAPITAL_SMALL = registerBlock("sandstone_roman_doric_pilaster_capital_small",
            () -> new BlockPilasterBaseCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_PILASTER_CAPITAL_MEDIUM = registerBlock("sandstone_roman_doric_pilaster_capital_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_PILASTER_CAPITAL_LARGE = registerBlock("sandstone_roman_doric_pilaster_capital_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_DORIC_PILASTER_CAPITAL_GIANT = registerBlock("sandstone_roman_doric_pilaster_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_IONIC_PILASTER_CAPITAL_SMALL = registerBlock("sandstone_ionic_pilaster_capital_small",
            () -> new BlockPilasterBaseCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_PILASTER_CAPITAL_MEDIUM = registerBlock("sandstone_ionic_pilaster_capital_medium",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_PILASTER_CAPITAL_LARGE = registerBlock("sandstone_ionic_pilaster_capital_large",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_IONIC_PILASTER_CAPITAL_GIANT = registerBlock("sandstone_ionic_pilaster_capital_giant",
            () -> new BlockIonicCapitalGiant(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_CORNER_IONIC_PILASTER_CAPITAL_SMALL = registerBlock("sandstone_corner_ionic_pilaster_capital_small",
            () -> new BlockPilasterBaseCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CORNER_IONIC_PILASTER_CAPITAL_MEDIUM = registerBlock("sandstone_corner_ionic_pilaster_capital_medium",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CORNER_IONIC_PILASTER_CAPITAL_LARGE = registerBlock("sandstone_corner_ionic_pilaster_capital_large",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CORNER_IONIC_PILASTER_CAPITAL_GIANT = registerBlock("sandstone_corner_ionic_pilaster_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_PILASTER_CAPITAL_SMALL = registerBlock("sandstone_roman_ionic_pilaster_capital_small",
            () -> new BlockPilasterBaseCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_PILASTER_CAPITAL_MEDIUM = registerBlock("sandstone_roman_ionic_pilaster_capital_medium",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_PILASTER_CAPITAL_LARGE = registerBlock("sandstone_roman_ionic_pilaster_capital_large",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_IONIC_PILASTER_CAPITAL_GIANT = registerBlock("sandstone_roman_ionic_pilaster_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_SCAMOZZI_IONIC_PILASTER_CAPITAL_SMALL = registerBlock("sandstone_scamozzi_ionic_pilaster_capital_small",
            () -> new BlockPilasterBaseCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_SCAMOZZI_IONIC_PILASTER_CAPITAL_MEDIUM = registerBlock("sandstone_scamozzi_ionic_pilaster_capital_medium",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_SCAMOZZI_IONIC_PILASTER_CAPITAL_LARGE = registerBlock("sandstone_scamozzi_ionic_pilaster_capital_large",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_SCAMOZZI_IONIC_PILASTER_CAPITAL_GIANT = registerBlock("sandstone_scamozzi_ionic_pilaster_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_GREEK_CORINTHIAN_PILASTER_CAPITAL_SMALL = registerBlock("sandstone_greek_corinthian_pilaster_capital_small",
            () -> new BlockPilasterBaseCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_GREEK_CORINTHIAN_PILASTER_CAPITAL_MEDIUM = registerBlock("sandstone_greek_corinthian_pilaster_capital_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_GREEK_CORINTHIAN_PILASTER_CAPITAL_LARGE = registerBlock("sandstone_greek_corinthian_pilaster_capital_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_GREEK_CORINTHIAN_PILASTER_CAPITAL_GIANT = registerBlock("sandstone_greek_corinthian_pilaster_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_PILASTER_CAPITAL_SMALL = registerBlock("sandstone_roman_corinthian_pilaster_capital_small",
            () -> new BlockPilasterBaseCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_PILASTER_CAPITAL_MEDIUM = registerBlock("sandstone_roman_corinthian_pilaster_capital_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_PILASTER_CAPITAL_LARGE = registerBlock("sandstone_roman_corinthian_pilaster_capital_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_ROMAN_CORINTHIAN_PILASTER_CAPITAL_GIANT = registerBlock("sandstone_roman_corinthian_pilaster_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_TUSCAN_PILASTER_CAPITAL_SMALL = registerBlock("sandstone_tuscan_pilaster_capital_small",
            () -> new BlockPilasterBaseCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_PILASTER_CAPITAL_MEDIUM = registerBlock("sandstone_tuscan_pilaster_capital_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_PILASTER_CAPITAL_LARGE = registerBlock("sandstone_tuscan_pilaster_capital_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_TUSCAN_PILASTER_CAPITAL_GIANT = registerBlock("sandstone_tuscan_pilaster_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_COMPOSITE_PILASTER_CAPITAL_SMALL = registerBlock("sandstone_composite_pilaster_capital_small",
            () -> new BlockPilasterBaseCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_COMPOSITE_PILASTER_CAPITAL_MEDIUM = registerBlock("sandstone_composite_pilaster_capital_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_COMPOSITE_PILASTER_CAPITAL_LARGE = registerBlock("sandstone_composite_pilaster_capital_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_COMPOSITE_PILASTER_CAPITAL_GIANT = registerBlock("sandstone_composite_pilaster_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));



    public static final RegistryObject<Block> DIORITE_COLUMN_SMALL = registerBlock("diorite_column_small",
            () -> new BlockColumnSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_COLUMN_REGULAR = registerBlock("diorite_column_regular",
            () -> new BlockColumnRegular(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_COLUMN_MEDIUM = registerBlock("diorite_column_medium",
            () -> new BlockColumn(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_COLUMN_LARGE = registerBlock("diorite_column_large",
            () -> new BlockColumnLarge(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_COLUMN_GIANT = registerBlock("diorite_column_giant",
            () -> new BlockColumnGiant(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_DORIC_COLUMN_SMALL = registerBlock("diorite_doric_column_small",
            () -> new BlockColumnSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_DORIC_COLUMN_REGULAR = registerBlock("diorite_doric_column_regular",
            () -> new BlockColumnRegular(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_DORIC_COLUMN_MEDIUM = registerBlock("diorite_doric_column_medium",
            () -> new BlockColumn(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_DORIC_COLUMN_LARGE = registerBlock("diorite_doric_column_large",
            () -> new BlockColumnLarge(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_DORIC_COLUMN_GIANT = registerBlock("diorite_doric_column_giant",
            () -> new BlockColumnGiant(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_FLUTED_COLUMN_SMALL = registerBlock("diorite_fluted_column_small",
            () -> new BlockColumnSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_FLUTED_COLUMN_REGULAR = registerBlock("diorite_fluted_column_regular",
            () -> new BlockColumnRegular(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_FLUTED_COLUMN_MEDIUM = registerBlock("diorite_fluted_column_medium",
            () -> new BlockColumn(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_FLUTED_COLUMN_LARGE = registerBlock("diorite_fluted_column_large",
            () -> new BlockColumnLarge(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_FLUTED_COLUMN_GIANT = registerBlock("diorite_fluted_column_giant",
            () -> new BlockColumnGiant(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    /*
        public static final RegistryObject<Block> DIORITE_RUSTICATED_COLUMN_SMALL = registerBlock("diorite_rusticated_column_small",
                () -> new BlockColumnSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
        public static final RegistryObject<Block> DIORITE_RUSTICATED_COLUMN_REGULAR = registerBlock("diorite_rusticated_column_regular",
                () -> new BlockColumnRegular(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
        public static final RegistryObject<Block> DIORITE_RUSTICATED_COLUMN_MEDIUM = registerBlock("diorite_rusticated_column_medium",
                () -> new BlockColumn(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
        public static final RegistryObject<Block> DIORITE_RUSTICATED_COLUMN_LARGE = registerBlock("diorite_rusticated_column_large",
                () -> new BlockColumnLarge(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    */
    public static final RegistryObject<Block> DIORITE_ROMAN_DORIC_BASE_SMALL = registerBlock("diorite_roman_doric_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_DORIC_BASE_MEDIUM = registerBlock("diorite_roman_doric_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_DORIC_BASE_LARGE = registerBlock("diorite_roman_doric_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_DORIC_BASE_GIANT = registerBlock("diorite_roman_doric_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_IONIC_BASE_SMALL = registerBlock("diorite_ionic_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_IONIC_BASE_MEDIUM = registerBlock("diorite_ionic_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_IONIC_BASE_LARGE = registerBlock("diorite_ionic_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_IONIC_BASE_GIANT = registerBlock("diorite_ionic_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_ROMAN_IONIC_BASE_SMALL = registerBlock("diorite_roman_ionic_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_IONIC_BASE_MEDIUM = registerBlock("diorite_roman_ionic_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_IONIC_BASE_LARGE = registerBlock("diorite_roman_ionic_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_IONIC_BASE_GIANT = registerBlock("diorite_roman_ionic_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_CORINTHIAN_BASE_SMALL = registerBlock("diorite_corinthian_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_CORINTHIAN_BASE_MEDIUM = registerBlock("diorite_corinthian_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_CORINTHIAN_BASE_LARGE = registerBlock("diorite_corinthian_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_CORINTHIAN_BASE_GIANT = registerBlock("diorite_corinthian_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_ROMAN_CORINTHIAN_BASE_SMALL = registerBlock("diorite_roman_corinthian_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_CORINTHIAN_BASE_MEDIUM = registerBlock("diorite_roman_corinthian_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_CORINTHIAN_BASE_LARGE = registerBlock("diorite_roman_corinthian_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_CORINTHIAN_BASE_GIANT = registerBlock("diorite_roman_corinthian_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_TUSCAN_BASE_SMALL = registerBlock("diorite_tuscan_base_small",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_TUSCAN_BASE_REGULAR = registerBlock("diorite_tuscan_base_regular",
            () -> new BlockColumnBaseSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_TUSCAN_BASE_MEDIUM = registerBlock("diorite_tuscan_base_medium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_TUSCAN_BASE_LARGE = registerBlock("diorite_tuscan_base_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_TUSCAN_BASE_GIANT = registerBlock("diorite_tuscan_base_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_DORIC_CAPITAL_SMALL = registerBlock("diorite_doric_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_DORIC_CAPITAL_MEDIUM = registerBlock("diorite_doric_capital_medium",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_DORIC_CAPITAL_LARGE = registerBlock("diorite_doric_capital_large",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_DORIC_CAPITAL_GIANT = registerBlock("diorite_doric_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_ROMAN_DORIC_CAPITAL_SMALL = registerBlock("diorite_roman_doric_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_DORIC_CAPITAL_MEDIUM = registerBlock("diorite_roman_doric_capital_medium",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_DORIC_CAPITAL_LARGE = registerBlock("diorite_roman_doric_capital_large",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_DORIC_CAPITAL_GIANT = registerBlock("diorite_roman_doric_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_IONIC_CAPITAL_SMALL = registerBlock("diorite_ionic_capital_small",
            () -> new BlockIonicCapitalSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_IONIC_CAPITAL_MEDIUM = registerBlock("diorite_ionic_capital_medium",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_IONIC_CAPITAL_LARGE = registerBlock("diorite_ionic_capital_large",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_IONIC_CAPITAL_GIANT = registerBlock("diorite_ionic_capital_giant",
            () -> new BlockIonicCapitalGiant(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_CORNER_IONIC_CAPITAL_SMALL = registerBlock("diorite_corner_ionic_capital_small",
            () -> new BlockIonicCapitalSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_CORNER_IONIC_CAPITAL_MEDIUM = registerBlock("diorite_corner_ionic_capital_medium",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_CORNER_IONIC_CAPITAL_LARGE = registerBlock("diorite_corner_ionic_capital_large",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_CORNER_IONIC_CAPITAL_GIANT = registerBlock("diorite_corner_ionic_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_ROMAN_IONIC_CAPITAL_SMALL = registerBlock("diorite_roman_ionic_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_IONIC_CAPITAL_MEDIUM = registerBlock("diorite_roman_ionic_capital_medium",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_IONIC_CAPITAL_LARGE = registerBlock("diorite_roman_ionic_capital_large",
            () -> new BlockIonicCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_IONIC_CAPITAL_GIANT = registerBlock("diorite_roman_ionic_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_SCAMOZZI_IONIC_CAPITAL_SMALL = registerBlock("diorite_scamozzi_ionic_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_SCAMOZZI_IONIC_CAPITAL_MEDIUM = registerBlock("diorite_scamozzi_ionic_capital_medium",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_SCAMOZZI_IONIC_CAPITAL_LARGE = registerBlock("diorite_scamozzi_ionic_capital_large",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_SCAMOZZI_IONIC_CAPITAL_GIANT = registerBlock("diorite_scamozzi_ionic_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_GREEK_CORINTHIAN_CAPITAL_SMALL = registerBlock("diorite_greek_corinthian_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_GREEK_CORINTHIAN_CAPITAL_MEDIUM = registerBlock("diorite_greek_corinthian_capital_medium",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_GREEK_CORINTHIAN_CAPITAL_LARGE = registerBlock("diorite_greek_corinthian_capital_large",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_GREEK_CORINTHIAN_CAPITAL_GIANT = registerBlock("diorite_greek_corinthian_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_ROMAN_CORINTHIAN_CAPITAL_SMALL = registerBlock("diorite_roman_corinthian_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_CORINTHIAN_CAPITAL_MEDIUM = registerBlock("diorite_roman_corinthian_capital_medium",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_CORINTHIAN_CAPITAL_LARGE = registerBlock("diorite_roman_corinthian_capital_large",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_ROMAN_CORINTHIAN_CAPITAL_GIANT = registerBlock("diorite_roman_corinthian_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_TUSCAN_CAPITAL_SMALL = registerBlock("diorite_tuscan_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_TUSCAN_CAPITAL_REGULAR = registerBlock("diorite_tuscan_capital_regular",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_TUSCAN_CAPITAL_MEDIUM = registerBlock("diorite_tuscan_capital_medium",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_TUSCAN_CAPITAL_LARGE = registerBlock("diorite_tuscan_capital_large",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_TUSCAN_CAPITAL_GIANT = registerBlock("diorite_tuscan_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> DIORITE_COMPOSITE_CAPITAL_SMALL = registerBlock("diorite_composite_capital_small",
            () -> new BlockCapitalSmall(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_COMPOSITE_CAPITAL_MEDIUM = registerBlock("diorite_composite_capital_medium",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_COMPOSITE_CAPITAL_LARGE = registerBlock("diorite_composite_capital_large",
            () -> new BlockCapital(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> DIORITE_COMPOSITE_CAPITAL_GIANT = registerBlock("diorite_composite_capital_giant",
            () -> new BlockHorizontalDirectional(BlockBehaviour.Properties.copy(Blocks.DIORITE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));







    public static final RegistryObject<Block> SANDSTONE_WINDOW_FRAME = registerBlock("sandstone_window_frame",
            () -> new BlockWindowFrame(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_WINDOW_UPPER_FRAME = registerBlock("sandstone_window_upper_frame",
            () -> new BlockWindowPediment(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_WINDOW_KEYSTONE = registerBlock("sandstone_window_keystone",
            () -> new BlockWindowPediment(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    public static final RegistryObject<Block> SANDSTONE_WINDOW_GREEK_PEDIMENT = registerBlock("sandstone_window_greek_pediment",
            () -> new BlockWindowPedimentComplex(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));



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
