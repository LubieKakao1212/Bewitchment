package com.bewitchment.common.ritual;

import com.bewitchment.Bewitchment;
import com.bewitchment.Util;
import com.bewitchment.api.registry.Ritual;
import com.bewitchment.common.block.BlockGlyph;
import com.bewitchment.common.block.tile.entity.TileEntityGlyph;
import com.bewitchment.common.item.ItemTaglock;
import com.bewitchment.common.item.ItemWaystone;
import com.bewitchment.registry.ModObjects;
import com.bewitchment.registry.ModSounds;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentBase;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemStackHandler;

import java.awt.*;
import java.util.Collections;
import java.util.UUID;
import java.util.function.Consumer;

@SuppressWarnings("ConstantConditions")
public class RitualTeleport extends Ritual {
	public RitualTeleport() {
		super(new ResourceLocation(Bewitchment.MODID, "teleport"), Collections.singletonList(Util.get(ModObjects.waystone, ModObjects.taglock)), null, null, false, 5, 450, 20, BlockGlyph.ENDER, BlockGlyph.NETHER, BlockGlyph.ENDER);
	}

	@Override
	public String getPreconditionMessage() {
		return "ritual.precondition.invalid_location";
	}

	@Override
	public boolean isValid(World world, BlockPos pos, EntityPlayer caster, ItemStackHandler inventory) {
		if (world.getTileEntity(pos) instanceof TileEntityGlyph) {
			for (int i = 0; i < inventory.getSlots(); i++) {
				ItemStack stack = inventory.getStackInSlot(i);
				if (stack.getItem() instanceof ItemWaystone)
					return stack.hasTagCompound() && stack.getTagCompound().hasKey("location") && stack.getTagCompound().hasKey("dimension");
				if (stack.getItem() instanceof ItemTaglock && stack.hasTagCompound())
					for (Entity entity : world.loadedEntityList)
						if (entity.getPersistentID().equals(UUID.fromString(stack.getTagCompound().getString("boundId"))))
							return true;
			}
		}
		return false;
	}

	@Override
	public void onStarted(World world, BlockPos pos, EntityPlayer caster, ItemStackHandler inventory) {
		super.onStarted(world, pos, caster, inventory);
		if (world.getTileEntity(pos) instanceof TileEntityGlyph) {
			for (int i = 0; i < inventory.getSlots(); i++) {
				ItemStack stack = inventory.getStackInSlot(i);
				if (stack.getItem() instanceof ItemTaglock) {
					Entity entity = entityByUUID(world, UUID.fromString(stack.getTagCompound().getString("boundId")));
					if(entity != null && entity instanceof EntityPlayer) {
						/*SoundEvents.AMBIENT_CAVE*/
						Util.playSoundToPlayer((EntityPlayerMP) entity,  ModSounds.WEREWOLF_HOWL,SoundCategory.BLOCKS, 1f, 2f);
						entity.sendMessage(new TextComponentString("Herobrine joined the game").setStyle(new Style().setColor(TextFormatting.YELLOW)));
					}
				}
			}
		}
	}

	@Override
	public void onFinished(World world, BlockPos altarPos, BlockPos effectivePos, EntityPlayer caster, ItemStackHandler inventory) {
		world.playSound(null, effectivePos, SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.BLOCKS, 0.7f, 0.7f);
		if (world.getTileEntity(effectivePos) instanceof TileEntityGlyph) {
			for (int i = 0; i < inventory.getSlots(); i++) {
				ItemStack stack = inventory.getStackInSlot(i);
				if (stack.getItem() instanceof ItemWaystone) {
					BlockPos pos0 = BlockPos.fromLong(stack.getTagCompound().getLong("location"));
					int dimension = stack.getTagCompound().getInteger("dimension");
					stack.damageItem(1, caster);

					if (pos0 == null) {
						return;
					}
					if(dimension != world.provider.getDimension()) {
						forEachAffectedEntity(world, altarPos, (entity) -> entity.sendMessage(new TextComponentString("According to act 403 of interdimensional law: You cannot teleport across dimensions (and time)")
								.setStyle(new Style().setColor(TextFormatting.GOLD))));
						return;
					}

					forEachAffectedEntity(world, altarPos, (entity) ->
							{
								if(teleport(entity, pos0)) {
									//world.playSound((EntityPlayer) entity, entity.getPosition(), SoundEvents.ENTITY_ENDERMEN_TELEPORT, SoundCategory.PLAYERS, 1, 1);
									Util.playSoundToPlayer((EntityPlayerMP) entity, SoundEvents.ENTITY_ENDERMEN_TELEPORT, SoundCategory.PLAYERS, 2f, 1f);
								}
							});
				}
				if (stack.getItem() instanceof ItemTaglock) {
					Entity entity = entityByUUID(world, UUID.fromString(stack.getTagCompound().getString("boundId")));
					if(entity == null) {
						forEachAffectedEntity(world, altarPos, (entity2) ->
								entity2.sendMessage(new TextComponentString("Congratulations!! You have summoned an ")
									.appendSibling(new TextComponentString("Legendary ")
											.setStyle(new Style().setColor(TextFormatting.GOLD)))
									.appendSibling(new TextComponentString("Air")
											.setStyle(new Style().setColor(TextFormatting.GRAY)))));
					}else {
						stack.shrink(1);

						BlockPos pos0 = effectivePos;

						teleport(entity, pos0);
					}
					return;
				}
			}
		}
		//if (pos0 == null || dimension != world.provider.getDimension()) return;

		//world.playSound(null, entity.getPosition(), SoundEvents.ENTITY_ENDERMEN_TELEPORT, SoundCategory.PLAYERS, 1, 1);

		/*for (Entity entity : world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(effectivePos).grow(3))) {
			world.playSound(null, entity.getPosition(), SoundEvents.ENTITY_ENDERMEN_TELEPORT, SoundCategory.PLAYERS, 1, 1);
			if (entity instanceof EntityPlayer)
				Util.teleportPlayer((EntityPlayer) entity, pos0.getX() + 0.5, pos0.getY(), pos0.getZ() + 0.5);
			else entity.setPositionAndUpdate(pos0.getX() + 0.5, pos0.getY(), pos0.getZ() + 0.5);
			world.playSound(null, entity.getPosition(), SoundEvents.ENTITY_ENDERMEN_TELEPORT, SoundCategory.PLAYERS, 1, 1);
		}*/
	}

	private Entity entityByUUID(World world, UUID id) {
		for (Entity entity : world.loadedEntityList) {
			if (entity.getPersistentID().equals(id)) {
				return entity;
			}
		}
		return null;
	}

	private void forEachAffectedEntity(World world, BlockPos pos, Consumer<Entity> action) {
		for (Entity caster2 : world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(pos).grow(3))) {
			action.accept(caster2);
		}
	}

	private boolean teleport(Entity entity, BlockPos targetPos) {
		if (entity instanceof EntityPlayer) {
			Util.teleportPlayer((EntityPlayer) entity, targetPos.getX() + 0.5, targetPos.getY(), targetPos.getZ() + 0.5);
			return true;
		}
		else {
			entity.setPositionAndUpdate(targetPos.getX() + 0.5, targetPos.getY(), targetPos.getZ() + 0.5);
			return false;
		}
	}


}