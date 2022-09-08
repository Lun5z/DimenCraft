
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimencraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dimencraft.item.XaniteshovelItem;
import net.mcreator.dimencraft.item.XanitepickaxeItem;
import net.mcreator.dimencraft.item.XaniteaxeItem;
import net.mcreator.dimencraft.item.XaniteSwordItem;
import net.mcreator.dimencraft.item.XaniteSlicedItem;
import net.mcreator.dimencraft.item.XaniteIngotItem;
import net.mcreator.dimencraft.item.XaniteArmorItem;
import net.mcreator.dimencraft.item.WaterDimensionItem;
import net.mcreator.dimencraft.item.TomatoCuttedItem;
import net.mcreator.dimencraft.item.TomateItem;
import net.mcreator.dimencraft.item.TheAdventureItem;
import net.mcreator.dimencraft.item.TenuDePlongerItem;
import net.mcreator.dimencraft.item.RubyshovelItem;
import net.mcreator.dimencraft.item.RubypickaxeItem;
import net.mcreator.dimencraft.item.RubyaxxeItem;
import net.mcreator.dimencraft.item.RubyItem;
import net.mcreator.dimencraft.item.RubyArmorItem;
import net.mcreator.dimencraft.item.KnifeItem;
import net.mcreator.dimencraft.item.HealStickItem;
import net.mcreator.dimencraft.item.GlitchedIngotItem;
import net.mcreator.dimencraft.item.GlitchedDimensionPortalItem;
import net.mcreator.dimencraft.item.FriesItem;
import net.mcreator.dimencraft.item.FireSwordItem;
import net.mcreator.dimencraft.item.FireIngotItem;
import net.mcreator.dimencraft.item.FireDimensionItem;
import net.mcreator.dimencraft.item.DimensIngotItem;
import net.mcreator.dimencraft.item.DimensAppleItem;
import net.mcreator.dimencraft.item.CheeseItem;
import net.mcreator.dimencraft.item.BackPacksItem;
import net.mcreator.dimencraft.item.BackPackUpgraderItem;
import net.mcreator.dimencraft.item.BackPackLevel3Item;
import net.mcreator.dimencraft.item.BackPackLevel2Item;
import net.mcreator.dimencraft.item.AtlantisSwordItem;
import net.mcreator.dimencraft.item.AtlantisShovelItem;
import net.mcreator.dimencraft.item.AtlantisPickaxeItem;
import net.mcreator.dimencraft.item.AtlantisIngotItem;
import net.mcreator.dimencraft.item.AtlantisHoeItem;
import net.mcreator.dimencraft.item.AtlantisAxeItem;
import net.mcreator.dimencraft.DimencraftMod;

