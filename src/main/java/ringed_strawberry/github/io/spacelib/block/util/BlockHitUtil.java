package ringed_strawberry.github.io.spacelib.block.util;

import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class BlockHitUtil {
    public static Vec3d getInteractAt(BlockHitResult hit){
        return hit.getPos().add(hit.getBlockPos().getX()*-1, hit.getBlockPos().getY()*-1, hit.getBlockPos().getZ()*-1);
    }

    public static Vec3d getInteractAt(BlockPos bPos, Vec3d pos){
        return pos.add(bPos.getX()*-1, bPos.getY()*-1, bPos.getZ()*-1);
    }
}
