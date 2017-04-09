package net.deathly.playground.registry;

import net.deathly.playground.PlayGround;
import net.deathly.playground.items.ItemCompressedEnderPearl;
import net.deathly.playground.items.ItemTAvionLogo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Deathly on 4/4/2017.
 */
public class ModItems {
    public static Item TAvionLogo;
    public static Item compressedepearl;

    public static void preInit(){
        TAvionLogo = new ItemTAvionLogo("tavionlogo");
        compressedepearl = new ItemCompressedEnderPearl("compressed_enderpearl");

        registerItems();
    }

    public static void registerItems() {
        GameRegistry.register(compressedepearl, new ResourceLocation(PlayGround.MODID, "compressed_enderpearl"));
        GameRegistry.register(TAvionLogo, new ResourceLocation(PlayGround.MODID, "tavionlogo"));
    }

    public static void registerRenders() {
        registerRender(TAvionLogo);
        registerRender(compressedepearl);
    }

    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(PlayGround.MODID + ":" + item.getRegistryName(), "inventory"));
    }
}
