
package net.mcreator.dimencraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.dimencraft.init.DimencraftModTabs;
import net.mcreator.dimencraft.init.DimencraftModItems;

public class AtlantisSwordItem extends SwordItem {
	public AtlantisSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3021;
			}

			public float getSpeed() {
				return 13.5f;
			}

			public float getAttackDamageBonus() {
				return 14.5f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 7;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DimencraftModItems.ATLANTIS_INGOT.get()));
			}
		}, 3, 2.5f, new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD));
	}
}
