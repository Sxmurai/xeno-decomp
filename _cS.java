/*
 * Decompiled with CFR 0.152.
 */
public class _cS
extends _bA {
    public static _cJ sH;
    public static final int[] sJ;
    public static final String[] sI;
    public static _cS sG;

    static {
        sJ = new int[]{0, 1, 0, 1, 0, 3, 0, 1, 2, 2};
        String[] stringArray = new String[sJ[5]];
        stringArray[_cS.sJ[6]] = "ItemPhysics";
        stringArray[_cS.sJ[7]] = "gives physics to dropped items";
        stringArray[_cS.sJ[8]] = "Scale";
        sI = stringArray;
        sH = new _cJ(sI[sJ[9]], 0.5, 0.0, 5.0, 0.1);
    }

    public _cS() {
        super(sI[sJ[0]], sI[sJ[1]], sJ[2], _aL.hz);
        _bd_0[] _bd_0Array = new _bd_0[sJ[3]];
        _bd_0Array[_cS.sJ[4]] = sH;
        this.addSettings(_bd_0Array);
        sG = this;
    }
}

