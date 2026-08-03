package ringed_strawberry.github.io.spacelib.tags;


import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class TagsUtil {
    public static boolean isInTag(BlockState state, TagKey<Block> tag){
        return state.is(TagKey.create(tag.registry(), tag.location()));
    }
}
