package mcextreme.magic;

import java.util.logging.Level;

import mcextreme.core.MCExtremeCore;
import mcextreme.core.utils.CreativeTab;
import mcextreme.magic.block.BlocksMagic;
import mcextreme.magic.item.ItemsMagic;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="MCExtremeMagic", name="MC-Extreme: Magic", version=MCExtremeCore.version, dependencies = "required-after:MCExtremeCore")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MCExtremeMagic
{
	public static final String version = "0.1.0";
	
	@Instance("MCExtremeMagic")
    public static MCExtremeMagic instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ModMetadata modMeta = event.getModMetadata();
 		modMeta.parent = "MCExtremeCore";
 		
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
        EnumsMagic.setHarvestLevels();
        GameRegistry.registerBlock(BlocksMagic.blockSolidEvil, "Solidified Evil");
        GameRegistry.registerBlock(BlocksMagic.blockWorldsEnd, "The End of the World as you knew it");
        GameRegistry.registerBlock(BlocksMagic.blockLiquidDark, "Liquid Darkness");
        
        MCExtremeCore.tabMagic = new CreativeTab("mcx.magic", 1).setIconItemStack(new ItemStack(Item.brewingStand));
    }
}