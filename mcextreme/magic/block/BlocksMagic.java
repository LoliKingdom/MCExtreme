package mcextreme.magic.block;

import cpw.mods.fml.common.registry.GameRegistry;
import mcextreme.magic.MCExtremeMagic;
import mcextreme.magic.PropertiesMagic;
import mcextreme.magic.item.ItemBlockMagic;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class BlocksMagic
{
	public static final int liquidDarkID = 1700;
	
    public static Block blockMagicPortal;
    public static Block blockOre, blockStorage;
    public static Block blockSolidEvil;
    public static Block blockLiquidDark;
    
    public static Material materialDark;
    
    public static Fluid fluidDarkness;
    
    public static void initBlocks()
    {
        fluidDarkness = new FluidDark().setBlockID(liquidDarkID);
    	
        blockMagicPortal = new BlockMagicPortal(PropertiesMagic.blockMagicPortalID).setHardness(-1.0F).setResistance(6000000.0F).setLightValue(1.0F).setUnlocalizedName("portalMagic");
        //Corrupt Stuff
        blockSolidEvil = new BlockSolidEvil(PropertiesMagic.blockSolidEvilID, Material.rock).setHardness(50.0F).setResistance(2000.0F).setUnlocalizedName("solidEvil").setCreativeTab(MCExtremeMagic.tabXMagic);
        blockLiquidDark = new BlockLiquidDark(liquidDarkID).setUnlocalizedName("liquidDarkness");
        
        blockOre = new BlockOreMagic(PropertiesMagic.blockOreID, "ORE", Material.rock).setHardness(3.0F).setResistance(1.5F).setUnlocalizedName("oreAquamarine");
        blockStorage = new BlockOreStorageMagic(PropertiesMagic.blockStorageID, "STORAGE", Material.iron).setHardness(3.0F).setResistance(1.5F).setUnlocalizedName("blockAquamarine");
        
        Item.itemsList[PropertiesMagic.blockOreID] = new ItemBlockMagic(PropertiesMagic.blockOreID).setUnlocalizedName("blockOreID"); 
        Item.itemsList[PropertiesMagic.blockStorageID] = new ItemBlockMagic(PropertiesMagic.blockStorageID).setUnlocalizedName("blockStorageID");
    }
}
