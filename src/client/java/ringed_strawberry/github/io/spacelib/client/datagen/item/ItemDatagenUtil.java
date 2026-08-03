package ringed_strawberry.github.io.spacelib.client.datagen.item;

import net.minecraft.client.color.item.ItemTintSource;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

import java.util.Optional;

public class ItemDatagenUtil {
    public static void registerWithFourTints(ItemModelGenerators itemModelGenerator, Item item, ItemTintSource tint, ItemTintSource tint1, ItemTintSource tint2, ItemTintSource tint3){
        Identifier identifier = uploadFourLayers(item, TextureMapping.getItemTexture(item),
                TextureMapping.getItemTexture(item, "_tinted1"),
                TextureMapping.getItemTexture(item, "_tinted2"),
                TextureMapping.getItemTexture(item, "_tinted3"),
                itemModelGenerator);
        itemModelGenerator.itemModelOutput.accept(item, ItemModelUtils.tintedModel(identifier, tint, tint1, tint2, tint3));
    }

    public static void registerWithFiveTints(ItemModelGenerators itemModelGenerator, Item item, ItemTintSource tint, ItemTintSource tint1, ItemTintSource tint2, ItemTintSource tint3, ItemTintSource tint4){
        Identifier identifier = uploadFiveLayers(item, TextureMapping.getItemTexture(item),
                TextureMapping.getItemTexture(item, "_tinted1"),
                TextureMapping.getItemTexture(item, "_tinted2"),
                TextureMapping.getItemTexture(item, "_tinted3"),
                TextureMapping.getItemTexture(item, "_tinted4"),
                itemModelGenerator);
        itemModelGenerator.itemModelOutput.accept(item, ItemModelUtils.tintedModel(identifier, tint,tint1,tint2,tint3,tint4));
    }

    public static Identifier uploadFourLayers(Item item, Material layer0, Material layer1, Material layer2, Material layer3, ItemModelGenerators itemModelGenerator) {
        return GENERATED_FOUR_LAYERS.create(item, layered4(layer0, layer1, layer2, layer3), itemModelGenerator.modelOutput);
    }

    public static Identifier uploadFiveLayers(Item item, Material layer0, Material layer1, Material layer2, Material layer3, Material layer4, ItemModelGenerators itemModelGenerator) {
        return GENERATED_FIVE_LAYERS.create(item, layered5(layer0, layer1, layer2, layer3, layer4), itemModelGenerator.modelOutput);
    }
    public static final TextureSlot LAYER3 = of("layer3");
    public static final TextureSlot LAYER4 = of("layer4");
    public static final ModelTemplate GENERATED_FOUR_LAYERS = item("generated", TextureSlot.LAYER0, TextureSlot.LAYER1, TextureSlot.LAYER2, LAYER3);
    public static final ModelTemplate GENERATED_FIVE_LAYERS = item("generated", TextureSlot.LAYER0, TextureSlot.LAYER1, TextureSlot.LAYER2, LAYER3, LAYER4);

    public static TextureSlot of(String name) {
        return TextureSlot.create(name, null);
    }

    private static ModelTemplate item(String parent, TextureSlot... requiredTextureSlots) {
        return new ModelTemplate(Optional.of(Identifier.withDefaultNamespace("item/" + parent)), Optional.empty(), requiredTextureSlots);
    }

    public static TextureMapping layered4(Material layer0, Material layer1, Material layer2, Material layer3) {
        return (new TextureMapping()).put(TextureSlot.LAYER0, layer0).put(TextureSlot.LAYER1, layer1).put(TextureSlot.LAYER2, layer2).put(LAYER3, layer3);
    }

    public static TextureMapping layered5(Material layer0, Material layer1, Material layer2, Material layer3, Material layer4) {
        return (new TextureMapping()).put(TextureSlot.LAYER0, layer0).put(TextureSlot.LAYER1, layer1).put(TextureSlot.LAYER2, layer2).put(LAYER3, layer3).put(LAYER4, layer4);
    }
}
