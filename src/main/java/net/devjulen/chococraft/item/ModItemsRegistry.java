package net.devjulen.chococraft.item;

import net.devjulen.chococraft.Chococraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemsRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Chococraft.MOD_ID);

    public static final RegistryObject<Item> MILK_CHOCOALTE_INGOT = ITEMS.register("milk_chocolate_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_CHOCOALTE_INGOT = ITEMS.register("dark_chocolate_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CHOCOALTE_INGOT = ITEMS.register("white_chocolate_ingot", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
