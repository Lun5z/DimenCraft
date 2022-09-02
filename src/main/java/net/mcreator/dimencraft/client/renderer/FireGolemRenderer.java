
package net.mcreator.dimencraft.client.renderer;

public class FireGolemRenderer extends MobRenderer<FireGolemEntity, Modelcustom_model<FireGolemEntity>> {

	public FireGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(FireGolemEntity entity) {
		return new ResourceLocation("dimencraft:textures/entities/texture.png");
	}

}
