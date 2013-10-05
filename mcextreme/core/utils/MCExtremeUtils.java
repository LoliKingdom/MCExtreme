package mcextreme.core.utils;

import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

import mcextreme.core.MCExtremeCore;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.registry.GameRegistry;

public class MCExtremeUtils 
{    
	public static void printModInfo()
	{
		String pluginsFound = "[MC-X] Installed plugins:";
    	boolean first = true;
    	
    	String[] classes = new String[] { "magic.MCExtremeMagic", "tech.MCExtremeTech", "vtweaks.MCExtremeVTweaks" };
    	String[] names = new String[] {	"Magic ", "Tech ", "Vanilla Tweaks " };
    	
    	for (int i = 0; i < classes.length; i++)
    	{
    		String version, label = "";
    		boolean failed = false;
    		
    		try
    		{
    			version = (String) Class.forName("mcextreme." + classes[i]).getField("version").get(null);
    			label = (first ? " " : ", ") + names[i] + version;
    			first = false;
    		}
    		catch (Exception e) 
    		{
    			failed = true;
    		}
    		
    		if(!failed) pluginsFound = pluginsFound + label;
    	}
    	
    	FMLLog.log(Level.INFO, "[MC-X] Loaded MC to the Extreme version " + MCExtremeCore.version + " for MC " + MCExtremeCore.mcversion);
    	FMLLog.log(Level.INFO, pluginsFound); 
	}

    public static void registerDefaultBlocks(Block... blocks)
    {
        for (int i = 0; i < blocks.length; i++)
        {
            registerDefaultBlock(blocks[i]);
        }
    }
    
    public static void registerDefaultBlock(Block block)
    {
        GameRegistry.registerBlock(block, ItemBlock.class, null);
    }
}
