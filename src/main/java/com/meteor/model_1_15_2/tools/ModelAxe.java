package com.meteor.model_1_15_2.tools;

import com.meteor.model_1_15_2.tabs.ModTabs;
import net.minecraft.item.AxeItem;

import static com.meteor.model_1_15_2.tools.ModelIItemTier.I_ITEM_TIER;

public class ModelAxe extends AxeItem {

    public ModelAxe() {
        super(I_ITEM_TIER, 100100F, -3F, new Properties().group(ModTabs.modelTab));
    }

}
