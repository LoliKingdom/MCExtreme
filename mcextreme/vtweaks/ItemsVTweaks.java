package mcextreme.vtweaks;

import net.minecraft.item.Item;

public class ItemsVTweaks 
{
	public static Item itemLink;
	public static Item itemPlate;
    
    public static void initItems()
    {
        itemLink = new Item(PropertiesVTweaks.itemLinkID).setCreativeTab(MCExtremeVTweaks.tabXVTweaks).setUnlocalizedName("linkIron").setTextureName("mcxvtweaks:linkIron");
        itemPlate = new Item(PropertiesVTweaks.itemPlateID).setCreativeTab(MCExtremeVTweaks.tabXVTweaks).setUnlocalizedName("plateIron").setTextureName("mcxvtweaks:plateIron");
    }

}
