package com.bendory.stat.commands;


import com.bendory.stat.stats.SelectionScreen;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StatCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] str) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("stat")) {
                SelectionScreen gui = new SelectionScreen();
                p.openInventory(gui.getInventory());
            } else if (cmd.getName().equalsIgnoreCase("stat-clear")) {
                p.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(1.0);
                p.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(20.0);
                p.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.10000000149011612);
            }
            return true;
        } else {
            sender.sendMessage("플레이어만 사용 가능");
            return false;
        }
    }
}

