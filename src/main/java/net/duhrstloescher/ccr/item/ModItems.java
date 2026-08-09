package net.duhrstloescher.ccr.item;

import net.duhrstloescher.ccr.CCRCrafts;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item GOLDEN_NETHER_STAR = registerItem("golden_nether_star",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item PUFFER_TRIM_TEMPLATE = registerItem("puffer_armor_trim_smithing_template",
            SmithingTemplateItem.of(new Identifier("ccr-crafts", "puffer")));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.GOLDEN_NETHER_STAR);
        entries.add(ModItems.PUFFER_TRIM_TEMPLATE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CCRCrafts.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CCRCrafts.LOGGER.info("Registering Mod Items for " + CCRCrafts.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