public class DimencraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DimencraftMod.MODID);
	public static final RegistryObject<Item> PORTAL_BLOCK = block(DimencraftModBlocks.PORTAL_BLOCK, DimencraftModTabs.TAB_DIMENMOD);
	public static final RegistryObject<Item> DIMENS_INGOT = REGISTRY.register("dimens_ingot", () -> new DimensIngotItem());
	public static final RegistryObject<Item> DIMENS_ORE = block(DimencraftModBlocks.DIMENS_ORE, DimencraftModTabs.TAB_DIMENMOD);
	public static final RegistryObject<Item> BACK_PACKS = REGISTRY.register("back_packs", () -> new BackPacksItem());
	public static final RegistryObject<Item> HEAL_STICK = REGISTRY.register("heal_stick", () -> new HealStickItem());
	public static final RegistryObject<Item> BACK_PACK_UPGRADER = REGISTRY.register("back_pack_upgrader", () -> new BackPackUpgraderItem());
	public static final RegistryObject<Item> BACK_PACK_LEVEL_2 = REGISTRY.register("back_pack_level_2", () -> new BackPackLevel2Item());
	public static final RegistryObject<Item> DIMENS_APPLE = REGISTRY.register("dimens_apple", () -> new DimensAppleItem());
	public static final RegistryObject<Item> XANITE_ORE = block(DimencraftModBlocks.XANITE_ORE, DimencraftModTabs.TAB_DIMENMOD);
	public static final RegistryObject<Item> XANITE_INGOT = REGISTRY.register("xanite_ingot", () -> new XaniteIngotItem());
	public static final RegistryObject<Item> XANITE_SLICED = REGISTRY.register("xanite_sliced", () -> new XaniteSlicedItem());
	public static final RegistryObject<Item> XANITE_SWORD = REGISTRY.register("xanite_sword", () -> new XaniteSwordItem());
	public static final RegistryObject<Item> XANITE_ARMOR_HELMET = REGISTRY.register("xanite_armor_helmet", () -> new XaniteArmorItem.Helmet());
	public static final RegistryObject<Item> XANITE_ARMOR_CHESTPLATE = REGISTRY.register("xanite_armor_chestplate",
			() -> new XaniteArmorItem.Chestplate());
	public static final RegistryObject<Item> XANITE_ARMOR_LEGGINGS = REGISTRY.register("xanite_armor_leggings", () -> new XaniteArmorItem.Leggings());
	public static final RegistryObject<Item> XANITE_ARMOR_BOOTS = REGISTRY.register("xanite_armor_boots", () -> new XaniteArmorItem.Boots());
	public static final RegistryObject<Item> XANITEPICKAXE = REGISTRY.register("xanitepickaxe", () -> new XanitepickaxeItem());
	public static final RegistryObject<Item> XANITEAXE = REGISTRY.register("xaniteaxe", () -> new XaniteaxeItem());
	public static final RegistryObject<Item> XANITESHOVEL = REGISTRY.register("xaniteshovel", () -> new XaniteshovelItem());
	public static final RegistryObject<Item> FIRE_GOLEM = REGISTRY.register("fire_golem_spawn_egg",
			() -> new ForgeSpawnEggItem(DimencraftModEntities.FIRE_GOLEM, -13421773, -13312,
					new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD)));
	public static final RegistryObject<Item> FIRE_DIMENSION = REGISTRY.register("fire_dimension", () -> new FireDimensionItem());
	public static final RegistryObject<Item> FIRE_INGOT = REGISTRY.register("fire_ingot", () -> new FireIngotItem());
	public static final RegistryObject<Item> FIRE_SWORD = REGISTRY.register("fire_sword", () -> new FireSwordItem());
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBY_ORE = block(DimencraftModBlocks.RUBY_ORE, DimencraftModTabs.TAB_DIMENMOD);
	public static final RegistryObject<Item> RUBY_BLOCK = block(DimencraftModBlocks.RUBY_BLOCK, DimencraftModTabs.TAB_DIMENMOD);
	public static final RegistryObject<Item> RUBY_ARMOR_HELMET = REGISTRY.register("ruby_armor_helmet", () -> new RubyArmorItem.Helmet());
	public static final RegistryObject<Item> RUBY_ARMOR_CHESTPLATE = REGISTRY.register("ruby_armor_chestplate", () -> new RubyArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBY_ARMOR_LEGGINGS = REGISTRY.register("ruby_armor_leggings", () -> new RubyArmorItem.Leggings());
	public static final RegistryObject<Item> RUBY_ARMOR_BOOTS = REGISTRY.register("ruby_armor_boots", () -> new RubyArmorItem.Boots());
	public static final RegistryObject<Item> RUBYAXXE = REGISTRY.register("rubyaxxe", () -> new RubyaxxeItem());
	public static final RegistryObject<Item> RUBYPICKAXE = REGISTRY.register("rubypickaxe", () -> new RubypickaxeItem());
	public static final RegistryObject<Item> RUBYSHOVEL = REGISTRY.register("rubyshovel", () -> new RubyshovelItem());
	public static final RegistryObject<Item> GLITCHED_DIMENSION_PORTAL = REGISTRY.register("glitched_dimension_portal",
			() -> new GlitchedDimensionPortalItem());
	public static final RegistryObject<Item> GLITCHED_ENTITY = REGISTRY.register("glitched_entity_spawn_egg",
			() -> new ForgeSpawnEggItem(DimencraftModEntities.GLITCHED_ENTITY, -1, -65485,
					new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD)));
	public static final RegistryObject<Item> GLITCHED_INGOT = REGISTRY.register("glitched_ingot", () -> new GlitchedIngotItem());
	public static final RegistryObject<Item> GLITCHED_BLOCK = block(DimencraftModBlocks.GLITCHED_BLOCK, DimencraftModTabs.TAB_DIMENMOD);
	public static final RegistryObject<Item> DECOUPEUR = block(DimencraftModBlocks.DECOUPEUR, CreativeModeTab.TAB_FOOD);
	public static final RegistryObject<Item> TOMATE = REGISTRY.register("tomate", () -> new TomateItem());
	public static final RegistryObject<Item> TOMATO_CUTTED = REGISTRY.register("tomato_cutted", () -> new TomatoCuttedItem());
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());
	public static final RegistryObject<Item> FRIES = REGISTRY.register("fries", () -> new FriesItem());
	public static final RegistryObject<Item> KNIFE = REGISTRY.register("knife", () -> new KnifeItem());
	public static final RegistryObject<Item> BACK_PACK_LEVEL_3 = REGISTRY.register("back_pack_level_3", () -> new BackPackLevel3Item());
	public static final RegistryObject<Item> BACK_PACK_BLOCKLVL_3 = block(DimencraftModBlocks.BACK_PACK_BLOCKLVL_3, null);
	public static final RegistryObject<Item> XANITEBLCOK = block(DimencraftModBlocks.XANITEBLCOK, DimencraftModTabs.TAB_DIMENMOD);
	public static final RegistryObject<Item> WATER_DIMENSION = REGISTRY.register("water_dimension", () -> new WaterDimensionItem());
	public static final RegistryObject<Item> TENU_DE_PLONGER_HELMET = REGISTRY.register("tenu_de_plonger_helmet",
			() -> new TenuDePlongerItem.Helmet());
	public static final RegistryObject<Item> TENU_DE_PLONGER_CHESTPLATE = REGISTRY.register("tenu_de_plonger_chestplate",
			() -> new TenuDePlongerItem.Chestplate());
	public static final RegistryObject<Item> TENU_DE_PLONGER_LEGGINGS = REGISTRY.register("tenu_de_plonger_leggings",
			() -> new TenuDePlongerItem.Leggings());
	public static final RegistryObject<Item> TENU_DE_PLONGER_BOOTS = REGISTRY.register("tenu_de_plonger_boots", () -> new TenuDePlongerItem.Boots());
	public static final RegistryObject<Item> ATLANTIS_SWORD = REGISTRY.register("atlantis_sword", () -> new AtlantisSwordItem());
	public static final RegistryObject<Item> ATLANTIS_PICKAXE = REGISTRY.register("atlantis_pickaxe", () -> new AtlantisPickaxeItem());
	public static final RegistryObject<Item> ATLANTIS_SHOVEL = REGISTRY.register("atlantis_shovel", () -> new AtlantisShovelItem());
	public static final RegistryObject<Item> ATLANTIS_AXE = REGISTRY.register("atlantis_axe", () -> new AtlantisAxeItem());
	public static final RegistryObject<Item> ATLANTIS_HOE = REGISTRY.register("atlantis_hoe", () -> new AtlantisHoeItem());
	public static final RegistryObject<Item> ATLANTIS_INGOT = REGISTRY.register("atlantis_ingot", () -> new AtlantisIngotItem());
	public static final RegistryObject<Item> THE_ADVENTURE = REGISTRY.register("the_adventure", () -> new TheAdventureItem());
	public static final RegistryObject<Item> ATLANTIS_ORE = block(DimencraftModBlocks.ATLANTIS_ORE, DimencraftModTabs.TAB_DIMENMOD);
	public static final RegistryObject<Item> CAVE_BLOCK = block(DimencraftModBlocks.CAVE_BLOCK, DimencraftModTabs.TAB_DIMENMOD);
	public static final RegistryObject<Item> SOLAR_PANEL = block(DimencraftModBlocks.SOLAR_PANEL, DimencraftModTabs.TAB_DIMENMOD);
	public static final RegistryObject<Item> RED_WOOL_TRAP = block(DimencraftModBlocks.RED_WOOL_TRAP, DimencraftModTabs.TAB_DIMENMOD);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
