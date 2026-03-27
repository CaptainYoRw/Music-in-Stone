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
    public static final RegistryObject<Block> BRICK_FANCY_SLAB = registerBlock("brick_fancy_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB)));
    public static final RegistryObject<Block> BRICK_FANCY_STAIRS = registerBlock("brick_fancy_stairs",
            () -> new StairBlock(() -> BlocksRegistry.BRICKS_FANCY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BRICK_FANCY_WALL = registerBlock("brick_fancy_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL)));
    public static final RegistryObject<Block> BRICKS_ROMAN_TRIPLE = registerBlock("bricks_roman_triple",
            () -> new BlockTripleRepeatable(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BRICKS_CLINKER = registerBlock("bricks_clinker",
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
    public static final RegistryObject<Block> QUARTZ_CAPITAL_SMALL = registerBlock("quartz_ionic_capital_small",
            () -> new BlockColumnCapital(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> QUARTZ_BASE_SMALL = registerBlock("quartz_ionic_base_small",
            () -> new BlockColumnBase(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_BASE_SMALL = registerBlock("sandstone_ionic_base_small",
            () -> new BlockColumnBase(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SANDSTONE_CAPITAL_SMALL = registerBlock("sandstone_ionic_capital_small",
            () -> new BlockColumnCapital(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));

    //public static final RegistryObject<Block> TEST_COLUMN_A = registerBlock("test_column_a",
    //        () -> new BlockColumnBase(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion()));
    // static final RegistryObject<Block> TEST_COLUMN_B = registerBlock("test_column_b",
    //       () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion()));

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
