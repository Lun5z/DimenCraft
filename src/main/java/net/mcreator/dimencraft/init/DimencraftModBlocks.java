
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimencraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.dimencraft.block.XaniteblcokBlock;
import net.mcreator.dimencraft.block.XaniteOreBlock;
import net.mcreator.dimencraft.block.WaterDimensionPortalBlock;
import net.mcreator.dimencraft.block.RubyOreBlock;
import net.mcreator.dimencraft.block.RubyBlockBlock;
import net.mcreator.dimencraft.block.RedWoolTrapBlock;
import net.mcreator.dimencraft.block.GlitchedDimensionPortalPortalBlock;
import net.mcreator.dimencraft.block.GlitchedBlockBlock;
import net.mcreator.dimencraft.block.FireDimensionPortalBlock;
import net.mcreator.dimencraft.block.DimensOreBlock;
import net.mcreator.dimencraft.block.DimensBlockBlock;
import net.mcreator.dimencraft.block.DecoupeurBlock;
import net.mcreator.dimencraft.block.CaveBlockBlock;
import net.mcreator.dimencraft.block.BackPackBlocklvl3Block;
import net.mcreator.dimencraft.block.AtlantisOreBlock;
import net.mcreator.dimencraft.block.AlbaniaWoodBlock;
import net.mcreator.dimencraft.block.AlbaniaStairsBlock;
import net.mcreator.dimencraft.block.AlbaniaSlabBlock;
import net.mcreator.dimencraft.block.AlbaniaPressurePlateBlock;
import net.mcreator.dimencraft.block.AlbaniaPlanksBlock;
import net.mcreator.dimencraft.block.AlbaniaLogBlock;
import net.mcreator.dimencraft.block.AlbaniaLeavesBlock;
import net.mcreator.dimencraft.block.AlbaniaFenceGateBlock;
import net.mcreator.dimencraft.block.AlbaniaFenceBlock;
import net.mcreator.dimencraft.block.AlbaniaButtonBlock;
import net.mcreator.dimencraft.DimencraftMod;

public class DimencraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DimencraftMod.MODID);
	public static final RegistryObject<Block> PORTAL_BLOCK = REGISTRY.register("portal_block", () -> new DimensBlockBlock());
	public static final RegistryObject<Block> DIMENS_ORE = REGISTRY.register("dimens_ore", () -> new DimensOreBlock());
	public static final RegistryObject<Block> XANITE_ORE = REGISTRY.register("xanite_ore", () -> new XaniteOreBlock());
	public static final RegistryObject<Block> FIRE_DIMENSION_PORTAL = REGISTRY.register("fire_dimension_portal",
			() -> new FireDimensionPortalBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> GLITCHED_DIMENSION_PORTAL_PORTAL = REGISTRY.register("glitched_dimension_portal_portal",
			() -> new GlitchedDimensionPortalPortalBlock());
	public static final RegistryObject<Block> GLITCHED_BLOCK = REGISTRY.register("glitched_block", () -> new GlitchedBlockBlock());
	public static final RegistryObject<Block> DECOUPEUR = REGISTRY.register("decoupeur", () -> new DecoupeurBlock());
	public static final RegistryObject<Block> BACK_PACK_BLOCKLVL_3 = REGISTRY.register("back_pack_blocklvl_3", () -> new BackPackBlocklvl3Block());
	public static final RegistryObject<Block> XANITEBLCOK = REGISTRY.register("xaniteblcok", () -> new XaniteblcokBlock());
	public static final RegistryObject<Block> WATER_DIMENSION_PORTAL = REGISTRY.register("water_dimension_portal",
			() -> new WaterDimensionPortalBlock());
	public static final RegistryObject<Block> ATLANTIS_ORE = REGISTRY.register("atlantis_ore", () -> new AtlantisOreBlock());
	public static final RegistryObject<Block> CAVE_BLOCK = REGISTRY.register("cave_block", () -> new CaveBlockBlock());
	public static final RegistryObject<Block> RED_WOOL_TRAP = REGISTRY.register("red_wool_trap", () -> new RedWoolTrapBlock());
	public static final RegistryObject<Block> ALBANIA_WOOD = REGISTRY.register("albania_wood", () -> new AlbaniaWoodBlock());
	public static final RegistryObject<Block> ALBANIA_LOG = REGISTRY.register("albania_log", () -> new AlbaniaLogBlock());
	public static final RegistryObject<Block> ALBANIA_PLANKS = REGISTRY.register("albania_planks", () -> new AlbaniaPlanksBlock());
	public static final RegistryObject<Block> ALBANIA_LEAVES = REGISTRY.register("albania_leaves", () -> new AlbaniaLeavesBlock());
	public static final RegistryObject<Block> ALBANIA_STAIRS = REGISTRY.register("albania_stairs", () -> new AlbaniaStairsBlock());
	public static final RegistryObject<Block> ALBANIA_SLAB = REGISTRY.register("albania_slab", () -> new AlbaniaSlabBlock());
	public static final RegistryObject<Block> ALBANIA_FENCE = REGISTRY.register("albania_fence", () -> new AlbaniaFenceBlock());
	public static final RegistryObject<Block> ALBANIA_FENCE_GATE = REGISTRY.register("albania_fence_gate", () -> new AlbaniaFenceGateBlock());
	public static final RegistryObject<Block> ALBANIA_PRESSURE_PLATE = REGISTRY.register("albania_pressure_plate",
			() -> new AlbaniaPressurePlateBlock());
	public static final RegistryObject<Block> ALBANIA_BUTTON = REGISTRY.register("albania_button", () -> new AlbaniaButtonBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RubyOreBlock.registerRenderLayer();
			RubyBlockBlock.registerRenderLayer();
			GlitchedBlockBlock.registerRenderLayer();
			DecoupeurBlock.registerRenderLayer();
			BackPackBlocklvl3Block.registerRenderLayer();
			XaniteblcokBlock.registerRenderLayer();
			CaveBlockBlock.registerRenderLayer();
		}
	}
}
