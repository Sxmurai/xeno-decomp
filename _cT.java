//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemExpBottle
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.util.EnumHand
 */
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.ItemExpBottle;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;

public class _cT
extends _bA {
    @EventHandler
    public Listener<_bR> sO;
    public _k_0 sL;
    public _k_0 sK = new _k_0(sP[sQ[2]], sQ[3]);
    public _cd_0 sN;
    public _k_0 sM;
    public static final String[] sP;
    public static final int[] sQ;

    public _cT() {
        super(sP[sQ[0]], sP[sQ[1]], _aL.hx);
        this.sL = new _k_0(sP[sQ[4]], sQ[5]);
        this.sM = new _k_0(sP[sQ[6]], sQ[7]);
        String[] stringArray = new String[sQ[9]];
        stringArray[_cT.sQ[10]] = sP[sQ[11]];
        stringArray[_cT.sQ[12]] = sP[sQ[13]];
        this.sN = new _cd_0(sP[sQ[8]], stringArray);
        this.sO = new Listener<_bR>(_bR2 -> {
            if (_bR2.getPacket() instanceof CPacketPlayerTryUseItem && this.pb.player.getHeldItemMainhand().getItem() instanceof ItemExpBottle) {
                this.pb.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(this.pb.player.rotationYaw, 90.0f, this.pb.player.onGround));
            }
        }, new Predicate[sQ[14]]);
        _bd_0[] _bd_0Array = new _bd_0[sQ[15]];
        _bd_0Array[_cT.sQ[16]] = this.sK;
        _bd_0Array[_cT.sQ[17]] = this.sL;
        _bd_0Array[_cT.sQ[18]] = this.sM;
        _bd_0Array[_cT.sQ[19]] = this.sN;
        this.addSettings(_bd_0Array);
    }

    @Override
    public void onUpdate() {
        if (this.nullCheck()) {
            return;
        }
        if (this.sK.isEnabled()) {
            int n = sQ[20];
            for (ItemStack itemStack : this.pb.player.inventory.armorInventory) {
                int n2;
                int n3 = sQ[21];
                NBTTagList nBTTagList = itemStack.getEnchantmentTagList();
                for (n2 = sQ[22]; n2 < nBTTagList.tagCount(); ++n2) {
                    short s = nBTTagList.getCompoundTagAt(n2).getShort(sP[sQ[23]]);
                    Enchantment enchantment = Enchantment.getEnchantmentByID((int)s);
                    if (enchantment == null || !enchantment.getName().equalsIgnoreCase(sP[sQ[24]])) continue;
                    n3 = sQ[25];
                }
                n2 = sQ[26];
                if (this.sN.is(sP[sQ[27]])) {
                    n2 = sQ[28];
                }
                if (itemStack == null || n3 == 0 || !((float)itemStack.getMaxDamage() - (float)itemStack.getItemDamage() <= (float)(itemStack.getMaxDamage() / n2))) continue;
                n = sQ[29];
            }
            if (n != 0) {
                if (this.sL.isEnabled()) {
                    _cu_0.switchToSlot(Items.EXPERIENCE_BOTTLE);
                }
                int n4 = sQ[30];
                if (this.sL.isEnabled() && this.sM.isEnabled()) {
                    n4 = this.pb.player.inventory.currentItem;
                }
                if (_cu_0.isHolding(Items.EXPERIENCE_BOTTLE)) {
                    ItemStack itemStack;
                    itemStack = EnumHand.MAIN_HAND;
                    if (this.pb.player.getHeldItemOffhand().getItem() == Items.EXPERIENCE_BOTTLE) {
                        itemStack = EnumHand.OFF_HAND;
                    }
                    this.pb.rightClickMouse();
                }
                if (this.sL.isEnabled() && this.sM.isEnabled()) {
                    this.pb.player.inventory.currentItem = n4;
                }
            }
        }
    }

    static {
        sQ = new int[]{0, 1, 2, 1, 3, 0, 4, 1, 5, 2, 0, 6, 1, 7, 0, 4, 0, 1, 2, 3, 0, 0, 0, 8, 9, 1, 2, 10, 4, 1, -1, 11, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] stringArray = new String[sQ[31]];
        stringArray[_cT.sQ[32]] = "AutoXP";
        stringArray[_cT.sQ[33]] = "repairs armour automatically (works well with fastxp)";
        stringArray[_cT.sQ[34]] = "AutoRepair";
        stringArray[_cT.sQ[35]] = "Switch";
        stringArray[_cT.sQ[36]] = "Switch Back";
        stringArray[_cT.sQ[37]] = "Mode";
        stringArray[_cT.sQ[38]] = "Half";
        stringArray[_cT.sQ[39]] = "Quarter";
        stringArray[_cT.sQ[40]] = "id";
        stringArray[_cT.sQ[41]] = "enchantment.mending";
        stringArray[_cT.sQ[42]] = "Quarter";
        sP = stringArray;
    }
}

