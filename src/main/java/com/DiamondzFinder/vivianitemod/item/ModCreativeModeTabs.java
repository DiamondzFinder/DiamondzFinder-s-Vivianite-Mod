package com.DiamondzFinder.vivianitemod.item;

import com.DiamondzFinder.vivianitemod.VivianiteMod;
import com.DiamondzFinder.vivianitemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VivianiteMod.MOD_ID);

    public static final Supplier<CreativeModeTab> VIVIANITE_ITEMS_TAB = CREATIVE_MODE_TAB.register( "vivianite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VIVIANITE.get()))
                    .title(Component.translatable("creativetab.vivianitemod.vivianite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                            output.accept(ModItems.VIVIANITE);


                    }).build());
    public static final Supplier<CreativeModeTab> VIVIANITE_BLOCK_TAB = CREATIVE_MODE_TAB.register( "vivianite_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.VIVIANITE_ORE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(VivianiteMod.MOD_ID,  "vivianite_items_tab"))
                    .title(Component.translatable("creativetab.vivianitemod.vivianite_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                            output.accept(ModBlocks.VIVIANITE_ORE);


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }


}
