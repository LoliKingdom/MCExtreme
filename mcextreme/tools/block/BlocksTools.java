package mcextreme.tools.block;

import mcextreme.core.MCExtremeCore;
import mcextreme.core.config.MCExtremeConfig;
import mcextreme.core.utils.MCExtremeUtils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlocksTools {
	
	public static Block blockPatternWorkBench;
	
	
	public static void initBlocks()
	{
		
		blockPatternWorkBench = new Block(MCExtremeConfig.blockPatternWorkBenchID, Material.wood).setUnlocalizedName("patternWorkBench").setCreativeTab(MCExtremeCore.tabTools);
		
		MCExtremeUtils.registerDefaultBlocks(blockPatternWorkBench);

}
}
