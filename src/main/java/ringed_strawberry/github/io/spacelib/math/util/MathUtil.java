package ringed_strawberry.github.io.spacelib.math.util;

import net.minecraft.util.math.Vec3d;

public class MathUtil {
    public static boolean isBetween(float input, float min, float max){
        return input <= max && input >= min;
    }

    public static boolean isInRange(float input, float range, float radius){
        return input >= range-radius && input <= range+radius;
    }

    public static boolean isInRange(float input, float range, int pixels){
        return input >= range-pixels*0.07 && input <= range+pixels*0.07;
    }

    public static Vec3d[] getPointsInCircle(Vec3d center, int points, double radius){
        Vec3d[] array = new Vec3d[points];
        for (int i = 0; i < points; i++) {
            array[i] = new Vec3d(center.getX()+(radius * Math.cos((Math.PI *2 / points) * i)), center.getY(), center.getZ()+(radius * Math.sin((Math.PI *2 / points) * i)));
        }
        return array;
    }

    public static Vec3d[] getOffsetPointsInCircle(Vec3d center, int points, double radius,double offset){
        Vec3d[] array = new Vec3d[points];
        double offsetRad = Math.toRadians(offset);
        for (int i = 0; i < points; i++) {
            array[i] = new Vec3d(center.getX()+(radius * Math.cos(((Math.PI *2 / points) * i)+ offsetRad)), center.getY(), center.getZ()+(radius * Math.sin(((Math.PI *2 / points) * i)+ offsetRad)));
        }
        return array;
    }
}
