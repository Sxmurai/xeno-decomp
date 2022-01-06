//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 */
import net.minecraft.init.Blocks;

public class _cD
extends _bA {
    public static final int[] rm = new int[]{0, 1, 2, 1, 0, 3, 0, 1, 2};
    public static final String[] rl;
    public _cJ rk = new _cJ(rl[rm[2]], 0.5, 0.3, 1.0, 0.1);

    static {
        String[] stringArray = new String[rm[5]];
        stringArray[_cD.rm[6]] = "IceSpeed";
        stringArray[_cD.rm[7]] = "change the speed of ice";
        stringArray[_cD.rm[8]] = "Speed";
        rl = stringArray;
    }

    @Override
    public void onDisable() {
        Blocks.ICE.slipperiness = 0.98f;
        Blocks.PACKED_ICE.slipperiness = 0.98f;
        Blocks.FROSTED_ICE.slipperiness = 0.98f;
    }

    public _cD() {
        super(rl[rm[0]], rl[rm[1]], _aL.hy);
        _bd_0[] _bd_0Array = new _bd_0[rm[3]];
        _bd_0Array[_cD.rm[4]] = this.rk;
        this.addSettings(_bd_0Array);
    }

    @Override
    public void onUpdate() {
        Blocks.ICE.slipperiness = this.rk.getFloatValue();
        Blocks.PACKED_ICE.slipperiness = this.rk.getFloatValue();
        Blocks.FROSTED_ICE.slipperiness = this.rk.getFloatValue();
    }
}

