package green.test_1.objects.tools;

import green.test_1.Test_1;
import green.test_1.init.ItemInit;
import green.test_1.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{
	public ToolSword(String name,ToolMaterial material) {
		
		super(material);
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
