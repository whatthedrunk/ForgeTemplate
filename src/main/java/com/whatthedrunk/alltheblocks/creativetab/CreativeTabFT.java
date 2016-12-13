package com.whatthedrunk.alltheblocks.creativetab;

import com.whatthedrunk.alltheblocks.Reference;
import com.whatthedrunk.alltheblocks.blocks.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabFT
{
    public static final CreativeTabs FT_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.getBlock(ModBlocks.GRAYBLOCK));
        }
    };
}
