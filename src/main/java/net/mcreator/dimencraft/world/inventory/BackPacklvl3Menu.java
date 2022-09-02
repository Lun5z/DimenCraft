
package net.mcreator.dimencraft.world.inventory;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.dimencraft.procedures.RpetProcedure;
import net.mcreator.dimencraft.procedures.RandommdProcedure;
import net.mcreator.dimencraft.init.DimencraftModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class BackPacklvl3Menu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;

	public BackPacklvl3Menu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(DimencraftModMenus.BACK_PACKLVL_3, id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(46);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack;
				if (hand == 0)
					itemstack = this.entity.getMainHandItem();
				else
					itemstack = this.entity.getOffhandItem();
				itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) {
				extraData.readByte(); // drop padding
				Entity entity = world.getEntity(extraData.readVarInt());
				if (entity != null)
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				BlockEntity ent = inv.player != null ? inv.player.level.getBlockEntity(pos) : null;
				if (ent != null) {
					ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				}
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 8, 17) {
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 26, 17) {
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 44, 17) {
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 8, 35) {
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 26, 35) {
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 44, 35) {
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 8, 53) {
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 26, 53) {
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 44, 53) {
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 26, 80) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 80, 26) {
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 80, 44) {
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 80, 62) {
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 80, 80) {
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 98, 26) {
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 98, 44) {
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 98, 62) {
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 98, 80) {
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 116, 26) {
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 116, 44) {
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 116, 62) {
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 116, 80) {
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 134, 26) {
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 134, 44) {
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 134, 62) {
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 134, 80) {
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 152, 26) {
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 152, 44) {
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 152, 62) {
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 152, 80) {
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 170, 26) {
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 170, 44) {
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 170, 62) {
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 170, 80) {
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 188, 26) {
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 188, 44) {
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 188, 62) {
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 188, 80) {
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 206, 26) {
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 206, 44) {
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 206, 62) {
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 206, 80) {
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 224, 26) {
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 224, 44) {
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 224, 62) {
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 224, 80) {
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 37 + 8 + sj * 18, 21 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 37 + 8 + si * 18, 21 + 142));

		RandommdProcedure.execute(world, x, y, z);
	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 46) {
				if (!this.moveItemStackTo(itemstack1, 46, this.slots.size(), true)) {
					return ItemStack.EMPTY;
				}
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 46, false)) {
				if (index < 46 + 27) {
					if (!this.moveItemStackTo(itemstack1, 46 + 27, this.slots.size(), true)) {
						return ItemStack.EMPTY;
					}
				} else {
					if (!this.moveItemStackTo(itemstack1, 46, 46 + 27, false)) {
						return ItemStack.EMPTY;
					}
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0) {
				slot.set(ItemStack.EMPTY);
			} else {
				slot.setChanged();
			}
			if (itemstack1.getCount() == itemstack.getCount()) {
				return ItemStack.EMPTY;
			}
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty()) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
					if (j <= maxSize) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < maxSize) {
						p_38904_.shrink(maxSize - itemstack.getCount());
						itemstack.setCount(maxSize);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (true) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					if (p_38904_.getCount() > slot1.getMaxStackSize()) {
						slot1.set(p_38904_.split(slot1.getMaxStackSize()));
					} else {
						slot1.set(p_38904_.split(p_38904_.getCount()));
					}
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);

		RpetProcedure.execute(entity);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					if (j == 0)
						continue;
					if (j == 1)
						continue;
					if (j == 2)
						continue;
					if (j == 3)
						continue;
					if (j == 4)
						continue;
					if (j == 5)
						continue;
					if (j == 6)
						continue;
					if (j == 7)
						continue;
					if (j == 8)
						continue;
					if (j == 10)
						continue;
					if (j == 11)
						continue;
					if (j == 12)
						continue;
					if (j == 13)
						continue;
					if (j == 14)
						continue;
					if (j == 15)
						continue;
					if (j == 16)
						continue;
					if (j == 17)
						continue;
					if (j == 18)
						continue;
					if (j == 19)
						continue;
					if (j == 20)
						continue;
					if (j == 21)
						continue;
					if (j == 22)
						continue;
					if (j == 23)
						continue;
					if (j == 24)
						continue;
					if (j == 25)
						continue;
					if (j == 26)
						continue;
					if (j == 27)
						continue;
					if (j == 28)
						continue;
					if (j == 29)
						continue;
					if (j == 30)
						continue;
					if (j == 31)
						continue;
					if (j == 32)
						continue;
					if (j == 33)
						continue;
					if (j == 34)
						continue;
					if (j == 35)
						continue;
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					if (i == 0)
						continue;
					if (i == 1)
						continue;
					if (i == 2)
						continue;
					if (i == 3)
						continue;
					if (i == 4)
						continue;
					if (i == 5)
						continue;
					if (i == 6)
						continue;
					if (i == 7)
						continue;
					if (i == 8)
						continue;
					if (i == 10)
						continue;
					if (i == 11)
						continue;
					if (i == 12)
						continue;
					if (i == 13)
						continue;
					if (i == 14)
						continue;
					if (i == 15)
						continue;
					if (i == 16)
						continue;
					if (i == 17)
						continue;
					if (i == 18)
						continue;
					if (i == 19)
						continue;
					if (i == 20)
						continue;
					if (i == 21)
						continue;
					if (i == 22)
						continue;
					if (i == 23)
						continue;
					if (i == 24)
						continue;
					if (i == 25)
						continue;
					if (i == 26)
						continue;
					if (i == 27)
						continue;
					if (i == 28)
						continue;
					if (i == 29)
						continue;
					if (i == 30)
						continue;
					if (i == 31)
						continue;
					if (i == 32)
						continue;
					if (i == 33)
						continue;
					if (i == 34)
						continue;
					if (i == 35)
						continue;
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}
