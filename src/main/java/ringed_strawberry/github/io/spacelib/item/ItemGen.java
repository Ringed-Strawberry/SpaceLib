package ringed_strawberry.github.io.spacelib.item;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemGen {
    public static Item createItem(Item item, String name, String MOD_ID){
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }
}
