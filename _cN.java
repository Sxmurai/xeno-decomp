/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.texture.DynamicTexture
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.lwjgl.opengl.GL11;

public class _cN {
    public float so = 512.0f;
    public Font sq;
    public static final int[] sw = new int[]{256, -1, 0, 2, 255, 255, 255, 0, 0, 0, 0, 0, 1, 0, 8, 0, 0, 2};
    public int st;
    public _y_0[] sp = new _y_0[sw[0]];
    public boolean ss;
    public boolean sr;
    public DynamicTexture sv;
    public int su;

    public void drawQuad(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f5 / this.so;
        float f10 = f6 / this.so;
        float f11 = f7 / this.so;
        float f12 = f8 / this.so;
        GL11.glTexCoord2f((float)(f9 + f11), (float)f10);
        GL11.glVertex2d((double)(f + f3), (double)f2);
        GL11.glTexCoord2f((float)f9, (float)f10);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glTexCoord2f((float)f9, (float)(f10 + f12));
        GL11.glVertex2d((double)f, (double)(f2 + f4));
        GL11.glTexCoord2f((float)f9, (float)(f10 + f12));
        GL11.glVertex2d((double)f, (double)(f2 + f4));
        GL11.glTexCoord2f((float)(f9 + f11), (float)(f10 + f12));
        GL11.glVertex2d((double)(f + f3), (double)(f2 + f4));
        GL11.glTexCoord2f((float)(f9 + f11), (float)f10);
        GL11.glVertex2d((double)(f + f3), (double)f2);
    }

    public void setFont(Font font) {
        this.sq = font;
        this.sv = this.setupTexture(font, this.sr, this.ss, this.sp);
    }

    public void setAntiAlias(boolean bl) {
        if (this.sr != bl) {
            this.sr = bl;
            this.sv = this.setupTexture(this.sq, bl, this.ss, this.sp);
        }
    }

    public boolean isFractionalMetrics() {
        return this.ss;
    }

    public void drawChar(_y_0[] _y_0Array, char c, float f, float f2) throws ArrayIndexOutOfBoundsException {
        try {
            this.drawQuad(f, f2, _y_0Array[c].aS, _y_0Array[c].aT, _y_0Array[c].aU, _y_0Array[c].aV, _y_0Array[c].aS, _y_0Array[c].aT);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public BufferedImage generateFontImage(Font font, boolean bl, boolean bl2, _y_0[] _y_0Array) {
        int n = (int)this.so;
        BufferedImage bufferedImage = new BufferedImage(n, n, sw[3]);
        Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
        graphics2D.setFont(font);
        graphics2D.setColor(new Color(sw[4], sw[5], sw[6], sw[7]));
        graphics2D.fillRect(sw[8], sw[9], n, n);
        graphics2D.setColor(Color.WHITE);
        graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, bl2 ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, bl ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, bl ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n2 = sw[10];
        int n3 = sw[11];
        int n4 = sw[12];
        for (int i = sw[13]; i < _y_0Array.length; ++i) {
            char c = (char)i;
            _y_0 _y_02 = new _y_0();
            Rectangle2D rectangle2D = fontMetrics.getStringBounds(String.valueOf(c), graphics2D);
            _y_02.aS = rectangle2D.getBounds().width + sw[14];
            _y_02.aT = rectangle2D.getBounds().height;
            if (n3 + _y_02.aS >= n) {
                n3 = sw[15];
                n4 += n2;
                n2 = sw[16];
            }
            if (_y_02.aT > n2) {
                n2 = _y_02.aT;
            }
            _y_02.aU = n3;
            _y_02.aV = n4;
            if (_y_02.aT > this.st) {
                this.st = _y_02.aT;
            }
            _y_0Array[i] = _y_02;
            graphics2D.drawString(String.valueOf(c), n3 + sw[17], n4 + fontMetrics.getAscent());
            n3 += _y_02.aS;
        }
        return bufferedImage;
    }

    public _cN(Font font, boolean bl, boolean bl2) {
        this.st = sw[1];
        this.su = sw[2];
        this.sq = font;
        this.sr = bl;
        this.ss = bl2;
        this.sv = this.setupTexture(font, bl, bl2, this.sp);
    }

    public DynamicTexture setupTexture(Font font, boolean bl, boolean bl2, _y_0[] _y_0Array) {
        BufferedImage bufferedImage = this.generateFontImage(font, bl, bl2, _y_0Array);
        try {
            return new DynamicTexture(bufferedImage);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public void setFractionalMetrics(boolean bl) {
        if (this.ss != bl) {
            this.ss = bl;
            this.sv = this.setupTexture(this.sq, this.sr, bl, this.sp);
        }
    }
}

