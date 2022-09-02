
package net.mcreator.dimencraft.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.dimencraft.procedures.XaniteArmorHelmetTickEventProcedure;
import net.mcreator.dimencraft.init.DimencraftModTabs;
import net.mcreator.dimencraft.init.DimencraftModItems;

public abstract class XaniteArmorItem extends ArmorItem {
	public XaniteArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 45;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{5, 8, 9, 5}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DimencraftModItems.XANITE_INGOT.get()));
			}

			@Override
			public String getName() {
				return "xanite_armor";
			}

			@Override
			public float getToughness() {
				return 3.9999999999999996f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends XaniteArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dimencraft:textures/models/armor/xanite_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			XaniteArmorHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Chestplate extends XaniteArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dimencraft:textures/models/armor/xanite_layer_1.png";
		}
	}

	public static class Leggings extends XaniteArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dimencraft:textures/models/armor/xanite_layer_2.png";
		}
	}

	public static class Boots extends XaniteArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dimencraft:textures/models/armor/xanite_layer_1.png";
		}
	}
}
