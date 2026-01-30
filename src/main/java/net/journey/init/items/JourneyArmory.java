package net.journey.init.items;

import net.journey.init.JourneyTabs;
import net.journey.init.Registrar;
import net.journey.items.tool.ItemBonemealHoe;
import net.journey.items.tool.ItemMultiTool;
import net.journey.util.JourneyToolMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.slayer.api.item.ItemModAxe;
import net.slayer.api.item.ItemModHoe;
import net.slayer.api.item.ItemModPickaxe;
import net.slayer.api.item.ItemModShovel;

public class JourneyArmory {

    public static Item hellstoneMultiTool;
    public static Item shadiumMultiTool;
    public static Item celestiumMultiTool;
    public static Item luniumMultiTool;
    public static Item flairiumMultiTool;
    public static Item sapphireMultiTool;
    public static Item gorbiteMultiTool;
    public static Item orbaditeMultiTool;
    public static Item desMultiTool;
    public static Item koriteMultiTool;
    public static Item storonMultiTool;
    public static Item mekyumMultiTool;
    public static Item woodMultiTool;
    public static Item stoneMultiTool;
    public static Item ironMultiTool;
    public static Item goldMultiTool;
    public static Item diamondMultiTool;

    public static Item hellstonePickaxe;
    public static Item shadiumPickaxe;
    public static Item celestiumPickaxe;
    public static Item luniumPickaxe;
    public static Item flairiumPickaxe;
    public static Item sapphirePickaxe;
    public static Item gorbitePickaxe;
    public static Item orbaditePickaxe;
    public static Item desPickaxe;
    public static Item nethicPickaxe;
    public static Item koritePickaxe;
    public static Item storonPickaxe;
    public static Item mekyumPickaxe;

    public static Item hellstoneShovel;
    public static Item shadiumShovel;
    public static Item celestiumShovel;
    public static Item luniumShovel;
    public static Item flairiumShovel;
    public static Item sapphireShovel;
    public static Item gorbiteShovel;
    public static Item orbaditeShovel;
    public static Item desShovel;
    public static Item nethicShovel;
    public static Item koriteShovel;
    public static Item storonShovel;
    public static Item mekyumShovel;

    public static Item bedrockShovel;

    public static Item hellstoneAxe;
    public static Item shadiumAxe;
    public static Item celestiumAxe;
    public static Item luniumAxe;
    public static Item flairiumAxe;
    public static Item sapphireAxe;
    public static Item gorbiteAxe;
    public static Item orbaditeAxe;
    public static Item desAxe;
    public static Item nethicAxe;
    public static Item koriteAxe;
    public static Item storonAxe;
    public static Item mekyumAxe;

    public static Item hellstoneHoe;
    public static Item shadiumHoe;
    public static Item celestiumHoe;
    public static Item luniumHoe;
    public static Item flairiumHoe;
    public static Item sapphireHoe;
    public static Item gorbiteHoe;
    public static Item orbaditeHoe;
    public static Item desHoe;
    public static Item koriteHoe;
    public static Item storonHoe;
    public static Item mekyumHoe;

    public static Item hoeOfEternalLife;
    public static Item hoeOfEarthLoving;
    public static Item multiToolOfEternalSmelting;
    public static Item slimyPickaxe;
    public static Item pickaxeOfGoodFortune;

