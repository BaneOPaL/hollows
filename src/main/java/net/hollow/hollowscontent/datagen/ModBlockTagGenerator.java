package net.hollow.hollowscontent.datagen;

import net.hollow.hollowscontent.ExampleMod;
import net.hollow.hollowscontent.block.ModBlocks;
import net.hollow.hollowscontent.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ExampleMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.TEMPESTITE_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.HOLLOWSTEEL_BLOCK.get(),
                        ModBlocks.TEMPESTITE_ORE.get(),
                        ModBlocks.DEEPSLATE_TEMPESTITE_ORE.get(),

                        ModBlocks.SOUND_BLOCK.get());


        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.HOLLOWSTEEL_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TEMPESTITE_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_TEMPESTITE_ORE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SOUND_BLOCK.get());





        this.tag(BlockTags.FENCES)
                .add(ModBlocks.HOLLOWSTEEL_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.HOLLOWSTEEL_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.HOLLOWSTEEL_WALL.get());


    }
}