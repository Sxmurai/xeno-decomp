/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _o
 */
public final class _o_0
extends Enum<_o_0> {
    public static final int[] aj = new int[]{4, 0, 1, 2, 3, 0, 0, 1, 1, 2, 2, 3, 3, 4, 0, 1, 2, 3};
    public static final String[] ai;
    public static final /* enum */ _o_0 ag;
    public static final /* synthetic */ _o_0[] ah;
    public static final /* enum */ _o_0 af;
    public static final /* enum */ _o_0 ae;
    public static final /* enum */ _o_0 ad;

    public static _o_0[] values() {
        return (_o_0[])ah.clone();
    }

    static {
        String[] stringArray = new String[aj[0]];
        stringArray[_o_0.aj[1]] = "NoEntityCollision";
        stringArray[_o_0.aj[2]] = "AlreadyBlockThere";
        stringArray[_o_0.aj[3]] = "NoNeighbors";
        stringArray[_o_0.aj[4]] = "Ok";
        ai = stringArray;
        ad = new _o_0();
        ae = new _o_0();
        af = new _o_0();
        ag = new _o_0();
        _o_0[] _o_0Array = new _o_0[aj[13]];
        _o_0Array[_o_0.aj[14]] = ad;
        _o_0Array[_o_0.aj[15]] = ae;
        _o_0Array[_o_0.aj[16]] = af;
        _o_0Array[_o_0.aj[17]] = ag;
        ah = _o_0Array;
    }

    public static _o_0 valueOf(String string) {
        return Enum.valueOf(_o_0.class, string);
    }
}

