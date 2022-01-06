/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _bu
 */
public class _bu_0
extends _bA {
    public static final String[] lQ;
    public static final int[] pd;

    static {
        pd = new int[]{0, 1, 1, 2, 0, 1};
        String[] stringArray = new String[pd[3]];
        stringArray[_bu_0.pd[4]] = "FPS";
        stringArray[_bu_0.pd[5]] = "Displays your FPS on screen.";
        lQ = stringArray;
    }

    public _bu_0() {
        super(lQ[pd[0]], lQ[pd[1]], _aL.hD, pd[2]);
    }
}

