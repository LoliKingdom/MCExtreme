package mcextreme.tech.item;

import mcextreme.tech.PropertiesTech;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemsTech
{
    public static Item itemIngot;
    
    public static void initItems()
    {
        itemIngot = new ItemIngotsTech(PropertiesTech.itemIngotID, "INGOT").setUnlocalizedName("ingotAluminium");
    }
    
}
