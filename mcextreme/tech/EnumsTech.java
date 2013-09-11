package mcextreme.tech;

import net.minecraftforge.common.MinecraftForge;

public class EnumsTech
{
    public static void setHarvestLevels()
    {
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockOre, 0, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockOre, 1, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockOre, 2, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockOre, 3, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockOre, 4, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockOre, 5, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockOre, 6, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockOre, 7, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockStorage, 0, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockStorage, 1, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockStorage, 2, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockStorage, 3, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockStorage, 4, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockStorage, 5, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockStorage, 6, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(BlocksTech.blockStorage, 7, "pickaxe", 2);
    }
}
