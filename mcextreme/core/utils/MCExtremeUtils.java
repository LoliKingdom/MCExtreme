package mcextreme.core.utils;

import java.lang.reflect.Field;
import java.util.logging.Level;

import mcextreme.core.MCExtremeCore;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.registry.GameRegistry;

public class MCExtremeUtils 
{    
	public static void printModInfo()
	{
		String pluginsFound = "Installed plugins:";
    	boolean first = true;
    	
    	String[] classes = new String[] {"aesthetics.MCExtremeAesthetics", "magic.MCExtremeMagic", "tech.MCExtremeTech", "vtweaks.MCExtremeVTweaks","utilities.MCExtremeUtilities"};
    	
    	for (int i = 0; i < classes.length; i++)
    	{
    		String pluginVersion = "", label = "";
    		boolean failed = false;
    		
    		//Kodehawa code: Fixed reflection usage for independent versioning system
    		//To General: DO NOT CHANGE THIS CODE, pleeease :)

            // from general: I did. :P (I learned Reflection)
    		
    		try{
    			Class clazz = Class.forName("mcextreme."+classes[i]);
    			if(clazz != null){
    				Field name = clazz.getDeclaredField("NAME");
    			    Field version = clazz.getDeclaredField("VERSION");
    			    if(name != null && version != null){
    			    	name.setAccessible(true);
    			        version.setAccessible(true);
    			        pluginVersion = (String)version.get(null);
    			        label = (String)name.get(null);
    	    		    label = (first ? " " : ", ")+label+" ["+pluginVersion+"]";
        			    first = false;
    			    }
    			}
    		}
    		catch(Exception exception){
    			exception.printStackTrace();
    			failed = true;
    		}
    		
    		if(!failed){
    			pluginsFound = pluginsFound + label;
    		}
    	}

        MCExtremeCore.logger.info("Loaded " + MCExtremeCore.NAME + " version " + MCExtremeCore.VERSION + " for Minecraft " + MCExtremeCore.MCVERSION);
    	MCExtremeCore.logger.info(pluginsFound);
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

    public static boolean isBlockPowered(World world, int x, int y, int z)
    {
        return world.getBlockPowerInput(x, y, z) > 0 || world.isBlockIndirectlyGettingPowered(x, y, z) || world.isBlockIndirectlyGettingPowered(x, y + 1, z) /*|| world.getBlockPowerInput(x - 1, y, z) > 0 || world.getBlockPowerInput(x + 1, y, z) > 0 || world.getBlockPowerInput(x, y - 1, z) > 0 || world.getBlockPowerInput(x, y + 1, z) > 0 || world.getBlockPowerInput(x, y, z - 1) > 0 || world.getBlockPowerInput(x, y, z + 1) > 0*/;
    }
}
