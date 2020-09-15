package green.test_1.objects.blocks;

import com.google.common.util.concurrent.Service.State;

import akka.Main;
import green.test_1.Test_1;
import green.test_1.util.handlers.EnumHandler.EnumType;
import green.test_1.util.interfaces.IHasModel;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import scala.tools.nsc.doc.model.Public;

public class BlockOre extends BlockBase implements IHasModel{
	
	public static final PropertyEnum<EnumType> VARIANT = PropertyEnum.<EnumType>create("",EnumType.class);
	
	private String name, demension;
	public BlockOre(String name, String demension) {
		super(name,Material.ROCK);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.GRENO));
		
		this.name = name;
		this.demension = demension;
	}
	@Override
	public int damageDropped(IBlockState state) {
		return ((EnumType)state.getValue(VARIANT)).getMeta();
	}
	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumType)state.getValue(VARIANT)).getMeta();
	}
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return super.getStateFromMeta(meta);
	}
	/*
	@Override
	public void registerModels() {
		for(int i = 0; i < EnumType.values().length; i++) {
			Test_1.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, EnumType.values()[i].getName() + this.demension +"_ore", "inventory");
		}
	}
	*/
}
