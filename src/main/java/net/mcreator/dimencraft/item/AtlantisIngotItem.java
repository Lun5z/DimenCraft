
package net.mcreator.dimencraft.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.dimencraft.init.DimencraftModTabs;

public class AtlantisIngotItem extends Item {
	public AtlantisIngotItem() {
		super(new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
