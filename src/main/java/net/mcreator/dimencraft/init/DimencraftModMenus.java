
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimencraft.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.dimencraft.world.inventory.LanguageSelctionMenu;
import net.mcreator.dimencraft.world.inventory.DecoupeurGUIMenu;
import net.mcreator.dimencraft.world.inventory.Chapter1Menu;
import net.mcreator.dimencraft.world.inventory.Chapitre1FrancaisMenu;
import net.mcreator.dimencraft.world.inventory.Backpacklvl2Menu;
import net.mcreator.dimencraft.world.inventory.BackPacklvl3Menu;
import net.mcreator.dimencraft.world.inventory.BackPackMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DimencraftModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<BackPackMenu> BACK_PACKC = register("back_packc", (id, inv, extraData) -> new BackPackMenu(id, inv, extraData));
	public static final MenuType<Backpacklvl2Menu> BACKPACKLVL_2 = register("backpacklvl_2",
			(id, inv, extraData) -> new Backpacklvl2Menu(id, inv, extraData));
	public static final MenuType<DecoupeurGUIMenu> DECOUPEUR_GUI = register("decoupeur_gui",
			(id, inv, extraData) -> new DecoupeurGUIMenu(id, inv, extraData));
	public static final MenuType<BackPacklvl3Menu> BACK_PACKLVL_3 = register("back_packlvl_3",
			(id, inv, extraData) -> new BackPacklvl3Menu(id, inv, extraData));
	public static final MenuType<Chapter1Menu> CHAPTER_1ENG = register("chapter_1eng", (id, inv, extraData) -> new Chapter1Menu(id, inv, extraData));
	public static final MenuType<Chapitre1FrancaisMenu> CHAPITRE_1_FRANCAIS = register("chapitre_1_francais",
			(id, inv, extraData) -> new Chapitre1FrancaisMenu(id, inv, extraData));
	public static final MenuType<LanguageSelctionMenu> LANGUAGE_SELCTION = register("language_selction",
			(id, inv, extraData) -> new LanguageSelctionMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
