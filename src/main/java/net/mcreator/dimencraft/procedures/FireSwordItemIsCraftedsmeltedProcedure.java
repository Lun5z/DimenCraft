package net.mcreator.dimencraft.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class FireSwordItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		(itemstack).enchant(Enchantments.FIRE_ASPECT, 1);
	}
}
