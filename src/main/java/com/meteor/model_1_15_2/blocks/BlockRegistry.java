package com.meteor.model_1_15_2.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS =
            new DeferredRegister<>(ForgeRegistries.BLOCKS, "model_1_15_2");

    public static RegistryObject<Block> modelBlock = BLOCKS.register(
            "model_block", ModelBlock::new);

}
