//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.BlockPos
 */
import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

public class _cP
implements _cf_0 {
    public static final int[] sB = new int[]{1, 1, 0, 1, 64, 1, 0, 1, 1, 1, 0};

    public static boolean getGearPlay(EntityPlayer entityPlayer, double d) {
        return (_cu_0.getItemCount(entityPlayer, (Item)Items.DIAMOND_HELMET) < sB[3] && (double)(_cu_0.getItemCount(entityPlayer, Items.EXPERIENCE_BOTTLE) / sB[4]) < d ? sB[5] : sB[6]) != 0;
    }

    public static boolean attackCheck(Entity entity, boolean bl, boolean bl2, boolean bl3) {
        if (bl && entity instanceof EntityPlayer && ((EntityPlayer)entity).getHealth() > 0.0f) {
            return sB[7];
        }
        if (bl2 && (_bv_0.isPassive(entity) || _bv_0.isNeutralMob(entity))) {
            return sB[8];
        }
        return (bl3 && _bv_0.isHostileMob(entity) ? sB[9] : sB[10]) != 0;
    }

    public static List<BlockPos> getCityBlocks(EntityPlayer entityPlayer, boolean bl) {
        BlockPos blockPos = new BlockPos(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ);
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        if (_cE.getBlockResistance(blockPos.north()) == _aG.he) {
            if (bl) {
                arrayList.add(blockPos.north());
            } else if (_cE.getBlockResistance(blockPos.north().north()) == _aG.hc) {
                arrayList.add(blockPos.north());
            }
        }
        if (_cE.getBlockResistance(blockPos.east()) == _aG.he) {
            if (bl) {
                arrayList.add(blockPos.east());
            } else if (_cE.getBlockResistance(blockPos.east().east()) == _aG.hc) {
                arrayList.add(blockPos.east());
            }
        }
        if (_cE.getBlockResistance(blockPos.south()) == _aG.he) {
            if (bl) {
                arrayList.add(blockPos.south());
            } else if (_cE.getBlockResistance(blockPos.south().south()) == _aG.hc) {
                arrayList.add(blockPos.south());
            }
        }
        if (_cE.getBlockResistance(blockPos.west()) == _aG.he) {
            if (bl) {
                arrayList.add(blockPos.west());
            } else if (_cE.getBlockResistance(blockPos.west().west()) == _aG.hc) {
                arrayList.add(blockPos.west());
            }
        }
        return arrayList;
    }

    public static float getArmor(EntityPlayer entityPlayer) {
        float f = 0.0f;
        for (ItemStack itemStack : entityPlayer.getArmorInventoryList()) {
            if (itemStack == null || itemStack.getItem() == Items.AIR) continue;
            f += (float)(itemStack.getMaxDamage() - itemStack.getItemDamage()) / (float)itemStack.getMaxDamage() * 100.0f;
        }
        return f;
    }

    public static float getHealth(EntityPlayer entityPlayer) {
        return entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount();
    }

    public static boolean getArmor(EntityPlayer entityPlayer, boolean bl, double d) {
        for (ItemStack itemStack : entityPlayer.getArmorInventoryList()) {
            if (itemStack == null || itemStack.getItem() == Items.AIR) {
                return sB[0];
            }
            if (!bl || !(d >= (double)((float)(itemStack.getMaxDamage() - itemStack.getItemDamage()) / (float)itemStack.getMaxDamage() * 100.0f))) continue;
            return sB[1];
        }
        return sB[2];
    }
}

