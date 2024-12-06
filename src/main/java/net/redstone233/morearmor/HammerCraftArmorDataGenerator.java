package net.redstone233.morearmor;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.redstone233.morearmor.data.ModEnglishLangProvider;
import net.redstone233.morearmor.data.ModModelsProvider;
import net.redstone233.morearmor.data.ModRecipesProvider;

public class HammerCraftArmorDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelsProvider::new);
		pack.addProvider(ModEnglishLangProvider::new);
		pack.addProvider(ModRecipesProvider::new);
		//pack.addProvider(ModENUSlangProvider::new);
	}
}
