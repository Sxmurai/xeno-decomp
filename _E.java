/*
 * Decompiled with CFR 0.152.
 */
public class _E
extends _ct_0 {
    public static final int[] qy = new int[]{0, 0, 50, 1, 2, 1, 3, 1, -7340032, 4, 0, 5, 0, 1, 2, 3, 4};
    public static final String[] qx;

    @Override
    public float getHeight() {
        return 11.0f;
    }

    public _E() {
        super(qx[qy[0]], qy[1], qy[2], _as_0.fB.getModule(qx[qy[3]]));
    }

    @Override
    public int getWidth() {
        try {
            return _h_0.getStringWidth(qx[qy[9]] + _as_0.fJ.getTPS(_c_0.f));
        }
        catch (NullPointerException nullPointerException) {
            return qy[10];
        }
    }

    @Override
    public void draw() {
        _h_0.drawStringWithShadow(qx[qy[4]] + _as_0.fJ.getTPS(_c_0.f), this.getX() + qy[5], this.getY(), _ck_0.pz);
        super.draw();
    }

    @Override
    public void renderDummy(int n, int n2) {
        super.renderDummy(n, n2);
        this.qp.setHeight(this.getHeight());
        this.qp.setWidth(this.getWidth());
        _h_0.drawStringWithShadow(qx[qy[6]] + _as_0.fJ.getTPS(_c_0.f), this.getX() + qy[7], this.getY(), this.qq.lM ? _ck_0.pz : qy[8]);
    }

    static {
        String[] stringArray = new String[qy[11]];
        stringArray[_E.qy[12]] = "TPS";
        stringArray[_E.qy[13]] = "TPS";
        stringArray[_E.qy[14]] = "TPS: ";
        stringArray[_E.qy[15]] = "TPS: ";
        stringArray[_E.qy[16]] = "TPS: ";
        qx = stringArray;
    }
}

