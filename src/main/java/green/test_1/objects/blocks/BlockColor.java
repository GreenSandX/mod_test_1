package green.test_1.objects.blocks;

import green.test_1.Test_1;
import green.test_1.init.BlockInit;
import green.test_1.init.ItemInit;
import green.test_1.objects.blocks.item.ItemBlockVariants;
import green.test_1.util.Reference;
import green.test_1.util.handlers.EnumHandler.EnumBlockColor;
import green.test_1.util.handlers.EnumHandler.EnumType;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBlockSpecial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;

public class BlockColor extends Block{
	public static final PropertyInteger NUMBER = PropertyInteger.create("number", 0, 15);
	
	public BlockColor() {
		super(Material.IRON);
		setUnlocalizedName("block_color");
		setRegistryName(Reference.MOD_ID,"block_color");
		setCreativeTab(Test_1.GRENO_TAB);
		setDefaultState(this.blockState.getBaseState()
				.withProperty(NUMBER, 0));
		
		BlockInit.BLOCKS.add(this);
		/*
		ItemInit.ITEMS.add(new ItemBlockVariants(this)
				.setRegistryName(this.getRegistryName()));
				*/
	}
	
	public void registerAllItemBlockColors() {
		for(EnumBlockColor enu : EnumBlockColor.values()) {
			ItemInit.ITEMS.add(new ItemStack(new ItemBlock(this)
					.setRegistryName(this.getRegistryName())
					.setUnlocalizedName(enu.getUnlocalizeName())
					.setHasSubtypes(true)
					.setMaxDamage(0),
				1, 
				enu.getMeta()).getItem());
		}
	}
	
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
        for (EnumBlockColor enu : EnumBlockColor.values())
        {
            items.add(new ItemStack(this, 1, enu.getMeta()));
        }
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, NUMBER);
	}
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState()
				.withProperty(NUMBER, meta);
	}
	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(NUMBER);
	}
	
	
	
	
	/*
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		items.add(new ItemStack(blockIn, amount, meta))
	}*/
	
}
