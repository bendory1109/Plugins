package com.bendory.stat.events;

import com.bendory.stat.stats.SelectionScreen;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryEvents implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getClickedInventory() == null) {
            return;
        }
        if (e.getClickedInventory().getHolder() instanceof SelectionScreen) {
            e.setCancelled(true);
            Player p = (Player) e.getWhoClicked();
            if (e.getCurrentItem().getType() == Material.IRON_SWORD) {
                p.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(p.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).getValue() + 0.5);
            }
            if (e.getCurrentItem().getType() == Material.OAK_SAPLING) {
                p.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(p.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() + 10);
            }
            if (e.getCurrentItem().getType() == Material.FEATHER) {
                p.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(p.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue() + 0.1);
            }
        }
    }
}
