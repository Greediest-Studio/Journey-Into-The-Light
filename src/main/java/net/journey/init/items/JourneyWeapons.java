package net.journey.init.items;

import net.journey.entity.projectile.*;
import net.journey.entity.projectile.arrow.EntityEssenceArrow;
import net.journey.entity.projectile.staff.*;
import net.journey.enums.EnumSwordType;
import net.journey.init.JourneyTabs;
import net.journey.init.Registrar;
import net.journey.items.bows.ItemModBow;
import net.journey.items.ranged.*;
import net.journey.util.JourneyToolMaterial;
import net.minecraft.item.Item;
import net.slayer.api.item.ItemModSword;

import java.util.EnumSet;

public class JourneyWeapons {

	public static Item essenceShuriken;

	public static Item flameBow;
	public static Item poisonBow;
	public static Item darknessBow;
    public static Item frozenBow;

    public static Item darkEnforcer;
    public static Item depthsBow;

    public static Item coreExpender;
    public static Item darkTerraBow;
    public static Item lavenderBow;
    public static Item terralightBow;

    public static Item fireWand;
    public static Item iceWand;

    public static ItemStaff staffOfHellstone;

    public static ItemStaff conjuringStaff;

    public static Item dragonsTooth;
    public static Item boilingBlade;
    public static Item depthsDarksword;
    public static Item depthsSlayer;
    public static Item coreMender;
    public static Item demonicSword;

    public static void init() {
	    dragonsTooth = Registrar.regAndSetupItem("dragonsTooth", "Dragons Tooth", new ItemModSword(JourneyToolMaterial.DRAGONS_TOOTH), JourneyTabs.WEAPONS);
	    boilingBlade = Registrar.regAndSetupItem("boilingBlade", "Boiling Blade", new ItemModSword(EnumSwordType.FIRE, JourneyToolMaterial.BOILING_BLADE), JourneyTabs.WEAPONS);
	    depthsDarksword = Registrar.regAndSetupItem("depthsDarksword", "Depths Darksword", new ItemModSword(EnumSwordType.STUN_WITHER, JourneyToolMaterial.DEPTHS_DARKSWORD), JourneyTabs.WEAPONS);
	    depthsSlayer = Registrar.regAndSetupItem("depthsSlayer", "Depths Slayer", new ItemModSword(EnumSwordType.STUN, JourneyToolMaterial.DEPTHS_SLAYER), JourneyTabs.WEAPONS);
	    coreMender = Registrar.regAndSetupItem("coreMender", "Core Mender", new ItemModSword(EnumSwordType.FIRE, JourneyToolMaterial.CORE_MENDER), JourneyTabs.WEAPONS);

		staffOfHellstone = Registrar.regAndSetupItem("staffOfHellstone", "Staff of Hellstone", new ItemStaff(3, 1000, 7, false, EntityHellstone.class), JourneyTabs.WEAPONS);
		conjuringStaff = Registrar.regAndSetupItem("conjuringStaff", "Conjuring Staff", new ItemStaff(3, 1000, 18, false, EntityConjuring.class), JourneyTabs.WEAPONS);

		fireWand = Registrar.regAndSetupItem("fireWand", "Fire Wand", new ItemWand(true, 5, 600, 5, false, EntityFireBall.class), JourneyTabs.WEAPONS);
		iceWand = Registrar.regAndSetupItem("iceWand", "Ice Wand", new ItemWand(true, 5, 600, 5, false, EntityIceBall.class), JourneyTabs.WEAPONS);

		//Overworld
		flameBow = Registrar.regAndSetupItem("flameBow", "Flame Bow", new ItemModBow(2, 384, EnumSet.of(EntityEssenceArrow.BowEffects.FLAME), 72000), JourneyTabs.WEAPONS);


		poisonBow = Registrar.regAndSetupItem("poisonBow", "Poison Bow", new ItemModBow(2, 384, EnumSet.of(EntityEssenceArrow.BowEffects.POISON), 72000), JourneyTabs.WEAPONS);
		darknessBow = Registrar.regAndSetupItem("darknessBow", "Darkness Bow", new ItemModBow(2, 384, EnumSet.of(EntityEssenceArrow.BowEffects.WITHER), 72000), JourneyTabs.WEAPONS);
		frozenBow = Registrar.regAndSetupItem("frozenBow", "Frozen Bow", new ItemModBow(2, 384, EnumSet.of(EntityEssenceArrow.BowEffects.SLOWNESS), 72000), JourneyTabs.WEAPONS);

		coreExpender = Registrar.regAndSetupItem("coreExpender", "Core Expender", new ItemModBow(2.5F, 384, EnumSet.of(
				EntityEssenceArrow.BowEffects.CONSUMES_ESSENCE,
				EntityEssenceArrow.BowEffects.FLAME), 72000), JourneyTabs.WEAPONS).setEssenceValue(3);

		//Depths
		darkEnforcer = Registrar.regAndSetupItem("darkEnforcer", "Dark Enforcer", new ItemModBow(5.0F, 384, EnumSet.of(
				EntityEssenceArrow.BowEffects.CONSUMES_ESSENCE), 64000), JourneyTabs.WEAPONS).setEssenceValue(3);
		depthsBow = Registrar.regAndSetupItem("depthsBow", "Depths Bow", new ItemModBow(4.0F, 384, EnumSet.of(
				EntityEssenceArrow.BowEffects.CONSUMES_ESSENCE), 32000), JourneyTabs.WEAPONS).setEssenceValue(3);

		//Terrania
		darkTerraBow = Registrar.regAndSetupItem("darkTerraBow", "Dark Terra Bow", new ItemModBow(5.0F, 384, EnumSet.of(EntityEssenceArrow.BowEffects.WITHER), 48000), JourneyTabs.WEAPONS);
		lavenderBow = Registrar.regAndSetupItem("lavenderBow", "Lavender Bow", new ItemModBow(5.0F, 384, EnumSet.of(EntityEssenceArrow.BowEffects.SLOWNESS), 36000), JourneyTabs.WEAPONS);
		terralightBow = Registrar.regAndSetupItem("terralightBow", "Terralight Bow", new ItemModBow(5.0F, 384, EnumSet.of(
				EntityEssenceArrow.BowEffects.CONSUMES_ESSENCE), 32000), JourneyTabs.WEAPONS).setEssenceValue(2);

	    essenceShuriken = Registrar.regAndSetupItem("essence_shuriken", "Essence Shuriken", new ItemEssenceShuriken(), JourneyTabs.WEAPONS);
	}
}