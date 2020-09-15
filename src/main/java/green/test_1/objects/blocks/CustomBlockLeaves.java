package green.test_1.objects.blocks;

import java.util.List;
import java.util.Random;

import green.test_1.Test_1;
import green.test_1.init.BlockInit;
import green.test_1.init.ItemInit;
import green.test_1.tabs.GrenoTab;
import green.test_1.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import scala.tools.nsc.doc.model.Public;
/*
public class CustomBlockLeaves extends BlockBase {

	public CustomBlockLeaves(String name, Material material) {
		super(name, material);
		
	}


}
*/

public  class CustomBlockLeaves extends BlockLeaves{
	
	public CustomBlockLeaves(String name) {
		setRegistryName(Reference.MOD_ID, name);
		setUnlocalizedName(name);
		setCreativeTab(Test_1.GRENO_TAB);
		
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this)
				.setRegistryName(Reference.MOD_ID, name));
	}

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EnumType getWoodType(int meta) {
		return null;
	}
	public void registerModels() {
		Test_1.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		//return Item.getItemFromBlock(BlockInit.GRENO_SAPLINGS);
		return null;
	}
	
	
}
