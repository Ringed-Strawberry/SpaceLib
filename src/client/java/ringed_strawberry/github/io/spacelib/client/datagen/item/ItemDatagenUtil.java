package ringed_strawberry.github.io.spacelib.client.datagen.item;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ItemDatagenUtil {
    public static final TextureKey LAYER3 = of("layer3");
    public static final TextureKey LAYER4 = of("layer4");
    public static final Model GENERATED_FOUR_LAYERS = item("generated", TextureKey.LAYER0, TextureKey.LAYER1, TextureKey.LAYER2, LAYER3);
    public static final Model GENERATED_FIVE_LAYERS = item("generated", TextureKey.LAYER0, TextureKey.LAYER1, TextureKey.LAYER2, LAYER3, LAYER4);

    public static TextureKey of(String name) {
        return TextureKey.of(name, null);
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
