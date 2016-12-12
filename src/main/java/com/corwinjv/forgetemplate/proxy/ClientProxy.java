package com.corwinjv.forgetemplate.proxy;


import com.corwinjv.forgetemplate.blocks.ModBlocks;

/**
 * Created by CorwinJV on 1/23/2016.
 */
public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        ModBlocks.registerRenders();
        //ModItems.registerRenders();
    }

    @Override
    public void registerEntityRenders()
    {
        //ModEntities.registerEntityRenders();
    }

    @Override
    public void registerKeys()
    {

    }

    @Override
    public void registerGui()
    {

    }

    @Override
    public void registerParticleRenderer()
    {

    }
}
