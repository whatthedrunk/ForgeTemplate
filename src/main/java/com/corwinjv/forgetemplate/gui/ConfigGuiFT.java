package com.corwinjv.forgetemplate.gui;

import com.corwinjv.forgetemplate.Reference;
import com.corwinjv.forgetemplate.config.ConfigurationHandler;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

/**
 * Created by CorwinJV on 9/1/14.
 */
public class ConfigGuiFT extends GuiConfig
{
    public ConfigGuiFT(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
