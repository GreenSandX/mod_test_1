package green.test_1.commands;

import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;

import green.test_1.util.Reference;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CommandGrenoArmed extends CommandBase{
	
    private final List<String> aliases;
	
    public CommandGrenoArmed(){
        aliases = Lists.newArrayList(Reference.MOD_ID, "GA", "ga");
    }

	@Override
	public String getName() {
		return "ga";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "ga <Entity>";
	}

	@Override
	public List<String> getAliases() {
		return aliases;
	}
	
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		System.out.println(sender.getName());
		//server.getEntityFromUuid(entity)
		System.out.println("*****************");
		System.out.println(args[0].toString());
		Entity entity = getEntity(server, sender, args[0]);
		System.out.println(entity.toString());
	}

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args,  BlockPos targetPos) {
        return Collections.emptyList();
    }
}
