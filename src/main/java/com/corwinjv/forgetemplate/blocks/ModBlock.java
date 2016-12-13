package com.corwinjv.forgetemplate.blocks;

import com.corwinjv.forgetemplate.Reference;
import com.corwinjv.forgetemplate.creativetab.CreativeTabFT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by CorwinJV on 9/1/14.
 */
public class ModBlock extends Block
{
    public ModBlock(Material aMaterial) {
        super(aMaterial);
        this.init();
    }

    public ModBlock()
    {
        super(Material.ROCK);
        this.init();
    }

    public void init()
    {
        this.setCreativeTab(CreativeTabFT.FT_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tiles.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
