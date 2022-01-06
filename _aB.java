//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 */
import net.minecraft.client.gui.GuiScreen;

public class _aB
extends _bA {
    public static _cd_0 gx;
    public static _k_0 gG;
    public static _k_0 gC;
    public static _k_0 gH;
    public static _cJ gJ;
    public static final String[] lQ;
    public static _cd_0 gw;
    public static _k_0 gF;
    public static _cJ gB;
    public static _cJ gK;
    public static _k_0 gE;
    public static final int[] pd;
    public static _k_0 gy;
    public static _k_0 gz;
    public static _k_0 gA;
    public static _cJ gD;
    public static _aB gv;
    public static _cd_0 gL;
    public static _k_0 gI;

    static {
        pd = new int[]{0, 1, 54, 13, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 2, 3, 0, 28, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 4, 3, 0, 5, 1, 6, 2, 7, 8, 3, 0, 9, 1, 10, 2, 11, 12, 0, 13, 0, 14, 0, 15, 16, 1, 17, 18, 0, 19, 1, 20, 0, 21, 1, 22, 1, 23, 24, 25, 2, 0, 26, 1, 27};
        String[] stringArray = new String[pd[20]];
        stringArray[_aB.pd[21]] = "ClickGUI";
        stringArray[_aB.pd[22]] = "idk clickgui open for settings etc";
        stringArray[_aB.pd[23]] = "Frames";
        stringArray[_aB.pd[24]] = "Window";
        stringArray[_aB.pd[25]] = "TextPos";
        stringArray[_aB.pd[26]] = "Center";
        stringArray[_aB.pd[27]] = "Left";
        stringArray[_aB.pd[28]] = "Right";
        stringArray[_aB.pd[29]] = "Theme";
        stringArray[_aB.pd[30]] = "Xeno";
        stringArray[_aB.pd[31]] = "Plain";
        stringArray[_aB.pd[32]] = "Future";
        stringArray[_aB.pd[33]] = "Underline";
        stringArray[_aB.pd[34]] = "Darken";
        stringArray[_aB.pd[35]] = "Blur Frame";
        stringArray[_aB.pd[36]] = "FrBlur Intensity";
        stringArray[_aB.pd[37]] = "Blur BG";
        stringArray[_aB.pd[38]] = "BG Intensity";
        stringArray[_aB.pd[39]] = "Button Outline";
        stringArray[_aB.pd[40]] = "Click Sound";
        stringArray[_aB.pd[41]] = "Reset";
        stringArray[_aB.pd[42]] = "Tooltips";
        stringArray[_aB.pd[43]] = "LimitPositions";
        stringArray[_aB.pd[44]] = "Radius";
        stringArray[_aB.pd[45]] = "Length";
        stringArray[_aB.pd[46]] = "Mode";
        stringArray[_aB.pd[47]] = "Frames";
        stringArray[_aB.pd[48]] = "Window";
        lQ = stringArray;
        String[] stringArray2 = new String[pd[50]];
        stringArray2[_aB.pd[51]] = lQ[pd[52]];
        stringArray2[_aB.pd[53]] = lQ[pd[54]];
        stringArray2[_aB.pd[55]] = lQ[pd[56]];
        gw = new _cd_0(lQ[pd[49]], stringArray2);
        String[] stringArray3 = new String[pd[58]];
        stringArray3[_aB.pd[59]] = lQ[pd[60]];
        stringArray3[_aB.pd[61]] = lQ[pd[62]];
        stringArray3[_aB.pd[63]] = lQ[pd[64]];
        gx = new _cd_0(lQ[pd[57]], stringArray3);
        gy = new _k_0(lQ[pd[65]], pd[66]);
        gz = new _k_0(lQ[pd[67]], pd[68]);
        gA = new _k_0(lQ[pd[69]], pd[70]);
        gB = new _cJ(lQ[pd[71]], 3.0, 1.0, 10.0, 1.0);
        gC = new _k_0(lQ[pd[72]], pd[73]);
        gD = new _cJ(lQ[pd[74]], 1.0, 1.0, 10.0, 1.0);
        gE = new _k_0(lQ[pd[75]], pd[76]);
        gF = new _k_0(lQ[pd[77]], pd[78]);
        gG = new _k_0(lQ[pd[79]], pd[80]);
        gH = new _k_0(lQ[pd[81]], pd[82]);
        gI = new _k_0(lQ[pd[83]], pd[84]);
        gJ = new _cJ(lQ[pd[85]], 1.0, 1.0, 6.0, 1.0);
        gK = new _cJ(lQ[pd[86]], 130.0, 70.0, 495.0, 5.0);
        String[] stringArray4 = new String[pd[88]];
        stringArray4[_aB.pd[89]] = lQ[pd[90]];
        stringArray4[_aB.pd[91]] = lQ[pd[92]];
        gL = new _cd_0(lQ[pd[87]], stringArray4);
    }

    @Override
    public void onEnable() {
        if (gL.is(lQ[pd[17]])) {
            this.pb.displayGuiScreen((GuiScreen)_as_0.fC);
        } else if (gL.is(lQ[pd[18]])) {
            this.pb.displayGuiScreen((GuiScreen)new _J());
        }
        this.toggle();
    }

    @Override
    public void onNonToggledUpdate() {
        if (gG.isEnabled()) {
            _aR.reset();
            _aB.gG.N = pd[19];
        }
        _cm_0.pR = (int)gJ.getDoubleValue();
        _cm_0.pU = gI.getValue();
        _cm_0.pT = gy.getValue();
        _aR.it = gK.getIntValue();
    }

    public _aB() {
        super(lQ[pd[0]], lQ[pd[1]], pd[2], _aL.hB);
        _bd_0[] _bd_0Array = new _bd_0[pd[3]];
        _bd_0Array[_aB.pd[4]] = gG;
        _bd_0Array[_aB.pd[5]] = gH;
        _bd_0Array[_aB.pd[6]] = gz;
        _bd_0Array[_aB.pd[7]] = gE;
        _bd_0Array[_aB.pd[8]] = gA;
        _bd_0Array[_aB.pd[9]] = gC;
        _bd_0Array[_aB.pd[10]] = gD;
        _bd_0Array[_aB.pd[11]] = gF;
        _bd_0Array[_aB.pd[12]] = gI;
        _bd_0Array[_aB.pd[13]] = gJ;
        _bd_0Array[_aB.pd[14]] = gK;
        _bd_0Array[_aB.pd[15]] = gw;
        _bd_0Array[_aB.pd[16]] = gx;
        this.addSettings(_bd_0Array);
        gv = this;
    }
}

