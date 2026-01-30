package net.journey.entity.mob.euca.npc;

import net.journey.client.handler.GuiHandler;
import net.journey.entity.JourneyMerchantRecipe;
import net.journey.init.blocks.JourneyBlocks;
import net.journey.init.items.JourneyItems;
import net.journey.init.items.JourneyWeapons;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;
import net.slayer.api.SlayerAPI;
import net.slayer.api.entity.EntityModVillager;

public class EntityAlloyMender extends EntityModVillager {

    public EntityAlloyMender(World var1) {
        super(var1);
    }

    @Override
    public void abstractInteract(EntityPlayer p) {
        switch (rand.nextInt(3)) {
            case 0:
                SlayerAPI.addFormattedChatMessage(p, "Mender: It takes over a thousand degreese to melt this gold!");
                break;
            case 1:
                SlayerAPI.addFormattedChatMessage(p, "Mender: My weapons have been melted and shaped into deadly perfection!");
                break;
            case 2:
                SlayerAPI.addFormattedChatMessage(p, "Mender: It's a real struggle living here, when everything wants to kill you...");
                break;
        }
    }

    @Override
	public GuiHandler.Identifier getGuiIdentifier() {
		return GuiHandler.ALLOY_MENDER;
	}

    @Override
    public void addRecipies(MerchantRecipeList list) {
    }
}