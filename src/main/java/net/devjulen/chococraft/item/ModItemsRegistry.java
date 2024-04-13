package net.devjulen.chococraft.item;

import net.devjulen.chococraft.Chococraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemsRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Chococraft.MOD_ID);

    /* FOOD */
    public static final RegistryObject<Item> MILK_CHOCOLATE_BAR = ITEMS.register("milk_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoods.MILK_CHOCOLATE_BAR)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_BAR = ITEMS.register("white_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_BAR)));
    public static final RegistryObject<Item> DARK_CHOCOLATE_BAR = ITEMS.register("dark_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_BAR)));
    public static final RegistryObject<Item> ALMOND = ITEMS.register("almond",
            () -> new Item(new Item.Properties().food(ModFoods.ALMOND)));
    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties().food(ModFoods.ORANGE)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));
    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().food(ModFoods.BLUEBERRY)));
    public static final RegistryObject<Item> RASPBERRY = ITEMS.register("raspberry",
            () -> new Item(new Item.Properties().food(ModFoods.RASPBERRY)));
    public static final RegistryObject<Item> MILK_CHOCOLATE_ALMOND_BAR = ITEMS.register("milk_chocolate_almond_bar",
            () -> new Item(new Item.Properties().food(ModFoods.MILK_CHOCOLATE_ALMOND_BAR)));
    public static final RegistryObject<Item> MILK_CHOCOLATE_RASPBERRY_BAR = ITEMS.register("milk_chocolate_raspberry_bar",
            () -> new Item(new Item.Properties().food(ModFoods.MILK_CHOCOLATE_RASPBERRY_BAR)));
    public static final RegistryObject<Item> DARK_CHOCOLATE_ORANGE_BAR = ITEMS.register("dark_chocolate_orange_bar",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_ORANGE_BAR)));
    public static final RegistryObject<Item> DARK_CHOCOLATE_MINT_BAR = ITEMS.register("dark_chocolate_mint_bar",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_MINT_BAR)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_STRAWBERRY_BAR = ITEMS.register("white_chocolate_strawberry_bar",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_STRAWBERRY_BAR)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_BLUEBERRY_BAR = ITEMS.register("white_chocolate_blueberry_bar",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_BLUEBERRY_BAR)));

    /* OTHER */
    public static final RegistryObject<Item> MILK_CHOCOALTE_INGOT = ITEMS.register("milk_chocolate_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_CHOCOALTE_INGOT = ITEMS.register("dark_chocolate_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CHOCOALTE_INGOT = ITEMS.register("white_chocolate_ingot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MINT_LEAF = ITEMS.register("mint_leaf", () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
