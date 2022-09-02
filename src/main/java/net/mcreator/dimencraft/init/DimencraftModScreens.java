
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimencraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.dimencraft.client.gui.LanguageSelctionScreen;
import net.mcreator.dimencraft.client.gui.DecoupeurGUIScreen;
import net.mcreator.dimencraft.client.gui.Chapter1Screen;
import net.mcreator.dimencraft.client.gui.Chapitre1FrancaisScreen;
import net.mcreator.dimencraft.client.gui.Backpacklvl2Screen;
import net.mcreator.dimencraft.client.gui.BackPacklvl3Screen;
import net.mcreator.dimencraft.client.gui.BackPackScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DimencraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(DimencraftModMenus.BACK_PACKC, BackPackScreen::new);
			MenuScreens.register(DimencraftModMenus.BACKPACKLVL_2, Backpacklvl2Screen::new);
			MenuScreens.register(DimencraftModMenus.DECOUPEUR_GUI, DecoupeurGUIScreen::new);
			MenuScreens.register(DimencraftModMenus.BACK_PACKLVL_3, BackPacklvl3Screen::new);
			MenuScreens.register(DimencraftModMenus.CHAPTER_1ENG, Chapter1Screen::new);
			MenuScreens.register(DimencraftModMenus.CHAPITRE_1_FRANCAIS, Chapitre1FrancaisScreen::new);
			MenuScreens.register(DimencraftModMenus.LANGUAGE_SELCTION, LanguageSelctionScreen::new);
		});
	}
}
