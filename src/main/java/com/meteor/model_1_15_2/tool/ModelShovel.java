package com.meteor.model_1_15_2.tool;

import com.meteor.model_1_15_2.tab.ModTabs;
import net.minecraft.item.ShovelItem;

import static com.meteor.model_1_15_2.tool.ModelIItemTier.I_ITEM_TIER;

public class ModelShovel extends ShovelItem {

    public ModelShovel() {
        super(I_ITEM_TIER, 200F, -3F, new Properties().group(ModTabs.modelTab));
    }

}
