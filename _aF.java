/*
 * Decompiled with CFR 0.152.
 */
public final class _aF
extends Enum<_aF> {
    public static final int[] hb = new int[]{4, 0, 1, 2, 3, 0, 0, 1, 1, 2, 2, 3, 3, 4, 0, 1, 2, 3};
    public static final /* enum */ _aF gX;
    public static final /* synthetic */ _aF[] gZ;
    public static final /* enum */ _aF gY;
    public static final /* enum */ _aF gV;
    public static final String[] ha;
    public static final /* enum */ _aF gW;

    public static _aF[] values() {
        return (_aF[])gZ.clone();
    }

    static {
        String[] stringArray = new String[hb[0]];
        stringArray[_aF.hb[1]] = "HUE";
        stringArray[_aF.hb[2]] = "SATURATION";
        stringArray[_aF.hb[3]] = "BRIGHTNESS";
        stringArray[_aF.hb[4]] = "SPECIAL";
        ha = stringArray;
        gV = new _aF();
        gW = new _aF();
        gX = new _aF();
        gY = new _aF();
        _aF[] _aFArray = new _aF[hb[13]];
        _aFArray[_aF.hb[14]] = gV;
        _aFArray[_aF.hb[15]] = gW;
        _aFArray[_aF.hb[16]] = gX;
        _aFArray[_aF.hb[17]] = gY;
        gZ = _aFArray;
    }

    public static _aF valueOf(String string) {
        return Enum.valueOf(_aF.class, string);
    }
}

