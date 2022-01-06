/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from _v
 */
public class _v_0
extends _bH {
    public _bA aw;
    public static final int[] mK = new int[]{0, 1, 0, 1, 1, 1, 0, 1, 0};
    public double ay;
    public boolean az;
    public int aC;
    public ArrayList<_bH> aA;
    public _aS ax;
    public boolean aB;

    public void setOpen(boolean bl) {
        this.aB = bl;
    }

    public _v_0(_bA _bA2, _aS _aS2, double d) {
        this.aw = _bA2;
        this.ax = _aS2;
        this.ay = d;
        this.aA = new ArrayList();
        this.aB = mK[0];
        this.aC = _cm_0.pP;
        double d2 = d + (double)_cm_0.pP;
        for (_bd_0 _bd_02 : _bA2.lP) {
            _bH _bH2;
            if (_bd_02 instanceof _k_0) {
                _bH2 = new _cx_0((_k_0)_bd_02, this, d2);
                this.aA.add(_bH2);
                d2 += (double)_cm_0.pP;
            }
            if (_bd_02 instanceof _cJ) {
                _bH2 = new _ab_0((_cJ)_bd_02, this, d2);
                this.aA.add(_bH2);
                d2 += (double)_cm_0.pP;
            }
            if (_bd_02 instanceof _cd_0) {
                _bH2 = new _cw_0(this, (_cd_0)_bd_02, d2);
                this.aA.add(_bH2);
                d2 += (double)_cm_0.pP;
            }
            if (_bd_02 instanceof _cA) {
                _bH2 = new _ai_0((_cA)_bd_02, this, d2);
                this.aA.add(_bH2);
                d2 += (double)_cm_0.pP;
            }
            if (_bd_02 instanceof _cs_0) {
                _bH2 = new _aw_0((_cs_0)_bd_02, this, d2);
                this.aA.add(_bH2);
                d2 += (double)_cm_0.pP;
            }
            if (!(_bd_02 instanceof _cO)) continue;
            _bH2 = new _Y(this, d2, (_cO)_bd_02);
            this.aA.add(_bH2);
            d2 += (double)_cm_0.pP;
        }
    }

    @Override
    public int getHeight() {
        if (this.aB) {
            int n = _aR.iq instanceof _f_0 ? mK[1] : mK[2];
            for (_bH _bH2 : this.aA) {
                if (!(_bH2 instanceof _ai_0) || !((_ai_0)_bH2).dY) continue;
                n += _cm_0.pP * _cm_0.pS;
            }
            return _cm_0.pP * (this.aA.size() + mK[3]) + n;
        }
        return _cm_0.pP;
    }

    public ArrayList<_bH> getSubcomponents() {
        return this.aA;
    }

    @Override
    public void mouseClicked(int n, int n2, int n3) {
        if (this.isMouseOnButton(n, n2) && n3 == 0) {
            this.aw.toggle();
            if (_aB.gF.N) {
                _cp_0.clickSound();
            }
        }
        if (this.isMouseOnButton(n, n2) && n3 == mK[4]) {
            this.aB = !this.aB ? mK[5] : mK[6];
            this.ax.refresh();
            if (_aB.gF.N) {
                _cp_0.clickSound();
            }
        }
        for (_bH _bH2 : this.aA) {
            _bH2.mouseClicked(n, n2, n3);
        }
    }

    @Override
    public void renderComponent(int n, int n2) {
        _aR.iq.drawButton(this.ax, this.aw, this.aA, this.aB, this.ay, n, n2, this.az);
    }

    @Override
    public void mouseReleased(int n, int n2, int n3) {
        for (_bH _bH2 : this.aA) {
            _bH2.mouseReleased(n, n2, n3);
        }
    }

    public boolean isOpen() {
        return this.aB;
    }

    @Override
    public void keyTyped(char c, int n) {
        for (_bH _bH2 : this.aA) {
            _bH2.keyTyped(c, n);
        }
    }

    @Override
    public void setOff(double d) {
        this.ay = d;
        double d2 = this.ay + (double)_cm_0.pP;
        for (_bH _bH2 : this.aA) {
            _bH2.setOff(d2);
            d2 += (double)_bH2.getHeight();
        }
    }

    public void setSubcomponents(ArrayList<_bH> arrayList) {
        this.aA = arrayList;
    }

    public boolean isMouseOnButton(int n, int n2) {
        if (n > this.ax.getX() && n < this.ax.getX() + this.ax.getWidth() && (double)n2 > (double)this.ax.getY() + this.ay && (double)n2 < (double)(this.ax.getY() + _cm_0.pP) + this.ay) {
            return mK[7];
        }
        return mK[8];
    }

    @Override
    public void updateComponent(int n, int n2) {
        this.az = this.isMouseOnButton(n, n2);
        if (!this.aA.isEmpty()) {
            for (_bH _bH2 : this.aA) {
                _bH2.updateComponent(n, n2);
            }
        }
    }
}

