
package net.mcreator.dimencraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

import net.mcreator.dimencraft.init.DimencraftModTabs;

public class AtlantisPickaxeItem extends PickaxeItem {
	public AtlantisPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3059;
			}

			public float getSpeed() {
				return 17f;
			}

			public float getAttackDamageBonus() {
				return 2.1f;
			}

			public int getLevel() {
				return 12;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD));
	}
}
