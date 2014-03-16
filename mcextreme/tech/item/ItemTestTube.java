package mcextreme.tech.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import mcextreme.core.MCExtremeCore;
import mcextreme.tech.entity.EntityTestTube;

public class ItemTestTube extends Item
{ //Not even sure If I did this right, will fix laterz
    public ItemTestTube(int par1)
    {
        super(par1);
        setUnlocalizedName("itemTestTube");
        setCreativeTab(MCExtremeCore.tabTech);
        //Just because 16 is epic. K? Got a fucking problem?
        maxStackSize = 16;
    }

    /**
* This below is the code for damaging entities with the DrugTube - Wait til' we got the DAMN ENUMS!
*/
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
{
if (!par3EntityPlayer.capabilities.isCreativeMode)
{
--par1ItemStack.stackSize;
}

par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

if (!par2World.isRemote)
{
par2World.spawnEntityInWorld(new EntityTestTube(par2World, par3EntityPlayer));
}

return par1ItemStack;
}

}