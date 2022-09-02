package net.mcreator.dimencraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.dimencraft.init.DimencraftModItems;
import net.mcreator.dimencraft.init.DimencraftModBlocks;

public class BackPackLevel3RightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			FallingBlockEntity.fall(_level, new BlockPos(x, y + 1, z), DimencraftModBlocks.BACK_PACK_BLOCKLVL_3.get().defaultBlockState());
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(DimencraftModItems.BACK_PACK_LEVEL_3.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
