package ringed_strawberry.github.io.spacelib.block.util;

import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import ringed_strawberry.github.io.spacelib.math.util.MathUtil;

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

    public static Vec2f getVec2fInteractAt(BlockPos bPos, Vec3d pos){
        float x = (float) (pos.getX() + bPos.getX()*-1);
        float y = (float) (pos.getY() + bPos.getY()*-1);
        float z = (float) (pos.getZ() + bPos.getZ()*-1);
        if(z == 0 || z == 1)
            return new Vec2f(x,y);
        if(y == 0 || y == 1)
            return new Vec2f(x,z);
        if(x == 0 ||x == 1)
            return new Vec2f(y,z);
        return new Vec2f(x,y);
    }

    public static boolean isInteractionInRange(BlockHitResult hit, float x, float y, float radius){
        return MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(hit).x, x, radius) &&
                MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(hit).y, y, radius);
    }

    public static boolean isInteractionInRange(BlockPos bPos, Vec3d pos, float x, float y, float radius){
        return MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(bPos, pos).x, x, radius) &&
                MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(bPos, pos).y, y, radius);
    }

    public static boolean isInteractionInRange(BlockHitResult hit, float x, float y, int pixels){
        return MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(hit).x, x, pixels) &&
                MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(hit).y, y, pixels);
    }

    public static boolean isInteractionInRange(BlockPos bPos, Vec3d pos, float x, float y, int pixels){
        return MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(bPos, pos).x, x, pixels) &&
                MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(bPos, pos).y, y, pixels);
    }

    //3D

    public static boolean isInteractionInRange3D(BlockHitResult hit, float x, float y, float z, float radius){
        return MathUtil.isInRange((float) BlockHitUtil.getInteractAt(hit).x, x, radius) &&
                MathUtil.isInRange((float) BlockHitUtil.getInteractAt(hit).y, y, radius) &&
                MathUtil.isInRange((float) BlockHitUtil.getInteractAt(hit).z, z, radius);
    }

    public static boolean isInteractionInRange3D(BlockPos bPos, Vec3d pos, float x, float y, float z, float radius){
        return MathUtil.isInRange((float) BlockHitUtil.getInteractAt(bPos, pos).x, x, radius) &&
                MathUtil.isInRange((float) BlockHitUtil.getInteractAt(bPos, pos).y, y, radius) &&
                MathUtil.isInRange((float) BlockHitUtil.getInteractAt(bPos, pos).z, z, radius);
    }

    public static boolean isInteractionInRange3D(BlockHitResult hit, float x, float y, float z, int pixels){
        return MathUtil.isInRange((float) BlockHitUtil.getInteractAt(hit).x, x, pixels) &&
                MathUtil.isInRange((float) BlockHitUtil.getInteractAt(hit).y, y, pixels) &&
                MathUtil.isInRange((float) BlockHitUtil.getInteractAt(hit).z, z, pixels);
    }

    public static boolean isInteractionInRange3D(BlockPos bPos, Vec3d pos, float x, float y, float z, int pixels){
        return MathUtil.isInRange((float) BlockHitUtil.getInteractAt(bPos, pos).x, x, pixels) &&
                MathUtil.isInRange((float) BlockHitUtil.getInteractAt(bPos, pos).y, y, pixels) &&
                MathUtil.isInRange((float) BlockHitUtil.getInteractAt(bPos, pos).z, z, pixels);
    }
}
