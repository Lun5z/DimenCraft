
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimencraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.dimencraft.world.features.ores.XaniteOreFeature;
import net.mcreator.dimencraft.world.features.ores.RubyOreFeature;
import net.mcreator.dimencraft.world.features.ores.DimensOreFeature;
import net.mcreator.dimencraft.world.features.ores.AtlantisOreFeature;
import net.mcreator.dimencraft.world.features.WaterDonjonFeature;
import net.mcreator.dimencraft.world.features.RuinedPortalFeature;
import net.mcreator.dimencraft.world.features.MemorialFeature;
import net.mcreator.dimencraft.world.features.GlitchedTempleFeature;
import net.mcreator.dimencraft.world.features.FiretempleFeature;
import net.mcreator.dimencraft.DimencraftMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class DimencraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DimencraftMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> DIMENS_ORE = register("dimens_ore", DimensOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DimensOreFeature.GENERATE_BIOMES, DimensOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> XANITE_ORE = register("xanite_ore", XaniteOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, XaniteOreFeature.GENERATE_BIOMES, XaniteOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBY_ORE = register("ruby_ore", RubyOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RubyOreFeature.GENERATE_BIOMES, RubyOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FIRETEMPLE = register("firetemple", FiretempleFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, FiretempleFeature.GENERATE_BIOMES, FiretempleFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ATLANTIS_ORE = register("atlantis_ore", AtlantisOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, AtlantisOreFeature.GENERATE_BIOMES, AtlantisOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MEMORIAL = register("memorial", MemorialFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, MemorialFeature.GENERATE_BIOMES, MemorialFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GLITCHED_TEMPLE = register("glitched_temple", GlitchedTempleFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, GlitchedTempleFeature.GENERATE_BIOMES,
					GlitchedTempleFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUINED_PORTAL = register("ruined_portal", RuinedPortalFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, RuinedPortalFeature.GENERATE_BIOMES, RuinedPortalFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WATER_DONJON = register("water_donjon", WaterDonjonFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, WaterDonjonFeature.GENERATE_BIOMES, WaterDonjonFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
