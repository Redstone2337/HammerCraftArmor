package net.redstone233.morearmor.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.redstone233.morearmor.HammerCraftArmor;

public class ModArmorGroups {

    public static final RegistryKey<ItemGroup> MORE_ARMOR = register("more_armor");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(HammerCraftArmor.MOD_ID,id));
    }

    public static void registerModArmorItemGroup() {
        Registry.register(Registries.ITEM_GROUP,ModArmorGroups.MORE_ARMOR,
                ItemGroup.create(ItemGroup.Row.TOP,0)
                        .displayName(Text.translatable("itemGroup.mha.more_armor"))
                        .icon(() -> new ItemStack(ModArmorItems.HAMMER_CRAFT_HELMET)).entries((displayContext, entries) -> {
                            entries.add(ModArmorItems.HAMMER_CRAFT_HELMET);
                            entries.add(ModArmorItems.HAMMER_CRAFT_CHESTPLATE);
                            entries.add(ModArmorItems.HAMMER_CRAFT_LEGGINGS);
                            entries.add(ModArmorItems.HAMMER_CRAFT_BOOTS);
                            entries.add(ModArmorItems.HAMMER_CORE);
                        })
                        .build());
        HammerCraftArmor.LOGGER.info("注册"+HammerCraftArmor.MOD_ID+"的物品栏成功！");
    }
}
