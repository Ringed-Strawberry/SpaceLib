package ringed_strawberry.github.io.spacelib.client.datagen.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import ringed_strawberry.github.io.spacelib.block.properties.SpaceLibBlockProperties;

public class BlockDatagenUtil {
    public static void createNorthDefaultRotationStatesWith4Textures(BlockStateModelGenerator generator, Block block) {
        generator.registerItemModel(block);
        generator.blockStateCollector.accept(MultipartBlockStateSupplier.create(block).with(
                When.create().set(Properties.FACING, Direction.DOWN),
                BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R90)
                ).with(
                When.create().set(Properties.FACING, Direction.UP),
                BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R270)
                ).with(
                When.create().set(Properties.FACING, Direction.NORTH),
                BlockStateVariant.create()
                ).with(
                When.create().set(Properties.FACING, Direction.SOUTH),
                BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R180)
                ).with(
                When.create().set(Properties.FACING, Direction.WEST),
                BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R270)
                ).with(
                When.create().set(Properties.FACING, Direction.EAST),
                BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R90)
                )

                .with(
                When.create().set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 0),
                BlockStateVariant.create().put(VariantSettings.MODEL,
                        Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + "_0"))
                ).with(
                        When.create().set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 1),
                        BlockStateVariant.create().put(VariantSettings.MODEL,
                                Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + "_1"))
                ).with(
                        When.create().set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 2),
                        BlockStateVariant.create().put(VariantSettings.MODEL,
                                Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + "_2"))
                ).with(
                        When.create().set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 3),
                        BlockStateVariant.create().put(VariantSettings.MODEL,
                                Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + "_3"))
                ));
    }
}
