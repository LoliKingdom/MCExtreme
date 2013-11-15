package mcextreme.utilties.blocks;

import mcextreme.utilities.MCExtremeUtilities;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBin extends TileEntity
{
	private ItemStack[] binContents = new ItemStack[27];
	
    /** The current angle of the chest lid (between 0 and 1) */
    public float lidAngle;

    /** The angle of the chest lid last tick */
    public float prevLidAngle;

    /** The number of players currently using this ender chest. */
    public int numUsingPlayers;

    /** Server sync counter (once per 20 ticks) */
    private int ticksSinceSync;

    /**
     * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
     * ticks and creates a new spawn inside its implementation.
     */
    public void updateEntity()
    {
        super.updateEntity();
        //this.decrStackSize(numUsingPlayers, numUsingPlayers);
        this.binContents.equals(0);
    }

    /**
     * Called when a client event is received with the event number and argument, see World.sendClientEvent
     */
    public boolean receiveClientEvent(int par1, int par2)
    {
        if (par1 == 1)
        {
            this.numUsingPlayers = par2;
            return true;
        }
        else
        {
            return super.receiveClientEvent(par1, par2);
        }
    }

    /**
     * invalidates a tile entity
     */
    public void invalidate()
    {
        this.updateContainingBlockInfo();
        super.invalidate();
    }

    public void openChest()
    {
        ++this.numUsingPlayers;
        this.worldObj.addBlockEvent(this.xCoord, this.yCoord, this.zCoord, BlocksUtilities.blockBin.blockID, 1, this.numUsingPlayers);
    }

    public void closeChest()
    {
        --this.numUsingPlayers;
        this.worldObj.addBlockEvent(this.xCoord, this.yCoord, this.zCoord, BlocksUtilities.blockBin.blockID, 1, this.numUsingPlayers);
    }

    public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer)
    {
        return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : par1EntityPlayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }
    public ItemStack decrStackSize(int par1, int par2)
    {
        if (this.binContents[par1] != null)
        {
            ItemStack itemstack;

            if (this.binContents[par1].stackSize <= par2)
            {
                itemstack = this.binContents[par1];
                this.binContents[par1] = null;
                this.onInventoryChanged();
                return itemstack;
            }
            else
            {
                itemstack = this.binContents[par1].splitStack(par2);

                if (this.binContents[par1].stackSize == 0)
                {
                    this.binContents[par1] = null;
                }

                this.onInventoryChanged();
                return itemstack;
            }
        }
        else
        {
            return null;
        }
    }
}
