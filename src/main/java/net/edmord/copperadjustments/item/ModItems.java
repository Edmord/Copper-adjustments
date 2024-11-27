package net.edmord.copperadjustments.item;

import net.edmord.copperadjustments.CopperAdjustments;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CopperAdjustments.MODID);

    public static final DeferredItem<Item> PATINA = ITEMS.register("patina",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
            ITEMS.register(eventBus);
        }

}
