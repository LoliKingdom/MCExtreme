package mcextreme.tech;

import java.util.logging.Level;

import mcextreme.core.MCExtremeCore;
import mcextreme.core.utils.CreativeTab;
import mcextreme.tech.block.BlocksTech;
import mcextreme.tech.item.ItemsTech;
import net.minecraft.block.Block;
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

@Mod(modid="MCExtremeTech", name="MC-Extreme: Tech", version=MCExtremeCore.version, dependencies = "required-after:MCExtremeCore")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MCExtremeTech
{			
	public static final String version = "0.1.0";
	
    @Instance("MCExtremeTech")
    public static MCExtremeTech instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ModMetadata modMeta = event.getModMetadata();
 		modMeta.parent = "MCExtremeCore";
 		
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
        EnumsTech.setHarvestLevels();
        
        MCExtremeCore.tabTech = new CreativeTab("mcx.tech", 2).setIconItemStack(new ItemStack(Block.furnaceBurning));
    }
}