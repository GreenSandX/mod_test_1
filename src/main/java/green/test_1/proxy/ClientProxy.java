package green.test_1.proxy;

import green.test_1.util.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy{

	
	@Override
	public void registerItemRenderer(Item item,int meta,String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, 
				new ModelResourceLocation(item.getRegistryName(),id));
	}
	
	@Override
	public void registerVariantRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(
				Reference.MOD_ID + ":" + item.getUnlocalizedName(new ItemStack(item, 1, meta)),id));
	}
	
	

}
