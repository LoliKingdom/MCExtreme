package mcextreme.tech.block;

import cpw.mods.fml.common.registry.GameRegistry;
import mcextreme.config.MCExtremeConfig;
import mcextreme.core.MCExtremeCore;
import mcextreme.magic.block.BlockMagicPortal;
import mcextreme.tech.item.ItemBlockTech;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlocksTech
{
    public static Block blockOre, blockStorage, blockBasicMachine;
    
    public static void initBlocks()
    {
        blockOre = new BlockOreTech(MCExtremeConfig.blockTechOreID, "ORE", Material.rock).setHardness(3.0F).setResistance(1.5F).setUnlocalizedName("oreAluminium");
        blockStorage = new BlockOreStorageTech(MCExtremeConfig.blockTechStorageID, "STORAGE", Material.iron).setHardness(3.0F).setResistance(1.5F).setUnlocalizedName("blockAluminium");
        blockBasicMachine = new BlockBasicMachine(MCExtremeConfig.blockBasicMachineID).setHardness(3.5F).setUnlocalizedName("blockBasicMachine").setCreativeTab(MCExtremeCore.tabTech);

        Item.itemsList[MCExtremeConfig.blockTechOreID] = new ItemBlockTech(MCExtremeConfig.blockTechOreID).setUnlocalizedName("blockOreID"); 
        Item.itemsList[MCExtremeConfig.blockTechStorageID] = new ItemBlockTech(MCExtremeConfig.blockTechStorageID).setUnlocalizedName("blockStorageID");
        
        GameRegistry.registerBlock(blockBasicMachine, ItemBlock.class, null);
    }
}
