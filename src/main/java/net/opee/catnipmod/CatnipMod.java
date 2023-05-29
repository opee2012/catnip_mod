package net.opee.catnipmod;

import net.fabricmc.api.ModInitializer;
import net.opee.catnipmod.block.ModBlocks;
import net.opee.catnipmod.item.ModItems;
import net.opee.catnipmod.painting.ModPaintings;
import net.opee.catnipmod.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatnipMod implements ModInitializer {
	public static final String MOD_ID = "catnipmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModPaintings.registerPaintings();
		ModLootTableModifiers.modifyLootTables();
	}
}
