package net.journey.dimension.depths.gen;

import java.util.Random;

import net.journey.init.blocks.JourneyBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenDepthsTree2 extends WorldGenerator {

    private static boolean isLeaves(int dx, int dy, int dz) {
        if (dx < 0 || dx > 4 || dz < 0 || dz > 4) {
            return false;
        }

        if (dy == 2) {
            if (dx == 0 || dx == 4) {
                return dz == 1 || dz == 3;
            }
            if (dx == 1 || dx == 3) {
                return dz == 0 || dz == 4;
            }
            return false;
        } else {
            if (dx == 0 || dx == 4) {
                return dz >= 1 && dz <= 3;
            }
            return true;
        }
    }

    @Override
    public boolean generate(World world, Random r, BlockPos pos) {
        int i = pos.getX() - 6;
        int j = pos.getY() - 1;
        int k = pos.getZ() - 6;

        IBlockState leaves = JourneyBlocks.depthsLeaves.getDefaultState();
        IBlockState log = JourneyBlocks.depthsLog.getDefaultState();

        for (int dy = 0; dy <= 4; dy++) {
            this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + dy, k + 2), log);
        }

        for (int dy = 2; dy <= 6; dy++) {
            for (int dx = 0; dx <= 4; dx++) {
                for (int dz = 0; dz <= 4; dz++) {
                    if (dx == 2 && dz == 2 && dy <= 4) {
                        continue;
                    }
                    if (isLeaves(dx, dy, dz)) {
                        this.setBlockAndNotifyAdequately(world, new BlockPos(i + dx, j + dy, k + dz), leaves);
                    }
                }
            }
        }
        return true;
    }
}