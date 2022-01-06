//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
import net.minecraft.client.Minecraft;

/*
 * Renamed from _h
 */
public class _h_0 {
    public static Minecraft C;
    public static final String[] E;
    public static final int[] F;
    public static boolean D;

    public static void drawClickGuiString(String string, float f, float f2, float f3, float f4, int n) {
        if (_as_0.fB.getModule(E[F[6]]).isEnabled()) {
            if (_aB.gw.is(E[F[7]])) {
                if (D) {
                    _cX.te.drawStringWithShadow(string, f3 - (float)(_cX.te.getStringWidth(string) / F[8]), f2 + 4.0f, n);
                    return;
                }
                _cK.rZ.drawStringWithShadow(string, f3 - (float)(_cK.rZ.getStringWidth(string) / F[9]), f2 + 4.0f, n);
            }
            if (_aB.gw.is(E[F[10]])) {
                if (D) {
                    _cX.te.drawStringWithShadow(string, f, f2 + 4.0f, n);
                    return;
                }
                _cK.rZ.drawStringWithShadow(string, f, f2 + 4.0f, n);
            }
            if (_aB.gw.is(E[F[11]])) {
                if (D) {
                    _cX.te.drawStringWithShadow(string, f4 - (float)_cX.te.getStringWidth(string) - 2.0f, f2 + 4.0f, n);
                    return;
                }
                _cK.rZ.drawStringWithShadow(string, f4 - (float)_cK.rZ.getStringWidth(string) - 2.0f, f2 + 4.0f, n);
            }
        } else {
            if (_aB.gw.is(E[F[12]])) {
                _h_0.C.fontRenderer.drawStringWithShadow(string, f3 - (float)(_h_0.C.fontRenderer.getStringWidth(string) / F[13]), f2 + 1.0f, n);
            }
            if (_aB.gw.is(E[F[14]])) {
                _h_0.C.fontRenderer.drawStringWithShadow(string, f, f2 + 1.0f, n);
            }
            if (_aB.gw.is(E[F[15]])) {
                _h_0.C.fontRenderer.drawStringWithShadow(string, f4 - (float)_h_0.C.fontRenderer.getStringWidth(string) - 2.0f, f2 + 1.0f, n);
            }
        }
    }

    public static void drawStringWithShadow(String string, float f, float f2, int n) {
        if (_as_0.fB.getModule(E[F[0]]).isEnabled()) {
            if (D) {
                _cX.te.drawStringWithShadow(string, f, f2 + 4.0f, n);
                return;
            }
            _cK.rZ.drawStringWithShadow(string, f, f2 + 4.0f, n);
        } else {
            _h_0.C.fontRenderer.drawStringWithShadow(string, f, f2 + 2.0f, n);
        }
    }

    public static void drawCenteredString(String string, float f, float f2, int n) {
        if (_as_0.fB.getModule(E[F[2]]).isEnabled()) {
            if (D) {
                _cX.te.drawStringWithShadow(string, f - (float)(_cX.te.getStringWidth(string) / F[3]), f2 + 4.0f, n);
                return;
            }
            _cK.rZ.drawStringWithShadow(string, f - (float)(_cK.rZ.getStringWidth(string) / F[4]), f2 + 4.0f, n);
        } else {
            _h_0.C.fontRenderer.drawStringWithShadow(string, f - (float)(_h_0.C.fontRenderer.getStringWidth(string) / F[5]), f2 + 2.0f, n);
        }
    }

    static {
        F = new int[]{0, 1, 2, 2, 2, 2, 3, 4, 2, 2, 5, 6, 7, 2, 8, 9, 10, 0, 0, 0, 11, 0, 2, 12, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0};
        String[] stringArray = new String[F[23]];
        stringArray[_h_0.F[24]] = "CustomFont";
        stringArray[_h_0.F[25]] = "CustomFont";
        stringArray[_h_0.F[26]] = "CustomFont";
        stringArray[_h_0.F[27]] = "CustomFont";
        stringArray[_h_0.F[28]] = "Center";
        stringArray[_h_0.F[29]] = "Left";
        stringArray[_h_0.F[30]] = "Right";
        stringArray[_h_0.F[31]] = "Center";
        stringArray[_h_0.F[32]] = "Left";
        stringArray[_h_0.F[33]] = "Right";
        stringArray[_h_0.F[34]] = "CustomFont";
        stringArray[_h_0.F[35]] = "";
        E = stringArray;
        C = Minecraft.getMinecraft();
        D = F[36];
    }

    public static int getStringWidth(String string) {
        try {
            if (_as_0.fB.getModule(E[F[1]]).isEnabled()) {
                if (D) {
                    return _cX.te.getStringWidth(string);
                }
                return _cK.rZ.getStringWidth(string);
            }
            return _h_0.C.fontRenderer.getStringWidth(string);
        }
        catch (NullPointerException nullPointerException) {
            return _h_0.C.fontRenderer.getStringWidth(string);
        }
    }

    public static void drawRainbowString(String string, float f, float f2, float f3, float f4, int n) {
        if (_as_0.fB.getModule(E[F[16]]).isEnabled()) {
            if (D) {
                _cX.te.drawRainbowStringWithShadow(string, f, f2, F[17], f3, f4, n);
                return;
            }
            _cK.rZ.drawRainbowStringWithShadow(string, f, f2, F[18], f3, f4, n);
        } else {
            int n2 = string.length() * n;
            int n3 = F[19];
            String string2 = E[F[20]];
            char[] cArray = string.toCharArray();
            int n4 = cArray.length;
            for (int i = F[21]; i < n4; ++i) {
                char c = cArray[i];
                _h_0.C.fontRenderer.drawStringWithShadow(String.valueOf(c), f + (float)n3, f2, _M.rainbowWave(f3, f4, 1.0f, n2));
                n3 += _h_0.C.fontRenderer.getStringWidth(String.valueOf(c));
                n2 -= n;
            }
        }
    }

    public static void drawVanillaCenteredString(String string, float f, float f2, int n) {
        _h_0.C.fontRenderer.drawStringWithShadow(string, f - (float)(_h_0.C.fontRenderer.getStringWidth(string) / F[22]), f2, n);
    }
}

