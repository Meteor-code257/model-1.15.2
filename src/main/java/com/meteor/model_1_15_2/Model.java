package com.meteor.model_1_15_2;

import com.meteor.model_1_15_2.items.ItemRegistry;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("model_1_15_2")
public class Model {

    public Model() {
        //add Items to mod bus
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
