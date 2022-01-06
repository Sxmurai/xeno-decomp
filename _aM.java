/*
 * Decompiled with CFR 0.152.
 */
public final class _aM
extends Enum<_aM> {
    public static final /* enum */ _aM hL;
    public static final /* enum */ _aM hK;
    public static final int[] hP;
    public static final /* enum */ _aM hM;
    public static final String[] hO;
    public static final /* enum */ _aM hI;
    public static final /* synthetic */ _aM[] hN;
    public static final /* enum */ _aM hJ;

    public static _aM valueOf(String string) {
        return Enum.valueOf(_aM.class, string);
    }

    public static _aM[] values() {
        return (_aM[])hN.clone();
    }

    static {
        hP = new int[]{5, 0, 1, 2, 3, 4, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 0, 1, 2, 3, 4};
        String[] stringArray = new String[hP[0]];
        stringArray[_aM.hP[1]] = "West";
        stringArray[_aM.hP[2]] = "South";
        stringArray[_aM.hP[3]] = "North";
        stringArray[_aM.hP[4]] = "East";
        stringArray[_aM.hP[5]] = "None";
        hO = stringArray;
        hI = new _aM();
        hJ = new _aM();
        hK = new _aM();
        hL = new _aM();
        hM = new _aM();
        _aM[] _aMArray = new _aM[hP[16]];
        _aMArray[_aM.hP[17]] = hI;
        _aMArray[_aM.hP[18]] = hJ;
        _aMArray[_aM.hP[19]] = hK;
        _aMArray[_aM.hP[20]] = hL;
        _aMArray[_aM.hP[21]] = hM;
        hN = _aMArray;
    }
}

