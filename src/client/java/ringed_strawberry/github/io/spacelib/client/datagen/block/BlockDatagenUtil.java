package ringed_strawberry.github.io.spacelib.client.datagen.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import ringed_strawberry.github.io.spacelib.block.properties.SpaceLibBlockProperties;

import java.util.List;

import static com.ibm.icu.impl.ValidIdentifiers.Datatype.variant;
import static ringed_strawberry.github.io.spacelib.Spacelib.MOD_ID;
import static ringed_strawberry.github.io.spacelib.block.custom.PoleBlock.*;

public class BlockDatagenUtil {
    public static void createNorthDefaultRotationStatesWith4Textures(BlockStateModelGenerator generator, Block block) {
        generator.registerItemModel(block);
        generator.blockStateCollector.accept(MultipartBlockStateSupplier.create(block).with(
                                When.create().set(Properties.FACING, Direction.DOWN)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 0),
                                BlockStateVariant.create()
                                        .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_0"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.DOWN)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 1),
                                BlockStateVariant.create()
                                        .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_1"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.DOWN)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 2),
                                BlockStateVariant.create()
                                        .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_2"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.DOWN)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 3),
                                BlockStateVariant.create()
                                        .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_3"))
                        )




                        .with(
                                When.create().set(Properties.FACING, Direction.UP)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 0),
                                BlockStateVariant.create()
                                        .put(VariantSettings.X, VariantSettings.Rotation.R270)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_0"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.UP)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 1),
                                BlockStateVariant.create()
                                        .put(VariantSettings.X, VariantSettings.Rotation.R270)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_1"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.UP)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 2),
                                BlockStateVariant.create()
                                        .put(VariantSettings.X, VariantSettings.Rotation.R270)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_2"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.UP)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 3),
                                BlockStateVariant.create()
                                        .put(VariantSettings.X, VariantSettings.Rotation.R270)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_3"))
                        )





                        .with(
                        When.create().set(Properties.FACING, Direction.NORTH)
                                .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 0),
                        BlockStateVariant.create()
                                .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                        TextureMap.getId(block).getPath() + "_0"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.NORTH)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 1),
                                BlockStateVariant.create()
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_1"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.NORTH)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 2),
                                BlockStateVariant.create()
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_2"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.NORTH)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 3),
                                BlockStateVariant.create()
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_3"))
                        )





                        .with(
                                When.create().set(Properties.FACING, Direction.SOUTH)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 0),
                                BlockStateVariant.create()
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R180)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_0"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.SOUTH)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 1),
                                BlockStateVariant.create()
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R180)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_1"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.SOUTH)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 2),
                                BlockStateVariant.create()
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R180)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_2"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.SOUTH)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 3),
                                BlockStateVariant.create()
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R180)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_3"))
                        )





                        .with(
                                When.create().set(Properties.FACING, Direction.WEST)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 0),
                                BlockStateVariant.create()
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_0"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.WEST)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 1),
                                BlockStateVariant.create()
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_1"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.WEST)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 2),
                                BlockStateVariant.create()
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_2"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.WEST)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 3),
                                BlockStateVariant.create()
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_3"))
                        )





                        .with(
                                When.create().set(Properties.FACING, Direction.EAST)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 0),
                                BlockStateVariant.create()
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_0"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.EAST)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 1),
                                BlockStateVariant.create()
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_1"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.EAST)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 2),
                                BlockStateVariant.create()
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_2"))
                        ).with(
                                When.create().set(Properties.FACING, Direction.EAST)
                                        .set(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 3),
                                BlockStateVariant.create()
                                        .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                        .put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
                                                TextureMap.getId(block).getPath() + "_3"))
                ));
    }

    public static List<BooleanProperty> properties = List.of(
            SpaceLibBlockProperties.UP,
            SpaceLibBlockProperties.DOWN,
            SpaceLibBlockProperties.LEFT,
            SpaceLibBlockProperties.RIGHT
    );


    public static void createNorthDefaultRotationStatesWith4Sides(BlockStateModelGenerator generator, Block block) {
        generator.registerItemModel(block);
        MultipartBlockStateSupplier supplier = MultipartBlockStateSupplier.create(block);
//        for (int i = 0; i <= 15; i++) {
//            if(0 <= i && i >= 3) {
//                BlockStateVariant variant = BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R90);
//                When.PropertyCondition when = When.create().set(Properties.FACING, Direction.UP);
//                for (int j = 0; j <= 3; j++) {
//                    when.set(properties.get(j), ((i >> j) & 1) == 1);
//                    if (((i >> j) & 1) == 1) {
//                        variant.put(VariantSettings.MODEL, Identifier.of(TextureMap.getId(block).getNamespace(),
//                                TextureMap.getId(block).getPath() + getDirectionFromInt(j)));
//                    }
//                }
//                supplier = supplier.with(when,variant);
//            }
//        }


//        rotationXYZ = VariantSettings.X;
//        rotationDegrees = VariantSettings.Rotation.R270;
//
//        NORTH_EDGECASE
//
//        rotationXYZ = VariantSettings.Y;
//        rotationDegrees = VariantSettings.Rotation.R180;
//
//        rotationXYZ = VariantSettings.Y;
//        rotationDegrees = VariantSettings.Rotation.R270;
//
//        rotationXYZ = VariantSettings.Y;
//        rotationDegrees = VariantSettings.Rotation.R90;
//        supplier.with(When.create().set(Properties.FACING, Direction.NORTH), BlockStateVariant.create().put(VariantSettings.MODEL, Identifier.of("a", "a")).put(VariantSettings.MODEL, Identifier.of("a", "a")));
        generator.blockStateCollector.accept(supplier);
    }


    public static boolean getBooleanFromInt(int value){
        if(value == 0)
            return false;
        return value == 1;
    }

    public static String getDirectionFromInt(int value){
        if(value == 0)
            return "_up";
        if(value == 1)
            return "_down";
        if(value == 2)
            return "_left";
        if(value == 3)
            return "_right";
        return "";
    }

    public static void createPoleBlock(BlockStateModelGenerator generator, Block block){
        generator.registerItemModel(block);
        MultipartBlockStateSupplier supplier = MultipartBlockStateSupplier.create(block);
        for (int i = 0; i < 3; i++) {
            supplier = supplier.with(
                    When.create().set(POLES, i).set(TOP, true),
                    BlockStateVariant.create().put(VariantSettings.MODEL,
                            Identifier.of(MOD_ID, TextureMap.getId(block).getPath() + "_top" + "_" + i)));
            supplier = supplier.with(
                    When.create().set(POLES, i).set(BOTTOM, true),
                    BlockStateVariant.create().put(VariantSettings.MODEL,
                            Identifier.of(MOD_ID, TextureMap.getId(block).getPath() + "_bottom" + "_" + i)));
            supplier = supplier.with(
                    When.create().set(POLES, i).set(MIDDLE, true),
                    BlockStateVariant.create().put(VariantSettings.MODEL,
                            Identifier.of(MOD_ID, TextureMap.getId(block).getPath() + "_middle" + "_" + i)));
            supplier = supplier.with(
                    When.create().set(POLES, i),
                    BlockStateVariant.create().put(VariantSettings.MODEL,
                            Identifier.of(MOD_ID, TextureMap.getId(block).getPath() + "_" + i)));
        }

        generator.blockStateCollector.accept(supplier);
    }
}
