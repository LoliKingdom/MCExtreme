package mcextreme.vtweaks;

import mcextreme.vtweaks.item.ItemsVTweaks;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
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
	
	public static final String version = "0.1.0";
		
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
    	Block.blocksList[18] = null;
    	ItemsVTweaks.initItems();
        LocalizationVTweaks.addNames();
        CraftingVTweaks.addRecipes();
        Block blockLeaves = new BlockNonSolidLeaves(18).setUnlocalizedName("leaves");
    }
    
    @EventHandler
    public void modsLoadedpostInit(FMLPostInitializationEvent event)
    {
    }
}