package ringed_strawberry.github.io.spacelib.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Waterloggable;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;
import ringed_strawberry.github.io.spacelib.block.BlockGen;
import ringed_strawberry.github.io.spacelib.block.util.BlockHitUtil;

import java.util.List;

import static net.minecraft.state.property.Properties.WATERLOGGED;
import static ringed_strawberry.github.io.spacelib.block.properties.SpaceLibBlockProperties.FOUR_TEXTURE_PROPERTY;

public class RotatableFourTextureBlock extends Block implements Waterloggable {
    public static final DirectionProperty FACING = Properties.FACING;
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
        int stackSize = state.get(FOUR_TEXTURE_PROPERTY)+1;
        List<ItemStack> stacks = List.of(new ItemStack(this.asItem(), stackSize));
        return stacks;
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if(!world.isClient()) {
            int newTexture = state.get(FOUR_TEXTURE_PROPERTY) + 1;
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
