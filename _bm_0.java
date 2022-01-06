//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _bm
 */
public class _bm_0
extends _bA {
    public static final String[] lQ;
    public _K kf;
    public int kd = pd[2];
    public static final int[] pd;
    public int ke = pd[3];

    public _bm_0() {
        super(lQ[pd[0]], lQ[pd[1]], _aL.hA);
        this.kf = new _K();
    }

    static {
        pd = new int[]{0, 1, 1, 1, 0, 1, 1, 2, 0, 1};
        String[] stringArray = new String[pd[7]];
        stringArray[_bm_0.pd[8]] = "AntiAFK";
        stringArray[_bm_0.pd[9]] = "stops you from being kicked by the server's AFK timer";
        lQ = stringArray;
    }

    @Override
    public void onUpdate() {
        this.pb.gameSettings.keyBindForward.pressed = pd[5];
        if (this.kf.hasTimeElapsed(1L, pd[6])) {
            this.pb.player.rotationYaw -= 10.0f;
        }
    }

    @Override
    public void onDisable() {
        this.pb.gameSettings.keyBindForward.pressed = pd[4];
    }
}

