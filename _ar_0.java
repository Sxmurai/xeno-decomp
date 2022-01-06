//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.util.math.BlockPos
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _ar
 */
public class _ar_0 {
    public boolean fg;
    public BlockPos fl;
    public boolean fi;
    public double fp = 0.0;
    public _cl_0 fm;
    public double fo = 0.0;
    public boolean fh;
    public double fn = 0.0;
    public Color fq;
    public static final int[] fr = new int[]{0, 0, 0, 0, 0, 0, 0, 770, 771, 0, 1, 0, 2848, 3154, 4354, 2848, 1, 7425, 7424, 770, 771, 1, 0, 2848, 3154, 4354, 1, 0, 1, 1, 7425, 1, 7424, 2848};
    public boolean ff;
    public boolean fe = fr[0];
    public boolean fk;
    public boolean fj;

    public static void glRestore() {
        GlStateManager.enableCull();
        GlStateManager.enableAlpha();
        GlStateManager.shadeModel((int)fr[18]);
    }

    public _ar_0 width(double d) {
        this.fp = d;
        return this;
    }

    public _ar_0 build() {
        if (this.ff) {
            GlStateManager.depthMask((boolean)fr[31]);
            GlStateManager.enableDepth();
        }
        if (this.fh) {
            GlStateManager.enableTexture2D();
        }
        if (this.fg) {
            GlStateManager.disableBlend();
        }
        if (this.fi) {
            GlStateManager.enableCull();
        }
        if (this.fj) {
            GlStateManager.enableAlpha();
        }
        if (this.fk) {
            GlStateManager.shadeModel((int)fr[32]);
        }
        if (this.fe) {
            GL11.glDisable((int)fr[33]);
            GlStateManager.popMatrix();
        }
        return this;
    }

    public double getLength() {
        return this.fo;
    }

    public static void glPrepare() {
        GlStateManager.disableCull();
        GlStateManager.disableAlpha();
        GlStateManager.shadeModel((int)fr[17]);
    }

    public _ar_0() {
        this.ff = fr[1];
        this.fg = fr[2];
        this.fh = fr[3];
        this.fi = fr[4];
        this.fj = fr[5];
        this.fk = fr[6];
        this.fl = BlockPos.ORIGIN;
        this.fm = _cl_0.pD;
        this.fq = Color.WHITE;
    }

    public _ar_0 height(double d) {
        this.fn = d;
        return this;
    }

    public _ar_0 length(double d) {
        this.fo = d;
        return this;
    }

    public _ar_0 blend() {
        GlStateManager.enableBlend();
        this.fg = fr[28];
        return this;
    }

    public _ar_0 line(float f) {
        GlStateManager.glLineWidth((float)f);
        return this;
    }

    public _ar_0 color(Color color) {
        this.fq = color;
        return this;
    }

    public _ar_0 shade(boolean bl) {
        if (bl) {
            GlStateManager.shadeModel((int)fr[30]);
        }
        this.fk = bl;
        return this;
    }

    public double getHeight() {
        return this.fn;
    }

    public static void glSetup() {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.tryBlendFuncSeparate((int)fr[7], (int)fr[8], (int)fr[9], (int)fr[10]);
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask((boolean)fr[11]);
        GL11.glEnable((int)fr[12]);
        GL11.glHint((int)fr[13], (int)fr[14]);
        GL11.glLineWidth((float)1.5f);
    }

    public _ar_0 alpha(boolean bl) {
        if (this.fj) {
            GlStateManager.disableAlpha();
        }
        this.fj = bl;
        return this;
    }

    public double getWidth() {
        return this.fp;
    }

    public _ar_0 setup() {
        GlStateManager.pushMatrix();
        GlStateManager.tryBlendFuncSeparate((int)fr[19], (int)fr[20], (int)fr[21], (int)fr[22]);
        GL11.glEnable((int)fr[23]);
        GL11.glHint((int)fr[24], (int)fr[25]);
        this.fe = fr[26];
        return this;
    }

    public Color getColor() {
        return this.fq;
    }

    public BlockPos getBlockPos() {
        return this.fl;
    }

    public static void glRelease() {
        GL11.glDisable((int)fr[15]);
        GlStateManager.depthMask((boolean)fr[16]);
        GlStateManager.enableDepth();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public _ar_0 texture() {
        GlStateManager.disableTexture2D();
        this.fh = fr[29];
        return this;
    }

    public _ar_0 position(BlockPos blockPos) {
        this.fl = blockPos;
        return this;
    }

    public _ar_0 box(_cl_0 _cl_02) {
        this.fm = _cl_02;
        return this;
    }

    public _cl_0 getBox() {
        return this.fm;
    }

    public _ar_0 depth(boolean bl) {
        if (bl) {
            GlStateManager.disableDepth();
            GlStateManager.depthMask((boolean)fr[27]);
        }
        this.ff = bl;
        return this;
    }

    public _ar_0 cull(boolean bl) {
        if (this.fi) {
            GlStateManager.disableCull();
        }
        this.fi = bl;
        return this;
    }
}

