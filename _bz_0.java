/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _bz
 */
public final class _bz_0
extends Enum<_bz_0> {
    public static final /* enum */ _bz_0 lB;
    public static final /* synthetic */ _bz_0[] lE;
    public static final /* enum */ _bz_0 lD;
    public static final String[] lF;
    public static final /* enum */ _bz_0 lC;
    public static final int[] lG;

    public static _bz_0 valueOf(String string) {
        return Enum.valueOf(_bz_0.class, string);
    }

    static {
        lG = new int[]{3, 0, 1, 2, 0, 0, 1, 1, 2, 2, 3, 0, 1, 2};
        String[] stringArray = new String[lG[0]];
        stringArray[_bz_0.lG[1]] = "Normal";
        stringArray[_bz_0.lG[2]] = "Border";
        stringArray[_bz_0.lG[3]] = "Both";
        lF = stringArray;
        lB = new _bz_0();
        lC = new _bz_0();
        lD = new _bz_0();
        _bz_0[] _bz_0Array = new _bz_0[lG[10]];
        _bz_0Array[_bz_0.lG[11]] = lB;
        _bz_0Array[_bz_0.lG[12]] = lC;
        _bz_0Array[_bz_0.lG[13]] = lD;
        lE = _bz_0Array;
    }

    public static _bz_0[] values() {
        return (_bz_0[])lE.clone();
    }
}

