package ringed_strawberry.github.io.spacelib.block.util;

import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
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
        return switch (hit.getSide()) {
            case NORTH -> new Vec2f(x, y);

            case SOUTH -> new Vec2f(1.0f - x, y);

            case WEST -> new Vec2f(1.0f - z, y);

            case EAST -> new Vec2f(z, y);

            case UP, DOWN -> new Vec2f(x, z);

        };
    }

    public static Vec2f getVec2fInteractAt(BlockPos bPos, Vec3d pos, Direction dir){
        float x = (float) (pos.getX() + bPos.getX()*-1);
        float y = (float) (pos.getY() + bPos.getY()*-1);
        float z = (float) (pos.getZ() + bPos.getZ()*-1);
        return switch (dir) {
            case NORTH, SOUTH -> new Vec2f(x, y);
            case UP, DOWN -> new Vec2f(x, z);
            case WEST, EAST -> new Vec2f(z, y);
        };
    }

    public static boolean isInteractionInRange(BlockHitResult hit, float x, float y, float radius){
        return MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(hit).x, x, radius) &&
                MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(hit).y, y, radius);
    }

    public static boolean isInteractionInRange(BlockPos bPos, Vec3d pos, Direction dir, float x, float y, float radius){
        return MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(bPos, pos,dir).x, x, radius) &&
                MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(bPos, pos,dir).y, y, radius);
    }

    public static boolean isInteractionInRange(BlockHitResult hit, float x, float y, int pixels){
        return MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(hit).x, x, pixels) &&
                MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(hit).y, y, pixels);
    }

    public static boolean isInteractionInRange(BlockPos bPos, Vec3d pos, Direction dir, float x, float y, int pixels){
        return MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(bPos, pos, dir).x, x, pixels) &&
                MathUtil.isInRange(BlockHitUtil.getVec2fInteractAt(bPos, pos, dir).y, y, pixels);
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

    public static byte getSide(BlockPos bPos, Vec3d pos){
        if(MathUtil.isInRange((float) BlockHitUtil.getInteractAt(bPos, pos).x, 0f, 8)){
            return 0;
        }
        if(MathUtil.isInRange((float) BlockHitUtil.getInteractAt(bPos, pos).y, 0f, 8)){
            return 1;
        }
        if(MathUtil.isInRange((float) BlockHitUtil.getInteractAt(bPos, pos).x, 1f, 8)){
            return 2;
        }
        if(MathUtil.isInRange((float) BlockHitUtil.getInteractAt(bPos, pos).y, 1f, 8)){
            return 3;
        }
        return 0;
    }

    public static byte getSide(BlockHitResult hit){
        Vec2f hitPos = getVec2fInteractAt(hit);

        float x = hitPos.x - 0.5f;
        float y = hitPos.y - 0.5f;


        if (Math.abs(x) > Math.abs(y)) {

            if (x > 0) {
                return 4;
            } else {
                return 3;
            }
        } else {

            if (y > 0) {
                return 2;
            } else {
                return 1;
            }
        }
    }
}
