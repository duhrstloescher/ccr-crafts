package net.duhrstloescher.ccr;

import net.duhrstloescher.ccr.datagen.ModBlockTagProvider;
import net.duhrstloescher.ccr.datagen.ModItemTagProvider;
import net.duhrstloescher.ccr.datagen.ModLootTableProvider;
import net.duhrstloescher.ccr.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CCRCraftsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModLootTableProvider::new);
	}
}
