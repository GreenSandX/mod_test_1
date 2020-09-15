package green.test_1.init;

import java.util.List;
import java.util.ArrayList;

import green.test_1.potions.PotionBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

public class PotionInit {//Potion药水效果,PotionEffect实际药水效果，PotionType指药水
	public static final Potion GRENING_POTION_EFFECT = new PotionBase("grening_potion_effect",false,6929175,0,0)
			.registerPotionAttributeModifier(SharedMonsterAttributes.MOVEMENT_SPEED, MathHelper.getRandomUUID().toString(), 10.0D, 2);
	
	public static final PotionType GRENING_POTION = new PotionType("grening_potion",new PotionEffect(GRENING_POTION_EFFECT, 40)).setRegistryName("grening_potion");
	public static final PotionType GRENING_POTION_LONG = new PotionType("grening_potion_long",new PotionEffect(GRENING_POTION_EFFECT, 600)).setRegistryName("grening_potion_long");
	
	//public static final List<Potion> POTIONEFFECTS = new ArrayList<Potion>();
	//public static final List<PotionType> POTIONS = new ArrayList<PotionType>();
	
	public static void registerPotions() {
		registerPotion(GRENING_POTION,GRENING_POTION_LONG,GRENING_POTION_EFFECT);
		
		registerPotionMixes();
	}
	
	public static void registerPotion(PotionType defaultPotion, PotionType longPotion, Potion effect) {
		ForgeRegistries.POTIONS.register(effect);
		ForgeRegistries.POTION_TYPES.register(defaultPotion);
		ForgeRegistries.POTION_TYPES.register(longPotion);
	}
	
	public static void registerPotionMixes() {//药水混合配方
		PotionHelper.addMix(GRENING_POTION, Items.REDSTONE, GRENING_POTION_LONG);
		PotionHelper.addMix(PotionTypes.AWKWARD, ItemInit.GRENO_POWDER, GRENING_POTION);
	}
}
