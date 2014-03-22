package mcextreme.utilities.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBin extends TileEntity implements ISidedInventory
{
    public ItemStack inventory;
    public static final int[] slots = new int[] { 0 };
    
    @Override
    public void updateEntity() 
    {
        inventory = null;
    }
    
    @Override
    public int getSizeInventory()
    {
        return 1;
    }

    @Override
    public ItemStack getStackInSlot(int slotID)
    {
        return inventory;
    }

    @Override
    public ItemStack decrStackSize(int slotID, int amount)
    {
        ItemStack stack = getStackInSlot(slotID);
        
        if (stack != null)
        {
            ItemStack temp;
            temp = stack.copy();
            
            if (amount >= stack.stackSize)
            {
                setInventorySlotContents(slotID, null);
                
                temp.stackSize = stack.stackSize;
            }
            else 
            {
                setInventorySlotContents(slotID, new ItemStack(stack.itemID, stack.stackSize - amount, stack.getItemDamage()));
                
                temp.stackSize = amount;
            }
            
            return temp;
        }
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slotID)
    {
        ItemStack returnStack = getStackInSlot(slotID);
        
        setInventorySlotContents(slotID, null);
        
        return returnStack;
    }

    @Override
    public void setInventorySlotContents(int slotID, ItemStack stack)
    {
        if (stack != null && stack.stackSize > getInventoryStackLimit())
        {
            stack.stackSize = getInventoryStackLimit();
        }
        
        inventory = stack;
        
        onInventoryChanged();
    }

    @Override
    public String getInvName()
    {
        return "TrashBin";
    }

    @Override
    public boolean isInvNameLocalized()
    {
        return false;
    }

    @Override
    public int getInventoryStackLimit()
    {
        return 64;
    }

    @Override
    public void onInventoryChanged()
    {
        inventory = null;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entityplayer)
    {
        return entityplayer.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) <= 64;
    }

    @Override
    public void openChest() { }

    @Override
    public void closeChest() { }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack)
    {
        return true;
    }

    @Override
    public int[] getAccessibleSlotsFromSide(int side)
    {
        return slots;
    }

    @Override
    public boolean canInsertItem(int slotID, ItemStack stack, int side)
    {
        return true;
    }

    @Override
    public boolean canExtractItem(int slotID, ItemStack stack, int side)
    {
        return false;
    }
}
