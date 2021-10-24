package net.ram3n.deepcrops.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.ram3n.deepcrops.DeepCrops;
import net.ram3n.deepcrops.block.ModBlocks;
import net.ram3n.deepcrops.item.DeepCropsItemGroup;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, DeepCrops.MOD_ID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> stoneflax = ITEMS.register
            ("stoneflax", () -> new Item(new Item.Properties().group(DeepCropsItemGroup.DEEPCROPS_ITEMS)));

    public static final RegistryObject<Item> stoneflax_seeds = ITEMS.register
            ("stoneflax_seeds", () -> new Item(new Item.Properties().group(DeepCropsItemGroup.DEEPCROPS_ITEMS)));

    public static final RegistryObject<Item> cooked_plump_helmet = ITEMS.register
            ("cooked_plump_helmet", ()-> new Item(new Item.Properties().group(DeepCropsItemGroup.DEEPCROPS_ITEMS).food(new Food.Builder().hunger(4).saturation(4f).build())));

    public static final RegistryObject<Item> plump_helmet = ITEMS.register("plump_helmet",
            () -> new Item(new Item.Properties().group(DeepCropsItemGroup.DEEPCROPS_ITEMS).food(new Food.Builder().hunger(2).saturation(2f).build())));

    public static final RegistryObject<Item> plump_helmet_spores = ITEMS.register
        ("plump_helmet_spores", () -> new BlockItem(ModBlocks.plumphelmet_crop.get(), new Item.Properties().group(DeepCropsItemGroup.DEEPCROPS_ITEMS)));
}
