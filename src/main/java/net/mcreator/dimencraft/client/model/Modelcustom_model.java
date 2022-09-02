package net.mcreator.dimencraft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dimencraft", "modelcustom_model"), "main");
	public final ModelPart pieds;
	public final ModelPart corp;
	public final ModelPart bouche;
	public final ModelPart corne;
	public final ModelPart bras;
	public final ModelPart yeux;

	public Modelcustom_model(ModelPart root) {
		this.pieds = root.getChild("pieds");
		this.corp = root.getChild("corp");
		this.bouche = root.getChild("bouche");
		this.corne = root.getChild("corne");
		this.bras = root.getChild("bras");
		this.yeux = root.getChild("yeux");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition pieds = partdefinition.addOrReplaceChild("pieds", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition gauche = pieds
				.addOrReplaceChild("gauche",
						CubeListBuilder.create().texOffs(20, 51).addBox(-7.0F, -2.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
								.texOffs(54, 15).addBox(-6.0F, -9.0F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = gauche.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(49, 44).addBox(-7.0F, -15.0F, -3.5F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(26, 37)
						.addBox(-7.5F, -7.0F, -4.0F, 7.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition droit = pieds
				.addOrReplaceChild("droit",
						CubeListBuilder.create().texOffs(52, 1).addBox(1.0F, -2.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
								.texOffs(38, 58).addBox(1.0F, -9.0F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r2 = droit.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 40).addBox(1.0F, -15.0F, -3.5F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(30, 7)
						.addBox(0.5F, -7.0F, -4.0F, 7.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition corp = partdefinition.addOrReplaceChild("corp",
				CubeListBuilder.create().texOffs(26, 23).addBox(-5.0F, -21.0F, -3.0F, 10.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r3 = corp.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -28.0F, -2.0F, 12.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bouche = partdefinition.addOrReplaceChild("bouche",
				CubeListBuilder.create().texOffs(0, 15).addBox(-4.0F, -32.0F, -6.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r4 = bouche.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(48, 41).addBox(-2.0F, -29.0F, -8.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(3.0F, -28.0F, -8.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-5.0F, -28.0F, -8.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(31, 0).addBox(-5.0F, -27.0F, -8.0F, 10.0F,
								3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition corne = partdefinition.addOrReplaceChild("corne",
				CubeListBuilder.create().texOffs(0, 29).addBox(-4.0F, -34.0F, -5.0F, 8.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(58, 24)
						.addBox(4.0F, -34.0F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 9)
						.addBox(-9.0F, -34.0F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 9)
						.addBox(6.0F, -35.0F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 67)
						.addBox(-9.0F, -35.0F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -2.0F));
		PartDefinition bras = partdefinition.addOrReplaceChild("bras", CubeListBuilder.create(), PartPose.offset(12.0F, 20.0F, 0.0F));
		PartDefinition droit2 = bras.addOrReplaceChild("droit2",
				CubeListBuilder.create().texOffs(34, 67).addBox(-5.0F, -23.0F, -0.5F, 5.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(-24.5F, -16.0F, -1.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 59)
						.addBox(-4.0F, -12.0F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r5 = droit2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(60, 58).addBox(-3.0F, -24.8F, -2.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, -0.1745F));
		PartDefinition gauche2 = bras.addOrReplaceChild("gauche2",
				CubeListBuilder.create().texOffs(0, 63).addBox(-24.0F, -23.0F, -0.5F, 5.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(53, 32)
						.addBox(-5.5F, -16.0F, -1.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(19, 40)
						.addBox(-23.0F, -12.0F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r6 = gauche2.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(17, 59).addBox(-3.5F, -4.9494F, 4.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.1925F, -19.1506F, -5.7496F, 0.0436F, 0.1745F, 0.1745F));
		PartDefinition yeux = partdefinition
				.addOrReplaceChild(
						"yeux", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -32.0F, -6.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
								.texOffs(0, 0).addBox(1.0F, -32.0F, -6.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		pieds.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		corp.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bouche.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		corne.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bras.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		yeux.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
