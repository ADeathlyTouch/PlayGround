package net.deathly.playground.registry;

import net.deathly.playground.PlayGround;
import net.deathly.playground.blocks.BlackBlock;
import net.deathly.playground.blocks.BlackLit;
import net.deathly.playground.items.ItemCompressedEnderPearl;
import net.deathly.playground.items.ItemTAvionLogo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static net.minecraft.block.Block.registerBlocks;

/**
 * Created by Deathly on 4/4/2017.
 */
public class ModBlocks {

    public static BlackBlock blackBlock;
    public static BlackLit blackLit;

    public static void preInit(){
        blackBlock = new BlackBlock(Material.ROCK, "blackblock");
        blackLit = new BlackLit(Material.ROCK, "blacklit");

        registerBlocks();
    }

    public static void registerBlocks() {
        registerBlock(blackBlock, "blackblock");
        registerBlock(blackLit, "blacklit");
    }

    public static void registerBlock(Block block, String name) {
        GameRegistry.register(block, new ResourceLocation(PlayGround.MODID, name));
        GameRegistry.register(new ItemBlock(block), new ResourceLocation(PlayGround.MODID, name));
    }

    public static void registerRenders() {
        registerRender(blackBlock);
        registerRender(blackLit);
    }

    private static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(PlayGround.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
