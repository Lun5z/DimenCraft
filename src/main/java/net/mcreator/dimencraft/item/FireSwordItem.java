
package net.mcreator.dimencraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import net.mcreator.dimencraft.procedures.FireSwordItemIsCraftedsmeltedProcedure;
import net.mcreator.dimencraft.init.DimencraftModTabs;
import net.mcreator.dimencraft.init.DimencraftModItems;

public class FireSwordItem extends SwordItem {
	public FireSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1250;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DimencraftModItems.FIRE_INGOT.get()));
			}
		}, 3, -2.7f, new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD).fireResistant());
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		FireSwordItemIsCraftedsmeltedProcedure.execute(itemstack);
	}
}
