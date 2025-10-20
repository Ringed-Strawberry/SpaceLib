package ringed_strawberry.github.io.spacelib.math.util;

public class MathUtil {
    public static boolean isBetween(float input, float min, float max){
        return input <= max && input >= min;
    }

    public static boolean isInRange(float input, float range){
        return input <= input-range && input >= input+range;
    }

    public static boolean isInRange(float input, int pixels){
        return input <= input-pixels*0.07 && input >= input+pixels*0.07;
    }
}
