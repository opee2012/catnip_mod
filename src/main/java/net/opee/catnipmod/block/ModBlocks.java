package net.opee.catnipmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.opee.catnipmod.CatnipMod;
import net.opee.catnipmod.block.custom.CatnipCrop;

public class ModBlocks {

    public static final Block CATNIP_CROP = registerBlockWithoutItem("catnip_crop",
            new CatnipCrop(FabricBlockSettings.copy(Blocks.WHEAT)));

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(CatnipMod.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        CatnipMod.LOGGER.debug("Registering ModBlocks for " + CatnipMod.MOD_ID);
    }
}
