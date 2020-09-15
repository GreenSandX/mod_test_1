package green.test_1.tabs;

import green.test_1.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GrenoTab extends CreativeTabs{

	public GrenoTab(String label) {
		super(label);
		setBackgroundImageName("greno.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.GRENO_INGOT);
	}
	

}
