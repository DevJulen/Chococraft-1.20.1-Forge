package net.devjulen.chococraft.item;

import net.devjulen.chococraft.Chococraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabsRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Chococraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CHOCOCRAFT_TAB = CREATIVE_MODE_TABS.register("chococraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItemsRegistry.MILK_CHOCOALTE_INGOT.get()))
                    .title(Component.translatable("creativetab.chococraft_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItemsRegistry.MILK_CHOCOALTE_INGOT.get());
                        output.accept(ModItemsRegistry.DARK_CHOCOALTE_INGOT.get());
                        output.accept(ModItemsRegistry.WHITE_CHOCOALTE_INGOT.get());

                        output.accept(ModItemsRegistry.MILK_CHOCOLATE_BAR.get());
                        output.accept(ModItemsRegistry.DARK_CHOCOLATE_BAR.get());
                        output.accept(ModItemsRegistry.WHITE_CHOCOLATE_BAR.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
