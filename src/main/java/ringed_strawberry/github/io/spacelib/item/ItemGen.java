package ringed_strawberry.github.io.spacelib.item;

import net.minecraft.item.Item;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Function;

import static ringed_strawberry.github.io.spacelib.Spacelib.MOD_ID;

public class ItemGen {
    public static final Item test = ItemGen.createItem(Identifier.of(MOD_ID, "test"), Item::new, new Item.Settings());

    public static Item createItem(Identifier id, Function<Item.Settings, Item> factory, Item.Settings settings) {
        return register(keyOf(id), factory, settings);
    }

    public static Item createSmithingUpgradeTemplate(Identifier id, String translationID, List<Identifier> emptyBaseSlotTextures, List<Identifier> emptyAdditionsSlotTextures){
        Item item = new SmithingTemplateItem(
                Text.translatable(id.getNamespace() + ":smithing_template." + translationID + ".applies_to")
                        .formatted(ItemStatics.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
                Text.translatable(id.getNamespace() + ":smithing_template." + translationID + ".ingredients")
                        .formatted(ItemStatics.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
                Text.translatable(id.getNamespace() + ":" + translationID),
                Text.translatable(id.getNamespace() + ":smithing_template." + translationID + ".base_slot_description"),
                Text.translatable(id.getNamespace() + ":smithing_template." + translationID + ".additions_slot_description"),
                emptyBaseSlotTextures, emptyAdditionsSlotTextures
        );
        return Registry.register(Registries.ITEM, keyOf(id), item);
    }

    public static Item createDefaultIconSmithingUpgradeTemplate(Identifier id, String translationID){
        Item item = new SmithingTemplateItem(
                Text.translatable(id.getNamespace() + ":smithing_template." + translationID + ".applies_to")
                        .formatted(ItemStatics.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
                Text.translatable(id.getNamespace() + ":smithing_template." + translationID + ".ingredients")
                        .formatted(ItemStatics.SMITHING_TEMPLATE_DESCRIPTION_FORMATTING),
                Text.translatable(id.getNamespace() + ":" + translationID),
                Text.translatable(id.getNamespace() + ":smithing_template." + translationID + ".base_slot_description"),
                Text.translatable(id.getNamespace() + ":smithing_template." + translationID + ".additions_slot_description"),
                ItemStatics.getDefaultUpgradeEmptyBaseSlotTextures(), ItemStatics.getDefaultUpgradeEmptyBaseSlotTextures()
        );
        return Registry.register(Registries.ITEM, keyOf(id), item);
    }

    public static Item register(RegistryKey<Item> key, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = factory.apply(settings);
        return Registry.register(Registries.ITEM, key, item);
    }

    private static RegistryKey<Item> keyOf(Identifier id) {
        return RegistryKey.of(RegistryKeys.ITEM, id);
    }

    public static void registerItems(){

    }
}
