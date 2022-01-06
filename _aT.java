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

public class _aT
extends _H {
    public static final String[] iJ;
    public static final int[] iK;

    @Override
    public void drawColourPicker(_ai_0 _ai_02, _cA _cA2, double d, boolean bl, _v_0 _v_02, int n, int n2) {
        if (bl) {
            _ah_0.drawRoundedOutline(_v_02.ax.getX() + iK[16], (double)_v_02.ax.getY() + d + 2.0, _cm_0.pN - iK[17], 89.0, _cm_0.pR, 2.0, _aR.io);
            _ai_02.drawPicker(_cA2, _v_02.ax.getX() + iK[18], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, _v_02.ax.getX() + _v_02.ax.getWidth() - iK[19], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, _v_02.ax.getX() + iK[20], (double)_v_02.ax.getY() + d + (double)(_cm_0.pP * iK[21]) - 1.0, n, n2);
            _h_0.drawCenteredString(iJ[iK[22]], _v_02.ax.getX() + _v_02.ax.getWidth() / iK[23], (float)((double)_v_02.ax.getY() + d + (double)(_cm_0.pP * iK[24]) - 1.0), _cA2.getRainbow() ? new Color(_cA2.getColor().getRed(), _cA2.getColor().getGreen(), _cA2.getColor().getBlue(), iK[25]).getRGB() : iK[26]);
        }
        _h_0.drawClickGuiString(_cA2.getName(), _v_02.ax.getX() + iK[27], (float)((double)_v_02.ax.getY() + d + 2.0), _v_02.ax.getX() + _v_02.ax.getWidth() / iK[28], _v_02.ax.getX() + _v_02.ax.getWidth(), new Color(_cA2.getColor().getRed(), _cA2.getColor().getGreen(), _cA2.getColor().getBlue(), iK[29]).getRGB());
    }

    @Override
    public void drawBoolean(_k_0 _k_02, _v_0 _v_02, double d, int n, int n2, boolean bl) {
        _h_0.drawClickGuiString(_k_02.getName(), _v_02.ax.getX() + iK[2], (float)((double)_v_02.ax.getY() + d + 2.0), _v_02.ax.getX() + _v_02.ax.getWidth() / iK[3], _v_02.ax.getX() + _v_02.ax.getWidth(), _k_02.N ? _aR.io : iK[4]);
    }

    @Override
    public void drawMode(_cd_0 _cd_02, _v_0 _v_02, double d, int n, int n2, boolean bl) {
        _h_0.drawClickGuiString(_cd_02.getName() + iJ[iK[5]] + _cd_02.getMode(), _v_02.ax.getX() + iK[6], (float)((double)_v_02.ax.getY() + d + 2.0), _v_02.ax.getX() + _v_02.ax.getWidth() / iK[7], _v_02.ax.getX() + _v_02.ax.getWidth(), iK[8]);
    }

    @Override
    public void drawKeybind(_cO _cO2, double d, _v_0 _v_02, boolean bl, int n, int n2) {
        _h_0.drawClickGuiString(bl ? iJ[iK[37]] : _cO2.ju + iJ[iK[38]] + Keyboard.getKeyName((int)_v_02.aw.lJ.getKeyCode()), _v_02.ax.getX() + iK[39], (float)((double)_v_02.ax.getY() + d + 1.0), _v_02.ax.getX() + _v_02.ax.getWidth() / iK[40], _v_02.ax.getX() + _v_02.ax.getWidth(), iK[41]);
    }

    public _aT() {
        super(iJ[iK[0]], iK[1]);
    }

    @Override
    public void drawSlider(_cJ _cJ2, _v_0 _v_02, double d, int n, boolean bl, int n2, int n3) {
        _ah_0.drawRect(_v_02.ax.getX() + iK[9], (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth(), (double)_v_02.ax.getY() + d + (double)_cm_0.pP, iK[10]);
        _ah_0.drawRect(_v_02.ax.getX(), (double)_v_02.ax.getY() + d + 1.0, _v_02.ax.getX() + n, (double)(_v_02.ax.getY() + iK[11]) + d + (double)_cm_0.pP, bl ? _ck_0.pA.brighter().getRGB() : _ck_0.pA.getRGB());
        _h_0.drawClickGuiString(_cJ2.getName() + iJ[iK[12]] + _cJ2.getDoubleValue(), _v_02.ax.getX() + iK[13], (float)((double)_v_02.ax.getY() + d + 2.0), _v_02.ax.getX() + _v_02.ax.getWidth() / iK[14], _v_02.ax.getX() + _v_02.ax.getWidth(), iK[15]);
    }

    static {
        iK = new int[]{0, 1, 6, 2, -1, 1, 6, 2, -1, 2, 0, 1, 2, 6, 2, -1, 2, 4, 4, 14, 4, 5, 3, 2, 6, 255, -1, 6, 2, 255, 4, 5, 6, -1, 6, 6, -1, 7, 8, 6, 2, -1, 13, 3, 2, 0, 0, 2, 4, 1, 1, 0, 0, 0, 100, 2, 1, 4, 1, 2, 4, 1, 1, 2, 2, 2, 3, 0, 2, 2, 0, 0, 2, 2, 2, 3, 0, 2, 2, 2, 3, 524288, 2, 4, 2, 2, 3089, 2, 0, 1, 1, 1, 3089, 1, 4, 1, 4, 10, -1879048192, 0, 0, 1, 2, 1, 2, 0, -1879048192, 0, 9, 10, 11, 2, 12, 2, 4, -1, 13, 14, 2, 4, -1, 15, 16, 17, 2, 4, -1, 18, 2, 3, 2, -1, 2, 2, -1, 0, 5, 15, 5, 3, 7, 13, -1, 19, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        String[] stringArray = new String[iK[143]];
        stringArray[_aT.iK[144]] = "Xeno";
        stringArray[_aT.iK[145]] = ": ";
        stringArray[_aT.iK[146]] = ": ";
        stringArray[_aT.iK[147]] = "Rainbow";
        stringArray[_aT.iK[148]] = " \u00a77";
        stringArray[_aT.iK[149]] = "_";
        stringArray[_aT.iK[150]] = " \u00a77";
        stringArray[_aT.iK[151]] = "Press a key...";
        stringArray[_aT.iK[152]] = ": ";
        stringArray[_aT.iK[153]] = "CustomFont";
        stringArray[_aT.iK[154]] = "Center";
        stringArray[_aT.iK[155]] = "";
        stringArray[_aT.iK[156]] = "";
        stringArray[_aT.iK[157]] = "Left";
        stringArray[_aT.iK[158]] = "";
        stringArray[_aT.iK[159]] = "Right";
        stringArray[_aT.iK[160]] = "";
        stringArray[_aT.iK[161]] = "";
        stringArray[_aT.iK[162]] = "";
        iJ = stringArray;
    }

    @Override
    public void drawFrame(ArrayList<_bH> arrayList, _aL _aL2, boolean bl, int n, int n2, int n3, int n4, int n5) {
        _cm_0.pP = iK[42];
        int n6 = _cm_0.pO + iK[43] + (bl ? _aR.it + _cm_0.pP / iK[44] : iK[45]);
        int n7 = iK[46];
        _ah_0.drawRoundedRect(n - iK[47], n2, _cm_0.pN + iK[48], n6, _cm_0.pR, bl ? _cm_0.pR : iK[49], bl ? _cm_0.pR : iK[50], _cm_0.pR, new Color(iK[51], iK[52], iK[53], iK[54]).getRGB());
        if (_aB.gA.isEnabled()) {
            _as_0.fA.blur(n - iK[55], n2 - iK[56], n3 + iK[57], n6 + iK[58], (int)_aB.gB.getDoubleValue());
        }
        _ah_0.drawRoundedOutline(n - iK[59], n2, _cm_0.pN + iK[60], n6, _cm_0.pR, bl ? _cm_0.pR : iK[61], bl ? _cm_0.pR : iK[62], _cm_0.pR, 2.0, _aR.io);
        _ah_0.drawRectMC(n - iK[63], n2 + _cm_0.pO + _aR.it + iK[64], n + _cm_0.pN + iK[65], n2 + _cm_0.pO + _aR.it + iK[66], iK[67]);
        if (bl) {
            _ah_0.drawRect(n - iK[68], (double)(n2 + _cm_0.pO) + 2.5, n + _cm_0.pN + iK[69], (double)(n2 + _cm_0.pO) + 3.5, _ck_0.pz);
        }
        if (bl) {
            int n8 = iK[70];
            int n9 = iK[71];
            if (!arrayList.isEmpty()) {
                GL11.glPushMatrix();
                _ah_0.drawRectMC(n - iK[72], n2 + _cm_0.pO + _aR.it + iK[73], n + _cm_0.pN + iK[74], n2 + _cm_0.pO + _aR.it + iK[75], iK[76]);
                _ah_0.drawRectMC(n - iK[77], n2 + _cm_0.pO + _aR.it + iK[78], n + _cm_0.pN + iK[79], n2 + _cm_0.pO + _aR.it + iK[80], _ck_0.pz);
                GL11.glPopMatrix();
                GL11.glPushAttrib((int)iK[81]);
                _ah_0.scissor(n - iK[82], n2 + _cm_0.pO + iK[83], n + _cm_0.pN + iK[84], n2 + _cm_0.pO + _aR.it + iK[85]);
                GL11.glEnable((int)iK[86]);
                for (_bH _bH2 : arrayList) {
                    _bH2.renderComponent(n4, n5);
                    if (!(_bH2 instanceof _v_0)) continue;
                    int n10 = _cm_0.pP - iK[87];
                    _v_0 _v_02 = (_v_0)_bH2;
                    if (_v_02.aB) {
                        for (_bH _bH3 : _v_02.aA) {
                            int n11 = iK[88];
                            if (_bH3 instanceof _ai_0 && ((_ai_0)_bH3).dY) {
                                n11 = _cm_0.pP * _cm_0.pS;
                            }
                            n10 += _cm_0.pP + n11;
                        }
                    }
                    if (_aB.gE.N) {
                        _ah_0.drawRoundedOutline(n, (double)n2 + _v_02.ay + 2.5, _cm_0.pN, _v_02.aB ? (double)n10 + 0.5 : (double)_cm_0.pP - 1.5, _cm_0.pR, 2.0, _aR.io);
                    } else if (_v_02.aB) {
                        _ah_0.drawRoundedOutline(n, (double)n2 + _v_02.ay + 2.5, _cm_0.pN, (double)n10 + 0.5, _cm_0.pR, 2.0, _aR.io);
                    }
                    if (_v_02.ay < 0.0 && n8 == 0) {
                        n8 = iK[89];
                    }
                    _Y _Y2 = (_Y)_v_02.getSubcomponents().get(_v_02.getSubcomponents().size() - iK[90]);
                    if (!(_v_02.ay > (double)_aR.it && n9 == 0) && (!_v_02.aB || !(_Y2.cH > (double)_aR.it) || n9 != 0)) continue;
                    n9 = iK[91];
                }
                if (this.bx) {
                    GL11.glDisable((int)iK[92]);
                    GL11.glPopAttrib();
                }
            }
            if (n8 != 0) {
                _ah_0.drawGradientRect(n - iK[93], n2 + _cm_0.pO + iK[94], n + n3 + iK[95], n2 + _cm_0.pO + iK[96] + iK[97], iK[98], iK[99], iK[100]);
            }
            if (n9 != 0) {
                _ah_0.drawGradientRect(n - iK[101], n2 + _cm_0.pO + iK[102] + _aR.it - _cm_0.pP, n + n3 + iK[103], n2 + _cm_0.pO + iK[104] + _aR.it, iK[105], iK[106], iK[107]);
            }
        }
        if (_as_0.fB.getModule(iJ[iK[108]]).isEnabled()) {
            if (_aB.gw.is(iJ[iK[109]])) {
                _cX.te.drawStringWithShadow((_aB.gy.N ? TextFormatting.UNDERLINE : iJ[iK[110]]) + _aL2.hE, n + n3 / iK[111] - _cX.te.getStringWidth((_aB.gy.N ? TextFormatting.UNDERLINE : iJ[iK[112]]) + _aL2.hE) / iK[113], n2 + iK[114], iK[115]);
            }
            if (_aB.gw.is(iJ[iK[116]])) {
                _cX.te.drawStringWithShadow((_aB.gy.N ? TextFormatting.UNDERLINE : iJ[iK[117]]) + _aL2.hE, n + iK[118], n2 + iK[119], iK[120]);
            }
            if (_aB.gw.is(iJ[iK[121]])) {
                _cX.te.drawStringWithShadow((_aB.gy.N ? TextFormatting.UNDERLINE : iJ[iK[122]]) + _aL2.hE, n + n3 - _cX.te.getStringWidth((_aB.gy.N ? TextFormatting.UNDERLINE : iJ[iK[123]]) + _aL2.hE) - iK[124], n2 + iK[125], iK[126]);
            }
        } else {
            _h_0.drawClickGuiString((_aB.gy.N ? TextFormatting.UNDERLINE : iJ[iK[127]]) + _aL2.hE, n + iK[128], n2 + iK[129], n + n3 / iK[130], n + n3, iK[131]);
        }
    }

    @Override
    public void drawStringComponent(_cs_0 _cs_02, _ak_0 _ak_02, _v_0 _v_02, boolean bl, boolean bl2, double d, int n, double d2, int n2, int n3) {
        if (bl) {
            _h_0.drawStringWithShadow(_cs_02.getName() + iJ[iK[30]] + _ak_02.getString() + iJ[iK[31]], _v_02.ax.getX() + iK[32], (float)((double)_v_02.ax.getY() + d + 2.0), iK[33]);
        } else {
            _h_0.drawStringWithShadow(_cs_02.getName() + iJ[iK[34]] + _cs_02.getText(), _v_02.ax.getX() + iK[35], (float)((double)_v_02.ax.getY() + d + 2.0), iK[36]);
        }
    }

    @Override
    public void drawDescription(String string, _K _K2, int n, int n2) {
        _as_0.fA.blur(n + iK[136], n2 - iK[137], _h_0.getStringWidth(string) + iK[138], 15.0, iK[139]);
        _h_0.drawStringWithShadow(string, n + iK[140], n2 - iK[141], iK[142]);
    }

    @Override
    public void drawButton(_aS _aS2, _bA _bA2, ArrayList<_bH> arrayList, boolean bl, double d, int n, int n2, boolean bl2) {
        _h_0.drawClickGuiString(_bA2.getName(), _aS2.getX() + iK[132], (float)((double)_aS2.getY() + d + 2.5), _aS2.getX() + _aS2.getWidth() / iK[133], _aS2.getX() + _aS2.getWidth(), _bA2.isEnabled() ? _aR.io : iK[134]);
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
                    d2 += (double)(_cm_0.pP + (((_ai_0)_bH2).dY ? _cm_0.pP * _cm_0.pS : iK[135]));
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
}

