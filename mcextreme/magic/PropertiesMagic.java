package mcextreme.magic;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class PropertiesMagic
{
    public static int blockMagicPortalID;
    public static int blockOreID, blockStorageID;
    public static int itemCrystalID;
    
    public static boolean isClient;

    public static void loadConfig(Configuration config)
    {
        isClient = FMLCommonHandler.instance().getSide() == Side.CLIENT;
        
        config.load();
        
        blockMagicPortalID = config.get("block", "BlockMagicPortalID", 540).getInt();
        blockOreID = config.get("block", "BlockOreID", 541).getInt();
        blockStorageID = config.get("block", "BlockStorageID", 542).getInt();
        
        itemCrystalID = config.get("item", "ItemCrystalID", 6300).getInt();
        
        config.save();
    }
}
