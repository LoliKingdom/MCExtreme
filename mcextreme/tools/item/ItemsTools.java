package mcextreme.tools.item;

import mcextreme.core.config.MCExtremeConfig;
import net.minecraft.item.Item;

public class ItemsTools {

	public static Item itemHammerMjolnir;

	public static void initItems()
	{
		itemHammerMjolnir = new ItemHammerMjolnir(MCExtremeConfig.itemHammerMjolnirID).setUnlocalizedName("itemHammerMjolnir");

	}
}
