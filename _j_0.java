//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _j
 */
public class _j_0 {
    public static final Minecraft K;
    public static final int[] M;
    public static final FontRenderer L;

    public static void drawRoundedGradientRectCorner(float f, float f2, float f3, float f4, float f5, int n, int n2, int n3, int n4) {
        int n5;
        GL11.glEnable((int)M[139]);
        GL11.glDisable((int)M[140]);
        GL11.glBlendFunc((int)M[141], (int)M[142]);
        GL11.glEnable((int)M[143]);
        GL11.glShadeModel((int)M[144]);
        GL11.glPushAttrib((int)M[145]);
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        f = (float)((double)f * 2.0);
        f2 = (float)((double)f2 * 2.0);
        f3 = (float)((double)f3 * 2.0);
        f4 = (float)((double)f4 * 2.0);
        GL11.glEnable((int)M[146]);
        GL11.glDisable((int)M[147]);
        _j_0.setColor(n);
        GL11.glEnable((int)M[148]);
        GL11.glShadeModel((int)M[149]);
        GL11.glBegin((int)M[150]);
        for (n5 = M[151]; n5 <= M[152]; n5 += 3) {
            _j_0.setColor(n);
        }
        GL11.glVertex2d((double)((double)(f + f5) + Math.sin((double)n5 * Math.PI / 180.0) * (double)f5 * -1.0), (double)((double)(f2 + f5) + Math.cos((double)n5 * Math.PI / 180.0) * (double)f5 * -1.0));
        for (n5 = M[153]; n5 <= M[154]; n5 += 3) {
            _j_0.setColor(n2);
        }
        GL11.glVertex2d((double)((double)(f + f5) + Math.sin((double)n5 * Math.PI / 180.0) * (double)f5 * -1.0), (double)((double)(f4 - f5) + Math.cos((double)n5 * Math.PI / 180.0) * (double)f5 * -1.0));
        for (n5 = M[155]; n5 <= M[156]; n5 += 3) {
            _j_0.setColor(n3);
        }
        GL11.glVertex2d((double)((double)(f3 - f5) + Math.sin((double)n5 * Math.PI / 180.0) * (double)f5), (double)((double)(f4 - f5) + Math.cos((double)n5 * Math.PI / 180.0) * (double)f5));
        for (n5 = M[157]; n5 <= M[158]; n5 += 3) {
            _j_0.setColor(n4);
        }
        GL11.glVertex2d((double)((double)(f3 - f5) + Math.sin((double)n5 * Math.PI / 180.0) * (double)f5), (double)((double)(f2 + f5) + Math.cos((double)n5 * Math.PI / 180.0) * (double)f5));
        GL11.glEnd();
        GL11.glEnable((int)M[159]);
        GL11.glDisable((int)M[160]);
        GL11.glDisable((int)M[161]);
        GL11.glDisable((int)M[162]);
        GL11.glEnable((int)M[163]);
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        GL11.glPopAttrib();
        GL11.glEnable((int)M[164]);
        GL11.glDisable((int)M[165]);
        GL11.glDisable((int)M[166]);
        GL11.glShadeModel((int)M[167]);
    }

    public static void disableGL2D() {
        GL11.glEnable((int)M[11]);
        GL11.glDisable((int)M[12]);
        GL11.glEnable((int)M[13]);
        GL11.glDisable((int)M[14]);
        GL11.glHint((int)M[15], (int)M[16]);
        GL11.glHint((int)M[17], (int)M[18]);
    }

