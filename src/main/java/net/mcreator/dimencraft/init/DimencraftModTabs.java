
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimencraft.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DimencraftModTabs {
	public static CreativeModeTab TAB_DIMENMOD;

	public static void load() {
		TAB_DIMENMOD = new CreativeModeTab("tabdimenmod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DimencraftModBlocks.DIMENS_ORE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
