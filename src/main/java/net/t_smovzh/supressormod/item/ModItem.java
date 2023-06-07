package net.t_smovzh.supressormod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.t_smovzh.supressormod.SupressorMod;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SupressorMod.MOD_ID);

    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}
}
