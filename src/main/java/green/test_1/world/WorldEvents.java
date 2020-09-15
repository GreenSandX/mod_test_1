package green.test_1.world;

import green.test_1.init.PotionInit;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.potion.PotionHelper;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.Metadata;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import scala.languageFeature.postfixOps;
import scala.tools.nsc.doc.model.Public;

@EventBusSubscriber
public class WorldEvents {
	@SubscribeEvent
	public static void greningPotionActive(PlayerTickEvent event) {
		boolean isActive = false;
		if (event.player.isPotionActive(PotionInit.GRENING_POTION_EFFECT)) isActive = true;
		if (isActive) {
			Entity player = event.player;
			World world = event.player.world;
			double x = player.getLookVec().x;
			double y = player.getLookVec().y;
			double z = player.getLookVec().z;
			world.spawnParticle(EnumParticleTypes.CLOUD, player.posX,player.posY + 1.3D, player.posZ, x*2, y*2, z*2, 2);
		}
	}
	/*
	@SubscribeEvent
	public static void blockSwitchActive(PlayerInteractEvent event) {
		BlockPos pos = event.getPos();
		Block block = event.getWorld().getblo
		IBlockState state = event.getWorld().getBlockState(event.getPos());
		Metadata meta = 
		event.getWorld().setBlockState(event.getPos(),state)
	}
	*/
}
