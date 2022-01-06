//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.MobEffects
 *  net.minecraft.potion.PotionEffect
 */
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

public class _aO
extends _bA {
    public static final String[] lQ;
    public static _aO hX;
    public static final int[] pd;
    public float hZ;
    public static _cd_0 hY;

    @Override
    public void onUpdate() {
        if (this.nullCheck()) {
            return;
        }
        if (hY.is(lQ[pd[4]])) {
            this.pb.player.addPotionEffect(new PotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, pd[5], pd[6], pd[7], pd[8])));
        }
    }

    @Override
    public void onDisable() {
        this.pb.player.removePotionEffect(MobEffects.NIGHT_VISION);
        if (hY.getValue() == 0) {
            this.pb.gameSettings.gammaSetting = this.hZ;
        }
    }

    @Override
    public void onEnable() {
        this.hZ = this.pb.gameSettings.gammaSetting;
        if (hY.getValue() == 0) {
            this.pb.gameSettings.gammaSetting = 100.0f;
        }
    }

    public _aO() {
        super(lQ[pd[0]], lQ[pd[1]], _aL.hz);
        _bd_0[] _bd_0Array = new _bd_0[pd[2]];
        _bd_0Array[_aO.pd[3]] = hY;
        this.addSettings(_bd_0Array);
        hX = this;
    }

    static {
        pd = new int[]{0, 1, 1, 0, 2, 80950, 1, 0, 0, 3, 7, 0, 1, 2, 3, 4, 5, 6, 4, 2, 0, 5, 1, 6};
        String[] stringArray = new String[pd[10]];
        stringArray[_aO.pd[11]] = "Fullbright";
        stringArray[_aO.pd[12]] = "makes everything bright";
        stringArray[_aO.pd[13]] = "Effect";
        stringArray[_aO.pd[14]] = " ";
        stringArray[_aO.pd[15]] = "Mode";
        stringArray[_aO.pd[16]] = "Gamma";
        stringArray[_aO.pd[17]] = "Effect";
        lQ = stringArray;
        String[] stringArray2 = new String[pd[19]];
        stringArray2[_aO.pd[20]] = lQ[pd[21]];
        stringArray2[_aO.pd[22]] = lQ[pd[23]];
        hY = new _cd_0(lQ[pd[18]], stringArray2);
    }

    @Override
    public String getHUDData() {
        return lQ[pd[9]] + hY.getMode();
    }
}

