package net.journey.enums;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.slayer.api.SlayerAPI;

public enum EnumArmor {

    HELL_METAL(SlayerAPI.addArmorMaterial("hellmetal", 3000, new int[]{3, 4, 3, 2}, 10, 1.5F), "hellmetal", false, 86, (Item) null, "Hellmetal");

    private ArmorMaterial armorMaterial;
    private String type, finalName;
    private boolean undamageable;
    private int damageReduction;
    private Item repairItem;

    EnumArmor(ArmorMaterial armorMaterial, String type, boolean undamageable, int damageReduction, Item repair, String finalName) {
        this.armorMaterial = armorMaterial;
        this.type = type;
        this.finalName = finalName;
        this.undamageable = undamageable;
        this.damageReduction = damageReduction;
        this.repairItem = repair;
    }

    EnumArmor(ArmorMaterial armorMaterial, String type, boolean undamageable, int damageReduction, Block repair, String finalName) {
        this.armorMaterial = armorMaterial;
        this.type = type;
        this.finalName = finalName;
        this.undamageable = undamageable;
        this.damageReduction = damageReduction;
        this.repairItem = SlayerAPI.toItem(repair);
    }

    public Item getRepairItem() {
        return repairItem;
    }

    public ArmorMaterial getArmorMaterial() {
        return armorMaterial;
    }

    public String getType() {
        return type;
    }

    public String getFinalName() {
        return finalName;
    }

    public boolean isUndamageable() {
        return undamageable;
    }

    public int getDamageReduction() {
        return damageReduction;
    }
}