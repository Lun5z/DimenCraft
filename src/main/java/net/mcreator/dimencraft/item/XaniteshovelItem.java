
package net.mcreator.dimencraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;

import net.mcreator.dimencraft.init.DimencraftModTabs;

public class XaniteshovelItem extends ShovelItem {
	public XaniteshovelItem() {
		super(new Tier() {
			public int getUses() {
				return 2600;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 7;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.25f, new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD));
	}
}
