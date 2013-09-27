package mcextreme.magic;

import mcextreme.magic.block.BlocksMagic;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationMagic
{
	public static String[] oreNames = new String[] {"Aquamarine Ore"};
	public static String[] storageNames = new String[] {"Block of Aquamarine"};
	
    public static void addNames()
    {
        LanguageRegistry.addName(BlocksMagic.blockMagicPortal, "Magic Portal");
        LanguageRegistry.addName(BlocksMagic.blockSolidEvil, "Solidifed Evil");
        
        for (int meta = 0; meta < oreNames.length; ++meta)
        	LanguageRegistry.addName(new ItemStack(BlocksMagic.blockOre, 1, meta), oreNames[meta]);
        
        for (int meta = 0; meta < storageNames.length; ++meta)
        	LanguageRegistry.addName(new ItemStack(BlocksMagic.blockStorage, 1, meta), storageNames[meta]);
        
        //Tabs
    	LanguageRegistry.instance().addStringLocalization("itemGroup.extreme_tab_magic", "MC-Extreme: Magic");
    }
}
