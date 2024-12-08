package net.redstone233.morearmor.items.armor;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.world.World;
import net.redstone233.morearmor.armors.ModArmorMaterials;
import net.redstone233.morearmor.items.ModArmorItems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SlownessArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, List<StatusEffectInstance>> MAP =
            (new ImmutableMap.Builder<ArmorMaterial,List<StatusEffectInstance>>())
                    .put(ModArmorMaterials.SLOWNESS,
                            Arrays.asList(
                                    new StatusEffectInstance(StatusEffects.GLOWING,100,1,false,false,true),
                                    new StatusEffectInstance(StatusEffects.JUMP_BOOST,100,4,false,false,false)
                            )).build();

    public SlownessArmorItem(ArmorMaterial material, EquipmentType type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient() && entity instanceof PlayerEntity player && hasFullSuitOfArmor(player)) {
            evaluateArmorEffects(player);
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<ArmorMaterial,List<StatusEffectInstance>> entry : MAP.entrySet()) {
            ArmorMaterial material = entry.getKey();
            List<StatusEffectInstance> effects = entry.getValue();
            if (hasCorrectArmorSet(player,material)) {
                for (StatusEffectInstance effect : effects) {
                    addStatusEffectMaterial(player, effect);
                }
            }
        }
    }

    private boolean hasCorrectArmorSet(PlayerEntity player, ArmorMaterial material) {
        for (ItemStack stack : player.getInventory().armor) {
            if (!(stack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }
        return isCustomArmor(player.getInventory().getArmorStack(3));
    }

    private void addStatusEffectMaterial(PlayerEntity player, StatusEffectInstance effect) {
        boolean hasEffect = player.hasStatusEffect(effect.getEffectType());

        if (!hasEffect) {
            player.addStatusEffect(new StatusEffectInstance(effect));
        }
    }

    private static boolean isCustomArmor(ItemStack stack) {
        if (stack.isEmpty()) {
            return false;
        }
        return stack.getItem() == ModArmorItems.HAMMER_CRAFT_HELMET || stack.getItem() == ModArmorItems.HAMMER_CRAFT_CHESTPLATE || stack.getItem() == ModArmorItems.HAMMER_CRAFT_LEGGINGS || stack.getItem() == ModArmorItems.HAMMER_CRAFT_BOOTS;
    }

    private boolean hasFullSuitOfArmor(PlayerEntity player) {
        ItemStack helmet = player.getInventory().getArmorStack(3);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack boots = player.getInventory().getArmorStack(0);

        return !helmet.isEmpty() && !chestplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty();
    }
}
