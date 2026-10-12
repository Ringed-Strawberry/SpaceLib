package ringed_strawberry.github.io.spacelib.entity.util;

import net.minecraft.entity.Entity;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.util.math.Vec3d;

import java.util.List;

public class EntityUtil {
    public static boolean isPlayerInRange(List<Entity> list, double x, double y, double z, double range) {
        for(Entity entity : list) {
            if (EntityPredicates.EXCEPT_SPECTATOR.test(entity) && EntityPredicates.VALID_ENTITY.test(entity)) {
                double d = entity.squaredDistanceTo(x, y, z);
                if (range < (double)0.0F || d < range * range) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Vec3d getVec3dFromString(String string){
        String[] splitValues = string.split(",");
        double x = Double.parseDouble(splitValues[0]);
        double y = Double.parseDouble(splitValues[1]);
        double z = Double.parseDouble(splitValues[2]);
        return new Vec3d(x,y,z);
    }
}
