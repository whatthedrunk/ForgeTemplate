package com.whatthedrunk.alltheblocks;

import com.whatthedrunk.alltheblocks.blocks.ModBlocks;
import com.whatthedrunk.alltheblocks.config.ConfigurationHandler;
import com.whatthedrunk.alltheblocks.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class alltheblocks
{
    @Mod.Instance
    public static alltheblocks instance;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE_PROXY_CLASS, serverSide = Reference.SERVER_SIDE_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // Config
        ConfigurationHandler.Init(event.getSuggestedConfigurationFile());
        MinecraftForge.EVENT_BUS.register(new ConfigurationHandler());

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
