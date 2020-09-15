package green.test_1.objects.armour;

import green.test_1.Test_1;
import green.test_1.init.ItemInit;
import green.test_1.util.Reference;
import green.test_1.util.interfaces.IHasModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmourBase extends ItemArmor implements IHasModel{

	public ArmourBase(String name,ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
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
