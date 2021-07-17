package com.meteor.model_1_15_2.tool;

import com.meteor.model_1_15_2.tab.ModTabs;
import net.minecraft.item.HoeItem;

import static com.meteor.model_1_15_2.tool.ModelIItemTier.I_ITEM_TIER;

public class ModelHoe extends HoeItem {

    public ModelHoe() {
        super(I_ITEM_TIER, 0, new Properties().group(ModTabs.modelTab));
    }

}
