package net.journey.common.capability.innercaps;

import net.journey.common.capability.SerializableInnerCap;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;

public class KnowledgeStorageImpl extends SerializableInnerCap<NBTTagCompound, KnowledgeStorageImpl>{
	private float amountOnLevel;
	private int levels;

	@Override
	public NBTTagCompound serializeNBT() {
		NBTTagCompound compound = new NBTTagCompound();
		compound.setFloat("amount_on_level", amountOnLevel);
		compound.setInteger("levels", levels);

		return compound;
	}

	@Override
	public void deserializeNBT(NBTTagCompound nbt) {
		amountOnLevel = nbt.getFloat("amount_on_level");
		levels = nbt.getInteger("levels");
	}

	@Override
	public void writeToBuffer(PacketBuffer buffer) {
		buffer.writeFloat(amountOnLevel);
		buffer.writeInt(levels);
	}

	@Override
	public void readFromBuffer(PacketBuffer buffer) {
		amountOnLevel = buffer.readFloat();
		levels = buffer.readInt();
	}
}