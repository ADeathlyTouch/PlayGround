package net.deathly.playground.items;


import net.deathly.playground.PlayGround;
import net.minecraft.item.Item;

/**
 * Created by Deathly on 4/4/2017.
 */
public class BaseItem extends Item{
    public BaseItem(){
            setCreativeTab(PlayGround.playtab);
        }
}
