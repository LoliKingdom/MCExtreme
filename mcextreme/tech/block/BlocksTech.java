package mcextreme.tech.block;

import mcextreme.core.MCExtremeCore;
import mcextreme.core.config.MCExtremeConfig;
import mcextreme.core.utils.MCExtremeUtils;
import mcextreme.tech.item.ItemBlockTech;
import mcextreme.tech.tileentity.TileEntityCompressor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlocksTech
{
	public static final int liquidConcreteID = mcextreme.core.config.MCExtremeConfig.blockLiquidConcreteID;
	
    public static Block blockOre, blockStorage, blockBasicMachine, blockCompressor, blockCompressorActive, blockRebar;
    
    public static Block blockLiquidConcrete;
    
    public static Fluid fluidConcrete;
    
    public static void initBlocks()
    {
    	fluidConcrete = new FluidConcrete().setBlockID(liquidConcreteID);
    	
        blockOre = new BlockOreTech(MCExtremeConfig.blockTechOreID, "ORE", Material.rock).setHardness(3.0F).setResistance(1.5F).setUnlocalizedName("blockTechOre");
        blockStorage = new BlockOreStorageTech(MCExtremeConfig.blockTechStorageID, "STORAGE", Material.iron).setHardness(3.0F).setResistance(1.5F).setUnlocalizedName("blockTechStorage");
        blockBasicMachine = new BlockBasicMachine(MCExtremeConfig.blockBasicMachineID, "BREAKER").setHardness(3.5F).setUnlocalizedName("blockBasicMachine").setCreativeTab(MCExtremeCore.tabTech);
        blockCompressor = new BlockCompressor(MCExtremeConfig.blockCompressorID, false).setHardness(3.5F).setCreativeTab(MCExtremeCore.tabTech);
        blockCompressorActive = new BlockCompressor(MCExtremeConfig.blockCompressorActiveID, true).setHardness(3.5F).setLightValue(1.0F);
        blockLiquidConcrete = new BlockLiquidConcrete(liquidConcreteID).setUnlocalizedName("liquidConcrete").setCreativeTab(MCExtremeCore.tabTech);
        blockRebar = new Block(MCExtremeConfig.blockRebarID, Material.iron).setUnlocalizedName("rebar").setCreativeTab(MCExtremeCore.tabTech);
        
        Item.itemsList[MCExtremeConfig.blockTechOreID] = new ItemBlockTech(MCExtremeConfig.blockTechOreID).setUnlocalizedName("blockOreID");
        Item.itemsList[MCExtremeConfig.blockTechStorageID] = new ItemBlockTech(MCExtremeConfig.blockTechStorageID).setUnlocalizedName("blockStorageID");
        Item.itemsList[MCExtremeConfig.blockBasicMachineID] = new ItemBlockTech(MCExtremeConfig.blockBasicMachineID).setUnlocalizedName("blockBasicMachine");
        
        MCExtremeUtils.registerDefaultBlocks(blockBasicMachine, blockCompressor, blockCompressorActive);
        
        GameRegistry.registerTileEntity(TileEntityCompressor.class, "tileEntityCompressor");
        GameRegistry.registerBlock(blockRebar, "Rebar");
        GameRegistry.registerBlock(blockLiquidConcrete, "Liquid Concrete");
    }
}
