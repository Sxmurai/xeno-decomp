//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.util.text.TextFormatting
 */
import java.util.ArrayList;
import java.util.Comparator;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.text.TextFormatting;

public class _aQ
extends _ct_0 {
    public int ij;
    public static final String[] qx;
    public static final int[] qy;
    public int ii = qy[4];
    public ArrayList<_bA> ik;

    @Override
    public int getWidth() {
        return this.ii + qy[137];
    }

    @Override
    public void renderDummy(int n, int n2) {
        int n3;
        super.renderDummy(n, n2);
        if (!this.qp.oL) {
            this.update();
        }
        int n4 = qy[65];
        this.ik = new ArrayList();
        String string = qx[qy[66]];
        String string2 = qx[qy[67]];
        for (_bA _bA2 : _D.bg) {
            if (!_bA2.isEnabled() || !_bA2.lK.N) continue;
            this.ik.add(_bA2);
        }
        ScaledResolution scaledResolution = new ScaledResolution(pb);
        if (this.getX() + this.getWidth() / qy[68] < scaledResolution.getScaledWidth() / qy[69]) {
            string = qx[qy[70]];
        }
        int n5 = n3 = _w_0.aH.isEnabled() ? qy[71] : qy[72];
        if (this.ik.isEmpty()) {
            this.qp.setHeight(11.0f);
            this.qp.setWidth(_h_0.getStringWidth(this.qo));
            _h_0.drawStringWithShadow(this.qo, this.qp.getX(), this.qp.getY() + qy[73], this.isEnabled() ? _ck_0.pz : qy[74]);
            super.renderDummy(n, n2);
            return;
        }
        float f = (float)_w_0.aI.getDoubleValue();
        int n6 = qy[75];
        for (_bA _bA3 : this.ik) {
            int n7;
            int n8;
            String string3 = _bA3.lH + TextFormatting.GRAY + _bA3.getHUDData();
            int n9 = this.qq.lM ? (_w_0.aF.N ? _M.rainbowWave(f, 1.0f, 1.0f, n4 * n6) : _ck_0.pz) : (n8 = qy[76]);
            int n10 = this.qq.lM ? (_w_0.aF.N ? _M.rainbowWave(f, 1.0f, 1.0f, (n4 + qy[77]) * n6) : _ck_0.pz) : (n7 = qy[78]);
            if (string2 == qx[qy[79]]) {
                int n11;
                _D.bg.sort(Comparator.comparingInt(object -> _h_0.getStringWidth(((_bA)object).lH + TextFormatting.GRAY + ((_bA)object).getHUDData())).reversed());
                if (_w_0.aH.N) {
                    if (string == qx[qy[80]]) {
                        Gui.drawRect((int)((int)((float)this.getX() + this.qp.getWidth() - 5.0f - (float)_h_0.getStringWidth(string3))), (int)(this.getY() + n4 * n3), (int)(this.getX() + this.getWidth()), (int)(this.getY() + n4 * n3 + n3), (int)qy[81]);
                    } else if (string == qx[qy[82]]) {
                        Gui.drawRect((int)this.getX(), (int)(this.getY() + n4 * n3), (int)(this.getX() + _h_0.getStringWidth(string3) + qy[83]), (int)(this.getY() + n4 * n3 + n3), (int)qy[84]);
                    }
                }
                if (_w_0.aG.N && string == qx[qy[85]] && _w_0.aH.N) {
                    _ah_0.drawGradientRect((float)this.getX() + this.qp.getWidth() - 6.0f - (float)_h_0.getStringWidth(string3), this.getY() + n4 * n3, this.getX() + this.getWidth() - qy[86] - _h_0.getStringWidth(string3), this.getY() + n4 * n3 + n3, n8, n7, qy[87]);
                }
                if (_w_0.aG.N && string == qx[qy[88]] && _w_0.aH.N) {
                    Gui.drawRect((int)(this.getX() + _h_0.getStringWidth(string3) + qy[89]), (int)(this.getY() + n4 * n3), (int)(this.getX() + _h_0.getStringWidth(string3) + qy[90]), (int)(this.getY() + n4 * n3 + n3), (int)n8);
                }
                if (string == qx[qy[91]]) {
                    n11 = this.getY() + n4 * n3;
                    _h_0.drawStringWithShadow(string3, (int)((float)this.getX() + this.qp.getWidth() - 3.0f - (float)_h_0.getStringWidth(string3)), n11, n8);
                } else if (string == qx[qy[92]]) {
                    n11 = this.getY() + n4 * n3;
                    _h_0.drawStringWithShadow(string3, this.getX() + qy[93], n11, n8);
                }
                if (_w_0.aG.N && _w_0.aH.N) {
                    if (string == qx[qy[94]]) {
                        n11 = qy[95];
                        int n12 = qy[96];
                        int n13 = qy[97];
                        String string4 = qx[qy[98]];
                        if (!this.ik.isEmpty() && this.ik.get(qy[99]) == _bA3) {
                            _ah_0.drawGradientRect((float)this.getX() + this.qp.getWidth() - 6.0f - (float)_h_0.getStringWidth(string3), this.getY() + n4 * n3, this.getX() + this.getWidth(), this.getY() + n4 * n3 + qy[100], n8, n7, qy[101]);
                        }
                        try {
                            string4 = this.ik.get((int)(n4 + _aQ.qy[102])).lH + TextFormatting.GRAY + this.ik.get(n4 + qy[103]).getHUDData();
                            n11 = Math.min(_h_0.getStringWidth(string3), _h_0.getStringWidth(string4));
                        }
                        catch (Exception exception) {
                            n13 = qy[104];
                        }
                        _ah_0.drawGradientRect((float)this.getX() + this.qp.getWidth() - 6.0f - (float)_h_0.getStringWidth(string3), this.getY() + n4 * n3 + qy[105], this.getX() + this.getWidth() - n11 - n13 + n12, this.getY() + n4 * n3 + n3, n8, n7, qy[106]);
                        _ah_0.drawGradientRect((float)this.getX() + this.qp.getWidth() - 1.0f, this.getY() + n4 * n3, (float)this.getX() + this.qp.getWidth(), this.getY() + n4 * n3 + qy[107], n8, n7, qy[108]);
                    } else if (string == qx[qy[109]]) {
                        if (!this.ik.isEmpty() && this.ik.get(qy[110]) == _bA3) {
                            _ah_0.drawGradientRect(this.getX(), this.getY() + n4 * n3, this.getX() + _h_0.getStringWidth(string3) + qy[111], this.getY() + n4 * n3 + qy[112], n8, n7, qy[113]);
                        }
                        n11 = qy[114];
                        String string5 = qx[qy[115]];
                        try {
                            string5 = this.ik.get((int)(n4 + _aQ.qy[116])).lH + TextFormatting.WHITE + this.ik.get(n4 + qy[117]).getHUDData();
                            n11 = _h_0.getStringWidth(string3) - _h_0.getStringWidth(string5);
                        }
                        catch (Exception exception) {
                            n11 = _h_0.getStringWidth(string3) + qy[118];
                        }
                        Gui.drawRect((int)(this.getX() + _h_0.getStringWidth(string3) + qy[119]), (int)(this.getY() + n4 * n3 + qy[120]), (int)(this.getX() + _h_0.getStringWidth(string3) + qy[121] - n11 - qy[122]), (int)(this.getY() + n4 * n3 + qy[123]), (int)n8);
                        _ah_0.drawGradientRect(this.getX(), this.getY() + n4 * n3, this.getX() + qy[124], this.getY() + n4 * n3 + n3, n8, n7, qy[125]);
                    }
                }
                if (_h_0.getStringWidth(string3) > this.ii) {
                    this.ii = _h_0.getStringWidth(string3);
                }
            }
            if (_w_0.aG.N && _w_0.aH.N && string2 == qx[qy[126]]) {
                if (string == qx[qy[127]]) {
                    _ah_0.drawGradientRect(this.getX() + this.getWidth() - qy[128], this.getY(), this.getX() + this.getWidth(), this.getY() + n4 * n3 + n3, this.qq.lM ? (_w_0.aF.N ? _M.rainbowWave(f, 1.0f, 1.0f, qy[129]) : _ck_0.pz) : qy[130], n8, qy[131]);
                } else if (string == qx[qy[132]]) {
                    _ah_0.drawGradientRect(this.getX(), this.getY(), this.getX() + qy[133], this.getY() + n4 * n3 + n3, this.qq.lM ? (_w_0.aF.N ? _M.rainbowWave(f, 1.0f, 1.0f, qy[134]) : _ck_0.pz) : qy[135], n8, qy[136]);
                }
            }
            ++n4;
        }
        if (!this.ik.isEmpty()) {
            this.qp.setHeight(n4 * n3);
        }
        this.qp.setWidth(this.getWidth());
    }

    public _aQ() {
        super(qx[qy[0]], _V.getDisplayWidth() - _h_0.getStringWidth(qx[qy[1]]), qy[2], _as_0.fB.getModule(qx[qy[3]]));
        this.ij = qy[5];
        this.ik = new ArrayList();
    }

    @Override
    public void draw() {
        int n = qy[6];
        this.update();
        this.ik = new ArrayList();
        String string = qx[qy[7]];
        String string2 = qx[qy[8]];
        for (_bA _bA2 : _as_0.fB.getModules()) {
            if (!_bA2.isEnabled() || !_bA2.lK.N) continue;
            this.ik.add(_bA2);
        }
        ScaledResolution scaledResolution = new ScaledResolution(pb);
        if (this.getX() + this.getWidth() / qy[9] < scaledResolution.getScaledWidth() / qy[10]) {
            string = qx[qy[11]];
        }
        int n2 = _w_0.aH.isEnabled() ? qy[12] : qy[13];
        float f = (float)_w_0.aI.getDoubleValue();
        int n3 = qy[14];
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (_bA _bA3 : this.ik) {
            int n4;
            int n5;
            String string3 = _bA3.lH + TextFormatting.GRAY + _bA3.getHUDData();
            int n6 = this.qq.lM ? (_w_0.aF.N ? _M.rainbowWave(f, 1.0f, 1.0f, n * n3) : _ck_0.pz) : (n5 = qy[15]);
            int n7 = this.qq.lM ? (_w_0.aF.N ? _M.rainbowWave(f, 1.0f, 1.0f, (n + qy[16]) * n3) : _ck_0.pz) : (n4 = qy[17]);
            if (string2 == qx[qy[18]]) {
                int n8;
                _as_0.fB.getModules().sort(Comparator.comparingInt(object -> _h_0.getStringWidth(((_bA)object).lH + TextFormatting.GRAY + ((_bA)object).getHUDData())).reversed());
                if (_w_0.aH.N) {
                    if (string == qx[qy[19]]) {
                        Gui.drawRect((int)((int)((float)this.getX() + this.qp.getWidth() - 5.0f - (float)_h_0.getStringWidth(string3))), (int)(this.getY() + n * n2), (int)(this.getX() + this.getWidth()), (int)(this.getY() + n * n2 + n2), (int)qy[20]);
                    } else if (string == qx[qy[21]]) {
                        Gui.drawRect((int)this.getX(), (int)(this.getY() + n * n2), (int)(this.getX() + _h_0.getStringWidth(string3) + qy[22]), (int)(this.getY() + n * n2 + n2), (int)qy[23]);
                    }
                }
                if (_w_0.aG.N && string == qx[qy[24]] && _w_0.aH.N) {
                    _ah_0.drawGradientRect((float)this.getX() + this.qp.getWidth() - 6.0f - (float)_h_0.getStringWidth(string3), this.getY() + n * n2, this.getX() + this.getWidth() - qy[25] - _h_0.getStringWidth(string3), this.getY() + n * n2 + n2, n5, n4, qy[26]);
                }
                if (_w_0.aG.N && string == qx[qy[27]] && _w_0.aH.N) {
                    Gui.drawRect((int)(this.getX() + _h_0.getStringWidth(string3) + qy[28]), (int)(this.getY() + n * n2), (int)(this.getX() + _h_0.getStringWidth(string3) + qy[29]), (int)(this.getY() + n * n2 + n2), (int)n5);
                }
                if (string == qx[qy[30]]) {
                    n8 = this.getY() + n * n2;
                    _h_0.drawStringWithShadow(string3, (int)((float)this.getX() + this.qp.getWidth() - 3.0f - (float)_h_0.getStringWidth(string3)), n8, n5);
                } else if (string == qx[qy[31]]) {
                    n8 = this.getY() + n * n2;
                    _h_0.drawStringWithShadow(string3, this.getX() + qy[32], n8, n5);
                }
                if (_w_0.aG.N && _w_0.aH.N) {
                    if (string == qx[qy[33]]) {
                        n8 = qy[34];
                        int n9 = qy[35];
                        int n10 = qy[36];
                        String string4 = qx[qy[37]];
                        if (!this.ik.isEmpty() && this.ik.get(qy[38]) == _bA3) {
                            _ah_0.drawGradientRect((float)this.getX() + this.qp.getWidth() - 6.0f - (float)_h_0.getStringWidth(string3), this.getY() + n * n2, this.getX() + this.getWidth(), this.getY() + n * n2 + qy[39], n5, n4, qy[40]);
                        }
                        try {
                            string4 = this.ik.get((int)(n + _aQ.qy[41])).lH + TextFormatting.GRAY + this.ik.get(n + qy[42]).getHUDData();
                            n8 = Math.min(_h_0.getStringWidth(string3), _h_0.getStringWidth(string4));
                        }
                        catch (Exception exception) {
                            n10 = qy[43];
                        }
                        _ah_0.drawGradientRect((float)this.getX() + this.qp.getWidth() - 6.0f - (float)_h_0.getStringWidth(string3), this.getY() + n * n2 + qy[44], this.getX() + this.getWidth() - n8 - n10 + n9, this.getY() + n * n2 + n2, n5, n4, qy[45]);
                        _ah_0.drawGradientRect((float)this.getX() + this.qp.getWidth() - 1.0f, this.getY() + n * n2, (float)this.getX() + this.qp.getWidth(), this.getY() + n * n2 + qy[46], n5, n4, qy[47]);
                    } else if (string == qx[qy[48]]) {
                        if (!this.ik.isEmpty() && this.ik.get(qy[49]) == _bA3) {
                            _ah_0.drawGradientRect(this.getX(), this.getY() + n * n2, this.getX() + _h_0.getStringWidth(string3) + qy[50], this.getY() + n * n2 + qy[51], n5, n4, qy[52]);
                        }
                        n8 = qy[53];
                        String string5 = qx[qy[54]];
                        try {
                            string5 = this.ik.get((int)(n + _aQ.qy[55])).lH + TextFormatting.GRAY + this.ik.get(n + qy[56]).getHUDData();
                            n8 = _h_0.getStringWidth(string3) - _h_0.getStringWidth(string5);
                        }
                        catch (Exception exception) {
                            n8 = _h_0.getStringWidth(string3) + qy[57];
                        }
                        Gui.drawRect((int)(this.getX() + _h_0.getStringWidth(string3) + qy[58]), (int)(this.getY() + n * n2 + qy[59]), (int)(this.getX() + _h_0.getStringWidth(string3) + qy[60] - n8 - qy[61]), (int)(this.getY() + n * n2 + qy[62]), (int)n5);
                        _ah_0.drawGradientRect(this.getX(), this.getY() + n * n2, this.getX() + qy[63], this.getY() + n * n2 + n2, n5, n4, qy[64]);
                    }
                }
                if (_h_0.getStringWidth(string3) > this.ii) {
                    this.ii = _h_0.getStringWidth(string3);
                }
            }
            ++n;
        }
        if (!this.ik.isEmpty()) {
            this.qp.setHeight(n * n2);
        }
        this.qp.setWidth(this.getWidth());
        super.draw();
    }

    static {
        qy = new int[]{0, 1, 0, 2, 0, 0, 0, 3, 4, 2, 2, 5, 12, 10, 150, -7340032, 1, -7340032, 6, 7, 0x70000000, 8, 5, 0x70000000, 9, 5, 0, 10, 5, 6, 11, 12, 2, 13, 0, 0, 5, 14, 0, 1, 0, 1, 1, 0, 11, 0, 12, 0, 15, 0, 5, 1, 0, 0, 16, 1, 1, 5, 5, 11, 6, 1, 12, 1, 0, 0, 17, 18, 2, 2, 19, 12, 10, 2, -1869611008, 150, -7340032, 1, -7340032, 20, 21, 0x70000000, 22, 5, 0x70000000, 23, 5, 0, 24, 5, 6, 25, 26, 2, 27, 0, 0, 5, 28, 0, 1, 0, 1, 1, 0, 11, 0, 12, 0, 29, 0, 5, 1, 0, 0, 30, 1, 1, 5, 5, 11, 6, 1, 12, 1, 0, 31, 32, 1, 0, -7340032, 0, 33, 1, 0, -7340032, 0, 4, 34, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33};
        String[] stringArray = new String[qy[138]];
        stringArray[_aQ.qy[139]] = "ArrayList";
        stringArray[_aQ.qy[140]] = "ArrayList";
        stringArray[_aQ.qy[141]] = "ArrayList";
        stringArray[_aQ.qy[142]] = "FromRight";
        stringArray[_aQ.qy[143]] = "Top";
        stringArray[_aQ.qy[144]] = "FromLeft";
        stringArray[_aQ.qy[145]] = "Top";
        stringArray[_aQ.qy[146]] = "FromRight";
        stringArray[_aQ.qy[147]] = "FromLeft";
        stringArray[_aQ.qy[148]] = "FromRight";
        stringArray[_aQ.qy[149]] = "FromLeft";
        stringArray[_aQ.qy[150]] = "FromRight";
        stringArray[_aQ.qy[151]] = "FromLeft";
        stringArray[_aQ.qy[152]] = "FromRight";
        stringArray[_aQ.qy[153]] = "";
        stringArray[_aQ.qy[154]] = "FromLeft";
        stringArray[_aQ.qy[155]] = "";
        stringArray[_aQ.qy[156]] = "FromRight";
        stringArray[_aQ.qy[157]] = "Top";
        stringArray[_aQ.qy[158]] = "FromLeft";
        stringArray[_aQ.qy[159]] = "Top";
        stringArray[_aQ.qy[160]] = "FromRight";
        stringArray[_aQ.qy[161]] = "FromLeft";
        stringArray[_aQ.qy[162]] = "FromRight";
        stringArray[_aQ.qy[163]] = "FromLeft";
        stringArray[_aQ.qy[164]] = "FromRight";
        stringArray[_aQ.qy[165]] = "FromLeft";
        stringArray[_aQ.qy[166]] = "FromRight";
        stringArray[_aQ.qy[167]] = "";
        stringArray[_aQ.qy[168]] = "FromLeft";
        stringArray[_aQ.qy[169]] = "";
        stringArray[_aQ.qy[170]] = "Bottom";
        stringArray[_aQ.qy[171]] = "FromRight";
        stringArray[_aQ.qy[172]] = "FromLeft";
        qx = stringArray;
    }

    @Override
    public float getHeight() {
        return 10.0f;
    }
}