    public static void init() {
        hellstoneMultiTool = Registrar.regAndSetupItem("hellstoneMultiTool", "Bloodcrust Multi Tool", new ItemMultiTool(JourneyToolMaterial.HELLSTONE_MULTI_TOOL, 1750), JourneyTabs.TOOLS);
        shadiumMultiTool = Registrar.regAndSetupItem("shadiumMultiTool", "Shadium Multi Tool", new ItemMultiTool(JourneyToolMaterial.SHADIUM_MULTI_TOOL, 1670), JourneyTabs.TOOLS);
        celestiumMultiTool = Registrar.regAndSetupItem("celestiumMultiTool", "Celestium Multi Tool", new ItemMultiTool(JourneyToolMaterial.CELESTIUM_MULTI_TOOL, 1820), JourneyTabs.TOOLS);
        luniumMultiTool = Registrar.regAndSetupItem("luniumMultiTool", "Lunium Multi Tool", new ItemMultiTool(JourneyToolMaterial.LUNIUM_MULTI_TOOL, 1670), JourneyTabs.TOOLS);
        flairiumMultiTool = Registrar.regAndSetupItem("flairiumMultiTool", "Flairium Multi Tool", new ItemMultiTool(JourneyToolMaterial.FLAIRIUM_MULTI_TOOL, 1202), JourneyTabs.TOOLS);
        sapphireMultiTool = Registrar.regAndSetupItem("sapphireMultiTool", "Sapphire Multi Tool", new ItemMultiTool(JourneyToolMaterial.SAPPHIRE_MULTI_TOOL, 2456), JourneyTabs.TOOLS);
        gorbiteMultiTool = Registrar.regAndSetupItem("gorbiteMultiTool", "Gorbite Multi Tool", new ItemMultiTool(JourneyToolMaterial.GORBITE_MULTI_TOOL, 2115), JourneyTabs.TOOLS);
        orbaditeMultiTool = Registrar.regAndSetupItem("orbaditeMultiTool", "Orbadite Multi Tool", new ItemMultiTool(JourneyToolMaterial.ORBADITE_MULTI_TOOL, 2115), JourneyTabs.TOOLS);
        desMultiTool = Registrar.regAndSetupItem("desMultiTool", "Des Multi Tool", new ItemMultiTool(JourneyToolMaterial.DES_MULTI_TOOL, 2102), JourneyTabs.TOOLS);
        koriteMultiTool = Registrar.regAndSetupItem("koriteMultiTool", "Korite Multi Tool", new ItemMultiTool(JourneyToolMaterial.KORITE_MULTI_TOOL, 1820), JourneyTabs.TOOLS);
        storonMultiTool = Registrar.regAndSetupItem("storonMultiTool", "Storon Multi Tool", new ItemMultiTool(JourneyToolMaterial.KORITE_MULTI_TOOL, 1820), JourneyTabs.TOOLS);
        mekyumMultiTool = Registrar.regAndSetupItem("mekyumMultiTool", "Mekyum Multi Tool", new ItemMultiTool(JourneyToolMaterial.KORITE_MULTI_TOOL, 1820), JourneyTabs.TOOLS);
        woodMultiTool = Registrar.regAndSetupItem("woodMultiTool", "Wooden Multi Tool", new ItemMultiTool(JourneyToolMaterial.WOOD_MULTI_TOOL, 60), JourneyTabs.TOOLS);
        stoneMultiTool = Registrar.regAndSetupItem("stoneMultiTool", "Stone Multi Tool", new ItemMultiTool(JourneyToolMaterial.STONE_MULTI_TOOL, 132), JourneyTabs.TOOLS);
        ironMultiTool = Registrar.regAndSetupItem("ironMultiTool", "Iron Multi Tool", new ItemMultiTool(JourneyToolMaterial.IRON_MULTI_TOOL, 251), JourneyTabs.TOOLS);
        goldMultiTool = Registrar.regAndSetupItem("goldMultiTool", "Gold Multi Tool", new ItemMultiTool(JourneyToolMaterial.GOLD_MULTI_TOOL, 33), JourneyTabs.TOOLS);
        diamondMultiTool = Registrar.regAndSetupItem("diamondMultiTool", "Diamond Multi Tool", new ItemMultiTool(JourneyToolMaterial.DIAMOND_MULTI_TOOL, 1562), JourneyTabs.TOOLS);
        multiToolOfEternalSmelting = Registrar.regAndSetupItem("multiToolOfEternalSmelting", "Multi Tool of Eternal Smelting", new ItemMultiTool(JourneyToolMaterial.SMELTING_TOOL, 512), JourneyTabs.TOOLS);

        sapphirePickaxe = Registrar.regAndSetupItem("sapphirePickaxe", "Sapphire Pickaxe", new ItemModPickaxe(JourneyToolMaterial.SAPPHIRE), JourneyTabs.TOOLS);
        shadiumPickaxe = Registrar.regAndSetupItem("shadiumPickaxe", "Shadium Pickaxe", new ItemModPickaxe(JourneyToolMaterial.SHADIUM), JourneyTabs.TOOLS);
        luniumPickaxe = Registrar.regAndSetupItem("luniumPickaxe", "Lunium Pickaxe", new ItemModPickaxe(JourneyToolMaterial.LUNIUM), JourneyTabs.TOOLS);
        hellstonePickaxe = Registrar.regAndSetupItem("hellstonePickaxe", "Bloodcrust Pickaxe", new ItemModPickaxe(JourneyToolMaterial.HELLSTONE), JourneyTabs.TOOLS);
        nethicPickaxe = Registrar.regAndSetupItem("nethicPickaxe", "Nethic Pickaxe", new ItemModPickaxe(JourneyToolMaterial.NETHIC), JourneyTabs.TOOLS);
        nethicAxe = Registrar.regAndSetupItem("nethicaxe", "Nethic Axe", new ItemModAxe(JourneyToolMaterial.NETHIC), JourneyTabs.TOOLS);
        koritePickaxe = Registrar.regAndSetupItem("koritePickaxe", "Korite Pickaxe", new ItemModPickaxe(JourneyToolMaterial.KORITE), JourneyTabs.TOOLS);
        storonPickaxe = Registrar.regAndSetupItem("storonPickaxe", "Storon Pickaxe", new ItemModPickaxe(JourneyToolMaterial.KORITE), JourneyTabs.TOOLS);
        mekyumPickaxe = Registrar.regAndSetupItem("mekyumPickaxe", "Mekyum Pickaxe", new ItemModPickaxe(JourneyToolMaterial.KORITE), JourneyTabs.TOOLS);
        celestiumPickaxe = Registrar.regAndSetupItem("celestiumPickaxe", "Celestium Pickaxe", new ItemModPickaxe(JourneyToolMaterial.CELESTIUM), JourneyTabs.TOOLS);
        flairiumPickaxe = Registrar.regAndSetupItem("flairiumPickaxe", "Flairium Pickaxe", new ItemModPickaxe(JourneyToolMaterial.FLAIRIUM), JourneyTabs.TOOLS);
        desPickaxe = Registrar.regAndSetupItem("desPickaxe", "Des Pickaxe", new ItemModPickaxe(JourneyToolMaterial.DES), JourneyTabs.TOOLS);
        gorbitePickaxe = Registrar.regAndSetupItem("gorbitePickaxe", "Gorbite Pickaxe", new ItemModPickaxe(JourneyToolMaterial.GORBITE), JourneyTabs.TOOLS);
        orbaditePickaxe = Registrar.regAndSetupItem("orbaditePickaxe", "Orbadite Pickaxe", new ItemModPickaxe(JourneyToolMaterial.ORBADITE), JourneyTabs.TOOLS);
        slimyPickaxe = Registrar.regAndSetupItem("slimy_pickaxe", "Slimy Pickaxe", new ItemModPickaxe(JourneyToolMaterial.SLIMY_PICK), JourneyTabs.TOOLS);
        pickaxeOfGoodFortune = Registrar.regAndSetupItem("pickaxe_of_good_fortune", "Pickaxe of Good Fortune", new ItemModPickaxe(JourneyToolMaterial.SLIMY_PICK), JourneyTabs.TOOLS);

        hellstoneShovel = Registrar.regAndSetupItem("hellstoneShovel", "Bloodcrust Shovel", new ItemModShovel(JourneyToolMaterial.HELLSTONE), JourneyTabs.TOOLS);
        shadiumShovel = Registrar.regAndSetupItem("shadiumShovel", "Shadium Shovel", new ItemModShovel(JourneyToolMaterial.SHADIUM), JourneyTabs.TOOLS);
        celestiumShovel = Registrar.regAndSetupItem("celestiumShovel", "Celestium Shovel", new ItemModShovel(JourneyToolMaterial.CELESTIUM), JourneyTabs.TOOLS);
        luniumShovel = Registrar.regAndSetupItem("luniumShovel", "Lunium Shovel", new ItemModShovel(JourneyToolMaterial.LUNIUM), JourneyTabs.TOOLS);
        flairiumShovel = Registrar.regAndSetupItem("flairiumShovel", "Flairium Shovel", new ItemModShovel(JourneyToolMaterial.FLAIRIUM), JourneyTabs.TOOLS);
        sapphireShovel = Registrar.regAndSetupItem("sapphireShovel", "Sapphire Shovel", new ItemModShovel(JourneyToolMaterial.SAPPHIRE), JourneyTabs.TOOLS);
        gorbiteShovel = Registrar.regAndSetupItem("gorbiteShovel", "Gorbite Shovel", new ItemModShovel(JourneyToolMaterial.GORBITE), JourneyTabs.TOOLS);
        orbaditeShovel = Registrar.regAndSetupItem("orbaditeShovel", "Orbadite Shovel", new ItemModShovel(JourneyToolMaterial.ORBADITE), JourneyTabs.TOOLS);
        desShovel = Registrar.regAndSetupItem("desShovel", "Des Shovel", new ItemModShovel(JourneyToolMaterial.DES), JourneyTabs.TOOLS);
        nethicShovel = Registrar.regAndSetupItem("nethicShovel", "Nethic Shovel", new ItemModShovel(JourneyToolMaterial.NETHIC), JourneyTabs.TOOLS);
        koriteShovel = Registrar.regAndSetupItem("koriteShovel", "Korite Shovel", new ItemModShovel(JourneyToolMaterial.KORITE), JourneyTabs.TOOLS);
        storonShovel = Registrar.regAndSetupItem("storonShovel", "Storon Shovel", new ItemModShovel(JourneyToolMaterial.KORITE), JourneyTabs.TOOLS);
        mekyumShovel = Registrar.regAndSetupItem("mekyumShovel", "Mekyum Shovel", new ItemModShovel(JourneyToolMaterial.KORITE), JourneyTabs.TOOLS);

        bedrockShovel = Registrar.regAndSetupItem("bedrock_shovel", "Bedrock Shovel", new ItemModShovel(JourneyToolMaterial.BEDROCK_SHOVEL), JourneyTabs.TOOLS);

        hellstoneAxe = Registrar.regAndSetupItem("hellstoneAxe", "Bloodcrust Axe", new ItemModAxe(JourneyToolMaterial.HELLSTONE), JourneyTabs.TOOLS);
        shadiumAxe = Registrar.regAndSetupItem("shadiumAxe", "Shadium Axe", new ItemModAxe(JourneyToolMaterial.SHADIUM), JourneyTabs.TOOLS);
        celestiumAxe = Registrar.regAndSetupItem("celestiumAxe", "Celestium Axe", new ItemModAxe(JourneyToolMaterial.CELESTIUM), JourneyTabs.TOOLS);
        luniumAxe = Registrar.regAndSetupItem("luniumAxe", "Lunium Axe", new ItemModAxe(JourneyToolMaterial.LUNIUM), JourneyTabs.TOOLS);
        flairiumAxe = Registrar.regAndSetupItem("flairiumAxe", "Flairium Axe", new ItemModAxe(JourneyToolMaterial.FLAIRIUM), JourneyTabs.TOOLS);
        sapphireAxe = Registrar.regAndSetupItem("sapphireAxe", "Sapphire Axe", new ItemModAxe(JourneyToolMaterial.SAPPHIRE), JourneyTabs.TOOLS);
        gorbiteAxe = Registrar.regAndSetupItem("gorbiteAxe", "Gorbite Axe", new ItemModAxe(JourneyToolMaterial.GORBITE), JourneyTabs.TOOLS);
        orbaditeAxe = Registrar.regAndSetupItem("orbaditeAxe", "Orbadite Axe", new ItemModAxe(JourneyToolMaterial.ORBADITE), JourneyTabs.TOOLS);
        desAxe = Registrar.regAndSetupItem("desAxe", "Des Axe", new ItemModAxe(JourneyToolMaterial.DES), JourneyTabs.TOOLS);
        koriteAxe = Registrar.regAndSetupItem("koriteAxe", "Korite Axe", new ItemModAxe(JourneyToolMaterial.KORITE), JourneyTabs.TOOLS);
        storonAxe = Registrar.regAndSetupItem("storonAxe", "Storon Axe", new ItemModAxe(JourneyToolMaterial.KORITE), JourneyTabs.TOOLS);
        mekyumAxe = Registrar.regAndSetupItem("mekyumAxe", "Mekyum Axe", new ItemModAxe(JourneyToolMaterial.KORITE), JourneyTabs.TOOLS);

        hellstoneHoe = Registrar.regAndSetupItem("hellstoneHoe", "Bloodcrust Hoe", new ItemModHoe(JourneyToolMaterial.HELLSTONE), JourneyTabs.TOOLS);
        shadiumHoe = Registrar.regAndSetupItem("shadiumHoe", "Shadium Hoe", new ItemModHoe(JourneyToolMaterial.SHADIUM), JourneyTabs.TOOLS);
        celestiumHoe = Registrar.regAndSetupItem("celestiumHoe", "Celestium Hoe", new ItemModHoe(JourneyToolMaterial.CELESTIUM), JourneyTabs.TOOLS);
        luniumHoe = Registrar.regAndSetupItem("luniumHoe", "Lunium Hoe", new ItemModHoe(JourneyToolMaterial.LUNIUM), JourneyTabs.TOOLS);
        flairiumHoe = Registrar.regAndSetupItem("flairiumHoe", "Flairium Hoe", new ItemModHoe(JourneyToolMaterial.FLAIRIUM), JourneyTabs.TOOLS);
        sapphireHoe = Registrar.regAndSetupItem("sapphireHoe", "Sapphire Hoe", new ItemModHoe(JourneyToolMaterial.SAPPHIRE), JourneyTabs.TOOLS);
        gorbiteHoe = Registrar.regAndSetupItem("gorbiteHoe", "Gorbite Hoe", new ItemModHoe(JourneyToolMaterial.GORBITE), JourneyTabs.TOOLS);
        orbaditeHoe = Registrar.regAndSetupItem("orbaditeHoe", "Orbadite Hoe", new ItemModHoe(JourneyToolMaterial.ORBADITE), JourneyTabs.TOOLS);
        desHoe = Registrar.regAndSetupItem("desHoe", "Des Hoe", new ItemModHoe(JourneyToolMaterial.DES), JourneyTabs.TOOLS);
        koriteHoe = Registrar.regAndSetupItem("koriteHoe", "Korite Hoe", new ItemModHoe(JourneyToolMaterial.KORITE), JourneyTabs.TOOLS);
        storonHoe = Registrar.regAndSetupItem("storonHoe", "Storon Hoe", new ItemModHoe(JourneyToolMaterial.KORITE), JourneyTabs.TOOLS);
        mekyumHoe = Registrar.regAndSetupItem("mekyumHoe", "Mekyum Hoe", new ItemModHoe(JourneyToolMaterial.KORITE), JourneyTabs.TOOLS);
        hoeOfEternalLife = Registrar.regAndSetupItem("hoeofeternallife", "Hoe Of Eternal Life", new ItemBonemealHoe(JourneyToolMaterial.HOEOFLIFE), JourneyTabs.TOOLS);
        hoeOfEarthLoving = Registrar.regAndSetupItem("hoe_of_earth_loving", "Hoe of Earth Loving", new ItemBonemealHoe(JourneyToolMaterial.HOEOFEARTH), JourneyTabs.TOOLS);
    }
}