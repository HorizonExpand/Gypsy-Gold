package net.horizonexpand.gypsy_gold;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("gypsy_gold")
public class GypsyGold {
    public static final String MOD_ID = "gypsy_gold";

    public GypsyGold() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}