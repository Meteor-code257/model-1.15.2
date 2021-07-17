package com.meteor.model_1_15_2.tools;

import com.meteor.model_1_15_2.tabs.ModTabs;
import net.minecraft.item.PickaxeItem;

import static com.meteor.model_1_15_2.tools.ModelIItemTier.I_ITEM_TIER;

public class ModelPickaxe extends PickaxeItem {

    public ModelPickaxe() {
        super(I_ITEM_TIER, 100, -2.8F, new Properties().group(ModTabs.modelTab));
    }

}
