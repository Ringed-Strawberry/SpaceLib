package ringed_strawberry.github.io.spacelib.block.util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import ringed_strawberry.github.io.spacelib.math.util.MathUtil;

public class BlockHitUtil {
    public static Vec3 getInteractAt(BlockHitResult hit){
        return hit.getLocation().add(hit.getBlockPos().getX()*-1, hit.getBlockPos().getY()*-1, hit.getBlockPos().getZ()*-1);
    }

    public static Vec3 getInteractAt(BlockPos bPos, Vec3 pos){
        return pos.add(bPos.getX()*-1, bPos.getY()*-1, bPos.getZ()*-1);
    }

    public static Vec2 getVec2fInteractAt(BlockHitResult hit){
        float x = (float) (hit.getLocation().x() + hit.getBlockPos().getX()*-1);
        float y = (float) (hit.getLocation().y() + hit.getBlockPos().getY()*-1);
        float z = (float) (hit.getLocation().z() + hit.getBlockPos().getZ()*-1);
        if(z == 0 || z == 1)
            return new Vec2(x,y);
        if(y == 0 || y == 1)
            return new Vec2(x,z);
        if(x == 0 ||x == 1)
            return new Vec2(y,z);
        return new Vec2(x,y);
    }

    public static Vec2 getVec2fInteractAt(BlockPos bPos, Vec3 pos){
        float x = (float) (pos.x() + bPos.getX()*-1);
        float y = (float) (pos.y() + bPos.getY()*-1);
        float z = (float) (pos.z() + bPos.getZ()*-1);
        if(z == 0 || z == 1)
            return new Vec2(x,y);
        if(y == 0 || y == 1)
            return new Vec2(x,z);
        if(x == 0 ||x == 1)
            return new Vec2(y,z);
        return new Vec2(x,y);
    }

    public static boolean isInteractionInRange(BlockHitResult hit, float x, float y, float radius){
        return MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(hit).x, x, radius) &&
                MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(hit).y, y, radius);
    }

    public static boolean isInteractionInRange(BlockPos bPos, Vec3 pos, float x, float y, float radius){
        return MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(bPos, pos).x, x, radius) &&
                MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(bPos, pos).y, y, radius);
    }

    public static boolean isInteractionInRange(BlockHitResult hit, float x, float y, int pixels){
        return MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(hit).x, x, pixels) &&
                MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(hit).y, y, pixels);
    }

    public static boolean isInteractionInRange(BlockPos bPos, Vec3 pos, float x, float y, int pixels){
        return MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(bPos, pos).x, x, pixels) &&
                MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(bPos, pos).y, y, pixels);
    }
}
