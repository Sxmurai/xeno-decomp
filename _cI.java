//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.BlockPos
 */
import java.util.Objects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

public class _cI
extends _bA {
    public static final String[] rR;
    public static _cd_0 rF;
    public static _cd_0 rH;
    public static _k_0 rK;
    public static _cJ rO;
    public int rP;
    public static _k_0 rL;
    public static final int[] rS;
    public static _cJ rM;
    public static _cA rJ;
    public static _cd_0 rD;
    public static _cJ rG;
    public boolean rQ = rS[2];
    public static _cJ rE;
    public static _cJ rN;
    public static _cA rI;

    public void renderHole(BlockPos blockPos, _an_0 _an_02, double d, double d2) {
        this.renderMain(blockPos, _an_02, d, d2);
        this.renderOutline(blockPos, _an_02, d, d2);
    }

    public _cI() {
        super(rR[rS[0]], rR[rS[1]], _aL.hz);
    }

    @Override
    public String getHUDData() {
        return rR[rS[5]] + rD.getMode() + rR[rS[6]] + rF.getMode();
    }

    @Override
    public void onRenderWorld() {
        if (this.nullCheck()) {
            return;
        }
        this.rP += rS[3];
        if ((double)this.rP < rM.getDoubleValue()) {
            return;
        }
        if (this.rQ) {
            return;
        }
        _ag_0.dN.setPosition(Objects.requireNonNull(this.pb.getRenderViewEntity()).posX, this.pb.getRenderViewEntity().posY, this.pb.getRenderViewEntity().posZ);
        for (BlockPos blockPos : _cE.getNearbyBlocks((EntityPlayer)this.pb.player, rO.getDoubleValue(), rS[4])) {
            if (_ao_0.isBedRockHole(blockPos)) {
                this.renderHole(blockPos, _an_0.eO, 0.0, 0.0);
            } else if (_ao_0.isObsidianHole(blockPos)) {
                this.renderHole(blockPos, _an_0.eN, 0.0, 0.0);
            }
            if (!rK.getValue()) continue;
            if (_ao_0.isDoubleObsidianHoleX(blockPos.west())) {
                this.renderHole(blockPos.west(), _an_0.eN, 1.0, 0.0);
                continue;
            }
            if (_ao_0.isDoubleObsidianHoleZ(blockPos.north())) {
                this.renderHole(blockPos.north(), _an_0.eN, 0.0, 1.0);
                continue;
            }
            if (_ao_0.isDoubleBedrockHoleX(blockPos.west())) {
                this.renderHole(blockPos.west(), _an_0.eO, 1.0, 0.0);
                continue;
            }
            if (!_ao_0.isDoubleBedrockHoleZ(blockPos.north())) continue;
            this.renderHole(blockPos.north(), _an_0.eO, 0.0, 1.0);
        }
    }

    public void renderOutline(BlockPos blockPos, _an_0 _an_02, double d, double d2) {
        switch (_cI.rF.oX) {
            case 0: {
                _ag_0.drawBoxBlockPos(blockPos, rG.getDoubleValue() - 1.0, d, d2, _an_02.equals((Object)_an_0.eN) ? rI.getColor() : rJ.getColor(), _bl_0.jW);
                break;
            }
            case 1: {
                _ag_0.drawBoxBlockPos(blockPos, rG.getDoubleValue() - 1.0, d, d2, _an_02.equals((Object)_an_0.eN) ? rI.getColor() : rJ.getColor(), _bl_0.jY);
            }
        }
    }

    @Override
    public void setup() {
        this.addSetting(rD);
        this.addSetting(rF);
        this.addSetting(rI);
        this.addSetting(rJ);
        this.addSetting(rK);
        this.addSetting(rL);
        this.addSetting(rM);
        this.addSetting(rO);
    }

    public void renderMain(BlockPos blockPos, _an_0 _an_02, double d, double d2) {
        switch (_cI.rD.oX) {
            case 0: {
                _ag_0.drawBoxBlockPos(blockPos, rE.getDoubleValue() - 1.0, d, d2, _an_02.equals((Object)_an_0.eN) ? rI.getColor() : rJ.getColor(), _bl_0.jZ);
                break;
            }
            case 1: {
                _ag_0.drawBoxBlockPos(blockPos, rE.getDoubleValue() - 1.0, d, d2, _an_02.equals((Object)_an_0.eN) ? rI.getColor() : rJ.getColor(), _bl_0.jV);
                break;
            }
            case 2: {
                _ag_0.drawBoxBlockPos(blockPos, rE.getDoubleValue() - 2.0, d, d2, _an_02.equals((Object)_an_0.eN) ? rI.getColor().darker() : rJ.getColor(), _bl_0.jV);
            }
        }
        if (this.pb.player.getDistanceSq(blockPos) < 1.5) {
            switch (_cI.rH.oX) {
                case 0: 
                case 1: {
                    break;
                }
                case 2: {
                    _ag_0.drawBoxBlockPos(blockPos, rE.getDoubleValue() - 1.0, d, d2, _an_02.equals((Object)_an_0.eN) ? rI.getColor() : rJ.getColor(), _bl_0.jZ);
                }
            }
        }
    }

    static {
        rS = new int[]{0, 1, 0, 1, 0, 2, 3, 26, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 4, 4, 0, 5, 1, 6, 2, 7, 3, 8, 9, 10, 3, 0, 11, 1, 12, 2, 13, 14, 15, 3, 0, 16, 1, 17, 2, 18, 19, 144, 0, 255, 255, 20, 93, 235, 240, 255, 21, 1, 22, 0, 23, 24, 25};
        String[] stringArray = new String[rS[7]];
        stringArray[_cI.rS[8]] = "HoleESP";
        stringArray[_cI.rS[9]] = "highlights safe holes to stand in while crystalling";
        stringArray[_cI.rS[10]] = " ";
        stringArray[_cI.rS[11]] = ", ";
        stringArray[_cI.rS[12]] = "Main";
        stringArray[_cI.rS[13]] = "Glow";
        stringArray[_cI.rS[14]] = "Fill";
        stringArray[_cI.rS[15]] = "Flat";
        stringArray[_cI.rS[16]] = "None";
        stringArray[_cI.rS[17]] = "Main Height";
        stringArray[_cI.rS[18]] = "Outline";
        stringArray[_cI.rS[19]] = "Frame";
        stringArray[_cI.rS[20]] = "Claw";
        stringArray[_cI.rS[21]] = "None";
        stringArray[_cI.rS[22]] = "Outline Height";
        stringArray[_cI.rS[23]] = "Highlight";
        stringArray[_cI.rS[24]] = "None";
        stringArray[_cI.rS[25]] = "Hide";
        stringArray[_cI.rS[26]] = "Glow";
        stringArray[_cI.rS[27]] = "Obsidian Colour";
        stringArray[_cI.rS[28]] = "Bedrock Colour";
        stringArray[_cI.rS[29]] = "Doubles";
        stringArray[_cI.rS[30]] = "View Frustrum";
        stringArray[_cI.rS[31]] = "Updates";
        stringArray[_cI.rS[32]] = "Width";
        stringArray[_cI.rS[33]] = "Range";
        rR = stringArray;
        String[] stringArray2 = new String[rS[35]];
        stringArray2[_cI.rS[36]] = rR[rS[37]];
        stringArray2[_cI.rS[38]] = rR[rS[39]];
        stringArray2[_cI.rS[40]] = rR[rS[41]];
        stringArray2[_cI.rS[42]] = rR[rS[43]];
        rD = new _cd_0(rR[rS[34]], stringArray2);
        rE = new _cJ(rR[rS[44]], 1.0, -1.0, 3.0, 1.0);
        String[] stringArray3 = new String[rS[46]];
        stringArray3[_cI.rS[47]] = rR[rS[48]];
        stringArray3[_cI.rS[49]] = rR[rS[50]];
        stringArray3[_cI.rS[51]] = rR[rS[52]];
        rF = new _cd_0(rR[rS[45]], stringArray3);
        rG = new _cJ(rR[rS[53]], 0.0, -1.0, 3.0, 1.0);
        String[] stringArray4 = new String[rS[55]];
        stringArray4[_cI.rS[56]] = rR[rS[57]];
        stringArray4[_cI.rS[58]] = rR[rS[59]];
        stringArray4[_cI.rS[60]] = rR[rS[61]];
        rH = new _cd_0(rR[rS[54]], stringArray4);
        rI = new _cA(rR[rS[62]], new _cV(rS[63], rS[64], rS[65], rS[66]));
        rJ = new _cA(rR[rS[67]], new _cV(rS[68], rS[69], rS[70], rS[71]));
        rK = new _k_0(rR[rS[72]], rS[73]);
        rL = new _k_0(rR[rS[74]], rS[75]);
        rM = new _cJ(rR[rS[76]], 10.0, 0.0, 20.0, 1.0);
        rN = new _cJ(rR[rS[77]], 0.0, 0.0, 3.0, 1.0);
        rO = new _cJ(rR[rS[78]], 5.0, 0.0, 10.0, 1.0);
    }
}

