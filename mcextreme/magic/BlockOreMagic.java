package mcextreme.magic;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class BlockOreMagic extends Block
{
	public static String[] names = new String[] {"oreAquamarine"};
    public Icon[] textures;
    
    public BlockOreMagic(int blockID, String type, Material blockMaterial)
    {
        super(blockID, blockMaterial);
        this.setCreativeTab(MCExtremeMagic.tabXMagic);
    }
    
    public void getSubBlocks(int blockID, CreativeTabs tab, List tabList)
    {
    	for (int meta = 0; meta < names.length; ++meta)
    	{
	        tabList.add(new ItemStack(this, 1, meta));
    	}
    }
    
    public void registerIcons(IconRegister iconRegistry)
    {
    	this.textures = new Icon[names.length];
    	
    	for (int meta = 0; meta < names.length; ++meta)
    	{
    		this.textures[meta] = iconRegistry.registerIcon("mcxmagic:" + names[meta]);
    	}
    }
    
    public Icon getIcon(int side, int meta)
    {
        return meta < names.length ? textures[meta] : textures[0];
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ItemsMagic.itemCrystal.itemID;
    }
    
    public int damageDropped (int meta) 
    {
    	return meta;
    }
    
    public String getUnlocalizedName() 
    {
    	ItemStack stack = new ItemStack(BlocksMagic.blockOre);
    	
    	return names[stack.getItemDamage()];
    }
}
