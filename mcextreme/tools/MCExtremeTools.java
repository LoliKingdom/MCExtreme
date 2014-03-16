package mcextreme.tools;

import java.io.File;

import mcextreme.core.MCExtremeCore;
import mcextreme.core.config.MCExtremeConfig;
import mcextreme.core.utils.CreativeTab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="MCExtremeTools", name="MC-X Tools", version=MCExtremeTools.version, dependencies = "required-after:MCExtremeCore")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MCExtremeTools
{
	public static final String version = "0.2.4";
	public static final String pluginName = "MCX Tools";
	
    @Instance("MCExtremeTools")
    public static MCExtremeTools instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MCExtremeCore.tabTools = new CreativeTab("mcx.tools");
        
    	ModMetadata modMeta = event.getModMetadata();
 		modMeta.parent = "MCExtremeCore";
 		
 		MCExtremeConfig.loadConfig(new Configuration(new File(event.getModConfigurationDirectory() + "/mcextreme", "mcx-tools.cfg")), "TOOLS");
 		
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {	
        
        ((CreativeTab)MCExtremeCore.tabTech).setIconItemStack(new ItemStack(Item.pickaxeDiamond, 1, 0));
    }
}