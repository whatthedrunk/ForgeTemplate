package com.corwinjv.forgetemplate;

import net.minecraft.entity.EntityList;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

import java.util.Iterator;

/**
 * Created by CorwinJV on 8/31/14.
 */
public class Reference {
    public static final String MOD_ID = "forgetemplate";
    public static final String MOD_NAME = "Forge Template";
    public static final String MOD_VERSION = "1.11-0.0.0";
    public static final String RESOURCE_PREFIX = MOD_ID + ":";

    public static final String GUI_FACTORY_CLASS = "com.corwinjv.forgetemplate.gui.GuiFactoryFT";
    public static final String CLIENT_SIDE_PROXY_CLASS = "com.corwinjv.forgetemplate.proxy.ClientProxy";
    public static final String SERVER_SIDE_PROXY_CLASS = "com.corwinjv.forgetemplate.proxy.CommonProxy";
}
