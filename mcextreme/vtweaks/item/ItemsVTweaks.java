package mcextreme.vtweaks.item;

import mcextreme.config.MCExtremeConfig;
import mcextreme.core.MCExtremeCore;
import mcextreme.vtweaks.MCExtremeVTweaks;
import net.minecraft.item.Item;

public class ItemsVTweaks 
{
	public static Item itemLink;
	public static Item itemPlate;
    
    public static void initItems()
    {
        itemLink = new Item(MCExtremeConfig.itemLinkID).setCreativeTab(MCExtremeCore.tabVanillaTweaks).setUnlocalizedName("linkIron").setTextureName("mcextreme:/vtweaks/linkIron");
        itemPlate = new Item(MCExtremeConfig.itemPlateID).setCreativeTab(MCExtremeCore.tabVanillaTweaks).setUnlocalizedName("plateIron").setTextureName("mcextreme:/vtweaks/plateIron");
    }

}
