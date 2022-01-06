//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 */
public class _aY
extends _bA {
    public static final String[] lQ;
    public static final int[] pd;

    static {
        pd = new int[]{0, 1, 2, 0, 1};
        String[] stringArray = new String[pd[2]];
        stringArray[_aY.pd[3]] = "Jetpack";
        stringArray[_aY.pd[4]] = "Makes you go up when you jump.";
        lQ = stringArray;
    }

    @Override
    public void onUpdate() {
        if (this.pb.gameSettings.keyBindJump.pressed) {
            this.pb.player.jump();
        }
    }

    public _aY() {
        super(lQ[pd[0]], lQ[pd[1]], _aL.hy);
    }
}

