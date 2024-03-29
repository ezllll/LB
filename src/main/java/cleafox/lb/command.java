package cleafox.lb;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class command implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player player) {
            commandSender.sendMessage("§b狐狐：§e我靠 你。。。什么都得试试才爽是吧？");
            commandSender.sendMessage("§b狐狐：§e那你死吧！");
            ((Player) commandSender).setHealth(0);
            return true;
        }
        return false;
    }
}
