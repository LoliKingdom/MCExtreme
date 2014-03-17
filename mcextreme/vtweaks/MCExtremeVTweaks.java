package mcextreme.vtweaks;

import java.io.File;

import mcextreme.core.config.MCExtremeConfig;
import mcextreme.core.MCExtremeCore;
import mcextreme.core.utils.CreativeTab;
import mcextreme.vtweaks.blocks.BlocksVTweaks;
import mcextreme.vtweaks.item.ItemsVTweaks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid=MCExtremeVTweaks.MODID, name=MCExtremeVTweaks.NAME, version=MCExtremeVTweaks.VERSION, dependencies = "required-after:" + MCExtremeCore.MODID)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MCExtremeVTweaks
{
    public static final String MODID = MCExtremeCore.PRE_ID + "VTweaks";
	public static final String VERSION = "0.2.4";
	public static final String NAME = MCExtremeCore.ABBR + " Vanilla Tweaks";
    @Instance(MODID)
    public static MCExtremeVTweaks instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MCExtremeCore.tabVanillaTweaks = new CreativeTab("mcx.vtweaks");
        
    	ModMetadata modMeta = event.getModMetadata();
 		modMeta.parent = MCExtremeCore.MODID;
 		
 		MCExtremeConfig.loadConfig(new Configuration(new File(event.getModConfigurationDirectory() + "/mcextreme", "mcx-vanillatweaks.cfg")), "VTWEAKS");
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	ItemsVTweaks.initItems();
        BlocksVTweaks.initBlocks();
        CraftingVTweaks.addRecipes();
        
        ((CreativeTab)MCExtremeCore.tabVanillaTweaks).setIconItemStack(new ItemStack(ItemsVTweaks.itemLink));
    }
}