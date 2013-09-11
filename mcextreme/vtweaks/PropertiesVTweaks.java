package mcextreme.vtweaks;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class PropertiesVTweaks
{
    public static int itemLinkIronID;
    
    public static boolean isClient;

    public static void loadConfig(Configuration config)
    {
        isClient = FMLCommonHandler.instance().getSide() == Side.CLIENT;
        
        config.load();
        
        itemLinkIronID = config.get("item", "ItemIngotID", 6500).getInt();
        
        config.save();
    }
}
