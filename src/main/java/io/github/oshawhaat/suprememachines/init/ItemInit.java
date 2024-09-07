package io.github.oshawhaat.suprememachines.init;

import io.github.oshawhaat.suprememachines.SupremeMachines;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SupremeMachines.MODID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
        () -> new Item( new Item.Properties()
            .stacksTo(15)
            .food(new FoodProperties.Builder()
                .nutrition(5)
                .saturationMod(5)
            .build())
        ));
}
