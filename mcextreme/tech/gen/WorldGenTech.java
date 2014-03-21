/* package mcextreme.tech.gen;

import java.util.Random;

import mcextreme.core.config.MCExtremeConfig;
import mcextreme.tech.block.BlocksTech;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenTech implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world,random,chunkX * 16,chunkZ * 16);
			break;
		case 0:
			generateOverworld(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			break;
		default:
			generateOverworld(world,random, chunkX * 16, chunkZ * 16);
			break;
		}
	}

	private void generateEnd(World world, Random random, int chunkX, int chunkZ){
		//Do nothing here, we don't want ores in the end!
	}

	private void generateNether(World world, Random random, int chunkX, int chunkZ){
		//Do nothing here, we don't want ores in the nether!
	}

	private void generateOre(int blockID, World world2, Random random2, int chunkX, int chunkZore, World world, Random random, int chunkX, int chunkZ){
		for(int i = 0; i < 3; i++){
			int firstBlockXCoord = chunkX + random.nextInt(16);
			int firstBlockYCoord = 18 + random.nextInt(72); // From +18 to 70
			int firstBlockZCoord = chunkZ + random.nextInt(16);

			(new WorldGenMinable(ore.act, 12)).generate(world, random, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
		}
	}

	private void generateOverworld(World world, Random random, int chunkX, int chunkZ){{
			generateOre(BlocksTech.blockLimestone.blockID, world, random, chunkX, chunkZ);
			generateOre(Ids.oreLead, world, random, chunkX, chunkZ);
		}
	}

} */