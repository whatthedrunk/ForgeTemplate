package com.corwinjv.forgetemplate;
/**
 * Created by corwinjv on 8/30/14.
 */

import com.corwinjv.forgetemplate.blocks.ModBlocks;
import com.corwinjv.forgetemplate.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ForgeTemplate
{
    @Mod.Instance
    public static ForgeTemplate instance;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE_PROXY_CLASS, serverSide = Reference.SERVER_SIDE_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // Blocks and Items
        ModBlocks.init();
        ModBlocks.registerBlocks();
        ModBlocks.registerRecipes();

//        ModItems.init();
//        ModItems.registerItems();
//        ModItems.registerRecipes();

        // Entities
//        ModEntities.init();
//        ModEntities.registerEntities(instance);
//        proxy.registerEntityRenders();

        // Keybinds
        proxy.registerKeys();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenders();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.registerGui();
        proxy.registerParticleRenderer();
    }
}
