package net.journey.entity.mob.overworld.npc;

import net.journey.client.handler.GuiHandler;
import net.journey.entity.JourneyMerchantRecipe;
import net.journey.init.items.JourneyItems;
import net.journey.init.items.JourneyWeapons;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.slayer.api.SlayerAPI;
import net.slayer.api.entity.EntityModVillager;

import javax.annotation.Nullable;

public class EntityMage extends EntityModVillager {

    public EntityMage(World var1) {
        super(var1);
    }

    @Override
    public void abstractInteract(EntityPlayer p) {
        switch (rand.nextInt(3)) {
            case 0:
                SlayerAPI.addFormattedChatMessage(p, "mage.valuables");
                break;
            case 1:
                SlayerAPI.addFormattedChatMessage(p, "mage.greetings");
                break;
            case 2:
                SlayerAPI.addFormattedChatMessage(p, "mage.deals");
                break;
        }
    }

    @Override
    protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
        super.setEquipmentBasedOnDifficulty(difficulty);
        this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(JourneyWeapons.conjuringStaff));
    }

    @Override
    @Nullable
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
        livingdata = super.onInitialSpawn(difficulty, livingdata);
        this.setEquipmentBasedOnDifficulty(difficulty);
        return livingdata;
    }

    @Override
    public ItemStack getHeldItem(EnumHand hand) {
        return new ItemStack(JourneyWeapons.conjuringStaff);
    }

    @Override
	public GuiHandler.Identifier getGuiIdentifier() {
		return GuiHandler.MAGE;
	}

    @Override
    public void addRecipies(MerchantRecipeList list) {
        list.add(new JourneyMerchantRecipe(new ItemStack(Items.STICK, 1), new ItemStack(Items.GOLD_INGOT, 5), new ItemStack(JourneyItems.wandBase)));
        list.add(new JourneyMerchantRecipe(new ItemStack(Items.STICK, 1), new ItemStack(Items.DIAMOND, 2), new ItemStack(JourneyItems.staffBase)));
    }
}