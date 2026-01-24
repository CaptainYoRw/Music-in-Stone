package com.mrclon_51.musicinstone.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.StairsShape;

public class HalfArchBlock extends ArchBlock
{
    public static final EnumProperty<StairsShape> SHAPE = BlockStateProperties.STAIRS_SHAPE;
    public static final EnumProperty<ModBlockProperties.SideHalf> SIDE = EnumProperty.create("side", ModBlockProperties.SideHalf.class);

    public HalfArchBlock(Properties properties)
    {
        super(properties);

        this.registerDefaultState(this.stateDefinition.any()
                .setValue(SHAPE, StairsShape.STRAIGHT)
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

        return state.setValue(SHAPE, getStairsShape(state, context.getLevel(), context.getClickedPos()))
                    .setValue(SIDE, isRightSide ? ModBlockProperties.SideHalf.LEFT : ModBlockProperties.SideHalf.RIGHT);
    }

    private static StairsShape getStairsShape(BlockState state, BlockGetter level, BlockPos pos)
    {
        Direction direction = state.getValue(FACING);
        BlockState blockstate = level.getBlockState(pos.relative(direction));
        if (isStairs(blockstate) && state.getValue(HALF) == blockstate.getValue(HALF))
        {
            Direction direction1 = blockstate.getValue(FACING);
            if (direction1.getAxis() != state.getValue(FACING).getAxis() && canTakeShape(state, level, pos, direction1.getOpposite())) {
                if (direction1 == direction.getCounterClockWise())
                {
                    return StairsShape.OUTER_LEFT;
                }
                return StairsShape.OUTER_RIGHT;
            }
        }

        BlockState blockstate1 = level.getBlockState(pos.relative(direction.getOpposite()));
        if (isStairs(blockstate1) && state.getValue(HALF) == blockstate1.getValue(HALF))
        {
            Direction direction2 = blockstate1.getValue(FACING);
            if (direction2.getAxis() != state.getValue(FACING).getAxis() && canTakeShape(state, level, pos, direction2))
            {
                if (direction2 == direction.getCounterClockWise())
                {
                    return StairsShape.INNER_LEFT;
                }
                return StairsShape.INNER_RIGHT;
            }
        }
        return StairsShape.STRAIGHT;
    }

    private static boolean canTakeShape(BlockState state, BlockGetter level, BlockPos pos, Direction face)
    {
        BlockState blockstate = level.getBlockState(pos.relative(face));
        return !isStairs(blockstate) || blockstate.getValue(FACING) != state.getValue(FACING) || blockstate.getValue(HALF) != state.getValue(HALF);
    }

    public static boolean isStairs(BlockState state)
    {
        return state.getBlock() instanceof StairBlock || state.hasProperty(BlockStateProperties.STAIRS_SHAPE);
    }

    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
        // Сначала даем родителю обновить его данные (например, логику воды)
        BlockState updatedState = super.updateShape(state, facing, facingState, level, currentPos, facingPos);

        // Если обновление пришло сбоку, пересчитываем форму соединения
        if (facing.getAxis().isHorizontal())
        {
            return updatedState.setValue(SHAPE, getStairsShape(updatedState, level, currentPos));
        }
        return updatedState;
    }

    // Register the properties so the game knows they exist
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, HALF, WATERLOGGED, OFFSET, SHAPE, SIDE);
    }
}
