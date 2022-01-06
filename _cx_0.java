/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _cx
 */
public class _cx_0
extends _bH {
    public static final int[] qS = new int[]{1, 0};
    public int qQ;
    public _k_0 qN;
    public double qR;
    public _v_0 qO;
    public boolean qM;
    public double qP;

    @Override
    public void setOff(double d) {
        this.qP = d;
    }

    @Override
    public void renderComponent(int n, int n2) {
        _aR.iq.drawBoolean(this.qN, this.qO, this.qP, n, n2, this.qM);
    }

    public _cx_0(_k_0 _k_02, _v_0 _v_02, double d) {
        this.qN = _k_02;
        this.qO = _v_02;
        this.qQ = _v_02.ax.getX() + _v_02.ax.getWidth();
        this.qR = (double)_v_02.ax.getY() + _v_02.ay;
        this.qP = d;
    }

    @Override
    public int getHeight() {
        return _cm_0.pP;
    }

    public boolean isMouseOnButton(int n, int n2) {
        if (n > this.qQ && n < this.qQ + _cm_0.pN && (double)n2 > this.qR && (double)n2 < this.qR + (double)_cm_0.pP) {
            return qS[0];
        }
        return qS[1];
    }

    @Override
    public void mouseClicked(int n, int n2, int n3) {
        if (this.isMouseOnButton(n, n2) && n3 == 0 && this.qO.aB) {
            this.qN.toggle();
            if (_aB.gF.N) {
                _cp_0.clickSound();
            }
        }
    }

    @Override
    public void updateComponent(int n, int n2) {
        this.qM = this.isMouseOnButton(n, n2);
        this.qR = (double)this.qO.ax.getY() + this.qP;
        this.qQ = this.qO.ax.getX();
    }
}

