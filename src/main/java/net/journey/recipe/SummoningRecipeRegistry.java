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

    public static void removeRecipeByOutput(ItemStack output) {
        if (output.isEmpty()) return;
        RECIPES.removeIf(recipe -> ItemStack.areItemsEqual(recipe.getOutput(), output));
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

        RECIPES.add(new SummoningRecipe(
                JourneyItems.natureTablet,
                JourneyItems.enchantedLeaf,
                JourneyItems.natureTablet,
                JourneyItems.overgrownNatureBall,
                JourneyItems.natureTablet,
                JourneyItems.enchantedLeaf,
                JourneyItems.natureTablet,
                new ItemStack(JourneyItems.loggerOrb)
        ));

        RECIPES.add(new SummoningRecipe(
                JourneyItems.overseeingEye,
                JourneyItems.collectorRock,
                JourneyItems.overseeingEye,
                JourneyItems.overseeingTablet,
                JourneyItems.overseeingEye,
                JourneyItems.collectorRock,
                JourneyItems.overseeingEye,
                new ItemStack(JourneyItems.sentryKingOrb)
        ));

        RECIPES.add(new SummoningRecipe(
                JourneyItems.scale,
                JourneyItems.beastlyStomach,
                JourneyItems.scale,
                JourneyItems.darkOrb,
                JourneyItems.scale,
                JourneyItems.beastlyStomach,
                JourneyItems.scale,
                new ItemStack(JourneyItems.scaleOrb)
        ));

        RECIPES.add(new SummoningRecipe(
                JourneyItems.rocFeather,
                JourneyItems.darkCrystal,
                JourneyItems.rocFeather,
                JourneyItems.darkOrb,
                JourneyItems.rocFeather,
                JourneyItems.darkCrystal,
                JourneyItems.rocFeather,
                new ItemStack(JourneyItems.thunderbirdOrb)
        ));

        RECIPES.add(new SummoningRecipe(
                JourneyItems.gateKeys,
                JourneyItems.silverClump,
                JourneyItems.gateKeys,
                JourneyItems.metalDisk,
                JourneyItems.gateKeys,
                JourneyItems.silverClump,
                JourneyItems.gateKeys,
                new ItemStack(JourneyItems.corallatorOrb)
        ));

        RECIPES.add(new SummoningRecipe(
                JourneyItems.gateKeys,
                JourneyItems.goldClump,
                JourneyItems.gateKeys,
                JourneyItems.royalDisk,
                JourneyItems.gateKeys,
                JourneyItems.goldClump,
                JourneyItems.gateKeys,
                new ItemStack(JourneyItems.eudorOrb)
        ));

        RECIPES.add(new SummoningRecipe(
                JourneyItems.hellstoneIngot,
                JourneyItems.hellShards,
                JourneyItems.hellstoneIngot,
                JourneyItems.hellcrustIngot,
                JourneyItems.hellstoneIngot,
                JourneyItems.hellShards,
                JourneyItems.hellstoneIngot,
                new ItemStack(JourneyItems.netherBeastOrb)
        ));

        RECIPES.add(new SummoningRecipe(
                JourneyItems.withicSpine,
                JourneyItems.lostSoul,
                JourneyItems.withicSpine,
                JourneyItems.withicSoul,
                JourneyItems.withicSpine,
                JourneyItems.lostSoul,
                JourneyItems.withicSpine,
                new ItemStack(JourneyItems.witheringBeastOrb)
        ));

        RECIPES.add(new SummoningRecipe(
                JourneyItems.earthenCrystal,
                JourneyItems.purplePowder,
                JourneyItems.earthenCrystal,
                JourneyItems.terrastar,
                JourneyItems.earthenCrystal,
                JourneyItems.purplePowder,
                JourneyItems.earthenCrystal,
                new ItemStack(JourneyItems.enchantedTerrastar)
        ));

        RECIPES.add(new SummoningRecipe(
                JourneyItems.spawnerBar,
                JourneyItems.ash,
                JourneyItems.spawnerBar,
                JourneyItems.hellShards,
                JourneyItems.spawnerBar,
                JourneyItems.ash,
                JourneyItems.spawnerBar,
                new ItemStack(JourneyItems.calciaOrb)
        ));
    }
}

