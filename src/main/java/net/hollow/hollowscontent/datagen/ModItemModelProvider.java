package net.hollow.hollowscontent.datagen;

import net.hollow.hollowscontent.ExampleMod;
import net.hollow.hollowscontent.block.ModBlocks;
import net.hollow.hollowscontent.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.openjdk.nashorn.internal.ir.Block;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ExampleMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.LIVING_FLESH);
        simpleItem(ModItems.TEMPESTITE_GEM);
        simpleItem(ModItems.COIN);
        simpleItem(ModItems.RAW_HOLLOWSTEEL);
        simpleItem(ModItems.HOLLOWSTEEL);


        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.GASOLINE);

        simpleBlockItem(ModBlocks.HOLLOWSTEEL_DOOR);

        fenceItem(ModBlocks.HOLLOWSTEEL_FENCE, ModBlocks.HOLLOWSTEEL_BLOCK);
        buttonItem(ModBlocks.HOLLOWSTEEL_BUTTON, ModBlocks.HOLLOWSTEEL_BLOCK);
        wallItem(ModBlocks.HOLLOWSTEEL_WALL, ModBlocks.HOLLOWSTEEL_BLOCK);

        evenSimplerBlockItem(ModBlocks.HOLLOWSTEEL_STAIRS);
        evenSimplerBlockItem(ModBlocks.HOLLOWSTEEL_SLAB);
        evenSimplerBlockItem(ModBlocks.HOLLOWSTEEL_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.HOLLOWSTEEL_FENCE_GATE);

        trapdoorItem(ModBlocks.HOLLOWSTEEL_TRAPDOOR);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ExampleMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(ExampleMod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(ExampleMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(ExampleMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(ExampleMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ExampleMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}