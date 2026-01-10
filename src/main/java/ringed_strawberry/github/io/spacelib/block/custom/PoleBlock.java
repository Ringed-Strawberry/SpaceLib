package ringed_strawberry.github.io.spacelib.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

import static ringed_strawberry.github.io.spacelib.block.properties.util.BlockPropertyUtil.getPoleState;

public class PoleBlock extends PillarBlock {
    public static final IntProperty POLES = IntProperty.of("poles", 0, 3);
    public static final BooleanProperty TOP = BooleanProperty.of("top");
    public static final BooleanProperty BOTTOM = BooleanProperty.of("bottom");
    public static final BooleanProperty MIDDLE = BooleanProperty.of("middle");
    public PoleBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y)
                .with(POLES, 0)
                .with(TOP, false)
                .with(BOTTOM, false)
                .with(MIDDLE, false)
                .with(AXIS, Direction.Axis.Y));
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return super.getOutlineShape(state, world, pos, context);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(POLES);
        builder.add(TOP);
        builder.add(BOTTOM);
        builder.add(MIDDLE);
        builder.add(new Property[]{AXIS});
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return getPoleState(world, pos, this.asBlock());
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return getPoleState(ctx.getWorld(), ctx.getBlockPos(), this.asBlock(), ctx.getSide());
    }
}
