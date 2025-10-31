package ringed_strawberry.github.io.spacelib.client.datagen.item;

import net.minecraft.client.data.*;
import net.minecraft.client.render.item.tint.TintSource;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ItemDatagenUtil {
    public final void registerWithFourTints(ItemModelGenerator itemModelGenerator, Item item, TintSource tint, TintSource tint1, TintSource tint2, TintSource tint3){
        Identifier identifier = uploadFourLayers(item, TextureMap.getId(item),
                TextureMap.getSubId(item, "_tinted1"),
                TextureMap.getSubId(item, "_tinted2"),
                TextureMap.getSubId(item, "_tinted3"),
                itemModelGenerator);
        itemModelGenerator.output.accept(item, ItemModels.tinted(identifier, new TintSource[]{tint,tint1,tint2,tint3}));
    }

    public final void registerWithFiveTints(ItemModelGenerator itemModelGenerator, Item item, TintSource tint, TintSource tint1, TintSource tint2, TintSource tint3, TintSource tint4){
        Identifier identifier = uploadFiveLayers(item, TextureMap.getId(item),
                TextureMap.getSubId(item, "_tinted1"),
                TextureMap.getSubId(item, "_tinted2"),
                TextureMap.getSubId(item, "_tinted3"),
                TextureMap.getSubId(item, "_tinted4"),
                itemModelGenerator);
        itemModelGenerator.output.accept(item, ItemModels.tinted(identifier, new TintSource[]{tint,tint1,tint2,tint3,tint4}));
    }

    public final Identifier uploadFourLayers(Item item, Identifier layer0, Identifier layer1, Identifier layer2, Identifier layer3, ItemModelGenerator itemModelGenerator) {
        return GENERATED_FOUR_LAYERS.upload(item, layered4(layer0, layer1, layer2, layer3), itemModelGenerator.modelCollector);
    }

    public final Identifier uploadFiveLayers(Item item, Identifier layer0, Identifier layer1, Identifier layer2, Identifier layer3, Identifier layer4, ItemModelGenerator itemModelGenerator) {
        return GENERATED_FIVE_LAYERS.upload(item, layered5(layer0, layer1, layer2, layer3, layer4), itemModelGenerator.modelCollector);
    }
    public static final TextureKey LAYER3 = of("layer3");
    public static final TextureKey LAYER4 = of("layer4");
    public static final Model GENERATED_FOUR_LAYERS = item("generated", TextureKey.LAYER0, TextureKey.LAYER1, TextureKey.LAYER2, LAYER3);
    public static final Model GENERATED_FIVE_LAYERS = item("generated", TextureKey.LAYER0, TextureKey.LAYER1, TextureKey.LAYER2, LAYER3, LAYER4);

    public static TextureKey of(String name) {
        return new TextureKey(name, null);
    }

    private static Model item(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.ofVanilla("item/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    public static TextureMap layered4(Identifier layer0, Identifier layer1, Identifier layer2, Identifier layer3) {
        return (new TextureMap()).put(TextureKey.LAYER0, layer0).put(TextureKey.LAYER1, layer1).put(TextureKey.LAYER2, layer2).put(LAYER3, layer3);
    }

    public static TextureMap layered5(Identifier layer0, Identifier layer1, Identifier layer2, Identifier layer3, Identifier layer4) {
        return (new TextureMap()).put(TextureKey.LAYER0, layer0).put(TextureKey.LAYER1, layer1).put(TextureKey.LAYER2, layer2).put(LAYER3, layer3).put(LAYER4, layer4);
    }
}
