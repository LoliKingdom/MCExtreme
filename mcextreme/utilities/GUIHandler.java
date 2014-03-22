package mcextreme.utilities;

import mcextreme.utilities.blocks.ContainerBin;
import mcextreme.utilities.blocks.GUIBin;
import mcextreme.utilities.blocks.TileEntityBin;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler
{
    //0xx ... MCX Aesthetics
    //1xx ... MCX Magic
    //2xx ... MCX Tech
    //3xx ... MCX Tools
    //4xx ... MCX Utils
    //5xx ... MCX VTweaks
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if (ID == 400) return new ContainerBin((TileEntityBin) world.getBlockTileEntity(x, y, z), player.inventory);
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if (ID == 400) return new GUIBin((ContainerBin) getServerGuiElement(ID, player, world, x, y, z));
        return null;
    }
    
}
