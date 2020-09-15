package green.test_1.objects.blocks;

import green.test_1.Test_1;
import green.test_1.util.Reference;
import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class BlockSwitch extends BlockHasSub{
	//为什么不直接用EnumFacing、Boolean...
	public static final PropertyDirection FACING_BLOCK_SWITCH = 
			PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	
    public static final PropertyBool STATE_BLOCK_SWITCH = 
    		PropertyBool.create("state_switch");

	public BlockSwitch(String name, Material material) {
		super(name, material);
		setDefaultState(this.blockState.getBaseState()
				.withProperty(FACING_BLOCK_SWITCH, EnumFacing.SOUTH)
				.withProperty(STATE_BLOCK_SWITCH, false));
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, FACING_BLOCK_SWITCH, STATE_BLOCK_SWITCH);
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		/*
		switch (meta) {
		case 0000:
		case 0001:
		case 0010:
		case 0011:
		case 0100:
		case 0101:
		case 0110:
		case 0111:
		default:
			break;
		}
		*/
		EnumFacing facing = EnumFacing.getHorizontal(meta & 0b0011);
		Boolean state_switch = Boolean.valueOf((meta & 0b0100) != 0);
		return this.getDefaultState()
				.withProperty(FACING_BLOCK_SWITCH, facing)
				.withProperty(STATE_BLOCK_SWITCH, state_switch);
	}
	@Override
	public int getMetaFromState(IBlockState state) {
		int facing = state.getValue(FACING_BLOCK_SWITCH).getHorizontalIndex();
		int state_switch = state.getValue(STATE_BLOCK_SWITCH) ? 0b0100 : 0 ;
		return facing | state_switch;
	}
	/*
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		items.add(new ItemStack(this, 1, 0b0000));
		items.add(new ItemStack(this, 1, 0b0100));
	}
	*/
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,
			ItemStack stack) {
		float x = (float) placer.getLookVec().x;
		//float y = (float) placer.getLookVec().y;
		float z = (float) placer.getLookVec().z;
		EnumFacing facing = EnumFacing.getFacingFromVector(x, 0.0F, z).getOpposite();
		worldIn.setBlockState(pos, this.blockState.getBaseState()
				.withProperty(FACING_BLOCK_SWITCH, facing)
				.withProperty(STATE_BLOCK_SWITCH, false));
	}
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		worldIn.setBlockState(pos, state.cycleProperty(STATE_BLOCK_SWITCH));
		return true;
	}
}
