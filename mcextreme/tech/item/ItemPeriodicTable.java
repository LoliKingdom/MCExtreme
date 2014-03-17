package mcextreme.tech.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcextreme.core.MCExtremeCore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemPeriodicTable extends Item
{

	private Icon icon;

	public ItemPeriodicTable(int i) {
		super(i);
		setMaxStackSize(1);
		setCreativeTab(MCExtremeCore.tabTech);
		
		
		
	}
	
	//Register Icons
	
	/*@SideOnly(Side.CLIENT)
	  public void registerIcons(IconRegister ir)
	  {
	    this.icon = ir.registerIcon("");
	  }*/
	
	public void addInformation(ItemStack stack, EntityPlayer player, List descriptionList, boolean b) 
    {
		descriptionList.add("The More you KNOW!");
    }

}
