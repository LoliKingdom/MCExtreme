package mcextreme.tech.item;

import mcextreme.core.MCExtremeCore;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.ItemFluidContainer;

public class ItemConcreteBucket extends ItemFluidContainer
{

	public ItemConcreteBucket(int par1) 
	{
		super(par1);
		this.setCreativeTab(MCExtremeCore.tabTech);
		this.setContainerItem(Item.bucketEmpty);
	}
}
