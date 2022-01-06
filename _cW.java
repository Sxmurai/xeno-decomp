//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.monster.EntityMob
 */
import java.awt.Color;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityMob;

public class _cW
extends _bA {
    public _cJ tb = new _cJ(tc[td[3]], 1.0, 0.1, 2.0, 0.1);
    public static _cA ta;
    public static _cA sW;
    public static _k_0 sV;
    public static final String[] tc;
    public static _k_0 sZ;
    public static final int[] td;
    public static _k_0 sX;
    public static _cA sY;

    static {
        td = new int[]{0, 1, 0, 2, 7, 0, 1, 2, 3, 4, 5, 6, 0, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 3, 1, 4, 5, 1, 6, 7, 1, 8};
        String[] stringArray = new String[td[13]];
        stringArray[_cW.td[14]] = "Tracers";
        stringArray[_cW.td[15]] = "draws lines to entities";
        stringArray[_cW.td[16]] = "Width";
        stringArray[_cW.td[17]] = "Passives";
        stringArray[_cW.td[18]] = "Passive Colour";
        stringArray[_cW.td[19]] = "Mobs";
        stringArray[_cW.td[20]] = "Mob Colour";
        stringArray[_cW.td[21]] = "Players";
        stringArray[_cW.td[22]] = "Player Colour";
        tc = stringArray;
        sV = new _k_0(tc[td[23]], td[24]);
        sW = new _cA(tc[td[25]], new _cV(Color.GREEN));
        sX = new _k_0(tc[td[26]], td[27]);
        sY = new _cA(tc[td[28]], new _cV(Color.RED));
        sZ = new _k_0(tc[td[29]], td[30]);
        ta = new _cA(tc[td[31]], new _cV(Color.WHITE));
    }

    @Override
    public void onRenderWorld() {
        this.pb.gameSettings.viewBobbing = td[12];
        for (Entity entity : this.pb.world.loadedEntityList) {
            if (entity instanceof EntityLiving && !(entity instanceof EntityMob) && _cW.sV.N) {
                _ag_0.drawTracer(entity, this.tb.getFloatValue(), sW.getColor());
            }
            if (entity instanceof EntityLiving && entity instanceof EntityMob && _cW.sX.N) {
                _ag_0.drawTracer(entity, this.tb.getFloatValue(), sY.getColor());
            }
            if (!(entity instanceof EntityOtherPlayerMP) || !_cW.sZ.N) continue;
            _ag_0.drawTracer(entity, this.tb.getFloatValue(), ta.getColor());
        }
    }

    public _cW() {
        super(tc[td[0]], tc[td[1]], td[2], _aL.hz);
        _bd_0[] _bd_0Array = new _bd_0[td[4]];
        _bd_0Array[_cW.td[5]] = sV;
        _bd_0Array[_cW.td[6]] = sW;
        _bd_0Array[_cW.td[7]] = sX;
        _bd_0Array[_cW.td[8]] = sY;
        _bd_0Array[_cW.td[9]] = sZ;
        _bd_0Array[_cW.td[10]] = ta;
        _bd_0Array[_cW.td[11]] = this.tb;
        this.addSettings(_bd_0Array);
    }
}

