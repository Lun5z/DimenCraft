
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimencraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.dimencraft.block.entity.DecoupeurBlockEntity;
import net.mcreator.dimencraft.block.entity.BackPackBlocklvl3BlockEntity;
import net.mcreator.dimencraft.DimencraftMod;

public class DimencraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, DimencraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DECOUPEUR = register("decoupeur", DimencraftModBlocks.DECOUPEUR,
			DecoupeurBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BACK_PACK_BLOCKLVL_3 = register("back_pack_blocklvl_3",
			DimencraftModBlocks.BACK_PACK_BLOCKLVL_3, BackPackBlocklvl3BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
