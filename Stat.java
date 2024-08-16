package com.bendory.stat;

import com.bendory.stat.commands.StatCommands;
import com.bendory.stat.events.InventoryEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Stat extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("stat").setExecutor(new StatCommands());
        getCommand("stat-clear").setExecutor(new StatCommands());
        getServer().getPluginManager().registerEvents(new InventoryEvents(), this);
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Stat]: Plugin is disabled");
    }
}
