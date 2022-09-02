
package net.mcreator.dimencraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.dimencraft.world.inventory.Chapitre1FrancaisMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Chapitre1FrancaisScreen extends AbstractContainerScreen<Chapitre1FrancaisMenu> {
	private final static HashMap<String, Object> guistate = Chapitre1FrancaisMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Chapitre1FrancaisScreen(Chapitre1FrancaisMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 284;
		this.imageHeight = 103;
	}

	private static final ResourceLocation texture = new ResourceLocation("dimencraft:textures/chapitre_1_francais.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Bienvenue dans mon histoire mon nom est Steve,", 4, 8, -16777216);
		this.font.draw(poseStack, "Tout a commencer quand j'ai decouvert la dimension", 4, 33, -16777216);
		this.font.draw(poseStack, "de Feu, il y faisait tres chaud, j'y ai aussi ", 5, 45, -16777216);
		this.font.draw(poseStack, "decouvert un nouveau minerais, le lingot de Feu.", 5, 55, -16777216);
		this.font.draw(poseStack, "A l'origine je travaillais dans les mines, j'y ai ", 6, 65, -16777216);
		this.font.draw(poseStack, "decouvert un minerais permettant de cr\u00E9e des ", 4, 75, -16777216);
		this.font.draw(poseStack, "portails", 235, 75, -16777216);
		this.font.draw(poseStack, "j'ai decouvert 10 dimensions...", 4, 86, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
