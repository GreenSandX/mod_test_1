package green.test_1.init;

import java.util.ArrayList;
import java.util.List;

import org.lwjgl.Sys;

import green.test_1.objects.blocks.BlockBase;
import green.test_1.objects.blocks.BlockColor;
import green.test_1.objects.blocks.BlockFluid;
import green.test_1.objects.blocks.BlockSwitch;
import green.test_1.objects.blocks.CustomBlochkSaplings;
import green.test_1.objects.blocks.CustomBlockLeaves;
import green.test_1.objects.blocks.CustomBlockLogs;
import green.test_1.objects.blocks.CustomBlockPlanks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.BlockFluidFinite;
import net.minecraftforge.fluids.FluidStack;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    
    public static final Block GRENO_ORE_OVERWORLD = new BlockBase("greno_ore_overworld",Material.ROCK);
    public static final Block GRENO_BLOCK = new BlockBase("greno_block", Material.IRON);
    
    /*
    public static final Block GRENO_PLANKS = new CustomBlockPlanks("planks_greno", Material.WOOD);
    public static final Block GRENO_LOGS = new CustomBlockLogs("log_greno", Material.WOOD);
    public static final Block GRENO_LEAVES = new CustomBlockLeaves("leaves_greno");
    public static final Block GRENO_SAPLINGS = new CustomBlochkSaplings("sapling_greno", Material.PLANTS);
    */
    
    public static final Block BLOCK_SWITCH = new BlockSwitch("block_switch", Material.IRON);
    
    //public static final BlockColor BLOCK_COLOR = new BlockColor();

    public static final Block GRENO_LIQUID_BLOCK = new BlockFluid(
    		"greno_liquid", FluidInit.GRENO_LIQUID,Material.WATER);
    
}
