package mcextreme.utilties.blocks;

import net.minecraft.client.gui.inventory.GuiContainer;

public class UIBin extends GuiContainer
{
    ContainerBin infuser;
    
    public UIBin(ContainerBin infuser)
    {
        super(infuser);
        this.infuser = infuser;
        
        xSize = 176;
        ySize = 166;
    }

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
