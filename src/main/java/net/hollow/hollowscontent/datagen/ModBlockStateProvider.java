package net.hollow.hollowscontent.datagen;

import net.hollow.hollowscontent.ExampleMod;
import net.hollow.hollowscontent.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ExampleMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.HOLLOWSTEEL_BLOCK);
        blockWithItem(ModBlocks.TEMPESTITE_ORE);

        blockWithItem(ModBlocks.DEEPSLATE_TEMPESTITE_ORE);

        blockWithItem(ModBlocks.SOUND_BLOCK);

        stairsBlock(((StairBlock) ModBlocks.HOLLOWSTEEL_STAIRS.get()), blockTexture(ModBlocks.HOLLOWSTEEL_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.HOLLOWSTEEL_SLAB.get()), blockTexture(ModBlocks.HOLLOWSTEEL_BLOCK.get()), blockTexture(ModBlocks.HOLLOWSTEEL_BLOCK.get()));

        buttonBlock(((ButtonBlock) ModBlocks.HOLLOWSTEEL_BUTTON.get()), blockTexture(ModBlocks.HOLLOWSTEEL_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.HOLLOWSTEEL_PRESSURE_PLATE.get()), blockTexture(ModBlocks.HOLLOWSTEEL_BLOCK.get()));

        fenceBlock(((FenceBlock) ModBlocks.HOLLOWSTEEL_FENCE.get()), blockTexture(ModBlocks.HOLLOWSTEEL_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.HOLLOWSTEEL_FENCE_GATE.get()), blockTexture(ModBlocks.HOLLOWSTEEL_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.HOLLOWSTEEL_WALL.get()), blockTexture(ModBlocks.HOLLOWSTEEL_BLOCK.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.HOLLOWSTEEL_DOOR.get()), modLoc("block/sapphire_door_bottom"), modLoc("block/sapphire_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.HOLLOWSTEEL_TRAPDOOR.get()), modLoc("block/sapphire_trapdoor"), true, "cutout");
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
