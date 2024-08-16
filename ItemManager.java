package com.www.minecraft3.itemManager;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack Resrea;

    public static void init() {
        createResrea();
    }

    private static void createResrea() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("고대의 지팡이");
        List<String> lore =new ArrayList<>();
        lore.add("§7이 지팡이를 들면 주위가 폭발합니다");
        lore.add("§7쓸때 주의해주세요!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        Resrea = item;
    }
}
