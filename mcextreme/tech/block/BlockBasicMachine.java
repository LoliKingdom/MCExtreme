package mcextreme.tech.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;

public class BlockBasicMachine extends Block
{
    public Icon[] textures = new Icon[6];
    public static int[][] textureReferences = new int[][] {{ 1, 0, 2, 2, 2, 2 }, { 0, 1, 4, 4, 4, 4 }, { 5, 5, 3, 5, 0, 1 }, { 3, 3, 5, 3, 1, 0 }, { 2, 2, 0, 1, 5, 3 }, { 4, 4, 1, 0, 3, 5 }};
    
    public BlockBasicMachine(int blockID)
    {
        super(blockID, Material.iron);
    }
    
    public Icon getIcon(int side, int metadata)
    {
        return side >= 0 && side <=5 && metadata >= 0 && metadata <= 5 ? textures[textureReferences[metadata][side]] : textures[1];
    }
    
    public void registerIcons(IconRegister iconRegistry)
    {
        textures[0] = iconRegistry.registerIcon("mcextreme:tech/blockbreaker/blockBreaker_front");
        textures[1] = iconRegistry.registerIcon("mcextreme:tech/blockbreaker/blockBreaker_back");
        textures[2] = iconRegistry.registerIcon("mcextreme:tech/blockbreaker/blockBreakerSide0");
        textures[3] = iconRegistry.registerIcon("mcextreme:tech/blockbreaker/blockBreakerSide1");
        textures[4] = iconRegistry.registerIcon("mcextreme:tech/blockbreaker/blockBreakerSide2");
        textures[5] = iconRegistry.registerIcon("mcextreme:tech/blockbreaker/blockBreakerSide3");
    }
}
