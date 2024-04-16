package net.devjulen.chococraft.effect;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.Blocks;

import java.util.Random;

public class FrostWalkEffect extends MobEffect {


    protected FrostWalkEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(!pLivingEntity.getFeetBlockState().getBlock().equals(Blocks.AIR)) return;

        // Get the block pos of the block under the air block that is on the player's feet
        BlockPos blockUnderPos = new BlockPos(pLivingEntity.getOnPos().getX(), pLivingEntity.getOnPos().getY() - 1, pLivingEntity.getOnPos().getZ());

        for(int i = -1; i <= 1; i++) {
            // if the block under the air block on the player's feet is a water block change it to a water block
            if(pLivingEntity.level().getBlockState(blockUnderPos).getBlock().equals(Blocks.WATER)) {
                pLivingEntity.level().setBlock(new BlockPos(blockUnderPos.getX()+i, blockUnderPos.getY(), blockUnderPos.getZ()), Blocks.ICE.defaultBlockState(), 3);
            }
        }

        for(int j = -1; j <= 1; j++) {
            // if the block under the air block on the player's feet is a water block change it to a water block
            if(pLivingEntity.level().getBlockState(blockUnderPos).getBlock().equals(Blocks.WATER)) {
                pLivingEntity.level().setBlock(new BlockPos(blockUnderPos.getX(), blockUnderPos.getY(), blockUnderPos.getZ()+j), Blocks.ICE.defaultBlockState(), 3);
            }
        }


        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
