/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _c
 */
public final class _c_0
extends Enum<_c_0> {
    public static final int[] k = new int[]{3, 0, 1, 2, 0, 0, 1, 1, 2, 2, 3, 0, 1, 2};
    public static final /* enum */ _c_0 g;
    public static final String[] j;
    public static final /* synthetic */ _c_0[] i;
    public static final /* enum */ _c_0 f;
    public static final /* enum */ _c_0 h;

    static {
        String[] stringArray = new String[k[0]];
        stringArray[_c_0.k[1]] = "CURRENT";
        stringArray[_c_0.k[2]] = "AVERAGE";
        stringArray[_c_0.k[3]] = "NONE";
        j = stringArray;
        f = new _c_0();
        g = new _c_0();
        h = new _c_0();
        _c_0[] _c_0Array = new _c_0[k[10]];
        _c_0Array[_c_0.k[11]] = f;
        _c_0Array[_c_0.k[12]] = g;
        _c_0Array[_c_0.k[13]] = h;
        i = _c_0Array;
    }

    public static _c_0[] values() {
        return (_c_0[])i.clone();
    }

    public static _c_0 valueOf(String string) {
        return Enum.valueOf(_c_0.class, string);
    }
}

