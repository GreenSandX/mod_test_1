package green.test_1.objects.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import green.test_1.Test_1;
import green.test_1.init.ItemInit;
import green.test_1.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemTool;
import scala.annotation.meta.setter;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemTool implements IHasModel{
	
	public static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.BOOKSHELF,Blocks.GRASS);
	public ToolAxe(String name,ToolMaterial material) {
		
		super(material, EFFECTIVE_ON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Test_1.GRENO_TAB);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
	Test_1.proxy.registerItemRenderer(this, 0, "inventory");
	}
	

}
