
package net.mcreator.dimencraft.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.dimencraft.procedures.DimensAppleFoodEatenProcedure;
import net.mcreator.dimencraft.init.DimencraftModTabs;

public class DimensAppleItem extends Item {
	public DimensAppleItem() {
		super(new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD).stacksTo(64).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

						.build()));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		DimensAppleFoodEatenProcedure.execute(entity);
		return retval;
	}
}
