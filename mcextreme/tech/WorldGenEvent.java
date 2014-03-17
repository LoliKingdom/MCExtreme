package mcextreme.tech;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.Random;
public class WorldGenEvent implements IWorldGenerator
{
       public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
       {
             switch(world.provider.dimensionId)
             {
                    case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
                    case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
                    case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
             }
       }
      
       private void generateEnd(World world, Random random, int x, int z)
       {
            
       }
       private void generateSurface(World world, Random random, int x, int z)
       {
             //this.addOreSpawn(Tutorial.tutorialBlock, world, random, x, z, 16, 16, 4 + random.nextInt(3), 5, 15, 50);
       }
       private void generateNether(World world, Random random, int x, int z)
       {
            
       }
}