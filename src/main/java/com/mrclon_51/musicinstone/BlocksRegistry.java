package com.mrclon_51.musicinstone;

import com.mrclon_51.musicinstone.block.ArchBlock;
import com.mrclon_51.musicinstone.block.HalfArchBlock;
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
    public static final RegistryObject<Block> WIDE_ARCH_BRICKS = registerBlock("wide_arch_bricks",
        () -> new ArchBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SMALL_ARCH_BRICKS = registerBlock("small_arch_bricks",
            () -> new ArchBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> SEGMENTAL_ARCH_BRICKS = registerBlock("segmental_arch_bricks",
            () -> new ArchBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> LARGE_ARCH_BRICKS = registerBlock("large_arch_bricks",
            () -> new HalfArchBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> JACK_ARCH_BRICKS = registerBlock("jack_arch_bricks",
            () -> new ArchBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> ROWLOCK_ARCH_BRICKS = registerBlock("rowlock_arch_bricks",
            () -> new ArchBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noOcclusion().isValidSpawn((state, level, pos, entityType) -> false)));
    public static final RegistryObject<Block> BRICK_FANCY_SLAB = registerBlock("brick_fancy_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB)));
    public static final RegistryObject<Block> BRICK_FANCY_STAIRS = registerBlock("brick_fancy_stairs",
            () -> new StairBlock(() -> BlocksRegistry.BRICKS_FANCY.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BRICK_FANCY_WALL = registerBlock("brick_fancy_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL)));
    public static final RegistryObject<Block> TEST_COLUMN_A = registerBlock("test_column_a",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion()));
    public static final RegistryObject<Block> TEST_COLUMN_B = registerBlock("test_column_b",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).noOcclusion()));

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
