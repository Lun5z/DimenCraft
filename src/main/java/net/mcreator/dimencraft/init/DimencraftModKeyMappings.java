
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimencraft.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.dimencraft.network.GodmodoffMessage;
import net.mcreator.dimencraft.network.GodmodMessage;
import net.mcreator.dimencraft.DimencraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DimencraftModKeyMappings {
	public static final KeyMapping GODMOD = new KeyMapping("key.dimencraft.godmod", GLFW.GLFW_KEY_EQUAL, "key.categories.misc");
	public static final KeyMapping GODMODOFF = new KeyMapping("key.dimencraft.godmodoff", GLFW.GLFW_KEY_F12, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(GODMOD);
		ClientRegistry.registerKeyBinding(GODMODOFF);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == GODMOD.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						DimencraftMod.PACKET_HANDLER.sendToServer(new GodmodMessage(0, 0));
						GodmodMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == GODMODOFF.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						DimencraftMod.PACKET_HANDLER.sendToServer(new GodmodoffMessage(0, 0));
						GodmodoffMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
