package ringed_strawberry.github.io.spacelib.math.util;

public class MathUtil {
    public static boolean isBetween(float input, float min, float max){
        return input <= max && input >= min;
    }

    public static boolean isInRange(float input, float range, float radius){
        return input <= range-radius && input >= range+radius;
    }

    public static boolean isInRange(float input, float range, int pixels){
        return input <= range-pixels*0.07 && input >= range+pixels*0.07;
    }
}
