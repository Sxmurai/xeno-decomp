/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.text.TextFormatting
 *  org.lwjgl.input.Keyboard
 */
import java.awt.Color;
import java.util.ArrayList;
import net.minecraft.util.text.TextFormatting;
import org.lwjgl.input.Keyboard;

/*
 * Renamed from _cn
 */
public class _cn_0
extends _H {
    public static final int[] pX = new int[]{0, 0, 2, 2, Integer.MIN_VALUE, 6, -1, 2, 2, Integer.MIN_VALUE, 1, 6, -1, 2, 2, Integer.MIN_VALUE, 2, 0, 2, 6, -1, 2, 2, Integer.MIN_VALUE, 0x70000000, 4, 14, 4, 5, 3, 2, 6, 255, -1, 6, -1, 2, 2, Integer.MIN_VALUE, 4, 5, 6, -1, 6, 6, -1, 2, 2, Integer.MIN_VALUE, 7, 8, 6, -1, 3, 0, 0, 1, 2, 2, 254, 9, 2, 1, -1, 2, 2, 0x70000000, 2, -1, 0, 1, 0, 1, 0, 2, 1, 5, 15, 5, -16777216, 5, 15, 5, 7, 13, -1, 10, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static final String[] pW;

    @Override
    public void drawStringComponent(_cs_0 _cs_02, _ak_0 _ak_02, _v_0 _v_02, boolean bl, boolean bl2, double d, int n, double d2, int n2, int n3) {
        _ah_0.drawRect(_v_02.ax.getX() - pX[36], (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth() + pX[37], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, pX[38]);
        if (bl) {
            _h_0.drawStringWithShadow(_cs_02.getName() + pW[pX[39]] + _ak_02.getString() + pW[pX[40]], _v_02.ax.getX() + pX[41], (float)((double)_v_02.ax.getY() + d + 1.0), pX[42]);
        } else {
            _h_0.drawStringWithShadow(_cs_02.getName() + pW[pX[43]] + _cs_02.getText(), _v_02.ax.getX() + pX[44], (float)((double)_v_02.ax.getY() + d + 1.0), pX[45]);
        }
    }

    @Override
    public void drawKeybind(_cO _cO2, double d, _v_0 _v_02, boolean bl, int n, int n2) {
        _ah_0.drawRect(_v_02.ax.getX() - pX[46], (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth() + pX[47], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, pX[48]);
        _h_0.drawStringWithShadow(bl ? pW[pX[49]] : _cO2.ju + pW[pX[50]] + Keyboard.getKeyName((int)_cO2.getKeyCode()), _v_02.ax.getX() + pX[51], (float)((double)_v_02.ax.getY() + d + 1.0), pX[52]);
    }

    @Override
    public void drawBoolean(_k_0 _k_02, _v_0 _v_02, double d, int n, int n2, boolean bl) {
        _ah_0.drawRect(_v_02.ax.getX() - pX[2], (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth() + pX[3], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, pX[4]);
        if (_k_02.isEnabled()) {
            _ah_0.drawRect(_v_02.ax.getX(), (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth(), (double)_v_02.ax.getY() + d + (double)_cm_0.pP, _ck_0.pz);
        }
        _h_0.drawStringWithShadow(_k_02.getName(), _v_02.ax.getX() + pX[5], (float)((double)_v_02.ax.getY() + d + 1.0), pX[6]);
    }

    @Override
    public void drawDescription(String string, _K _K2, int n, int n2) {
        _ah_0.drawRoundedRect(n + pX[76], n2 - pX[77], _h_0.getStringWidth(string) + pX[78], 15.0, _cm_0.pR, pX[79]);
        _ah_0.drawRoundedOutline(n + pX[80], n2 - pX[81], _h_0.getStringWidth(string) + pX[82], 15.0, _cm_0.pR, 2.0, _ck_0.pz);
        _h_0.drawStringWithShadow(string, n + pX[83], n2 - pX[84], pX[85]);
    }

    @Override
    public void drawColourPicker(_ai_0 _ai_02, _cA _cA2, double d, boolean bl, _v_0 _v_02, int n, int n2) {
        _ah_0.drawRect(_v_02.ax.getX() - pX[21], (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth() + pX[22], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, pX[23]);
        if (bl) {
            _ah_0.drawRect(_v_02.ax.getX(), (double)_v_02.ax.getY() + d + (double)_cm_0.pP, _v_02.ax.getX() + _v_02.ax.getWidth(), (double)_v_02.ax.getY() + d + (double)_cm_0.pP + (double)(_cm_0.pP * _cm_0.pS), pX[24]);
            _ai_02.drawPicker(_cA2, _v_02.ax.getX() + pX[25], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, _v_02.ax.getX() + _v_02.ax.getWidth() - pX[26], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, _v_02.ax.getX() + pX[27], (double)_v_02.ax.getY() + d + (double)(_cm_0.pP * pX[28]) - 1.0, n, n2);
            _h_0.drawCenteredString(pW[pX[29]], _v_02.ax.getX() + _v_02.ax.getWidth() / pX[30], (float)((double)_v_02.ax.getY() + d + (double)(_cm_0.pP * pX[31])), _cA2.getRainbow() ? new Color(_cA2.getColor().getRed(), _cA2.getColor().getGreen(), _cA2.getColor().getBlue(), pX[32]).getRGB() : pX[33]);
        }
        _h_0.drawStringWithShadow(_cA2.getName(), _v_02.ax.getX() + pX[34], (float)((double)_v_02.ax.getY() + d + 1.0), pX[35]);
    }

    @Override
    public void drawFrame(ArrayList<_bH> arrayList, _aL _aL2, boolean bl, int n, int n2, int n3, int n4, int n5) {
        int n6 = _cm_0.pO + pX[53];
        int n7 = pX[54];
        if (bl && !arrayList.isEmpty()) {
            for (_bH _bH2 : arrayList) {
                n6 += _cm_0.pP;
                if (!(_bH2 instanceof _v_0)) continue;
                _v_0 _v_02 = (_v_0)_bH2;
                if (!_v_02.aB) continue;
                for (_bH _bH3 : _v_02.aA) {
                    int n8 = pX[55];
                    if (_bH3 instanceof _ai_0 && ((_ai_0)_bH3).dY) {
                        n8 = _cm_0.pP * _cm_0.pS;
                    }
                    n6 += _cm_0.pP + n8;
                    if (n7 != 0) continue;
                    --n6;
                    n7 = pX[56];
                }
            }
        }
        _ah_0.drawRectMC(n - pX[57], n2, n + n3 + pX[58], n2 + _cm_0.pO, new _cV(new _cV(_ck_0.pz), pX[59]).getRGB());
        if (bl && !arrayList.isEmpty()) {
            for (_bH _bH2 : arrayList) {
                _bH2.renderComponent(n4, n5);
            }
        }
        _h_0.drawStringWithShadow((_aB.gy.N ? TextFormatting.UNDERLINE : pW[pX[60]]) + _aL2.hE, n + pX[61], n2 + pX[62], pX[63]);
    }

    @Override
    public void drawSlider(_cJ _cJ2, _v_0 _v_02, double d, int n, boolean bl, int n2, int n3) {
        _ah_0.drawRect(_v_02.ax.getX() - pX[13], (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth() + pX[14], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, pX[15]);
        _ah_0.drawRect(_v_02.ax.getX() + pX[16], (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth(), (double)_v_02.ax.getY() + d + (double)_cm_0.pP, pX[17]);
        _ah_0.drawRectWH((double)_v_02.ax.getX(), (double)_v_02.ax.getY() + d, (double)n, (double)_cm_0.pP, bl ? _ck_0.pA.brighter().getRGB() : _ck_0.pA.getRGB());
        _h_0.drawStringWithShadow(_cJ2.getName() + pW[pX[18]] + _cJ2.getDoubleValue(), _v_02.ax.getX() + pX[19], (float)((double)_v_02.ax.getY() + d + 1.0), pX[20]);
    }

    public _cn_0() {
        super(pW[pX[0]], pX[1]);
    }

    @Override
    public void drawButton(_aS _aS2, _bA _bA2, ArrayList<_bH> arrayList, boolean bl, double d, int n, int n2, boolean bl2) {
        _ah_0.drawRect(_aS2.getX() - pX[64], (double)_aS2.getY() + d, _aS2.getX() + _aS2.getWidth() + pX[65], (double)_aS2.getY() + d + (double)_cm_0.pP, pX[66]);
        _h_0.drawStringWithShadow(_bA2.getName(), _aS2.getX() + pX[67], (float)((double)_aS2.getY() + d + 1.0), _bA2.lM ? _ck_0.pz : pX[68]);
        if (bl && !arrayList.isEmpty()) {
            double d2 = d + (double)_cm_0.pP;
            int n3 = pX[69];
            for (_bH _bH2 : arrayList) {
                n3 += _cm_0.pP;
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
                    if (((_ai_0)_bH2).dY) {
                        _ah_0.drawRectWH((double)(_aS2.getX() - pX[70]), (double)_aS2.getY() + d + (double)_cm_0.pP + (double)n3, 1.0, (double)(_cm_0.pP * _cm_0.pS), _ck_0.pz);
                    }
                    d2 += (double)(_cm_0.pP + (((_ai_0)_bH2).dY ? _cm_0.pP * _cm_0.pS : pX[71]));
                    n3 += ((_ai_0)_bH2).dY ? _cm_0.pP * (_cm_0.pS - pX[72]) : pX[73];
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
            _ah_0.drawRect(_aS2.getX() - pX[74], (double)_aS2.getY() + d + (double)_cm_0.pP, _aS2.getX() - pX[75], (double)_aS2.getY() + d + (double)_cm_0.pP + (double)n3, _ck_0.pz);
        }
    }

    static {
        String[] stringArray = new String[pX[86]];
        stringArray[_cn_0.pX[87]] = "Plain";
        stringArray[_cn_0.pX[88]] = ": ";
        stringArray[_cn_0.pX[89]] = ": ";
        stringArray[_cn_0.pX[90]] = "Rainbow";
        stringArray[_cn_0.pX[91]] = " \u00a77";
        stringArray[_cn_0.pX[92]] = "_";
        stringArray[_cn_0.pX[93]] = " \u00a77";
        stringArray[_cn_0.pX[94]] = "Listening...";
        stringArray[_cn_0.pX[95]] = ": ";
        stringArray[_cn_0.pX[96]] = "";
        pW = stringArray;
    }

    @Override
    public void drawMode(_cd_0 _cd_02, _v_0 _v_02, double d, int n, int n2, boolean bl) {
        _ah_0.drawRect(_v_02.ax.getX() - pX[7], (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth() + pX[8], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, pX[9]);
        _h_0.drawStringWithShadow(_cd_02.getName() + pW[pX[10]] + _cd_02.getMode(), _v_02.ax.getX() + pX[11], (float)((double)_v_02.ax.getY() + d + 1.0), pX[12]);
    }
}

