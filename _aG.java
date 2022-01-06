/*
 * Decompiled with CFR 0.152.
 */
public final class _aG
extends Enum<_aG> {
    public static final /* enum */ _aG hc;
    public static final /* enum */ _aG hf;
    public static final int[] hi;
    public static final /* enum */ _aG he;
    public static final String[] hh;
    public static final /* enum */ _aG hd;
    public static final /* synthetic */ _aG[] hg;

    public static _aG valueOf(String string) {
        return Enum.valueOf(_aG.class, string);
    }

    public static _aG[] values() {
        return (_aG[])hg.clone();
    }

    static {
        hi = new int[]{4, 0, 1, 2, 3, 0, 0, 1, 1, 2, 2, 3, 3, 4, 0, 1, 2, 3};
        String[] stringArray = new String[hi[0]];
        stringArray[_aG.hi[1]] = "Blank";
        stringArray[_aG.hi[2]] = "Breakable";
        stringArray[_aG.hi[3]] = "Resistant";
        stringArray[_aG.hi[4]] = "Unbreakable";
        hh = stringArray;
        hc = new _aG();
        hd = new _aG();
        he = new _aG();
        hf = new _aG();
        _aG[] _aGArray = new _aG[hi[13]];
        _aGArray[_aG.hi[14]] = hc;
        _aGArray[_aG.hi[15]] = hd;
        _aGArray[_aG.hi[16]] = he;
        _aGArray[_aG.hi[17]] = hf;
        hg = _aGArray;
    }
}

