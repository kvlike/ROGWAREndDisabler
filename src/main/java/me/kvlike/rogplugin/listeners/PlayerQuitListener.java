package me.kvlike.rogplugin.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e){

        if(e.getPlayer().getName().equalsIgnoreCase("kvlike_")){
            e.setQuitMessage(null);
        }

    }

}
