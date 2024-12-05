package net.redstone233.morearmor;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.redstone233.morearmor.data.ModEnglishLangProvider;
import net.redstone233.morearmor.data.ModModelsProvider;

public class HammerCraftArmorDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelsProvider::new);
		pack.addProvider(ModEnglishLangProvider::new);
		//pack.addProvider(ModENUSlangProvider::new);
	}
}
