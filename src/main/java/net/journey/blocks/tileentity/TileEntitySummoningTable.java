package net.journey.blocks.tileentity;

import net.journey.JITL;
import net.journey.blocks.tileentity.container.ContainerSummoningTable;
import net.journey.enums.EnumParticlesClasses;
import net.journey.init.JourneySounds;
import net.journey.recipe.SummoningRecipe;
import net.journey.recipe.SummoningRecipeRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;

import java.util.Random;

public class TileEntitySummoningTable extends TileEntityLockableLoot implements ITickable {

    private NonNullList<ItemStack> inventory = NonNullList.withSize(7, ItemStack.EMPTY);
    private String customName;

    public void onServerBlockClicked() {

    }

    @Override
    public void update() {

        if (isEmpty()) return;

        for (SummoningRecipe recipe : SummoningRecipeRegistry.getRecipes()) {
            if (recipe.matches(inventory)) {
                summonItem(recipe.getOutput());
                return;
            }
        }
    }

    public void summonItem(ItemStack orb) {

        for (int i = 0; i < 7; i++) {
            inventory.get(i).shrink(1);
        }
        inventory.set(3, orb);

        addSound();
        if (world.isRemote) addParticles();
    }

	public void addSound() {
		double x = pos.getX();
		double y = pos.getY();
		double z = pos.getZ();
        JourneySounds.playSound(x, y, z, JourneySounds.SUMMON_BOSS, world, 1.0F, 0.7F);
	}

    public void addParticles() {
        Random r = new Random();
        if (!world.isRemote) {
            for (int i = 0; i < 20; i++)
                JITL.proxy.spawnParticle(EnumParticlesClasses.SUMMONING, world, getPos().getX() + r.nextFloat(), getPos().getY() + 1.2D, getPos().getZ() + r.nextFloat(), 0, 1, 0);
        }
    }

    @Override
    public int getSizeInventory() {
        return 7;
    }

    @Override
    public boolean isEmpty() {
        for (ItemStack s : this.inventory) {
            if (!s.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int getInventoryStackLimit() {
        return 1;
    }

    @Override
    public String getName() {
        return this.hasCustomName() ? this.customName : "Summoning Table";
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.inventory = NonNullList.withSize(getSizeInventory(), ItemStack.EMPTY);
        if (!this.checkLootAndRead(compound)) {
            ItemStackHelper.loadAllItems(compound, inventory);
        }
        if (compound.hasKey("CustomName", 8)) {
            this.customName = compound.getString("CustomName");
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        if (!this.checkLootAndWrite(compound)) {
            ItemStackHelper.saveAllItems(compound, inventory);
        }
        if (compound.hasKey("CustomName", 8)) {
            compound.setString("CustomName", this.customName);
        }
        return compound;
    }

    @Override
    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
        return new ContainerSummoningTable(playerInventory, this);
    }

    @Override
    public String getGuiID() {
        return "journey:summoningtable";
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return inventory;
    }
}