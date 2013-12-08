package chrome.common;


import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class world_gen3 implements IWorldGenerator{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId)
		{
		case -1:
			generateNether();
			break;
		case 0:
			generateSurface(world, random, chunkX*16, chunkZ*16);
			break;
		case 1:
			generateEnd();
			break;
		}
	}
	
	public void generateNether()
	{
		
	}

	public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
	{
			for (int i = 0; i < 3; i++)
			{
				int randPosX = chunkX + rand.nextInt(16);
				int randPosY = 0 + rand.nextInt(15);
				int randPosZ = chunkZ + rand.nextInt(16);
				(new WorldGenMinable(Chrome_Base.EssenceOre.blockID, 5)).generate(world, rand, randPosX, randPosY, randPosZ);
			}	
	
	}
	
	public void generateEnd(){
	}		
}



