package com.bewitchment.common.ritual;

import com.bewitchment.Bewitchment;
import com.bewitchment.Util;
import com.bewitchment.api.registry.Ritual;
import com.bewitchment.common.block.BlockGlyph;
import com.bewitchment.common.block.tile.entity.TileEntityGlyph;
import com.bewitchment.common.item.ItemTaglock;
import com.bewitchment.common.item.ItemWaystone;
import com.bewitchment.registry.ModObjects;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.server.command.CommandDimensions;

import java.awt.*;
import java.util.Arrays;
import java.util.UUID;

public class RitualLocator extends Ritual {

    public RitualLocator() {
        super(new ResourceLocation(Bewitchment.MODID, "locator"), Arrays.asList(Util.get("blockEnderium"), Util.get(ModObjects.waystone), Util.get(ModObjects.taglock)), null, null, false, 5, 1000, 20, BlockGlyph.NORMAL, BlockGlyph.NETHER, BlockGlyph.ENDER);
        setSecret();
    }

    @Override
    public boolean isValid(World world, BlockPos altarPos, EntityPlayer caster, ItemStackHandler inventory) {
        if (world.getTileEntity(altarPos) instanceof TileEntityGlyph) {
            for (int i = 0; i < inventory.getSlots(); i++) {
                ItemStack stack = inventory.getStackInSlot(i);
                if (stack.getItem() instanceof ItemTaglock && stack.hasTagCompound())
                    if (entityByUUID(world, UUID.fromString(stack.getTagCompound().getString("boundId"))) != null)
                        return true;
            }
        }
        return false;
    }

    @Override
    public void onFinished(World world, BlockPos altarPos, BlockPos effectivePos, EntityPlayer caster, ItemStackHandler inventory) {
        for (int i = 0; i < inventory.getSlots(); i++) {
            ItemStack stack = inventory.getStackInSlot(i);
            if (stack.getItem() instanceof ItemTaglock && stack.hasTagCompound()) {
                Entity target = entityByUUID(world, UUID.fromString(stack.getTagCompound().getString("boundId")));
                if (target != null) {
                    String key = "dimension." + DimensionManager.getProviderType(target.dimension).getName();
                    ITextComponent message = new TextComponentString("Target is in: ").appendSibling(new TextComponentTranslation(key));

                    for (Entity entity : world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(effectivePos).grow(3))) {
                        entity.sendMessage(message);
                        if (entity instanceof EntityPlayer)
                            world.playSound(null, entity.getPosition(), SoundEvents.BLOCK_PORTAL_TRAVEL, SoundCategory.PLAYERS, 1, 1);
                    }
                }
            }
        }
    }

    private Entity entityByUUID(World world, UUID id) {
        return world.getMinecraftServer().getEntityFromUuid(id);
    }
}