    public static void drawRoundedOutline(float f, float f2, float f3, float f4, float f5, float f6, int n) {
        int n2;
        GL11.glPushAttrib((int)M[68]);
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        f = (float)((double)f * 2.0);
        f2 = (float)((double)f2 * 2.0);
        f3 = (float)((double)f3 * 2.0);
        f4 = (float)((double)f4 * 2.0);
        GL11.glEnable((int)M[69]);
        GL11.glDisable((int)M[70]);
        _j_0.setColor(n);
        GL11.glEnable((int)M[71]);
        GL11.glLineWidth((float)f6);
        GL11.glBegin((int)M[72]);
        for (n2 = M[73]; n2 <= M[74]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f + f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0), (double)((double)(f2 + f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0));
        }
        for (n2 = M[75]; n2 <= M[76]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f + f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0), (double)((double)(f4 - f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0));
        }
        for (n2 = M[77]; n2 <= M[78]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f3 - f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5), (double)((double)(f4 - f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5));
        }
        for (n2 = M[79]; n2 <= M[80]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f3 - f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5), (double)((double)(f2 + f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5));
        }
        GL11.glEnd();
        GL11.glEnable((int)M[81]);
        GL11.glDisable((int)M[82]);
        GL11.glDisable((int)M[83]);
        GL11.glDisable((int)M[84]);
        GL11.glEnable((int)M[85]);
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        GL11.glPopAttrib();
    }

    public static void drawSelectRoundedRect(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n) {
        int n2;
        GL11.glPushAttrib((int)M[96]);
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        f = (float)((double)f * 2.0);
        f2 = (float)((double)f2 * 2.0);
        f3 = (float)((double)f3 * 2.0);
        f4 = (float)((double)f4 * 2.0);
        GL11.glEnable((int)M[97]);
        GL11.glDisable((int)M[98]);
        _j_0.setColor(n);
        GL11.glEnable((int)M[99]);
        GL11.glBegin((int)M[100]);
        for (n2 = M[101]; n2 <= M[102]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f + f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0), (double)((double)(f2 + f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0));
        }
        for (n2 = M[103]; n2 <= M[104]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f + f6) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f6 * -1.0), (double)((double)(f4 - f6) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f6 * -1.0));
        }
        for (n2 = M[105]; n2 <= M[106]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f3 - f7) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f7), (double)((double)(f4 - f7) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f7));
        }
        for (n2 = M[107]; n2 <= M[108]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f3 - f8) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f8), (double)((double)(f2 + f8) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f8));
        }
        GL11.glEnd();
        GL11.glEnable((int)M[109]);
        GL11.glDisable((int)M[110]);
        GL11.glDisable((int)M[111]);
        GL11.glDisable((int)M[112]);
        GL11.glEnable((int)M[113]);
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        GL11.glPopAttrib();
    }

    public static void enableGL2D() {
        GL11.glDisable((int)M[0]);
        GL11.glEnable((int)M[1]);
        GL11.glDisable((int)M[2]);
        GL11.glBlendFunc((int)M[3], (int)M[4]);
        GL11.glDepthMask((boolean)M[5]);
        GL11.glEnable((int)M[6]);
        GL11.glHint((int)M[7], (int)M[8]);
        GL11.glHint((int)M[9], (int)M[10]);
    }

    public static void drawSmoothRoundedRect(float f, float f2, float f3, float f4, float f5, int n) {
        int n2;
        GL11.glPushAttrib((int)M[19]);
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        f = (float)((double)f * 2.0);
        f2 = (float)((double)f2 * 2.0);
        f3 = (float)((double)f3 * 2.0);
        f4 = (float)((double)f4 * 2.0);
        GL11.glEnable((int)M[20]);
        GL11.glDisable((int)M[21]);
        GL11.glEnable((int)M[22]);
        _j_0.setColor(n);
        GL11.glEnable((int)M[23]);
        GL11.glBegin((int)M[24]);
        for (n2 = M[25]; n2 <= M[26]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f + f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0), (double)((double)(f2 + f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0));
        }
        for (n2 = M[27]; n2 <= M[28]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f + f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0), (double)((double)(f4 - f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0));
        }
        for (n2 = M[29]; n2 <= M[30]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f3 - f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5), (double)((double)(f4 - f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5));
        }
        for (n2 = M[31]; n2 <= M[32]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f3 - f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5), (double)((double)(f2 + f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5));
        }
        GL11.glEnd();
        GL11.glBegin((int)M[33]);
        for (n2 = M[34]; n2 <= M[35]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f + f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0), (double)((double)(f2 + f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0));
        }
        for (n2 = M[36]; n2 <= M[37]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f + f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0), (double)((double)(f4 - f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0));
        }
        for (n2 = M[38]; n2 <= M[39]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f3 - f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5), (double)((double)(f4 - f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5));
        }
        for (n2 = M[40]; n2 <= M[41]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f3 - f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5), (double)((double)(f2 + f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5));
        }
        GL11.glEnd();
        GL11.glEnable((int)M[42]);
        GL11.glDisable((int)M[43]);
        GL11.glDisable((int)M[44]);
        GL11.glDisable((int)M[45]);
        GL11.glDisable((int)M[46]);
        GL11.glEnable((int)M[47]);
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        GL11.glPopAttrib();
    }

    public static void setColor(int n) {
        float f = (float)(n >> M[132] & M[133]) / 255.0f;
        float f2 = (float)(n >> M[134] & M[135]) / 255.0f;
        float f3 = (float)(n >> M[136] & M[137]) / 255.0f;
        float f4 = (float)(n & M[138]) / 255.0f;
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
    }

    public static void drawRectOutline(float f, float f2, float f3, float f4, float f5, float f6, int n) {
        GL11.glPushAttrib((int)M[86]);
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        f = (float)((double)f * 2.0);
        f2 = (float)((double)f2 * 2.0);
        f3 = (float)((double)f3 * 2.0);
        f4 = (float)((double)f4 * 2.0);
        GL11.glEnable((int)M[87]);
        GL11.glDisable((int)M[88]);
        _j_0.setColor(n);
        GL11.glEnable((int)M[89]);
        GL11.glLineWidth((float)f6);
        GL11.glBegin((int)M[90]);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glEnd();
        GL11.glEnable((int)M[91]);
        GL11.glDisable((int)M[92]);
        GL11.glDisable((int)M[93]);
        GL11.glDisable((int)M[94]);
        GL11.glEnable((int)M[95]);
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        GL11.glPopAttrib();
    }

    public static void drawSelectRoundedOutline(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n) {
        int n2;
        GL11.glPushAttrib((int)M[114]);
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        f = (float)((double)f * 2.0);
        f2 = (float)((double)f2 * 2.0);
        f3 = (float)((double)f3 * 2.0);
        f4 = (float)((double)f4 * 2.0);
        GL11.glEnable((int)M[115]);
        GL11.glDisable((int)M[116]);
        _j_0.setColor(n);
        GL11.glEnable((int)M[117]);
        GL11.glLineWidth((float)f9);
        GL11.glBegin((int)M[118]);
        for (n2 = M[119]; n2 <= M[120]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f + f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0), (double)((double)(f2 + f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0));
        }
        for (n2 = M[121]; n2 <= M[122]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f + f6) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f6 * -1.0), (double)((double)(f4 - f6) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f6 * -1.0));
        }
        for (n2 = M[123]; n2 <= M[124]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f3 - f7) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f7), (double)((double)(f4 - f7) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f7));
        }
        for (n2 = M[125]; n2 <= M[126]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f3 - f8) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f8), (double)((double)(f2 + f8) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f8));
        }
        GL11.glEnd();
        GL11.glEnable((int)M[127]);
        GL11.glDisable((int)M[128]);
        GL11.glDisable((int)M[129]);
        GL11.glDisable((int)M[130]);
        GL11.glEnable((int)M[131]);
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        GL11.glPopAttrib();
    }

    static {
        M = new int[]{2929, 3042, 3553, 770, 771, 1, 2848, 3154, 4354, 3155, 4354, 3553, 3042, 2929, 2848, 3154, 4352, 3155, 4352, 0, 3042, 3553, 2848, 2848, 9, 0, 90, 90, 180, 0, 90, 90, 180, 2, 0, 90, 90, 180, 0, 90, 90, 180, 3553, 3042, 2848, 3042, 2848, 3553, 0, 3042, 3553, 2848, 2848, 9, 0, 90, 90, 180, 0, 90, 90, 180, 3553, 3042, 2848, 3042, 2848, 3553, 0, 3042, 3553, 2848, 2, 0, 90, 90, 180, 0, 90, 90, 180, 3553, 3042, 2848, 3042, 3553, 0, 3042, 3553, 2848, 2, 3553, 3042, 2848, 3042, 3553, 0, 3042, 3553, 2848, 9, 0, 90, 90, 180, 0, 90, 90, 180, 3553, 3042, 2848, 3042, 3553, 0, 3042, 3553, 2848, 2, 0, 90, 90, 180, 0, 90, 90, 180, 3553, 3042, 2848, 3042, 3553, 24, 255, 16, 255, 8, 255, 255, 3042, 3553, 770, 771, 2848, 7425, 0, 3042, 3553, 2848, 7425, 9, 0, 90, 90, 180, 0, 90, 90, 180, 3553, 3042, 2848, 3042, 3553, 3553, 3042, 2848, 7424};
        K = Minecraft.getMinecraft();
        L = _j_0.K.fontRenderer;
    }

    public static void drawRoundedRect(float f, float f2, float f3, float f4, float f5, int n) {
        int n2;
        GL11.glPushAttrib((int)M[48]);
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        f = (float)((double)f * 2.0);
        f2 = (float)((double)f2 * 2.0);
        f3 = (float)((double)f3 * 2.0);
        f4 = (float)((double)f4 * 2.0);
        GL11.glEnable((int)M[49]);
        GL11.glDisable((int)M[50]);
        GL11.glEnable((int)M[51]);
        _j_0.setColor(n);
        GL11.glEnable((int)M[52]);
        GL11.glBegin((int)M[53]);
        for (n2 = M[54]; n2 <= M[55]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f + f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0), (double)((double)(f2 + f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0));
        }
        for (n2 = M[56]; n2 <= M[57]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f + f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0), (double)((double)(f4 - f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5 * -1.0));
        }
        for (n2 = M[58]; n2 <= M[59]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f3 - f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5), (double)((double)(f4 - f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5));
        }
        for (n2 = M[60]; n2 <= M[61]; n2 += 3) {
            GL11.glVertex2d((double)((double)(f3 - f5) + Math.sin((double)n2 * Math.PI / 180.0) * (double)f5), (double)((double)(f2 + f5) + Math.cos((double)n2 * Math.PI / 180.0) * (double)f5));
        }
        GL11.glEnd();
        GL11.glEnable((int)M[62]);
        GL11.glDisable((int)M[63]);
        GL11.glDisable((int)M[64]);
        GL11.glDisable((int)M[65]);
        GL11.glDisable((int)M[66]);
        GL11.glEnable((int)M[67]);
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        GL11.glPopAttrib();
    }
}

