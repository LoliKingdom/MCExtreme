package mcextreme.utilities.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mcextreme.core.MCExtremeCore;
import mcextreme.core.config.MCExtremeConfig;
import mcextreme.core.utils.MCExtremeUtils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlocksUtilities
{
    public static Block blockSandbag, blockBin;
    
    public static void initBlocks()
    {
    	blockSandbag = new Block(MCExtremeConfig.blockSandbagID, Material.sand).setResistance(10F).setHardness(2F).setUnlocalizedName("blockSandbag").setCreativeTab(MCExtremeCore.tabUtilities);
    	blockBin = new BlockBin(MCExtremeConfig.blockBinID, Material.iron).setUnlocalizedName("blockBin").setCreativeTab(MCExtremeCore.tabUtilities);
    	        
    	MCExtremeUtils.registerDefaultBlocks(blockSandbag, blockBin);
    	GameRegistry.registerTileEntity(TileEntityBin.class, "tileBin");
    }
}
