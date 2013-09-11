package mcextreme.tech;

import mcextreme.magic.BlockMagicPortal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlocksTech
{
    public static Block blockOre, blockStorage;
    
    public static void initBlocks()
    {
        blockOre = new BlockOreTech(PropertiesTech.blockOreID, "ORE", Material.rock).setHardness(3.0F).setResistance(1.5F).setUnlocalizedName("oreAluminium");
        blockStorage = new BlockOreStorageTech(PropertiesTech.blockStorageID, "STORAGE", Material.iron).setHardness(3.0F).setResistance(1.5F).setUnlocalizedName("blockAluminium");

        Item.itemsList[PropertiesTech.blockOreID] = new ItemBlockTech(PropertiesTech.blockOreID).setUnlocalizedName("blockOreID"); 
        Item.itemsList[PropertiesTech.blockStorageID] = new ItemBlockTech(PropertiesTech.blockStorageID).setUnlocalizedName("blockStorage"); 
    }
}
