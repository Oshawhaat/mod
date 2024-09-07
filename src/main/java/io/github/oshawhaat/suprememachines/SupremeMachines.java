package io.github.oshawhaat.suprememachines;

import io.github.oshawhaat.suprememachines.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SupremeMachines.MODID)
public class SupremeMachines {
    public static final String MODID = "suprememachines"; //all lowercase, no special symbols

    public SupremeMachines() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
    }
}
