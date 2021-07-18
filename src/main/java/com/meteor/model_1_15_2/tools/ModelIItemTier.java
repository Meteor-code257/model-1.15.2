package com.meteor.model_1_15_2.tools;

import com.meteor.model_1_15_2.items.ItemRegistry;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class ModelIItemTier {

    public static final IItemTier I_ITEM_TIER = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 3000;
        }

        @Override
        public float getEfficiency() { return 100F; }

        @Override
        public float getAttackDamage() {
            return (float) 100;
        }

        @Override
        public int getHarvestLevel() {
            return 3;
        }

        @Override
        public int getEnchantability() {
            return 30;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(ItemRegistry.modelItem.get());
        }
    };

}
