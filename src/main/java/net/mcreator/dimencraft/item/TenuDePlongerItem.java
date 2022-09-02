
package net.mcreator.dimencraft.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.dimencraft.init.DimencraftModTabs;
import net.mcreator.dimencraft.init.DimencraftModItems;

public abstract class TenuDePlongerItem extends ArmorItem {
	public TenuDePlongerItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 50;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{6, 10, 14, 9}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DimencraftModItems.ATLANTIS_INGOT.get()));
			}

			@Override
			public String getName() {
				return "tenu_de_plonger";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends TenuDePlongerItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dimencraft:textures/models/armor/atlantis__layer_1.png";
		}
	}

	public static class Chestplate extends TenuDePlongerItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dimencraft:textures/models/armor/atlantis__layer_1.png";
		}
	}

	public static class Leggings extends TenuDePlongerItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dimencraft:textures/models/armor/atlantis__layer_2.png";
		}
	}

	public static class Boots extends TenuDePlongerItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dimencraft:textures/models/armor/atlantis__layer_1.png";
		}
	}
}
