package com.mrclon_51.musicinstone.item;

import com.mrclon_51.musicinstone.BlocksRegistry;
import com.mrclon_51.musicinstone.ItemsRegistry;
import com.mrclon_51.musicinstone.TagsRegistry;
import com.mrclon_51.musicinstone.block.BlockWindowPedimentComplex;
import com.mrclon_51.musicinstone.datagen.ModBlockTagsProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class ItemArchitectTools extends Item
{
    public ItemArchitectTools(Properties pProperties)
    {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = level.getBlockState(pos);
        Player player = context.getPlayer();

        // Проверяем, что кликнули именно по нашему комплексному педименту
        // Замени BlockWindowPedimentComplex на реальное имя класса твоего блока
        if (state.getBlock() instanceof BlockWindowPedimentComplex)
        {
            if (!level.isClientSide && player != null)
            {

                if (player.isShiftKeyDown())
                {
                    // Логика Shift + ПКМ: Переключаем дентикулы
                    boolean currentDentils = state.getValue(BlockWindowPedimentComplex.DENTILS);
                    level.setBlock(pos, state.setValue(BlockWindowPedimentComplex.DENTILS, !currentDentils), 3);
                }
                else
                {
                    // Логика простого ПКМ: Переключаем рамку
                    BlockWindowPedimentComplex.Frame current = state.getValue(BlockWindowPedimentComplex.FRAME);
                    BlockWindowPedimentComplex.Frame next = (current == BlockWindowPedimentComplex.Frame.FRAMED)
                            ? BlockWindowPedimentComplex.Frame.FRAMELESS
                            : BlockWindowPedimentComplex.Frame.FRAMED;
                    level.setBlock(pos, state.setValue(BlockWindowPedimentComplex.FRAME, next), 3);
                }
            }
            return InteractionResult.sidedSuccess(level.isClientSide);
        }

        return InteractionResult.PASS;
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, Player player)
    {
        Level level = player.level();

            if (!level.isClientSide)
            {
                BlockState state = level.getBlockState(pos);

                if (state.is(TagsRegistry.Blocks.LEFT_CLICKABLE))
                {
                    if (state.hasProperty(BlockWindowPedimentComplex.TYPE))
                    {
                        BlockWindowPedimentComplex.Type current = state.getValue(BlockWindowPedimentComplex.TYPE);
                        int nextIndex = (current.ordinal() + 1) % BlockWindowPedimentComplex.Type.values().length;
                        BlockWindowPedimentComplex.Type next = BlockWindowPedimentComplex.Type.values()[nextIndex];

                        level.setBlock(pos, state.setValue(BlockWindowPedimentComplex.TYPE, next), 3);
                    }
                }
            }
        return true;
    }
}
