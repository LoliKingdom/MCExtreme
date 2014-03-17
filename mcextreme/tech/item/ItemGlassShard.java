package mcextreme.tech.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGlassShard extends Item
{

	public ItemGlassShard(int i) {
		super(i);
	}

	
	public void addInformation(ItemStack stack, EntityPlayer player, List descriptionList, boolean b) 
    {
		descriptionList.add("I'm spiky :P");
    }
}
