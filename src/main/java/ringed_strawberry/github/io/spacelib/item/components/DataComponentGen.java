package ringed_strawberry.github.io.spacelib.item.components;

import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class DataComponentGen {

    public static DataComponentType registerComponent(Identifier id, DataComponentType type){
        return Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE, id, type);
    }
}
