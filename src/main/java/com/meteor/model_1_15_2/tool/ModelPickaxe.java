package com.meteor.model_1_15_2.tool;

import com.meteor.model_1_15_2.tab.ModTabs;
import net.minecraft.item.PickaxeItem;

import static com.meteor.model_1_15_2.tool.ModelIItemTier.I_ITEM_TIER;

public class ModelPickaxe extends PickaxeItem {

    public ModelPickaxe() {
        super(I_ITEM_TIER, 100, -2.8F, new Properties().group(ModTabs.modelTab));
    }

}
