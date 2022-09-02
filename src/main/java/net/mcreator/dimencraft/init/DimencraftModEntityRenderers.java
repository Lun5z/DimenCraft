
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimencraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.dimencraft.client.renderer.GlitchedEntityRenderer;
import net.mcreator.dimencraft.client.renderer.FireGolemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DimencraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DimencraftModEntities.FIRE_GOLEM.get(), FireGolemRenderer::new);
		event.registerEntityRenderer(DimencraftModEntities.GLITCHED_ENTITY.get(), GlitchedEntityRenderer::new);
	}
}
