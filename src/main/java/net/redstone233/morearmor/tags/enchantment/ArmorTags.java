package net.redstone233.morearmor.tags.enchantment;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.redstone233.morearmor.HammerCraftArmor;

public class ArmorTags {

    public static final TagKey<Item> DEFAULT_ARMOR = of("default_armor");
    public static final TagKey<Item> SLOWNESS_ARMOR = of("slowness_armor");
    public static final TagKey<Item> VAMPIRE_ARMOR = of("vampire_armor");

    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(HammerCraftArmor.MOD_ID,id));
    }

    public static void registerArmorTags() {
        HammerCraftArmor.LOGGER.info("注册"+HammerCraftArmor.MOD_ID+"的标签成功！");
    }
}
