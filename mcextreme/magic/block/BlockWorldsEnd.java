package mcextreme.magic.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockWorldsEnd extends Block
{
    public BlockWorldsEnd(int par1, Material par2Material) 
	{
        super(par1, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setTickRandomly(true);
	}
    
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("");
    }	

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            for (int l = 0; l < 100; ++l)
            {
                int i1 = par2 + par5Random.nextInt(3) - 1;
                int j1 = par3 + par5Random.nextInt(5) - 3;
                int k1 = par4 + par5Random.nextInt(3) - 1;
                int l1 = par1World.getBlockId(i1, j1 + 1, k1);
                //Most Efficient way I could find, fix this Domi? Should only corrupt natural blocks - Arona
                if (par1World.getBlockId(i1, j1, k1) == Block.grass.blockID
                		)
                {
                    par1World.setBlock(i1, j1, k1, this.blockID);
                }
                	 if (par1World.getBlockId(i1, j1, k1) == Block.dirt.blockID
                     		)
                	 {
                         par1World.setBlock(i1, j1, k1, this.blockID);
                     }
                		 if (par1World.getBlockId(i1, j1, k1) == Block.stone.blockID
                         		)
                		 {
                             par1World.setBlock(i1, j1, k1, this.blockID);
                         }
                			 if (par1World.getBlockId(i1, j1, k1) == Block.wood.blockID
                             		)
                			 {
                                 par1World.setBlock(i1, j1, k1, this.blockID);
                             }
                				 if (par1World.getBlockId(i1, j1, k1) == Block.sand.blockID
                	                		)
                				 {
                	                    par1World.setBlock(i1, j1, k1, this.blockID);
                	                }
                					 if (par1World.getBlockId(i1, j1, k1) == Block.gravel.blockID
                		                		)
                					 {
                		                    par1World.setBlock(i1, j1, k1, this.blockID);
                		                }
                						 if (par1World.getBlockId(i1, j1, k1) == Block.leaves.blockID
                			                		)
                						 {
                			                    par1World.setBlock(i1, j1, k1, this.blockID);
                			                }
                							 if (par1World.getBlockId(i1, j1, k1) == Block.waterStill.blockID
                				                		)
                							 {
                				                    par1World.setBlock(i1, j1, k1, this.blockID);
                				                }
                								 if (par1World.getBlockId(i1, j1, k1) == Block.waterMoving.blockID
                					                		)
                									 
                {
                    par1World.setBlock(i1, j1, k1, this.blockID);
                }
                					

			 if (par1World.getBlockId(i1, j1, k1) == 0)
			 {
				 par1World.setBlock(i1, j1, k1, this.blockID);
			 }

			 if (par1World.getBlockId(i1, j1, k1) == BlocksMagic.blockSolidEvil.blockID)
			 {
				 par1World.setBlock(i1, j1, k1, this.blockID);
			 }
            }
        }
    }
public void registerIcons(IconRegister iconRegistry) 
{
	this.blockIcon = iconRegistry.registerIcon("mcextreme:/magic/worldEnd");
}
}
