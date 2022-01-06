/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import java.awt.Color;
import org.lwjgl.input.Mouse;

/*
 * Renamed from _ai
 */
public class _ai_0
extends _bH {
    public boolean eg = mK[0];
    public int ed;
    public boolean dY;
    public _v_0 eb;
    public static final int[] mK = new int[]{0, 0, 0, 6, 7, 1, 1, 0, 4, 0, 1, 2, 3, 4, 0, 0, 1, 1, 2, 2, 3, 0, 1, 0, 1, 0, 1, 0, 0, 0, 3, 1, 2, 2, 2, 1, 1, 0, 16, 255, 8, 255, 255, 0, 1, 2, 2, 2, 2, 2, 0, 1, 2, 3, 3, 0, -65536, 0, 6, 1, 1, 0, 4, 1, 1, -1, 0, 6, 1, 1, 1, 1, 1, -1, 1, -1, -7303024, -7303024, -1, 1, 0, 0, 1, 1, -1, 6, 7, 1, 0, 0, 0, 0, 1, 0, 1, 0};
    public double ec;
    public _cA ea;
    public boolean dZ;
    public boolean ei;
    public boolean eh = mK[1];
    public Color ef;
    public double ee;

    public void drawPicker(_cA _cA2, double d, double d2, double d3, double d4, double d5, double d6, int n, int n2) {
        float f;
        float f2;
        float[] fArray = new float[mK[8]];
        fArray[_ai_0.mK[9]] = 0.0f;
        fArray[_ai_0.mK[10]] = 0.0f;
        fArray[_ai_0.mK[11]] = 0.0f;
        fArray[_ai_0.mK[12]] = 0.0f;
        float[] fArray2 = fArray;
        try {
            float[] fArray3 = new float[mK[13]];
            fArray3[_ai_0.mK[14]] = Color.RGBtoHSB(_cA2.getColor().getRed(), _cA2.getColor().getGreen(), _cA2.getColor().getBlue(), null)[mK[15]];
            fArray3[_ai_0.mK[16]] = Color.RGBtoHSB(_cA2.getColor().getRed(), _cA2.getColor().getGreen(), _cA2.getColor().getBlue(), null)[mK[17]];
            fArray3[_ai_0.mK[18]] = Color.RGBtoHSB(_cA2.getColor().getRed(), _cA2.getColor().getGreen(), _cA2.getColor().getBlue(), null)[mK[19]];
            fArray3[_ai_0.mK[20]] = (float)_cA2.getColor().getAlpha() / 255.0f;
            fArray2 = fArray3;
        }
        catch (Exception exception) {
            // empty catch block
        }
        float f3 = 72.0f;
        float f4 = 50.0f;
        float f5 = 11.0f;
        float f6 = 57.0f;
        float f7 = 11.0f;
        float f8 = 66.0f;
        if (!(this.eg || this.eh || this.ei)) {
            if (Mouse.isButtonDown((int)mK[21]) && this.mouseOver(d, d2, d + (double)f3, d2 + (double)f4, n, n2)) {
                this.eg = mK[22];
            } else if (Mouse.isButtonDown((int)mK[23]) && this.mouseOver(d3, d4, d3 + (double)f5, d4 + (double)f6, n, n2)) {
                this.eh = mK[24];
            } else if (Mouse.isButtonDown((int)mK[25]) && this.mouseOver(d5, d6, d5 + (double)f8, d6 + (double)f7, n, n2)) {
                this.ei = mK[26];
            }
        }
        if (this.eh) {
            f2 = (float)Math.min(Math.max(d4, (double)n2), d4 + (double)f6);
            fArray2[_ai_0.mK[27]] = (f2 - (float)d4) / f6;
            fArray2[_ai_0.mK[28]] = Math.min(0.97f, fArray2[mK[29]]);
        }
        if (this.ei) {
            f2 = (float)Math.min(Math.max(d5, (double)n), d5 + (double)f8);
            fArray2[_ai_0.mK[30]] = 1.0f - (f2 - (float)d5) / f8;
        }
        if (this.eg) {
            f2 = (float)Math.min(Math.max(d, (double)n), d + (double)f3);
            f = (float)Math.min(Math.max(d2, (double)n2), d2 + (double)f4);
            fArray2[_ai_0.mK[31]] = (f2 - (float)d) / f3;
            fArray2[_ai_0.mK[32]] = 1.0f - (f - (float)d2) / f4;
            fArray2[_ai_0.mK[33]] = (float)Math.max(0.04000002, (double)fArray2[mK[34]]);
            fArray2[_ai_0.mK[35]] = (float)Math.max(0.022222223, (double)fArray2[mK[36]]);
        }
        int n3 = Color.HSBtoRGB(fArray2[mK[37]], 1.0f, 1.0f);
        f = (float)(n3 >> mK[38] & mK[39]) / 255.0f;
        float f9 = (float)(n3 >> mK[40] & mK[41]) / 255.0f;
        float f10 = (float)(n3 & mK[42]) / 255.0f;
        _ah_0.drawPickerBase(d, d2, f3, f4, f, f9, f10, 255.0f);
        this.drawHueSlider(d3, d4, f5, f6, fArray2[mK[43]]);
        int n4 = (int)(d + (double)(fArray2[mK[44]] * f3));
        int n5 = (int)(d2 + (double)f4 - (double)(fArray2[mK[45]] * f4));
        _ah_0.drawRectMC(n4 - mK[46], n5 - mK[47], n4 + mK[48], n5 + mK[49], _ck_0.pz);
        this.ef = _ai_0.alphaIntegrate(new Color(Color.HSBtoRGB(fArray2[mK[50]], fArray2[mK[51]], fArray2[mK[52]])), fArray2[mK[53]]);
        this.drawAlphaSlider(d5, d6, f8, f7, (float)this.ef.getRed() / 255.0f, (float)this.ef.getGreen() / 255.0f, (float)this.ef.getBlue() / 255.0f, fArray2[mK[54]]);
        this.ea.setValue(new _cV(this.ef));
    }

    public void doRainbow(int n, int n2, int n3) {
        if (n3 == 0 && this.mouseOver(this.eb.ax.getX(), (double)this.eb.ax.getY() + this.ec + (double)(_cm_0.pP * mK[85]) - 2.0, this.eb.ax.getX() + this.eb.ax.getWidth(), (double)this.eb.ax.getY() + this.ec + (double)(_cm_0.pP * mK[86]), n, n2)) {
            this.ea.setRainbow(!this.ea.getRainbow() ? mK[87] : mK[88]);
            if (_aB.gF.N) {
                _cp_0.clickSound();
            }
        }
    }

    @Override
    public void renderComponent(int n, int n2) {
        _cm_0.pS = mK[3];
        _aR.iq.drawColourPicker(this, this.ea, this.ec, this.dY, this.eb, n, n2);
    }

    public void drawAlphaSlider(double d, double d2, float f, float f2, float f3, float f4, float f5, float f6) {
        int n = mK[74];
        float f7 = f2 / 2.0f;
        for (float f8 = -f7; f8 < f; f8 += f7) {
            if (n == 0) {
                _ah_0.drawRect(d + (double)f8, d2, d + (double)f8 + (double)f7, d2 + (double)f2, mK[75]);
                _ah_0.drawRect(d + (double)f8, d2 + (double)f7, d + (double)f8 + (double)f7, d2 + (double)f2, mK[76]);
                if (f8 < f - f7) {
                    double d3 = d + (double)f8 + (double)f7;
                    double d4 = Math.min(d + (double)f, d + (double)f8 + (double)(f7 * 2.0f));
                    _ah_0.drawRect(d3, d2, d4, d2 + (double)f2, mK[77]);
                    _ah_0.drawRect(d3, d2 + (double)f7, d4, d2 + (double)f2, mK[78]);
                }
            }
            n = n == 0 ? mK[79] : mK[80];
        }
        _ah_0.drawLeftGradientRect(d, d2, d + (double)f, d2 + (double)f2, new Color(f3, f4, f5, 1.0f).getRGB(), mK[81]);
        int n2 = (int)(d + (double)f - (double)(f * f6));
        _ah_0.drawRect(n2 - mK[82], d2, n2 + mK[83], d2 + (double)f2, mK[84]);
    }

    @Override
    public void mouseClicked(int n, int n2, int n3) {
        if (this.isMouseOnButton(n, n2) && n3 == mK[5] && this.eb.aB) {
            for (_bH _bH2 : this.eb.ax.getComponents()) {
                if (!(_bH2 instanceof _v_0) || !((_v_0)_bH2).isOpen()) continue;
                for (_bH _bH3 : ((_v_0)_bH2).getSubcomponents()) {
                    if (!(_bH3 instanceof _ai_0) || !((_ai_0)_bH3).dY || _bH3 == this) continue;
                    this.eb.ax.refresh();
                }
            }
            this.dY = !this.dY ? mK[6] : mK[7];
            this.eb.ax.refresh();
            if (_aB.gF.N) {
                _cp_0.clickSound();
            }
        }
        this.doRainbow(n, n2, n3);
    }

    @Override
    public void setOff(double d) {
        this.ec = d;
    }

    @Override
    public void mouseReleased(int n, int n2, int n3) {
        this.eg = mK[89];
        this.eh = mK[90];
        this.ei = mK[91];
    }

    public _ai_0(_cA _cA2, _v_0 _v_02, double d) {
        this.ei = mK[2];
        this.ea = _cA2;
        this.eb = _v_02;
        this.ed = _v_02.ax.getX() + _v_02.ax.getWidth();
        this.ee = (double)_v_02.ax.getY() + _v_02.ay;
        this.ec = d;
    }

    public static Color alphaIntegrate(Color color, float f) {
        float f2 = (float)color.getRed() / 255.0f;
        float f3 = (float)color.getGreen() / 255.0f;
        float f4 = (float)color.getBlue() / 255.0f;
        return new Color(f2, f3, f4, f);
    }

    public void drawHueSlider(double d, double d2, double d3, double d4, float f) {
        int n = mK[55];
        if (d4 > d3) {
            int n2;
            _ah_0.drawRect(d, d2, d + d3, d2 + 4.0, mK[56]);
            d2 += 4.0;
            for (n2 = mK[57]; n2 < mK[58]; ++n2) {
                int n3 = Color.HSBtoRGB((float)n / 6.0f, 1.0f, 1.0f);
                int n4 = Color.HSBtoRGB((float)(n + mK[59]) / 6.0f, 1.0f, 1.0f);
                _ah_0.drawGradientRect(d, d2 + (double)n * (d4 / 6.0), d + d3, d2 + (double)(n + mK[60]) * (d4 / 6.0), n3, n4, mK[61]);
                ++n;
            }
            n2 = (int)(d2 + d4 * (double)f) - mK[62];
            _ah_0.drawRect(d, n2 - mK[63], d + d3, n2 + mK[64], mK[65]);
        } else {
            int n5;
            for (n5 = mK[66]; n5 < mK[67]; ++n5) {
                int n6 = Color.HSBtoRGB((float)n / 6.0f, 1.0f, 1.0f);
                int n7 = Color.HSBtoRGB((float)(n + mK[68]) / 6.0f, 1.0f, 1.0f);
                _ah_0.gradient(d + (double)n * (d3 / 6.0), d2, d + (double)(n + mK[69]) * (d3 / 6.0), d2 + d4, n6, n7, mK[70]);
                ++n;
            }
            n5 = (int)(d + d3 * (double)f);
            _ah_0.drawRect(n5 - mK[71], d2, n5 + mK[72], d2 + d4, mK[73]);
        }
    }

    public boolean isMouseOnButton(double d, double d2) {
        if (d > (double)this.ed && d < (double)(this.ed + _cm_0.pN) && d2 > this.ee && d2 < this.ee + (double)_cm_0.pP) {
            return mK[94];
        }
        return mK[95];
    }

    public boolean mouseOver(double d, double d2, double d3, double d4, int n, int n2) {
        return ((double)n >= d && (double)n2 >= d2 && (double)n <= d3 && (double)n2 <= d4 ? mK[92] : mK[93]) != 0;
    }

    @Override
    public void updateComponent(int n, int n2) {
        this.dZ = this.isMouseOnButton(n, n2);
        this.ee = (double)this.eb.ax.getY() + this.ec;
        this.ed = this.eb.ax.getX();
    }

    @Override
    public int getHeight() {
        return this.dY ? _cm_0.pP * mK[4] : _cm_0.pP;
    }
}

