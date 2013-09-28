package mcextreme.magic.item;

import mcextreme.magic.PropertiesMagic;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;


public class ItemsMagic
{
	public static Item bucketDarkness;
    public static Item itemCrystal;
    
    public static void initItems()
    {
        itemCrystal = new ItemCrystalsMagic(PropertiesMagic.itemCrystalID, "CRYSTAL").setUnlocalizedName("cystalAquamarine");
        bucketDarkness = new Item(PropertiesMagic.itembucketdarkID).setUnlocalizedName("darkBucket").setTextureName("mcextreme:/magic/darkBucket");
    }
    
}
