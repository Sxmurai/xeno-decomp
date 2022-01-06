/*
 * Decompiled with CFR 0.152.
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * Renamed from _ab
 */
public class _ab_0
extends _bH {
    public static final int[] mK = new int[]{0, 1, 0, 0, 2, 1, 1, 0, 2, 1, 0, 2, 1, 0};
    public boolean cT;
    public boolean cZ = mK[0];
    public _cJ cU;
    public double cY;
    public int cX;
    public _v_0 cV;
    public double cW;
    public double da;

    public _ab_0(_cJ _cJ2, _v_0 _v_02, double d) {
        this.cU = _cJ2;
        this.cV = _v_02;
        this.cX = _v_02.ax.getX() + _v_02.ax.getWidth();
        this.cY = (double)_v_02.ax.getY() + _v_02.ay;
        this.cW = d;
    }

    @Override
    public int getHeight() {
        return _cm_0.pP;
    }

    @Override
    public void setOff(double d) {
        this.cW = d;
    }

    @Override
    public void updateComponent(int n, int n2) {
        this.cT = this.isMouseOnButtonD(n, n2) || this.isMouseOnButtonI(n, n2) ? mK[1] : mK[2];
        this.cY = (double)this.cV.ax.getY() + this.cW;
        this.cX = this.cV.ax.getX();
        double d = Math.min(_cm_0.pN, Math.max(mK[3], n - this.cX));
        double d2 = this.cU.getMinimum();
        double d3 = this.cU.getMaximum();
        this.da = (double)_cm_0.pN * (this.cU.getDoubleValue() - d2) / (d3 - d2);
        if (this.cZ) {
            if (d == 0.0) {
                this.cU.setValue(this.cU.getMinimum());
            } else {
                double d4 = _ab_0.roundToPlace(d / (double)_cm_0.pN * (d3 - d2) + d2, mK[4]);
                this.cU.setValue(d4);
            }
        }
    }

    public static double roundToPlace(double d, int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bigDecimal = new BigDecimal(d);
        bigDecimal = bigDecimal.setScale(n, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    @Override
    public void mouseReleased(int n, int n2, int n3) {
        this.cZ = mK[7];
    }

    @Override
    public void mouseClicked(int n, int n2, int n3) {
        if (this.isMouseOnButtonD(n, n2) && n3 == 0 && this.cV.aB) {
            this.cZ = mK[5];
            if (_aB.gF.N) {
                _cp_0.clickSound();
            }
        }
        if (this.isMouseOnButtonI(n, n2) && n3 == 0 && this.cV.aB) {
            this.cZ = mK[6];
            if (_aB.gF.N) {
                _cp_0.clickSound();
            }
        }
    }

    public boolean isMouseOnButtonD(int n, int n2) {
        if (n > this.cX && n < this.cX + this.cV.ax.getWidth() / mK[8] && (double)n2 > this.cY && (double)n2 < this.cY + (double)_cm_0.pP) {
            return mK[9];
        }
        return mK[10];
    }

    public boolean isMouseOnButtonI(int n, int n2) {
        if (n > this.cX + this.cV.ax.getWidth() / mK[11] && n < this.cX + this.cV.ax.getWidth() && (double)n2 > this.cY && (double)n2 < this.cY + (double)_cm_0.pP) {
            return mK[12];
        }
        return mK[13];
    }

    @Override
    public void renderComponent(int n, int n2) {
        _aR.iq.drawSlider(this.cU, this.cV, this.cW, (int)this.da, this.cT, n, n2);
    }
}

