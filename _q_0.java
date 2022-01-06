//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _q
 */
public class _q_0
extends _bA {
    public static final String[] lQ;
    public static _q_0 am;
    public static final int[] pd;
    public _cd_0 an;

    @Override
    public void onUpdate() {
        if (this.nullCheck()) {
            return;
        }
        if (this.an.is(lQ[pd[9]])) {
            if (this.pb.gameSettings.keyBindForward.isKeyDown()) {
                this.pb.player.setSprinting(pd[10]);
            } else {
                this.pb.player.setSprinting(pd[11]);
            }
        } else if (this.an.is(lQ[pd[12]])) {
            this.pb.player.setSprinting(pd[13]);
        }
    }

    public _q_0() {
        super(lQ[pd[0]], lQ[pd[1]], pd[2], _aL.hy);
        String[] stringArray = new String[pd[4]];
        stringArray[_q_0.pd[5]] = lQ[pd[6]];
        stringArray[_q_0.pd[7]] = lQ[pd[8]];
        this.an = new _cd_0(lQ[pd[3]], stringArray);
        this.addSetting(this.an);
        am = this;
    }

    static {
        pd = new int[]{0, 1, 0, 2, 2, 0, 3, 1, 4, 5, 1, 0, 6, 1, 7, 0, 1, 2, 3, 4, 5, 6};
        String[] stringArray = new String[pd[14]];
        stringArray[_q_0.pd[15]] = "Sprint";
        stringArray[_q_0.pd[16]] = "run all the time lmao";
        stringArray[_q_0.pd[17]] = "Mode";
        stringArray[_q_0.pd[18]] = "Legit";
        stringArray[_q_0.pd[19]] = "Omni";
        stringArray[_q_0.pd[20]] = "Legit";
        stringArray[_q_0.pd[21]] = "Omni";
        lQ = stringArray;
    }
}

