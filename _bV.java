/*
 * Decompiled with CFR 0.152.
 */
public class _bV
extends _bA {
    public static final String[] nW;
    public static final int[] pd;

    static {
        pd = new int[]{0, 1, 1, 2, 0, 1};
        String[] stringArray = new String[pd[3]];
        stringArray[_bV.pd[4]] = "TPS";
        stringArray[_bV.pd[5]] = "Displays the current server's TPS on screen.";
        nW = stringArray;
    }

    public _bV() {
        super(nW[pd[0]], nW[pd[1]], _aL.hD, pd[2]);
    }
}

