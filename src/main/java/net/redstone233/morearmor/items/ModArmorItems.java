package net.redstone233.morearmor.items;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.redstone233.morearmor.HammerCraftArmor;
import net.redstone233.morearmor.armors.ModArmorMaterials;

import java.util.function.Function;

public class ModArmorItems {

    public static final Item HAMMER_CRAFT_HELMET = register("hammer_helmet",
            (settings) -> new ArmorItem(ModArmorMaterials.DEFAULT, EquipmentType.HELMET,
                    settings.maxDamage(EquipmentType.HELMET.getMaxDamage(4000))
            ));

    public static final Item HAMMER_CRAFT_CHESTPLATE = register("hammer_chestplate",
            (settings) -> new ArmorItem(ModArmorMaterials.DEFAULT, EquipmentType.CHESTPLATE,
                    settings.maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(4000))
            ));

    public static final Item HAMMER_CRAFT_LEGGINGS = register("hammer_leggings",
            (settings) -> new ArmorItem(ModArmorMaterials.DEFAULT,EquipmentType.LEGGINGS,
                    settings.maxDamage(EquipmentType.LEGGINGS.getMaxDamage(4000))
                    ));

    public static final Item HAMMER_CRAFT_BOOTS = register("hammer_boots",
            (settings) -> new ArmorItem(ModArmorMaterials.DEFAULT,EquipmentType.BOOTS,
                    settings.maxDamage(EquipmentType.BOOTS.getMaxDamage(4000))
            ));

    public static final Item HAMMER_CORE = register("hammer_core",Item::new,new Item.Settings().maxCount(64));

    private static Item register(String id, Function<Item.Settings,Item> factory,Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HammerCraftArmor.MOD_ID,id));
        return Items.register(registryKey,factory,settings);
    }

    private static Item register(String id, Function<Item.Settings,Item> factory) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HammerCraftArmor.MOD_ID,id));
        return Items.register(registryKey,factory,new Item.Settings());
    }

    public static void registerArmorItems() {
        HammerCraftArmor.LOGGER.info("注册"+HammerCraftArmor.MOD_ID+"的装备成功！");
    }
}
