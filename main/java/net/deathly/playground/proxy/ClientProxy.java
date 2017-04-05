package net.deathly.playground.proxy;

import net.deathly.playground.recipe.ModRecipes;
import net.deathly.playground.registry.ModBlocks;
import net.deathly.playground.registry.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Deathly on 4/4/2017.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        ModItems.registerRenders();
        ModBlocks.registerRenders();
        ModRecipes.init();
       // ModOreDict.registerOeDictEntries();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
