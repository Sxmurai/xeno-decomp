/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _i
 */
public class _i_0
extends _bA {
    public static _cJ G;
    public static final String[] lQ;
    public static _cd_0 H;
    public static final int[] pd;

    public _i_0() {
        super(lQ[pd[0]], lQ[pd[1]], pd[2], _aL.hB);
        _bd_0[] _bd_0Array = new _bd_0[pd[3]];
        _bd_0Array[_i_0.pd[4]] = G;
        this.addSettings(_bd_0Array);
    }

    static {
        pd = new int[]{0, 1, 0, 1, 0, 6, 0, 1, 2, 3, 4, 5, 2, 3, 2, 0, 4, 1, 5};
        String[] stringArray = new String[pd[5]];
        stringArray[_i_0.pd[6]] = "CustomFont";
        stringArray[_i_0.pd[7]] = "change font to comfortaa";
        stringArray[_i_0.pd[8]] = "Shadow";
        stringArray[_i_0.pd[9]] = "Font";
        stringArray[_i_0.pd[10]] = "Comfortaa";
        stringArray[_i_0.pd[11]] = "Red Hat Mono";
        lQ = stringArray;
        G = new _cJ(lQ[pd[12]], 1.0, 0.0, 1.0, 0.05);
        String[] stringArray2 = new String[pd[14]];
        stringArray2[_i_0.pd[15]] = lQ[pd[16]];
        stringArray2[_i_0.pd[17]] = lQ[pd[18]];
        H = new _cd_0(lQ[pd[13]], stringArray2);
    }
}

