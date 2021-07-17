package com.meteor.model_1_15_2.food;

import com.meteor.model_1_15_2.tab.ModTabs;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ModelFood extends Item {

    //if eat the food...
    private static final Food food = new Food.Builder()
            .saturation(10)
            .hunger(20)
            .effect(new EffectInstance(Effects.STRENGTH, 1800, 5), 1)
            .effect(new EffectInstance(Effects.HEALTH_BOOST, 1800, 5), 1)
            .build();

    public ModelFood() {
        super(new Properties().food(food).group(ModTabs.modelTab));
    }

}
