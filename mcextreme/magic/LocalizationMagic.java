package mcextreme.magic;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationMagic
{
    public static void addNames()
    {
        LanguageRegistry.addName(BlocksMagic.blockMagicPortal, "Magic Portal");
        
        //Tabs
    	LanguageRegistry.instance().addStringLocalization("itemGroup.extreme_tab_magic", "MC-Extreme: Magic");
    }
}
