package com.meteor.model_1_15_2.tools;

import com.meteor.model_1_15_2.tabs.ModTabs;
import net.minecraft.item.ShovelItem;

import static com.meteor.model_1_15_2.tools.ModelIItemTier.I_ITEM_TIER;

public class ModelShovel extends ShovelItem {

    public ModelShovel() {
        super(I_ITEM_TIER, 200F, -3F, new Properties().group(ModTabs.modelTab));
    }

}
