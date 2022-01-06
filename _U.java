//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

public class _U
implements _cf_0 {
    public static final int[] pd = new int[]{524288, 3089, 3089};

    public static void prepareScale(float f, float f2) {
        GlStateManager.pushMatrix();
        GlStateManager.scale((float)f, (float)f2, (float)1.0f);
    }

    public static void scaleProportion(int n, int n2, float f, float f2) {
        GlStateManager.scale((float)f, (float)f2, (float)1.0f);
        GlStateManager.translate((float)n, (float)n2, (float)1.0f);
    }

    public static void prepareScissor(int n, double d, int n2, double d2) {
        GL11.glPushAttrib((int)pd[0]);
        GL11.glScissor((int)(n * new ScaledResolution(pb).getScaleFactor()), (int)((int)((double)new ScaledResolution(pb).getScaledHeight() - d2) * new ScaledResolution(pb).getScaleFactor()), (int)((n2 - n) * new ScaledResolution(pb).getScaleFactor()), (int)((int)(d2 - d) * new ScaledResolution(pb).getScaleFactor()));
        GL11.glEnable((int)pd[1]);
    }

    public static void restoreScale() {
        GlStateManager.popMatrix();
    }

    public static void translate(int n, int n2) {
        GlStateManager.translate((float)n, (float)n2, (float)1.0f);
    }

    public static void restoreScissor() {
        GL11.glDisable((int)pd[2]);
        GL11.glPopAttrib();
    }

    public static void rotate(int n, int n2, int n3, int n4) {
        GlStateManager.rotate((float)n, (float)n2, (float)n3, (float)n4);
    }
}

