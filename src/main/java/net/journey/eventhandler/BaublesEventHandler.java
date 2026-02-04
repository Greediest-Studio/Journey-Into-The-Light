package net.journey.eventhandler;

import baubles.api.BaublesApi;
import net.journey.JITL;
import net.journey.init.JourneyLootTables;
import net.journey.init.items.JourneyItems;
import net.journey.util.LootHelper;
import net.journey.util.PotionEffects;
import net.journey.util.RandHelper;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

@Mod.EventBusSubscriber(modid = JITL.MOD_ID)
public class BaublesEventHandler {

    @SubscribeEvent
    public static void onPlayerAttacked(LivingHurtEvent event) {
        if (!event.getEntity().world.isRemote) {
            if (event.getEntity() instanceof EntityPlayer) {
                if (BaublesApi.isBaubleEquipped((EntityPlayer) event.getEntity(), JourneyItems.skullOfDecay) != -1) {
                    if (event.getSource().getTrueSource() instanceof EntityLiving) {
                        EntityLiving entity = (EntityLiving) event.getSource().getTrueSource();
                        entity.addPotionEffect(PotionEffects.setPotionEffect(PotionEffects.wither, 400, 1));
                    }
                }
                if (BaublesApi.isBaubleEquipped((EntityPlayer) event.getEntity(), JourneyItems.deathCap) != -1) {
                    if (event.getSource().getTrueSource() instanceof EntityLiving) {
                        EntityLiving entity = (EntityLiving) event.getSource().getTrueSource();
                        entity.addPotionEffect(PotionEffects.setPotionEffect(PotionEffects.poison, 400, 1));
                    }
                }
            }
        }
    }
}
