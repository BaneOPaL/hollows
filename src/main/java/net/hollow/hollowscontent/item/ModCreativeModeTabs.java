package net.hollow.hollowscontent.item;

import net.hollow.hollowscontent.ExampleMod;
import net.hollow.hollowscontent.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COIN.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {


                        pOutput.accept(ModItems.HOLLOWSTEEL.get());
                        pOutput.accept(ModItems.RAW_HOLLOWSTEEL.get());
                        pOutput.accept(ModItems.COIN.get());





                        pOutput.accept(ModItems.TEMPESTITE_GEM.get());
                        pOutput.accept(ModBlocks.TEMPESTITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_TEMPESTITE_ORE.get());



                        pOutput.accept(ModItems.LIVING_FLESH.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());
                        pOutput.accept(ModItems.GASOLINE.get());














                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}