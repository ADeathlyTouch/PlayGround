package net.deathly.playground;

import mcp.MethodsReturnNonnullByDefault;
import net.deathly.playground.proxy.CommonProxy;
import net.deathly.playground.registry.ModBlocks;
import net.deathly.playground.registry.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import org.apache.logging.log4j.Logger;

/**
 * Created by Deathly on 4/3/2017.
 */
@Mod(modid = PlayGround.MODID, name = PlayGround.MODNAME, version = PlayGround.VERSION)
public class PlayGround {

    public static final String
            MODID = "playground",
            MODNAME = "Play Ground",
            VERSION = "";

    /** Custom Creative Tab */
    public static final CreativeTabs playtab = new CreativeTabs("playtab") {
        @Override
        @MethodsReturnNonnullByDefault
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.APPLE);
        }
    };

    @Mod.Instance(value = PlayGround.MODID)
    public static PlayGround instance;

    @SidedProxy(clientSide = "net.deathly.playground.proxy.ClientProxy", serverSide = "net.deathly.playground.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());

        config.load();
        config.save();

        ModItems.preInit();
        ModBlocks.preInit();

        proxy.preInit(event);
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
}
