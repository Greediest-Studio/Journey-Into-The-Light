package net.journey.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class SummoningRecipe {
    private final Item[] inputs;
    private final ItemStack output;

    public SummoningRecipe(Item topLeft, Item midLeft, Item botLeft,
                           Item center,
                           Item topRight, Item midRight, Item botRight,
                           ItemStack output) {
        this.inputs = new Item[]{
                topLeft, midLeft, botLeft,
                center,
                topRight, midRight, botRight
        };
        this.output = output;
    }

    public boolean matches(NonNullList<ItemStack> inventory) {
        for (int i = 0; i < 7; i++) {
            ItemStack slotStack = inventory.get(i);
            // 检测槽位是否为空或物品不匹配
            if (slotStack.isEmpty() || slotStack.getItem() != inputs[i]) {
                return false;
            }
        }
        return true;
    }

    public ItemStack getOutput() {
        return output.copy();
    }
}

