package com.wrenbun.tombstonepatch;

import com.wrenbun.tombstonepatch.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TombstonePatch {

    public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_NAME);

    @SidedProxy(modId = Reference.MOD_ID, clientSide = "com.wrenbun.tombstonepatch.proxy.ClientProxy", serverSide = "com.wrenbun.tombstonepatch.proxy.CommonProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("{} loaded", Reference.MOD_NAME);
    }

}
