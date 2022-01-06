//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.util.text.TextFormatting
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.Comparator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.text.TextFormatting;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _w
 */
public class _w_0
extends _bA {
    public static _k_0 aF;
    public static _cd_0 aE;
    public static final int[] pd;
    public static _k_0 aH;
    public static _cJ aI;
    public static final String[] lQ;
    public static _k_0 aG;

    public static void drawArrayList() {
        block21: {
            ArrayList<Object> arrayList;
            int n;
            block24: {
                ScaledResolution scaledResolution;
                block23: {
                    block22: {
                        if (!_as_0.fB.getModule(lQ[pd[9]]).isEnabled()) break block21;
                        n = pd[10];
                        Minecraft minecraft = Minecraft.getMinecraft();
                        scaledResolution = new ScaledResolution(Minecraft.getMinecraft());
                        arrayList = new ArrayList<Object>();
                        for (_bA _bA2 : _as_0.fB.getModules()) {
                            if (!_bA2.isEnabled() || !_bA2.lK.isEnabled()) continue;
                            arrayList.add(_bA2);
                        }
                        if (!aE.is(lQ[pd[11]])) break block22;
                        float f = scaledResolution.getScaledWidth() - pd[12];
                        float f2 = 0.0f;
                        arrayList.sort(Comparator.comparingInt(object -> _h_0.getStringWidth(((_bA)object).lH + TextFormatting.GRAY + ((_bA)object).getHUDData())).reversed());
                        int n2 = pd[13];
                        int n3 = pd[14];
                        for (_bA _bA3 : arrayList) {
                            int n4;
                            int n5 = aF.isEnabled() ? _M.rainbowWave(aI.getFloatValue(), 1.0f, 1.0f, n2) : _ck_0.pz;
                            int n6 = aF.isEnabled() ? _M.rainbowWave(aI.getFloatValue(), 1.0f, 1.0f, n2) : _ck_0.pz;
                            int n7 = n4 = aF.isEnabled() ? _M.rainbowWave(aI.getFloatValue(), 1.0f, 1.0f, n2 + pd[15]) : _ck_0.pz;
                            if (aH.isEnabled()) {
                                _ah_0.drawRect(f - 2.0f - (float)_h_0.getStringWidth(_bA3.lH + _bA3.getHUDData()), f2, f + 2.0f, f2 + (float)n, pd[16]);
                            }
                            if (aG.isEnabled()) {
                                _ah_0.drawGradientRect(f - 3.0f - (float)_h_0.getStringWidth(_bA3.lH + _bA3.getHUDData()), f2, f - 2.0f - (float)_h_0.getStringWidth(_bA3.lH + _bA3.getHUDData()), f2 + (float)n, n6, n4, pd[17]);
                                String string = _bA3.lH + TextFormatting.GRAY + _bA3.getHUDData();
                                int n8 = pd[18];
                                int n9 = pd[19];
                                String string2 = lQ[pd[20]];
                                try {
                                    string2 = ((_bA)arrayList.get((int)(n3 + _w_0.pd[21]))).lH + TextFormatting.GRAY + ((_bA)arrayList.get(n3 + pd[22])).getHUDData();
                                    n8 = Math.min(_h_0.getStringWidth(string), _h_0.getStringWidth(string2));
                                }
                                catch (Exception exception) {
                                    n9 = pd[23];
                                }
                                _ah_0.drawGradientRect(f - 3.0f - (float)_h_0.getStringWidth(string), f2 + (float)n - 1.0f, f - (float)n8 - (float)n9, f2 + (float)n, n6, n4, pd[24]);
                            }
                            _h_0.drawStringWithShadow(_bA3.lH + TextFormatting.GRAY + _bA3.getHUDData(), f - (float)_h_0.getStringWidth(_bA3.lH + TextFormatting.GRAY + _bA3.getHUDData()), f2 - 1.0f, n5);
                            f2 += (float)n;
                            n2 += 150;
                            ++n3;
                        }
                        break block21;
                    }
                    if (!aE.is(lQ[pd[25]])) break block23;
                    float f = scaledResolution.getScaledWidth() - pd[26];
                    float f3 = scaledResolution.getScaledHeight() - n;
                    arrayList.sort(Comparator.comparingInt(object -> _h_0.getStringWidth(((_bA)object).lH + TextFormatting.GRAY + ((_bA)object).getHUDData())).reversed());
                    int n10 = pd[27];
                    int n11 = pd[28];
                    for (_bA _bA4 : arrayList) {
                        int n12;
                        int n13 = aF.isEnabled() ? _M.rainbowWave(aI.getFloatValue(), 1.0f, 1.0f, n10) : _ck_0.pz;
                        int n14 = aF.isEnabled() ? _M.rainbowWave(aI.getFloatValue(), 1.0f, 1.0f, n10) : _ck_0.pz;
                        int n8 = n12 = aF.isEnabled() ? _M.rainbowWave(aI.getFloatValue(), 1.0f, 1.0f, n10 + pd[29]) : _ck_0.pz;
                        if (aH.isEnabled()) {
                            _ah_0.drawRect(f - 2.0f - (float)_h_0.getStringWidth(_bA4.lH + _bA4.getHUDData()), f3, f + 2.0f, f3 + (float)n, pd[30]);
                        }
                        if (aG.isEnabled()) {
                            _ah_0.drawGradientRect(f - 3.0f - (float)_h_0.getStringWidth(_bA4.lH + _bA4.getHUDData()), f3, f - 2.0f - (float)_h_0.getStringWidth(_bA4.lH + _bA4.getHUDData()), f3 + (float)n, n14, n12, pd[31]);
                            String string = _bA4.lH + TextFormatting.GRAY + _bA4.getHUDData();
                            int n16 = pd[32];
                            int n17 = pd[33];
                            String string3 = lQ[pd[34]];
                            try {
                                string3 = ((_bA)arrayList.get((int)(n11 + _w_0.pd[35]))).lH + TextFormatting.GRAY + ((_bA)arrayList.get(n11 + pd[36])).getHUDData();
                                n16 = Math.min(_h_0.getStringWidth(string), _h_0.getStringWidth(string3));
                            }
                            catch (Exception exception) {
                                n17 = pd[37];
                            }
                            _ah_0.drawGradientRect(f - 3.0f - (float)_h_0.getStringWidth(string), f3, f - (float)n16 - (float)n17 + 3.0f, f3 + 1.0f, n14, n12, pd[38]);
                        }
                        _h_0.drawStringWithShadow(_bA4.lH + TextFormatting.GRAY + _bA4.getHUDData(), f - (float)_h_0.getStringWidth(_bA4.lH + TextFormatting.GRAY + _bA4.getHUDData()), f3 + 0.5f, n13);
                        f3 -= (float)n;
                        n10 += 150;
                        ++n11;
                    }
                    break block21;
                }
                if (!aE.is(lQ[pd[39]])) break block24;
                float f = 2.0f;
                float f4 = scaledResolution.getScaledHeight() - n;
                arrayList.sort(Comparator.comparingInt(object -> _h_0.getStringWidth(((_bA)object).lH + TextFormatting.GRAY + ((_bA)object).getHUDData())).reversed());
                int n18 = pd[40];
                int n19 = pd[41];
                for (_bA _bA5 : arrayList) {
                    int n20;
                    int n21 = aF.isEnabled() ? _M.rainbowWave(aI.getFloatValue(), 1.0f, 1.0f, n18) : _ck_0.pz;
                    int n22 = aF.isEnabled() ? _M.rainbowWave(aI.getFloatValue(), 1.0f, 1.0f, n18) : _ck_0.pz;
                    int n9 = n20 = aF.isEnabled() ? _M.rainbowWave(aI.getFloatValue(), 1.0f, 1.0f, n18 + pd[42]) : _ck_0.pz;
                    if (aH.isEnabled()) {
                        _ah_0.drawRect(f - 2.0f, f4, f + 2.0f + (float)_h_0.getStringWidth(_bA5.lH + _bA5.getHUDData()), f4 + (float)n, pd[43]);
                    }
                    if (aG.isEnabled()) {
                        _ah_0.drawGradientRect(f + 2.0f + (float)_h_0.getStringWidth(_bA5.lH + _bA5.getHUDData()), f4, f + (float)_h_0.getStringWidth(_bA5.lH + _bA5.getHUDData()) + 3.0f, f4 + (float)n, n22, n20, pd[44]);
                        String string = _bA5.lH + TextFormatting.GRAY + _bA5.getHUDData();
                        int n24 = pd[45];
                        String string4 = lQ[pd[46]];
                        try {
                            string4 = ((_bA)arrayList.get((int)(n19 + _w_0.pd[47]))).lH + TextFormatting.WHITE + ((_bA)arrayList.get(n19 + pd[48])).getHUDData();
                            n24 = _h_0.getStringWidth(string) - _h_0.getStringWidth(string4);
                        }
                        catch (Exception exception) {
                            n24 = _h_0.getStringWidth(string) + pd[49];
                        }
                        GL11.glPushMatrix();
                        GL11.glTranslated((double)2.0, (double)0.0, (double)0.0);
                        _ah_0.drawRect(f + (float)_h_0.getStringWidth(string) - (float)n24, f4, f + (float)_h_0.getStringWidth(string), f4 + 1.0f, n22);
                        GL11.glPopMatrix();
                    }
                    _h_0.drawStringWithShadow(_bA5.lH + TextFormatting.GRAY + _bA5.getHUDData(), f, f4 + 0.5f, n21);
                    f4 -= (float)n;
                    n18 += 150;
                    ++n19;
                }
                break block21;
            }
            if (!aE.is(lQ[pd[50]])) break block21;
            float f = 0.0f;
            float f5 = 0.0f;
            arrayList.sort(Comparator.comparingInt(object -> _h_0.getStringWidth(((_bA)object).lH + TextFormatting.GRAY + ((_bA)object).getHUDData())).reversed());
            int n25 = pd[51];
            int n26 = pd[52];
            for (_bA _bA6 : arrayList) {
                int n27;
                int n28 = aF.isEnabled() ? _M.rainbowWave(aI.getFloatValue(), 1.0f, 1.0f, n25) : _ck_0.pz;
                int n29 = aF.isEnabled() ? _M.rainbowWave(aI.getFloatValue(), 1.0f, 1.0f, n25) : _ck_0.pz;
                int n10 = n27 = aF.isEnabled() ? _M.rainbowWave(aI.getFloatValue(), 1.0f, 1.0f, n25 + pd[53]) : _ck_0.pz;
                if (aH.isEnabled()) {
                    _ah_0.drawRect(f, f5, f + (float)_h_0.getStringWidth(_bA6.lH + _bA6.getHUDData()) + 2.0f, f5 + (float)n, pd[54]);
                }
                if (aG.isEnabled()) {
                    _ah_0.drawGradientRect(f - 3.0f - (float)_h_0.getStringWidth(_bA6.lH + _bA6.getHUDData()), f5, f - (float)_h_0.getStringWidth(_bA6.lH + _bA6.getHUDData()), f5 + (float)n, n29, n27, pd[55]);
                    String string = _bA6.lH + TextFormatting.GRAY + _bA6.getHUDData();
                    int n31 = pd[56];
                    String string5 = lQ[pd[57]];
                    try {
                        string5 = ((_bA)arrayList.get((int)(n26 + _w_0.pd[58]))).lH + TextFormatting.WHITE + ((_bA)arrayList.get(n26 + pd[59])).getHUDData();
                        n31 = _h_0.getStringWidth(string) - _h_0.getStringWidth(string5);
                    }
                    catch (Exception exception) {
                        n31 = _h_0.getStringWidth(string) + pd[60];
                    }
                    _ah_0.drawRect(f + (float)_h_0.getStringWidth(string) + 2.0f, f5, f + (float)_h_0.getStringWidth(string) + 3.0f, f5 + (float)n + 1.0f, n29);
                    _ah_0.drawRect(f + (float)_h_0.getStringWidth(string) + 2.0f, f5 + (float)n, f + (float)_h_0.getStringWidth(string) + 4.0f - (float)n31 - 2.0f, f5 + (float)n + 1.0f, n29);
                }
                _h_0.drawStringWithShadow(_bA6.lH + TextFormatting.GRAY + _bA6.getHUDData(), f, f5, n28);
                f5 += (float)n;
                n25 += 150;
                ++n26;
            }
        }
    }

    public _w_0() {
        super(lQ[pd[0]], lQ[pd[1]], _aL.hD, pd[2]);
        _bd_0[] _bd_0Array = new _bd_0[pd[3]];
        _bd_0Array[_w_0.pd[4]] = aE;
        _bd_0Array[_w_0.pd[5]] = aF;
        _bd_0Array[_w_0.pd[6]] = aG;
        _bd_0Array[_w_0.pd[7]] = aH;
        _bd_0Array[_w_0.pd[8]] = aI;
        this.addSettings(_bd_0Array);
    }

    static {
        pd = new int[]{0, 1, 1, 5, 0, 1, 2, 3, 4, 2, 11, 3, 2, 0, 0, 150, -1879048192, 0, 0, 2, 4, 1, 1, -2, 0, 5, 2, 0, 0, 150, -1879048192, 0, 0, 5, 6, 1, 1, 0, 0, 7, 0, 0, 150, -1879048192, 0, 0, 8, 1, 1, 5, 9, 0, 0, 150, -1879048192, 0, 0, 10, 1, 1, 5, 20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 11, 4, 0, 12, 1, 13, 2, 14, 3, 15, 16, 1, 17, 1, 18, 1, 19};
        String[] stringArray = new String[pd[61]];
        stringArray[_w_0.pd[62]] = "ArrayList";
        stringArray[_w_0.pd[63]] = "Displays the enabled modules on screen.";
        stringArray[_w_0.pd[64]] = "ArrayList";
        stringArray[_w_0.pd[65]] = "T Right";
        stringArray[_w_0.pd[66]] = "";
        stringArray[_w_0.pd[67]] = "B Right";
        stringArray[_w_0.pd[68]] = "";
        stringArray[_w_0.pd[69]] = "B Left";
        stringArray[_w_0.pd[70]] = "";
        stringArray[_w_0.pd[71]] = "T Left";
        stringArray[_w_0.pd[72]] = "";
        stringArray[_w_0.pd[73]] = "Anchor";
        stringArray[_w_0.pd[74]] = "B Right";
        stringArray[_w_0.pd[75]] = "B Left";
        stringArray[_w_0.pd[76]] = "T Left";
        stringArray[_w_0.pd[77]] = "T Right";
        stringArray[_w_0.pd[78]] = "RainbowWave";
        stringArray[_w_0.pd[79]] = "Outline";
        stringArray[_w_0.pd[80]] = "Background";
        stringArray[_w_0.pd[81]] = "Speed";
        lQ = stringArray;
        String[] stringArray2 = new String[pd[83]];
        stringArray2[_w_0.pd[84]] = lQ[pd[85]];
        stringArray2[_w_0.pd[86]] = lQ[pd[87]];
        stringArray2[_w_0.pd[88]] = lQ[pd[89]];
        stringArray2[_w_0.pd[90]] = lQ[pd[91]];
        aE = new _cd_0(lQ[pd[82]], stringArray2);
        aF = new _k_0(lQ[pd[92]], pd[93]);
        aG = new _k_0(lQ[pd[94]], pd[95]);
        aH = new _k_0(lQ[pd[96]], pd[97]);
        aI = new _cJ(lQ[pd[98]], 4.0, 0.1, 10.0, 0.1);
    }
}

