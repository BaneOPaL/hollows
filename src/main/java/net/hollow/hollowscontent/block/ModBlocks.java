package net.hollow.hollowscontent.block;

import net.hollow.hollowscontent.ExampleMod;
import net.hollow.hollowscontent.block.custom.SoundBlock;
import net.hollow.hollowscontent.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);

    public static final RegistryObject<org.openjdk.nashorn.internal.ir.Block> HOLLOWSTEEL_BLOCK = registerBlock("hollowsteel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> TEMPESTITE_ORE = registerBlock("tempestite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DEEPSLATE_TEMPESTITE_ORE = registerBlock("deepslate_tempestite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));






    public static final RegistryObject<org.openjdk.nashorn.internal.ir.Block> HOLLOWSTEEL_STAIRS = registerBlock("hollowsteel_stairs",
            () -> new StairBlock(() -> ModBlocks.HOLLOWSTEEL_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<org.openjdk.nashorn.internal.ir.Block> HOLLOWSTEEL_SLAB = registerBlock("hollowsteel_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<org.openjdk.nashorn.internal.ir.Block> HOLLOWSTEEL_BUTTON = registerBlock("hollowsteel_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.NETHERITE_BLOCK),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<org.openjdk.nashorn.internal.ir.Block> HOLLOWSTEEL_PRESSURE_PLATE = registerBlock("hollowsteel_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK),
                    BlockSetType.IRON));

    public static final RegistryObject<org.openjdk.nashorn.internal.ir.Block> HOLLOWSTEEL_FENCE = registerBlock("hollowsteel_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<org.openjdk.nashorn.internal.ir.Block> HOLLOWSTEEL_FENCE_GATE = registerBlock("hollowsteel_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));
    public static final RegistryObject<org.openjdk.nashorn.internal.ir.Block> HOLLOWSTEEL_WALL = registerBlock("hollowsteel_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<org.openjdk.nashorn.internal.ir.Block> HOLLOWSTEEL_DOOR = registerBlock("hollowsteel_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.IRON));
    public static final RegistryObject<org.openjdk.nashorn.internal.ir.Block> HOLLOWSTEEL_TRAPDOOR = registerBlock("hollowsteel_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.IRON));













    public static final RegistryObject<Block> SOUND_BLOCK = registerBlock("sound_block",
            () -> new SoundBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}