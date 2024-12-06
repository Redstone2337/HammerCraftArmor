package net.redstone233.morearmor.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.recipe.v1.ingredient.DefaultCustomIngredients;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.redstone233.morearmor.items.ModArmorItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup,recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.COMBAT, ModArmorItems.HAMMER_CRAFT_HELMET,1)
                        .pattern("AAA")
                        .pattern("A A")
                        .input('A',ModArmorItems.HAMMER_CORE).criterion("has_hammer_core",conditionsFromItem(ModArmorItems.HAMMER_CORE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.COMBAT, ModArmorItems.HAMMER_CRAFT_CHESTPLATE,1)
                        .pattern("A A")
                        .pattern("AAA")
                        .pattern("AAA")
                        .input('A',ModArmorItems.HAMMER_CORE).criterion("has_hammer_core",conditionsFromItem(ModArmorItems.HAMMER_CORE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.COMBAT, ModArmorItems.HAMMER_CRAFT_LEGGINGS,1)
                        .pattern("AAA")
                        .pattern("A A")
                        .pattern("A A")
                        .input('A',ModArmorItems.HAMMER_CORE).criterion("has_hammer_core",conditionsFromItem(ModArmorItems.HAMMER_CORE))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.COMBAT, ModArmorItems.HAMMER_CRAFT_BOOTS,1)
                        .pattern("A A")
                        .pattern("A A")
                        .input('A',ModArmorItems.HAMMER_CORE).criterion("has_hammer_core",conditionsFromItem(ModArmorItems.HAMMER_CORE))
                        .offerTo(recipeExporter);

                createShapeless(RecipeCategory.MISC,ModArmorItems.HAMMER_CORE,1)
                        .input(DefaultCustomIngredients.any(
                                Ingredient.ofItems(Items.DIAMOND),
                                Ingredient.ofItems(Items.BLACK_DYE)
                        )).criterion("has_diamond",conditionsFromItem(Items.DIAMOND))
                        .offerTo(recipeExporter);

            }
        };
    }

    @Override
    public String getName() {
        return "Register Recipes";
    }
}
