package net.duhrstloescher.ccr.painting;

import net.duhrstloescher.ccr.CCRCrafts;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPaintings {

    public static final PaintingVariant VICTORY = registerPainting("victory", new PaintingVariant(64, 48));
    public static final PaintingVariant LOGO = registerPainting("ccr_logo", new PaintingVariant(64, 32));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(CCRCrafts.MOD_ID, name), paintingVariant);
    }

    public static void registerModPaintings() {
        CCRCrafts.LOGGER.info("Registering flippin Paintings for " + CCRCrafts.MOD_ID);
    }
}
