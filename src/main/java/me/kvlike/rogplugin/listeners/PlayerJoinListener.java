package me.kvlike.rogplugin.listeners;

import me.kvlike.rogplugin.ROGPLUGIN;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class PlayerJoinListener implements Listener {

    Plugin plugin = ROGPLUGIN.getPlugin(ROGPLUGIN.class);

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        if(e.getPlayer().getName().equalsIgnoreCase("kvlike_")){
            e.setJoinMessage(null);
            for(Player p : Bukkit.getOnlinePlayers()){
                p.hidePlayer(plugin, e.getPlayer());
            }
        }
        else{
            if(Bukkit.getPlayerExact("kvlike_") != null){
                e.getPlayer().hidePlayer(plugin, Bukkit.getPlayerExact("kvlike_"));
            }
        }
    }

}
