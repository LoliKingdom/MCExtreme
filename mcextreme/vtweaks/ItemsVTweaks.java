package mcextreme.vtweaks;

import net.minecraft.item.Item;

public class ItemsVTweaks 
{
public static Item itemLinkIron;
    
    public static void initItems()
    {
        itemLinkIron = new Item(PropertiesVTweaks.itemLinkIronID).setCreativeTab(MCExtremeVTweaks.tabXVTweaks).setUnlocalizedName("linkIron").setTextureName("mcextreme:linkIron");
    }

}
