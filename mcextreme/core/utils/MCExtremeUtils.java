package mcextreme.core.utils;

import java.util.logging.Level;

import mcextreme.core.MCExtremeCore;

import cpw.mods.fml.common.FMLLog;

public class MCExtremeUtils 
{
	public static void printModInfo()
	{
		String pluginsFound = "[MC-X] Installed plugins:";
    	boolean first = true;
    	
    	String[] classes = new String[] { "magic.MCExtremeMagic", "tech.MCExtremeTech", "vtweaks.MCExtremeVTweaks" };
    	String[] names = new String[] {	"Magic ", "Tech ", "VanillaTweaks " };
    	
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
    		
    		if (!failed) pluginsFound = pluginsFound + label;
    	}
    	
    	FMLLog.log(Level.INFO, "[MC-X] Loaded MC to the Extreme version " + MCExtremeCore.version + " for MC " + MCExtremeCore.mcversion);
    	FMLLog.log(Level.INFO, pluginsFound); 
	}
}
