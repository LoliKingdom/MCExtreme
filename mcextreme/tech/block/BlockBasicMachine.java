package mcextreme.tech.block;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBasicMachine extends Block
{
    public Icon[] textures = new Icon[12];
    public static int[][] textureReferences = new int[][] {{ 1, 0, 2, 2, 2, 2 }, { 0, 1, 4, 4, 4, 4 }, { 5, 5, 3, 5, 0, 1 }, { 3, 3, 5, 3, 1, 0 }, { 2, 2, 0, 1, 5, 3 }, { 4, 4, 1, 0, 3, 5 }};
    
    public BlockBasicMachine(int blockID)
    {
        super(blockID, Material.iron);
    }
    
    public Icon getIcon(int side, int metadata)
    {
        return metadata > 5 ? (side >= 0 && side <= 5 && metadata <= 11 ? textures[textureReferences[metadata - 6][side] + 6] : textures[1]) : (side >= 0 && side <=5 && metadata >= 0 ? textures[textureReferences[metadata][side]] : textures[1]);
    }
    
    public void registerIcons(IconRegister iconRegistry)
    {
        textures[0] = iconRegistry.registerIcon("mcextreme:tech/basic/blockBreakerFront");
        textures[1] = iconRegistry.registerIcon("mcextreme:tech/basic/blockBreakerBack");
        textures[2] = iconRegistry.registerIcon("mcextreme:tech/basic/blockBreakerSide0");
        textures[3] = iconRegistry.registerIcon("mcextreme:tech/basic/blockBreakerSide1");
        textures[4] = iconRegistry.registerIcon("mcextreme:tech/basic/blockBreakerSide2");
        textures[5] = iconRegistry.registerIcon("mcextreme:tech/basic/blockBreakerSide3");

        textures[6] = iconRegistry.registerIcon("mcextreme:tech/basic/blockPlacerFront");
        textures[7] = iconRegistry.registerIcon("mcextreme:tech/basic/blockPlacerBack");
        textures[8] = textures[4];
        textures[9] = textures[5];
        textures[10] = textures[2];
        textures[11] = textures[3];
    }
    
    public void onNeighborBlockChange(World world, int x, int y, int z, int neighborID)
    {
        if (world.isRemote) return;
        
        int meta = world.getBlockMetadata(x, y, z);
        int xPos = x + (meta == 3 ? 1 : (meta == 2 ? -1 : 0));
        int yPos = y + (meta == 0 ? 1 : (meta == 1 ? -1 : 0));
        int zPos = z + (meta == 5 ? 1 : (meta == 4 ? -1 : 0));
        
        if (world.isBlockIndirectlyGettingPowered(x, y, z) || world.isBlockIndirectlyGettingPowered(x, y + 1, z) || (world.getBlockId(x, y, z) != 0 && Block.blocksList[neighborID].canProvidePower()) && world.getBlockId(xPos, yPos, zPos) != 0)
        {
            ArrayList<ItemStack> returns = Block.blocksList[world.getBlockId(xPos, yPos, zPos)].getBlockDropped(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
            
            if (meta >= 0 && meta <= 5)
            {
                TileEntity tileEntity = world.getBlockTileEntity(x + (meta == 2 ? 1 : (meta == 3 ? -1 : 0)), y + (meta == 1 ? 1 : (meta == 0 ? -1 : 0)), z + (meta == 4 ? 1 : (meta == 5 ? -1 : 0)));
                IInventory inventory = null;
                
                if (tileEntity != null && tileEntity instanceof IInventory) inventory = (IInventory) tileEntity;
                
                ListIterator<ItemStack> returnsIterator = returns.listIterator();
                
                while (returnsIterator.hasNext())
                {
                    ItemStack toPush = returnsIterator.next();
                    System.out.println(toPush);
                    
                    if (inventory != null)
                    {
                        for (int i = 0; i < inventory.getSizeInventory(); i++)
                        {
                            ItemStack stackInSlot = inventory.getStackInSlot(i);
                        
                            if (stackInSlot == null)
                            {
                                inventory.setInventorySlotContents(i, toPush);
                                toPush = null;
                            }
                            else if (stackInSlot.itemID == toPush.itemID)
                            {
                                if ((stackInSlot.stackSize + toPush.stackSize) <= stackInSlot.getMaxStackSize())
                                {
                                    ItemStack copy = stackInSlot.copy();
                                    copy.stackSize += toPush.stackSize;
                                    inventory.setInventorySlotContents(i, copy);
                                    toPush = null;
                                }
                                else if (stackInSlot.stackSize < stackInSlot.getMaxStackSize())
                                {
                                    int toDraw = stackInSlot.getMaxStackSize() - stackInSlot.stackSize;
                                    ItemStack copy = stackInSlot.copy();
                                    copy.stackSize = copy.getMaxStackSize();
                                    inventory.setInventorySlotContents(i, copy);
                                    toPush.stackSize -= toDraw;
                                }
                            }
                        }
                    }
                    
                    if (toPush != null)
                    {
                        EntityItem item = new EntityItem(world, 0.5F + x + (meta == 2 ? 1 : (meta == 3 ? -1 : 0)), 0.5F + y + (meta == 1 ? 1 : (meta == 0 ? -1 : 0)), 0.5F +  z + (meta == 4 ? 1 : (meta == 5 ? -1 : 0)), toPush);
                        item.delayBeforeCanPickup = 10;
                        world.spawnEntityInWorld(item);
                    }
                }
                
                Block.blocksList[world.getBlockId(xPos, yPos, zPos)].breakBlock(world, xPos, yPos, zPos, world.getBlockId(xPos, yPos, zPos), world.getBlockMetadata(xPos, yPos, zPos));
                world.setBlockToAir(xPos, yPos, zPos);
            }
            else if (meta >= 6 && meta <= 11)
            {
                
            }
        }
    }
    
    public void getSubBlocks(int blockID, CreativeTabs tab, List tabList)
    {
        tabList.add(new ItemStack(blockID, 1, 0));
        tabList.add(new ItemStack(blockID, 1, 6));
    }
    
    public int damageDropped(int meta)
    {
        return meta <= 5 ? 0 : (meta <= 11 ? 6 : 0);
    }
    
    public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, int side)
    {
        return true;
    }
}
