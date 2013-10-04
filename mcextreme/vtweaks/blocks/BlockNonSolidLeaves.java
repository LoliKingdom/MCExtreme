package mcextreme.vtweaks.blocks;

import net.minecraft.block.BlockLeaves;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
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
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
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
	
	public int getRenderBlockPass()
    {
        return 1;
    }
	
	public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side)
    {
	    return world.getBlockId(x, y, z) == blockID ? false : super.shouldSideBeRendered(world, x, y, z, side);
    }
	
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity entity)
    {
    	entity.motionX *= 0.3D;
        entity.motionZ *= 0.3D;
    }
}
