package green.test_1.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class RecipeInit {
	
	public static  void init() {
		GameRegistry.addSmelting(ItemInit.GRENO_INGOT_CLAY_WRAPPED, new ItemStack(ItemInit.GRENO_INGOT_CERAMIC,1), 2.0F);
	}
	
	@SubscribeEvent
	public static void getVanillaFurnaceFuelValue(FurnaceFuelBurnTimeEvent event) {
		if(event.getItemStack().getItem() == ItemInit.GRENO_POWDER){
	            event.setBurnTime(100);
	    }
	
	}

}
