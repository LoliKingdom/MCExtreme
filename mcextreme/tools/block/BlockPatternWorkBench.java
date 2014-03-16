package mcextreme.tools.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPatternWorkBench extends Block
{

	public BlockPatternWorkBench(int blockID, String blockType) 
	{
		super(blockID, Material.wood);
		this.setUnlocalizedName("patternWorkBench");
		
	}

}
