package mcextreme.vtweaks.blocks;

import net.minecraft.block.BlockLeaves;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockNonSolidLeaves extends BlockLeaves
{
	public BlockNonSolidLeaves(int id) 
	{
		super(id);
	}
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		return null;
	}
	    
	public boolean renderAsNormalBlock()
	{
		return false;	
	}
	
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	public int getRenderType()
    {
        return 0;
    }
	
	public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return true;
    }
}
