package mcextreme.vtweaks.item;

import mcextreme.core.MCExtremeCore;
import mcextreme.vtweaks.MCExtremeVTweaks;
import mcextreme.vtweaks.PropertiesVTweaks;
import net.minecraft.item.Item;

public class ItemsVTweaks 
{
	public static Item itemLink;
	public static Item itemPlate;
    
    public static void initItems()
    {
        itemLink = new Item(PropertiesVTweaks.itemLinkID).setCreativeTab(MCExtremeCore.tabVanillaTweaks).setUnlocalizedName("linkIron").setTextureName("mcextreme:/vtweaks/linkIron");
        itemPlate = new Item(PropertiesVTweaks.itemPlateID).setCreativeTab(MCExtremeCore.tabVanillaTweaks).setUnlocalizedName("plateIron").setTextureName("mcextreme:/vtweaks/plateIron");
    }

}
