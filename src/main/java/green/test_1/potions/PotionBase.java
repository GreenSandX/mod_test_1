package green.test_1.potions;

import green.test_1.init.PotionInit;
import green.test_1.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionBase extends Potion {
	
	public PotionBase(String name, boolean isBadEffectIn, int liquidColorIn, int iconIndexX, int iconIndexY) {
		super(isBadEffectIn, liquidColorIn);
		setPotionName(name);
		setIconIndex(iconIndexX, iconIndexY);
		setRegistryName(Reference.MOD_ID, name);
		
		//PotionInit.POTIONEFFECTS.add(this);
	}
	
	@Override
	public boolean hasStatusIcon() {//重新设定Icon取自...而不是原版资源
		Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Reference.MOD_ID + "textures/gui/potion_effects.png"));
		return true;
	}

}
