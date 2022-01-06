//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _ba
 */
public class _ba_0
extends _bA {
    public static _ba_0 je;
    public static final String[] lQ;
    public static final int[] pd;

    static {
        pd = new int[]{0, 1, 0, 0, 1, 2, 0, 1};
        String[] stringArray = new String[pd[5]];
        stringArray[_ba_0.pd[6]] = "Fly";
        stringArray[_ba_0.pd[7]] = "lets u fly lol";
        lQ = stringArray;
    }

    @Override
    public void onUpdate() {
        if (this.pb.player != null) {
            this.pb.player.capabilities.isFlying = pd[4];
        }
    }

    @Override
    public void onDisable() {
        if (this.pb.player != null) {
            this.pb.player.capabilities.isFlying = pd[3];
        }
    }

    public _ba_0() {
        super(lQ[pd[0]], lQ[pd[1]], pd[2], _aL.hy);
        je = this;
    }
}

