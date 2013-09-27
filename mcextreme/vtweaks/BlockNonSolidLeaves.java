package mcextreme.vtweaks;

import net.minecraft.block.BlockLeaves;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockNonSolidLeaves extends BlockLeaves
{
	
	public BlockNonSolidLeaves(int i) 
	{
		super(i);
		
	}
	  public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	  {
	return null;
}
	    public int getRenderBlockPass()
	    {
	        return 0;
	    }
	    
	    public boolean renderAsNormalBlock()
	    {
	    return false;	
	    }
	    public boolean isOpaqueCube()
	    {
	    	return false;
	    }
}
