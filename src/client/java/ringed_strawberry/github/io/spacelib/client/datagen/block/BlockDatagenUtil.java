//package ringed_strawberry.github.io.spacelib.client.datagen.block;
//
//import net.minecraft.block.Block;
//import net.minecraft.block.PillarBlock;
//import net.minecraft.client.data.BlockStateModelGenerator;
//import net.minecraft.client.data.MultipartBlockModelDefinitionCreator;
//import net.minecraft.client.data.TextureMap;
//import net.minecraft.client.render.model.json.*;
//import net.minecraft.state.StateManager;
//import net.minecraft.state.property.BooleanProperty;
//import net.minecraft.state.property.Properties;
//import net.minecraft.util.Identifier;
//import net.minecraft.util.collection.WeightedPool;
//import net.minecraft.util.math.AxisRotation;
//import net.minecraft.util.math.Direction;
//import org.jetbrains.annotations.Nullable;
//import ringed_strawberry.github.io.spacelib.block.properties.SpaceLibBlockProperties;
//
//import java.util.List;
//
//import static ringed_strawberry.github.io.spacelib.block.custom.PoleBlock.*;
//
//public class BlockDatagenUtil {
//    public static void createNorthDefaultRotationStatesWith4Textures(BlockStateModelGenerator generator, Block block) {
//        generator.registerItemModel(block);
//        generator.blockStateCollector.accept(MultipartBlockModelDefinitionCreator.create(block).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.DOWN)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 0),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(Identifier.of(TextureMap.getId(block).getNamespace(),
//                                        TextureMap.getId(block).getPath() + "_0")).withRotationX(AxisRotation.R90)).build())
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.DOWN)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 1),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(ModelVariant.ModelState.DEFAULT.setRotationX(AxisRotationof(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_1"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.DOWN)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 2),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(ModelVariant.ModelState.DEFAULT.setRotationX(AxisRotationof(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_2"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.DOWN)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 3),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(ModelVariant.ModelState.DEFAULT.setRotationX(AxisRotationof(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_3"))
//                        )
//
//
//
//
//                        .with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.UP)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 0),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(ModelVariant.ModelState.DEFAULT.setRotationX(AxisRotation.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_0"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.UP)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 1),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(ModelVariant.ModelState.DEFAULT.setRotationX(AxisRotation.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_1"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.UP)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 2),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(ModelVariant.ModelState.DEFAULT.setRotationX(AxisRotation.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_2"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.UP)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 3),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(ModelVariant.ModelState.DEFAULT.setRotationX(AxisRotation.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_3"))
//                        )
//
//
//
//
//
//                        .with(
//                        new MultipartModelConditionBuilder().put(Properties.FACING, Direction.NORTH)
//                                .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 0),
//                        new WeightedVariant(WeightedPool.<ModelVariant>bu(Identifier.of(TextureMap.getId(block).getNamespace(),
//                                        TextureMap.getId(block).getPath() + "_0"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.NORTH)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 1),
//                                new WeightedVariant(WeightedPool.<ModelVariant>bu(Identifier.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_1"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.NORTH)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 2),
//                                new WeightedVariant(WeightedPool.<ModelVariant>bu(Identifier.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_2"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.NORTH)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 3),
//                                new WeightedVariant(WeightedPool.<ModelVariant>bu(Identifier.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_3"))
//                        )
//
//
//
//
//
//                        .with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.SOUTH)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 0),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(.withRotationY(V(Identifier.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_0"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.SOUTH)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 1),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(.withRotationY(V(Identifier.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_1"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.SOUTH)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 2),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(.withRotationY(V(Identifier.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_2"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.SOUTH)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 3),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(.withRotationY(V(Identifier.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_3"))
//                        )
//
//
//
//
//
//                        .with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.WEST)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 0),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(.withRotationY(V(Identifier.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_0"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.WEST)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 1),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(.withRotationY(V(Identifier.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_1"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.WEST)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 2),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(.withRotationY(V(Identifier.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_2"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.WEST)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 3),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(.withRotationY(V(Identifier.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_3"))
//                        )
//
//
//
//
//
//                        .with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.EAST)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 0),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(.withRotationY(dentifier.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_0"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.EAST)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 1),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(.withRotationY(dentifier.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_1"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.EAST)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 2),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(.withRotationY(dentifier.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_2"))
//                        ).with(
//                                new MultipartModelConditionBuilder().put(Properties.FACING, Direction.EAST)
//                                        .put(SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY, 3),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(.withRotationY(dentifier.of(TextureMap.getId(block).getNamespace(),
//                                                TextureMap.getId(block).getPath() + "_3"))
//                ));
//    }
//
//    public static List<BooleanProperty> properties = List.of(
//            SpaceLibBlockProperties.UP,
//            SpaceLibBlockProperties.DOWN,
//            SpaceLibBlockProperties.LEFT,
//            SpaceLibBlockProperties.RIGHT
//    );
//
//
//    public static void createNorthDefaultRotationStatesWith4Sides(BlockStateModelGenerator generator, Block block) {
//        generator.registerItemModel(block);
//        MultipartBlockModelDefinitionCreator supplier = MultipartBlockModelDefinitionCreator.create(block);
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 4; j++) {
//
//                if(i == 4 || i == 5 || i == 0 || i == 1)
//                    rotation = VariantSettings.Y;
//                if(i == 2 || i == 3)
//                    rotation = VariantSettings.X;
//                if(i == 0 || i == 1){
//                    String rotated = "";
//                    if(j == 0 || j == 2){
//                        rotated =  "_rotated";
//                    }
//                        supplier.with(new MultipartModelConditionBuilder().put(
//                                Properties.FACING, getDirectionFromInt(i)).put(properties.get(j), true),
//                                new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(           (Identifier.of(TextureMap.getId(block).getNamespace(),
//                                                        TextureMap.getId(block).getPath() + getDirectionStringFromInt(i) + rotated))
//
//                                        .put(rotation, getSettingFromSideRotated(j)));
//                } else {
//                    supplier.with(new MultipartModelConditionBuilder().put(
//                            Properties.FACING, getDirectionFromInt(i)).put(properties.get(j), true),
//                            new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(       (Identifier.of(TextureMap.getId(block).getNamespace(),
//                                                    TextureMap.getId(block).getPath() + getDirectionStringFromInt(i)))
//
//                                    .put(rotation, getSettingFromSide(j)));
//                }
//            }
//        }
//        generator.blockStateCollector.accept(supplier);
//    }
//
//    private static AxisRotation getSettingFromSideRotated(int side) {
//        if(side == 0 || side == 2)
//            return AxisRotation.R90;
//        if(side == 1 || side == 3)
//            return AxisRotation.R180;
//        return AxisRotation.R0;
//    }
//
//    public static VariantSettings.Rotation getSettingFromSide(int side){
//        if(side == 0)
//            return AxisRotation.R90;
//        if(side == 1)
//            return AxisRotation.R0;
//        if(side == 2)
//            return AxisRotation.R270;
//        if(side == 3)
//            return AxisRotation.R180;
//        return AxisRotation.R0;
//    }
//
//
//    public static boolean getBooleanFromInt(int value){
//        if(value == 0)
//            return false;
//        return value == 1;
//    }
//
//    public static String getDirectionStringFromInt(int value){
//        if(value == 0)
//            return "_north";
//        if(value == 1)
//            return "_south";
//        if(value == 2)
//            return "_west";
//        if(value == 3)
//            return "_east";
//        if(value == 4)
//            return "_up";
//        if(value == 5)
//            return "_down";
//        return "";
//    }
//
//    public static Direction getDirectionFromInt(int value){
//        if(value == 0)
//            return Direction.NORTH;
//        if(value == 1)
//            return Direction.SOUTH;
//        if(value == 2)
//            return Direction.WEST;
//        if(value == 3)
//            return Direction.EAST;
//        if(value == 4)
//            return Direction.UP;
//        if(value == 5)
//            return Direction.DOWN;
//        return Direction.NORTH;
//    }
//
//    public static String getSideFromInt(int value){
//        if(value == 0)
//            return "_up";
//        if(value == 1)
//            return "_down";
//        if(value == 2)
//            return "_left";
//        if(value == 3)
//            return "_right";
//        return "";
//    }
//
//    public static void createPoleBlock(BlockStateModelGenerator generator, Block block, @Nullable String extraLocation){
//        if(extraLocation == null){
//            extraLocation = "";
//        }
//        generator.registerItemModel(block);
//        MultipartBlockModelDefinitionCreator supplier = MultipartBlockModelDefinitionCreator.create(block);
//        for (int i = 0; i <= 3; i++) {
//            supplier = supplier.with(
//                    new MultipartModelConditionBuilder().put(POLES, i).put(TOP, true).put(PillarBlock.AXIS, Direction.Axis.X),
//                    new WeightedVariant(WeightedPool.<ModelVariant>b(Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_top" + "_" + i)).withRotationY(AxisRotation.R90)
//                                );
//            supplier = supplier.with(
//                    new MultipartModelConditionBuilder().put(POLES, i).put(BOTTOM, true).put(PillarBlock.AXIS, Direction.Axis.X),
//                    new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_bottom" + "_" + i)).withRotationY(AxisRotation.R90)
//                                );
//            supplier = supplier.with(
//                    new MultipartModelConditionBuilder().put(POLES, i).put(MIDDLE, true).put(PillarBlock.AXIS, Direction.Axis.X),
//                    new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_middle" + "_" + i)).withRotationY(AxisRotation.R90)
//                                );
//            supplier = supplier.with(
//                    new MultipartModelConditionBuilder().put(POLES, i).put(PillarBlock.AXIS, Direction.Axis.X).put(MIDDLE, false).put(TOP, false).put(BOTTOM, false),
//                    new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_" + i)).withRotationY(AxisRotation.R90)
//                            .withRotationX(AxisRotation.R90)
//            );
//
//
//
//            supplier = supplier.with(
//                    new MultipartModelConditionBuilder().put(POLES, i).put(TOP, true).put(PillarBlock.AXIS, Direction.Axis.Y),
//                    new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_top" + "_" + i))
//            );
//            supplier = supplier.with(
//                    new MultipartModelConditionBuilder().put(POLES, i).put(BOTTOM, true).put(PillarBlock.AXIS, Direction.Axis.Y),
//                    new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_bottom" + "_" + i))
//            );
//            supplier = supplier.with(
//                    new MultipartModelConditionBuilder().put(POLES, i).put(MIDDLE, true).put(PillarBlock.AXIS, Direction.Axis.Y),
//                    new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_middle" + "_" + i))
//            );
//            supplier = supplier.with(
//                    new MultipartModelConditionBuilder().put(POLES, i).put(PillarBlock.AXIS, Direction.Axis.Y).put(MIDDLE, false).put(TOP, false).put(BOTTOM, false),
//                    new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_" + i))
//            );
//
//
//
//            supplier = supplier.with(
//                    new MultipartModelConditionBuilder().put(POLES, i).put(TOP, true).put(PillarBlock.AXIS, Direction.Axis.Z),
//                    new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_top" + "_" + i)).withRotationY(AxisRotation.R270).withRotationX(AxisRotation.R90)
//            );
//            supplier = supplier.with(
//                    new MultipartModelConditionBuilder().put(POLES, i).put(BOTTOM, true).put(PillarBlock.AXIS, Direction.Axis.Z),
//                    new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_bottom" + "_" + i)).withRotationY(AxisRotation.R270).withRotationX(AxisRotation.R90)
//            );
//            supplier = supplier.with(
//                    new MultipartModelConditionBuilder().put(POLES, i).put(MIDDLE, true).put(PillarBlock.AXIS, Direction.Axis.Z),
//                    new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_middle" + "_" + i)).withRotationY(AxisRotation.R270).withRotationX(AxisRotation.R90)
//            );
//            supplier = supplier.with(
//                    new MultipartModelConditionBuilder().put(POLES, i).put(PillarBlock.AXIS, Direction.Axis.Z).put(MIDDLE, false).put(TOP, false).put(BOTTOM, false),
//                    new WeightedVariant(WeightedPool.<ModelVariant>builder().add(new ModelVariant(Identifier.of(TextureMap.getId(block).getNamespace(), TextureMap.getId(block).getPath() + extraLocation + "_" + i)).withRotationY(AxisRotation.R270).withRotationX(AxisRotation.R90)
//            );
//        }
//
//
//        generator.blockStateCollector.accept(supplier);
//    }
//}
