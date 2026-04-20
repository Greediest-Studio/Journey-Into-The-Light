package net.journey.blocks.tileentity;

import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityGrindstone extends TileEntity implements ITickable {

    public Item itemOnGrind = null;
    public int state = 0, count = 0;
    public float rotation = 0.0F;
    public boolean isActive = false;

    public TileEntityGrindstone() {
    }


    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setInteger("ItemOnGrind", Item.getIdFromItem(itemOnGrind));
        nbt.setInteger("GrindItemState", state);
        nbt.setBoolean("Active", isActive);
        nbt.setFloat("Rotation", rotation);
        return nbt;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        itemOnGrind = Item.getItemById(nbt.getInteger("ItemOnGrind"));
        state = nbt.getInteger("GrindItemState");
        isActive = nbt.getBoolean("Active");
        rotation = nbt.getFloat("Rotation");
    }

    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        NBTTagCompound var1 = new NBTTagCompound();
        this.writeToNBT(var1);
        return new SPacketUpdateTileEntity(pos, 1, var1);
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        readFromNBT(pkt.getNbtCompound());
    }

    public Item getItem() {
        return itemOnGrind;
    }

    public boolean isActivated() {
        return isActive;
    }

    public void setActivated(boolean a) {
        isActive = a;
    }

    public float getRotaton() {
        return rotation;
    }

    @Override
    public void update() {
    }
}