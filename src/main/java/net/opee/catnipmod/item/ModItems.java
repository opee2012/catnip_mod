package net.opee.catnipmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.opee.catnipmod.CatnipMod;
import net.opee.catnipmod.block.ModBlocks;

public class ModItems {
    public static final Item CATNIP_SEEDS = registerItem("catnip_seeds",
            new AliasedBlockItem(ModBlocks.CATNIP_CROP,
                    new FabricItemSettings().group(ModItemGroup.CATNIP)));

    public static final Item CATNIP = registerItem("catnip",
            new Item(new FabricItemSettings().group(ModItemGroup.CATNIP)
                    .food(new FoodComponent.Builder()
                    .hunger(0)
                    .saturationModifier(0f)
                    .snack()
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 130), 1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400), 1.0f)
                    .build())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CatnipMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CatnipMod.LOGGER.debug("Registering Mod Items for " + CatnipMod.MOD_ID);
    }
}
