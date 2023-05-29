package net.opee.catnipmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.opee.catnipmod.CatnipMod;

public class ModItemGroup {
    public static final ItemGroup CATNIP = FabricItemGroupBuilder.build(
            new Identifier(CatnipMod.MOD_ID, "catnip"), () -> new ItemStack(ModItems.CATNIP));
}
