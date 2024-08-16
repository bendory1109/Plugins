package com.www.minecraft3.events;

import com.www.minecraft3.itemManager.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ItemEvents implements Listener {

    @EventHandler
    public static void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(ItemManager.Resrea.getItemMeta())) {
                    Player player = event.getPlayer();
                    player.setNoDamageTicks(100);
                    player.getWorld().createExplosion(player.getEyeLocation(), 20f);
                    player.getWorld().playEffect(player.getLocation(), Effect.WITHER_BREAK_BLOCK, 100);
                    player.sendMessage(ChatColor.DARK_GREEN + "booooooooooooom!!!!!!!!");
                }

            }
        }
    }
}
