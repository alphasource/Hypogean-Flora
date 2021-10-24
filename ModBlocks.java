package net.ram3n.deepcrops.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.ram3n.deepcrops.DeepCrops;
import net.ram3n.deepcrops.custom.PlumpHelmetBlock;
import net.ram3n.deepcrops.item.DeepCropsItemGroup;
import net.ram3n.deepcrops.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, DeepCrops.MOD_ID);

    // blocks begin here

    public static final RegistryObject<Block> plumphelmet_crop = BLOCKS.register("plumphelmet_crop",
            () -> new PlumpHelmetBlock(AbstractBlock.Properties.from(Blocks.WHEAT)));

    // blocks end here

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);


        registerBlockItem(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {

        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(DeepCropsItemGroup.DEEPCROPS_ITEMS)));

    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
