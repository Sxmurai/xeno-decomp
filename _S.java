//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 */
public class _S
extends _bA {
    public static final String[] lQ;
    public static final int[] pd;

    static {
        pd = new int[]{0, 1, 0, 2, 0, 1};
        String[] stringArray = new String[pd[3]];
        stringArray[_S.pd[4]] = "FastBreak";
        stringArray[_S.pd[5]] = "removes break delay lel";
        lQ = stringArray;
    }

    @Override
    public void onUpdate() {
        this.pb.playerController.blockHitDelay = pd[2];
    }

    public _S() {
        super(lQ[pd[0]], lQ[pd[1]], _aL.hA);
    }
}

