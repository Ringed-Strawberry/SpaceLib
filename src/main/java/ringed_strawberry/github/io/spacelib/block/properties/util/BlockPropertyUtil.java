package ringed_strawberry.github.io.spacelib.block.properties.util;

import net.minecraft.block.BlockState;

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
}
