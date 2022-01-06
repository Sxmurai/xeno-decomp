/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _bl
 */
public final class _bl_0
extends Enum<_bl_0> {
    public static final /* enum */ _bl_0 jZ;
    public static final /* enum */ _bl_0 jX;
    public static final /* synthetic */ _bl_0[] ka;
    public static final String[] kb;
    public static final /* enum */ _bl_0 jW;
    public static final /* enum */ _bl_0 jV;
    public static final int[] kc;
    public static final /* enum */ _bl_0 jY;

    static {
        kc = new int[]{5, 0, 1, 2, 3, 4, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 0, 1, 2, 3, 4};
        String[] stringArray = new String[kc[0]];
        stringArray[_bl_0.kc[1]] = "Fill";
        stringArray[_bl_0.kc[2]] = "Outline";
        stringArray[_bl_0.kc[3]] = "Both";
        stringArray[_bl_0.kc[4]] = "Claw";
        stringArray[_bl_0.kc[5]] = "Glow";
        kb = stringArray;
        jV = new _bl_0();
        jW = new _bl_0();
        jX = new _bl_0();
        jY = new _bl_0();
        jZ = new _bl_0();
        _bl_0[] _bl_0Array = new _bl_0[kc[16]];
        _bl_0Array[_bl_0.kc[17]] = jV;
        _bl_0Array[_bl_0.kc[18]] = jW;
        _bl_0Array[_bl_0.kc[19]] = jX;
        _bl_0Array[_bl_0.kc[20]] = jY;
        _bl_0Array[_bl_0.kc[21]] = jZ;
        ka = _bl_0Array;
    }

    public static _bl_0[] values() {
        return (_bl_0[])ka.clone();
    }

    public static _bl_0 valueOf(String string) {
        return Enum.valueOf(_bl_0.class, string);
    }
}

