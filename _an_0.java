/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _an
 */
public final class _an_0
extends Enum<_an_0> {
    public static final int[] eS = new int[]{3, 0, 1, 2, 0, 0, 1, 1, 2, 2, 3, 0, 1, 2};
    public static final /* enum */ _an_0 eP;
    public static final /* enum */ _an_0 eO;
    public static final String[] eR;
    public static final /* enum */ _an_0 eN;
    public static final /* synthetic */ _an_0[] eQ;

    public static _an_0[] values() {
        return (_an_0[])eQ.clone();
    }

    public static _an_0 valueOf(String string) {
        return Enum.valueOf(_an_0.class, string);
    }

    static {
        String[] stringArray = new String[eS[0]];
        stringArray[_an_0.eS[1]] = "Obsidian";
        stringArray[_an_0.eS[2]] = "Bedrock";
        stringArray[_an_0.eS[3]] = "Mixed";
        eR = stringArray;
        eN = new _an_0();
        eO = new _an_0();
        eP = new _an_0();
        _an_0[] _an_0Array = new _an_0[eS[10]];
        _an_0Array[_an_0.eS[11]] = eN;
        _an_0Array[_an_0.eS[12]] = eO;
        _an_0Array[_an_0.eS[13]] = eP;
        eQ = _an_0Array;
    }
}

