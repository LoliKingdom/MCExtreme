package mcextreme.vtweaks;

import java.util.Arrays;
import java.util.logging.Level;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="MCExtremeVTweaks", name="MC-Extreme: Vanilla Tweaks", version="0.1.0", dependencies = "required-after:MCExtremeCore")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MCExtremeVTweaks
{
	//Tab 2
	public static CreativeTabs tabXVTweaks = new CreativeTabs("extreme_tab_vtweaks")
	{
		public ItemStack getIconItemStack()
		{
			return new ItemStack(ItemsVTweaks.itemLink);
		}
	};
		
    @Instance("MCExtremeVTweaks")
    public static MCExtremeVTweaks instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ModMetadata modMeta = event.getModMetadata();
 		modMeta.parent = "MCExtremeCore";
 		
        PropertiesVTweaks.loadConfig(new Configuration(event.getSuggestedConfigurationFile()));
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	ItemsVTweaks.initItems();
        LocalizationVTweaks.addNames();
        CraftingVTweaks.addRecipes();
    }
    
    @EventHandler
    public void modsLoadedpostInit(FMLPostInitializationEvent event)
    {
    	FMLLog.log(Level.INFO, "MCExtreme Vanilla Tweaks Loaded!"); 
    }
}