/*
 * Decompiled with CFR 0.152.
 */
public final class _aL
extends Enum<_aL> {
    public static final /* enum */ _aL hB;
    public static final /* enum */ _aL hz;
    public static final /* enum */ _aL hy;
    public static final /* enum */ _aL hx;
    public static final /* synthetic */ _aL[] hF;
    public static final /* enum */ _aL hD;
    public String hE;
    public static final String[] hG;
    public static final int[] hH;
    public static final /* enum */ _aL hA;
    public static final /* enum */ _aL hC;

    public static _aL[] values() {
        return (_aL[])hF.clone();
    }

    public _aL(String string2) {
        this.hE = string2;
    }

    static {
        hH = new int[]{14, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0, 0, 1, 2, 1, 3, 4, 2, 5, 6, 3, 7, 8, 4, 9, 10, 5, 11, 12, 6, 13, 7, 0, 1, 2, 3, 4, 5, 6};
        String[] stringArray = new String[hH[0]];
        stringArray[_aL.hH[1]] = "COMBAT";
        stringArray[_aL.hH[2]] = "Combat";
        stringArray[_aL.hH[3]] = "MOVEMENT";
        stringArray[_aL.hH[4]] = "Movement";
        stringArray[_aL.hH[5]] = "RENDER";
        stringArray[_aL.hH[6]] = "Render";
        stringArray[_aL.hH[7]] = "PLAYER";
        stringArray[_aL.hH[8]] = "Player";
        stringArray[_aL.hH[9]] = "CLIENT";
        stringArray[_aL.hH[10]] = "Client";
        stringArray[_aL.hH[11]] = "MISC";
        stringArray[_aL.hH[12]] = "Misc";
        stringArray[_aL.hH[13]] = "HUD";
        stringArray[_aL.hH[14]] = "HUD";
        hG = stringArray;
        hx = new _aL(hG[hH[17]]);
        hy = new _aL(hG[hH[20]]);
        hz = new _aL(hG[hH[23]]);
        hA = new _aL(hG[hH[26]]);
        hB = new _aL(hG[hH[29]]);
        hC = new _aL(hG[hH[32]]);
        hD = new _aL(hG[hH[35]]);
        _aL[] _aLArray = new _aL[hH[36]];
        _aLArray[_aL.hH[37]] = hx;
        _aLArray[_aL.hH[38]] = hy;
        _aLArray[_aL.hH[39]] = hz;
        _aLArray[_aL.hH[40]] = hA;
        _aLArray[_aL.hH[41]] = hB;
        _aLArray[_aL.hH[42]] = hC;
        _aLArray[_aL.hH[43]] = hD;
        hF = _aLArray;
    }

    public static _aL valueOf(String string) {
        return Enum.valueOf(_aL.class, string);
    }
}

