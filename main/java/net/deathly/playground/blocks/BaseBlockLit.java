package net.deathly.playground.blocks;

import net.deathly.playground.PlayGround;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Created by Deathly on 4/4/2017.
 */
public class BaseBlockLit extends Block {

    protected BaseBlockLit(Material material, String name) {
        super(material);
        this.setUnlocalizedName(name);
        this.setCreativeTab(PlayGround.playtab);
        this.setLightLevel(1.0F);
        this.setResistance(100F);
        this.setHardness(0.5F);
    }

}
