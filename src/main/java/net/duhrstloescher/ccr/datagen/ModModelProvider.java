package net.duhrstloescher.ccr.datagen;

import net.duhrstloescher.ccr.block.ModBlocks;
import net.duhrstloescher.ccr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_BLUE_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_LIGHT_BLUE_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_PINK_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_MAGENTA_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_PURPLE_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_LIGHT_GRAY_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_GRAY_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_WHITE_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_BLACK_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_LIME_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_GREEN_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_BROWN_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_ORANGE_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_RED_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_YELLOW_TERRACOTTA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRIGHT_CYAN_TERRACOTTA);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GOLDEN_NETHER_STAR, Models.GENERATED);

        itemModelGenerator.register(ModItems.PUFFER_TRIM_TEMPLATE, Models.GENERATED);
    }
}
