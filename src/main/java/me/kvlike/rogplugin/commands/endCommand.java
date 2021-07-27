package me.kvlike.rogplugin.commands;

import me.kvlike.rogplugin.ROGPLUGIN;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class endCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender.hasPermission("end.end")){
            if(ROGPLUGIN.end){
                ROGPLUGIN.end = false;
                sender.sendMessage(ChatColor.GREEN + "End wylaczony.");
            }
            else{
                ROGPLUGIN.end = true;
                sender.sendMessage(ChatColor.GREEN + "End wlaczony.");
            }
        }
        else{
            sender.sendMessage(ChatColor.RED + "Nie mozesz tego zrobic!");
        }

        return true;
    }
}
