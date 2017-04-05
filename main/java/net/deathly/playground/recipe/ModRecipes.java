package net.deathly.playground.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Deathly on 4/4/2017.
 */
public class ModRecipes {

    public static void init() {
        addShapedRecipes();
        addShapelessRecipes();
    }

    private static void addShapelessRecipes() {
        //GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.purewhite), Items.WATER_BUCKET,"colorBrick"));
    }

    private static void addShapedRecipes() {
        /** Blocks*/
        //GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.rainbowblock),"abc","dye","fgh",'y', ModBlocks.purewhite,'a', new ItemStack(Items.DYE, 1, 1),'b', new ItemStack(Items.DYE, 1, 9),'c', new ItemStack(Items.DYE, 1, 13),'d', new ItemStack(Items.DYE, 1, 14),'e', new ItemStack(Items.DYE, 1, 5),'f', new ItemStack(Items.DYE, 1, 11),'g', new ItemStack(Items.DYE, 1, 10),'h', new ItemStack(Items.DYE, 1, 4));

        /**Items*/
        //GameRegistry.addShapedRecipe(new ItemStack(ModItems.compressedepearl),"aax","aax","xxx",'a', Items.ENDER_PEARL);

    }
}
