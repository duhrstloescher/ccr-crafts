package net.duhrstloescher.ccr.datagen;

import net.duhrstloescher.ccr.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {


        getOrCreateTagBuilder(BlockTags.TERRACOTTA)
                .add(ModBlocks.BRIGHT_BLUE_TERRACOTTA)
                .add(ModBlocks.BRIGHT_LIGHT_BLUE_TERRACOTTA)
                .add(ModBlocks.BRIGHT_CYAN_TERRACOTTA)
                .add(ModBlocks.BRIGHT_BLACK_TERRACOTTA)
                .add(ModBlocks.BRIGHT_WHITE_TERRACOTTA)
                .add(ModBlocks.BRIGHT_LIGHT_GRAY_TERRACOTTA)
                .add(ModBlocks.BRIGHT_GRAY_TERRACOTTA)
                .add(ModBlocks.BRIGHT_BROWN_TERRACOTTA)
                .add(ModBlocks.BRIGHT_RED_TERRACOTTA)
                .add(ModBlocks.BRIGHT_ORANGE_TERRACOTTA)
                .add(ModBlocks.BRIGHT_YELLOW_TERRACOTTA)
                .add(ModBlocks.BRIGHT_GREEN_TERRACOTTA)
                .add(ModBlocks.BRIGHT_LIME_TERRACOTTA)
                .add(ModBlocks.BRIGHT_PINK_TERRACOTTA)
                .add(ModBlocks.BRIGHT_PURPLE_TERRACOTTA)
                .add(ModBlocks.BRIGHT_MAGENTA_TERRACOTTA);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(Blocks.COPPER_BLOCK);

    }
}
