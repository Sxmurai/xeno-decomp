/*
 * Decompiled with CFR 0.152.
 */
public class _Y
extends _bH {
    public static final int[] mK = new int[]{1, 0, 1, 0, 0, 0, 1, 0};
    public double cJ;
    public _v_0 cG;
    public int cI;
    public double cH;
    public boolean cE;
    public boolean cF;
    public _cO cK;

    @Override
    public void keyTyped(char c, int n) {
        if (this.cF) {
            this.cK.sx = n;
            this.cF = mK[5];
        }
    }

    @Override
    public void updateComponent(int n, int n2) {
        this.cE = this.isMouseOnButton(n, n2);
        this.cJ = (double)this.cG.ax.getY() + this.cH;
        this.cI = this.cG.ax.getX();
    }

    public boolean isMouseOnButton(int n, int n2) {
        if (n > this.cI && n < this.cI + _cm_0.pN && (double)n2 > this.cJ && (double)n2 < this.cJ + (double)_cm_0.pP) {
            return mK[6];
        }
        return mK[7];
    }

    @Override
    public void renderComponent(int n, int n2) {
        _aR.iq.drawKeybind(this.cK, this.cH, this.cG, this.cF, n, n2);
    }

    public _Y(_v_0 _v_02, double d, _cO _cO2) {
        this.cG = _v_02;
        this.cI = _v_02.ax.getX() + _v_02.ax.getWidth();
        this.cJ = (double)_v_02.ax.getY() + _v_02.ay;
        this.cH = d;
        this.cK = _cO2;
    }

    @Override
    public int getHeight() {
        return _cm_0.pP;
    }

    @Override
    public void setOff(double d) {
        this.cH = d;
    }

    @Override
    public void mouseClicked(int n, int n2, int n3) {
        if (this.isMouseOnButton(n, n2) && n3 == 0 && this.cG.aB) {
            this.cF = !this.cF ? mK[0] : mK[1];
            int n4 = this.cF ? 1 : 0;
            if (_aB.gF.N) {
                _cp_0.clickSound();
            }
        }
        if (this.isMouseOnButton(n, n2) && n3 == mK[2] && this.cG.aB) {
            this.cK.sx = mK[3];
            this.cF = mK[4];
            if (_aB.gF.N) {
                _cp_0.clickSound();
            }
        }
    }
}

