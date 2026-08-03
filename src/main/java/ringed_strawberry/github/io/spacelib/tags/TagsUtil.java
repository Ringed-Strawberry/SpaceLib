package ringed_strawberry.github.io.spacelib.tags;

import net.minecraft.block.BlockState;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.level.block.Block;

public class TagsUtil {
    public static boolean isInTag(BlockState state, TagKey<Block> tag){
        return state.isIn(TagKey.of(tag.registryRef(), tag.id()));
    }
}
