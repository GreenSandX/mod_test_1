package green.test_1.world.gen;

import java.util.Random;

import green.test_1.init.BlockInit;
import green.test_1.objects.blocks.BlockOre;
import green.test_1.util.handlers.EnumHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.util.EnumHelper;

public class WorldGenCustomOres extends WorldGenerator{  // ******** TRY  extends WorldGenerator ********
	
	private WorldGenerator greno_ore_nether, greno_ore_overworld, greno_ore_end;
	/*
	public WorldGenCustomOres() {
		greno_ore_nether = new WorldGenMinable(BlockInit.GRENO_ORE.getDefaultState()
				.withProperty(BlockOre.VARIANT, EnumHandler.EnumType.GRENO), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
	}
	*/
	public WorldGenCustomOres() {
		greno_ore_overworld = new WorldGenMinable(BlockInit.GRENO_ORE_OVERWORLD.getDefaultState(),16);
	}
	

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
	    for (int i = 0; i < 4; i++)
	    {
	        int posX = position.getX() + rand.nextInt(16);
	        int posY = 16 + rand.nextInt(16);
	        int posZ = position.getZ() + rand.nextInt(16);
	        BlockPos orePosition = new BlockPos(posX, posY, posZ);
	        /*
	         *Need Revise
	        Biome biomeGenBase = worldIn.getBiome(position);
	        if (biomeGenBase.getIntRainfall() < rand.nextInt(65536))
	        {
	            glowstoneGenerator.generate(worldIn, rand, blockpos);
	        }
	        */
	        greno_ore_overworld.generate(worldIn, rand, orePosition);
	        System.out.println("***********generate done*********");
	        System.out.println(orePosition.toString());
	    }
		return true;
	}
}
