package net.thanachot.additem.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TEST_ITEM = registerItem("test_item", new Item(new Item.Settings().registryKey(createKey("test_item"))));

    // Super Pickaxe Items - just basic items for now, with vanilla pickaxe texture
    // references
    public static final Item SUPER_WOODEN_PICKAXE = registerItem("super_wooden_pickaxe",
            new Item(new Item.Settings().registryKey(createKey("super_wooden_pickaxe")).maxDamage(59)));

    public static final Item SUPER_STONE_PICKAXE = registerItem("super_stone_pickaxe",
            new Item(new Item.Settings().registryKey(createKey("super_stone_pickaxe")).maxDamage(131)));

    public static final Item SUPER_IRON_PICKAXE = registerItem("super_iron_pickaxe",
            new Item(new Item.Settings().registryKey(createKey("super_iron_pickaxe")).maxDamage(250)));

    public static final Item SUPER_GOLDEN_PICKAXE = registerItem("super_golden_pickaxe",
            new Item(new Item.Settings().registryKey(createKey("super_golden_pickaxe")).maxDamage(32)));

    public static final Item SUPER_DIAMOND_PICKAXE = registerItem("super_diamond_pickaxe",
            new Item(new Item.Settings().registryKey(createKey("super_diamond_pickaxe")).maxDamage(1561)));

    public static final Item SUPER_NETHERITE_PICKAXE = registerItem("super_netherite_pickaxe",
            new Item(
                    new Item.Settings().registryKey(createKey("super_netherite_pickaxe")).maxDamage(2031).fireproof()));

    private static RegistryKey<Item> createKey(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of("additem", name));
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of("additem", name), item);
    }

    public static void registerModItems() {
        // Add items to the Tools item group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(SUPER_WOODEN_PICKAXE);
            entries.add(SUPER_STONE_PICKAXE);
            entries.add(SUPER_IRON_PICKAXE);
            entries.add(SUPER_GOLDEN_PICKAXE);
            entries.add(SUPER_DIAMOND_PICKAXE);
            entries.add(SUPER_NETHERITE_PICKAXE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(TEST_ITEM);
        });
    }
}
