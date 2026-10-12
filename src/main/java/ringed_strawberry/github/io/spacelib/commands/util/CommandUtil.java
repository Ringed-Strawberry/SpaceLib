package ringed_strawberry.github.io.spacelib.commands.util;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

import java.util.function.Predicate;

public class CommandUtil {
    public static final Predicate<ServerCommandSource> OP_ONLY =
            CommandManager.requirePermissionLevel(CommandManager.GAMEMASTERS_CHECK);

    public static LiteralArgumentBuilder<ServerCommandSource> opCommand(String name){
        return CommandManager.literal(name)
                .requires(OP_ONLY);
    }

    private static SuggestionProvider<ServerCommandSource> CLASS_SUGGESTIONS(String... suggestions) {
        return (context, builder) -> {
            for (String suggestion : suggestions) {
                builder.suggest(suggestion);
            }
            return builder.buildFuture();
        };
    }

    private static SuggestionProvider<ServerCommandSource> CLASS_SUGGESTIONS(Integer... suggestions) {
        return (context, builder) -> {
            for (int suggestion : suggestions) {
                builder.suggest(suggestion);
            }
            return builder.buildFuture();
        };
    }

    private static void sendOutput(CommandContext<ServerCommandSource> context, String message) {
        context.getSource().sendFeedback(() -> Text.literal(message), false);
    }

    private static void sendOutputWithBroadcast(CommandContext<ServerCommandSource> context, String message) {
        context.getSource().sendFeedback(() -> Text.literal(message), true);
    }

}
