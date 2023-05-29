package net.opee.catnipmod.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.opee.catnipmod.CatnipMod;
import net.opee.catnipmod.block.custom.CatnipCrop;

public class ModBlocks {

    public static final Block CATNIP_CROP = registerBlockWithoutItem("catnip_crop",
            new CatnipCrop(FabricBlockSettings.copy(Blocks.WHEAT)));

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(CatnipMod.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        CatnipMod.LOGGER.debug("Registering ModBlocks for " + CatnipMod.MOD_ID);
    }
}
