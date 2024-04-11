package net.devjulen.chococraft.datagen;

import net.devjulen.chococraft.Chococraft;
import net.devjulen.chococraft.item.ModItemsRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Chococraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItemsRegistry.MILK_CHOCOALTE_INGOT);
        simpleItem(ModItemsRegistry.DARK_CHOCOALTE_INGOT);
        simpleItem(ModItemsRegistry.WHITE_CHOCOALTE_INGOT);

        // FOOD ITEMS
        simpleItem(ModItemsRegistry.MILK_CHOCOLATE_BAR);
        simpleItem(ModItemsRegistry.DARK_CHOCOLATE_BAR);
        simpleItem(ModItemsRegistry.WHITE_CHOCOLATE_BAR);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        System.out.println(">>>>>>>>>>>" + item.getId().getPath());
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Chococraft.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Chococraft.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Chococraft.MOD_ID,"block/" + item.getId().getPath()));
    }
}
