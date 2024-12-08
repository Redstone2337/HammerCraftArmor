package net.redstone233.morearmor.events;

import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.redstone233.morearmor.items.ModArmorItems;

public class CustomArmorEffect {

    public static void init() {
        UseEntityCallback.EVENT.register((playerEntity, world, hand, entity, entityHitResult) -> {
            if (isFullCustomArmor(playerEntity)) {
                giveEffects(playerEntity);
            } else {
                removeEffects(playerEntity);
            }
            return ActionResult.PASS;
        });
    }

    private static void removeEffects(PlayerEntity playerEntity) {
        playerEntity.removeStatusEffect(StatusEffects.FIRE_RESISTANCE);
        playerEntity.removeStatusEffect(StatusEffects.GLOWING);
        playerEntity.removeStatusEffect(StatusEffects.SPEED);
    }

    private static void giveEffects(PlayerEntity playerEntity) {
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,100,2,false,false,true));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING,100,1,false,false,true));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,2,false,false,true));

    }

    private static boolean isFullCustomArmor(PlayerEntity playerEntity) {
        return playerEntity.getInventory().getArmorStack(3).getItem() == ModArmorItems.HAMMER_CRAFT_HELMET &&
                playerEntity.getInventory().getArmorStack(2).getItem() == ModArmorItems.HAMMER_CRAFT_CHESTPLATE &&
                playerEntity.getInventory().getArmorStack(1).getItem() == ModArmorItems.HAMMER_CRAFT_LEGGINGS &&
        playerEntity.getInventory().getArmorStack(2).getItem() == ModArmorItems.HAMMER_CRAFT_BOOTS;
    }
}
