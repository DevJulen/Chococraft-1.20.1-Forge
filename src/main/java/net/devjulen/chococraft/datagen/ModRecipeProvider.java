package net.devjulen.chococraft.datagen;

import net.devjulen.chococraft.Chococraft;
import net.devjulen.chococraft.item.ModItemsRegistry;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        // SMELTING RECIPES
        //oreSmelting(consumer, List.of(Items.COCOA_BEANS), RecipeCategory.MISC, ModItemsRegistry.ROASTED_COCOA_BEANS.get(),
        //        0.7f, 200, "roasted_cocoa_beans");

        // BLASTING RECIPES
        //oreBlasting(consumer, List.of(Items.COCOA_BEANS), RecipeCategory.MISC, ChocoItems.ROASTED_COCOA_BEANS.get(),
        //        0.7f, 100, "roasted_cocoa_beans");

        // SHAPED RECIPES
        /* milk chocolate ingot */
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItemsRegistry.MILK_CHOCOALTE_INGOT.get())
                .define('B', ModItemsRegistry.MILK_CHOCOLATE_BAR.get())
                .pattern("BBB")
                .unlockedBy("has_milk_chocolate_bar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItemsRegistry.MILK_CHOCOLATE_BAR.get()).build()))
                .save(consumer);

        /* dark chocolate bar */
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItemsRegistry.DARK_CHOCOALTE_INGOT.get())
                .define('B', ModItemsRegistry.DARK_CHOCOLATE_BAR.get())
                .pattern("BBB")
                .unlockedBy("has_dark_chocolate_bar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItemsRegistry.DARK_CHOCOLATE_BAR.get()).build()))
                .save(consumer);

        /* white chocolate bar */
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItemsRegistry.WHITE_CHOCOALTE_INGOT.get())
                .define('B', ModItemsRegistry.WHITE_CHOCOLATE_BAR.get())
                .pattern("BBB")
                .unlockedBy("has_white_chocolate_bar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItemsRegistry.WHITE_CHOCOLATE_BAR.get()).build()))
                .save(consumer);


        // SHAPELESS RECIPES
        /* milk chocolate almond bar */
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItemsRegistry.MILK_CHOCOLATE_ALMOND_BAR.get())
                .requires(ModItemsRegistry.MILK_CHOCOLATE_BAR.get())
                .requires(ModItemsRegistry.ALMOND.get())
                .unlockedBy("has_milk_chocolate_bar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItemsRegistry.MILK_CHOCOLATE_ALMOND_BAR.get()).build()))
                .unlockedBy("has_almond", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItemsRegistry.ALMOND.get()).build()))
                .save(consumer);

        /* milk chocolate raspberry bar */
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItemsRegistry.MILK_CHOCOLATE_RASPBERRY_BAR.get())
                .requires(ModItemsRegistry.MILK_CHOCOLATE_BAR.get())
                .requires(ModItemsRegistry.RASPBERRY.get())
                .unlockedBy("has_milk_chocolate_bar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItemsRegistry.MILK_CHOCOLATE_BAR.get()).build()))
                .unlockedBy("has_raspberry", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItemsRegistry.RASPBERRY.get()).build()))
                .save(consumer);

        /* dark chocolate orange bar */
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItemsRegistry.DARK_CHOCOLATE_ORANGE_BAR.get())
                .requires(ModItemsRegistry.DARK_CHOCOLATE_BAR.get())
                .requires(ModItemsRegistry.ORANGE.get())
                .unlockedBy("has_dark_chocolate_bar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItemsRegistry.DARK_CHOCOLATE_BAR.get()).build()))
                .unlockedBy("has_orange", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItemsRegistry.ORANGE.get()).build()))
                .save(consumer);

        /* dark chocolate mint bar */
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItemsRegistry.DARK_CHOCOLATE_MINT_BAR.get())
                .requires(ModItemsRegistry.DARK_CHOCOLATE_BAR.get())
                .requires(ModItemsRegistry.MINT_LEAF.get())
                .unlockedBy("has_dark_chocolate_bar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItemsRegistry.DARK_CHOCOLATE_BAR.get()).build()))
                .unlockedBy("has_mint_leaf", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItemsRegistry.MINT_LEAF.get()).build()))
                .save(consumer);

        /* white chocolate strawberry bar */
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItemsRegistry.WHITE_CHOCOLATE_STRAWBERRY_BAR.get())
                .requires(ModItemsRegistry.WHITE_CHOCOLATE_BAR.get())
                .requires(ModItemsRegistry.STRAWBERRY.get())
                .unlockedBy("has_white_chocolate_bar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItemsRegistry.WHITE_CHOCOLATE_BAR.get()).build()))
                .unlockedBy("has_strawberry", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItemsRegistry.STRAWBERRY.get()).build()))
                .save(consumer);

        /* white chocolate blueberry bar */
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItemsRegistry.WHITE_CHOCOLATE_BLUEBERRY_BAR.get())
                .requires(ModItemsRegistry.WHITE_CHOCOLATE_BAR.get())
                .requires(ModItemsRegistry.BLUEBERRY.get())
                .unlockedBy("has_white_chocolate_bar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItemsRegistry.WHITE_CHOCOLATE_BAR.get()).build()))
                .unlockedBy("has_blueberry", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItemsRegistry.BLUEBERRY.get()).build()))
                .save(consumer);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, new ResourceLocation(Chococraft.MOD_ID, getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike)));
        }

    }
}
