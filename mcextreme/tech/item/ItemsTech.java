package mcextreme.tech.item;

import mcextreme.config.MCExtremeConfig;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemsTech
{
    public static Item itemIngot;
    
    public static void initItems()
    {
        itemIngot = new ItemIngotsTech(MCExtremeConfig.itemTechIngotID, "INGOT").setUnlocalizedName("ingotMCExtreme");
    }
    
}
