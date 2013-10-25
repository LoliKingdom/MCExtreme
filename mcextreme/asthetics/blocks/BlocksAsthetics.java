package mcextreme.asthetics.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mcextreme.core.config.MCExtremeConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlocksAsthetics 
{
	public static Block blockBone;

	 public static void initBlocks()
	    {
		blockBone = new Block(MCExtremeConfig.blockBoneID, Material.rock).setUnlocalizedName("blockBone");
		
		GameRegistry.registerBlock(blockBone, "Bone Block");
	    }
}
