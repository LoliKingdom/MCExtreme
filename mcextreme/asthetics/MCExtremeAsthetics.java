package mcextreme.asthetics;

import java.io.File;

import mcextreme.core.MCExtremeCore;
import mcextreme.core.config.MCExtremeConfig;
import mcextreme.core.utils.CreativeTab;
import mcextreme.vtweaks.CraftingVTweaks;
import mcextreme.vtweaks.MCExtremeVTweaks;
import mcextreme.vtweaks.blocks.BlockNonSolidLeaves;
import mcextreme.vtweaks.item.ItemsVTweaks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="MCExtremeAsthetics", name="MC-X Asthetics", version=MCExtremeAsthetics.version, dependencies = "required-after:MCExtremeCore")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MCExtremeAsthetics
{	
	
	public static final String version = "0.2.4";
	public static final String pluginName = "MCX Asthetics";
	
    @Instance("MCExtremeAsthetics")
    public static MCExtremeAsthetics instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MCExtremeCore.tabAsthetics = new CreativeTab("mcx.asthetics");
        
    	ModMetadata modMeta = event.getModMetadata();
 		modMeta.parent = "MCExtremeCore";
 		
 		MCExtremeConfig.loadConfig(new Configuration(new File(event.getModConfigurationDirectory() + "/mcextreme", "mcx-vanillatweaks.cfg")), "VTWEAKS");
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {

    }
}
