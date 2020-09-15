package green.test_1.objects.blocks.item;

import green.test_1.Test_1;
import green.test_1.tabs.GrenoTab;
import green.test_1.util.interfaces.IHasModel;
import green.test_1.util.interfaces.IMetaName;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemBlockVariants extends ItemBlock implements IHasModel{

	public ItemBlockVariants(Block block) {
		super(block);
		setMaxDamage(0);
		setHasSubtypes(true);
		setCreativeTab(Test_1.GRENO_TAB);
	}
	@Override
	public int getMetadata(int damage) {
		return damage;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		switch (getMetadata(stack)) {
		case 0b0000: return "block_switch_off";
		case 0b0100: return "block_switch_on";
		default: return "greno_wrong";
		}
	}
	
	@Override //提供子物品（不同meta）的列表
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		items.add(new ItemStack(this, 1, 0b0000));
		items.add(new ItemStack(this, 1, 0b0100));
	}
	
	@Override
	public void registerModels() {
		Test_1.proxy.registerVariantRenderer(this, 0b0000, "inventory");
		Test_1.proxy.registerVariantRenderer(this, 0b0100, "inventory");
	}
	
}
