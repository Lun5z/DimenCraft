
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimencraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.dimencraft.world.biome.WaterbiomeBiome;
import net.mcreator.dimencraft.world.biome.GlitchedbiomeBiome;
import net.mcreator.dimencraft.world.biome.FireBiomeBiome;
import net.mcreator.dimencraft.DimencraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DimencraftModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, DimencraftMod.MODID);
	public static final RegistryObject<Biome> FIRE_BIOME = REGISTRY.register("fire_biome", () -> FireBiomeBiome.createBiome());
	public static final RegistryObject<Biome> GLITCHEDBIOME = REGISTRY.register("glitchedbiome", () -> GlitchedbiomeBiome.createBiome());
	public static final RegistryObject<Biome> WATERBIOME = REGISTRY.register("waterbiome", () -> WaterbiomeBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FireBiomeBiome.init();
			GlitchedbiomeBiome.init();
			WaterbiomeBiome.init();
		});
	}
}
