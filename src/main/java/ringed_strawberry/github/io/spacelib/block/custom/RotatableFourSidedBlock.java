package ringed_strawberry.github.io.spacelib.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Waterloggable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import ringed_strawberry.github.io.spacelib.block.properties.util.BlockPropertyUtil;

import java.util.List;

import static net.minecraft.state.property.Properties.WATERLOGGED;
import static ringed_strawberry.github.io.spacelib.block.properties.SpaceLibBlockProperties.*;

public class RotatableFourSidedBlock extends Block implements Waterloggable {
    public static final DirectionProperty FACING = Properties.FACING;
    public RotatableFourSidedBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(FACING, Direction.NORTH)
                .with(UP, true)
                .with(DOWN, false)
                .with(LEFT, false)
                .with(RIGHT, false)
                .with(WATERLOGGED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED);
        builder.add(UP);
        builder.add(DOWN);
        builder.add(LEFT);
        builder.add(RIGHT);
        builder.add(FACING);
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    protected boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }

    @Override
    protected List<ItemStack> getDroppedStacks(BlockState state, LootContextParameterSet.Builder builder) {
        int stackSize = BlockPropertyUtil.sidesEnabled(state);
        List<ItemStack> stacks = List.of(new ItemStack(this.asItem(), stackSize));
        return stacks;
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if(!world.isClient()) {
            int newTexture = state.get(FOUR_TEXTURE_PROPERTY) + 1;
            player.sendMessage(Text.of(hit.getSide().asString()));
            if (player.getStackInHand(player.getActiveHand()).getItem() == this.getPickStack(world, pos, state).getItem() && newTexture <= 3) {
                world.setBlockState(pos, state.with(FOUR_TEXTURE_PROPERTY, newTexture));
                player.getStackInHand(player.getActiveHand()).decrementUnlessCreative(1, player);
                world.playSound(null, pos, this.soundGroup.getPlaceSound(), SoundCategory.BLOCKS);
                return ActionResult.success(true);
            }
        }
        return super.onUse(state, world, pos, player, hit);
    }
}
