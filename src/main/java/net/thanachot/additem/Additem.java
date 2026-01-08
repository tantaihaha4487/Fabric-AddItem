package net.thanachot.additem;

import net.fabricmc.api.ModInitializer;
import net.thanachot.additem.item.ModItems;

public class Additem implements ModInitializer {

    public static final String MOD_ID = "additem";

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
