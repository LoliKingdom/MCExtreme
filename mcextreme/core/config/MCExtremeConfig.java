package mcextreme.core.config;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class MCExtremeConfig
{
    //--------------- MC-Extreme Aesthetics ------------------
    //--------------- Block range: 700 - 1199 ----------------
    //--------------- Item range: 3000 - 3999 ----------------
    public static int blockBoneID;
    
    //--------------- MC-Extreme Core ------------------------
    
    //--------------- MC-Extreme Magic -----------------------
    //--------------- Block range: 1200 - 1699 ---------------
    //--------------- Item range: 4000 - 4999 ----------------
    public static int blockMagicPortalID, blockMagicOreID, blockMagicStorageID, blockSolidEvilID, blockWorldsEndID;   
    public static int blockBarrierRuneID, blockLiquidDarkID;
    public static int itemCrystalID, itemDarkBucketID;
    
    //--------------- MC-Extreme Tech ------------------------
    //--------------- Block range: 1700 - 2199 ---------------
    //--------------- Item range: 5000 - 5999 ----------------
    public static int blockTechOreID, blockTechStorageID, blockBreakerID, blockPlacerID, blockCompressorID, blockCompressorActiveID, blockRebarID;
    public static int itemTechIngotID, itemScrewdriverID, itemDebugScrewdriverID, itemNanotubeID;
    public static int blockLiquidConcreteID;
    
    //--------------- MC-Extreme VanillaTweaks ---------------
    //--------------- Block range: 2200 - 2699 ---------------
    //--------------- Item range: 6000 - 6999 ----------------
    public static int itemLinkID, itemPlateID;
    public static int blockCharcoalID;
    
    public static void loadConfig(Configuration config, String type)
    {
        config.load();
        
        if (type.toUpperCase().equals("AESTHETICS"))
        {
        	blockBoneID = config.get("block", "BlockBoneID", 700).getInt();
        }
        
        else if (type.toUpperCase().equals("CORE"))
        {
            
        }
        
        else if (type.toUpperCase().equals("MAGIC"))
        {
            blockMagicPortalID = config.get("block", "BlockMagicPortalID", 1200).getInt();
            blockMagicOreID = config.get("block", "BlockOreID", 1201).getInt();
            blockMagicStorageID = config.get("block", "BlockStorageID", 1202).getInt();
            blockSolidEvilID = config.get("block", "BlockSolidEvilID", 1203).getInt();
            blockWorldsEndID = config.get("block", "BlockWorldsEndID", 1204).getInt();
            
            blockBarrierRuneID = config.get("block", "BlockBarrierRuneID", 1205).getInt();
            blockLiquidDarkID = config.get("block", "BlockLiquidDarkID", 1206).getInt();
            
            itemCrystalID = config.get("item", "ItemCrystalID", 4000).getInt();
            itemDarkBucketID = config.get("item", "ItemDarkBucketID", 4001).getInt();
        }
        
        else if (type.toUpperCase().equals("TECH"))
        {
            Property propBlockOreID, propBlockStorageID;
            
            propBlockOreID = config.get("block", "BlockOreID", 1700);
            propBlockStorageID = config.get("block", "BlockStorageID", 1701);
            
            propBlockOreID.comment = "Ore Block ID";
            propBlockStorageID.comment = "Storage Block ID";
            
            blockTechOreID = propBlockOreID.getInt();
            blockTechStorageID = propBlockStorageID.getInt();
            blockRebarID = config.get("block", "BlockRebarID", 1702).getInt();
            
            blockLiquidConcreteID = config.get("block", "LiquidConcreteID", 1703).getInt();
            
            blockBreakerID = config.get("block", "BlockBreakerID", 1704).getInt();
            blockPlacerID = config.get("block", "BlockPlacerID", 1705).getInt();
            
            blockCompressorID = config.get("block", "BlockCompressor", 1706).getInt();
            blockCompressorActiveID = config.get("block", "BlockCompressorActive", 1707).getInt();
            
            itemTechIngotID = config.get("item", "ItemIngotID", 5000).getInt();
            itemScrewdriverID = config.get("item", "ItemScrewdriverID", 5001).getInt();
            itemDebugScrewdriverID = config.get("item", "ItemDebugScrewdriverID", 5002).getInt();
        }
        
        else if (type.toUpperCase().equals("VTWEAKS"))
        {
            blockCharcoalID = config.get("items", "BlockCharcoalID", 2200).getInt();
            
            itemLinkID = config.get("item", "ItemLinkID", 6000).getInt();
            itemPlateID = config.get("item", "ItemPlateID", 6001).getInt();
        }
        
        config.save();
    }
}
