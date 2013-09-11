package mcextreme.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="MCExtremeCore", name="MC-Extreme: Core", version="0.0.2")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MCExtremeCore
{
    @Instance("MCExtremeCore")
    public MCExtremeCore instance;
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void modsLoadedpostInit(FMLPostInitializationEvent event)
    {
    	System.out.print("MCExtreme Core Loaded!"); 
    }
}