package com.meteor.model_1_15_2.tool;

import com.meteor.model_1_15_2.tab.ModTabs;
import net.minecraft.item.AxeItem;

import static com.meteor.model_1_15_2.tool.ModelIItemTier.I_ITEM_TIER;

public class ModelAxe extends AxeItem {

    public ModelAxe() {
        super(I_ITEM_TIER, 100100F, -3F, new Properties().group(ModTabs.modelTab));
    }

}
