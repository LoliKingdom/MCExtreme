package mcextreme.vtweaks;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.OreDictionary;

public class CraftingVTweaks
{
	public static void removeRecipes()
	{
		Iterator<IRecipe> iterator = CraftingManager.getInstance().getRecipeList().iterator();

		while (iterator.hasNext())
		{
		        IRecipe recipe = iterator.next();
		        if (recipe == null)
		                continue;
		        ItemStack output = recipe.getRecipeOutput();
		        if (output != null && output.itemID == Block.bookShelf.blockID)
		                iterator.remove();
		}
		
        Collection<Item> removeSet = new HashSet();
        Collections.addAll(removeSet, new Item[] {Item.helmetChain, Item.plateChain, Item.legsChain, Item.bootsChain, Item.helmetIron, Item.plateIron, Item.legsIron, Item.bootsIron});
        Iterator<IRecipe> iterator1 = CraftingManager.getInstance().getRecipeList().iterator();

        while (iterator1.hasNext())
        {
        	IRecipe recipe = iterator1.next();
        	if (recipe == null) 
        		continue;
        	
        	ItemStack output = recipe.getRecipeOutput();
        	if (output != null && output.getItem() != null && removeSet.contains(output.getItem())) 
        		iterator1.remove();
        }
    }
	
    public static void addRecipes()
    {
        CraftingManager.getInstance().addRecipe(new ItemStack(Item.helmetChain), new Object[] {"###", "# #", '#', ItemsVTweaks.itemLinkIron});
        CraftingManager.getInstance().addRecipe(new ItemStack(Item.plateChain), new Object[] {"# #", "###", "###", '#', ItemsVTweaks.itemLinkIron});
        CraftingManager.getInstance().addRecipe(new ItemStack(Item.legsChain), new Object[] {"###", "# #", "# #", '#', ItemsVTweaks.itemLinkIron});
        CraftingManager.getInstance().addRecipe(new ItemStack(Item.bootsChain), new Object[] {"# #", "# #", '#', ItemsVTweaks.itemLinkIron});
    }
}
