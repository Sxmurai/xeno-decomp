/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _ax
 */
public class _ax_0
extends _bA {
    public static _k_0 gf;
    public static final String[] lQ;
    public _k_0 ge = new _k_0(lQ[pd[2]], pd[3]);
    public static final int[] pd;

    @Override
    public void onNonToggledUpdate() {
        if (this.ge.isEnabled()) {
            _as_0.fF.reset();
            this.ge.toggle();
        }
    }

    public _ax_0() {
        super(lQ[pd[0]], lQ[pd[1]], _aL.hD);
        _bd_0[] _bd_0Array = new _bd_0[pd[4]];
        _bd_0Array[_ax_0.pd[5]] = gf;
        this.addSettings(_bd_0Array);
    }

    static {
        pd = new int[]{0, 1, 2, 0, 1, 0, 4, 0, 1, 2, 3, 3, 1};
        String[] stringArray = new String[pd[6]];
        stringArray[_ax_0.pd[7]] = "HUD";
        stringArray[_ax_0.pd[8]] = "display the hud (required for hud to display!)";
        stringArray[_ax_0.pd[9]] = "EditorReset";
        stringArray[_ax_0.pd[10]] = "Blur";
        lQ = stringArray;
        gf = new _k_0(lQ[pd[11]], pd[12]);
    }
}

