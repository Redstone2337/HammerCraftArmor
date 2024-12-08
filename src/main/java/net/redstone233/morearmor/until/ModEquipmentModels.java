package net.redstone233.morearmor.until;

import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.util.Identifier;
import net.redstone233.morearmor.HammerCraftArmor;

import java.util.function.BiConsumer;


/**
 * @author Redstone233
 */
public final class ModEquipmentModels {

    public static final Identifier ID_HAMMER_DEFAULT = key("default");
    public static final Identifier ID_HAMMER_SLOWNESS = key("slowness");
    public static final Identifier ID_HAMMER_VAMPIRE = key("vampire");

    public static final EquipmentModel HAMMER_DEFAULT = humannoidModel(ID_HAMMER_DEFAULT);
    public static final EquipmentModel HAMMER_SLOWNESS = humannoidModel(ID_HAMMER_SLOWNESS);
    public static final EquipmentModel HAMMER_VAMPIRE = humannoidModel(ID_HAMMER_VAMPIRE);

    public static void bootstrap(BiConsumer<Identifier,EquipmentModel> consumer) {
        consumer.accept(ID_HAMMER_DEFAULT,HAMMER_DEFAULT);
        consumer.accept(ID_HAMMER_SLOWNESS,HAMMER_SLOWNESS);
        consumer.accept(ID_HAMMER_VAMPIRE,HAMMER_VAMPIRE);
    }

    private static EquipmentModel humannoidModel(Identifier textureId) {
        return EquipmentModel.builder().addHumanoidLayers(textureId).build();
    }

    private static Identifier key(String id) {
        return Identifier.of(HammerCraftArmor.MOD_ID,id);
    }
}
