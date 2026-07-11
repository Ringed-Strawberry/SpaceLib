package ringed_strawberry.github.io.spacelib;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static ringed_strawberry.github.io.spacelib.block.BlockGen.registerBlocks;
import static ringed_strawberry.github.io.spacelib.item.ItemGen.createDefaultIconSmithingUpgradeTemplate;
import static ringed_strawberry.github.io.spacelib.item.ItemGen.registerItems;

public class Spacelib implements ModInitializer {
    public static final String MOD_ID = "spacelib";
    @Override
    public void onInitialize() {
        registerBlocks();
        registerItems();
        Item item = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "sdiad"), new Item(new Item.Settings()));
        Item sd = createDefaultIconSmithingUpgradeTemplate(Identifier.of(MOD_ID, "temaspla"), "neth");
    }
}
