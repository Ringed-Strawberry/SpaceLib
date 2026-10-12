package ringed_strawberry.github.io.spacelib.client.datagen.block;

import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.ModelVariant;
import net.minecraft.util.Identifier;

import static net.minecraft.client.data.BlockStateModelGenerator.createModelVariant;
import static net.minecraft.client.data.BlockStateModelGenerator.createWeightedVariant;

public class BlockDatagenUtil {
    public static void registerSimpleCubeAllRandomModels(BlockStateModelGenerator generator, Block block, int count, boolean zeroIndexed){
        Identifier id = TexturedModel.CUBE_ALL.upload(block, generator.modelCollector);
        int modifiedCount = count;
        if(zeroIndexed)
            modifiedCount = count-1;
        Identifier[] ids = new Identifier[modifiedCount];
        for (int i = 0; i < modifiedCount; i++) {
            String suffix = "_" + (i + 1);
            ids[i] = Models.CUBE_ALL.upload(block, suffix, TextureMap.all(id.withPath(id.getPath() + suffix)), generator.modelCollector);
        }
        ModelVariant[] variants = new ModelVariant[ids.length];
        for (int i = 0; i < ids.length; i++) {
            variants[i] = createModelVariant(ids[i]);
        }
        generator.blockStateCollector.accept(VariantsBlockModelDefinitionCreator.of(block, createWeightedVariant(variants)));
    }
}