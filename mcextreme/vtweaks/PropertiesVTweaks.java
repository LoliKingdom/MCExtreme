package mcextreme.vtweaks;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class PropertiesVTweaks
{
    public static int itemLinkID;
    public static int itemPlateID;
    
    public static boolean isClient;

    public static void loadConfig(Configuration config)
    {
        isClient = FMLCommonHandler.instance().getSide() == Side.CLIENT;
        
        config.load();
        
        itemLinkID = config.get("item", "ItemLinkID", 6500).getInt();
        itemPlateID = config.get("item", "ItemPlateID", 6501).getInt();
        
        config.save();
    }
}
