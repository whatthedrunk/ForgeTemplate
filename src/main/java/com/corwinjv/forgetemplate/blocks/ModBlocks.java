package com.corwinjv.forgetemplate.blocks;

import com.corwinjv.forgetemplate.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by CorwinJV on 9/1/14.
 */

public class ModBlocks
{
    public static final String DUMMY_WOOD = "dummy_wood";
    public static final String DUMMY_GRASS = "dummy_grass";

    private static Map<String, ModBlock> mBlocks = Collections.emptyMap();
    private static Map<String, Class<? extends TileEntity>> mTileEntityClasses = Collections.emptyMap();

    public static void init()
    {
        mBlocks = new HashMap<String, ModBlock>();
        mTileEntityClasses = new HashMap<String, Class<? extends TileEntity>>();

        ModBlock dummy_wood = new DummyWoodBlock();
        dummy_wood.setUnlocalizedName(DUMMY_WOOD);
        mBlocks.put(DUMMY_WOOD, dummy_wood);

        ModBlock dummy_grass = new DummyGrassBlock();
        dummy_wood.setUnlocalizedName(DUMMY_GRASS);
        mBlocks.put(DUMMY_GRASS, dummy_grass);
    }

    public static ModBlock getBlock(String key)
    {
        if (mBlocks.containsKey(key))
        {
            return mBlocks.get(key);
        }
        return null;
    }

    public static void registerBlocks()
    {
        for (String key : mBlocks.keySet())
        {
            ModBlock block = mBlocks.get(key);
            if (block != null)
            {
                GameRegistry.register(block.setRegistryName(new ResourceLocation(Reference.MOD_ID, key)));
                GameRegistry.register(new ItemBlock(block), block.getRegistryName());

                Class<? extends TileEntity> tileEntityClass = mTileEntityClasses.get(key);
                if (tileEntityClass != null)
                {
                    GameRegistry.registerTileEntity(tileEntityClass, key);
                }
            }
        }
    }

    public static void registerRenders()
    {
        for (String key : mBlocks.keySet())
        {
            ModBlock block = mBlocks.get(key);
            if (block != null)
            {
                registerRender(block, key);
            }
        }
    }

    private static void registerRender(ModBlock block, String key)
    {
        Item item = Item.getItemFromBlock(block);

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item,
                        0,
                        new ModelResourceLocation(Reference.RESOURCE_PREFIX + key, "inventory"));
    }

    public static void registerRecipes()
    {
        ModBlock item = mBlocks.get(DUMMY_WOOD);
        GameRegistry.addRecipe(new ItemStack(item, 1),
                "SSS",
                " K ",
                "SSS",
                'S', Items.WHEAT_SEEDS,
                'K', Items.STICK);

        ModBlock item2 = mBlocks.get(DUMMY_WOOD);
        GameRegistry.addRecipe(new ItemStack(item2, 1),
                "SSS",
                " K ",
                "SSS",
                'S', Items.WHEAT_SEEDS,
                'K', Items.WHEAT_SEEDS);
    }
}
