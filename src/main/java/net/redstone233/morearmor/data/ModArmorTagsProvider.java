package net.redstone233.morearmor.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.redstone233.morearmor.items.ModArmorItems;

import java.util.concurrent.CompletableFuture;

public class ModArmorTagsProvider extends FabricTagProvider.ItemTagProvider {


    public ModArmorTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModArmorItems.HAMMER_CRAFT_HELMET)
                .add(ModArmorItems.HAMMER_CRAFT_CHESTPLATE)
                .add(ModArmorItems.HAMMER_CRAFT_LEGGINGS)
                .add(ModArmorItems.HAMMER_CRAFT_BOOTS);
    }
}
