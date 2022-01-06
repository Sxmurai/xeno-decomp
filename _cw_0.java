/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _cw
 */
public class _cw_0
extends _bH {
    public double qK;
    public double qI;
    public int qJ;
    public _v_0 qG;
    public boolean qF;
    public _cd_0 qH;
    public static final int[] qL = new int[]{1, 0};

    @Override
    public int getHeight() {
        return _cm_0.pP;
    }

    public boolean isMouseOnButton(int n, int n2) {
        if (n > this.qJ && n < this.qJ + _cm_0.pN && (double)n2 > this.qK && (double)n2 < this.qK + (double)_cm_0.pP) {
            return qL[0];
        }
        return qL[1];
    }

    public _cw_0(_v_0 _v_02, _cd_0 _cd_02, double d) {
        this.qG = _v_02;
        this.qH = _cd_02;
        this.qJ = _v_02.ax.getX() + _v_02.ax.getWidth();
        this.qK = (double)_v_02.ax.getY() + _v_02.ay;
        this.qI = d;
    }

    @Override
    public void updateComponent(int n, int n2) {
        this.qF = this.isMouseOnButton(n, n2);
        this.qK = (double)this.qG.ax.getY() + this.qI;
        this.qJ = this.qG.ax.getX();
    }

    @Override
    public void mouseClicked(int n, int n2, int n3) {
        if (this.isMouseOnButton(n, n2) && n3 == 0 && this.qG.aB) {
            this.qH.cycle();
            if (_aB.gF.N) {
                _cp_0.clickSound();
            }
            if (this.qH == _aB.gx) {
                _aR.themeSwitch();
            }
        }
    }

    @Override
    public void setOff(double d) {
        this.qI = d;
    }

    @Override
    public void renderComponent(int n, int n2) {
        _aR.iq.drawMode(this.qH, this.qG, this.qI, n, n2, this.qF);
    }
}

