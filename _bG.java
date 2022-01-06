//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.player.EntityPlayer
 */
import java.awt.Color;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;

public class _bG
extends _bA {
    public static _k_0 mx;
    public static _k_0 mH;
    public static _cJ mF;
    public static _cA mC;
    public static _k_0 mB;
    public static _bG mw;
    public static final int[] pd;
    public static _cA my;
    public static _cd_0 mG;
    public static _cA mA;
    public static _k_0 mD;
    public static _k_0 mz;
    public static final String[] mI;
    public static _cA mE;

    @Override
    public void onEnable() {
    }

    @Override
    public String getHUDData() {
        return mI[pd[21]] + mG.getMode();
    }

    @Override
    public void onRenderWorld() {
        if (mG.is(mI[pd[14]])) {
            for (Entity entity : this.pb.world.loadedEntityList) {
                if (entity.isInvisible() && !_bG.mH.N) {
                    return;
                }
                if (entity instanceof EntityLiving && !(entity instanceof EntityMob) && mx.isEnabled()) {
                    _ag_0.drawESPBox(entity, (float)mF.getDoubleValue(), my.getColor());
                }
                if (entity instanceof EntityMob && mz.isEnabled()) {
                    _ag_0.drawESPBox(entity, (float)mF.getDoubleValue(), mA.getColor());
                }
                if (!(entity instanceof EntityOtherPlayerMP) || !mx.isEnabled()) continue;
                _ag_0.drawESPBox(entity, (float)mF.getDoubleValue(), mC.getColor());
            }
        }
        if (!mG.is(mI[pd[15]])) {
            for (Entity entity : this.pb.world.loadedEntityList) {
                if (entity.isInvisible() && !_bG.mH.N) {
                    return;
                }
                entity.setGlowing(pd[16]);
            }
        }
        if (mG.is(mI[pd[17]])) {
            for (Entity entity : this.pb.world.loadedEntityList) {
                if (entity.isInvisible() && !_bG.mH.N) {
                    return;
                }
                if (entity instanceof EntityLiving && !(entity instanceof EntityMob) && mx.isEnabled()) {
                    entity.setGlowing(pd[18]);
                    continue;
                }
                if (entity instanceof EntityMob && mz.isEnabled()) {
                    entity.setGlowing(pd[19]);
                    continue;
                }
                if (!(entity instanceof EntityPlayer) || !mB.isEnabled() || entity == this.pb.player) continue;
                entity.setGlowing(pd[20]);
            }
        }
    }

    @Override
    public void onDisable() {
        for (Entity entity : this.pb.world.loadedEntityList) {
            if (entity.isInvisible() && !_bG.mH.N) {
                return;
            }
            entity.setGlowing(pd[13]);
        }
    }

    public _bG() {
        super(mI[pd[0]], mI[pd[1]], pd[2], _aL.hz);
        _bd_0[] _bd_0Array = new _bd_0[pd[3]];
        _bd_0Array[_bG.pd[4]] = mx;
        _bd_0Array[_bG.pd[5]] = mz;
        _bd_0Array[_bG.pd[6]] = mB;
        _bd_0Array[_bG.pd[7]] = mD;
        _bd_0Array[_bG.pd[8]] = my;
        _bd_0Array[_bG.pd[9]] = mA;
        _bd_0Array[_bG.pd[10]] = mC;
        _bd_0Array[_bG.pd[11]] = mF;
        _bd_0Array[_bG.pd[12]] = mG;
        this.addSettings(_bd_0Array);
        mw = this;
    }

    static {
        pd = new int[]{0, 1, 0, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 2, 3, 0, 4, 1, 1, 1, 5, 20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 6, 1, 7, 8, 1, 9, 10, 1, 11, 12, 1, 13, 14, 15, 3, 0, 16, 1, 17, 2, 18, 19, 1};
        String[] stringArray = new String[pd[22]];
        stringArray[_bG.pd[23]] = "ESP";
        stringArray[_bG.pd[24]] = "highlights entities through walls";
        stringArray[_bG.pd[25]] = "Box";
        stringArray[_bG.pd[26]] = "Glow";
        stringArray[_bG.pd[27]] = "Glow";
        stringArray[_bG.pd[28]] = " ";
        stringArray[_bG.pd[29]] = "Passive";
        stringArray[_bG.pd[30]] = "Passive Colour";
        stringArray[_bG.pd[31]] = "Mobs";
        stringArray[_bG.pd[32]] = "Mob Colour";
        stringArray[_bG.pd[33]] = "Players";
        stringArray[_bG.pd[34]] = "Player Colour";
        stringArray[_bG.pd[35]] = "Items";
        stringArray[_bG.pd[36]] = "Item Colour";
        stringArray[_bG.pd[37]] = "Line Width";
        stringArray[_bG.pd[38]] = "Mode";
        stringArray[_bG.pd[39]] = "Outline";
        stringArray[_bG.pd[40]] = "Box";
        stringArray[_bG.pd[41]] = "Glow";
        stringArray[_bG.pd[42]] = "Invisibles";
        mI = stringArray;
        mx = new _k_0(mI[pd[43]], pd[44]);
        my = new _cA(mI[pd[45]], new _cV(Color.GREEN));
        mz = new _k_0(mI[pd[46]], pd[47]);
        mA = new _cA(mI[pd[48]], new _cV(Color.RED));
        mB = new _k_0(mI[pd[49]], pd[50]);
        mC = new _cA(mI[pd[51]], new _cV(Color.CYAN));
        mD = new _k_0(mI[pd[52]], pd[53]);
        mE = new _cA(mI[pd[54]], new _cV(Color.WHITE));
        mF = new _cJ(mI[pd[55]], 3.0, 1.0, 3.0, 0.5);
        String[] stringArray2 = new String[pd[57]];
        stringArray2[_bG.pd[58]] = mI[pd[59]];
        stringArray2[_bG.pd[60]] = mI[pd[61]];
        stringArray2[_bG.pd[62]] = mI[pd[63]];
        mG = new _cd_0(mI[pd[56]], stringArray2);
        mH = new _k_0(mI[pd[64]], pd[65]);
    }
}

