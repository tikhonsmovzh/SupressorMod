package net.t_smovzh.supressormod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.t_smovzh.supressormod.SupressorMod;
import net.t_smovzh.supressormod.item.ModItem;

import java.util.function.Supplier;

public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SupressorMod.MOD_ID);

    //public static final RegistryObject<Block> SUPRESSOR_BLOCK = registerBlock("supressor", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));

    public static final RegistryObject<Block> SUPRESSOR_BLOCK = registerBlock("supressor_block" , () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        registryBlockItem(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block){
        return ModItem.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}