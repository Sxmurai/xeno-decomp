//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 */
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

/*
 * Renamed from _ci
 */
public class _ci_0
extends _bA {
    public static final int[] ps = new int[]{0, 1, 2, 3, 4, 1, 5, 0, 6, 0, 5, 0, 1, 2, 3, 4, 1, 7, 0, 1, 2, 3, 4, 5, 6};
    public _k_0 po;
    public static final String[] pr;
    public _K pq;
    public _k_0 pp;
    public _k_0 pn;
    public _cJ pl = new _cJ(pr[ps[2]], 5.0, 2.0, 7.0, 1.0);
    public _cJ pm = new _cJ(pr[ps[3]], 20.0, 0.0, 40.0, 1.0);

    public _ci_0() {
        super(pr[ps[0]], pr[ps[1]], _aL.hx);
        this.pn = new _k_0(pr[ps[4]], ps[5]);
        this.po = new _k_0(pr[ps[6]], ps[7]);
        this.pp = new _k_0(pr[ps[8]], ps[9]);
        this.pq = new _K();
        _bd_0[] _bd_0Array = new _bd_0[ps[10]];
        _bd_0Array[_ci_0.ps[11]] = this.pl;
        _bd_0Array[_ci_0.ps[12]] = this.pm;
        _bd_0Array[_ci_0.ps[13]] = this.pn;
        _bd_0Array[_ci_0.ps[14]] = this.po;
        _bd_0Array[_ci_0.ps[15]] = this.pp;
        this.addSettings(_bd_0Array);
    }

    public void doHoleFill() {
        for (EntityPlayer entityPlayer : this.pb.world.playerEntities) {
            if (entityPlayer == this.pb.player || !(this.pb.player.getDistanceSq((Entity)entityPlayer) <= _ac_0.square(this.pl.getFloatValue()))) continue;
            for (_cH _cH2 : _ao_0.getHoles(5.0, entityPlayer)) {
                if (!this.pq.hasTimeElapsed((long)this.pm.getDoubleValue(), ps[16]) || _ao_0.isInHole((EntityPlayer)this.pb.player)) continue;
                _cE.placeBlock(_cH2.rB, _be_0.findObiInHotbar(), this.po.isEnabled(), this.pp.isEnabled(), this.pn.isEnabled());
            }
        }
    }

    static {
        String[] stringArray = new String[ps[17]];
        stringArray[_ci_0.ps[18]] = "HoleFill";
        stringArray[_ci_0.ps[19]] = "fills all the holes :smirk: :smirk: :smirk:";
        stringArray[_ci_0.ps[20]] = "Range";
        stringArray[_ci_0.ps[21]] = "PlaceDelayMS";
        stringArray[_ci_0.ps[22]] = "Swing";
        stringArray[_ci_0.ps[23]] = "Rotate";
        stringArray[_ci_0.ps[24]] = "RotateBack";
        pr = stringArray;
    }

    @Override
    public void onUpdate() {
        if (this.nullCheck()) {
            return;
        }
        this.doHoleFill();
    }
}

