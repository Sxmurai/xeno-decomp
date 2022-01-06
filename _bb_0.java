//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Items
 */
import net.minecraft.init.Items;

/*
 * Renamed from _bb
 */
public class _bb_0
extends _bA {
    public static final String[] lQ;
    public static final int[] pd;
    public _cJ jh = new _cJ(lQ[pd[2]], 0.0, 0.0, 3.0, 1.0);

    public _bb_0() {
        super(lQ[pd[0]], lQ[pd[1]], _aL.hx);
        this.addSettings(new _bd_0[pd[3]]);
    }

    static {
        pd = new int[]{0, 1, 2, 0, 0, 3, 0, 1, 2};
        String[] stringArray = new String[pd[5]];
        stringArray[_bb_0.pd[6]] = "FastXP";
        stringArray[_bb_0.pd[7]] = "throw xp bottles very fast";
        stringArray[_bb_0.pd[8]] = "Delay";
        lQ = stringArray;
    }

    @Override
    public void onUpdate() {
        if (this.nullCheck()) {
            return;
        }
        if (this.pb.player.getHeldItemMainhand().getItem() == Items.EXPERIENCE_BOTTLE || this.pb.player.getHeldItemOffhand().getItem() == Items.EXPERIENCE_BOTTLE) {
            this.pb.rightClickDelayTimer = pd[4];
        }
    }
}

