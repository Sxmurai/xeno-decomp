/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;

/*
 * Renamed from _ck
 */
public class _ck_0
extends _bA {
    public static int pz;
    public _cA py = new _cA(pB[pC[3]], new _cV(pC[4], pC[5], pC[6], pC[7]));
    public static final String[] pB;
    public static final int[] pC;
    public static Color pA;

    static {
        pC = new int[]{0, 1, 0, 2, 0, 128, 255, 255, 1, 0, 0, 3, 0, 1, 2, -1};
        String[] stringArray = new String[pC[11]];
        stringArray[_ck_0.pC[12]] = "Colors";
        stringArray[_ck_0.pC[13]] = "change the clients colour";
        stringArray[_ck_0.pC[14]] = "Colour";
        pB = stringArray;
        pz = pC[15];
        pA = Color.WHITE;
    }

    @Override
    public void onNonToggledUpdate() {
        this.lM = pC[10];
        pz = this.py.getColor().getRGB();
        pA = this.py.getColor();
    }

    public _ck_0() {
        super(pB[pC[0]], pB[pC[1]], pC[2], _aL.hB);
        _bd_0[] _bd_0Array = new _bd_0[pC[8]];
        _bd_0Array[_ck_0.pC[9]] = this.py;
        this.addSettings(_bd_0Array);
    }
}

