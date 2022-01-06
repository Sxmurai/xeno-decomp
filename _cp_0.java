//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.audio.ISound
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.Tessellator
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _cp
 */
public class _cp_0
implements _cf_0 {
    public static final BufferBuilder qc;
    public static Minecraft qb;
    public static final int[] qf;
    public static final Tessellator qd;
    public static final String[] qe;
    public static boolean qa;

    public static void clickSound() {
        qb.getSoundHandler().playSound((ISound)new _av_0());
    }

    public static Color getSinState(Color color, double d, int n, _ad_0 _ad_02) {
        double d2 = Math.sin(2400.0 - (double)System.currentTimeMillis() / d) * Math.sin(2400.0 - (double)System.currentTimeMillis() / d);
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        Color color2 = null;
        switch (_au_0.fQ[_ad_02.ordinal()]) {
            case 1: {
                d2 /= (double)fArray[qf[59]];
                d2 = Math.min(1.0, d2);
                color2 = Color.getHSBColor((float)d2, 1.0f, 1.0f);
                break;
            }
            case 2: {
                d2 /= (double)fArray[qf[60]];
                d2 = Math.min(1.0, d2);
                color2 = Color.getHSBColor(fArray[qf[61]], (float)d2, 1.0f);
                break;
            }
            case 3: {
                d2 /= (double)fArray[qf[62]];
                d2 = Math.min(1.0, d2);
                color2 = Color.getHSBColor(fArray[qf[63]], 1.0f, (float)d2);
                break;
            }
            case 4: {
                d2 /= (double)fArray[qf[64]];
                d2 = Math.min(1.0, d2);
                color2 = Color.getHSBColor(fArray[qf[65]], 1.0f, (float)d2);
            }
        }
        return new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), n);
    }

    public static int rainbowWave(float f, float f2, float f3, int n) {
        float f4 = (float)((System.currentTimeMillis() + (long)n) % (long)((int)(f * 1000.0f))) / (f * 1000.0f);
        int n2 = Color.HSBtoRGB(f4, f2, f3);
        return n2;
    }

    public static int rainbowVibrant(int n) {
        double d = Math.ceil((double)(System.currentTimeMillis() + (long)n) / 20.0);
        return Color.getHSBColor((float)((d %= 360.0) / 360.0), 1.0f, 1.0f).getRGB();
    }

    public static int getDisplayHeight() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int n = (int)dimension.getHeight() / qf[69];
        return n;
    }

    public static void drawBorderedRect(double d, double d2, double d3, double d4, double d5, int n, int n2) {
        _ah_0.drawRect(d, d2, d + d3, d2 + d4, n2);
        _ah_0.drawRect(d, d2, d + d3, d2 + d5, n);
        _ah_0.drawRect(d, d2, d + d5, d2 + d4, n);
        _ah_0.drawRect(d + d3, d2, d + d3 - d5, d2 + d4, n);
        _ah_0.drawRect(d, d2 + d4, d + d3, d2 + d4 - d5, n);
    }

    static {
        qf = new int[]{2, 70, 0, 70, 15, 1, 2, 1, 0, 2, 2, -1, 2, 0, 70, 15, 1, 1, 2, 1, 2, 2, -1, 5, 2, 70, 0, 70, 15, 2, 0, 70, 15, 1, 0, 100, 100, 100, 100, 100, 100, 0xFF0000, 16, 100, 100, 65280, 8, 100, 100, 255, 100, 100, 16, 255, 8, 255, 255, 24, 255, 0, 1, 0, 2, 0, 1, 0, 0, 0, 2, 2, 2, 0, 1, 1};
        String[] stringArray = new String[qf[70]];
        stringArray[_cp_0.qf[71]] = "ClickGUI";
        stringArray[_cp_0.qf[72]] = "HUD";
        qe = stringArray;
        qa = qf[73];
        qb = Minecraft.getMinecraft();
        qc = Tessellator.getInstance().getBuffer();
        qd = Tessellator.getInstance();
    }

    public static final void scissor(double d, double d2, double d3, double d4) {
        ScaledResolution scaledResolution = new ScaledResolution(qb);
        double d5 = scaledResolution.getScaleFactor();
        d2 = (double)scaledResolution.getScaledHeight() - d2;
        GL11.glScissor((int)((int)(d *= d5)), (int)((int)((d2 *= d5) - (d4 *= d5))), (int)((int)(d3 *= d5)), (int)((int)d4));
    }

    public static int rainbow(int n) {
        double d = Math.ceil((double)(System.currentTimeMillis() + (long)n) / 20.0);
        return Color.getHSBColor((float)((d %= 360.0) / 360.0), 0.5f, 1.0f).getRGB();
    }

    public static boolean mouseOver(double d, double d2, double d3, double d4, int n, int n2) {
        return ((double)n >= d && (double)n2 >= d2 && (double)n <= d3 && (double)n2 <= d4 ? qf[33] : qf[34]) != 0;
    }

    public static void renderButtons(int n, int n2) {
        ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft());
        int n3 = scaledResolution.getScaledWidth() / qf[0] - qf[1];
        int n4 = qf[2];
        int n5 = qf[3];
        int n6 = qf[4];
        _ah_0.drawRoundedRect(n3, n4, n5, n6, qf[5], qf[6], qf[7], 1.0, _cp_0.mouseOver(n3, n4, n3 + n5, n4 + n6, n, n2) ? _ck_0.pz : Color.DARK_GRAY.darker().getRGB());
        _h_0.drawCenteredString(qe[qf[8]], n3 + n5 / qf[9], n4 + qf[10], qf[11]);
        int n7 = scaledResolution.getScaledWidth() / qf[12];
        int n8 = qf[13];
        int n9 = qf[14];
        int n10 = qf[15];
        _ah_0.drawRoundedRect(n7, n8, n9, n10, qf[16], qf[17], qf[18], 1.0, _cp_0.mouseOver(n7, n8, n7 + n9, n8 + n10, n, n2) ? _ck_0.pz : Color.DARK_GRAY.darker().getRGB());
        _h_0.drawCenteredString(qe[qf[19]], n7 + n5 / qf[20], n8 + qf[21], qf[22]);
        _ah_0.drawRoundedOutline(n3, (double)n4 - 5.0, n5 + n9, n6 + qf[23], 2.0, 2.0, _ck_0.pz);
    }

    public static Color releasedDynamicRainbow(int n, int n2) {
        double d = Math.ceil((double)(System.currentTimeMillis() + (long)n) / 20.0);
        Color color = Color.getHSBColor((float)((d %= 360.0) / 360.0), 1.0f, 1.0f);
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), n2);
    }

    public static Color shadeColour(Color color, int n) {
        int n2 = color.getRed() * (qf[35] + n) / qf[36];
        int n3 = color.getGreen() * (qf[37] + n) / qf[38];
        int n4 = color.getBlue() * (qf[39] + n) / qf[40];
        return new Color(n2, n3, n4);
    }

    public static void hexColor(int n) {
        float f = (float)(n >> qf[52] & qf[53]) / 255.0f;
        float f2 = (float)(n >> qf[54] & qf[55]) / 255.0f;
        float f3 = (float)(n & qf[56]) / 255.0f;
        float f4 = (float)(n >> qf[57] & qf[58]) / 255.0f;
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
    }

    public static int getDisplayWidth() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int n = (int)dimension.getWidth() / qf[68];
        return n;
    }

    public static int shadeColour(int n, int n2) {
        int n3 = ((n & qf[41]) >> qf[42]) * (qf[43] + n2) / qf[44];
        int n4 = ((n & qf[45]) >> qf[46]) * (qf[47] + n2) / qf[48];
        int n5 = (n & qf[49]) * (qf[50] + n2) / qf[51];
        return new Color(n3, n4, n5).hashCode();
    }

    public static Color getSinState(Color color, Color color2, double d, int n) {
        double d2 = Math.sin(2400.0 - (double)System.currentTimeMillis() / d) * Math.sin(2400.0 - (double)System.currentTimeMillis() / d);
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        float[] fArray2 = Color.RGBtoHSB(color2.getRed(), color2.getGreen(), color2.getBlue(), null);
        d2 /= (double)fArray[qf[66]];
        d2 *= d2 / (double)fArray2[qf[67]];
        d2 = Math.min(1.0, d2);
        Color color3 = Color.getHSBColor((float)d2, 1.0f, 1.0f);
        return new Color(color3.getRed(), color3.getGreen(), color3.getBlue(), n);
    }

    public static void handleButtons(int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft());
        int n10 = scaledResolution.getScaledWidth() / qf[24] - qf[25];
        if (_cp_0.mouseOver(n10, n9 = qf[26], n10 + (n8 = qf[27]), n9 + (n7 = qf[28]), n, n2)) {
            qb.displayGuiScreen((GuiScreen)_as_0.fC);
            if (_aB.gF.N) {
                _cp_0.clickSound();
            }
        }
        if (_cp_0.mouseOver(n6 = scaledResolution.getScaledWidth() / qf[29], n5 = qf[30], n6 + (n4 = qf[31]), n5 + (n3 = qf[32]), n, n2)) {
            qb.displayGuiScreen((GuiScreen)new _bI());
            if (_aB.gF.N) {
                _cp_0.clickSound();
            }
        }
    }
}

