package ringed_strawberry.github.io.spacelib.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import ringed_strawberry.github.io.spacelib.block.BlockGen;
import ringed_strawberry.github.io.spacelib.client.datagen.block.BlockDatagenUtil;

public class SpaceLibModelProvider extends FabricModelProvider {
    public SpaceLibModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockDatagenUtil.createNorthDefaultRotationStatesWith4Textures(blockStateModelGenerator, BlockGen.TEST_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    @Override
    public String getName() {
        return "ExampleModModelProvider";
    }
}
