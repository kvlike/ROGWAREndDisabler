package me.kvlike.rogplugin.listeners;

import me.kvlike.rogplugin.ROGPLUGIN;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

public class TeleportListener implements Listener {

    @EventHandler
    public void onTeleport(PlayerTeleportEvent e){

        if(e.getCause().equals(PlayerTeleportEvent.TeleportCause.END_PORTAL) && !ROGPLUGIN.end){
            e.setCancelled(true);
        }

    }

}
