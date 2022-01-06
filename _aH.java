/*
 * Decompiled with CFR 0.152.
 */
public final class _aH
extends Enum<_aH> {
    public static final /* enum */ _aH hl;
    public static final int[] ho;
    public static final /* enum */ _aH hj;
    public static final /* enum */ _aH hk;
    public static final String[] hn;
    public static final /* synthetic */ _aH[] hm;

    static {
        ho = new int[]{3, 0, 1, 2, 0, 0, 1, 1, 2, 2, 3, 0, 1, 2};
        String[] stringArray = new String[ho[0]];
        stringArray[_aH.ho[1]] = "Obsidian";
        stringArray[_aH.ho[2]] = "Bedrock";
        stringArray[_aH.ho[3]] = "Double";
        hn = stringArray;
        hj = new _aH();
        hk = new _aH();
        hl = new _aH();
        _aH[] _aHArray = new _aH[ho[10]];
        _aHArray[_aH.ho[11]] = hj;
        _aHArray[_aH.ho[12]] = hk;
        _aHArray[_aH.ho[13]] = hl;
        hm = _aHArray;
    }

    public static _aH[] values() {
        return (_aH[])hm.clone();
    }

    public static _aH valueOf(String string) {
        return Enum.valueOf(_aH.class, string);
    }
}

