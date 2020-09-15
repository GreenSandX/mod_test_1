package green.test_1.util.compat;

import green.test_1.init.ItemInit;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat {
	public static void registerOres() {
		OreDictionary.registerOre("dustRedstone", ItemInit.GRENO_POWDER);
	}

}
