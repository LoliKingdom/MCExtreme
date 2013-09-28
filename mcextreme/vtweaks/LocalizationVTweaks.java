package mcextreme.vtweaks;

import mcextreme.vtweaks.item.ItemsVTweaks;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationVTweaks
{	
    public static void addNames()
    {
	    LanguageRegistry.addName(ItemsVTweaks.itemLink, "Iron Link");
	    LanguageRegistry.addName(ItemsVTweaks.itemPlate, "Iron Plate");
	    
    	LanguageRegistry.instance().addStringLocalization("itemGroup.mcx.vtweaks", "MC-Extreme: Vanilla Tweaks");
    }
}
