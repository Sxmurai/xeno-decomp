/*
 * Decompiled with CFR 0.152.
 */
public class _bK
extends _bA {
    public static final String[] mX;
    public static final int[] pd;
    public static _cd_0 mW;

    static {
        pd = new int[]{0, 1, 1, 1, 0, 5, 0, 1, 2, 3, 4, 2, 2, 0, 3, 1, 4};
        String[] stringArray = new String[pd[5]];
        stringArray[_bK.pd[6]] = "Armour";
        stringArray[_bK.pd[7]] = "Displays your armour on screen.";
        stringArray[_bK.pd[8]] = "Orient";
        stringArray[_bK.pd[9]] = "Across";
        stringArray[_bK.pd[10]] = "Down";
        mX = stringArray;
        String[] stringArray2 = new String[pd[12]];
        stringArray2[_bK.pd[13]] = mX[pd[14]];
        stringArray2[_bK.pd[15]] = mX[pd[16]];
        mW = new _cd_0(mX[pd[11]], stringArray2);
    }

    public _bK() {
        super(mX[pd[0]], mX[pd[1]], _aL.hD, pd[2]);
        _bd_0[] _bd_0Array = new _bd_0[pd[3]];
        _bd_0Array[_bK.pd[4]] = mW;
        this.addSettings(_bd_0Array);
    }
}

