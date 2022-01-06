//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.resources.IResourceManager
 *  net.minecraft.util.ResourceLocation
 */
import java.awt.Color;
import java.awt.Font;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;

public class _C
extends FontRenderer
implements _cf_0 {
    public static final String[] be;
    public final _bD bd;
    public static final int[] pd;

    public int getColorCode(char c) {
        return _cC.rf[_C.getColorIndex(c)];
    }

    public int drawStringWithShadow(String string, float f, float f2, int n) {
        return this.drawString(string, f, f2, n, pd[3]);
    }

    public static int getColorIndex(char c) {
        switch (c) {
            case '0': 
            case '1': 
            case '2': 
            case '3': 
            case '4': 
            case '5': 
            case '6': 
            case '7': 
            case '8': 
            case '9': {
                return c - pd[47];
            }
            case 'a': 
            case 'b': 
            case 'c': 
            case 'd': 
            case 'e': 
            case 'f': {
                return c - pd[48] + pd[49];
            }
            case 'k': 
            case 'l': 
            case 'm': 
            case 'n': 
            case 'o': {
                return c - pd[50] + pd[51];
            }
            case 'r': {
                return pd[52];
            }
        }
        return pd[53];
    }

    static {
        pd = new int[]{0, 0, 2, 1, 1, 2, 0, 0, 0, 0, 0, 150, 1, 0, 0, 3, 0, 1, 0, 770, 771, 1, 0, -67108864, -16777216, 24, 255, 4, 5, 0, 0, 1, 0, 6, 24, 0, 1, -67108864, -16777216, 0, 7, 8, 0, 0, 1, 2, 2, 48, 97, 10, 107, 16, 21, -1, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        String[] stringArray = new String[pd[54]];
        stringArray[_C.pd[55]] = "textures/font/ascii.png";
        stringArray[_C.pd[56]] = "\n";
        stringArray[_C.pd[57]] = "\n";
        stringArray[_C.pd[58]] = "";
        stringArray[_C.pd[59]] = "\u00a7";
        stringArray[_C.pd[60]] = "\u00a7";
        stringArray[_C.pd[61]] = "0123456789abcdefklmnor";
        stringArray[_C.pd[62]] = "\u00a7";
        stringArray[_C.pd[63]] = "\u00a7";
        be = stringArray;
    }

    public int getHeight() {
        return this.bd.getHeight() / pd[2];
    }

    public void onResourceManagerReload(IResourceManager iResourceManager) {
    }

    public int drawString(String string, float f, float f2, int n, boolean bl) {
        float f3 = f2 - 3.0f;
        if (string.contains(be[pd[4]])) {
            String[] stringArray = string.split(be[pd[5]]);
            float f4 = 0.0f;
            String[] stringArray2 = stringArray;
            int n2 = stringArray2.length;
            for (int i = pd[6]; i < n2; ++i) {
                String string2 = stringArray2[i];
                this.drawText(string2, f, f3 + f4, n, bl);
                f4 += (float)this.getHeight();
            }
            return pd[7];
        }
        if (bl) {
            this.drawText(string, f + _i_0.G.getFloatValue(), f3 + _i_0.G.getFloatValue(), new Color(pd[8], pd[9], pd[10], pd[11]).getRGB(), pd[12]);
        }
        return this.drawText(string, f, f3, n, pd[13]);
    }

    public void bindTexture(ResourceLocation resourceLocation) {
    }

    public int drawText(String string, float f, float f2, int n, boolean bl) {
        if (string == null) {
            return pd[18];
        }
        if (string.isEmpty()) {
            return (int)f;
        }
        GlStateManager.translate((double)((double)f - 1.5), (double)((double)f2 + 0.5), (double)0.0);
        GlStateManager.enableAlpha();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate((int)pd[19], (int)pd[20], (int)pd[21], (int)pd[22]);
        GlStateManager.enableTexture2D();
        int n2 = n;
        if ((n2 & pd[23]) == 0) {
            n2 |= pd[24];
        }
        int n3 = n2 >> pd[25] & pd[26];
        if (string.contains(be[pd[27]])) {
            String[] stringArray = string.split(be[pd[28]]);
            _bD _bD2 = this.bd;
            double d = 0.0;
            int n4 = pd[29];
            for (int i = pd[30]; i < stringArray.length; ++i) {
                String string2 = stringArray[i];
                if (string2.isEmpty()) continue;
                if (i == 0) {
                    _bD2.drawString(string2, d, 0.0, n2);
                    d += (double)_bD2.getStringWidth(string2);
                    continue;
                }
                String string3 = string2.substring(pd[31]);
                char c = string2.charAt(pd[32]);
                int n5 = be[pd[33]].indexOf(c);
                switch (n5) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: 
                    case 13: 
                    case 14: 
                    case 15: {
                        if (!bl) {
                            n2 = _cC.rf[n5] | n3 << pd[34];
                        }
                        n4 = pd[35];
                        break;
                    }
                    case 16: {
                        n4 = pd[36];
                        break;
                    }
                    case 18: {
                        break;
                    }
                    case 21: {
                        n2 = n;
                        if ((n2 & pd[37]) == 0) {
                            n2 |= pd[38];
                        }
                        n4 = pd[39];
                    }
                }
                _bD2 = this.bd;
                if (n4 != 0) {
                    _bD2.drawString(_cC.randomMagicText(string3), d, 0.0, n2);
                } else {
                    _bD2.drawString(string3, d, 0.0, n2);
                }
                d += (double)_bD2.getStringWidth(string3);
            }
        } else {
            this.bd.drawString(string, 0.0, 0.0, n2);
        }
        GlStateManager.disableBlend();
        GlStateManager.translate((double)(-((double)f - 1.5)), (double)(-((double)f2 + 0.5)), (double)0.0);
        return (int)(f + (float)this.getStringWidth(string));
    }

    public int getCharWidth(char c) {
        return this.getStringWidth(String.valueOf(c));
    }

    public void drawRainbowStringWithShadow(String string, float f, float f2, int n, float f3, float f4, int n2) {
        int n3 = string.length() * n2;
        int n4 = pd[14];
        String string2 = be[pd[15]];
        char[] cArray = string.toCharArray();
        int n5 = cArray.length;
        for (int i = pd[16]; i < n5; ++i) {
            char c = cArray[i];
            this.drawStringWithShadow(String.valueOf(c), f + (float)n4, f2, _M.rainbowWave(f3, f4, 1.0f, n3));
            n4 = n4 + this.getStringWidth(String.valueOf(c)) + pd[17];
            n3 -= n2;
        }
    }

    public _C(Font font) {
        super(_C.pb.gameSettings, new ResourceLocation(be[pd[0]]), null, pd[1]);
        this.bd = new _bD(font);
        this.FONT_HEIGHT = this.getHeight();
    }

    public int getStringWidth(String string) {
        if (string.contains(be[pd[40]])) {
            String[] stringArray = string.split(be[pd[41]]);
            _bD _bD2 = this.bd;
            int n = pd[42];
            for (int i = pd[43]; i < stringArray.length; ++i) {
                String string2 = stringArray[i];
                if (string2.isEmpty()) continue;
                if (i == 0) {
                    n += _bD2.getStringWidth(string2);
                    continue;
                }
                String string3 = string2.substring(pd[44]);
                _bD2 = this.bd;
                n += _bD2.getStringWidth(string3);
            }
            return n / pd[45];
        }
        return this.bd.getStringWidth(string) / pd[46];
    }

    public int getSize() {
        return this.bd.getFont().getSize();
    }
}

