
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
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.dimencraft.entity.GlitchedEntityEntity;
import net.mcreator.dimencraft.entity.FireGolemEntity;
import net.mcreator.dimencraft.DimencraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DimencraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, DimencraftMod.MODID);
	public static final RegistryObject<EntityType<FireGolemEntity>> FIRE_GOLEM = register("fire_golem",
			EntityType.Builder.<FireGolemEntity>of(FireGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireGolemEntity::new).fireImmune()
					.sized(0.8f, 2.6999999999999997f));
	public static final RegistryObject<EntityType<GlitchedEntityEntity>> GLITCHED_ENTITY = register("glitched_entity",
			EntityType.Builder.<GlitchedEntityEntity>of(GlitchedEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlitchedEntityEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FireGolemEntity.init();
			GlitchedEntityEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FIRE_GOLEM.get(), FireGolemEntity.createAttributes().build());
		event.put(GLITCHED_ENTITY.get(), GlitchedEntityEntity.createAttributes().build());
	}
}
