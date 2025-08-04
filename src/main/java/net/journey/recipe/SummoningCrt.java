package net.journey.recipe;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IIngredient;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

import java.util.List;

@ZenRegister
@ZenClass("mods.journey.SummoningTable")
public class SummoningCrt {

    @ZenMethod
    public static void addRecipe(
            IIngredient topLeft, IIngredient midLeft, IIngredient botLeft,
            IIngredient center,
            IIngredient topRight, IIngredient midRight, IIngredient botRight,
            IItemStack output
    ) {
        ItemStack outputStack = CraftTweakerMC.getItemStack(output);

        SummoningRecipe recipe = new SummoningRecipe(
                asItem(topLeft), asItem(midLeft), asItem(botLeft),
                asItem(center),
                asItem(topRight), asItem(midRight), asItem(botRight),
                outputStack
        );

        SummoningRecipeRegistry.registerRecipe(recipe);
    }

    @ZenMethod
    public static void removeRecipe(IItemStack output) {
        if (output == null || output.isEmpty()) {
            throw new IllegalArgumentException("输出物品不能为空");
        }
        ItemStack outputStack = CraftTweakerMC.getItemStack(output);
        SummoningRecipeRegistry.removeRecipeByOutput(outputStack);
    }

    private static Item asItem(IIngredient ingredient) {
        List<IItemStack> items = ingredient.getItems();

        if (items.isEmpty()) {
            throw new IllegalArgumentException("输入不能为空");
        }

        return CraftTweakerMC.getItemStack(items.get(0)).getItem();
    }
}
