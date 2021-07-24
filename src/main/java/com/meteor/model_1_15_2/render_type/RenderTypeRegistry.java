package com.meteor.model_1_15_2.render_type;

import com.meteor.model_1_15_2.blocks.BlockRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RenderTypeRegistry {

    @SubscribeEvent
    public static void onRenderTypeSetup(FMLClientSetupEvent event) {
        //set translucent
        RenderTypeLookup.setRenderLayer(BlockRegistry.modelRenderType.get(), RenderType.getTranslucent());
    }

}
