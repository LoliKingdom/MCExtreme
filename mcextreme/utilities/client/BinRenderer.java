package mcextreme.utilities.client;

import org.lwjgl.opengl.GL11;

import mcextreme.utilities.blocks.BlockBin;
import mcextreme.utilities.blocks.BlocksUtilities;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class BinRenderer implements ISimpleBlockRenderingHandler
{
    public static int renderID;
    public static final float p = 1F / 16F;
    public static final float p15 = 1F - p;
    public static final float p13 = 1F - (3 * p);
    public static final float p6 = 6 * p, p7 = 7 * p, p9 = 9 * p, p10 = 10 * p;
    
    public static Tessellator t;
    
    public BinRenderer(int renderID)
    {
        BinRenderer.renderID = renderID;
    }
    
    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer)
    {
        t = Tessellator.instance;
        
        t.setBrightness(BlocksUtilities.blockBin.getMixedBrightnessForBlock(world, x, y, z));
        t.setColorOpaque_F(1, 1, 1);
        
        float minU, maxU, minV, maxV;
        
        minU = BlockBin.textures[0].getMinU();
        maxU = BlockBin.textures[0].getMaxU();
        minV = BlockBin.textures[0].getMinV();
        maxV = BlockBin.textures[0].getMaxV();

        vertexUV(x, y, z, p, 0, p, minU, maxV);
        vertexUV(x, y, z, p, 0, p15, maxU, maxV);
        vertexUV(x, y, z, p, p13, p15, maxU, minV);
        vertexUV(x, y, z, p, p13, p, minU, minV);

        vertexUV(x, y, z, p, 0, p15, minU, maxV);
        vertexUV(x, y, z, p15, 0, p15, maxU, maxV);
        vertexUV(x, y, z, p15, p13, p15, maxU, minV);
        vertexUV(x, y, z, p, p13, p15, minU, minV);

        vertexUV(x, y, z, p15, 0, p15, minU, maxV);
        vertexUV(x, y, z, p15, 0, p, maxU, maxV);
        vertexUV(x, y, z, p15, p13, p, maxU, minV);
        vertexUV(x, y, z, p15, p13, p15, minU, minV);

        vertexUV(x, y, z, p15, 0, p, minU, maxV);
        vertexUV(x, y, z, p, 0, p, maxU, maxV);
        vertexUV(x, y, z, p, p13, p, maxU, minV);
        vertexUV(x, y, z, p15, p13, p, minU, minV);
        
        minU = BlockBin.textures[1].getMinU();
        maxU = BlockBin.textures[1].getMaxU();
        minV = BlockBin.textures[1].getMinV();
        maxV = BlockBin.textures[1].getMaxV();
        
        vertexUV(x, y, z, p, 0, p, minU, maxV);
        vertexUV(x, y, z, p15, 0, p, maxU, maxV);
        vertexUV(x, y, z, p15, 0, p15, maxU, minV);
        vertexUV(x, y, z, p, 0, p15, minU, minV);
        
        minU = BlockBin.textures[3].getMinU();
        maxU = BlockBin.textures[3].getMaxU();
        minV = BlockBin.textures[3].getMinV();
        maxV = BlockBin.textures[3].getMaxV();

        vertexUV(x, y, z, 0, p13, 0, minU, maxV);
        vertexUV(x, y, z, 1, p13, 0, maxU, maxV);
        vertexUV(x, y, z, 1, p13, 1, maxU, minV);
        vertexUV(x, y, z, 0, p13, 1, minU, minV);

        vertexUV(x, y, z, 0, p15, 0, minU, maxV);
        vertexUV(x, y, z, 0, p15, 1, maxU, maxV);
        vertexUV(x, y, z, 1, p15, 1, maxU, minV);
        vertexUV(x, y, z, 1, p15, 0, minU, minV);
        
        minU = BlockBin.textures[2].getMinU();
        maxU = BlockBin.textures[2].getMaxU();
        minV = BlockBin.textures[2].getMinV();
        maxV = BlockBin.textures[2].getMaxV();

        vertexUV(x, y, z, 0, p13, 0, minU, maxV);
        vertexUV(x, y, z, 0, p13, 1, maxU, maxV);
        vertexUV(x, y, z, 0, p15, 1, maxU, minV);
        vertexUV(x, y, z, 0, p15, 0, minU, minV);

        vertexUV(x, y, z, 0, p13, 1, minU, maxV);
        vertexUV(x, y, z, 1, p13, 1, maxU, maxV);
        vertexUV(x, y, z, 1, p15, 1, maxU, minV);
        vertexUV(x, y, z, 0, p15, 1, minU, minV);

        vertexUV(x, y, z, 1, p13, 1, minU, maxV);
        vertexUV(x, y, z, 1, p13, 0, maxU, maxV);
        vertexUV(x, y, z, 1, p15, 0, maxU, minV);
        vertexUV(x, y, z, 1, p15, 1, minU, minV);

        vertexUV(x, y, z, 1, p13, 0, minU, maxV);
        vertexUV(x, y, z, 0, p13, 0, maxU, maxV);
        vertexUV(x, y, z, 0, p15, 0, maxU, minV);
        vertexUV(x, y, z, 1, p15, 0, minU, minV);
        
        minU = BlockBin.textures[4].getMinU();
        maxU = BlockBin.textures[4].getMaxU();
        minV = BlockBin.textures[4].getMinV();
        maxV = BlockBin.textures[4].getMaxV();

        vertexUV(x, y, z, p6, p15, p7, minU, minV);
        vertexUV(x, y, z, p6, p15, p9, minU, maxV);
        vertexUV(x, y, z, p6, 1, p9, maxU, maxV);
        vertexUV(x, y, z, p6, 1, p7, maxU, minV);

        vertexUV(x, y, z, p6, p15, p9, minU, minV);
        vertexUV(x, y, z, p10, p15, p9, minU, maxV);
        vertexUV(x, y, z, p10, 1, p9, maxU, maxV);
        vertexUV(x, y, z, p6, 1, p9, maxU, minV);

        vertexUV(x, y, z, p10, p15, p9, minU, minV);
        vertexUV(x, y, z, p10, p15, p7, minU, maxV);
        vertexUV(x, y, z, p10, 1, p7, maxU, maxV);
        vertexUV(x, y, z, p10, 1, p9, maxU, minV);

        vertexUV(x, y, z, p10, p15, p7, minU, minV);
        vertexUV(x, y, z, p6, p15, p7, minU, maxV);
        vertexUV(x, y, z, p6, 1, p7, maxU, maxV);
        vertexUV(x, y, z, p10, 1, p7, maxU, minV);
        
        minU = BlockBin.textures[5].getMinU();
        maxU = BlockBin.textures[5].getMaxU();
        minV = BlockBin.textures[5].getMinV();
        maxV = BlockBin.textures[5].getMaxV();
        
        vertexUV(x, y, z, p6, 1, p7, minU, maxV);
        vertexUV(x, y, z, p6, 1, p9, maxU, maxV);
        vertexUV(x, y, z, p10, 1, p9, maxU, minV);
        vertexUV(x, y, z, p10, 1, p7, minU, minV);
        
        return true;
    }
    
    public static void vertexUV(int x, int y, int z, float rX, float rY, float rZ, float u, float v)
    {
        t.addVertexWithUV(x + rX, y + rY, z + rZ, u, v);
    }
    
    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer)
    {
    }
    
    @Override
    public boolean shouldRender3DInInventory()
    {
        return false;
    }
    
    @Override
    public int getRenderId()
    {
        return renderID;
    }
}
