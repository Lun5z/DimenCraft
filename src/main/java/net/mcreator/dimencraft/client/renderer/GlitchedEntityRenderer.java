
package net.mcreator.dimencraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dimencraft.entity.GlitchedEntityEntity;
import net.mcreator.dimencraft.client.model.Modelhumanoid;

public class GlitchedEntityRenderer extends MobRenderer<GlitchedEntityEntity, Modelhumanoid<GlitchedEntityEntity>> {
	public GlitchedEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhumanoid(context.bakeLayer(Modelhumanoid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GlitchedEntityEntity entity) {
		return new ResourceLocation("dimencraft:textures/entities/steve.png");
	}
}
