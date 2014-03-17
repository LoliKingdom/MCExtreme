package mcextreme.utilities;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import mcextreme.core.MCExtremeCore;
import mcextreme.core.config.MCExtremeConfig;
import mcextreme.core.utils.CreativeTab;
import mcextreme.utilties.blocks.BlocksUtilities;
import net.minecraftforge.common.Configuration;

import java.io.File;

@Mod(modid=MCExtremeUtilities.MODID, name=MCExtremeUtilities.NAME, version=MCExtremeUtilities.VERSION, dependencies = "required-after:" + MCExtremeCore.MODID)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MCExtremeUtilities
{
    public static final String MODID = MCExtremeCore.PRE_ID + "Utilities";
	public static final String VERSION = "0.2.4";
	public static final String NAME = MCExtremeCore.ABBR + " Utilities";
    @Instance(MODID)
    public static MCExtremeUtilities instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MCExtremeCore.tabUtilities = new CreativeTab("mcx.utilities");
        
    	ModMetadata modMeta = event.getModMetadata();
 		modMeta.parent = MCExtremeCore.MODID;
 		
 		MCExtremeConfig.loadConfig(new Configuration(new File(event.getModConfigurationDirectory() + "/mcextreme", "mcx-utilities.cfg")), "UTIL");
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        BlocksUtilities.initBlocks();
    }
}