package net.duhrstloescher.ccr.datagen;

import net.duhrstloescher.ccr.datagen.provider.PaintingTagProvider;
import net.duhrstloescher.ccr.painting.ModPaintings;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.PaintingVariantTags;

import java.util.concurrent.CompletableFuture;

public class ModPaintingVariantGenerator extends PaintingTagProvider {
        public ModPaintingVariantGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            super(output, completableFuture);
        }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(PaintingVariantTags.PLACEABLE)
                .add(ModPaintings.VICTORY)
                .add(ModPaintings.LOGO);
    }
}
