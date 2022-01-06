//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Enchantments
 *  net.minecraft.inventory.ClickType
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 */
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;

/*
 * Renamed from _cu
 */
public class _cu_0 {
    public static final String[] qB;
    public static final Minecraft qA;
    public static final EntityPlayerSP qz;
    public static final int[] qC;

    public static int getAnyBlockInHotbar() {
        for (int i = qC[25]; i < qC[26]; ++i) {
            Item item = _cu_0.qA.player.inventory.getStackInSlot(i).getItem();
            if (!(item instanceof ItemBlock)) continue;
            return i;
        }
        return qC[27];
    }

    static {
        qC = new int[]{1, 0, -1, -1, -1, -1, -1, 0, 9, 36, 0, 0, 45, 0, 0, 45, -1, 0, 9, 36, 0, 9, 0, 45, -1, 0, 9, -1, 0, 0, 1, 2, 3, 1000, 1, 0, 1, 0, 0, 36, 1, 0, 0, 36, 0, 1, -1, 0, 9, -1, 0, 9, -1, -1, -1, 0, 9, -1, 0, 9, -1, 1, 0, 1, 0, 4, 0, 1, 2, 3};
        String[] stringArray = new String[qC[65]];
        stringArray[_cu_0.qC[66]] = "id";
        stringArray[_cu_0.qC[67]] = "id";
        stringArray[_cu_0.qC[68]] = "id";
        stringArray[_cu_0.qC[69]] = "lvl";
        qB = stringArray;
        qz = Minecraft.getMinecraft().player;
        qA = Minecraft.getMinecraft();
    }

    public static int getBlockInHotbar(Block block) {
        for (int i = qC[55]; i < qC[56]; ++i) {
            Item item = _cu_0.qA.player.inventory.getStackInSlot(i).getItem();
            if (!(item instanceof ItemBlock) || !((ItemBlock)item).getBlock().equals(block)) continue;
            return i;
        }
        return qC[57];
    }

    public static void switchToSlotGhost(Block block) {
        if (_cu_0.getBlockInHotbar(block) != qC[3] && _cu_0.qA.player.inventory.currentItem != _cu_0.getBlockInHotbar(block)) {
            _cu_0.qA.player.connection.sendPacket((Packet)new CPacketHeldItemChange(_cu_0.getBlockInHotbar(block)));
        }
    }

    public static int getBestHotbarSword() {
        float f = -1.0f;
        int n = qC[46];
        for (int i = qC[47]; i < qC[48]; ++i) {
            ItemSword itemSword;
            float f2;
            ItemStack itemStack = _cu_0.qz.inventory.getStackInSlot(i);
            if (itemStack == null || !(itemStack.getItem() instanceof ItemSword) || !((f2 = (itemSword = (ItemSword)itemStack.getItem()).getAttackDamage() + (float)EnchantmentHelper.getEnchantmentLevel((Enchantment)Enchantments.SHARPNESS, (ItemStack)itemStack) * 1.25f) > f)) continue;
            f = f2;
            n = i;
        }
        return n;
    }

    public static int getInventoryItemSlot(Item item, boolean bl) {
        int n;
        int n2 = n = bl ? qC[21] : qC[22];
        while (n < qC[23]) {
            if (_cu_0.qA.player.inventory.getStackInSlot(n).getItem() == item) {
                return n;
            }
            ++n;
        }
        return qC[24];
    }

    public static void switchToSlotGhost(int n) {
        if (n != qC[2] && _cu_0.qA.player.inventory.currentItem != n) {
            _cu_0.qA.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
        }
    }

    public static int getBestArmour() {
        float f = -1.0f;
        int n = qC[49];
        for (int i = qC[50]; i < qC[51]; ++i) {
            ItemStack itemStack = _cu_0.qz.inventory.getStackInSlot(i);
            if (itemStack == null || !(itemStack.getItem() instanceof ItemSword)) continue;
            ItemArmor itemArmor = (ItemArmor)itemStack.getItem();
            float f2 = itemArmor.toughness + (float)EnchantmentHelper.getEnchantmentLevel((Enchantment)Enchantments.SHARPNESS, (ItemStack)itemStack) * 1.25f;
            if (!(f2 > f)) continue;
            f = f2;
            n = i;
        }
        return n;
    }

    public static boolean getHeldItem(Item item) {
        return (_cu_0.qA.player.getHeldItemMainhand().getItem().equals(item) || _cu_0.qA.player.getHeldItemOffhand().getItem().equals(item) ? qC[0] : qC[1]) != 0;
    }

