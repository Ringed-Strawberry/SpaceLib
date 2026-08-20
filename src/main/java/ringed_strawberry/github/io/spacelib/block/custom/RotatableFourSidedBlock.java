package ringed_strawberry.github.io.spacelib.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Waterloggable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.context.LootWorldContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import ringed_strawberry.github.io.spacelib.block.properties.util.BlockPropertyUtil;

import java.util.List;

import static net.minecraft.state.property.Properties.WATERLOGGED;
import static ringed_strawberry.github.io.spacelib.block.properties.SpaceLibBlockProperties.*;

public class RotatableFourSidedBlock extends Block implements Waterloggable {
    public static final EnumProperty<Direction> FACING = Properties.FACING;
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
    protected FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    protected List<ItemStack> getDroppedStacks(BlockState state, LootWorldContext.Builder builder) {
        int stackSize = BlockPropertyUtil.sidesEnabled(state);
        List<ItemStack> stacks = List.of(new ItemStack(this.asItem(), stackSize));
        return stacks;
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if(!world.isClient()) {
            if (player.getStackInHand(player.getActiveHand()).getItem() == this.getPickStack(world, pos, state, false).getItem() && !BlockPropertyUtil.isSideToggled(state,hit)) {
                world.setBlockState(pos, BlockPropertyUtil.toggleSide(state, hit));
                player.getStackInHand(player.getActiveHand()).decrementUnlessCreative(1, player);
                world.playSound(null, pos, this.soundGroup.getPlaceSound(), SoundCategory.BLOCKS);
                return ActionResult.SUCCESS;
            }
            if (player.getStackInHand(player.getActiveHand()).getItem() == Items.AIR && BlockPropertyUtil.isSideToggled(state,hit)) {
                world.setBlockState(pos, BlockPropertyUtil.toggleSide(state, hit));
                if(!player.isCreative())
                    dropStack(world, pos, this.getPickStack(world, pos, state, false));
                world.playSound(null, pos, this.soundGroup.getBreakSound(), SoundCategory.BLOCKS);
                return ActionResult.SUCCESS;
            }
        }
        return super.onUse(state, world, pos, player, hit);
    }
}
