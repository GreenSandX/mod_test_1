package green.test_1.objects.blocks;

import green.test_1.Test_1;
import green.test_1.init.BlockInit;
import green.test_1.init.ItemInit;
import green.test_1.objects.blocks.item.ItemBlockVariants;
import green.test_1.util.Reference;
import green.test_1.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockHasSub extends Block {

	public BlockHasSub(String name,Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(Reference.MOD_ID,name);
		setCreativeTab(Test_1.GRENO_TAB);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this)
				.setRegistryName(Reference.MOD_ID, name));
	}

}
