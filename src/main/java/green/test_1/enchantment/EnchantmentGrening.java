package green.test_1.enchantment;

import green.test_1.init.EnchantmentInit;
import green.test_1.util.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;
import scala.tools.nsc.doc.model.Public;

public class EnchantmentGrening extends Enchantment{

	public EnchantmentGrening() {
		super(Rarity.COMMON, EnumEnchantmentType.ALL,new EntityEquipmentSlot[] {EntityEquipmentSlot.HEAD, EntityEquipmentSlot.CHEST, EntityEquipmentSlot.LEGS, EntityEquipmentSlot.FEET,EntityEquipmentSlot.OFFHAND});
		setName("enchantment_grening");
		setRegistryName(Reference.MOD_ID + "enchantment_grening");
		
		EnchantmentInit.ENCHANTMENTS.add(this);
	}
	
	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		return 20 * enchantmentLevel;
	}

	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		return getMinEnchantability(enchantmentLevel) + 10;
	}
	
	@Override
	public int getMaxLevel() {
		return 5;
	}
	
	@Override
	protected boolean canApplyTogether(Enchantment ench) {
		return super.canApplyTogether(ench) ;//&& ench != Enchantments.;
	}
}
