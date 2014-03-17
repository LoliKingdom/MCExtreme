package mcextreme.magic;

import java.io.File;
import java.util.logging.Level;

import mcextreme.core.MCExtremeCore;
import mcextreme.core.config.MCExtremeConfig;
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

@Mod(modid=MCExtremeMagic.MODID, name=MCExtremeMagic.NAME, version=MCExtremeMagic.VERSION, dependencies = "required-after:" + MCExtremeCore.MODID)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MCExtremeMagic
{
    public static final String MODID = MCExtremeCore.PRE_ID + "Magic";
	public static final String VERSION = "0.2.4";
	public static final String NAME = MCExtremeCore.ABBR + " Magic";
    @Instance(MODID)
    public static MCExtremeMagic instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MCExtremeCore.tabMagic = new CreativeTab("mcx.magic");
        
    	ModMetadata modMeta = event.getModMetadata();
 		modMeta.parent = MCExtremeCore.MODID;
 		
        MCExtremeConfig.loadConfig(new Configuration(new File(event.getModConfigurationDirectory() + "/mcextreme", "mcx-magic.cfg")), "MAGIC");
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        BlocksMagic.initBlocks();
        ItemsMagic.initItems();
        CraftingMagic.addSmeltingRecipes();
        CraftingMagic.registerInOreDict();
        EnumsMagic.setHarvestLevels();
        
        ((CreativeTab)MCExtremeCore.tabMagic).setIconItemStack(new ItemStack(ItemsMagic.itemCrystal, 1, 0));
    }
}