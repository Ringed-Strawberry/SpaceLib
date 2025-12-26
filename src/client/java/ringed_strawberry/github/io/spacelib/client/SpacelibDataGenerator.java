package ringed_strawberry.github.io.spacelib.client;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import ringed_strawberry.github.io.spacelib.client.datagen.SpaceLibModelProvider;

public class SpacelibDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(SpaceLibModelProvider::new);
    }
}
