package ringed_strawberry.github.io.spacelib.client.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

public class SpaceLibModelProvider extends FabricModelProvider {
    public SpaceLibModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
//        BlockDatagenUtil.createNorthDefaultRotationStatesWith4Sides(blockStateModelGenerator, BlockGen.TEST_FOUR_SIDED_BLOCK);
//        BlockDatagenUtil.createPoleBlock(blockStateModelGenerator, BlockGen.TEST_POLE_BLOCK, "");
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
    @Override
    public String getName() {
        return "ExampleModModelProvider";
    }
}
