package com.meteor.model_1_15_2.items;

import com.meteor.model_1_15_2.blocks.BlockRegistry;
import com.meteor.model_1_15_2.foods.*;
import com.meteor.model_1_15_2.tabs.ModTabs;
import com.meteor.model_1_15_2.tools.*;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS =
            new DeferredRegister<>(ForgeRegistries.ITEMS, "model_1_15_2");

    public static RegistryObject<Item> modelItem = ITEMS.register(
            "model_item", ModelItem::new);

    public static RegistryObject<Item> modelFood = ITEMS.register(
            "model_food", ModelFood::new);

    public static RegistryObject<Item> modelAxe = ITEMS.register(
            "model_axe", ModelAxe::new);
    public static RegistryObject<Item> modelHoe = ITEMS.register(
            "model_hoe", ModelHoe::new);
    public static RegistryObject<Item> modelPickaxe = ITEMS.register(
            "model_pickaxe", ModelPickaxe::new);
    public static RegistryObject<Item> modelShovel = ITEMS.register(
            "model_shovel", ModelShovel::new);
    public static RegistryObject<Item> modelSword = ITEMS.register(
            "model_sword", ModelSword::new);

    public static RegistryObject<Item> modelBlock = ITEMS.register(
            "model_block", () -> new BlockItem(BlockRegistry.modelBlock.get(),
                    new Item.Properties().group(ModTabs.modelTab)));
    public static RegistryObject<Item> modelRenderType = ITEMS.register(
            "model_render_type", () -> new BlockItem(BlockRegistry.modelRenderType.get(),
                    new Item.Properties().group(ModTabs.modelTab)));

}
