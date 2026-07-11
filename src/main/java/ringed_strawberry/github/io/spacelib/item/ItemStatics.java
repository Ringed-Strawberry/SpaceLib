package ringed_strawberry.github.io.spacelib.item;

import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

public class ItemStatics {
    public static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_helmet");
    public static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_chestplate");
    public static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_leggings");
    public static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_boots");
    public static final Identifier EMPTY_SLOT_HOE_TEXTURE = Identifier.ofVanilla("item/empty_slot_hoe");
    public static final Identifier EMPTY_SLOT_AXE_TEXTURE = Identifier.ofVanilla("item/empty_slot_axe");
    public static final Identifier EMPTY_SLOT_SWORD_TEXTURE = Identifier.ofVanilla("item/empty_slot_sword");
    public static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE = Identifier.ofVanilla("item/empty_slot_shovel");
    public static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE = Identifier.ofVanilla("item/empty_slot_pickaxe");
    public static final Identifier EMPTY_SLOT_INGOT_TEXTURE = Identifier.ofVanilla("item/empty_slot_ingot");
    public static final Identifier EMPTY_SLOT_REDSTONE_DUST_TEXTURE = Identifier.ofVanilla("item/empty_slot_redstone_dust");
    public static final Identifier EMPTY_SLOT_QUARTZ_TEXTURE = Identifier.ofVanilla("item/empty_slot_quartz");
    public static final Identifier EMPTY_SLOT_EMERALD_TEXTURE = Identifier.ofVanilla("item/empty_slot_emerald");
    public static final Identifier EMPTY_SLOT_DIAMOND_TEXTURE = Identifier.ofVanilla("item/empty_slot_diamond");
    public static final Identifier EMPTY_SLOT_LAPIS_LAZULI_TEXTURE = Identifier.ofVanilla("item/empty_slot_lapis_lazuli");
    public static final Identifier EMPTY_SLOT_AMETHYST_SHARD_TEXTURE = Identifier.ofVanilla("item/empty_slot_amethyst_shard");

    public static final Formatting SMITHING_TEMPLATE_TITLE_FORMATTING = Formatting.GRAY;
    public static final Formatting SMITHING_TEMPLATE_DESCRIPTION_FORMATTING = Formatting.BLUE;

    public static List<Identifier> getArmorTrimEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE);
    }

    public static List<Identifier> getArmorTrimEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE, EMPTY_SLOT_REDSTONE_DUST_TEXTURE, EMPTY_SLOT_LAPIS_LAZULI_TEXTURE, EMPTY_SLOT_QUARTZ_TEXTURE, EMPTY_SLOT_DIAMOND_TEXTURE, EMPTY_SLOT_EMERALD_TEXTURE, EMPTY_SLOT_AMETHYST_SHARD_TEXTURE);
    }

    public static List<Identifier> getDefaultUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }

    public static List<Identifier> getDefaultUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }
}
