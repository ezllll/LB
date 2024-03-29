package cleafox.lb;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class LB extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("[LB] §b喵喵喵~");
        Bukkit.getPluginCommand("LB").setExecutor(new command());
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("[LB] §b喵呜呜~");
    }
}
