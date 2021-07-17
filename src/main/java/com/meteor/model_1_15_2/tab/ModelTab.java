package com.meteor.model_1_15_2.tab;

import com.meteor.model_1_15_2.item.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModelTab extends ItemGroup {

    public ModelTab() {
        super("model_tab");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.modelItem.get());
    }

}
