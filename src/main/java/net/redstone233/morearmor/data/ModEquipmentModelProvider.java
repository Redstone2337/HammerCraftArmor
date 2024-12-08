package net.redstone233.morearmor.data;

import net.minecraft.data.DataOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;
import net.minecraft.data.client.EquipmentModelProvider;
import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.util.Identifier;
import net.redstone233.morearmor.until.ModEquipmentModels;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModEquipmentModelProvider extends EquipmentModelProvider {

    private final DataOutput.PathResolver pathResolver;

    public ModEquipmentModelProvider(DataOutput output) {
        super(output);
        this.pathResolver = output.getResolver(DataOutput.OutputType.RESOURCE_PACK, "models/equipment");;
    }

    @Override
    public CompletableFuture<?> run(DataWriter writer) {
        Map<Identifier, EquipmentModel> map = new HashMap();
        ModEquipmentModels.bootstrap((id, model) -> {
            if (map.putIfAbsent(id, model) != null) {
                throw new IllegalStateException("Tried to register equipment model twice for id: " + String.valueOf(id));
            }
        });
        return DataProvider.writeAllToPath(writer, EquipmentModel.CODEC, this.pathResolver, map);
    }

    public String getName() {
        return "Equipment Model Definitions";
    }
}
