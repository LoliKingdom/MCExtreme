package mcextreme.tech.item;

import java.util.List;

import mcextreme.core.MCExtremeCore;
import mcextreme.tech.block.BlocksTech;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemScrewdriver extends Item
{
    public ItemScrewdriver(int itemID)
    {
        super(itemID);
        setMaxStackSize(1);
        setMaxDamage(249);
        setTextureName("mcextreme:tech/screwdriver");
        setCreativeTab(MCExtremeCore.tabTech);
    }
    
    public void addInformation(ItemStack stack, EntityPlayer player, List descriptionList, boolean b) 
    {
        descriptionList.add((250 - stack.getItemDamage()) + " use" + (stack.getItemDamage() == 249 ? "" : "s") + " left");
    }
    
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
        if (world.getBlockId(x, y, z) == 0) return false;
        if (world.getBlockId(x, y, z) == BlocksTech.blockBasicMachine.blockID)
        {
            int meta = world.getBlockMetadata(x, y, z);
            if (meta < 6)
            {
                world.setBlockMetadataWithNotify(x, y, z, (meta == 5 ? 0 : meta + 1), 3);
                stack.damageItem(1, player);
            }
        }
        
        return false;
    }
}
