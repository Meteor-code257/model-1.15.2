package com.meteor.model_1_15_2.item;

import com.meteor.model_1_15_2.tab.ModTabs;
import net.minecraft.item.Item;

public class ModelItem extends Item {

    public ModelItem() {
        //add to model tab
        super(new Properties().group(ModTabs.modelTab));
    }

}
