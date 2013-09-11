package mcextreme.tech;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class PropertiesTech
{
    public static int blockOreID, blockStorageID;
    public static int itemIngotID;
    
    public static boolean isClient;

    public static void loadConfig(Configuration config)
    {
        isClient = FMLCommonHandler.instance().getSide() == Side.CLIENT;
        
        config.load();
        
        Property propBlockOreID, propBlockStorageID;
        
        propBlockOreID = config.get("block", "BlockOreID", 640);
        propBlockStorageID = config.get("block", "BlockStorageID", 641);
        
        propBlockOreID.comment = "Ore Block ID";
        propBlockStorageID.comment = "Storage Block ID";
        
        blockOreID = propBlockOreID.getInt();
        blockStorageID = propBlockStorageID.getInt();
        itemIngotID = config.get("item", "ItemIngotID", 6400).getInt();
        
        config.save();
    }
    
    /*
    public static int oreAluminiumID =   640;
    public static int blockAluminiumID = 641;
    public static int oreCopperID =      642;
    public static int blockCopperID =    643;
    public static int oreLeadID =        644;
    public static int blockLeadID =      645;
    public static int oreNickelID =      646;
    public static int blockNickelID =    647;
    public static int orePlatinumID =    648;
    public static int blockPlatinumID =  649;
    public static int oreSilverID =      650;
    public static int blockSilverID =    651;
    public static int oreTinID =         652;
    public static int blockTinID =       653;
    public static int oreZincID =        654;
    public static int blockZincID =      655;
    
    public static int portalMagicID =    720;
    
    //Standard material IDs
    public static int ingotsStandardID = 4000;

    //Mohs Hardness
    public static double hardnessMohsAluminium = 2.75;
    public static double hardnessMohsCopper =    3.0;
    public static double hardnessMohsLead =      1.5;
    public static double hardnessMohsNickel =    4.0;
    public static double hardnessMohsPlatinum =  4.3;
    public static double hardnessMohsSilver =    2.5;
    public static double hardnessMohsTin =       1.5;
    public static double hardnessMohsZinc =      2.5;
    
    //Brinell Hardness (only applies to metals)
    public static double hardnessBrinellAluminium = 245;
    public static double hardnessBrinellCopper =    874;
    public static double hardnessBrinellLead =      38.3;
    public static double hardnessBrinellNickel =    700;
    public static double hardnessBrinellPlatinum =  392;
    public static double hardnessBrinellSilver =    24.5;
    public static double hardnessBrinellTin =       51;
    public static double hardnessBrinellZinc =      412;
    
    //Average Hardness (Use for shaped metals when tensile strength is a factor)
    public static double hardnessAverageAluminium = ((hardnessMohsAluminium + (hardnessBrinellAluminium / 100)) / 2);
    public static double hardnessAverageCopper =    ((hardnessMohsCopper + (hardnessBrinellCopper / 100)) / 2);
    public static double hardnessAverageLead =      ((hardnessMohsLead + (hardnessBrinellLead / 100)) / 2);
    public static double hardnessAverageNickel =    ((hardnessMohsNickel + (hardnessBrinellNickel / 100)) / 2);
    public static double hardnessAveragePlatinum =  ((hardnessMohsPlatinum + (hardnessBrinellPlatinum / 100)) / 2);
    public static double hardnessAverageSilver =    ((hardnessMohsSilver + (hardnessBrinellSilver / 100)) / 2);
    public static double hardnessAverageTin =       ((hardnessMohsTin + (hardnessBrinellTin / 100)) / 2);
    public static double hardnessAverageZinc =      ((hardnessMohsZinc + (hardnessBrinellZinc / 100)) / 2);
    
    //Metal conductivity (10^6/cm ohm)
    public static double conductivityAluminium = 0.377;
    public static double conductivityCopper =    0.596;
    public static double conductivityLead =      0.0481;
    public static double conductivityNickel =    0.143;
    public static double conductivityPlatinum =  0.0966;
    public static double conductivitySilver =    0.63;
    public static double conductivityTin =       0.0917;
    public static double conductivityZinc =      0.166;
    
    //Block Hardness
    public static float blockAluminiumHardness = (float)hardnessMohsAluminium++;
    public static float oreAluminiumHardness = (blockAluminiumHardness * 0.5F);
    
    public static float blockCopperHardness = (float)hardnessMohsCopper++;
    public static float oreCopperHardness = (blockCopperHardness * 0.5F);
    
    public static float blockLeadHardness = (float)hardnessMohsLead++;
    public static float oreLeadHardness = (blockLeadHardness * 0.5F);
    
    public static float blockNickelHardness = (float)hardnessMohsNickel++;
    public static float oreNickelHardness = (blockNickelHardness * 0.5F);
    
    public static float blockPlatinumHardness = (float)hardnessMohsPlatinum++;
    public static float orePlatinumHardness = (blockPlatinumHardness * 0.5F);
    
    public static float blockSilverHardness = (float)hardnessMohsSilver++;
    public static float oreSilverHardness = (blockSilverHardness * 0.5F);
    
    public static float blockTinHardness = (float)hardnessMohsTin++;
    public static float oreTinHardness = (blockTinHardness * 0.5F);
    
    public static float blockZincHardness = (float)hardnessMohsZinc++;
    public static float oreZincHardness = (blockZincHardness * 0.5F);

    //Abundance
    //1,000,000 blocks = 61 chunks
    public static int ppmAluminium =    82300;
    
    public static double ppmCopper =    60;
    public static double ppmLead =      14;
    public static double ppmNickel =    84;
    public static double ppmPlatinum =  0.005;
    public static double ppmSilver =    0.075;
    public static double ppmTin =       2.3;
    public static double ppmZinc =      70;
    
    public static int averageLandBlocksPerChunk = 16384;
    
    //(averageLandBlocksPerChunk / 1000000) * ppm
    public static int orePerChunkAluminium = 1348;
    
    public static int blocksPerVeinAluminium = orePerChunkAluminium / 64;
    
    public static int blocksPerVeinMetal =   8;
    public static int blocksPerVeinGem =     3;
    
    public static int oreVeinsPerChunk =       1;
    
    //Harvest level
    public static int harvestLevelAluminium = (int)(hardnessMohsAluminium / 3);
    public static int harvestLevelCopper =    (int)(hardnessMohsCopper / 3);
    public static int harvestLevelLead =      (int)(hardnessMohsLead / 3);
    public static int harvestLevelNickel =    (int)(hardnessMohsNickel / 3);
    public static int harvestLevelPlatinum =  (int)(hardnessMohsPlatinum / 3);
    public static int harvestLevelSilver =    (int)(hardnessMohsSilver / 3);
    public static int harvestLevelTin =       (int)(hardnessMohsTin / 3);
    public static int harvestLevelZinc =      (int)(hardnessMohsZinc / 3);
    
    
    //PPM 488 == minimum to have one vein per chunk

    public static int oreVeinsPerChunkAluminium = orePerChunkAluminium / blocksPerVeinAluminium;
    
    //PPM < 488 (has ratio of less than one to spawn an ore vein)
    public static int oreVeinsPerChunkCopper =    (int)(oreVeinsPerChunk + (ppmCopper / 1000));
    public static int oreVeinsPerChunkLead =      (int)(oreVeinsPerChunk + (ppmLead / 1000));
    public static int oreVeinsPerChunkNickel =    (int)(oreVeinsPerChunk + (ppmNickel / 1000));
    public static int oreVeinsPerChunkPlatinum =  (int)(oreVeinsPerChunk + (ppmPlatinum / 1000));
    public static int oreVeinsPerChunkSilver =    (int)(oreVeinsPerChunk + (ppmSilver / 1000));
    public static int oreVeinsPerChunkTin =       (int)(oreVeinsPerChunk + (ppmTin / 1000));
    public static int oreVeinsPerChunkZinc =      (int)(oreVeinsPerChunk + (ppmZinc / 1000));
    
    //Density / specific gravity (g/cm^3)
    public static double densityAluminium = 2.698;
    public static double densityCopper =    8.933;
    public static double densityLead =      11.342;
    public static double densityNickel =    8.912;
    public static double densityPlatinum =  21.46;
    public static double densitySilver =    10.501;
    public static double densityTin =       7.287;
    public static double densityZinc =      7.134;
    
    //Ore Height Limit
    public static int oreHeightLimit = 96;
    
    public static int heightLimitOreAluminium = 72;
    public static int heightLimitOreCopper =    (int)(oreHeightLimit - (densityCopper * 3));
    public static int heightLimitOreLead =      (int)(oreHeightLimit - (densityLead * 3));
    public static int heightLimitOreNickel =    (int)(oreHeightLimit - (densityNickel * 3));
    public static int heightLimitOrePlatinum =  (int)(oreHeightLimit - (densityPlatinum * 3));
    public static int heightLimitOreSilver =    (int)(oreHeightLimit - (densitySilver * 3));
    public static int heightLimitOreTin =       (int)(oreHeightLimit - (densityTin * 3));
    public static int heightLimitOreZinc =      (int)(oreHeightLimit - (densityZinc * 3));
    
    //Ore XP
    public static float oreAluminiumXP = 0.1F;
    public static float oreCopperXP =    1.0F;
    public static float oreLeadXP =      1.0F;
    public static float oreNickelXP =    1.0F;
    public static float orePlatinumXP =  1.0F;
    public static float oreSilverXP =    1.0F;
    public static float oreTinXP =       1.0F;
    public static float oreZincXP =      1.0F;
    */
}
