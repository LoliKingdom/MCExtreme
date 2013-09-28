package mcextreme.magic.block;

import cpw.mods.fml.common.registry.GameRegistry;
import mcextreme.config.MCExtremeConfig;
import mcextreme.core.MCExtremeCore;
import mcextreme.magic.MCExtremeMagic;
import mcextreme.magic.item.ItemBlockMagic;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class BlocksMagic
{
	public static final int liquidDarkID = 1700;
	
    public static Block blockMagicPortal;
    public static Block blockOre, blockStorage;
    public static Block blockSolidEvil;
    public static Block blockWorldsEnd;
    public static Block blockLiquidDark;
    
    public static Material materialDark;
    
    public static Fluid fluidDarkness;
    
    public static void initBlocks()
    {
        fluidDarkness = new FluidDark().setBlockID(liquidDarkID);
    	
        blockMagicPortal = new BlockMagicPortal(MCExtremeConfig.blockMagicPortalID).setHardness(-1.0F).setResistance(6000000.0F).setLightValue(1.0F).setUnlocalizedName("portalMagic");
        //Corrupt Stuff
        blockSolidEvil = new BlockSolidEvil(MCExtremeConfig.blockSolidEvilID, Material.rock).setHardness(50.0F).setResistance(2000.0F).setUnlocalizedName("solidEvil").setCreativeTab(MCExtremeCore.tabMagic);
        blockWorldsEnd = new BlockWorldsEnd(MCExtremeConfig.blockWorldsEndID, Material.rock).setHardness(-1.0F).setResistance(6000000.0F).setUnlocalizedName("worldEnd").setCreativeTab(CreativeTabs.tabDecorations);
        blockLiquidDark = new BlockLiquidDark(liquidDarkID).setUnlocalizedName("liquidDarkness");
        
        blockOre = new BlockOreMagic(MCExtremeConfig.blockMagicOreID, "ORE", Material.rock).setHardness(3.0F).setResistance(1.5F).setUnlocalizedName("oreAquamarine");
        blockStorage = new BlockOreStorageMagic(MCExtremeConfig.blockMagicStorageID, "STORAGE", Material.iron).setHardness(3.0F).setResistance(1.5F).setUnlocalizedName("blockAquamarine");
        
        Item.itemsList[MCExtremeConfig.blockMagicOreID] = new ItemBlockMagic(MCExtremeConfig.blockMagicOreID).setUnlocalizedName("blockOreID"); 
        Item.itemsList[MCExtremeConfig.blockMagicStorageID] = new ItemBlockMagic(MCExtremeConfig.blockMagicStorageID).setUnlocalizedName("blockStorageID");

        GameRegistry.registerBlock(BlocksMagic.blockSolidEvil, "Solidified Evil");
        GameRegistry.registerBlock(BlocksMagic.blockWorldsEnd, "The End of the World as you knew it");
        GameRegistry.registerBlock(BlocksMagic.blockLiquidDark, "Liquid Darkness");
    }
}
