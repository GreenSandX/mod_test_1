package green.test_1.objects.items;

import green.test_1.Test_1;
import green.test_1.init.ItemInit;
import green.test_1.util.Reference;
import green.test_1.util.interfaces.IHasModel;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import scala.swing.TextComponent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ItemFoodBase extends ItemFood implements IHasModel{

	public ItemFoodBase(String name,int amount, boolean isWolfFood) {
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(Reference.MOD_ID,name);
		setCreativeTab(Test_1.GRENO_TAB);
			
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Test_1.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@SubscribeEvent
	public static void attackShowEntityNBT(AttackEntityEvent event) {//必需是static!!!
		//if(event.getEntityLiving().getHeldItemMainhand() == new ItemStack(this)) {
			System.out.println("yes");
			System.out.println(event.getEntity().toString());
			System.out.println(event.getTarget().toString());
			System.out.println(event.getTarget().serializeNBT().toString());
			/*
			NBTTagCompound nbt = event.getEntity().serializeNBT();
			ITextComponent textComponent = new TextComponentString(nbt.toString());
			event.getEntity().sendMessage(textComponent);
			*/
		//}
	}

}
