//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.text.TextFormatting
 */
import net.minecraft.util.text.TextFormatting;

public class _bQ
extends _ct_0 {
    public static final int[] qy = new int[]{0, 0, 30, 1, 2, 3, 4, 1, 5, 6, 7, 1, -7340032, 8, 9, 10, 0, 11, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static final String[] qx;

    @Override
    public void renderDummy(int n, int n2) {
        super.renderDummy(n, n2);
        this.qp.setHeight(this.getHeight());
        this.qp.setWidth(this.getWidth());
        _h_0.drawStringWithShadow(qx[qy[8]] + TextFormatting.WHITE + _bQ.pb.player.getPosition().x + qx[qy[9]] + _bQ.pb.player.getPosition().y + qx[qy[10]] + _bQ.pb.player.getPosition().z, this.getX() + qy[11], this.getY(), this.qq.lM ? _ck_0.pz : qy[12]);
    }

    @Override
    public float getHeight() {
        return 11.0f;
    }

    @Override
    public int getWidth() {
        try {
            return _h_0.getStringWidth(qx[qy[13]] + TextFormatting.WHITE + _bQ.pb.player.getPosition().x + qx[qy[14]] + _bQ.pb.player.getPosition().y + qx[qy[15]] + _bQ.pb.player.getPosition().z);
        }
        catch (NullPointerException nullPointerException) {
            return qy[16];
        }
    }

    @Override
    public void draw() {
        _h_0.drawStringWithShadow(qx[qy[4]] + TextFormatting.WHITE + _bQ.pb.player.getPosition().x + qx[qy[5]] + _bQ.pb.player.getPosition().y + qx[qy[6]] + _bQ.pb.player.getPosition().z, this.getX() + qy[7], this.getY(), _ck_0.pz);
        super.draw();
    }

    static {
        String[] stringArray = new String[qy[17]];
        stringArray[_bQ.qy[18]] = "Coordinates";
        stringArray[_bQ.qy[19]] = "Coordinates";
        stringArray[_bQ.qy[20]] = "XYZ ";
        stringArray[_bQ.qy[21]] = " ";
        stringArray[_bQ.qy[22]] = " ";
        stringArray[_bQ.qy[23]] = "XYZ ";
        stringArray[_bQ.qy[24]] = " ";
        stringArray[_bQ.qy[25]] = " ";
        stringArray[_bQ.qy[26]] = "XYZ ";
        stringArray[_bQ.qy[27]] = " ";
        stringArray[_bQ.qy[28]] = " ";
        qx = stringArray;
    }

    public _bQ() {
        super(qx[qy[0]], qy[1], qy[2], _as_0.fB.getModule(qx[qy[3]]));
    }
}

