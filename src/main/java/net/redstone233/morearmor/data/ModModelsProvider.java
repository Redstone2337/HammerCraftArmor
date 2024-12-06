package net.redstone233.morearmor.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.util.Identifier;
import net.redstone233.morearmor.HammerCraftArmor;
import net.redstone233.morearmor.items.ModArmorItems;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModArmorItems.HAMMER_CORE, Models.GENERATED);
//        itemModelGenerator.registerArmor(ModArmorItems.HAMMER_CRAFT_HELMET, EquipmentModels.NETHERITE, EquipmentModel.builder().addLayers(EquipmentModel.LayerType.HUMANOID).build(), EquipmentSlot.HEAD);
//        itemModelGenerator.registerArmor(ModArmorItems.HAMMER_CRAFT_CHESTPLATE, EquipmentModels.NETHERITE, EquipmentModel.builder().addLayers(EquipmentModel.LayerType.HUMANOID).build(), EquipmentSlot.CHEST);
//        itemModelGenerator.registerArmor(ModArmorItems.HAMMER_CRAFT_LEGGINGS, EquipmentModels.NETHERITE, EquipmentModel.builder().addLayers(EquipmentModel.LayerType.HUMANOID).build(), EquipmentSlot.LEGS);
//        itemModelGenerator.registerArmor(ModArmorItems.HAMMER_CRAFT_BOOTS, EquipmentModels.NETHERITE, EquipmentModel.builder().addLayers(EquipmentModel.LayerType.HUMANOID).build(), EquipmentSlot.FEET);
        itemModelGenerator.registerArmor(ModArmorItems.HAMMER_CRAFT_HELMET, Identifier.of("hammer_helmet"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(HammerCraftArmor.MOD_ID,"default"),false).addLayers(EquipmentModel.LayerType.HUMANOID).build(),EquipmentSlot.HEAD);
        itemModelGenerator.registerArmor(ModArmorItems.HAMMER_CRAFT_CHESTPLATE, Identifier.of("hammer_chestplate"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(HammerCraftArmor.MOD_ID,"default"),false).addLayers(EquipmentModel.LayerType.HUMANOID).build(),EquipmentSlot.CHEST);
        itemModelGenerator.registerArmor(ModArmorItems.HAMMER_CRAFT_LEGGINGS, Identifier.of("hammer_leggings"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(HammerCraftArmor.MOD_ID,"default"),false).addLayers(EquipmentModel.LayerType.HUMANOID_LEGGINGS).build(),EquipmentSlot.LEGS);
        itemModelGenerator.registerArmor(ModArmorItems.HAMMER_CRAFT_BOOTS, Identifier.of("hammer_boots"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(HammerCraftArmor.MOD_ID,"default"),false).addLayers(EquipmentModel.LayerType.HUMANOID).build(),EquipmentSlot.FEET);
    }
}
