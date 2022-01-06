//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.text.TextFormatting
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.ArrayList;
import net.minecraft.util.text.TextFormatting;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class _L
extends _H {
    public static final int[] bI = new int[]{0, 1, 6, 2, -1, 1, 6, 2, -1, 2, 0, 1, 2, 6, 2, -1, 2, 4, 4, 14, 5, 5, 3, 2, 6, 255, -1, 6, 2, 255, 4, 5, 6, -1, 6, 6, -1, 7, 8, 6, 2, -1, 13, 3, 2, 0, 2, 4, 1, 1, 0, 0, 0, 100, 2, 1, 4, 1, 2, 4, 1, 1, 2, 2, 2, 3, 0, 2, 2, 0, 0, 2, 2, 2, 3, 0, 2, 2, 2, 3, 524288, 2, 4, 2, 2, 3089, 2, 0, 1, 1, 1, 3089, 1, 4, 1, 4, 10, -1879048192, 0, 0, 1, 2, 1, 2, 0, -1879048192, 0, 9, 10, 11, 2, 12, 2, 4, -1, 13, 14, 2, 4, -1, 15, 16, 17, 2, 4, -1, 18, 2, 3, 2, -1, 2, 19, 2, -1, 0, 5, 15, 5, 3, 7, 13, -1, 20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static final String[] bH;

    @Override
    public void drawKeybind(_cO _cO2, double d, _v_0 _v_02, boolean bl, int n, int n2) {
        _h_0.drawClickGuiString(bl ? bH[bI[37]] : _cO2.ju + bH[bI[38]] + Keyboard.getKeyName((int)_cO2.getKeyCode()), _v_02.ax.getX() + bI[39], (float)((double)_v_02.ax.getY() + d + 1.0), _v_02.ax.getX() + _v_02.ax.getWidth() / bI[40], _v_02.ax.getX() + _v_02.ax.getWidth(), bI[41]);
    }

    @Override
    public void drawStringComponent(_cs_0 _cs_02, _ak_0 _ak_02, _v_0 _v_02, boolean bl, boolean bl2, double d, int n, double d2, int n2, int n3) {
        if (bl) {
            _h_0.drawStringWithShadow(_cs_02.getName() + bH[bI[30]] + _ak_02.getString() + bH[bI[31]], _v_02.ax.getX() + bI[32], (float)((double)_v_02.ax.getY() + d + 2.0), bI[33]);
        } else {
            _h_0.drawStringWithShadow(_cs_02.getName() + bH[bI[34]] + _cs_02.getText(), _v_02.ax.getX() + bI[35], (float)((double)_v_02.ax.getY() + d + 2.0), bI[36]);
        }
    }

    static {
        String[] stringArray = new String[bI[143]];
        stringArray[_L.bI[144]] = "Xeno";
        stringArray[_L.bI[145]] = ": ";
        stringArray[_L.bI[146]] = ": ";
        stringArray[_L.bI[147]] = "Rainbow";
        stringArray[_L.bI[148]] = " \u00a77";
        stringArray[_L.bI[149]] = "_";
        stringArray[_L.bI[150]] = " \u00a77";
        stringArray[_L.bI[151]] = "Press a key...";
        stringArray[_L.bI[152]] = ": ";
        stringArray[_L.bI[153]] = "CustomFont";
        stringArray[_L.bI[154]] = "Center";
        stringArray[_L.bI[155]] = "";
        stringArray[_L.bI[156]] = "";
        stringArray[_L.bI[157]] = "Left";
        stringArray[_L.bI[158]] = "";
        stringArray[_L.bI[159]] = "Right";
        stringArray[_L.bI[160]] = "";
        stringArray[_L.bI[161]] = "";
        stringArray[_L.bI[162]] = "";
        stringArray[_L.bI[163]] = "CustomFont";
        bH = stringArray;
    }

    @Override
    public void drawBoolean(_k_0 _k_02, _v_0 _v_02, double d, int n, int n2, boolean bl) {
        _h_0.drawClickGuiString(_k_02.getName(), _v_02.ax.getX() + bI[2], (float)((double)_v_02.ax.getY() + d + 2.0), _v_02.ax.getX() + _v_02.ax.getWidth() / bI[3], _v_02.ax.getX() + _v_02.ax.getWidth(), _k_02.N ? _aR.io : bI[4]);
    }

    @Override
    public void drawDescription(String string, _K _K2, int n, int n2) {
        _as_0.fA.blur(n + bI[136], n2 - bI[137], _h_0.getStringWidth(string) + bI[138], 15.0, bI[139]);
        _h_0.drawStringWithShadow(string, n + bI[140], n2 - bI[141], bI[142]);
    }

    @Override
    public void drawColourPicker(_ai_0 _ai_02, _cA _cA2, double d, boolean bl, _v_0 _v_02, int n, int n2) {
        if (bl) {
            _ah_0.drawRoundedOutline(_v_02.ax.getX() + bI[16], (double)_v_02.ax.getY() + d + 2.0, _cm_0.pN - bI[17], 89.0, _cm_0.pR, 2.0, _aR.io);
            _ai_02.drawPicker(_cA2, _v_02.ax.getX() + bI[18], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, _v_02.ax.getX() + _v_02.ax.getWidth() - bI[19], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, _v_02.ax.getX() + bI[20], (double)_v_02.ax.getY() + d + (double)(_cm_0.pP * bI[21]) - 2.0, n, n2);
            _h_0.drawCenteredString(bH[bI[22]], _v_02.ax.getX() + _v_02.ax.getWidth() / bI[23], (float)((double)_v_02.ax.getY() + d + (double)(_cm_0.pP * bI[24]) - 1.0), _cA2.getRainbow() ? new Color(_cA2.getColor().getRed(), _cA2.getColor().getGreen(), _cA2.getColor().getBlue(), bI[25]).getRGB() : bI[26]);
        }
        _h_0.drawClickGuiString(_cA2.getName(), _v_02.ax.getX() + bI[27], (float)((double)_v_02.ax.getY() + d + 2.0), _v_02.ax.getX() + _v_02.ax.getWidth() / bI[28], _v_02.ax.getX() + _v_02.ax.getWidth(), new Color(_cA2.getColor().getRed(), _cA2.getColor().getGreen(), _cA2.getColor().getBlue(), bI[29]).getRGB());
    }

    @Override
    public void drawMode(_cd_0 _cd_02, _v_0 _v_02, double d, int n, int n2, boolean bl) {
        _h_0.drawClickGuiString(_cd_02.getName() + bH[bI[5]] + _cd_02.getMode(), _v_02.ax.getX() + bI[6], (float)((double)_v_02.ax.getY() + d + 2.0), _v_02.ax.getX() + _v_02.ax.getWidth() / bI[7], _v_02.ax.getX() + _v_02.ax.getWidth(), bI[8]);
    }

    @Override
    public void drawButton(_aS _aS2, _bA _bA2, ArrayList<_bH> arrayList, boolean bl, double d, int n, int n2, boolean bl2) {
        _h_0.drawClickGuiString(_bA2.getName(), _aS2.getX() + bI[131], (float)((double)_aS2.getY() + d + (double)(_as_0.fB.isModuleEnabled(bH[bI[132]]) ? 2.5f : 3.0f)), _aS2.getX() + _aS2.getWidth() / bI[133], _aS2.getX() + _aS2.getWidth(), _bA2.isEnabled() ? _aR.io : bI[134]);
        if (bl && !arrayList.isEmpty()) {
            double d2 = d + (double)_cm_0.pP;
            for (_bH _bH2 : arrayList) {
                if (_bH2 instanceof _cx_0) {
                    _bH2.setOff(d2);
                    d2 += (double)_cm_0.pP;
                }
                if (_bH2 instanceof _ab_0) {
                    _bH2.setOff(d2);
                    d2 += (double)_cm_0.pP;
                }
                if (_bH2 instanceof _cw_0) {
                    _bH2.setOff(d2);
                    d2 += (double)_cm_0.pP;
                }
                if (_bH2 instanceof _ai_0) {
                    _bH2.setOff(d2);
                    d2 += (double)(_cm_0.pP + (((_ai_0)_bH2).dY ? _cm_0.pP * _cm_0.pS : bI[135]));
                }
                if (_bH2 instanceof _aw_0) {
                    _bH2.setOff(d2);
                    d2 += (double)_cm_0.pP;
                }
                if (_bH2 instanceof _Y) {
                    _bH2.setOff(d2);
                    d2 += (double)_cm_0.pP;
                }
                _bH2.renderComponent(n, n2);
            }
        }
    }

    @Override
    public void drawSlider(_cJ _cJ2, _v_0 _v_02, double d, int n, boolean bl, int n2, int n3) {
        _ah_0.drawRect(_v_02.ax.getX() + bI[9], (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth(), (double)_v_02.ax.getY() + d + (double)_cm_0.pP, bI[10]);
        _ah_0.drawRect(_v_02.ax.getX(), (double)_v_02.ax.getY() + d + 1.0, _v_02.ax.getX() + n, (double)(_v_02.ax.getY() + bI[11]) + d + (double)_cm_0.pP, bl ? _ck_0.pA.brighter().getRGB() : _ck_0.pA.getRGB());
        GL11.glPushMatrix();
        _h_0.drawClickGuiString(_cJ2.getName() + bH[bI[12]] + _cJ2.getDoubleValue(), _v_02.ax.getX() + bI[13], (float)((double)_v_02.ax.getY() + d + 2.0), _v_02.ax.getX() + _v_02.ax.getWidth() / bI[14], _v_02.ax.getX() + _v_02.ax.getWidth(), bI[15]);
        GL11.glPopMatrix();
    }

    @Override
    public void drawFrame(ArrayList<_bH> arrayList, _aL _aL2, boolean bl, int n, int n2, int n3, int n4, int n5) {
        _cm_0.pP = bI[42];
        int n6 = _cm_0.pO + bI[43] + (bl ? _aR.it + _cm_0.pP / bI[44] : bI[45]);
        _ah_0.drawRoundedRect(n - bI[46], n2, _cm_0.pN + bI[47], n6, _cm_0.pR, bl ? _cm_0.pR : bI[48], bl ? _cm_0.pR : bI[49], _cm_0.pR, new Color(bI[50], bI[51], bI[52], bI[53]).getRGB());
        if (_aB.gA.isEnabled()) {
            _as_0.fA.blur(n - bI[54], n2 - bI[55], n3 + bI[56], n6 + bI[57], (int)_aB.gB.getDoubleValue());
        }
        _ah_0.drawRoundedOutline(n - bI[58], n2, _cm_0.pN + bI[59], n6, _cm_0.pR, bl ? _cm_0.pR : bI[60], bl ? _cm_0.pR : bI[61], _cm_0.pR, 2.0, _aR.io);
        _ah_0.drawRectMC(n - bI[62], n2 + _cm_0.pO + _aR.it + bI[63], n + _cm_0.pN + bI[64], n2 + _cm_0.pO + _aR.it + bI[65], bI[66]);
        if (bl) {
            _ah_0.drawRect(n - bI[67], (double)(n2 + _cm_0.pO) + 2.5, n + _cm_0.pN + bI[68], (double)(n2 + _cm_0.pO) + 3.5, _ck_0.pz);
        }
        if (bl) {
            int n7 = bI[69];
            int n8 = bI[70];
            if (!arrayList.isEmpty()) {
                GL11.glPushMatrix();
                _ah_0.drawRectMC(n - bI[71], n2 + _cm_0.pO + _aR.it + bI[72], n + _cm_0.pN + bI[73], n2 + _cm_0.pO + _aR.it + bI[74], bI[75]);
                _ah_0.drawRectMC(n - bI[76], n2 + _cm_0.pO + _aR.it + bI[77], n + _cm_0.pN + bI[78], n2 + _cm_0.pO + _aR.it + bI[79], _ck_0.pz);
                GL11.glPopMatrix();
                GL11.glPushAttrib((int)bI[80]);
                _ah_0.scissor(n - bI[81], n2 + _cm_0.pO + bI[82], n + _cm_0.pN + bI[83], n2 + _cm_0.pO + _aR.it + bI[84]);
                GL11.glEnable((int)bI[85]);
                for (_bH _bH2 : arrayList) {
                    _bH2.renderComponent(n4, n5);
                    if (!(_bH2 instanceof _v_0)) continue;
                    int n9 = _cm_0.pP - bI[86];
                    _v_0 _v_02 = (_v_0)_bH2;
                    if (_v_02.aB) {
                        for (_bH _bH3 : _v_02.aA) {
                            int n10 = bI[87];
                            if (_bH3 instanceof _ai_0 && ((_ai_0)_bH3).dY) {
                                n10 = _cm_0.pP * _cm_0.pS;
                            }
                            n9 += _cm_0.pP + n10;
                        }
                    }
                    if (_aB.gE.N) {
                        _ah_0.drawRoundedOutline(n, (double)n2 + _v_02.ay + 2.5, _cm_0.pN, _v_02.aB ? (double)n9 + 0.5 : (double)_cm_0.pP - 1.5, _cm_0.pR, 2.0, _v_02.aB ? _aR.io : new Color(_aR.io).darker().getRGB());
                    } else if (_v_02.aB) {
                        _ah_0.drawRoundedOutline(n, (double)n2 + _v_02.ay + 2.5, _cm_0.pN, (double)n9 + 0.5, _cm_0.pR, 2.0, _aR.io);
                    }
                    if (_v_02.ay < 10.0 && n7 == 0) {
                        n7 = bI[88];
                    }
                    _Y _Y2 = (_Y)_v_02.getSubcomponents().get(_v_02.getSubcomponents().size() - bI[89]);
                    if (!(_v_02.ay > (double)_aR.it && n8 == 0) && (!_v_02.aB || !(_Y2.cH > (double)_aR.it) || n8 != 0)) continue;
                    n8 = bI[90];
                }
                if (this.bx) {
                    GL11.glDisable((int)bI[91]);
                    GL11.glPopAttrib();
                }
            }
            if (n7 != 0) {
                _ah_0.drawGradientRect(n - bI[92], n2 + _cm_0.pO + bI[93], n + n3 + bI[94], n2 + _cm_0.pO + bI[95] + bI[96], bI[97], bI[98], bI[99]);
            }
            if (n8 != 0) {
                _ah_0.drawGradientRect(n - bI[100], n2 + _cm_0.pO + bI[101] + _aR.it - _cm_0.pP, n + n3 + bI[102], n2 + _cm_0.pO + bI[103] + _aR.it, bI[104], bI[105], bI[106]);
            }
        }
        if (_as_0.fB.getModule(bH[bI[107]]).isEnabled()) {
            if (_aB.gw.is(bH[bI[108]])) {
                _cX.te.drawStringWithShadow((_aB.gy.N ? TextFormatting.UNDERLINE : bH[bI[109]]) + _aL2.hE, n + n3 / bI[110] - _cX.te.getStringWidth((_aB.gy.N ? TextFormatting.UNDERLINE : bH[bI[111]]) + _aL2.hE) / bI[112], n2 + bI[113], bI[114]);
            }
            if (_aB.gw.is(bH[bI[115]])) {
                _cX.te.drawStringWithShadow((_aB.gy.N ? TextFormatting.UNDERLINE : bH[bI[116]]) + _aL2.hE, n + bI[117], n2 + bI[118], bI[119]);
            }
            if (_aB.gw.is(bH[bI[120]])) {
                _cX.te.drawStringWithShadow((_aB.gy.N ? TextFormatting.UNDERLINE : bH[bI[121]]) + _aL2.hE, n + n3 - _cX.te.getStringWidth((_aB.gy.N ? TextFormatting.UNDERLINE : bH[bI[122]]) + _aL2.hE) - bI[123], n2 + bI[124], bI[125]);
            }
        } else {
            _h_0.drawClickGuiString((_aB.gy.N ? TextFormatting.UNDERLINE : bH[bI[126]]) + _aL2.hE, n + bI[127], n2 + bI[128], n + n3 / bI[129], n + n3, bI[130]);
        }
    }

    public _L() {
        super(bH[bI[0]], bI[1]);
    }
}

