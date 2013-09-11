package mcextreme.tech;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemIngotsTech extends Item
{
	//GENERAL3214: Uranium, Mercury, Tungsten, Lead gravity
    public static String[] names = new String[] {"ingotAluminium", "ingotCopper", "ingotLead", "ingotNickel", "ingotPlatinum", "ingotSilver", "ingotTin", "ingotZinc"};
    public Icon[] textures;
    
    public ItemIngotsTech(int itemID, String type)
    {
        super(itemID);
        this.setHasSubtypes(true);
        this.setCreativeTab(MCExtremeTech.tabXTech);
    }
    
    public void getSubItems(int itemID, CreativeTabs tab, List tabList)
    {
    	for (int meta = 0; meta < names.length; ++meta)
    	{
	        tabList.add(new ItemStack(itemID, 1, meta));
    	}
    }
    
    public void registerIcons(IconRegister iconRegistry)
    {
    	this.textures = new Icon[names.length];
    	
    	for (int meta = 0; meta < names.length; ++meta)
    	{
    		this.textures[meta] = iconRegistry.registerIcon("mcextreme:" + names[meta]);
    	}
    }
    
    public Icon getIconFromDamage(int meta)
    {
    	return meta < names.length ? textures[meta] : textures[0];
    }
    
    public String getUnlocalizedName()
    {
    	ItemStack stack = new ItemStack(ItemsTech.itemIngot);
    	
        return names[stack.getItemDamage()];
    }
    
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) 
    {
    	for (int meta = 0; meta < names.length; ++meta)
    	{
	    	if (par1ItemStack.getItemDamage() == meta)
	    	{
	    		//\u00a7 http://www.minecraftwiki.net/wiki/Classic_server_protocol#Color_Codes
	    		String[] periodic = new String[] {"13 Al", "29 Cu", "82 Pb", "28 Ni", "78 Pt", "47 Ag", "50 Sn", "30 Zn"};
	    		
	    		par3List.add(periodic[meta]);
	    	}
	    	
	    	else
	    	{
	    		
	    	}
    	}
    }
}
