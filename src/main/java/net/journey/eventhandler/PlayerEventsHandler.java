package net.journey.eventhandler;

import net.journey.common.capability.JCapabilityManager;
import net.journey.init.JourneyLootTables;
import net.journey.init.items.JourneyArmory;
import net.journey.init.items.JourneyConsumables;
import net.journey.init.items.JourneyItems;
import net.journey.util.Config;
import net.journey.util.LootHelper;
import net.journey.util.RandHelper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.slayer.api.PlayerHelper;

import java.util.List;
import java.util.Random;

@Mod.EventBusSubscriber
public class PlayerEventsHandler {

	@SubscribeEvent
	public static void onEntityDrop(LivingDropsEvent event) {
		Random random = RandHelper.RANDOM;
		EntityLivingBase entity = event.getEntityLiving();

		if (entity instanceof EntityGhast) {
			if (random.nextInt(3) == 0) {
				entity.dropItem(JourneyConsumables.ghastTentacle, 1);
			}
		}

		if (Config.enableLootPouchDrops && event.getSource().getTrueSource() instanceof EntityPlayer) {
			if (random.nextInt(Config.commonLootBagRarity) == 0) {
				entity.dropItem(JourneyItems.lootPouch, 1);
			}
			if (random.nextInt(Config.goldLootBagRarity) == 0) {
				entity.dropItem(JourneyItems.lootPouchGold, 1);
			}
			if (random.nextInt(Config.diamondLootBagRarity) == 0) {
				entity.dropItem(JourneyItems.lootPouchDiamond, 1);
			}
		}
	}

	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END && event.player != null) {
			JCapabilityManager.asJourneyPlayer(event.player).onTick(event.side);
		}
	}
}