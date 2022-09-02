
package net.mcreator.dimencraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dimencraft.entity.FireGolemEntity;
import net.mcreator.dimencraft.client.model.Modelcustom_model;

public class FireGolemRenderer extends MobRenderer<FireGolemEntity, Modelcustom_model<FireGolemEntity>> {
	public FireGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FireGolemEntity entity) {
		return new ResourceLocation("dimencraft:textures/entities/texture.png");
	}
}
