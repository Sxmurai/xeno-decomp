/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _ad
 */
public final class _ad_0
extends Enum<_ad_0> {
    public static final /* enum */ _ad_0 dg;
    public static final int[] dj;
    public static final /* enum */ _ad_0 dd;
    public static final /* synthetic */ _ad_0[] dh;
    public static final /* enum */ _ad_0 de;
    public static final String[] di;
    public static final /* enum */ _ad_0 df;

    public static _ad_0[] values() {
        return (_ad_0[])dh.clone();
    }

    static {
        dj = new int[]{4, 0, 1, 2, 3, 0, 0, 1, 1, 2, 2, 3, 3, 4, 0, 1, 2, 3};
        String[] stringArray = new String[dj[0]];
        stringArray[_ad_0.dj[1]] = "HUE";
        stringArray[_ad_0.dj[2]] = "SATURATION";
        stringArray[_ad_0.dj[3]] = "BRIGHTNESS";
        stringArray[_ad_0.dj[4]] = "SPECIAL";
        di = stringArray;
        dd = new _ad_0();
        de = new _ad_0();
        df = new _ad_0();
        dg = new _ad_0();
        _ad_0[] _ad_0Array = new _ad_0[dj[13]];
        _ad_0Array[_ad_0.dj[14]] = dd;
        _ad_0Array[_ad_0.dj[15]] = de;
        _ad_0Array[_ad_0.dj[16]] = df;
        _ad_0Array[_ad_0.dj[17]] = dg;
        dh = _ad_0Array;
    }

    public static _ad_0 valueOf(String string) {
        return Enum.valueOf(_ad_0.class, string);
    }
}

