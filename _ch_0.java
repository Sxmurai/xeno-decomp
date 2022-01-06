/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _ch
 */
public final class _ch_0
extends Enum<_ch_0> {
    public static final /* enum */ _ch_0 pg;
    public static final int[] pk;
    public static final /* enum */ _ch_0 pf;
    public static final /* enum */ _ch_0 ph;
    public static final String[] pj;
    public static final /* synthetic */ _ch_0[] pi;

    public static _ch_0[] values() {
        return (_ch_0[])pi.clone();
    }

    public static _ch_0 valueOf(String string) {
        return Enum.valueOf(_ch_0.class, string);
    }

    static {
        pk = new int[]{3, 0, 1, 2, 0, 0, 1, 1, 2, 2, 3, 0, 1, 2};
        String[] stringArray = new String[pk[0]];
        stringArray[_ch_0.pk[1]] = "INFO";
        stringArray[_ch_0.pk[2]] = "WARN";
        stringArray[_ch_0.pk[3]] = "ALERT";
        pj = stringArray;
        pf = new _ch_0();
        pg = new _ch_0();
        ph = new _ch_0();
        _ch_0[] _ch_0Array = new _ch_0[pk[10]];
        _ch_0Array[_ch_0.pk[11]] = pf;
        _ch_0Array[_ch_0.pk[12]] = pg;
        _ch_0Array[_ch_0.pk[13]] = ph;
        pi = _ch_0Array;
    }
}

