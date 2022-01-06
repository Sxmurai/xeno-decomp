//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.item.ItemStack
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Point;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _ah
 */
public class _ah_0
implements _cf_0 {
    public static final Tessellator dW;
    public static final BufferBuilder dV;
    public static final int[] pd;

    static {
        pd = new int[]{3042, 3553, 770, 771, 7425, 9, 16, 255, 8, 255, 255, 24, 255, 16, 255, 8, 255, 255, 24, 255, 7424, 3553, 3042, 0, 3042, 3553, 770, 771, 7425, 9, 16, 255, 8, 255, 255, 24, 255, 16, 255, 8, 255, 255, 24, 255, 7424, 3553, 3042, 0, 7425, 7, 24, 255, 16, 255, 8, 255, 24, 255, 16, 255, 8, 255, 255, 24, 255, 16, 255, 8, 255, 255, 24, 255, 24, 255, 16, 255, 8, 255, 24, 255, 7424, 7425, 7, 24, 255, 16, 255, 8, 255, 24, 255, 16, 255, 8, 255, 255, 24, 255, 16, 255, 8, 255, 255, 24, 255, 24, 255, 16, 255, 8, 255, 24, 255, 7424, 770, 771, 1, 0, 24, 255, 16, 255, 8, 255, 255, 0, 3553, 2848, 9, 0, 90, 90, 180, 0, 90, 90, 180, 3553, 2848, 3553, 770, 771, 1, 0, 24, 255, 16, 255, 8, 255, 255, 0, 3553, 2848, 9, 0, 90, -1, -1, 90, 180, -1, -1, 0, 90, 90, 180, 3553, 2848, 3553, 770, 771, 1, 0, 24, 255, 16, 255, 8, 255, 255, 0, 3553, 2848, 2, 0, 90, 90, 180, 0, 90, 90, 180, 3553, 2848, 3553, 770, 771, 1, 0, 24, 255, 16, 255, 8, 255, 255, 0, 3553, 2848, 2, 0, 90, 90, 180, 0, 90, 90, 180, 3553, 2848, 3553, -20, -20, 24, 255, 16, 255, 8, 255, 255, 24, 255, 16, 255, 8, 255, 255, 7425, 7, 7424, -20, -20, 24, 255, 16, 255, 8, 255, 255, 24, 255, 16, 255, 8, 255, 255, 7425, 7, 7424, 1, 524288, 3089, 256, 0, -20, -20, 3042, 3553, 770, 771, 7425, 9, 3008, 9, 3008, 7424, 3553, 3042, 3042, 3008, 16, 255, 8, 255, 255, 24, 255, 7, 3042, 3008, 24, 255, 16, 255, 8, 255, 255, 770, 771, 1, 0, 7, 7};
        dV = Tessellator.getInstance().getBuffer();
        dW = Tessellator.getInstance();
    }

    public static void gradient(double d, double d2, double d3, double d4, int n, int n2, boolean bl) {
        float f = (float)d;
        float f2 = (float)d2;
        float f3 = (float)d3;
        float f4 = (float)d4;
        if (bl) {
            GL11.glEnable((int)pd[24]);
            GL11.glDisable((int)pd[25]);
            GL11.glBlendFunc((int)pd[26], (int)pd[27]);
            GL11.glShadeModel((int)pd[28]);
            GL11.glBegin((int)pd[29]);
            GL11.glColor4f((float)((float)(n >> pd[30] & pd[31]) / 255.0f), (float)((float)(n >> pd[32] & pd[33]) / 255.0f), (float)((float)(n & pd[34]) / 255.0f), (float)((float)(n >> pd[35] & pd[36]) / 255.0f));
            GL11.glVertex2f((float)f, (float)f2);
            GL11.glVertex2f((float)f, (float)f4);
            GL11.glColor4f((float)((float)(n2 >> pd[37] & pd[38]) / 255.0f), (float)((float)(n2 >> pd[39] & pd[40]) / 255.0f), (float)((float)(n2 & pd[41]) / 255.0f), (float)((float)(n2 >> pd[42] & pd[43]) / 255.0f));
            GL11.glVertex2f((float)f3, (float)f4);
            GL11.glVertex2f((float)f3, (float)f2);
            GL11.glEnd();
            GL11.glShadeModel((int)pd[44]);
            GL11.glEnable((int)pd[45]);
            GL11.glDisable((int)pd[46]);
        } else {
            _ah_0.drawGradientRect(f, f2, f3, f4, n, n2, pd[47]);
        }
    }

    public static void drawRect(double d, double d2, double d3, double d4, int n) {
        double d5;
        if (d < d3) {
            d5 = d;
            d = d3;
            d3 = d5;
        }
        if (d2 < d4) {
            d5 = d2;
            d2 = d4;
            d4 = d5;
        }
        float f = (float)(n >> pd[291] & pd[292]) / 255.0f;
        float f2 = (float)(n >> pd[293] & pd[294]) / 255.0f;
        float f3 = (float)(n >> pd[295] & pd[296]) / 255.0f;
        float f4 = (float)(n & pd[297]) / 255.0f;
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((int)pd[298], (int)pd[299], (int)pd[300], (int)pd[301]);
        GlStateManager.color((float)f2, (float)f3, (float)f4, (float)f);
        bufferBuilder.begin(pd[302], DefaultVertexFormats.POSITION);
        bufferBuilder.pos(d, d4, 0.0).endVertex();
        bufferBuilder.pos(d3, d4, 0.0).endVertex();
        bufferBuilder.pos(d3, d2, 0.0).endVertex();
        bufferBuilder.pos(d, d2, 0.0).endVertex();
        tessellator.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }

    public static void gradient(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        if (bl) {
            GL11.glEnable((int)pd[0]);
            GL11.glDisable((int)pd[1]);
            GL11.glBlendFunc((int)pd[2], (int)pd[3]);
            GL11.glShadeModel((int)pd[4]);
            GL11.glBegin((int)pd[5]);
            GL11.glColor4f((float)((float)(n5 >> pd[6] & pd[7]) / 255.0f), (float)((float)(n5 >> pd[8] & pd[9]) / 255.0f), (float)((float)(n5 & pd[10]) / 255.0f), (float)((float)(n5 >> pd[11] & pd[12]) / 255.0f));
            GL11.glVertex2f((float)n, (float)n2);
            GL11.glVertex2f((float)n, (float)n4);
            GL11.glColor4f((float)((float)(n6 >> pd[13] & pd[14]) / 255.0f), (float)((float)(n6 >> pd[15] & pd[16]) / 255.0f), (float)((float)(n6 & pd[17]) / 255.0f), (float)((float)(n6 >> pd[18] & pd[19]) / 255.0f));
            GL11.glVertex2f((float)n3, (float)n4);
            GL11.glVertex2f((float)n3, (float)n2);
            GL11.glEnd();
            GL11.glShadeModel((int)pd[20]);
            GL11.glEnable((int)pd[21]);
            GL11.glDisable((int)pd[22]);
        } else {
            _ah_0.drawGradientRect(n, n2, n3, n4, n5, n6, pd[23]);
        }
    }

    public static void drawRoundedRect(double d, double d2, double d3, double d4, int n, int n2, int n3, double d5, int n4) {
        int n5;
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((int)pd[140], (int)pd[141], (int)pd[142], (int)pd[143]);
        double d6 = d + d3;
        double d7 = d2 + d4;
        float f = (float)(n4 >> pd[144] & pd[145]) / 255.0f;
        float f2 = (float)(n4 >> pd[146] & pd[147]) / 255.0f;
        float f3 = (float)(n4 >> pd[148] & pd[149]) / 255.0f;
        float f4 = (float)(n4 & pd[150]) / 255.0f;
        GL11.glPushAttrib((int)pd[151]);
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        d *= 2.0;
        d2 *= 2.0;
        d6 *= 2.0;
        d7 *= 2.0;
        GL11.glDisable((int)pd[152]);
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glEnable((int)pd[153]);
        GL11.glBegin((int)pd[154]);
        for (n5 = pd[155]; n5 <= pd[156]; n5 += 3) {
            GL11.glVertex2d((double)(d + (double)n + Math.sin((double)n5 * Math.PI / 180.0) * (double)(n * pd[157])), (double)(d2 + (double)n + Math.cos((double)n5 * Math.PI / 180.0) * (double)(n * pd[158])));
        }
        for (n5 = pd[159]; n5 <= pd[160]; n5 += 3) {
            GL11.glVertex2d((double)(d + (double)n2 + Math.sin((double)n5 * Math.PI / 180.0) * (double)(n2 * pd[161])), (double)(d7 - (double)n2 + Math.cos((double)n5 * Math.PI / 180.0) * (double)(n2 * pd[162])));
        }
        for (n5 = pd[163]; n5 <= pd[164]; n5 += 3) {
            GL11.glVertex2d((double)(d6 - (double)n3 + Math.sin((double)n5 * Math.PI / 180.0) * (double)n3), (double)(d7 - (double)n3 + Math.cos((double)n5 * Math.PI / 180.0) * (double)n3));
        }
        for (n5 = pd[165]; n5 <= pd[166]; n5 += 3) {
            GL11.glVertex2d((double)(d6 - d5 + Math.sin((double)n5 * Math.PI / 180.0) * d5), (double)(d2 + d5 + Math.cos((double)n5 * Math.PI / 180.0) * d5));
        }
        GL11.glEnd();
        GL11.glEnable((int)pd[167]);
        GL11.glDisable((int)pd[168]);
        GL11.glEnable((int)pd[169]);
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        GL11.glPopAttrib();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }

    public static void scissor(int n, int n2, int n3, int n4) {
        GL11.glScissor((int)(n * new ScaledResolution(pb).getScaleFactor()), (int)((new ScaledResolution(pb).getScaledHeight() - n4) * new ScaledResolution(pb).getScaleFactor()), (int)((n3 - n) * new ScaledResolution(pb).getScaleFactor()), (int)((n4 - n2) * new ScaledResolution(pb).getScaleFactor()));
    }

    public static void drawGradientRect(float f, float f2, float f3, float f4, int n, int n2, boolean bl) {
        if (bl) {
            n = _M.shadeColour(n, pd[222]);
            n2 = _M.shadeColour(n2, pd[223]);
        }
        float f5 = (float)(n >> pd[224] & pd[225]) / 255.0f;
        float f6 = (float)(n >> pd[226] & pd[227]) / 255.0f;
        float f7 = (float)(n >> pd[228] & pd[229]) / 255.0f;
        float f8 = (float)(n & pd[230]) / 255.0f;
        float f9 = (float)(n2 >> pd[231] & pd[232]) / 255.0f;
        float f10 = (float)(n2 >> pd[233] & pd[234]) / 255.0f;
        float f11 = (float)(n2 >> pd[235] & pd[236]) / 255.0f;
        float f12 = (float)(n2 & pd[237]) / 255.0f;
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)pd[238]);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(pd[239], DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos((double)f3, (double)f2, 0.0).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos((double)f, (double)f2, 0.0).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos((double)f, (double)f4, 0.0).color(f10, f11, f12, f9).endVertex();
        bufferBuilder.pos((double)f3, (double)f4, 0.0).color(f10, f11, f12, f9).endVertex();
        tessellator.draw();
        GlStateManager.shadeModel((int)pd[240]);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }

    public static void drawRoundedRect(double d, double d2, double d3, double d4, double d5, int n) {
        int n2;
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((int)pd[114], (int)pd[115], (int)pd[116], (int)pd[117]);
        double d6 = d + d3;
        double d7 = d2 + d4;
        float f = (float)(n >> pd[118] & pd[119]) / 255.0f;
        float f2 = (float)(n >> pd[120] & pd[121]) / 255.0f;
        float f3 = (float)(n >> pd[122] & pd[123]) / 255.0f;
        float f4 = (float)(n & pd[124]) / 255.0f;
        GL11.glPushAttrib((int)pd[125]);
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        d *= 2.0;
        d2 *= 2.0;
        d6 *= 2.0;
        d7 *= 2.0;
        GL11.glDisable((int)pd[126]);
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glEnable((int)pd[127]);
        GL11.glBegin((int)pd[128]);
        for (n2 = pd[129]; n2 <= pd[130]; n2 += 3) {
            GL11.glVertex2d((double)(d + d5 + Math.sin((double)n2 * Math.PI / 180.0) * (d5 * -1.0)), (double)(d2 + d5 + Math.cos((double)n2 * Math.PI / 180.0) * (d5 * -1.0)));
        }
        for (n2 = pd[131]; n2 <= pd[132]; n2 += 3) {
            GL11.glVertex2d((double)(d + d5 + Math.sin((double)n2 * Math.PI / 180.0) * (d5 * -1.0)), (double)(d7 - d5 + Math.cos((double)n2 * Math.PI / 180.0) * (d5 * -1.0)));
        }
        for (n2 = pd[133]; n2 <= pd[134]; n2 += 3) {
            GL11.glVertex2d((double)(d6 - d5 + Math.sin((double)n2 * Math.PI / 180.0) * d5), (double)(d7 - d5 + Math.cos((double)n2 * Math.PI / 180.0) * d5));
        }
        for (n2 = pd[135]; n2 <= pd[136]; n2 += 3) {
            GL11.glVertex2d((double)(d6 - d5 + Math.sin((double)n2 * Math.PI / 180.0) * d5), (double)(d2 + d5 + Math.cos((double)n2 * Math.PI / 180.0) * d5));
        }
        GL11.glEnd();
        GL11.glEnable((int)pd[137]);
        GL11.glDisable((int)pd[138]);
        GL11.glEnable((int)pd[139]);
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        GL11.glPopAttrib();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }

    public static void drawRoundedOutline(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, int n) {
        int n2;
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((int)pd[196], (int)pd[197], (int)pd[198], (int)pd[199]);
        double d10 = d + d3;
        double d11 = d2 + d4;
        float f = (float)(n >> pd[200] & pd[201]) / 255.0f;
        float f2 = (float)(n >> pd[202] & pd[203]) / 255.0f;
        float f3 = (float)(n >> pd[204] & pd[205]) / 255.0f;
        float f4 = (float)(n & pd[206]) / 255.0f;
        GL11.glPushAttrib((int)pd[207]);
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        d *= 2.0;
        d2 *= 2.0;
        d10 *= 2.0;
        d11 *= 2.0;
        GL11.glDisable((int)pd[208]);
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glLineWidth((float)Float.parseFloat(String.valueOf(d9)));
        GL11.glEnable((int)pd[209]);
        GL11.glBegin((int)pd[210]);
        for (n2 = pd[211]; n2 <= pd[212]; n2 += 3) {
            GL11.glVertex2d((double)(d + d5 + Math.sin((double)n2 * Math.PI / 180.0) * (d5 * -1.0)), (double)(d2 + d5 + Math.cos((double)n2 * Math.PI / 180.0) * (d5 * -1.0)));
        }
        for (n2 = pd[213]; n2 <= pd[214]; n2 += 3) {
            GL11.glVertex2d((double)(d + d6 + Math.sin((double)n2 * Math.PI / 180.0) * (d6 * -1.0)), (double)(d11 - d6 + Math.cos((double)n2 * Math.PI / 180.0) * (d6 * -1.0)));
        }
        for (n2 = pd[215]; n2 <= pd[216]; n2 += 3) {
            GL11.glVertex2d((double)(d10 - d7 + Math.sin((double)n2 * Math.PI / 180.0) * d7), (double)(d11 - d7 + Math.cos((double)n2 * Math.PI / 180.0) * d7));
        }
        for (n2 = pd[217]; n2 <= pd[218]; n2 += 3) {
            GL11.glVertex2d((double)(d10 - d8 + Math.sin((double)n2 * Math.PI / 180.0) * d8), (double)(d2 + d8 + Math.cos((double)n2 * Math.PI / 180.0) * d8));
        }
        GL11.glEnd();
        GL11.glEnable((int)pd[219]);
        GL11.glDisable((int)pd[220]);
        GL11.glEnable((int)pd[221]);
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        GL11.glPopAttrib();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }

    public static void drawRectMC(int n, int n2, int n3, int n4, int n5) {
        Gui.drawRect((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
    }

    public static void drawLeftGradientRect(double d, double d2, double d3, double d4, int n, int n2) {
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)pd[81]);
        dV.begin(pd[82], DefaultVertexFormats.POSITION_COLOR);
        dV.pos(d3, d2, 0.0).color((float)(n2 >> pd[83] & pd[84]) / 255.0f, (float)(n2 >> pd[85] & pd[86]) / 255.0f, (float)(n2 >> pd[87] & pd[88]) / 255.0f, (float)(n2 >> pd[89] & pd[90]) / 255.0f).endVertex();
        dV.pos(d, d2, 0.0).color((float)(n >> pd[91] & pd[92]) / 255.0f, (float)(n >> pd[93] & pd[94]) / 255.0f, (float)(n & pd[95]) / 255.0f, (float)(n >> pd[96] & pd[97]) / 255.0f).endVertex();
        dV.pos(d, d4, 0.0).color((float)(n >> pd[98] & pd[99]) / 255.0f, (float)(n >> pd[100] & pd[101]) / 255.0f, (float)(n & pd[102]) / 255.0f, (float)(n >> pd[103] & pd[104]) / 255.0f).endVertex();
        dV.pos(d3, d4, 0.0).color((float)(n2 >> pd[105] & pd[106]) / 255.0f, (float)(n2 >> pd[107] & pd[108]) / 255.0f, (float)(n2 >> pd[109] & pd[110]) / 255.0f, (float)(n2 >> pd[111] & pd[112]) / 255.0f).endVertex();
        dW.draw();
        GlStateManager.shadeModel((int)pd[113]);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }

    public static void drawBorderedRect(double d, double d2, double d3, double d4, int n, int n2, int n3, boolean bl) {
        if (bl) {
            n2 = _M.shadeColour(n2, pd[265]);
            n3 = _M.shadeColour(n3, pd[266]);
        }
        _ah_0.drawRectBase(d + (double)n, d2 + (double)n, d3 - (double)n, d4 - (double)n, n2);
        _ah_0.drawRectBase(d, d2 + (double)n, d + (double)n, d4 - (double)n, n3);
        _ah_0.drawRectBase(d3 - (double)n, d2 + (double)n, d3, d4 - (double)n, n3);
        _ah_0.drawRectBase(d, d2, d3, d2 + (double)n, n3);
        _ah_0.drawRectBase(d, d4 - (double)n, d3, d4, n3);
    }

    public static void drawLeftGradientRect(int n, int n2, int n3, int n4, int n5, int n6) {
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)pd[48]);
        dV.begin(pd[49], DefaultVertexFormats.POSITION_COLOR);
        dV.pos((double)n3, (double)n2, 0.0).color((float)(n6 >> pd[50] & pd[51]) / 255.0f, (float)(n6 >> pd[52] & pd[53]) / 255.0f, (float)(n6 >> pd[54] & pd[55]) / 255.0f, (float)(n6 >> pd[56] & pd[57]) / 255.0f).endVertex();
        dV.pos((double)n, (double)n2, 0.0).color((float)(n5 >> pd[58] & pd[59]) / 255.0f, (float)(n5 >> pd[60] & pd[61]) / 255.0f, (float)(n5 & pd[62]) / 255.0f, (float)(n5 >> pd[63] & pd[64]) / 255.0f).endVertex();
        dV.pos((double)n, (double)n4, 0.0).color((float)(n5 >> pd[65] & pd[66]) / 255.0f, (float)(n5 >> pd[67] & pd[68]) / 255.0f, (float)(n5 & pd[69]) / 255.0f, (float)(n5 >> pd[70] & pd[71]) / 255.0f).endVertex();
        dV.pos((double)n3, (double)n4, 0.0).color((float)(n6 >> pd[72] & pd[73]) / 255.0f, (float)(n6 >> pd[74] & pd[75]) / 255.0f, (float)(n6 >> pd[76] & pd[77]) / 255.0f, (float)(n6 >> pd[78] & pd[79]) / 255.0f).endVertex();
        dW.draw();
        GlStateManager.shadeModel((int)pd[80]);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }

    public static void renderItem(ItemStack itemStack, Point point) {
        GlStateManager.enableTexture2D();
        GlStateManager.depthMask((boolean)pd[260]);
        GL11.glPushAttrib((int)pd[261]);
        GL11.glDisable((int)pd[262]);
        GlStateManager.clear((int)pd[263]);
        GL11.glPopAttrib();
        GlStateManager.enableDepth();
        GlStateManager.disableAlpha();
        GlStateManager.pushMatrix();
        Minecraft.getMinecraft().getRenderItem().zLevel = -150.0f;
        RenderHelper.enableGUIStandardItemLighting();
        Minecraft.getMinecraft().getRenderItem().renderItemAndEffectIntoGUI(itemStack, point.x, point.y);
        Minecraft.getMinecraft().getRenderItem().renderItemOverlays(Minecraft.getMinecraft().fontRenderer, itemStack, point.x, point.y);
        RenderHelper.disableStandardItemLighting();
        Minecraft.getMinecraft().getRenderItem().zLevel = 0.0f;
        GlStateManager.popMatrix();
        GlStateManager.disableDepth();
        GlStateManager.depthMask((boolean)pd[264]);
    }

    public static void drawGradientRect(double d, double d2, double d3, double d4, int n, int n2, boolean bl) {
        if (bl) {
            n = _M.shadeColour(n, pd[241]);
            n2 = _M.shadeColour(n2, pd[242]);
        }
        float f = (float)(n >> pd[243] & pd[244]) / 255.0f;
        float f2 = (float)(n >> pd[245] & pd[246]) / 255.0f;
        float f3 = (float)(n >> pd[247] & pd[248]) / 255.0f;
        float f4 = (float)(n & pd[249]) / 255.0f;
        float f5 = (float)(n2 >> pd[250] & pd[251]) / 255.0f;
        float f6 = (float)(n2 >> pd[252] & pd[253]) / 255.0f;
        float f7 = (float)(n2 >> pd[254] & pd[255]) / 255.0f;
        float f8 = (float)(n2 & pd[256]) / 255.0f;
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)pd[257]);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(pd[258], DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(d3, d2, 0.0).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(d, d2, 0.0).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(d, d4, 0.0).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(d3, d4, 0.0).color(f6, f7, f8, f5).endVertex();
        tessellator.draw();
        GlStateManager.shadeModel((int)pd[259]);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }

    public static void drawRectWH(int n, int n2, int n3, int n4, int n5) {
        _ah_0.drawRectMC(n, n2, n + n3, n2 + n4, n5);
    }

    public static final void scissor(double d, double d2, double d3, double d4) {
        ScaledResolution scaledResolution = new ScaledResolution(pb);
        double d5 = scaledResolution.getScaleFactor();
        d2 = (double)scaledResolution.getScaledHeight() - d2;
        GL11.glScissor((int)((int)(d *= d5)), (int)((int)((d2 *= d5) - (d4 *= d5))), (int)((int)(d3 *= d5)), (int)((int)d4));
    }

    public static void drawRectWH(double d, double d2, double d3, double d4, int n) {
        _ah_0.drawRect(d, d2, d + d3, d2 + d4, n);
    }

    public static void drawRectBase(double d, double d2, double d3, double d4, int n) {
        double d5;
        if (d < d3) {
            d5 = d;
            d = (int)d3;
            d3 = (int)d5;
        }
        if (d2 < d4) {
            d5 = d2;
            d2 = d4;
            d4 = d5;
        }
        GlStateManager.enableBlend();
        GL11.glDisable((int)pd[279]);
        GL11.glDisable((int)pd[280]);
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.color((float)((float)(n >> pd[281] & pd[282]) / 255.0f), (float)((float)(n >> pd[283] & pd[284]) / 255.0f), (float)((float)(n & pd[285]) / 255.0f), (float)((float)(n >> pd[286] & pd[287]) / 255.0f));
        dV.begin(pd[288], DefaultVertexFormats.POSITION);
        dV.pos(d, d4, 0.0).endVertex();
        dV.pos(d3, d4, 0.0).endVertex();
        dV.pos(d3, d2, 0.0).endVertex();
        dV.pos(d, d2, 0.0).endVertex();
        dW.draw();
        GL11.glEnable((int)pd[289]);
        GL11.glEnable((int)pd[290]);
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }

    public static void drawPickerBase(double d, double d2, double d3, double d4, float f, float f2, float f3, float f4) {
        GL11.glEnable((int)pd[267]);
        GL11.glDisable((int)pd[268]);
        GL11.glBlendFunc((int)pd[269], (int)pd[270]);
        GL11.glShadeModel((int)pd[271]);
        GL11.glBegin((int)pd[272]);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f5 = (float)d;
        float f6 = (float)d2;
        float f7 = (float)d4;
        float f8 = (float)d3;
        GL11.glVertex2f((float)f5, (float)f6);
        GL11.glVertex2f((float)f5, (float)(f6 + f7));
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        GL11.glVertex2f((float)(f5 + f8), (float)(f6 + f7));
        GL11.glVertex2f((float)(f5 + f8), (float)f6);
        GL11.glEnd();
        GL11.glDisable((int)pd[273]);
        GL11.glBegin((int)pd[274]);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glVertex2f((float)f5, (float)f6);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glVertex2f((float)f5, (float)(f6 + f7));
        GL11.glVertex2f((float)(f5 + f8), (float)(f6 + f7));
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glVertex2f((float)(f5 + f8), (float)f6);
        GL11.glEnd();
        GL11.glEnable((int)pd[275]);
        GL11.glShadeModel((int)pd[276]);
        GL11.glEnable((int)pd[277]);
        GL11.glDisable((int)pd[278]);
    }

    public static void drawRoundedOutline(double d, double d2, double d3, double d4, double d5, double d6, int n) {
        int n2;
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((int)pd[170], (int)pd[171], (int)pd[172], (int)pd[173]);
        double d7 = d + d3;
        double d8 = d2 + d4;
        float f = (float)(n >> pd[174] & pd[175]) / 255.0f;
        float f2 = (float)(n >> pd[176] & pd[177]) / 255.0f;
        float f3 = (float)(n >> pd[178] & pd[179]) / 255.0f;
        float f4 = (float)(n & pd[180]) / 255.0f;
        GL11.glPushAttrib((int)pd[181]);
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        d *= 2.0;
        d2 *= 2.0;
        d7 *= 2.0;
        d8 *= 2.0;
        GL11.glDisable((int)pd[182]);
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glLineWidth((float)Float.parseFloat(String.valueOf(d6)));
        GL11.glEnable((int)pd[183]);
        GL11.glBegin((int)pd[184]);
        for (n2 = pd[185]; n2 <= pd[186]; n2 += 3) {
            GL11.glVertex2d((double)(d + d5 + Math.sin((double)n2 * Math.PI / 180.0) * (d5 * -1.0)), (double)(d2 + d5 + Math.cos((double)n2 * Math.PI / 180.0) * (d5 * -1.0)));
        }
        for (n2 = pd[187]; n2 <= pd[188]; n2 += 3) {
            GL11.glVertex2d((double)(d + d5 + Math.sin((double)n2 * Math.PI / 180.0) * (d5 * -1.0)), (double)(d8 - d5 + Math.cos((double)n2 * Math.PI / 180.0) * (d5 * -1.0)));
        }
        for (n2 = pd[189]; n2 <= pd[190]; n2 += 3) {
            GL11.glVertex2d((double)(d7 - d5 + Math.sin((double)n2 * Math.PI / 180.0) * d5), (double)(d8 - d5 + Math.cos((double)n2 * Math.PI / 180.0) * d5));
        }
        for (n2 = pd[191]; n2 <= pd[192]; n2 += 3) {
            GL11.glVertex2d((double)(d7 - d5 + Math.sin((double)n2 * Math.PI / 180.0) * d5), (double)(d2 + d5 + Math.cos((double)n2 * Math.PI / 180.0) * d5));
        }
        GL11.glEnd();
        GL11.glEnable((int)pd[193]);
        GL11.glDisable((int)pd[194]);
        GL11.glEnable((int)pd[195]);
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        GL11.glPopAttrib();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }

    public static void drawModalRectWithCustomSizedTexture(double d, double d2, float f, float f2, double d3, double d4, float f3, float f4) {
        float f5 = 1.0f / f3;
        float f6 = 1.0f / f4;
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(pd[303], DefaultVertexFormats.POSITION_TEX);
        bufferBuilder.pos(d, d2 + d4, 0.0).tex((double)(f * f5), (double)((f2 + (float)d4) * f6)).endVertex();
        bufferBuilder.pos(d + d3, d2 + d4, 0.0).tex((double)((f + (float)d3) * f5), (double)((f2 + (float)d4) * f6)).endVertex();
        bufferBuilder.pos(d + d3, d2, 0.0).tex((double)((f + (float)d3) * f5), (double)(f2 * f6)).endVertex();
        bufferBuilder.pos(d, d2, 0.0).tex((double)(f * f5), (double)(f2 * f6)).endVertex();
        tessellator.draw();
    }
}

