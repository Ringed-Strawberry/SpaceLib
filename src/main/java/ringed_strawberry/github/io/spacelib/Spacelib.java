package ringed_strawberry.github.io.spacelib;

import net.fabricmc.api.ModInitializer;

import static ringed_strawberry.github.io.spacelib.block.BlockGen.registerBlocks;

public class Spacelib implements ModInitializer {
    public static final String MOD_ID = "spacelib";
    @Override
    public void onInitialize() {
        registerBlocks();
    }
}
