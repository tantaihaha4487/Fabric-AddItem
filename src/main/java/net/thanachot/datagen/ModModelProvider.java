package net.thanachot.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.thanachot.additem.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.upload(ModItems.TEST_ITEM, Models.GENERATED);

        itemModelGenerator.upload(ModItems.SUPER_WOODEN_PICKAXE, Models.GENERATED);
        itemModelGenerator.upload(ModItems.SUPER_STONE_PICKAXE, Models.GENERATED);
        itemModelGenerator.upload(ModItems.SUPER_IRON_PICKAXE, Models.GENERATED);
        itemModelGenerator.upload(ModItems.SUPER_GOLDEN_PICKAXE, Models.GENERATED);
        itemModelGenerator.upload(ModItems.SUPER_DIAMOND_PICKAXE, Models.GENERATED);
        itemModelGenerator.upload(ModItems.SUPER_NETHERITE_PICKAXE, Models.GENERATED);
    }
}
