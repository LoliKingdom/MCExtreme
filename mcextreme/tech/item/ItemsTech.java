package mcextreme.tech.item;

import mcextreme.core.config.MCExtremeConfig;
import net.minecraft.block.Block;
import net.minecraft.item.Item;


public class ItemsTech
{
	public static Item itemIngot, itemScrewdriver, itemNanotube, itemDebugScrewdriver, itemConcreteBucket, itemCrowbar, itemWrench, itemHammer, itemPliers, itemTestTube, itemGlassShard;
    
    public static void initItems()
    {
        itemIngot = new ItemIngotsTech(MCExtremeConfig.itemTechIngotID, "INGOT").setUnlocalizedName("ingotMCExtreme");
        itemScrewdriver = new ItemScrewdriver(MCExtremeConfig.itemScrewdriverID, false).setUnlocalizedName("screwdriver");
        itemCrowbar = new ItemCrowbar(MCExtremeConfig.itemCrowbarID).setUnlocalizedName("crowbar");
        itemWrench = new ItemWrench(MCExtremeConfig.itemWrenchID).setUnlocalizedName("wrench");
        itemHammer = new ItemHammer(MCExtremeConfig.itemHammerID).setUnlocalizedName("hammer");
        itemPliers = new ItemPliers(MCExtremeConfig.itemPliersID).setUnlocalizedName("pliers");
        itemNanotube = new ItemNanotube(MCExtremeConfig.itemNanotubeID).setUnlocalizedName("nanotube");
        itemDebugScrewdriver = new ItemScrewdriver(MCExtremeConfig.itemDebugScrewdriverID, true).setUnlocalizedName("debugScrewdriver");
        itemConcreteBucket = new ItemConcreteBucket(MCExtremeConfig.itemConcreteBucketID).setUnlocalizedName("concreteBucket");
        itemTestTube = new ItemTestTube(MCExtremeConfig.itemTestTubeID).setUnlocalizedName("testtube");
        itemGlassShard = new ItemGlassShard(MCExtremeConfig.itemGlassShardID).setUnlocalizedName("shardGlass");
        
    }
    
}
