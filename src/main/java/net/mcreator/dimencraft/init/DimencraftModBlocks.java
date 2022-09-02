
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
import net.mcreator.dimencraft.block.GlitchedDimensionPortalPortalBlock;
import net.mcreator.dimencraft.block.GlitchedBlockBlock;
import net.mcreator.dimencraft.block.FireDimensionPortalBlock;
import net.mcreator.dimencraft.block.DimensOreBlock;
import net.mcreator.dimencraft.block.DimensBlockBlock;
import net.mcreator.dimencraft.block.DecoupeurBlock;
import net.mcreator.dimencraft.block.BackPackBlocklvl3Block;
import net.mcreator.dimencraft.block.AtlantisOreBlock;
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

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RubyOreBlock.registerRenderLayer();
			RubyBlockBlock.registerRenderLayer();
			DecoupeurBlock.registerRenderLayer();
			BackPackBlocklvl3Block.registerRenderLayer();
			XaniteblcokBlock.registerRenderLayer();
		}
	}
}
