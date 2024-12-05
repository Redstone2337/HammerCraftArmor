package net.redstone233.morearmor.armors;

import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentModels;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;

import java.util.EnumMap;

public interface ModArmorMaterials {
    ArmorMaterial DEFAULT = new ArmorMaterial(39, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 8);
        map.put(EquipmentType.LEGGINGS, 7);
        map.put(EquipmentType.CHESTPLATE, 10);
        map.put(EquipmentType.HELMET, 4);
        map.put(EquipmentType.BODY, 12);
    }), 16, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.5F, 0.5F, ItemTags.REPAIRS_NETHERITE_ARMOR, EquipmentModels.NETHERITE);

    ArmorMaterial SLOWNESS = new ArmorMaterial(41, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 5);
        map.put(EquipmentType.LEGGINGS, 8);
        map.put(EquipmentType.CHESTPLATE, 10);
        map.put(EquipmentType.HELMET, 5);
        map.put(EquipmentType.BODY, 13);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.75F, 0.5F, ItemTags.REPAIRS_NETHERITE_ARMOR, EquipmentModels.NETHERITE);

    ArmorMaterial VAMPIRE = new ArmorMaterial(43, Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 4);
        map.put(EquipmentType.LEGGINGS, 8);
        map.put(EquipmentType.CHESTPLATE, 10);
        map.put(EquipmentType.HELMET, 6);
        map.put(EquipmentType.BODY, 21);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.8F, 0.5F, ItemTags.REPAIRS_NETHERITE_ARMOR, EquipmentModels.NETHERITE);

}
