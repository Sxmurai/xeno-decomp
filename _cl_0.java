/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _cl
 */
public final class _cl_0
extends Enum<_cl_0> {
    public static final /* synthetic */ _cl_0[] pK;
    public static final /* enum */ _cl_0 pF;
    public static final String[] pL;
    public static final /* enum */ _cl_0 pD;
    public static final /* enum */ _cl_0 pG;
    public static final /* enum */ _cl_0 pH;
    public static final /* enum */ _cl_0 pI;
    public static final /* enum */ _cl_0 pE;
    public static final int[] pM;
    public static final /* enum */ _cl_0 pJ;

    public static _cl_0[] values() {
        return (_cl_0[])pK.clone();
    }

    static {
        pM = new int[]{7, 0, 1, 2, 3, 4, 5, 6, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 0, 1, 2, 3, 4, 5, 6};
        String[] stringArray = new String[pM[0]];
        stringArray[_cl_0.pM[1]] = "FILL";
        stringArray[_cl_0.pM[2]] = "OUTLINE";
        stringArray[_cl_0.pM[3]] = "BOTH";
        stringArray[_cl_0.pM[4]] = "GLOW";
        stringArray[_cl_0.pM[5]] = "REVERSE";
        stringArray[_cl_0.pM[6]] = "CLAW";
        stringArray[_cl_0.pM[7]] = "NONE";
        pL = stringArray;
        pD = new _cl_0();
        pE = new _cl_0();
        pF = new _cl_0();
        pG = new _cl_0();
        pH = new _cl_0();
        pI = new _cl_0();
        pJ = new _cl_0();
        _cl_0[] _cl_0Array = new _cl_0[pM[22]];
        _cl_0Array[_cl_0.pM[23]] = pD;
        _cl_0Array[_cl_0.pM[24]] = pE;
        _cl_0Array[_cl_0.pM[25]] = pF;
        _cl_0Array[_cl_0.pM[26]] = pG;
        _cl_0Array[_cl_0.pM[27]] = pH;
        _cl_0Array[_cl_0.pM[28]] = pI;
        _cl_0Array[_cl_0.pM[29]] = pJ;
        pK = _cl_0Array;
    }

    public static _cl_0 valueOf(String string) {
        return Enum.valueOf(_cl_0.class, string);
    }
}

