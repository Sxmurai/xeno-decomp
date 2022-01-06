//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.inventory.ClickType
 *  net.minecraft.inventory.ContainerPlayer
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.NonNullList
 */
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.ContainerPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class _bT
extends _bA {
    public _cd_0 nM;
    public int nS;
    public static final String[] nT;
    public _cJ nR;
    public _k_0 nP;
    public _k_0 nN;
    public static final int[] pd;
    public _cd_0 nO;
    public _cJ nQ;

    @Override
    public String getHUDData() {
        return nT[pd[66]] + this.nM.getMode();
    }

    @Override
    public void onUpdate() {
        if (this.nullCheck()) {
            return;
        }
        this.nS += pd[33];
        float f = _bv_0.getHealth((Entity)this.pb.player);
        if (f <= this.nQ.getFloatValue()) {
            this.swapItems(this.getItemSlot(Items.TOTEM_OF_UNDYING));
            return;
        }
        this.doOffhand();
    }

    static {
        pd = new int[]{0, 1, 0, 2, 3, 0, 3, 1, 4, 2, 5, 6, 1, 7, 3, 0, 8, 1, 9, 2, 10, 11, 1, 12, 13, 0, 6, 0, 1, 2, 3, 4, 5, 1, 14, 0, 0, 0, 9, 36, 0, 0, 45, 0, 0, 9, 36, 0, 0, 15, 16, 17, -1, 0, 0, 0, 0, 45, 0, 0, 0, -1, 36, 9, -1, -1, 18, 19, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        String[] stringArray = new String[pd[67]];
        stringArray[_bT.pd[68]] = "Offhand";
        stringArray[_bT.pd[69]] = "moves stuff to ur offhand";
        stringArray[_bT.pd[70]] = "Mode";
        stringArray[_bT.pd[71]] = "Totem";
        stringArray[_bT.pd[72]] = "Gapple";
        stringArray[_bT.pd[73]] = "Crystal";
        stringArray[_bT.pd[74]] = "Fallback";
        stringArray[_bT.pd[75]] = "Fallback";
        stringArray[_bT.pd[76]] = "Totem";
        stringArray[_bT.pd[77]] = "Gapple";
        stringArray[_bT.pd[78]] = "Crystal";
        stringArray[_bT.pd[79]] = "TotemSwap";
        stringArray[_bT.pd[80]] = "TotemHealth";
        stringArray[_bT.pd[81]] = "Cooldown";
        stringArray[_bT.pd[82]] = "Gapple";
        stringArray[_bT.pd[83]] = "Totem";
        stringArray[_bT.pd[84]] = "Gapple";
        stringArray[_bT.pd[85]] = "Crystal";
        stringArray[_bT.pd[86]] = " ";
        nT = stringArray;
    }

    public void swapItems(int n) {
        if (n == pd[52] || (double)this.nS <= this.nR.getDoubleValue() && this.pb.player.inventory.getStackInSlot(n).getItem() != this.getItem(this.nM.getMode())) {
            return;
        }
        this.nS = pd[53];
        this.pb.playerController.windowClick(pd[54], n, pd[55], ClickType.PICKUP, (EntityPlayer)this.pb.player);
        this.pb.playerController.windowClick(pd[56], pd[57], pd[58], ClickType.PICKUP, (EntityPlayer)this.pb.player);
        this.pb.playerController.windowClick(pd[59], n, pd[60], ClickType.PICKUP, (EntityPlayer)this.pb.player);
        this.pb.playerController.updateController();
    }

    public int getItemSlot(Item item) {
        if (item == this.pb.player.getHeldItemOffhand().getItem()) {
            return pd[61];
        }
        for (int i = pd[62]; i >= 0; --i) {
            Item item2 = this.pb.player.inventory.getStackInSlot(i).getItem();
            if (item2 != item) continue;
            if (i < pd[63]) {
                if (item == Items.GOLDEN_APPLE) {
                    return pd[64];
                }
                i += 36;
            }
            return i;
        }
        return pd[65];
    }

    public void doOffhand() {
        int n = this.nN.isEnabled();
        if (_cu_0.hasItem(this.getItem(this.nM.getMode()))) {
            if (!this.nM.is(nT[pd[34]])) {
                this.swapItems(this.getItemSlot(this.getItem(this.nM.getMode())));
            } else {
                EntityPlayerSP entityPlayerSP = this.pb.player;
                ItemStack itemStack = entityPlayerSP.getItemStackFromSlot(EntityEquipmentSlot.OFFHAND);
                int n2 = pd[35];
                NonNullList nonNullList = entityPlayerSP.inventory.mainInventory;
                if (itemStack == null || itemStack.getItem() != Items.GOLDEN_APPLE) {
                    for (n2 = pd[36]; n2 < nonNullList.size(); ++n2) {
                        if (nonNullList.get(n2) == ItemStack.EMPTY || ((ItemStack)nonNullList.get(n2)).getItem() != Items.GOLDEN_APPLE) continue;
                        if (!(this.pb.player.openContainer instanceof ContainerPlayer)) break;
                        this.pb.playerController.windowClick(pd[37], n2 < pd[38] ? n2 + pd[39] : n2, pd[40], ClickType.PICKUP, (EntityPlayer)this.pb.player);
                        this.pb.playerController.windowClick(pd[41], pd[42], pd[43], ClickType.PICKUP, (EntityPlayer)this.pb.player);
                        this.pb.playerController.windowClick(pd[44], n2 < pd[45] ? n2 + pd[46] : n2, pd[47], ClickType.PICKUP, (EntityPlayer)this.pb.player);
                        break;
                    }
                }
            }
            n = pd[48];
            return;
        }
        if (n != 0 && !_cu_0.hasItem(this.getItem(this.nM.getMode())) && this.pb.player.getHeldItemOffhand().getItem() != this.getItem(this.nM.getMode())) {
            this.swapItems(this.getItemSlot(this.getItem(this.nO.getMode())));
        }
    }

    public Item getItem(String string) {
        if (string.equalsIgnoreCase(nT[pd[49]])) {
            return Items.TOTEM_OF_UNDYING;
        }
        if (string.equalsIgnoreCase(nT[pd[50]])) {
            return Items.GOLDEN_APPLE;
        }
        if (string.equalsIgnoreCase(nT[pd[51]])) {
            return Items.END_CRYSTAL;
        }
        return Items.TOTEM_OF_UNDYING;
    }

    public _bT() {
        super(nT[pd[0]], nT[pd[1]], pd[2], _aL.hx);
        String[] stringArray = new String[pd[4]];
        stringArray[_bT.pd[5]] = nT[pd[6]];
        stringArray[_bT.pd[7]] = nT[pd[8]];
        stringArray[_bT.pd[9]] = nT[pd[10]];
        this.nM = new _cd_0(nT[pd[3]], stringArray);
        this.nN = new _k_0(nT[pd[11]], pd[12]);
        String[] stringArray2 = new String[pd[14]];
        stringArray2[_bT.pd[15]] = nT[pd[16]];
        stringArray2[_bT.pd[17]] = nT[pd[18]];
        stringArray2[_bT.pd[19]] = nT[pd[20]];
        this.nO = new _cd_0(nT[pd[13]], stringArray2);
        this.nP = new _k_0(nT[pd[21]], pd[22]);
        this.nQ = new _cJ(nT[pd[23]], 16.0, 0.0, 36.0, 1.0);
        this.nR = new _cJ(nT[pd[24]], 0.0, 0.0, 40.0, 1.0);
        this.nS = pd[25];
        _bd_0[] _bd_0Array = new _bd_0[pd[26]];
        _bd_0Array[_bT.pd[27]] = this.nM;
        _bd_0Array[_bT.pd[28]] = this.nP;
        _bd_0Array[_bT.pd[29]] = this.nQ;
        _bd_0Array[_bT.pd[30]] = this.nR;
        _bd_0Array[_bT.pd[31]] = this.nN;
        _bd_0Array[_bT.pd[32]] = this.nO;
        this.addSettings(_bd_0Array);
    }
}

