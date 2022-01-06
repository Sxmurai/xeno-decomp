//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.texture.DynamicTexture
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.lwjgl.opengl.GL11;

public class _F
extends _cN {
    public String bp;
    public _y_0[] bn;
    public DynamicTexture br;
    public int[] bo;
    public DynamicTexture bs;
    public _y_0[] bl = new _y_0[sw[0]];
    public static final int[] sw = new int[]{256, 256, 256, 32, 0, 1, 0, 0, 0, 1, 0, 1, 2, 3, 0, 0, 0, 4, 5, 2, 2, 2, 0x20FFFFFF, 0xFFFFFF, -67108864, -16777216, 0xFCFCFC, 2, -16777216, 24, 255, 0, 0, 0, 0, 0, 1, 770, 771, 16, 255, 8, 255, 255, 3553, 0, 167, 21, 6, 1, 16, 0, 0, 0, 0, 0, 15, 16, 255, 8, 255, 255, 16, 1, 17, 1, 18, 1, 19, 1, 20, 1, 0, 0, 0, 0, 0, 16, 255, 8, 255, 255, 4, 2, 2, 3155, 4352, 24, 255, 0, 0, 0, 0, 0, 1, 770, 771, 16, 255, 8, 255, 255, 3553, 3553, 10241, 9729, 3553, 10240, 9729, 0, 167, 21, 7, 1, 16, 0, 0, 0, 0, 0, 15, 16, 255, 8, 255, 255, 16, 1, 17, 1, 18, 1, 19, 1, 20, 1, 0, 0, 0, 0, 0, 16, 255, 8, 255, 255, 4, 2, 2, 3155, 4352, 24, 255, 0, 0, 0, 0, 0, 1, 770, 771, 16, 255, 8, 255, 255, 3553, 3553, 10241, 9728, 3553, 10240, 9728, 0, 167, 21, 8, 1, 16, 0, 0, 0, 0, 0, 15, 16, 255, 8, 255, 255, 16, 1, 17, 1, 18, 1, 19, 1, 20, 1, 0, 0, 0, 0, 0, 16, 255, 8, 255, 255, 4, 2, 2, 3155, 4352, 0, 0, 0, 0, 167, 9, 0, 0, 0, 0, 0, 167, 10, 0, 0, 8, 2, 1, 2, 3, 3553, 1, 3553, 11, 65535, 0, 0, 167, 1, 1, 12, 13, 14, 15, 16, 17, 65535, 0, 167, 1, 1, 18, 0, 32, 3, 1, 85, 2, 1, 170, 1, 1, 170, 1, 170, 6, 16, 4, 4, 4, 255, 16, 255, 8, 255, 0, 19, 20, 167, 32, 21, -1, 4, 15, 15, 2, 1, 1, 0, -1, 1, 0, 0, 0, 108, 76, 114, 82, 0, 1, 1, 0, 22, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
    public static final String[] bt;
    public _y_0[] bm = new _y_0[sw[1]];
    public DynamicTexture bq;

    public double getStringWidth(String string, float f) {
        if (string == null) {
            return 0.0;
        }
        float f2 = 0.0f;
        _y_0[] _y_0Array = this.sp;
        int n = sw[223];
        int n2 = sw[224];
        for (int i = sw[225]; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c == sw[226]) {
                int n3 = bt[sw[227]].indexOf(c);
                n = sw[228];
                n2 = sw[229];
                ++i;
                continue;
            }
            if (c >= _y_0Array.length) continue;
            f2 += (float)_y_0Array[c].aS - f + (float)this.su;
        }
        return f2 / 2.0f;
    }

    public double getPasswordWidth(String string) {
        return this.getStringWidth(string.replaceAll(bt[sw[17]], bt[sw[18]]), 8.0f);
    }

    public void drawRainbowStringWithShadow(String string, double d, float f, int n, float f2, float f3, int n2) {
        int n3 = string.length() * n2;
        int n4 = sw[8];
        String string2 = bt[sw[9]];
        char[] cArray = string.toCharArray();
        int n5 = cArray.length;
        for (int i = sw[10]; i < n5; ++i) {
            char c = cArray[i];
            this.drawStringWithShadow(String.valueOf(c), d + (double)n4, f, _M.rainbowWave(f2, f3, 1.0f, n3));
            n4 = n4 + this.getStringWidth(String.valueOf(c)) + sw[11];
            n3 -= n2;
        }
    }

    public _F(Font font, boolean bl, boolean bl2) {
        super(font, bl, bl2);
        this.bn = new _y_0[sw[2]];
        this.bo = new int[sw[3]];
        this.bp = bt[sw[4]];
        this.setupMinecraftColorcodes();
        this.setupBoldItalicIDs();
    }

    public void setupBoldItalicIDs() {
        this.bq = this.setupTexture(this.sq.deriveFont(sw[232]), this.sr, this.ss, this.bl);
        this.br = this.setupTexture(this.sq.deriveFont(sw[233]), this.sr, this.ss, this.bm);
        this.bs = this.setupTexture(this.sq.deriveFont(sw[234]), this.sr, this.ss, this.bn);
    }

    @Override
    public void setFont(Font font) {
        super.setFont(font);
        this.setupBoldItalicIDs();
    }

    public int drawPassword(String string, double d, float f, int n) {
        return (int)this.drawString(string.replaceAll(bt[sw[12]], bt[sw[13]]), d, f, n, sw[14], 8.0f);
    }

    static {
        String[] stringArray = new String[sw[307]];
        stringArray[_F.sw[308]] = "0123456789abcdefklmnor";
        stringArray[_F.sw[309]] = "";
        stringArray[_F.sw[310]] = ".";
        stringArray[_F.sw[311]] = ".";
        stringArray[_F.sw[312]] = ".";
        stringArray[_F.sw[313]] = ".";
        stringArray[_F.sw[314]] = "0123456789abcdefklmnor";
        stringArray[_F.sw[315]] = "0123456789abcdefklmnor";
        stringArray[_F.sw[316]] = "0123456789abcdefklmnor";
        stringArray[_F.sw[317]] = "0123456789abcdefklmnor";
        stringArray[_F.sw[318]] = "0123456789abcdefklmnor";
        stringArray[_F.sw[319]] = " ";
        stringArray[_F.sw[320]] = " ";
        stringArray[_F.sw[321]] = " ";
        stringArray[_F.sw[322]] = "\u00a7";
        stringArray[_F.sw[323]] = " ";
        stringArray[_F.sw[324]] = "\u00a7";
        stringArray[_F.sw[325]] = " ";
        stringArray[_F.sw[326]] = "\u00a7";
        stringArray[_F.sw[327]] = ".";
        stringArray[_F.sw[328]] = ".";
        stringArray[_F.sw[329]] = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261\u00b1\u2265\u2264\u2320\u2321\u00f7\u2248\u00b0\u2219\u00b7\u221a\u207f\u00b2\u25a0\u0000";
        bt = stringArray;
    }

    public int drawString(String string, double d, float f, int n) {
        return (int)this.drawString(string, d, f, n, sw[7], 8.3f);
    }

    public int getStringWidth(String string) {
        if (string == null) {
            return sw[215];
        }
        float f = 0.0f;
        _y_0[] _y_0Array = this.sp;
        int n = sw[216];
        int n2 = sw[217];
        for (int i = sw[218]; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c == sw[219]) {
                int n3 = bt[sw[220]].indexOf(c);
                n = sw[221];
                n2 = sw[222];
                ++i;
                continue;
            }
            if (c >= _y_0Array.length) continue;
            f += (float)_y_0Array[c].aS - 8.3f + (float)this.su;
        }
        return (int)(f / 2.0f);
    }

    public float drawCenteredStringWithShadow(String string, float f, float f2, int n) {
        return this.drawStringWithShadow(string, f - (float)(this.getStringWidth(string) / sw[21]), f2, n);
    }

    public float drawNoBSString(String string, double d, double d2, int n, boolean bl) {
        d -= 1.0;
        if (string == null) {
            return 0.0f;
        }
        _y_0[] _y_0Array = this.sp;
        float f = (float)(n >> sw[151] & sw[152]) / 255.0f;
        int n2 = sw[153];
        int n3 = sw[154];
        int n4 = sw[155];
        int n5 = sw[156];
        int n6 = sw[157];
        int n7 = sw[158];
        d *= 2.0;
        d2 = (d2 - 3.0) * 2.0;
        GL11.glPushMatrix();
        GlStateManager.scale((double)0.5, (double)0.5, (double)0.5);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc((int)sw[159], (int)sw[160]);
        GlStateManager.color((float)((float)(n >> sw[161] & sw[162]) / 255.0f), (float)((float)(n >> sw[163] & sw[164]) / 255.0f), (float)((float)(n & sw[165]) / 255.0f), (float)f);
        GlStateManager.enableTexture2D();
        GlStateManager.bindTexture((int)this.sv.getGlTextureId());
        GL11.glBindTexture((int)sw[166], (int)this.sv.getGlTextureId());
        GL11.glTexParameteri((int)sw[167], (int)sw[168], (int)sw[169]);
        GL11.glTexParameteri((int)sw[170], (int)sw[171], (int)sw[172]);
        for (int i = sw[173]; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c == sw[174]) {
                int n8 = sw[175];
                try {
                    n8 = bt[sw[176]].indexOf(string.charAt(i + sw[177]));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                if (n8 < sw[178]) {
                    n3 = sw[179];
                    n4 = sw[180];
                    n2 = sw[181];
                    n6 = sw[182];
                    n5 = sw[183];
                    GlStateManager.bindTexture((int)this.sv.getGlTextureId());
                    _y_0Array = this.sp;
                    if (n8 < 0) {
                        n8 = sw[184];
                    }
                    if (bl) {
                        n8 += 16;
                    }
                    int n9 = this.bo[n8];
                    GlStateManager.color((float)((float)(n9 >> sw[185] & sw[186]) / 255.0f), (float)((float)(n9 >> sw[187] & sw[188]) / 255.0f), (float)((float)(n9 & sw[189]) / 255.0f), (float)f);
                } else if (n8 == sw[190]) {
                    n2 = sw[191];
                } else if (n8 == sw[192]) {
                    n3 = sw[193];
                    if (n4 != 0) {
                        GlStateManager.bindTexture((int)this.bs.getGlTextureId());
                        _y_0Array = this.bn;
                    } else {
                        GlStateManager.bindTexture((int)this.bq.getGlTextureId());
                        _y_0Array = this.bl;
                    }
                } else if (n8 == sw[194]) {
                    n5 = sw[195];
                } else if (n8 == sw[196]) {
                    n6 = sw[197];
                } else if (n8 == sw[198]) {
                    n4 = sw[199];
                    if (n3 != 0) {
                        GlStateManager.bindTexture((int)this.bs.getGlTextureId());
                        _y_0Array = this.bn;
                    } else {
                        GlStateManager.bindTexture((int)this.br.getGlTextureId());
                        _y_0Array = this.bm;
                    }
                } else {
                    n3 = sw[200];
                    n4 = sw[201];
                    n2 = sw[202];
                    n6 = sw[203];
                    n5 = sw[204];
                    GlStateManager.color((float)((float)(n >> sw[205] & sw[206]) / 255.0f), (float)((float)(n >> sw[207] & sw[208]) / 255.0f), (float)((float)(n & sw[209]) / 255.0f), (float)f);
                    GlStateManager.bindTexture((int)this.sv.getGlTextureId());
                    _y_0Array = this.sp;
                }
                ++i;
                continue;
            }
            if (c >= _y_0Array.length) continue;
            GL11.glBegin((int)sw[210]);
            this.drawChar(_y_0Array, c, (float)d, (float)d2);
            GL11.glEnd();
            if (n5 != 0) {
                this.drawLine(d, d2 + (double)(_y_0Array[c].aT / sw[211]), d + (double)_y_0Array[c].aS - 8.0, d2 + (double)(_y_0Array[c].aT / sw[212]), 1.0f);
            }
            if (n6 != 0) {
                this.drawLine(d, d2 + (double)_y_0Array[c].aT - 2.0, d + (double)_y_0Array[c].aS - 8.0, d2 + (double)_y_0Array[c].aT - 2.0, 1.0f);
            }
            d += (double)((float)_y_0Array[c].aS - 8.3f + (float)this.su);
        }
        GL11.glHint((int)sw[213], (int)sw[214]);
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        return (float)d / 2.0f;
    }

    public float drawCenteredString(String string, float f, float f2, int n) {
        return this.drawString(string, f - (float)(this.getStringWidth(string) / sw[19]), f2, n);
    }

    public float getCharWidthFloat(char c) {
        if (c == sw[283]) {
            return -1.0f;
        }
        if (c == sw[284]) {
            return 2.0f;
        }
        int n = bt[sw[285]].indexOf(c);
        if (c > '\u0000' && n != sw[286]) {
            return (float)this.sp[n].aS / 2.0f - 4.0f;
        }
        if ((float)this.sp[c].aS / 2.0f - 4.0f != 0.0f) {
            int n2 = (int)((float)this.sp[c].aS / 2.0f - 4.0f) >>> sw[287];
            int n3 = (int)((float)this.sp[c].aS / 2.0f - 4.0f) & sw[288];
            return (++n3 - (n2 &= sw[289])) / sw[290] + sw[291];
        }
        return 0.0f;
    }

    public int drawNoBSString(String string, double d, float f, int n) {
        return (int)this.drawNoBSString(string, d, f, n, sw[15]);
    }

    public String trimStringToWidth(String string, int n, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        float f = 0.0f;
        int n2 = bl ? string.length() - sw[292] : sw[293];
        int n3 = bl ? sw[294] : sw[295];
        int n4 = sw[296];
        int n5 = sw[297];
        for (int i = n2; i >= 0 && i < string.length() && f < (float)n; i += n3) {
            char c = string.charAt(i);
            float f2 = this.getCharWidthFloat(c);
            if (n4 != 0) {
                n4 = sw[298];
                if (c != sw[299] && c != sw[300]) {
                    if (c == sw[301] || c == sw[302]) {
                        n5 = sw[303];
                    }
                } else {
                    n5 = sw[304];
                }
            } else if (f2 < 0.0f) {
                n4 = sw[305];
            } else {
                f += f2;
                if (n5 != 0) {
                    f += 1.0f;
                }
            }
            if (f > (float)n) break;
            if (bl) {
                stringBuilder.insert(sw[306], c);
                continue;
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public int getHeight() {
        return (this.st - sw[230]) / sw[231];
    }

    public float drawString(String string, double d, double d2, int n, boolean bl, float f) {
        d -= 1.0;
        if (string == null) {
            return 0.0f;
        }
        if (n == sw[22]) {
            n = sw[23];
        }
        if ((n & sw[24]) == 0) {
            n |= sw[25];
        }
        if (bl) {
            n = (n & sw[26]) >> sw[27] | n & sw[28];
        }
        _y_0[] _y_0Array = this.sp;
        float f2 = (float)(n >> sw[29] & sw[30]) / 255.0f;
        int n2 = sw[31];
        int n3 = sw[32];
        int n4 = sw[33];
        int n5 = sw[34];
        int n6 = sw[35];
        int n7 = sw[36];
        d *= 2.0;
        d2 = (d2 - 3.0) * 2.0;
        GL11.glPushMatrix();
        GlStateManager.scale((double)0.5, (double)0.5, (double)0.5);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc((int)sw[37], (int)sw[38]);
        GlStateManager.color((float)((float)(n >> sw[39] & sw[40]) / 255.0f), (float)((float)(n >> sw[41] & sw[42]) / 255.0f), (float)((float)(n & sw[43]) / 255.0f), (float)f2);
        GlStateManager.enableTexture2D();
        GlStateManager.bindTexture((int)this.sv.getGlTextureId());
        GL11.glBindTexture((int)sw[44], (int)this.sv.getGlTextureId());
        for (int i = sw[45]; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c == sw[46]) {
                int n8 = sw[47];
                try {
                    n8 = bt[sw[48]].indexOf(string.charAt(i + sw[49]));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                if (n8 < sw[50]) {
                    n3 = sw[51];
                    n4 = sw[52];
                    n2 = sw[53];
                    n6 = sw[54];
                    n5 = sw[55];
                    GlStateManager.bindTexture((int)this.sv.getGlTextureId());
                    _y_0Array = this.sp;
                    if (n8 < 0) {
                        n8 = sw[56];
                    }
                    if (bl) {
                        n8 += 16;
                    }
                    int n9 = this.bo[n8];
                    GlStateManager.color((float)((float)(n9 >> sw[57] & sw[58]) / 255.0f), (float)((float)(n9 >> sw[59] & sw[60]) / 255.0f), (float)((float)(n9 & sw[61]) / 255.0f), (float)f2);
                } else if (n8 == sw[62]) {
                    n2 = sw[63];
                } else if (n8 == sw[64]) {
                    n3 = sw[65];
                    if (n4 != 0) {
                        GlStateManager.bindTexture((int)this.bs.getGlTextureId());
                        _y_0Array = this.bn;
                    } else {
                        GlStateManager.bindTexture((int)this.bq.getGlTextureId());
                        _y_0Array = this.bl;
                    }
                } else if (n8 == sw[66]) {
                    n5 = sw[67];
                } else if (n8 == sw[68]) {
                    n6 = sw[69];
                } else if (n8 == sw[70]) {
                    n4 = sw[71];
                    if (n3 != 0) {
                        GlStateManager.bindTexture((int)this.bs.getGlTextureId());
                        _y_0Array = this.bn;
                    } else {
                        GlStateManager.bindTexture((int)this.br.getGlTextureId());
                        _y_0Array = this.bm;
                    }
                } else {
                    n3 = sw[72];
                    n4 = sw[73];
                    n2 = sw[74];
                    n6 = sw[75];
                    n5 = sw[76];
                    GlStateManager.color((float)((float)(n >> sw[77] & sw[78]) / 255.0f), (float)((float)(n >> sw[79] & sw[80]) / 255.0f), (float)((float)(n & sw[81]) / 255.0f), (float)f2);
                    GlStateManager.bindTexture((int)this.sv.getGlTextureId());
                    _y_0Array = this.sp;
                }
                ++i;
                continue;
            }
            if (c >= _y_0Array.length) continue;
            GL11.glBegin((int)sw[82]);
            this.drawChar(_y_0Array, c, (float)d, (float)d2);
            GL11.glEnd();
            if (n5 != 0) {
                this.drawLine(d, d2 + (double)(_y_0Array[c].aT / sw[83]), d + (double)_y_0Array[c].aS - 8.0, d2 + (double)(_y_0Array[c].aT / sw[84]), 1.0f);
            }
            if (n6 != 0) {
                this.drawLine(d, d2 + (double)_y_0Array[c].aT - 2.0, d + (double)_y_0Array[c].aS - 8.0, d2 + (double)_y_0Array[c].aT - 2.0, 1.0f);
            }
            d += (double)((float)_y_0Array[c].aS - f + (float)this.su);
        }
        GL11.glHint((int)sw[85], (int)sw[86]);
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        return (float)d / 2.0f;
    }

    public float drawSmoothString(String string, double d, double d2, int n, boolean bl) {
        d -= 1.0;
        if (string == null) {
            return 0.0f;
        }
        _y_0[] _y_0Array = this.sp;
        float f = (float)(n >> sw[87] & sw[88]) / 255.0f;
        int n2 = sw[89];
        int n3 = sw[90];
        int n4 = sw[91];
        int n5 = sw[92];
        int n6 = sw[93];
        int n7 = sw[94];
        d *= 2.0;
        d2 = (d2 - 3.0) * 2.0;
        GL11.glPushMatrix();
        GlStateManager.scale((double)0.5, (double)0.5, (double)0.5);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc((int)sw[95], (int)sw[96]);
        GlStateManager.color((float)((float)(n >> sw[97] & sw[98]) / 255.0f), (float)((float)(n >> sw[99] & sw[100]) / 255.0f), (float)((float)(n & sw[101]) / 255.0f), (float)f);
        GlStateManager.enableTexture2D();
        GlStateManager.bindTexture((int)this.sv.getGlTextureId());
        GL11.glBindTexture((int)sw[102], (int)this.sv.getGlTextureId());
        GL11.glTexParameteri((int)sw[103], (int)sw[104], (int)sw[105]);
        GL11.glTexParameteri((int)sw[106], (int)sw[107], (int)sw[108]);
        for (int i = sw[109]; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c == sw[110]) {
                int n8 = sw[111];
                try {
                    n8 = bt[sw[112]].indexOf(string.charAt(i + sw[113]));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                if (n8 < sw[114]) {
                    n3 = sw[115];
                    n4 = sw[116];
                    n2 = sw[117];
                    n6 = sw[118];
                    n5 = sw[119];
                    GlStateManager.bindTexture((int)this.sv.getGlTextureId());
                    _y_0Array = this.sp;
                    if (n8 < 0) {
                        n8 = sw[120];
                    }
                    if (bl) {
                        n8 += 16;
                    }
                    int n9 = this.bo[n8];
                    GlStateManager.color((float)((float)(n9 >> sw[121] & sw[122]) / 255.0f), (float)((float)(n9 >> sw[123] & sw[124]) / 255.0f), (float)((float)(n9 & sw[125]) / 255.0f), (float)f);
                } else if (n8 == sw[126]) {
                    n2 = sw[127];
                } else if (n8 == sw[128]) {
                    n3 = sw[129];
                    if (n4 != 0) {
                        GlStateManager.bindTexture((int)this.bs.getGlTextureId());
                        _y_0Array = this.bn;
                    } else {
                        GlStateManager.bindTexture((int)this.bq.getGlTextureId());
                        _y_0Array = this.bl;
                    }
                } else if (n8 == sw[130]) {
                    n5 = sw[131];
                } else if (n8 == sw[132]) {
                    n6 = sw[133];
                } else if (n8 == sw[134]) {
                    n4 = sw[135];
                    if (n3 != 0) {
                        GlStateManager.bindTexture((int)this.bs.getGlTextureId());
                        _y_0Array = this.bn;
                    } else {
                        GlStateManager.bindTexture((int)this.br.getGlTextureId());
                        _y_0Array = this.bm;
                    }
                } else {
                    n3 = sw[136];
                    n4 = sw[137];
                    n2 = sw[138];
                    n6 = sw[139];
                    n5 = sw[140];
                    GlStateManager.color((float)((float)(n >> sw[141] & sw[142]) / 255.0f), (float)((float)(n >> sw[143] & sw[144]) / 255.0f), (float)((float)(n & sw[145]) / 255.0f), (float)f);
                    GlStateManager.bindTexture((int)this.sv.getGlTextureId());
                    _y_0Array = this.sp;
                }
                ++i;
                continue;
            }
            if (c >= _y_0Array.length) continue;
            GL11.glBegin((int)sw[146]);
            this.drawChar(_y_0Array, c, (float)d, (float)d2);
            GL11.glEnd();
            if (n5 != 0) {
                this.drawLine(d, d2 + (double)(_y_0Array[c].aT / sw[147]), d + (double)_y_0Array[c].aS - 8.0, d2 + (double)(_y_0Array[c].aT / sw[148]), 1.0f);
            }
            if (n6 != 0) {
                this.drawLine(d, d2 + (double)_y_0Array[c].aT - 2.0, d + (double)_y_0Array[c].aS - 8.0, d2 + (double)_y_0Array[c].aT - 2.0, 1.0f);
            }
            d += (double)((float)_y_0Array[c].aS - 8.3f + (float)this.su);
        }
        GL11.glHint((int)sw[149], (int)sw[150]);
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        return (float)d / 2.0f;
    }

    public String trimStringToWidthPassword(String string, int n, boolean bl) {
        string = string.replaceAll(bt[sw[281]], bt[sw[282]]);
        return this.trimStringToWidth(string, n, bl);
    }

    public int drawStringWithShadow(String string, double d, float f, int n) {
        float f2 = this.drawString(string, d + _i_0.G.getDoubleValue(), (double)f + _i_0.G.getDoubleValue(), n, sw[5], 8.3f);
        return (int)Math.max(f2, this.drawString(string, d, f, n, sw[6], 8.3f));
    }

    public float drawNoBSCenteredString(String string, float f, float f2, int n) {
        return this.drawNoBSString(string, f - (float)(this.getStringWidth(string) / sw[20]), f2, n);
    }

    public int drawSmoothString(String string, double d, float f, int n) {
        return (int)this.drawSmoothString(string, d, f, n, sw[16]);
    }

    @Override
    public void setAntiAlias(boolean bl) {
        super.setAntiAlias(bl);
        this.setupBoldItalicIDs();
    }

    public List<String> wrapWords(String string, double d) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if ((double)this.getStringWidth(string) > d) {
            String[] stringArray = string.split(bt[sw[238]]);
            StringBuilder stringBuilder = new StringBuilder();
            char c = sw[239];
            String[] stringArray2 = stringArray;
            int n = stringArray2.length;
            for (int i = sw[240]; i < n; ++i) {
                String string2 = stringArray2[i];
                for (int j = sw[241]; j < string2.toCharArray().length; ++j) {
                    char c2 = string2.toCharArray()[j];
                    if (c2 != sw[242] || j >= string2.toCharArray().length - sw[243]) continue;
                    c = string2.toCharArray()[j + sw[244]];
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                if ((double)this.getStringWidth(stringBuilder2.append((Object)stringBuilder).append(string2).append(bt[sw[245]]).toString()) < d) {
                    stringBuilder.append(string2).append(bt[sw[246]]);
                    continue;
                }
                arrayList.add(stringBuilder.toString());
                stringBuilder = new StringBuilder(bt[sw[247]] + c + string2 + bt[sw[248]]);
            }
            if (stringBuilder.length() > 0) {
                if ((double)this.getStringWidth(stringBuilder.toString()) < d) {
                    arrayList.add(bt[sw[249]] + c + stringBuilder + bt[sw[250]]);
                    stringBuilder = new StringBuilder();
                } else {
                    arrayList.addAll(this.formatString(stringBuilder.toString(), d));
                }
            }
        } else {
            arrayList.add(string);
        }
        return arrayList;
    }

    public void drawLine(double d, double d2, double d3, double d4, float f) {
        GL11.glDisable((int)sw[235]);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)sw[236]);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glEnd();
        GL11.glEnable((int)sw[237]);
    }

    public void setupMinecraftColorcodes() {
        for (int i = sw[257]; i < sw[258]; ++i) {
            int n = (i >> sw[259] & sw[260]) * sw[261];
            int n2 = (i >> sw[262] & sw[263]) * sw[264] + n;
            int n3 = (i >> sw[265] & sw[266]) * sw[267] + n;
            int n4 = (i & sw[268]) * sw[269] + n;
            if (i == sw[270]) {
                n2 += 85;
            }
            if (i >= sw[271]) {
                n2 /= sw[272];
                n3 /= sw[273];
                n4 /= sw[274];
            }
            this.bo[i] = (n2 & sw[275]) << sw[276] | (n3 & sw[277]) << sw[278] | n4 & sw[279];
        }
    }

    public String trimStringToWidth(String string, int n) {
        return this.trimStringToWidth(string, n, sw[280]);
    }

    public List<String> formatString(String string, double d) {
        ArrayList<String> arrayList = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();
        char c = sw[251];
        char[] cArray = string.toCharArray();
        for (int i = sw[252]; i < cArray.length; ++i) {
            char c2 = cArray[i];
            if (c2 == sw[253] && i < cArray.length - sw[254]) {
                c = cArray[i + sw[255]];
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            if ((double)this.getStringWidth(stringBuilder2.append(stringBuilder.toString()).append(c2).toString()) < d) {
                stringBuilder.append(c2);
                continue;
            }
            arrayList.add(stringBuilder.toString());
            stringBuilder = new StringBuilder(bt[sw[256]] + c + c2);
        }
        if (stringBuilder.length() > 0) {
            arrayList.add(stringBuilder.toString());
        }
        return arrayList;
    }

    @Override
    public void setFractionalMetrics(boolean bl) {
        super.setFractionalMetrics(bl);
        this.setupBoldItalicIDs();
    }
}

