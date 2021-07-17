package com.meteor.model_1_15_2.items;

import com.meteor.model_1_15_2.tools.*;
import com.meteor.model_1_15_2.foods.*;

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
    public static RegistryObject<Item> modelSword = ITEMS.register(
            "model_sword", ModelSword::new);
    public static RegistryObject<Item> modelAxe = ITEMS.register(
            "model_axe", ModelAxe::new);
    public static RegistryObject<Item> modelHoe = ITEMS.register(
            "model_hoe", ModelHoe::new);
    public static RegistryObject<Item> modelPickaxe = ITEMS.register(
            "model_pickaxe", ModelPickaxe::new);
    public static RegistryObject<Item> modelShovel = ITEMS.register(
            "model_sword", ModelShovel::new);

}
