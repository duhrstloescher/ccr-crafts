package net.duhrstloescher.ccr;

import net.duhrstloescher.ccr.block.ModBlocks;
import net.duhrstloescher.ccr.item.ModItemGroups;
import net.duhrstloescher.ccr.item.ModItems;
import net.duhrstloescher.ccr.painting.ModPaintings;
import net.duhrstloescher.ccr.util.ModCustomTrades;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CCRCrafts implements ModInitializer {
	public static final String MOD_ID = "ccr-crafts";
	
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

		ModPaintings.registerModPaintings();

		ModCustomTrades.registerCustomTrades();

		LOGGER.info("Penis!");
	}
}