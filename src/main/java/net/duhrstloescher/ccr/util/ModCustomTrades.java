package net.duhrstloescher.ccr.util;

import net.duhrstloescher.ccr.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class ModCustomTrades {
    public static void registerCustomTrades() {

        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 13),
                            new ItemStack(ModItems.PUFFER_TRIM_TEMPLATE, 1),
                            1, 67, 0.075f));
                });
    }
}
