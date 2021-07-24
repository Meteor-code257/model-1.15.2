package com.meteor.model_1_15_2.tools;

import com.meteor.model_1_15_2.tabs.ModTabs;
import net.minecraft.item.SwordItem;

import static com.meteor.model_1_15_2.tools.ModelIItemTier.I_ITEM_TIER;

public class ModelSword extends SwordItem {

    public ModelSword() {
        super(I_ITEM_TIER, (int) 1e+5, -2.4F, new Properties().group(ModTabs.modelTab));
    }

}
