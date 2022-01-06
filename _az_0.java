//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 */
import java.awt.Color;
import net.minecraft.entity.Entity;

/*
 * Renamed from _az
 */
public class _az_0
extends _bA {
    public static final String[] lQ;
    public _cJ go;
    public _cs_0 gm = new _cs_0(lQ[pd[2]], lQ[pd[3]]);
    public _bP gq = null;
    public _k_0 gn = new _k_0(lQ[pd[4]], pd[5]);
    public _cA gp;
    public static final int[] pd;

    public _az_0() {
        super(lQ[pd[0]], lQ[pd[1]], _aL.hC);
        this.go = new _cJ(lQ[pd[6]], 0.5, 0.1, 2.0, 0.1);
        this.gp = new _cA(lQ[pd[7]], Color.CYAN);
        _bd_0[] _bd_0Array = new _bd_0[pd[8]];
        _bd_0Array[_az_0.pd[9]] = this.gn;
        _bd_0Array[_az_0.pd[10]] = this.go;
        _bd_0Array[_az_0.pd[11]] = this.gp;
        this.addSettings(_bd_0Array);
    }

    @Override
    public void onRenderWorld() {
        if (this.gn.isEnabled() && this.gq != null) {
            _ag_0.drawTracer((Entity)this.gq, this.go.getFloatValue(), this.gp.getColor());
        }
    }

    @Override
    public void onDisable() {
        this.gq.despawn();
        this.gq = null;
    }

    @Override
    public void onEnable() {
        this.gq = new _bP(this.gm.getText());
        this.pb.world.playerEntities.add(this.gq);
    }

    static {
        pd = new int[]{0, 1, 2, 3, 4, 1, 5, 6, 3, 0, 1, 2, 7, 0, 1, 2, 3, 4, 5, 6};
        String[] stringArray = new String[pd[12]];
        stringArray[_az_0.pd[13]] = "FakePlayer";
        stringArray[_az_0.pd[14]] = "spawns you... but it ain't you";
        stringArray[_az_0.pd[15]] = "Name";
        stringArray[_az_0.pd[16]] = "FakePlayer";
        stringArray[_az_0.pd[17]] = "Tracer";
        stringArray[_az_0.pd[18]] = "LineWidth";
        stringArray[_az_0.pd[19]] = "TracerColour";
        lQ = stringArray;
    }
}

