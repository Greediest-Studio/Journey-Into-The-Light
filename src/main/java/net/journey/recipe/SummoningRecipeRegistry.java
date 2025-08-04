package net.journey.recipe;

import net.journey.init.items.JourneyItems;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class SummoningRecipeRegistry {
    private static final List<SummoningRecipe> RECIPES = new ArrayList<>();

    static {
        registerVanillaRecipes();
    }
    //配方注册用
    public static void registerRecipe(SummoningRecipe recipe) {
        RECIPES.add(recipe);
    }

    public static List<SummoningRecipe> getRecipes() {
        return new ArrayList<>(RECIPES);
    }

    private static void registerVanillaRecipes() {

        RECIPES.add(new SummoningRecipe(
                JourneyItems.boilPowder,
                JourneyItems.boilPowder,
                JourneyItems.boilPowder,
                JourneyItems.blazingFireball,
                JourneyItems.boilPowder,
                JourneyItems.boilPowder,
                JourneyItems.boilPowder,
                new ItemStack(JourneyItems.blazierOrb)
        ));

        RECIPES.add(new SummoningRecipe(
                JourneyItems.snakeSkin,
                JourneyItems.concentratedBlood,
                JourneyItems.snakeSkin,
                JourneyItems.sizzlingEye,
                JourneyItems.snakeSkin,
                JourneyItems.concentratedBlood,
                JourneyItems.snakeSkin,
                new ItemStack(JourneyItems.soulWatcherOrb)
        ));
        //没注册完
    }
}

