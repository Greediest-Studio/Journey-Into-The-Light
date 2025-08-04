package net.journey.integration.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.journey.init.blocks.JourneyBlocks;
import net.journey.init.items.JourneyItems;
import net.journey.integration.jei.info.JEIIngredientInfo;
import net.journey.integration.jei.summoning.DynamicSummoningRecipeWrapper;
import net.journey.integration.jei.summoning.SummoningRecipeCategory;
import net.journey.integration.jei.summoning.SummoningRecipeWrapper;
import net.journey.recipe.SummoningRecipe;
import net.journey.recipe.SummoningRecipeRegistry;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

@JEIPlugin
public class JeiHooks implements IModPlugin {

    static {
        JEIInteractions.setJEIActive();
    }

    @Override
    public void register(IModRegistry registry) {
        registerHiddenItems(registry);

        registry.addRecipeCatalyst(new ItemStack(JourneyBlocks.summoningTable), "journey.summoningtable");

        registry.addRecipes(compileSummoningRecipes(), "journey.summoningtable");

        JEIIngredientInfo.init(registry);
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registry) {
        registry.addRecipeCategories(new SummoningRecipeCategory(registry.getJeiHelpers().getGuiHelper()));
    }

    private List<DynamicSummoningRecipeWrapper> compileSummoningRecipes() {
        List<DynamicSummoningRecipeWrapper> recipes = new ArrayList<>();

        for (SummoningRecipe recipe : SummoningRecipeRegistry.getRecipes()) {
            recipes.add(new DynamicSummoningRecipeWrapper(recipe));
        }

        return recipes;
    }

    private void registerHiddenItems(IModRegistry registry) {
    }
}
