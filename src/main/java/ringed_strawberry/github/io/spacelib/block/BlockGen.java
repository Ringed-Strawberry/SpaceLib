package ringed_strawberry.github.io.spacelib.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import ringed_strawberry.github.io.spacelib.block.custom.PoleBlock;
import ringed_strawberry.github.io.spacelib.block.custom.RotatableFourSidedBlock;
import ringed_strawberry.github.io.spacelib.block.custom.RotatableFourTextureBlock;

import java.util.function.Function;

import static ringed_strawberry.github.io.spacelib.Spacelib.MOD_ID;

public class BlockGen {
    public static RegistryKey<Block> keyOf(Identifier id) {
        return RegistryKey.of(RegistryKeys.BLOCK, id);
    }

    public static RegistryKey<Item> itemKeyOf(Identifier id) {
        return RegistryKey.of(RegistryKeys.ITEM, id);
    }

    public static Block createBlock(Function<AbstractBlock.Settings, Block> factory, Identifier id, AbstractBlock.Settings settings) {
        return register(keyOf(id), itemKeyOf(id), factory, settings);
    }

    public static Block register(RegistryKey<Block> blockKey, RegistryKey<Item> itemKey, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = factory.apply(settings);
        Registry.register(Registries.ITEM, itemKey, new BlockItem(block, new Item.Settings()));
        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    public static final Block TEST_FOUR_SIDED_BLOCK =
            createBlock(RotatableFourSidedBlock::new ,
                    Identifier.of(MOD_ID, "test_four_sided_block"),
                    AbstractBlock.Settings.create());

    public static final Block TEST_POLE_BLOCK =
            createBlock(PoleBlock::new,
                    Identifier.of(MOD_ID, "test_pole_block"),
                    AbstractBlock.Settings.create());

    public static void registerBlocks(){

    }
}
