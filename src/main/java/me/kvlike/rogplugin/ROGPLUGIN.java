package me.kvlike.rogplugin;

import me.kvlike.rogplugin.commands.endCommand;
import me.kvlike.rogplugin.listeners.PlayerJoinListener;
import me.kvlike.rogplugin.listeners.PlayerQuitListener;
import me.kvlike.rogplugin.listeners.TeleportListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ROGPLUGIN extends JavaPlugin {

    public static boolean end;

    @Override
    public void onEnable() {
        end = true;

        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerQuitListener(), this);
        getServer().getPluginManager().registerEvents(new TeleportListener(), this);

        getCommand("end").setExecutor(new endCommand());
    }
}
