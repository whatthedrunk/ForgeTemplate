package com.whatthedrunk.alltheblocks.proxy;


import com.whatthedrunk.alltheblocks.blocks.ModBlocks;

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
