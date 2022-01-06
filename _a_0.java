//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _a
 */
public class _a_0 {
    public static _a_0 b;
    public static final Map<Integer, Boolean> a;
    public static final int[] c;

    public void disableGlCap(int n) {
        _a_0.setGlCap(n, c[3]);
    }

    public void setGlState(int n, boolean bl) {
        if (bl) {
            GL11.glEnable((int)n);
        } else {
            GL11.glDisable((int)n);
        }
    }

    static {
        c = new int[]{1, 0, 1, 0, 0, 0};
        a = new HashMap<Integer, Boolean>();
        b = new _a_0();
    }

    public static void reset() {
        b.resetCaps();
    }

    public static void enableGlCap(int n) {
        _a_0.setGlCap(n, c[0]);
    }

    public void glColor(Color color) {
        float f = (float)color.getRed() / 255.0f;
        float f2 = (float)color.getGreen() / 255.0f;
        float f3 = (float)color.getBlue() / 255.0f;
        float f4 = (float)color.getAlpha() / 255.0f;
        GlStateManager.color((float)f, (float)f2, (float)f3, (float)f4);
    }

    public static void setGlCap(int n, boolean bl) {
        a.put(n, GL11.glGetBoolean((int)n));
        b.setGlState(n, bl);
    }

    public void glColor(int n, int n2, int n3, int n4) {
        GlStateManager.color((float)((float)n / 255.0f), (float)((float)n2 / 255.0f), (float)((float)n3 / 255.0f), (float)((float)n4 / 255.0f));
    }

    public void resetCaps() {
        a.forEach(this::setGlState);
    }

    public static void disableGlCap(int ... nArray) {
        int[] nArray2 = nArray;
        int n = nArray2.length;
        for (int i = c[4]; i < n; ++i) {
            int n2 = nArray2[i];
            _a_0.setGlCap(n2, c[5]);
        }
    }

    public void enableGlCap(int ... nArray) {
        int[] nArray2 = nArray;
        int n = nArray2.length;
        for (int i = c[1]; i < n; ++i) {
            int n2 = nArray2[i];
            _a_0.setGlCap(n2, c[2]);
        }
    }
}

