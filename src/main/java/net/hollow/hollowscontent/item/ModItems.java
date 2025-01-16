package net.hollow.hollowscontent.item;

import net.hollow.hollowscontent.ExampleMod;
import net.hollow.hollowscontent.item.custom.FuelItem;
import net.hollow.hollowscontent.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    public static final RegistryObject<Item> HOLLOWSTEEL = ITEMS.register("hollowsteel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_HOLLOWSTEEL = ITEMS.register("raw_hollowsteel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COIN = ITEMS.register("coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIVING_FLESH = ITEMS.register("living_flesh",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEMPESTITE_GEM = ITEMS.register("tempestite_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(250)));
    public static final RegistryObject<Item> GASOLINE = ITEMS.register("gasoline",
            () -> new FuelItem(new Item.Properties(),3200));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}