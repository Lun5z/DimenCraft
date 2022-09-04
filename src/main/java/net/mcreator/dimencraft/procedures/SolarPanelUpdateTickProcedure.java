package net.mcreator.dimencraft.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class SolarPanelUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _lvl && _lvl.isDay() && world.canSeeSkyFromBelowWater(new BlockPos(x, y, z))) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				int _amount = 100;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
	}
}
