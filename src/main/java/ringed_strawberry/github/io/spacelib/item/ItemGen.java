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

public class ItemGen {

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
                emptyBaseSlotTextures, emptyAdditionsSlotTextures,
                new Item.Settings()
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
                ItemStatics.getDefaultUpgradeEmptyBaseSlotTextures(), ItemStatics.getDefaultUpgradeEmptyBaseSlotTextures(), new Item.Settings()
        );
        return Registry.register(Registries.ITEM, keyOf(id), item);
    }

    public static Item register(RegistryKey<Item> key, Function<Item.Settings, Item> factory, Item.Settings settings) {
        return Registry.register(Registries.ITEM, key, factory.apply(settings.registryKey(key)));
    }

    public static RegistryKey<Item> keyOf(Identifier id) {
        return RegistryKey.of(RegistryKeys.ITEM, id);
    }

    public static void registerItems(){

    }
}
