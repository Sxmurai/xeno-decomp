/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _ca
 */
public class _ca_0
extends _bA {
    public static final String[] oy;
    public static _cd_0 ox;
    public static final int[] pd;

    public _ca_0() {
        super(oy[pd[0]], oy[pd[1]], _aL.hD, pd[2]);
        _bd_0[] _bd_0Array = new _bd_0[pd[3]];
        _bd_0Array[_ca_0.pd[4]] = ox;
        this.addSettings(_bd_0Array);
    }

    static {
        pd = new int[]{0, 1, 1, 1, 0, 5, 0, 1, 2, 3, 4, 2, 2, 0, 3, 1, 4};
        String[] stringArray = new String[pd[5]];
        stringArray[_ca_0.pd[6]] = "ClientName";
        stringArray[_ca_0.pd[7]] = "Displays the client's name on screen.";
        stringArray[_ca_0.pd[8]] = "Mode";
        stringArray[_ca_0.pd[9]] = "Text";
        stringArray[_ca_0.pd[10]] = "Image";
        oy = stringArray;
        String[] stringArray2 = new String[pd[12]];
        stringArray2[_ca_0.pd[13]] = oy[pd[14]];
        stringArray2[_ca_0.pd[15]] = oy[pd[16]];
        ox = new _cd_0(oy[pd[11]], stringArray2);
    }
}

