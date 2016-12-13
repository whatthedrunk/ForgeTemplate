package com.whatthedrunk.alltheblocks;

        import net.minecraft.entity.EntityList;
        import net.minecraftforge.fml.common.FMLLog;
        import org.apache.logging.log4j.Level;

        import java.util.Iterator;

public class Reference {
    public static final String MOD_ID = "alltheblocks";
    public static final String MOD_NAME = "All the Block";
    public static final String MOD_VERSION = "1.11-0.0.0";
    public static final String RESOURCE_PREFIX = MOD_ID + ":";

    public static final String GUI_FACTORY_CLASS = "com.whatthedrunk.alltheblocks.gui.GuiFactoryFT";
    public static final String CLIENT_SIDE_PROXY_CLASS = "com.whatthedrunk.alltheblocks.proxy.ClientProxy";
    public static final String SERVER_SIDE_PROXY_CLASS = "com.whatthedrunk.alltheblocks.proxy.CommonProxy";
}
