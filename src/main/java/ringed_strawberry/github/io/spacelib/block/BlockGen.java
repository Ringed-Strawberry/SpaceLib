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

import java.util.function.Function;

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
        Block block = factory.apply(settings.registryKey(blockKey));
        Registry.register(Registries.ITEM, itemKey, new BlockItem(block, new Item.Settings().registryKey(itemKey)));
        return Registry.register(Registries.BLOCK, blockKey, block);
    }
}
