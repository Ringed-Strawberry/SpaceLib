package ringed_strawberry.github.io.spacelib.block.util;

import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;

public class BlockHitUtil {
    public static Vec3d getInteractAt(BlockHitResult hit){
        return hit.getPos().add(hit.getBlockPos().getX()*-1, hit.getBlockPos().getY()*-1, hit.getBlockPos().getZ()*-1);
    }

    public static Vec3d getInteractAt(BlockPos bPos, Vec3d pos){
        return pos.add(bPos.getX()*-1, bPos.getY()*-1, bPos.getZ()*-1);
    }

    public static Vec2f getVec2fInteractAt(BlockHitResult hit){
        float x = (float) (hit.getPos().getX() + hit.getBlockPos().getX()*-1);
        float y = (float) (hit.getPos().getY() + hit.getBlockPos().getY()*-1);
        float z = (float) (hit.getPos().getZ() + hit.getBlockPos().getZ()*-1);
        if(z == 0 || z == 1)
            return new Vec2f(x,y);
        if(y == 0 || y == 1)
            return new Vec2f(x,z);
        if(x == 0 ||x == 1)
            return new Vec2f(y,z);
        return new Vec2f(x,y);
    }
}
