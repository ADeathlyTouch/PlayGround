package net.deathly.playground.blocks;

import net.deathly.playground.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * Created by Deathly on 4/4/2017.
 */
public class BlackBlock extends BaseBlock {


    public BlackBlock(Material material, String name) {
        super(material, name);
    }

    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

        if (worldIn.isBlockPowered(pos))
        {
            worldIn.setBlockState(pos, ModBlocks.blackLit.getDefaultState());
        }
        else {
            worldIn.setBlockState(pos, ModBlocks.blackBlock.getDefaultState());
        }
        super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
    }

    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.blackBlock);
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(ModBlocks.blackBlock);
    }

    protected ItemStack createStackedBlock(IBlockState state)
    {
        return new ItemStack(ModBlocks.blackBlock);
    }
}
