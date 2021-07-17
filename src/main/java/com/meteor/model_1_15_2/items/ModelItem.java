package com.meteor.model_1_15_2.items;

import com.meteor.model_1_15_2.tabs.ModTabs;
import net.minecraft.item.Item;

public class ModelItem extends Item {

    public ModelItem() {
        //add to model tab
        super(new Properties().group(ModTabs.modelTab));
    }

}
