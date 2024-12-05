package net.redstone233.morearmor.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.redstone233.morearmor.items.ModArmorItems;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLangProvider extends FabricLanguageProvider {
    public ModEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModArmorItems.HAMMER_CRAFT_HELMET,"Hammer Helmet");
        translationBuilder.add(ModArmorItems.HAMMER_CRAFT_CHESTPLATE,"Hammer Chestplate");
        translationBuilder.add(ModArmorItems.HAMMER_CRAFT_LEGGINGS,"Hammer Leggings");
        translationBuilder.add(ModArmorItems.HAMMER_CRAFT_BOOTS,"Hammer Boots");
        translationBuilder.add("itemGroup.mha.more_armor","HammerCraft|Armors");
    }
}
