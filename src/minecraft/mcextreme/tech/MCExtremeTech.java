package mcextreme.tech;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="MCExtremeTech", name="MC-Extreme: Tech", version="0.0.2", dependencies = "required-after:MCExtremeCore")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MCExtremeTech
{
	//Tab 2
	public static CreativeTabs tabXTech = new CreativeTabs("extreme_tab_tech")
	{
		public ItemStack getIconItemStack()
		{
			return new ItemStack(Block.furnaceBurning, 1, 0);
		}
	};
			
    @Instance("MCExtremeTech")
    public MCExtremeTech instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        PropertiesTech.loadConfig(new Configuration(event.getSuggestedConfigurationFile()));
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        BlocksTech.initBlocks();
        ItemsTech.initItems();
        LocalizationTech.addNames();
        CraftingTech.addRecipes();
        CraftingTech.addSmeltingRecipes();
        CraftingTech.registerInOreDict();
    }
    
    @EventHandler
    public void modsLoadedpostInit(FMLPostInitializationEvent event)
    {
    	System.out.print("MCExtreme Tech Loaded!"); 
    }
}