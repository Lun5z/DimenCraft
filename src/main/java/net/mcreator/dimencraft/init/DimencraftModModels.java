
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimencraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.dimencraft.client.model.Modelhumanoid;
import net.mcreator.dimencraft.client.model.Modelearthboss;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DimencraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelhumanoid.LAYER_LOCATION, Modelhumanoid::createBodyLayer);
		event.registerLayerDefinition(Modelearthboss.LAYER_LOCATION, Modelearthboss::createBodyLayer);
	}
}
