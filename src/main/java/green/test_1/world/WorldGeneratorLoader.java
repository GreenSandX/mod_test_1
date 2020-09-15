package green.test_1.world;

import com.sun.jna.platform.win32.Advapi32Util.EventLogType;

import green.test_1.world.gen.WorldGenCustomOres;
import net.minecraft.network.play.server.SPacketCombatEvent.Event;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class WorldGeneratorLoader
{
    private static WorldGenerator generatorCustomOre = new WorldGenCustomOres();

    private BlockPos position;

    public WorldGeneratorLoader()
    {
        MinecraftForge.ORE_GEN_BUS.register(this);
        System.out.println("*********WorldGeneratorLoader done****************");
    }

    @SubscribeEvent
    public void onOreGenPost(OreGenEvent.Post event)
    {
        if (!event.getPos().equals(this.position))
        {
            this.position = event.getPos();
            generatorCustomOre.generate(event.getWorld(), event.getRand(), event.getPos());
            System.out.println("**********onOreGenPost done**********");
            System.out.println(this.position.toString());
        }
    }

    /*
    @SubscribeEvent
    public void onOreGenGenerateMinable(OreGenEvent.GenerateMinable event)
    {
        if (event.getType() == OreGenEvent.GenerateMinable.EventType.ANDESITE)//安山岩
        {
            event.setResult();
        }
    }
    */
}