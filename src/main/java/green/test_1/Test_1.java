package green.test_1;

import green.test_1.commands.CommandGrenoArmed;
import green.test_1.init.FluidInit;
import green.test_1.init.PotionInit;
import green.test_1.init.RecipeInit;
import green.test_1.keyboard.KeyLoader;
import green.test_1.proxy.CommonProxy;
import green.test_1.tabs.GrenoTab;
import green.test_1.util.Reference;
import green.test_1.util.compat.OreDictionaryCompat;
import green.test_1.util.handlers.RenderHandler;
import green.test_1.util.handlers.SoundsHandler;
import green.test_1.world.WorldGeneratorLoader;
import net.minecraft.block.BlockPlanks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import scala.tools.nsc.doc.model.Public;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class Test_1 {
	
	public static final CreativeTabs GRENO_TAB = new GrenoTab("greno_tab");

    @Mod.Instance(Reference.MOD_ID)
    public static Test_1 INSTANCE;
    
    
    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;
    
    static { FluidRegistry.enableUniversalBucket();}
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		PotionInit.registerPotions();
		FluidInit.registerFluids();
		
		RenderHandler.registerCustomMeshesAndStates();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	RecipeInit.init();
    	new WorldGeneratorLoader();
    	new KeyLoader();
    	SoundsHandler.registerSounds();
    	OreDictionaryCompat.registerOres();
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	    	
    }
    
    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event)
    {
    	event.registerServerCommand(new CommandGrenoArmed());
    }
}
