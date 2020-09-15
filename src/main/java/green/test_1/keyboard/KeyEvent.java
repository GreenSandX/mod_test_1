package green.test_1.keyboard;

import akka.dispatch.Foreach;
import green.test_1.init.PotionInit;
import green.test_1.util.Reference;
import green.test_1.util.handlers.SoundsHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.EventBus;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import scala.util.control.TailCalls.Done;

@EventBusSubscriber
public class KeyEvent {
	
	boolean x_press = true;
	
    @SubscribeEvent
    public static void onKeyInput(KeyInputEvent event)
    {
        if (KeyLoader.gjump.isPressed() && KeyLoader.gjump.isActiveAndMatches(KeyLoader.gjump.getKeyCode()))
        {
        	System.out.println("*********** X isKeyDown**********");
        	
            EntityPlayer player = Minecraft.getMinecraft().player;
            World world = Minecraft.getMinecraft().world;
            
            world.playSound(player.posX, player.posY, player.posZ, 
            		SoundsHandler.PLAYER_BO, SoundCategory.PLAYERS, 10f, 10f, false);
            
        }

    }
}
