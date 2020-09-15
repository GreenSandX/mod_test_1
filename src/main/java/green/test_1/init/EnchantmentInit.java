package green.test_1.init;

import java.util.List;//not import java.awt.List

import green.test_1.enchantment.EnchantmentGrening;
import green.test_1.util.Reference;

import java.util.ArrayList;

import net.minecraft.client.particle.Particle;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)//不能忘
public class EnchantmentInit {
	public static final List<Enchantment> ENCHANTMENTS = new ArrayList<Enchantment>();
	
	public static final Enchantment GRENING_ENCHANTMENT = new EnchantmentGrening();

	@SubscribeEvent
	public static void GreningFunction(LivingUpdateEvent event) {
		EntityLivingBase living = event.getEntityLiving();
		int level = EnchantmentHelper.getMaxEnchantmentLevel(GRENING_ENCHANTMENT, living);
		BlockPos pos = living.getPosition();
		World world = event.getEntity().world;
		
		if(level != 0) {
			double x = living.getLookVec().x;
			double y = living.getLookVec().y;
			double z = living.getLookVec().z;
			System.out.println("\n" + "LookVecx:" + x + "  y:" + y + "  z:" + z +"\n"
					+ "living.posX:" + living.posX + "  Y" + living.posY + "  Z" + living.posZ);
			world.spawnParticle(EnumParticleTypes.CLOUD, living.posX,living.posY + 1.3D, living.posZ, x*5, y*5, z*5, level);
		}
	}
}