    public static void moveItemToOffhand(int n) {
        int n2 = qC[5];
        if (n == qC[6]) {
            return;
        }
        _cu_0.qA.playerController.windowClick(qC[7], n < qC[8] ? n + qC[9] : n, qC[10], ClickType.PICKUP, (EntityPlayer)_cu_0.qA.player);
        _cu_0.qA.playerController.windowClick(qC[11], qC[12], qC[13], ClickType.PICKUP, (EntityPlayer)_cu_0.qA.player);
        for (int i = qC[14]; i < qC[15]; ++i) {
            if (!_cu_0.qA.player.inventory.getStackInSlot(i).isEmpty()) continue;
            n2 = i;
            break;
        }
        if (n2 != qC[16]) {
            _cu_0.qA.playerController.windowClick(qC[17], n2 < qC[18] ? n2 + qC[19] : n2, qC[20], ClickType.PICKUP, (EntityPlayer)_cu_0.qA.player);
        }
    }

    public static void switchToSlot(Block block) {
        if (_cu_0.getBlockInHotbar(block) != qC[53] && _cu_0.qA.player.inventory.currentItem != _cu_0.getBlockInHotbar(block)) {
            _cu_0.qA.player.inventory.currentItem = _cu_0.getBlockInHotbar(block);
        }
    }

    public static int getItemCount(Item item) {
        return _cu_0.qA.player.inventory.mainInventory.stream().filter(itemStack -> itemStack.getItem() == item ? qC[63] : qC[64]).mapToInt(ItemStack::getCount).sum();
    }

    public static void switchToSlot(int n) {
        if (n != qC[52] && _cu_0.qA.player.inventory.currentItem != n) {
            _cu_0.qA.player.inventory.currentItem = n;
        }
    }

    public static boolean isInventoryFull() {
        for (int i = qC[42]; i < qC[43]; ++i) {
            if (!_cu_0.qA.player.inventory.getStackInSlot(i).isEmpty()) continue;
            return qC[44];
        }
        return qC[45];
    }

    public static boolean isHolding(Item item) {
        return (_cu_0.qA.player.getHeldItemMainhand().getItem().equals(item) || _cu_0.qA.player.getHeldItemOffhand().getItem().equals(item) ? qC[36] : qC[37]) != 0;
    }

    public static int getHotbarItemSlot(Item item) {
        for (int i = qC[58]; i < qC[59]; ++i) {
            if (_cu_0.qA.player.inventory.getStackInSlot(i).getItem() != item) continue;
            return i;
        }
        return qC[60];
    }

    public static boolean hasItem(Item item) {
        for (int i = qC[38]; i < qC[39]; ++i) {
            Item item2 = _cu_0.qA.player.inventory.getStackInSlot(i).getItem();
            if (item2 != item) continue;
            return qC[40];
        }
        return qC[41];
    }

    public static void switchToSlotGhost(Item item) {
        if (_cu_0.getHotbarItemSlot(item) != qC[4] && _cu_0.qA.player.inventory.currentItem != _cu_0.getHotbarItemSlot(item)) {
            _cu_0.switchToSlotGhost(_cu_0.getHotbarItemSlot(item));
        }
    }

    public static boolean Is32k(ItemStack itemStack) {
        itemStack.getEnchantmentTagList();
        for (int i = qC[28]; i < itemStack.getEnchantmentTagList().tagCount(); ++i) {
            itemStack.getEnchantmentTagList().getCompoundTagAt(i);
            if (Enchantment.getEnchantmentByID((int)itemStack.getEnchantmentTagList().getCompoundTagAt(i).getByte(qB[qC[29]])) == null || Enchantment.getEnchantmentByID((int)itemStack.getEnchantmentTagList().getCompoundTagAt(i).getShort(qB[qC[30]])) == null || Enchantment.getEnchantmentByID((int)itemStack.getEnchantmentTagList().getCompoundTagAt(i).getShort(qB[qC[31]])).isCurse() || itemStack.getEnchantmentTagList().getCompoundTagAt(i).getShort(qB[qC[32]]) < qC[33]) continue;
            return qC[34];
        }
        return qC[35];
    }

    public static int getItemCount(EntityPlayer entityPlayer, Item item) {
        return entityPlayer.inventory.mainInventory.stream().filter(itemStack -> itemStack.getItem() == item ? qC[61] : qC[62]).mapToInt(ItemStack::getCount).sum();
    }

    public static void switchToSlot(Item item) {
        if (_cu_0.getHotbarItemSlot(item) != qC[54] && _cu_0.qA.player.inventory.currentItem != _cu_0.getHotbarItemSlot(item)) {
            _cu_0.qA.player.inventory.currentItem = _cu_0.getHotbarItemSlot(item);
        }
    }
}

