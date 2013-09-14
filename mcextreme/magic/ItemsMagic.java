package mcextreme.magic;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemsMagic
{
    public static Item itemCrystal;
    
    public static void initItems()
    {
        itemCrystal = new ItemCrystalsMagic(PropertiesMagic.itemCrystalID, "CRYSTAL").setUnlocalizedName("cystalAquamarine");
    }
    
}
