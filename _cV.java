//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 */
import java.awt.Color;
import net.minecraft.client.renderer.GlStateManager;

public class _cV
extends Color {
    public static final int[] sU = new int[]{0, 1, 2};

    public _cV(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    public float getHue() {
        return _cV.RGBtoHSB(this.getRed(), this.getGreen(), this.getBlue(), null)[sU[0]];
    }

    public static _cV fromHSB(float f, float f2, float f3) {
        return new _cV(Color.getHSBColor(f, f2, f3));
    }

    public float getSaturation() {
        return _cV.RGBtoHSB(this.getRed(), this.getGreen(), this.getBlue(), null)[sU[1]];
    }

    public _cV(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    public _cV(int n, boolean bl) {
        super(n, bl);
    }

    public float getBrightness() {
        return _cV.RGBtoHSB(this.getRed(), this.getGreen(), this.getBlue(), null)[sU[2]];
    }

    public _cV(_cV _cV2, int n) {
        super(_cV2.getRed(), _cV2.getGreen(), _cV2.getBlue(), n);
    }

    public _cV(Color color) {
        super(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    public void glColor() {
        GlStateManager.color((float)((float)this.getRed() / 255.0f), (float)((float)this.getGreen() / 255.0f), (float)((float)this.getBlue() / 255.0f), (float)((float)this.getAlpha() / 255.0f));
    }

    public _cV(int n) {
        super(n);
    }
}

