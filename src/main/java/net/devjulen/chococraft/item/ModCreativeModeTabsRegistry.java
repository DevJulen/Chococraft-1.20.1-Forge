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
                        // The order in which we define the items/blocks etc. here is the same that will be used to display them in the creative mode tab
                        output.accept(ModItemsRegistry.MILK_CHOCOALTE_INGOT.get());
                        output.accept(ModItemsRegistry.DARK_CHOCOALTE_INGOT.get());
                        output.accept(ModItemsRegistry.WHITE_CHOCOALTE_INGOT.get());

                        output.accept(ModItemsRegistry.MILK_CHOCOLATE_BAR.get());
                        output.accept(ModItemsRegistry.DARK_CHOCOLATE_BAR.get());
                        output.accept(ModItemsRegistry.WHITE_CHOCOLATE_BAR.get());
                        output.accept(ModItemsRegistry.MILK_CHOCOLATE_ALMOND_BAR.get());
                        output.accept(ModItemsRegistry.MILK_CHOCOLATE_RASPBERRY_BAR.get());
                        output.accept(ModItemsRegistry.DARK_CHOCOLATE_ORANGE_BAR.get());
                        output.accept(ModItemsRegistry.DARK_CHOCOLATE_MINT_BAR.get());
                        output.accept(ModItemsRegistry.WHITE_CHOCOLATE_STRAWBERRY_BAR.get());
                        output.accept(ModItemsRegistry.WHITE_CHOCOLATE_BLUEBERRY_BAR.get());

                        output.accept(ModItemsRegistry.ALMOND.get());
                        output.accept(ModItemsRegistry.RASPBERRY.get());
                        output.accept(ModItemsRegistry.ORANGE.get());
                        output.accept(ModItemsRegistry.MINT_LEAF.get());
                        output.accept(ModItemsRegistry.STRAWBERRY.get());
                        output.accept(ModItemsRegistry.BLUEBERRY.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
