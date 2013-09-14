package mcextreme.magic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlocksMagic
{
    public static Block blockMagicPortal;
    public static Block blockOre, blockStorage;
    
    public static void initBlocks()
    {
        blockMagicPortal = new BlockMagicPortal(PropertiesMagic.blockMagicPortalID).setHardness(-1.0F).setResistance(6000000.0F).setLightValue(1.0F).setUnlocalizedName("portalMagic");
        
        blockOre = new BlockOreMagic(PropertiesMagic.blockOreID, "ORE", Material.rock).setHardness(3.0F).setResistance(1.5F).setUnlocalizedName("oreAluminium");
        blockStorage = new BlockOreStorageMagic(PropertiesMagic.blockStorageID, "STORAGE", Material.iron).setHardness(3.0F).setResistance(1.5F).setUnlocalizedName("blockAluminium");
        
        Item.itemsList[PropertiesMagic.blockOreID] = new ItemBlockMagic(PropertiesMagic.blockOreID).setUnlocalizedName("blockOreID"); 
        Item.itemsList[PropertiesMagic.blockStorageID] = new ItemBlockMagic(PropertiesMagic.blockStorageID).setUnlocalizedName("blockStorageID"); 
    }
}
