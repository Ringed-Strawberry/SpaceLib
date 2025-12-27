package ringed_strawberry.github.io.spacelib.block.properties;

import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;

public class SpaceLibBlockProperties {
    public static final IntProperty FOUR_TEXTURE_PROPERTY = IntProperty.of("texture", 0, 3);
    public static final BooleanProperty UP = BooleanProperty.of("up");
    public static final BooleanProperty DOWN = BooleanProperty.of("down");
    public static final BooleanProperty LEFT = BooleanProperty.of("left");
    public static final BooleanProperty RIGHT = BooleanProperty.of("right");

}
