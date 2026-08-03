package ringed_strawberry.github.io.spacelib.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ItemGen {
    public static Item createItem(Identifier id, Function<Item.Properties, Item> factory, Item.Properties settings) {
        return register(keyOf(id), factory, settings);
    }

    public static Item register(ResourceKey<Item> key, Function<Item.Properties, Item> factory, Item.Properties settings) {
        Item item = factory.apply(settings.setId(key));
        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }

    private static ResourceKey<Item> keyOf(Identifier id) {
        return ResourceKey.create(Registries.ITEM, id);
    }
}
