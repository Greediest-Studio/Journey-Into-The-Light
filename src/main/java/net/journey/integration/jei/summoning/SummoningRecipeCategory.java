package net.journey.integration.jei.summoning;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.ingredients.VanillaTypes;
import mezz.jei.api.recipe.IRecipeCategory;
import net.journey.init.blocks.JourneyBlocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.slayer.api.SlayerAPI;

import java.util.List;

public class SummoningRecipeCategory implements IRecipeCategory<DynamicSummoningRecipeWrapper> {

    private static ResourceLocation textureResource;
    private final IDrawable background;
    private final IDrawable icon;

    public SummoningRecipeCategory(IGuiHelper guiHelper) {
        textureResource = new ResourceLocation(SlayerAPI.PREFIX + "textures/gui/summoning_jei.png");
        background = guiHelper.createDrawable(textureResource, 0, 3, 176, 80);
        icon = guiHelper.createDrawableIngredient(new ItemStack(JourneyBlocks.summoningTable));
    }

    @Override
    public String getUid() {
        return "journey.summoningtable";
    }

    @Override
    public String getTitle() {
        return JourneyBlocks.summoningTable.getLocalizedName();
    }

    @Override
    public String getModName() {
        // TODO Auto-generated method stub
        return "Journey Into the Light";
    }

    @Override
    public IDrawable getBackground() {
        // TODO Auto-generated method stub
        return background;
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, DynamicSummoningRecipeWrapper recipeWrapper, IIngredients ingredients) {

        IGuiItemStackGroup guiStacks = recipeLayout.getItemStacks();
        guiStacks.init(0, true, 20, 13); // 左上
        guiStacks.init(1, true, 20, 31); // 左中
        guiStacks.init(2, true, 20, 49); // 左下

        guiStacks.init(3, true, 56, 31); // 中心

        guiStacks.init(4, true, 93, 13); // 右上
        guiStacks.init(5, true, 93, 31); // 右中
        guiStacks.init(6, true, 93, 49); // 右下

        guiStacks.init(7, false, 138, 31); // 输出

        List<List<ItemStack>> inputs = ingredients.getInputs(VanillaTypes.ITEM);
        for (int i = 0; i < 7; i++) {
            guiStacks.set(i, inputs.get(i));
        }
        guiStacks.set(7, ingredients.getOutputs(VanillaTypes.ITEM).get(0));
    }
}
