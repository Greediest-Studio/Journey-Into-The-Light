package net.journey.items;

import net.journey.init.blocks.JourneyBlocks;
import net.journey.items.base.JItem;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.slayer.api.SlayerAPI;

import java.util.List;

public class ItemFlameCoin extends JItem {

	public ItemFlameCoin() {
		setMaxStackSize(1);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing fa, float hitX, float hitY, float hitZ) {
		BlockPos firePos = pos.up();
		if (!world.isAirBlock(firePos) || !player.canPlayerEdit(firePos, fa, player.getHeldItem(hand))) {
			return EnumActionResult.FAIL;
		}
		if (world.isRemote) {
            return EnumActionResult.SUCCESS;
        }
		return world.setBlockState(firePos, JourneyBlocks.fire.getDefaultState(), 3)
                ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

        //ItemDoor.placeDoor(w, pos.up(1), EnumFacing.fromAngle(player.rotationYaw), JourneyBlocks.frozenDoor, false);
        //new WorldGenSpikeDungeon().generate(world, r, pos);

        //WorldGenStructure structure = new WorldGenStructure("big", JourneyLootTables.TEST_CHEST);
        //if(!w.isRemote)
        //structure.generate(w, r, pos);

        //int i = pos.getX(), j = pos.getY(), k = pos.getZ();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack i, World worldIn, List<String> l, ITooltipFlag flagIn) {
        l.add(SlayerAPI.Colour.GREEN + "Key item used to light all portals.");
    }
}
