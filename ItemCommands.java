package com.www.minecraft3.commands;

import com.www.minecraft3.itemManager.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ItemCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("giveResrea")) {
                p.getInventory().addItem(ItemManager.Resrea);
            }
            return true;
        } else {
            sender.sendMessage("플레이어만 사용 가능");
            return false;
        }
    }
}
