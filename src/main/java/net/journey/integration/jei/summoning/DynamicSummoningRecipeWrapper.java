package net.journey.integration.jei.summoning;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.ingredients.VanillaTypes;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.journey.recipe.SummoningRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;

import java.util.Arrays;
import java.util.List;

public class DynamicSummoningRecipeWrapper implements IRecipeWrapper {

    private final List<ItemStack> inputs;
    private final ItemStack output;

    public DynamicSummoningRecipeWrapper(SummoningRecipe recipe) {
        this.inputs = Arrays.asList(
                new ItemStack(recipe.getInput(0)),
                new ItemStack(recipe.getInput(1)),
                new ItemStack(recipe.getInput(2)),
                new ItemStack(recipe.getInput(3)), // 中心物品
                new ItemStack(recipe.getInput(4)),
                new ItemStack(recipe.getInput(5)),
                new ItemStack(recipe.getInput(6))
        );
        this.output = recipe.getOutput();
    }

    @Override
    public void getIngredients(IIngredients ingredients) {
        ingredients.setInputs(VanillaTypes.ITEM, inputs);
        ingredients.setOutput(VanillaTypes.ITEM, output);
    }

    @Override
    public void drawInfo(Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY) {
    }

    @Override
    public List<String> getTooltipStrings(int mouseX, int mouseY) {
        return null;
    }

    @Override
    public boolean handleClick(Minecraft minecraft, int mouseX, int mouseY, int mouseButton) {
        return false;
    }
}

