package ringed_strawberry.github.io.spacelib.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Waterloggable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootWorldContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;

import java.util.List;

import static net.minecraft.state.property.Properties.WATERLOGGED;
import static ringed_strawberry.github.io.spacelib.block.properties.SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY;

public class RotatableFourTextureBlock extends Block implements Waterloggable {
    public static final EnumProperty<Direction> FACING = Properties.FACING;
    public RotatableFourTextureBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(FACING, Direction.NORTH)
                .with(FOUR_TEXTURE_PROPERTY, 0)
                .with(WATERLOGGED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED);
        builder.add(FOUR_TEXTURE_PROPERTY);
        builder.add(FACING);
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        if (state.get(WATERLOGGED)) {
            tickView.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    protected boolean isTransparent(BlockState state) {
        return state.getFluidState().isEmpty();
    }

    @Override
    protected List<ItemStack> getDroppedStacks(BlockState state, LootWorldContext.Builder builder) {
        int stackSize = state.get(FOUR_TEXTURE_PROPERTY)+1;
        List<ItemStack> stacks = List.of(new ItemStack(this.asItem(), stackSize));
        return stacks;
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if(!world.isClient()) {
            int newTexture = state.get(FOUR_TEXTURE_PROPERTY) + 1;
            if (player.getStackInHand(player.getActiveHand()).getItem() == this.getPickStack(world, pos, state, false).getItem() && newTexture <= 3) {
                world.setBlockState(pos, state.with(FOUR_TEXTURE_PROPERTY, newTexture));
                player.getStackInHand(player.getActiveHand()).decrementUnlessCreative(1, player);
                world.playSound(null, pos, this.soundGroup.getPlaceSound(), SoundCategory.BLOCKS);
                return ActionResult.SUCCESS;
            }
        }
        return super.onUse(state, world, pos, player, hit);
    }
}
