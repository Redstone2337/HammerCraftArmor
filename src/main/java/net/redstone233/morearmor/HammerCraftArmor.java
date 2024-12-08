package net.redstone233.morearmor;

import net.fabricmc.api.ModInitializer;

import net.redstone233.morearmor.events.CustomArmorEffect;
import net.redstone233.morearmor.items.ModArmorGroups;
import net.redstone233.morearmor.items.ModArmorItems;
import net.redstone233.morearmor.tags.enchantment.ArmorTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HammerCraftArmor implements ModInitializer {
	public static final String MOD_ID = "hca";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
        ModArmorItems.registerArmorItems();
        ModArmorGroups.registerModArmorItemGroup();
		ArmorTags.registerArmorTags();
//		CustomArmorEffect.init();
		LOGGER.info("Hello Fabric world!");
	}
}