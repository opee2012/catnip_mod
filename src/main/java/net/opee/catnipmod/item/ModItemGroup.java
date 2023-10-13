package net.opee.catnipmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.opee.catnipmod.CatnipMod;

public class ModItemGroup {
    public static ItemGroup CATNIP;

    public static void registerItemGroup() {
        CATNIP = FabricItemGroup.builder(new Identifier(CatnipMod.MOD_ID, "catnip"))
                .displayName(Text.literal("Catnip Item Group"))
                .icon(() -> new ItemStack(ModItems.CATNIP)).build();
    }
}
