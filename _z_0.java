//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Items
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.NonNullList
 */
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

/*
 * Renamed from _z
 */
public class _z_0
extends _ct_0 {
    public static final String[] qx;
    public static final int[] qy;

    @Override
    public void draw() {
        _h_0.drawStringWithShadow(qx[qy[7]] + this.getTotems(), this.getX() + qy[8], this.getY(), _ck_0.pz);
        super.draw();
    }

    public _z_0() {
        super(qx[qy[0]], qy[1], qy[2], _as_0.fB.getModule(qx[qy[3]]));
    }

    @Override
    public float getHeight() {
        return 11.0f;
    }

    @Override
    public int getWidth() {
        return _h_0.getStringWidth(qx[qy[12]] + this.getTotems());
    }

    public int getTotems() {
        if (this.nullCheck()) {
            return qy[4];
        }
        ItemStack itemStack = _z_0.pb.player.getItemStackFromSlot(EntityEquipmentSlot.OFFHAND);
        NonNullList nonNullList = _z_0.pb.player.inventory.mainInventory;
        int n = qy[5];
        for (int i = qy[6]; i < nonNullList.size(); ++i) {
            if (((ItemStack)nonNullList.get(i)).getItem() != Items.TOTEM_OF_UNDYING) continue;
            ++n;
        }
        if (itemStack.getItem() == Items.TOTEM_OF_UNDYING) {
            ++n;
        }
        return n;
    }

    static {
        qy = new int[]{0, 0, 185, 1, 0, 0, 0, 2, 1, 3, 1, -7340032, 4, 5, 0, 1, 2, 3, 4};
        String[] stringArray = new String[qy[13]];
        stringArray[_z_0.qy[14]] = "Totems";
        stringArray[_z_0.qy[15]] = "Totems";
        stringArray[_z_0.qy[16]] = "Totems: ";
        stringArray[_z_0.qy[17]] = "Totems: ";
        stringArray[_z_0.qy[18]] = "Totems: ";
        qx = stringArray;
    }

    @Override
    public void renderDummy(int n, int n2) {
        super.renderDummy(n, n2);
        this.qp.setHeight(this.getHeight());
        this.qp.setWidth(this.getWidth());
        _h_0.drawStringWithShadow(qx[qy[9]] + this.getTotems(), this.getX() + qy[10], this.getY(), this.qq.lM ? _ck_0.pz : qy[11]);
    }
}

