package net.duhrstloescher.ccr.datagen;

import net.duhrstloescher.ccr.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.BRIGHT_CYAN_TERRACOTTA);
        addDrop(ModBlocks.BRIGHT_BLUE_TERRACOTTA);
        addDrop(ModBlocks.BRIGHT_LIGHT_BLUE_TERRACOTTA);
        addDrop(ModBlocks.BRIGHT_GREEN_TERRACOTTA);
        addDrop(ModBlocks.BRIGHT_LIME_TERRACOTTA);
        addDrop(ModBlocks.BRIGHT_PURPLE_TERRACOTTA);
        addDrop(ModBlocks.BRIGHT_MAGENTA_TERRACOTTA);
        addDrop(ModBlocks.BRIGHT_PINK_TERRACOTTA);
        addDrop(ModBlocks.BRIGHT_RED_TERRACOTTA);
        addDrop(ModBlocks.BRIGHT_ORANGE_TERRACOTTA);
        addDrop(ModBlocks.BRIGHT_YELLOW_TERRACOTTA);
        addDrop(ModBlocks.BRIGHT_GRAY_TERRACOTTA);
        addDrop(ModBlocks.BRIGHT_WHITE_TERRACOTTA);
        addDrop(ModBlocks.BRIGHT_LIGHT_GRAY_TERRACOTTA);
        addDrop(ModBlocks.BRIGHT_BLACK_TERRACOTTA);
        addDrop(ModBlocks.BRIGHT_BROWN_TERRACOTTA);
    }
}
