package com.meteor.model_1_15_2.tool;

import com.meteor.model_1_15_2.tab.ModTabs;
import net.minecraft.item.SwordItem;

import static com.meteor.model_1_15_2.tool.ModelIItemTier.I_ITEM_TIER;

public class ModelSword extends SwordItem {

    public ModelSword() {
        super(I_ITEM_TIER, (int) 1e+5, -2.4F, new Properties().group(ModTabs.modelTab));
    }

}
