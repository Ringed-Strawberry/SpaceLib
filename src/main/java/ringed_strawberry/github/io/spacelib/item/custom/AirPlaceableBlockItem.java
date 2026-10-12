package ringed_strawberry.github.io.spacelib.item.custom;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class AirPlaceableBlockItem extends BlockItem {
    public AirPlaceableBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient()) {
            Vec3d facing = user.getRotationVec(1.0F).multiply(user.getBlockInteractionRange());
            BlockPos placementPos = BlockPos.ofFloored(user.getEyePos().add(facing));

            if (world.getBlockState(placementPos).isAir()) {
                this.place(new ItemPlacementContext(user, hand, user.getStackInHand(hand),
                        new BlockHitResult(placementPos.toCenterPos(), user.getFacing(), placementPos, false)));
                return ActionResult.SUCCESS_SERVER;
            }
        }
        return ActionResult.SUCCESS;
    }
}
