/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;

public class _aX {
    public ArrayList<_ct_0> iX = new ArrayList();
    public static final int[] iZ = new int[]{0, 0, 1, 0};
    public static final String[] iY;

    public _aX() {
        this.iX.add(new _al_0());
        this.iX.add(new _bf_0());
        this.iX.add(new _W());
        this.iX.add(new _by_0());
        this.iX.add(new _bQ());
        this.iX.add(new _E());
        this.iX.add(new _cL());
        this.iX.add(new _ae_0());
        this.iX.add(new _z_0());
        for (_ct_0 _ct_02 : this.iX) {
            _ct_02.sub();
        }
        Collections.reverse(this.iX);
        _as_0.fx.info(iY[iZ[0]]);
    }

    static {
        String[] stringArray = new String[iZ[2]];
        stringArray[_aX.iZ[3]] = "Initialized HUD Manager";
        iY = stringArray;
    }

    public void renderMods() {
        for (_ct_0 _ct_02 : this.iX) {
            if (!_ct_02.qq.lM) continue;
            _ct_02.draw();
        }
        _w_0.drawArrayList();
    }

    public _ct_0 getModule(String string) {
        for (_ct_0 _ct_02 : this.iX) {
            if (_ct_02.qo != string) continue;
            return _ct_02;
        }
        return null;
    }

    public void reset() {
        for (_ct_0 _ct_02 : this.iX) {
            _ct_02.qr = _ct_02.qt;
            _ct_02.qs = _ct_02.qu;
            _ct_02.setEnabled(iZ[1]);
            _as_0.fG.saveHudConfig();
        }
        Collections.reverse(this.iX);
    }
}

