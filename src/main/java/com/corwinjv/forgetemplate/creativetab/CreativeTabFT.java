package com.corwinjv.forgetemplate.creativetab;

import com.corwinjv.forgetemplate.Reference;
import com.corwinjv.forgetemplate.blocks.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by CorwinJV on 9/1/14.
 */
public class CreativeTabFT
{
    public static final CreativeTabs FT_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.getBlock(ModBlocks.DUMMY_WOOD));
        }
    };
}
