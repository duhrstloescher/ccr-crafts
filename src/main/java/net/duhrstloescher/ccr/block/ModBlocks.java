package net.duhrstloescher.ccr.block;

import net.duhrstloescher.ccr.CCRCrafts;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BRIGHT_RED_TERRACOTTA = registerBlock("bright_red_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block BRIGHT_BLUE_TERRACOTTA = registerBlock("bright_blue_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BRIGHT_LIGHT_BLUE_TERRACOTTA = registerBlock("bright_light_blue_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BRIGHT_YELLOW_TERRACOTTA = registerBlock("bright_yellow_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BRIGHT_CYAN_TERRACOTTA = registerBlock("bright_cyan_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BRIGHT_GREEN_TERRACOTTA = registerBlock("bright_green_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BRIGHT_LIME_TERRACOTTA = registerBlock("bright_lime_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BRIGHT_GRAY_TERRACOTTA = registerBlock("bright_gray_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BRIGHT_PINK_TERRACOTTA = registerBlock("bright_pink_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BRIGHT_MAGENTA_TERRACOTTA = registerBlock("bright_magenta_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BRIGHT_PURPLE_TERRACOTTA = registerBlock("bright_purple_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BRIGHT_BLACK_TERRACOTTA = registerBlock("bright_black_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BRIGHT_WHITE_TERRACOTTA = registerBlock("bright_white_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BRIGHT_LIGHT_GRAY_TERRACOTTA = registerBlock("bright_light_gray_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BRIGHT_BROWN_TERRACOTTA = registerBlock("bright_brown_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BRIGHT_ORANGE_TERRACOTTA = registerBlock("bright_orange_terracotta",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));


    private static void addBlocksToBuildingBlocksTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.BRIGHT_BLUE_TERRACOTTA);
        entries.add(ModBlocks.BRIGHT_LIGHT_BLUE_TERRACOTTA);
        entries.add(ModBlocks.BRIGHT_CYAN_TERRACOTTA);
        entries.add(ModBlocks.BRIGHT_PINK_TERRACOTTA);
        entries.add(ModBlocks.BRIGHT_MAGENTA_TERRACOTTA);
        entries.add(ModBlocks.BRIGHT_PURPLE_TERRACOTTA);
        entries.add(ModBlocks.BRIGHT_WHITE_TERRACOTTA);
        entries.add(ModBlocks.BRIGHT_BLACK_TERRACOTTA);
        entries.add(ModBlocks.BRIGHT_BROWN_TERRACOTTA);
        entries.add(ModBlocks.BRIGHT_GRAY_TERRACOTTA);
        entries.add(ModBlocks.BRIGHT_LIGHT_GRAY_TERRACOTTA);
        entries.add(ModBlocks.BRIGHT_GREEN_TERRACOTTA);
        entries.add(ModBlocks.BRIGHT_LIME_TERRACOTTA);
        entries.add(ModBlocks.BRIGHT_RED_TERRACOTTA);
        entries.add(ModBlocks.BRIGHT_ORANGE_TERRACOTTA);
        entries.add(ModBlocks.BRIGHT_YELLOW_TERRACOTTA);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CCRCrafts.MOD_ID, name), block);
    }

    private static BlockItem registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CCRCrafts.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CCRCrafts.LOGGER.info("Registering Mod Blocks for " + CCRCrafts.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addBlocksToBuildingBlocksTabItemGroup);
    }
}
