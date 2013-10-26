package mcextreme.aesthetics.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mcextreme.core.config.MCExtremeConfig;
import mcextreme.core.utils.MCExtremeUtils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlocksAesthetics 
{
    public static Block blockBone;

    public static void initBlocks()
    {
        blockBone = new Block(MCExtremeConfig.blockBoneID, Material.rock).setUnlocalizedName("blockBone");
		MCExtremeUtils.registerDefaultBlock(blockBone);
    }
}
