package com.mrclon_51.musicinstone.block;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class BlockIonicCapitalGiant extends BlockHorizontalDirectional
{
    public static final EnumProperty<ModBlockProperties.SideHalf> SIDE = EnumProperty.create("side", ModBlockProperties.SideHalf.class);

    public BlockIonicCapitalGiant(Properties properties)
    {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(SIDE, ModBlockProperties.SideHalf.LEFT));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        // Сначала просим "родительский" класс вычислить его данные (направление, воду, половину)
        BlockState state = super.getStateForPlacement(context);
        if (state == null) return null;

        Direction facing = context.getHorizontalDirection();

        // Get the hit location relative to the block (0.0 to 1.0)
        double hitX = context.getClickLocation().x - (double)context.getClickedPos().getX();
        double hitZ = context.getClickLocation().z - (double)context.getClickedPos().getZ();

        boolean isRightSide = false;

        // Determine "Right" vs "Left" based on which way the player faces
        switch (facing) {
            case NORTH -> isRightSide = hitX < 0.5;
            case SOUTH -> isRightSide = hitX > 0.5;
            case WEST ->  isRightSide = hitZ > 0.5;
            case EAST ->  isRightSide = hitZ < 0.5;
        }

        return state.setValue(SIDE, isRightSide ? ModBlockProperties.SideHalf.LEFT : ModBlockProperties.SideHalf.RIGHT);
    }

    // Register the properties so the game knows they exist
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, WATERLOGGED, SIDE);
    }
}
