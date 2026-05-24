package net.duhrstloescher.ccr;

import net.duhrstloescher.ccr.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CCRCrafts implements ModInitializer {
	public static final String MOD_ID = "ccr-crafts";
	
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		LOGGER.info("Penis!");
	}
}