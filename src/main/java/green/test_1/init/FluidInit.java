package green.test_1.init;

import green.test_1.fluids.FluidBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidInit
{
	public static final Fluid GRENO_LIQUID = new FluidBase("greno_liquid", 
			new ResourceLocation("test_1:blocks/greno_liquid_still"), 
			new ResourceLocation("test_1:blocks/greno_liquid_flow"));

	public static void registerFluids()
	{
		registerFluid(GRENO_LIQUID);
	}
	
	public static void registerFluid(Fluid fluid)
	{
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
}