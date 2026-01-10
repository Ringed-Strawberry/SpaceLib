package ringed_strawberry.github.io.spacelib.block.properties.util;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import ringed_strawberry.github.io.spacelib.block.util.BlockHitUtil;

import static net.minecraft.block.PillarBlock.AXIS;
import static ringed_strawberry.github.io.spacelib.block.custom.PoleBlock.*;
import static ringed_strawberry.github.io.spacelib.block.properties.SpaceLibBlockProperties.*;

public class BlockPropertyUtil {
    public static int sidesEnabled(BlockState state){
        int value = 0;
        if(state.get(UP)){
            value++;
        }
        if(state.get(DOWN)){
            value++;
        }
        if(state.get(RIGHT)){
            value++;
        }
        if(state.get(LEFT)){
            value++;
        }
        return value;
    }

    public static BlockState toggleSide(BlockState state, BlockHitResult hit){
        BlockState returnalState;
        switch (BlockHitUtil.getSide(hit)){
            default -> returnalState = state.with(DOWN, !state.get(DOWN));
            case 2 -> returnalState = state.with(UP, !state.get(UP));
            case 3 -> returnalState = state.with(RIGHT, !state.get(RIGHT));
            case 4 -> returnalState = state.with(LEFT, !state.get(LEFT));
        };
        if(sidesEnabled(returnalState) == 0){
            returnalState = Blocks.AIR.getDefaultState();
        }
        return returnalState;
    }

    public static BlockState toggleSide(BlockState state, BlockHitResult hit, boolean newValue){
        BlockState returnalState;
        switch (BlockHitUtil.getSide(hit)){
            default -> returnalState = state.with(DOWN, newValue);
            case 2 -> returnalState = state.with(UP, newValue);
            case 3 -> returnalState = state.with(RIGHT, newValue);
            case 4 -> returnalState = state.with(LEFT, newValue);
        };

        if(sidesEnabled(returnalState) == 0){
            returnalState = Blocks.AIR.getDefaultState();
        }
        return returnalState;
    }

    public static boolean isSideToggled(BlockState state, BlockHitResult hit){
        return switch (BlockHitUtil.getSide(hit)){
            default -> state.get(DOWN);
            case 2 -> state.get(UP);
            case 3 -> state.get(RIGHT);
            case 4 -> state.get(LEFT);
        };
    }

    public static BlockState getPoleState(WorldAccess world, BlockPos pos, Block block){
        return getPoleState(world, pos, block, world.getBlockState(pos));
    }

    public static BlockState getPoleState(WorldAccess world, BlockPos pos, Block block, Direction dir){
        return getPoleState(world, pos, block, block.getDefaultState().with(AXIS, dir.getAxis()));
    }

    public static BlockState getPoleState(WorldAccess world, BlockPos pos, Block block, BlockState startingState){
        BlockState returnalState = startingState;
        Direction.Axis axis = startingState.get(AXIS);
        if(axis.isVertical()) {
            returnalState = returnalState.with(BOTTOM,
                    world.getBlockState(pos.add(0, 1, 0)).getBlock() == block &&
                            !(world.getBlockState(pos.add(0, -1, 0)).getBlock() == block)
            );

            returnalState = returnalState.with(MIDDLE,
                    world.getBlockState(pos.add(0, 1, 0)).getBlock() == block &&
                            (world.getBlockState(pos.add(0, -1, 0)).getBlock() == block)
            );

            returnalState = returnalState.with(TOP,
                    !(world.getBlockState(pos.add(0, 1, 0)).getBlock() == block) &&
                            (world.getBlockState(pos.add(0, -1, 0)).getBlock() == block)
            );
        } else {
            if(axis.choose(1,2,3) == 1) {
                returnalState = returnalState.with(BOTTOM,
                        world.getBlockState(pos.add(1, 0, 0)).getBlock() == block &&
                                !(world.getBlockState(pos.add(-1, 0, 0)).getBlock() == block)
                );

                returnalState = returnalState.with(MIDDLE,
                        world.getBlockState(pos.add(1, 0, 0)).getBlock() == block &&
                                (world.getBlockState(pos.add(-1, 0, 0)).getBlock() == block)
                );

                returnalState = returnalState.with(TOP,
                        !(world.getBlockState(pos.add(1, 0, 0)).getBlock() == block) &&
                                (world.getBlockState(pos.add(-1, 0, 0)).getBlock() == block)
                );
            }
            if(axis.choose(1,2,3) == 3) {
                returnalState = returnalState.with(BOTTOM,
                        world.getBlockState(pos.add(0, 0, 1)).getBlock() == block &&
                                !(world.getBlockState(pos.add(0, 0, -1)).getBlock() == block)
                );

                returnalState = returnalState.with(MIDDLE,
                        world.getBlockState(pos.add(0, 0, 1)).getBlock() == block &&
                                (world.getBlockState(pos.add(0, 0, -1)).getBlock() == block)
                );

                returnalState = returnalState.with(TOP,
                        !(world.getBlockState(pos.add(0, 0, 1)).getBlock() == block) &&
                                (world.getBlockState(pos.add(0, 0, -1)).getBlock() == block)
                );
            }
        }
        return returnalState;
    }
}
