package ringed_strawberry.github.io.spacelib.block.custom;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class AirPlaceableBlock extends Block {
    public AirPlaceableBlock(Settings settings) {
        super(settings.breakInstantly());
    }

    @Override
    public Item asItem() {
        return super.asItem();
    }
}
