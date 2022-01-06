/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;

public class _cA
extends _bd_0 {
    public boolean rc;
    public _cV rd;

    public Color getColor() {
        this.doRainBow();
        return this.rd;
    }

    public boolean getRainbow() {
        return this.rc;
    }

    public _cA(String string, _cV _cV2) {
        this.ju = string;
        this.rd = _cV2;
    }

    public void setValue(int n, int n2, int n3, int n4) {
        this.rd = new _cV(n, n2, n3, n4);
    }

    public void setValue(Color color) {
        this.rd = new _cV(color);
    }

    public _cA(String string, Color color) {
        this.ju = string;
        this.rd = new _cV(color);
    }

    public void doRainBow() {
        if (this.rc) {
            _cV _cV2 = _cV.fromHSB((float)(System.currentTimeMillis() % 11520L) / 11520.0f, this.rd.getSaturation(), this.rd.getBrightness());
            this.setValue(new _cV(_cV2.getRed(), _cV2.getGreen(), _cV2.getBlue(), this.rd.getAlpha()));
        }
    }

    public void setRainbow(boolean bl) {
        this.rc = bl;
    }
}

