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
import ringed_strawberry.github.io.spacelib.block.custom.AirPlaceableBlock;
import ringed_strawberry.github.io.spacelib.item.custom.AirPlaceableBlockItem;

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
        Block registered = Registry.register(Registries.BLOCK, blockKey, block);
        Registry.register(Registries.ITEM, itemKey, new BlockItem(block, new Item.Settings().registryKey(itemKey)));
        return registered;
    }

    public static Block createBlockWithExtras(Block block, Identifier id) {
        return registerBlockWithExtras(keyOf(id), itemKeyOf(id), block);
    }

    public static Block registerBlockWithExtras(RegistryKey<Block> blockKey, RegistryKey<Item> itemKey, Block block) {
        Registry.register(Registries.ITEM, itemKey, new BlockItem(block, new Item.Settings()));
        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    public static Block createAirPlaceableBlock(Identifier id, AbstractBlock.Settings settings) {
        return registerAirPlaceableBlock(AirPlaceableBlock::new, keyOf(id), itemKeyOf(id), settings);
    }

    public static Block createAirPlaceableBlockWithExtras(Identifier id, AirPlaceableBlock block) {
        return registerAirPlaceableBlockWithExtras(keyOf(id), itemKeyOf(id), block);
    }

    public static Block registerAirPlaceableBlock(Function<AbstractBlock.Settings, AirPlaceableBlock> factory,RegistryKey<Block> blockKey, RegistryKey<Item> itemKey, AbstractBlock.Settings settings) {
        Block block = factory.apply(settings);
        Registry.register(Registries.ITEM, itemKey, new AirPlaceableBlockItem(block, new Item.Settings()));
        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    public static Block registerAirPlaceableBlockWithExtras(RegistryKey<Block> blockKey, RegistryKey<Item> itemKey, AirPlaceableBlock block) {
        Registry.register(Registries.ITEM, itemKey, new AirPlaceableBlockItem(block, new Item.Settings()));
        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    public static void registerBlocks(){

    }
}
