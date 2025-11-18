package com.DiamondzFinder.vivianitemod.item;

import com.DiamondzFinder.vivianitemod.VivianiteMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(VivianiteMod.MOD_ID);

    public static final DeferredItem<Item> VIVIANITE = ITEMS.register("vivianite",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)  {
        ITEMS.register(eventBus);
    }
}
