package net.deathly.playground.blocks;


import jdk.nashorn.internal.ir.Statement;
import net.deathly.playground.PlayGround;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Deathly on 4/3/2017.
 */
public class BaseBlock extends Block {

    protected BaseBlock(Material material, String name) {
        super(material);
        this.setUnlocalizedName(name);
        this.setCreativeTab(PlayGround.playtab);
        this.setResistance(100F);
        this.setHardness(0.5F);
    }
}
