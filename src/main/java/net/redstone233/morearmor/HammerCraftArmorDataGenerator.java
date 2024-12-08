package net.redstone233.morearmor;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.data.DataGenerator;
import net.redstone233.morearmor.data.*;

public class HammerCraftArmorDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelsProvider::new);
		pack.addProvider(ModEnglishLangProvider::new);
		pack.addProvider(ModRecipesProvider::new);
		pack.addProvider(ModArmorTagsProvider::new);

		DataGenerator.Pack secondaryPack = fabricDataGenerator.createPack();
		secondaryPack.addProvider(ModEquipmentModelProvider::new);
	}
}
