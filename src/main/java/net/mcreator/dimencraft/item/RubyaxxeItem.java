
package net.mcreator.dimencraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.dimencraft.init.DimencraftModTabs;

public class RubyaxxeItem extends AxeItem {
	public RubyaxxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3700;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.75f, new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD));
	}
}
