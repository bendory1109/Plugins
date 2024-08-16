package com.www.minecraft3;

import com.www.minecraft3.commands.ItemCommands;
import com.www.minecraft3.events.ItemEvents;
import com.www.minecraft3.itemManager.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Minecraft3 extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "플러그인 작동");
        ItemManager.init();
        getCommand("giveResrea").setExecutor(new ItemCommands());
        getServer().getPluginManager().registerEvents(new ItemEvents(), this);
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "플러그인 작동 중지");
    }

}
