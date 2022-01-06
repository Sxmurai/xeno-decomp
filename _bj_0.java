//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _bj
 */
public class _bj_0
extends _bk_0 {
    public double jQ;
    public static final int[] jU = new int[]{-1, 0x70000000, -1879048192, -1};
    public _bA jP;
    public double jR;

    @Override
    public void mouseClicked(int n, int n2, int n3) {
        if (_cp_0.mouseOver(this.jQ, this.jR, this.jQ + 140.0, this.jR + 26.0, n, n2) && n3 == 0) {
            this.jP.toggle();
        }
        super.mouseClicked(n, n2, n3);
    }

    public _bj_0(_bA _bA2, double d, double d2) {
        this.jP = _bA2;
        this.jQ = d;
        this.jR = d2;
    }

    @Override
    public void render(int n, int n2) {
        boolean bl = _cp_0.mouseOver(this.jQ, this.jR, this.jQ + 140.0, this.jR + 26.0, n, n2);
        _cp_0.drawBorderedRect(this.jQ, this.jR, 140.0, 26.0, 1.0, jU[0], bl ? jU[1] : jU[2]);
        GL11.glPushMatrix();
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        this.jT.fontRenderer.drawStringWithShadow(this.jP.lH, (float)(this.jQ + 4.0) / 2.0f, (float)(this.jR + 5.0) / 2.0f, this.jP.isEnabled() ? _ck_0.pz : jU[3]);
        GL11.glPopMatrix();
    }
}

