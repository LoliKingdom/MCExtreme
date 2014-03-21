package mcextreme.utilties.blocks;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GUIBin extends GuiContainer
{
    ContainerBin infuser;
    
    public GUIBin(ContainerBin infuser)
    {
        super(infuser);
        this.infuser = infuser;
        
        xSize = 176;
        ySize = 166;
    }
    
    @Override
    public void drawGuiContainerBackgroundLayer(float f, int i, int j)
    {
        GL11.glColor3f(1, 1, 1);
        
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("mcextreme", "textures/gui/util/guiBin.png"));
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}
