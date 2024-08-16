package com.bendory.stat.stats;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.List;

public class SelectionScreen implements InventoryHolder {

    private Inventory inv;

    public SelectionScreen() {
        inv = Bukkit.createInventory(this, 9, "Stats");
        init();
    }

    private void init() {
        ItemStack item;

        //left
        item = createItem("§c§lStr", Material.IRON_SWORD, Collections.singletonList("§cStrong"));
        inv.setItem(0, item);

        //center
        item = createItem("§b§lDex", Material.FEATHER, Collections.singletonList("§bFast"));
        inv.setItem(4, item);

        //right
        item = createItem("§a§lCon", Material.OAK_SAPLING, Collections.singletonList("§cHealthy"));
        inv.setItem(8, item);

    }

    private ItemStack createItem(String name, Material mat, List<String> lore) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    @Override
    public Inventory getInventory() {
        return inv;
    }
}
