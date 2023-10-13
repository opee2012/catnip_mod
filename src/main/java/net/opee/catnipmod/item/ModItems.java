package net.opee.catnipmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.opee.catnipmod.CatnipMod;
import net.opee.catnipmod.block.ModBlocks;

public class ModItems {
    public static final Item CATNIP_SEEDS = registerItem("catnip_seeds",
            new AliasedBlockItem(ModBlocks.CATNIP_CROP,
                    new FabricItemSettings()));

    public static final Item CATNIP = registerItem("catnip",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CatnipMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroups() {
        addToItemGroups(ItemGroups.INGREDIENTS, CATNIP);

        addToItemGroups(ModItemGroup.CATNIP, CATNIP);
        addToItemGroups(ModItemGroup.CATNIP, CATNIP_SEEDS);
    }

    public static void addToItemGroups(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        CatnipMod.LOGGER.debug("Registering Mod Items for " + CatnipMod.MOD_ID);
        addItemsToItemGroups();
    }
}
