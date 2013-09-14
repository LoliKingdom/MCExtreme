package mcextreme.magic;

import java.util.logging.Level;

import mcextreme.core.MCExtremeCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="MCExtremeMagic", name="MC-Extreme: Magic", version=MCExtremeCore.version, dependencies = "required-after:MCExtremeCore")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MCExtremeMagic
{
	//Tab 2
	public static CreativeTabs tabXMagic = new CreativeTabs("extreme_tab_magic")
	{
		public ItemStack getIconItemStack()
		{
			return new ItemStack(Item.brewingStand);
		}
	};
			
    @Instance("MCExtremeMagic")
    public static MCExtremeMagic instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        PropertiesMagic.loadConfig(new Configuration(event.getSuggestedConfigurationFile()));
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        BlocksMagic.initBlocks();
        ItemsMagic.initItems();
        LocalizationMagic.addNames();
        CraftingMagic.addSmeltingRecipes();
        CraftingMagic.registerInOreDict();
    }
    
    @EventHandler
    public void modsLoadedpostInit(FMLPostInitializationEvent event)
    {
    	FMLLog.log(Level.INFO, "MCExtreme Magic Loaded!"); 
    }
}