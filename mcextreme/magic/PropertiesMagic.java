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
    public static int itembucketdarkID;
    public static int blockSolidEvilID;
    
    public static final int liquidDarkID = 1005;
    
    public static boolean isClient;

    public static void loadConfig(Configuration config)
    {
        isClient = FMLCommonHandler.instance().getSide() == Side.CLIENT;
        
        config.load();
        
        blockMagicPortalID = config.get("block", "BlockMagicPortalID", 540).getInt();
        blockOreID = config.get("block", "BlockOreID", 541).getInt();
        blockStorageID = config.get("block", "BlockStorageID", 542).getInt();
        blockSolidEvilID = config.get("block", "BlockSolidEvilID", 543).getInt();
        
        itemCrystalID = config.get("item", "ItemCrystalID", 6300).getInt();
        itembucketdarkID = config.get("item", "ItemDarkBucketID", 6301).getInt();
        
        config.save();
    }
}
