package net.devjulen.chococraft.effect;

import com.google.common.eventbus.EventBus;
import net.devjulen.chococraft.Chococraft;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Chococraft.MOD_ID);

    public static final RegistryObject<MobEffect> FROST_WALK = EFFECTS.register("frost_walk",
            () -> new FrostWalkEffect(MobEffectCategory.BENEFICIAL, 3125687));

    public static void register(IEventBus eventBus) {
        EFFECTS.register(eventBus);
    }
}
