package net.journey.dimension.depths.gen;

import java.util.Random;

import net.journey.init.blocks.JourneyBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenDepthsTree1 extends WorldGenerator {

    private static boolean shouldPlaceLeaf(int dx, int dy, int dz) {
        if (dx == 3 && dz == 3 && dy <= 4) {
            return false;
        }

        if (dy == 2 || dy == 3) {
            if (dx == 0 || dx == 6) {
                return dz == 1 || dz == 3 || dz == 5;
            }
            if (dx == 1 || dx == 5) {
                return dz == 0 || dz == 6;
            }
            if (dx == 3) {
                return dz == 0 || dz == 6;
            }
            return false;
        }

        if (dy == 4) {
            if (dx == 0 || dx == 6) {
                return dz >= 1 && dz <= 5;
            }
            if (dx == 3) {
                return dz != 3;
            }
            return true;
        }

        if (dx == 0 || dx == 6) {
            return dz >= 1 && dz <= 5;
        }
        return true;
    }

    @Override
    public boolean generate(World world, Random r, BlockPos pos) {
        int i = pos.getX() - 6;
        int j = pos.getY() - 1;
        int k = pos.getZ() - 6;
        IBlockState leaves = JourneyBlocks.depthsLeaves.getDefaultState();
        IBlockState log = JourneyBlocks.depthsLog.getDefaultState();

        for (int dy = 0; dy <= 4; dy++) {
            setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + dy, k + 3), log);
        }

        for (int dx = 0; dx <= 6; dx++) {
            for (int dz = 0; dz <= 6; dz++) {
                for (int dy = 2; dy <= 8; dy++) {
                    if (shouldPlaceLeaf(dx, dy, dz)) {
                        setBlockAndNotifyAdequately(world,
                                new BlockPos(i + dx, j + dy, k + dz), leaves);
                    }
                }
            }
        }
        return true;
    }
}