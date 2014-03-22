package mcextreme.utilities.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerBin extends Container
{
    public TileEntityBin tileBin;
    
    public ContainerBin(TileEntityBin tileBin, InventoryPlayer invPlayer)
    {
        this.tileBin = tileBin;
        
        // ======================================//
        // PLAYER INVENTORY SLOTS
        // ======================================//
        
        for (int x = 0; x < 9; x++)
        {
            addSlotToContainer(new Slot(invPlayer, x, 8 + 18 * x, 142));
        }
        
        for (int y = 0; y < 3; y++)
        {
            for (int x = 0; x < 9; x++)
            {
                addSlotToContainer(new Slot(invPlayer, x + y * 9 + 9, 8 + 18 * x, 84 + y * 18));
            }
        }

        addSlotToContainer(new Slot(tileBin, 0, 80, 33));
    }
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotID)
    {
        return null;
    }
    
    @Override
    public boolean canInteractWith(EntityPlayer entityplayer)
    {
        return tileBin.isUseableByPlayer(entityplayer);
    }
}