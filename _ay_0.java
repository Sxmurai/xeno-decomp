//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _ay
 */
public class _ay_0
extends _bA {
    public _cJ gj = new _cJ(lQ[pd[3]], 2.5, 1.0, 3.0, 0.5);
    public static final int[] pd = new int[]{0, 1, 0, 2, 1, 0, 3, 0, 1, 2};
    public static final String[] lQ;
    public static _ay_0 gi;

    @Override
    public void onUpdate() {
        if (this.nullCheck() || !this.isEnabled()) {
            return;
        }
        this.pb.player.stepHeight = (float)this.gj.getVal();
    }

    static {
        String[] stringArray = new String[pd[6]];
        stringArray[_ay_0.pd[7]] = "Step";
        stringArray[_ay_0.pd[8]] = "auto jump but better";
        stringArray[_ay_0.pd[9]] = "Up Height";
        lQ = stringArray;
    }

    public _ay_0() {
        super(lQ[pd[0]], lQ[pd[1]], pd[2], _aL.hy);
        _bd_0[] _bd_0Array = new _bd_0[pd[4]];
        _bd_0Array[_ay_0.pd[5]] = this.gj;
        this.addSettings(_bd_0Array);
        gi = this;
    }

    @Override
    public void onDisable() {
        this.pb.player.stepHeight = 0.5f;
    }
}

