package ringed_strawberry.github.io.spacelib.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class BlockGen {
    public static ResourceKey<Block> keyOf(Identifier id) {
        return ResourceKey.create(Registries.BLOCK, id);
    }

    public static ResourceKey<Item> itemKeyOf(Identifier id) {
        return ResourceKey.create(Registries.ITEM, id);
    }

    public static Block createBlock(Function<BlockBehaviour.Properties, Block> factory, Identifier id, BlockBehaviour.Properties settings) {
        return register(keyOf(id), itemKeyOf(id), factory, settings);
    }

    public static Block register(ResourceKey<Block> blockKey, ResourceKey<Item> itemKey, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        Block block = factory.apply(settings.setId(blockKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, new BlockItem(block, new Item.Properties().setId(itemKey)));
        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }
}
