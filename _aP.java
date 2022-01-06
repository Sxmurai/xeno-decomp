/*
 * Decompiled with CFR 0.152.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class _aP
extends Enum<_aP> {
    public static final /* enum */ _aP id;
    public static final /* enum */ _aP ie;
    public static final int[] ih;
    public static final /* synthetic */ _aP[] if;
    public static final /* enum */ _aP ic;
    public static final String[] ig;

    public static _aP[] values() {
        return (_aP[])if.clone();
    }

    static {
        ih = new int[]{3, 0, 1, 2, 0, 0, 1, 1, 2, 2, 3, 0, 1, 2};
        String[] stringArray = new String[ih[0]];
        stringArray[_aP.ih[1]] = "PRE";
        stringArray[_aP.ih[2]] = "POST";
        stringArray[_aP.ih[3]] = "PERI";
        ig = stringArray;
        ic = new _aP();
        id = new _aP();
        ie = new _aP();
        _aP[] _aPArray = new _aP[ih[10]];
        _aPArray[_aP.ih[11]] = ic;
        _aPArray[_aP.ih[12]] = id;
        _aPArray[_aP.ih[13]] = ie;
        if = _aPArray;
    }

    public static _aP valueOf(String string) {
        return Enum.valueOf(_aP.class, string);
    }
}

