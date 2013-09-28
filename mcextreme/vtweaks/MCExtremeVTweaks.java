package mcextreme.vtweaks;

import mcextreme.core.MCExtremeCore;
import mcextreme.core.utils.CreativeTab;
import mcextreme.vtweaks.blocks.BlockNonSolidLeaves;
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
	public static final String version = "0.1.0";
		
    @Instance("MCExtremeVTweaks")
    public static MCExtremeVTweaks instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MCExtremeCore.tabVanillaTweaks = new CreativeTab("mcx.vtweaks", 3);
        
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
        Block blockLeaves = new BlockNonSolidLeaves(18).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("leaves").setTextureName("leaves");
        
        ((CreativeTab)MCExtremeCore.tabVanillaTweaks).setIconItemStack(new ItemStack(ItemsVTweaks.itemLink));
    }
}