
package net.mcreator.dimencraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

import net.mcreator.dimencraft.init.DimencraftModTabs;

public class RubypickaxeItem extends PickaxeItem {
	public RubypickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4200;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 12;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.25f, new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD));
	}
}
