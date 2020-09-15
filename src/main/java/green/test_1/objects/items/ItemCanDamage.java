package green.test_1.objects.items;

import green.test_1.Test_1;

public class ItemCanDamage extends ItemBase{

	public ItemCanDamage(String name, int damage) {
		super(name);
		setMaxDamage(damage);
        this.maxStackSize = 1;
	}

	@Override
	public void registerModels() {
		Test_1.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
