package mcextreme.utilities.blocks;

import cpw.mods.fml.common.network.FMLNetworkHandler;
import mcextreme.core.MCExtremeCore;
import mcextreme.utilities.MCExtremeUtilities;
import mcextreme.utilities.client.BinRenderer;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockBin extends BlockContainer
{
    public static Icon[] textures = new Icon[6];
    
    public BlockBin(int blockID, Material material)
    {
        super(blockID, material);
    }
    
    @Override
    public TileEntity createNewTileEntity(World world)
    {
        return new TileEntityBin();
    }
    
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if (!world.isRemote) FMLNetworkHandler.openGui(player, MCExtremeUtilities.instance, 400, world, x, y, z);
        return true;
    }
    
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        for (int i = 0; i < 6; i++)
            textures[i] = iconRegister.registerIcon("mcextreme:util/bin" + (i + 1));
    }
    
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @Override
    public int getRenderType()
    {
        return BinRenderer.renderID;
    }
}