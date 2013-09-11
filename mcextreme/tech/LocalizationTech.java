package mcextreme.tech;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationTech
{
	public static String[] oreNames = new String[] {"Bauxite", "Cuprite", "Galena", "Garnierite", "Platinum Ore", "Acanthite", "Cassiterite", "Sphalerite"};
	public static String[] metalBlockNames = new String[] {"Block of Aluminium", "Block of Copper", "Block of Lead", "Block of Nickel", "Block of Platinum", "Block of Silver", "Block of Tin", "Block of Zinc"};
	public static String[] ingotNames = new String[] {"Aluminium Ingot", "Copper Ingot", "Lead Ingot", "Nickel Ingot", "Platinum Ingot", "Silver Ingot", "Tin Ingot", "Zinc Ingot"};
	
    public static void addNames()
    {
    	for (int meta = 0; meta < oreNames.length; ++meta)
    	{
	        LanguageRegistry.addName(new ItemStack(BlocksTech.blockOre, 1, meta), oreNames[meta]);
    	}
    	
    	for (int meta = 0; meta < metalBlockNames.length; ++meta)
    	{
	        LanguageRegistry.addName(new ItemStack(BlocksTech.blockStorage, 1, meta), metalBlockNames[meta]);
    	}
	        
	    for (int meta = 0; meta < ingotNames.length; ++meta)
	    {
	        LanguageRegistry.addName(new ItemStack(ItemsTech.itemIngot, 1, meta), ingotNames[meta]);
    	}
        
        //Tabs
    	LanguageRegistry.instance().addStringLocalization("itemGroup.extreme_tab_tech", "MC-Extreme: Tech");
    }
}
