package com.makson.datagen.tag;

import com.makson.ModEnchantments;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.world.item.enchantment.Enchantment;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class HappyGhastOverdriveTagProvider extends FabricTagsProvider<Enchantment> {
    public HappyGhastOverdriveTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, Registries.ENCHANTMENT, registriesFuture);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider provider) {
        builder(EnchantmentTags.TREASURE).add(ModEnchantments.AERIAL_SWIFTNESS);
        builder(EnchantmentTags.ON_RANDOM_LOOT).add(ModEnchantments.AERIAL_SWIFTNESS);
    }
}
