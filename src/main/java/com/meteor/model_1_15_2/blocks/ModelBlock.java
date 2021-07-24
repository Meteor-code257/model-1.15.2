package com.meteor.model_1_15_2.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;

public class ModelBlock extends Block {

    private static final BooleanProperty STATE_FACE = BooleanProperty.create("face");

    public ModelBlock() {
        super(Properties.create(Material.IRON).hardnessAndResistance(100F));
        super.setDefaultState(super.getStateContainer().getBaseState().with(STATE_FACE, false));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(STATE_FACE);
        super.fillStateContainer(builder);
    }

}
