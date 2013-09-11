package mcextreme.magic;

import mcextreme.magic.BlockMagicPortal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlocksMagic
{
    public static Block blockMagicPortal;
    
    public static void initBlocks()
    {
        blockMagicPortal = new BlockMagicPortal(PropertiesMagic.blockMagicPortalID).setHardness(-1.0F).setResistance(6000000.0F).setLightValue(1.0F).setUnlocalizedName("portalMagic");
    }
}
