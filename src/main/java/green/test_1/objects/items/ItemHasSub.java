package green.test_1.objects.items;

import green.test_1.Test_1;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemHasSub extends ItemBase{

	public ItemHasSub(String name) {
		super(name);
        setMaxDamage(0);
        setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int damage) {
		return damage;
	}
	
	@Override //提供非本地化名称
	public String getUnlocalizedName(ItemStack stack) {
		switch (getMetadata(stack)) {
		case 0: return "greno_bud";
		case 1: return "greno_flower";
		case 2: return "greno_half_ripe";
		case 3: return "greno_fruit";
		default: return "greno_wrong";
		}
	}
	
	@Override //提供子物品（不同meta）的列表
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		items.add(new ItemStack(this, 1, 0));
		items.add(new ItemStack(this, 1, 1));
		items.add(new ItemStack(this, 1, 2));
		items.add(new ItemStack(this, 1, 3));
	}
	
	@Override //注册不同meta的模型
	public void registerModels() {
		Test_1.proxy.registerVariantRenderer(this, 0, "inventory");
		Test_1.proxy.registerVariantRenderer(this, 1, "inventory");
		Test_1.proxy.registerVariantRenderer(this, 2, "inventory");
		Test_1.proxy.registerVariantRenderer(this, 3, "inventory");
	}
	
}
