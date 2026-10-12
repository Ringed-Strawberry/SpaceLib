package ringed_strawberry.github.io.spacelib.math.util;

public class TimeUtil {

    public static final int TICK_TO_SEC = 20;

    public static int secondsToTicks(double seconds){
        return (int) (seconds*20);
    }

    public static double ticksToSeconds(int ticks){
        return (double) ticks /20;
    }

    
}
