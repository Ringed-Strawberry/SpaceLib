package ringed_strawberry.github.io.spacelib.item.components;

import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DataComponentGen {

    public static ComponentType registerComponent(Identifier id, ComponentType type){
        return Registry.register(
            Registries.DATA_COMPONENT_TYPE, id, type);
    }
}
