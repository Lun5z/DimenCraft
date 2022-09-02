
package net.mcreator.dimencraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.dimencraft.procedures.TheAdventureFrRightclickedProcedure;
import net.mcreator.dimencraft.init.DimencraftModTabs;

import java.util.List;

public class TheAdventureItem extends Item {
	public TheAdventureItem() {
		super(new Item.Properties().tab(DimencraftModTabs.TAB_DIMENMOD).stacksTo(1).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Chapter 1"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TheAdventureFrRightclickedProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
