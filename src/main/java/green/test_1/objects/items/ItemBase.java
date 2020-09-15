package green.test_1.objects.items;

import green.test_1.Test_1;
import green.test_1.util.Reference;
import green.test_1.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import green.test_1.init.ItemInit;

public class ItemBase extends Item implements IHasModel{
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(Reference.MOD_ID,name);
		setCreativeTab(Test_1.GRENO_TAB);
		
		ItemInit.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
	Test_1.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
