package net.journey.init;

import net.journey.JITL;
import net.journey.util.gen.lang.LangGeneratorFacade;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureStart;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class Registrar {
	public static final ArrayList<Item> JOURNEY_ITEMS = new ArrayList<>();

	public static <T extends Item> T regAndSetupItem(String key, String enName, T item) {
		return regAndSetupItem(key, enName, item, JourneyTabs.ITEMS);
	}

	public static <T extends Item> T regAndSetupItem(String key, String enName, T item, @Nullable CreativeTabs tab) {
		key = key.toLowerCase();

		item.setRegistryName(JITL.MOD_ID, key)
				.setTranslationKey(key)
				.setCreativeTab(tab);

		JOURNEY_ITEMS.add(item);

		LangGeneratorFacade.addItemEntry(item, enName);

		return item;
	}

	public static void regStructure(String structureName, Class<? extends StructureStart> structureStartClass) {
		MapGenStructureIO.registerStructure(structureStartClass, structureName);
	}

	public static void regStructureComponent(String componentName, Class<? extends StructureComponent> componentClass) {
		MapGenStructureIO.registerStructureComponent(componentClass, componentName);
	}
}
