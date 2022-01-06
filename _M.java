/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class _M {
    public static final int[] bJ = new int[]{100, 100, 100, 100, 100, 100, 0xFF0000, 16, 100, 100, 65280, 8, 100, 100, 255, 100, 100, 16, 255, 8, 255, 255, 24, 255, 0, 1, 0, 2, 0, 1, 0, 0, 0};

    public static Color getSinState(Color color, Color color2, double d, int n) {
        double d2 = Math.sin(2400.0 - (double)System.currentTimeMillis() / d) * Math.sin(2400.0 - (double)System.currentTimeMillis() / d);
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        float[] fArray2 = Color.RGBtoHSB(color2.getRed(), color2.getGreen(), color2.getBlue(), null);
        d2 /= (double)fArray[bJ[31]];
        d2 *= d2 / (double)fArray2[bJ[32]];
        d2 = Math.min(1.0, d2);
        Color color3 = Color.getHSBColor((float)d2, 1.0f, 1.0f);
        return new Color(color3.getRed(), color3.getGreen(), color3.getBlue(), n);
    }

    public static Color shadeColour(Color color, int n) {
        int n2 = color.getRed() * (bJ[0] + n) / bJ[1];
        int n3 = color.getGreen() * (bJ[2] + n) / bJ[3];
        int n4 = color.getBlue() * (bJ[4] + n) / bJ[5];
        return new Color(n2, n3, n4);
    }

    public static void hexColor(int n) {
        float f = (float)(n >> bJ[17] & bJ[18]) / 255.0f;
        float f2 = (float)(n >> bJ[19] & bJ[20]) / 255.0f;
        float f3 = (float)(n & bJ[21]) / 255.0f;
        float f4 = (float)(n >> bJ[22] & bJ[23]) / 255.0f;
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
    }

    public static Color releasedDynamicRainbow(int n, int n2) {
        double d = Math.ceil((double)(System.currentTimeMillis() + (long)n) / 20.0);
        Color color = Color.getHSBColor((float)((d %= 360.0) / 360.0), 1.0f, 1.0f);
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), n2);
    }

    public static int rainbow(int n) {
        double d = Math.ceil((double)(System.currentTimeMillis() + (long)n) / 20.0);
        return Color.getHSBColor((float)((d %= 360.0) / 360.0), 0.5f, 1.0f).getRGB();
    }

    public static int rainbowVibrant(int n) {
        double d = Math.ceil((double)(System.currentTimeMillis() + (long)n) / 20.0);
        return Color.getHSBColor((float)((d %= 360.0) / 360.0), 1.0f, 1.0f).getRGB();
    }

    public static int rainbowWave(float f, float f2, float f3, int n) {
        float f4 = (float)((System.currentTimeMillis() + (long)n) % (long)((int)(f * 1000.0f))) / (f * 1000.0f);
        int n2 = Color.HSBtoRGB(f4, f2, f3);
        return n2;
    }

    public static Color getSinState(Color color, double d, int n, _aF _aF2) {
        double d2 = Math.sin(2400.0 - (double)System.currentTimeMillis() / d) * Math.sin(2400.0 - (double)System.currentTimeMillis() / d);
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        Color color2 = null;
        switch (_aZ.jc[_aF2.ordinal()]) {
            case 1: {
                d2 /= (double)fArray[bJ[24]];
                d2 = Math.min(1.0, d2);
                color2 = Color.getHSBColor((float)d2, 1.0f, 1.0f);
                break;
            }
            case 2: {
                d2 /= (double)fArray[bJ[25]];
                d2 = Math.min(1.0, d2);
                color2 = Color.getHSBColor(fArray[bJ[26]], (float)d2, 1.0f);
                break;
            }
            case 3: {
                d2 /= (double)fArray[bJ[27]];
                d2 = Math.min(1.0, d2);
                color2 = Color.getHSBColor(fArray[bJ[28]], 1.0f, (float)d2);
                break;
            }
            case 4: {
                d2 /= (double)fArray[bJ[29]];
                d2 = Math.min(1.0, d2);
                color2 = Color.getHSBColor(fArray[bJ[30]], 1.0f, (float)d2);
            }
        }
        return new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), n);
    }

    public static int shadeColour(int n, int n2) {
        int n3 = ((n & bJ[6]) >> bJ[7]) * (bJ[8] + n2) / bJ[9];
        int n4 = ((n & bJ[10]) >> bJ[11]) * (bJ[12] + n2) / bJ[13];
        int n5 = (n & bJ[14]) * (bJ[15] + n2) / bJ[16];
        return new Color(n3, n4, n5).hashCode();
    }
}

