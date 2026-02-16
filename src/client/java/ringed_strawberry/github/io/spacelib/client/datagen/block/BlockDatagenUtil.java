package ringed_strawberry.github.io.spacelib.client.datagen.block;

import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.data.client.*;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;
import ringed_strawberry.github.io.spacelib.block.properties.SpaceLibBlockProperties;

import java.util.List;

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
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                VariantSetting<VariantSettings.Rotation> rotation = VariantSettings.X;
                if(i == 5 || i == 6 || i == 1 || i == 2)
                    rotation = VariantSettings.Y;
                if(i == 3 || i == 4)
                    rotation = VariantSettings.X;
                if(i == 1 || i == 2){
                        supplier.with(When.create().set(Properties.FACING, getDirectionFromInt(i)).set(properties.get(j), true),

                                BlockStateVariant.create().put(VariantSettings.MODEL,
                                                Identifier.of(TextureMap.getId(block).getNamespace(),
                                                        TextureMap.getId(block).getPath() + getDirectionStringFromInt(i) + "_rotated"))

                                        .put(rotation, getSettingFromSideRotated(j)));
                } else {
                    supplier.with(When.create().set(Properties.FACING, getDirectionFromInt(i)).set(properties.get(j), true),

                            BlockStateVariant.create().put(VariantSettings.MODEL,
                                            Identifier.of(TextureMap.getId(block).getNamespace(),
                                                    TextureMap.getId(block).getPath() + getDirectionStringFromInt(i)))

                                    .put(rotation, getSettingFromSide(j)));
                }
            }
        }
        generator.blockStateCollector.accept(supplier);
    }

    private static VariantSettings.Rotation getSettingFromSideRotated(int side) {
        if(side == 0)
            return VariantSettings.Rotation.R0;
        if(side == 1)
            return VariantSettings.Rotation.R180;
        if(side == 2)
            return VariantSettings.Rotation.R0;
        if(side == 3)
            return VariantSettings.Rotation.R180;
        return VariantSettings.Rotation.R0;
    }

    public static VariantSettings.Rotation getSettingFromSide(int side){
        if(side == 0)
            return VariantSettings.Rotation.R90;
        if(side == 1)
            return VariantSettings.Rotation.R0;
        if(side == 2)
            return VariantSettings.Rotation.R270;
        if(side == 3)
            return VariantSettings.Rotation.R180;
        return VariantSettings.Rotation.R0;
    }


    public static boolean getBooleanFromInt(int value){
        if(value == 0)
            return false;
        return value == 1;
    }

    public static String getDirectionStringFromInt(int value){
        if(value == 0)
            return "_north";
        if(value == 1)
            return "_south";
        if(value == 2)
            return "_west";
        if(value == 3)
            return "_east";
        if(value == 4)
            return "_up";
        if(value == 5)
            return "_down";
        return "";
    }

    public static Direction getDirectionFromInt(int value){
        if(value == 0)
            return Direction.NORTH;
        if(value == 1)
            return Direction.SOUTH;
        if(value == 2)
            return Direction.WEST;
        if(value == 3)
            return Direction.EAST;
        if(value == 4)
            return Direction.UP;
        if(value == 5)
            return Direction.DOWN;
        return Direction.NORTH;
    }

    public static String getSideFromInt(int value){
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

    public static void createPoleBlock(BlockStateModelGenerator generator, Block block, @Nullable String extraLocation){
        if(extraLocation == null){
            extraLocation = "";
        }
        generator.registerItemModel(block);
        MultipartBlockStateSupplier supplier = MultipartBlockStateSupplier.create(block);
        for (int i = 0; i <= 3; i++) {
            supplier = supplier.with(
                    When.create().set(POLES, i).set(TOP, true).set(PillarBlock.AXIS, Direction.Axis.X),
                    BlockStateVariant.create().put(VariantSettings.MODEL,
                            Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_top" + "_" + i))
                            .put(VariantSettings.Y, VariantSettings.Rotation.R90)
            );
            supplier = supplier.with(
                    When.create().set(POLES, i).set(BOTTOM, true).set(PillarBlock.AXIS, Direction.Axis.X),
                    BlockStateVariant.create().put(VariantSettings.MODEL,
                                    Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_bottom" + "_" + i))
                            .put(VariantSettings.Y, VariantSettings.Rotation.R90)
            );
            supplier = supplier.with(
                    When.create().set(POLES, i).set(MIDDLE, true).set(PillarBlock.AXIS, Direction.Axis.X),
                    BlockStateVariant.create().put(VariantSettings.MODEL,
                                    Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_middle" + "_" + i))
                            .put(VariantSettings.Y, VariantSettings.Rotation.R90)
            );
            supplier = supplier.with(
                    When.create().set(POLES, i).set(PillarBlock.AXIS, Direction.Axis.X).set(MIDDLE, false).set(TOP, false).set(BOTTOM, false),
                    BlockStateVariant.create().put(VariantSettings.MODEL,
                                    Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_" + i))
                            .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                            .put(VariantSettings.X, VariantSettings.Rotation.R90)
            );



            supplier = supplier.with(
                    When.create().set(POLES, i).set(TOP, true).set(PillarBlock.AXIS, Direction.Axis.Y),
                    BlockStateVariant.create().put(VariantSettings.MODEL,
                                    Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_top" + "_" + i))
            );
            supplier = supplier.with(
                    When.create().set(POLES, i).set(BOTTOM, true).set(PillarBlock.AXIS, Direction.Axis.Y),
                    BlockStateVariant.create().put(VariantSettings.MODEL,
                                    Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_bottom" + "_" + i))
            );
            supplier = supplier.with(
                    When.create().set(POLES, i).set(MIDDLE, true).set(PillarBlock.AXIS, Direction.Axis.Y),
                    BlockStateVariant.create().put(VariantSettings.MODEL,
                                    Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_middle" + "_" + i))
            );
            supplier = supplier.with(
                    When.create().set(POLES, i).set(PillarBlock.AXIS, Direction.Axis.Y).set(MIDDLE, false).set(TOP, false).set(BOTTOM, false),
                    BlockStateVariant.create().put(VariantSettings.MODEL,
                                    Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_" + i))
            );



            supplier = supplier.with(
                    When.create().set(POLES, i).set(TOP, true).set(PillarBlock.AXIS, Direction.Axis.Z),
                    BlockStateVariant.create().put(VariantSettings.MODEL,
                                    Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_top" + "_" + i))
                            .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                            .put(VariantSettings.X, VariantSettings.Rotation.R90)
            );
            supplier = supplier.with(
                    When.create().set(POLES, i).set(BOTTOM, true).set(PillarBlock.AXIS, Direction.Axis.Z),
                    BlockStateVariant.create().put(VariantSettings.MODEL,
                                    Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_bottom" + "_" + i))
                            .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                            .put(VariantSettings.X, VariantSettings.Rotation.R90)
            );
            supplier = supplier.with(
                    When.create().set(POLES, i).set(MIDDLE, true).set(PillarBlock.AXIS, Direction.Axis.Z),
                    BlockStateVariant.create().put(VariantSettings.MODEL,
                                    Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_middle" + "_" + i))
                            .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                            .put(VariantSettings.X, VariantSettings.Rotation.R90)
            );
            supplier = supplier.with(
                    When.create().set(POLES, i).set(PillarBlock.AXIS, Direction.Axis.Z).set(MIDDLE, false).set(TOP, false).set(BOTTOM, false),
                    BlockStateVariant.create().put(VariantSettings.MODEL,
                                    Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_" + i))
                            .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                            .put(VariantSettings.X, VariantSettings.Rotation.R90)
            );
        }


        generator.blockStateCollector.accept(supplier);
    }
}
