package green.test_1.objects.blocks;

import green.test_1.util.interfaces.IHasModel;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.network.handshake.IHandshakeState;

public class BlockSpecial extends BlockBase implements IHasModel{

	public BlockSpecial(String name, Material material) {
		super(name, material);
		//setBedOccupied(world, pos, player, occupied);
		setBlockUnbreakable();
		setDefaultSlipperiness(slipperiness);
	}

}
