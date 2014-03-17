package mcextreme.tools;

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
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;

import java.io.File;

@Mod(modid=MCExtremeTools.MODID, name=MCExtremeTools.NAME, version=MCExtremeTools.VERSION, dependencies = "required-after:" + MCExtremeCore.MODID)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MCExtremeTools
{
    public static final String MODID = MCExtremeCore.PRE_ID + "Tools";
	public static final String VERSION = "0.2.4";
	public static final String NAME = MCExtremeCore.ABBR + " Tools";
    @Instance(MODID)
    public static MCExtremeTools instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MCExtremeCore.tabTools = new CreativeTab("mcx.tools");
        
    	ModMetadata modMeta = event.getModMetadata();
 		modMeta.parent = MCExtremeCore.MODID;
 		
 		MCExtremeConfig.loadConfig(new Configuration(new File(event.getModConfigurationDirectory() + "/mcextreme", "mcx-tools.cfg")), "TOOLS");
 		
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {	
        
        ((CreativeTab)MCExtremeCore.tabTech).setIconItemStack(new ItemStack(Item.pickaxeDiamond, 1, 0));
    }
}