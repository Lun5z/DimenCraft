
package net.mcreator.dimencraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dimencraft.entity.FireGolemEntity;
import net.mcreator.dimencraft.client.model.Modelfiregolem;

public class FireGolemRenderer extends MobRenderer<FireGolemEntity, Modelfiregolem<FireGolemEntity>> {
	public FireGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfiregolem(context.bakeLayer(Modelfiregolem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FireGolemEntity entity) {
		return new ResourceLocation("dimencraft:textures/iron_golem1.png");
	}
}
