package com.meteor.model_1_15_2.render_type;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModelRenderType extends Block {

    public ModelRenderType() {
        super(Properties.create(Material.GLASS)
                .hardnessAndResistance(0.5F)
                .lightValue(20)
                .notSolid());
    }

}
