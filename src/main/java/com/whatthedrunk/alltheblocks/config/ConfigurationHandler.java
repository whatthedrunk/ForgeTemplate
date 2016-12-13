package com.whatthedrunk.alltheblocks.config;

import com.whatthedrunk.alltheblocks.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;

    /** Config Properties **/
    public static boolean isHardMode = false;

    public static void Init(File aConfigFile)
    {
        if(configuration == null)
        {
            configuration = new Configuration(aConfigFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(Reference.MOD_ID.equalsIgnoreCase(event.getModID()))
        {
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        isHardMode = configuration.getBoolean("HardModeOn", Configuration.CATEGORY_GENERAL, false, "Do you want to play in hard mode?");

        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
