//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.text.TextFormatting
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _f
 */
public class _f_0
extends _H {
    public static final int[] v = new int[]{0, 0, 2, 2, 0x70000000, 100, 150, 100, 6, -1, 2, 2, 0x70000000, 100, 150, 6, -1, 6, 1, 2, 2, 0x70000000, 100, 100, 150, 2, 6, -1, 2, 2, 0x70000000, 230, 230, 230, 30, 6, -1, 2, 2, 0x70000000, 4, 14, 4, 5, 3, 6, 255, -1, 13, 4, 5, 12, 6, 7, 12, 2, 2, 0x70000000, 100, 100, 150, 8, 9, 6, -1, 10, 6, -1, 2, 2, 0x70000000, 150, 11, 12, 6, -1, 13, 15, 3, 0, 0, 0, 1, 2, 2, 170, 13, 13, 14, 15, 15, 16, 15, 2, 3, -1, 0, 0, 2, 2, 1, 0x70000000, 2, 2, 3, 0x70000000, 15, 2, 2, 0x70000000, 1, 1, 100, 150, 230, 230, 230, 26, 30, 2, -1, 2, 17, 18, 10, 19, 20, 10, 2, 2, 0x70000000, 0, 5, 14, 5, -16777216, 5, 14, 5, 7, 14, -1, 21, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    public static final String[] u;
    public _K t = new _K();

    @Override
    public void drawMode(_cd_0 _cd_02, _v_0 _v_02, double d, int n, int n2, boolean bl) {
        _ah_0.drawRect(_v_02.ax.getX() - v[10], (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth() + v[11], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, v[12]);
        _ah_0.drawRect(_v_02.ax.getX(), (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth(), (double)_v_02.ax.getY() + d + (double)_cm_0.pP, new _cV(new _cV(_ck_0.pz), bl ? v[13] : v[14]).getRGB());
        _h_0.drawStringWithShadow(_cd_02.getName(), _v_02.ax.getX() + v[15], (float)((double)_v_02.ax.getY() + d + 2.0), v[16]);
        _h_0.drawStringWithShadow(_cd_02.getMode(), _v_02.ax.getX() + v[17] + _h_0.getStringWidth(_cd_02.getName() + u[v[18]]), (float)((double)_v_02.ax.getY() + d + 2.0), Color.GRAY.brighter().getRGB());
    }

    public _f_0() {
        super(u[v[0]], v[1]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void drawFrame(ArrayList<_bH> arrayList, _aL _aL2, boolean bl, int n, int n2, int n3, int n4, int n5) {
        void var13_21;
        _cm_0.pO = v[76];
        _cm_0.pP = v[77];
        int n6 = _cm_0.pO + v[78];
        int n7 = v[79];
        int n8 = v[80];
        if (bl && !arrayList.isEmpty()) {
            for (_bH object2 : arrayList) {
                n6 += _cm_0.pP;
                if (!(object2 instanceof _v_0)) continue;
                _bH _bH2 = (_v_0)object2;
                if (!((_v_0)_bH2).aB) continue;
                for (_bH _bH3 : ((_v_0)_bH2).aA) {
                    int n9 = v[81];
                    if (_bH3 instanceof _ai_0 && ((_ai_0)_bH3).dY) {
                        n9 = _cm_0.pP * _cm_0.pS;
                    }
                    n6 += _cm_0.pP + n9;
                    if (n7 == 0) {
                        --n6;
                        n7 = v[82];
                    }
                    ++n8;
                }
            }
        }
        _ah_0.drawRectMC(n - v[83], n2, n + n3 + v[84], n2 + _cm_0.pO, new _cV(new _cV(_ck_0.pz), v[85]).getRGB());
        int n10 = v[86];
        if (bl) {
            ResourceLocation n11 = new ResourceLocation(u[v[87]], u[v[88]]);
            Minecraft.getMinecraft().getTextureManager().bindTexture(n11);
            Gui.drawModalRectWithCustomSizedTexture((int)(n + n3 - v[89]), (int)n2, (float)0.0f, (float)0.0f, (int)n10, (int)n10, (float)n10, (float)n10);
        } else {
            ResourceLocation resourceLocation = new ResourceLocation(u[v[90]], u[v[91]]);
            Minecraft.getMinecraft().getTextureManager().bindTexture(resourceLocation);
            Gui.drawModalRectWithCustomSizedTexture((int)(n + n3 - v[92]), (int)n2, (float)0.0f, (float)0.0f, (int)n10, (int)n10, (float)n10, (float)n10);
        }
        if (bl && !arrayList.isEmpty()) {
            for (_bH _bH2 : arrayList) {
                _bH2.renderComponent(n4, n5);
            }
        }
        _cX.drawStringWithShadow(_aL2.hE, n + v[93], n2 + v[94], v[95]);
        int n11 = v[96];
        int n12 = v[97];
        for (_bH _bH3 : arrayList) {
            if (!(_bH3 instanceof _v_0) || !((_v_0)_bH3).aB) continue;
            if (n12 == 0) {
                ++var13_21;
            }
            for (_bH _bH4 : ((_v_0)_bH3).aA) {
                var13_21 += _bH4.getHeight();
            }
        }
        if (bl) {
            Gui.drawRect((int)(n - v[98]), (int)(n2 + _cm_0.pO + arrayList.size() * _cm_0.pP + var13_21), (int)(n + n3 + v[99]), (int)(n2 + _cm_0.pO + arrayList.size() * _cm_0.pP + var13_21 + v[100]), (int)v[101]);
        } else {
            Gui.drawRect((int)(n - v[102]), (int)(n2 + _cm_0.pO), (int)(n + n3 + v[103]), (int)(n2 + _cm_0.pO + v[104]), (int)v[105]);
        }
    }

    @Override
    public void drawKeybind(_cO _cO2, double d, _v_0 _v_02, boolean bl, int n, int n2) {
        _ah_0.drawRect(_v_02.ax.getX() - v[68], (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth() + v[69], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, v[70]);
        if (bl) {
            _ah_0.drawRect(_v_02.ax.getX(), (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth(), (double)_v_02.ax.getY() + d + (double)_cm_0.pP, new _cV(new _cV(_ck_0.pz), v[71]).getRGB());
        }
        _h_0.drawStringWithShadow(bl ? u[v[72]] : _cO2.ju + TextFormatting.GRAY + u[v[73]] + Keyboard.getKeyName((int)_cO2.getKeyCode()), _v_02.ax.getX() + v[74], (float)((double)_v_02.ax.getY() + d + 2.0), v[75]);
    }

    @Override
    public void drawColourPicker(_ai_0 _ai_02, _cA _cA2, double d, boolean bl, _v_0 _v_02, int n, int n2) {
        _ah_0.drawRect(_v_02.ax.getX() - v[28], (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth() + v[29], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, v[30]);
        _ah_0.drawRect(_v_02.ax.getX(), (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth(), (double)_v_02.ax.getY() + d + (double)_cm_0.pP, new Color(v[31], v[32], v[33], v[34]).getRGB());
        _h_0.drawStringWithShadow(_cA2.getName(), _v_02.ax.getX() + v[35], (float)((double)_v_02.ax.getY() + d + 2.0), v[36]);
        if (bl) {
            _ah_0.drawRect(_v_02.ax.getX() - v[37], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, _v_02.ax.getX() + _v_02.ax.getWidth() + v[38], (double)_v_02.ax.getY() + d + (double)_cm_0.pP + (double)(_cm_0.pP * _cm_0.pS), v[39]);
            _ai_02.drawPicker(_cA2, _v_02.ax.getX() + v[40], (double)_v_02.ax.getY() + d + (double)_cm_0.pP + 5.0, _v_02.ax.getX() + _v_02.ax.getWidth() - v[41], (double)_v_02.ax.getY() + d + (double)_cm_0.pP + 5.0, _v_02.ax.getX() + v[42], (double)_v_02.ax.getY() + d + (double)(_cm_0.pP * v[43]), n, n2);
            _h_0.drawStringWithShadow(u[v[44]], _v_02.ax.getX() + v[45], (float)((double)_v_02.ax.getY() + d + 90.0), _cA2.getRainbow() ? new Color(_cA2.getColor().getRed(), _cA2.getColor().getGreen(), _cA2.getColor().getBlue(), v[46]).getRGB() : v[47]);
        }
        int n3 = v[48];
        if (!bl) {
            GL11.glPushMatrix();
            GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation resourceLocation = new ResourceLocation(u[v[49]], u[v[50]]);
            Minecraft.getMinecraft().getTextureManager().bindTexture(resourceLocation);
            _ah_0.drawModalRectWithCustomSizedTexture(_v_02.ax.getX() + _v_02.ax.getWidth() - v[51], (double)_v_02.ax.getY() + d + 2.0, 0.0f, 0.0f, 10.0, 10.0, 10.0f, 10.0f);
            GL11.glPopMatrix();
        } else {
            GL11.glPushMatrix();
            GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation resourceLocation = new ResourceLocation(u[v[52]], u[v[53]]);
            Minecraft.getMinecraft().getTextureManager().bindTexture(resourceLocation);
            _ah_0.drawModalRectWithCustomSizedTexture(_v_02.ax.getX() + _v_02.ax.getWidth() - v[54], (double)_v_02.ax.getY() + d + 2.0, 0.0f, 0.0f, 10.0, 10.0, 10.0f, 10.0f);
            GL11.glPopMatrix();
        }
    }

    @Override
    public void drawStringComponent(_cs_0 _cs_02, _ak_0 _ak_02, _v_0 _v_02, boolean bl, boolean bl2, double d, int n, double d2, int n2, int n3) {
        _ah_0.drawRect(_v_02.ax.getX() - v[55], (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth() + v[56], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, v[57]);
        if (bl2 && !bl) {
            _ah_0.drawRect(_v_02.ax.getX(), (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth(), (double)_v_02.ax.getY() + d + (double)_cm_0.pP, new _cV(new _cV(Color.GRAY), v[58]).getRGB());
        }
        if (bl) {
            _ah_0.drawRect(_v_02.ax.getX(), (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth(), (double)_v_02.ax.getY() + d + (double)_cm_0.pP, new _cV(new _cV(_ck_0.pz), bl2 ? v[59] : v[60]).getRGB());
            _h_0.drawStringWithShadow(_cs_02.getName() + u[v[61]] + _ak_02.getString() + u[v[62]], _v_02.ax.getX() + v[63], (float)((double)_v_02.ax.getY() + d + 2.0), v[64]);
        } else {
            _h_0.drawStringWithShadow(_cs_02.getName() + u[v[65]] + _cs_02.getText(), _v_02.ax.getX() + v[66], (float)((double)_v_02.ax.getY() + d + 2.0), v[67]);
        }
    }

    @Override
    public void drawDescription(String string, _K _K2, int n, int n2) {
        _ah_0.drawRoundedRect(n + v[132], n2 - v[133], _h_0.getStringWidth(string) + v[134], 12.0, _cm_0.pR, v[135]);
        _ah_0.drawRoundedOutline(n + v[136], n2 - v[137], _h_0.getStringWidth(string) + v[138], 12.0, _cm_0.pR, 2.0, _ck_0.pz);
        _h_0.drawStringWithShadow(string, n + v[139], n2 - v[140], v[141]);
    }

    @Override
    public void drawSlider(_cJ _cJ2, _v_0 _v_02, double d, int n, boolean bl, int n2, int n3) {
        _ah_0.drawRect(_v_02.ax.getX() - v[19], (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth() + v[20], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, v[21]);
        if (bl) {
            _ah_0.drawRect(_v_02.ax.getX() + n, (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth(), (double)_v_02.ax.getY() + d + (double)_cm_0.pP, new _cV(new _cV(Color.GRAY), v[22]).getRGB());
        }
        _ah_0.drawRectWH((double)_v_02.ax.getX(), (double)_v_02.ax.getY() + d, (double)n, (double)_cm_0.pP, new _cV(new _cV(_ck_0.pz), bl ? v[23] : v[24]).getRGB());
        _h_0.drawStringWithShadow(_cJ2.getName() + u[v[25]] + _cJ2.getDoubleValue(), _v_02.ax.getX() + v[26], (float)((double)_v_02.ax.getY() + d + 2.0), v[27]);
    }

    @Override
    public void drawBoolean(_k_0 _k_02, _v_0 _v_02, double d, int n, int n2, boolean bl) {
        _ah_0.drawRect(_v_02.ax.getX() - v[2], (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth() + v[3], (double)_v_02.ax.getY() + d + (double)_cm_0.pP, v[4]);
        if (_k_02.isEnabled()) {
            _ah_0.drawRect(_v_02.ax.getX(), (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth(), (double)_v_02.ax.getY() + d + (double)_cm_0.pP, new _cV(new _cV(_ck_0.pz), bl ? v[5] : v[6]).getRGB());
        }
        if (bl && !_k_02.isEnabled()) {
            _ah_0.drawRect(_v_02.ax.getX(), (double)_v_02.ax.getY() + d, _v_02.ax.getX() + _v_02.ax.getWidth(), (double)_v_02.ax.getY() + d + (double)_cm_0.pP, new _cV(new _cV(Color.GRAY), v[7]).getRGB());
        }
        _h_0.drawStringWithShadow(_k_02.getName(), _v_02.ax.getX() + v[8], (float)((double)_v_02.ax.getY() + d + 2.0), v[9]);
    }

    static {
        String[] stringArray = new String[v[142]];
        stringArray[_f_0.v[143]] = "Future";
        stringArray[_f_0.v[144]] = " ";
        stringArray[_f_0.v[145]] = ": ";
        stringArray[_f_0.v[146]] = "Rainbow";
        stringArray[_f_0.v[147]] = "xeno";
        stringArray[_f_0.v[148]] = "textures/future_gear.png";
        stringArray[_f_0.v[149]] = "xeno";
        stringArray[_f_0.v[150]] = "textures/future_gear_rotated.png";
        stringArray[_f_0.v[151]] = " \u00a77";
        stringArray[_f_0.v[152]] = "_";
        stringArray[_f_0.v[153]] = " \u00a77";
        stringArray[_f_0.v[154]] = "Press a key";
        stringArray[_f_0.v[155]] = " ";
        stringArray[_f_0.v[156]] = "xeno";
        stringArray[_f_0.v[157]] = "textures/future_arrow.png";
        stringArray[_f_0.v[158]] = "xeno";
        stringArray[_f_0.v[159]] = "textures/future_arrow_down.png";
        stringArray[_f_0.v[160]] = "xeno";
        stringArray[_f_0.v[161]] = "textures/future_gear.png";
        stringArray[_f_0.v[162]] = "xeno";
        stringArray[_f_0.v[163]] = "textures/future_gear_rotated.png";
        u = stringArray;
    }

    @Override
    public void drawButton(_aS _aS2, _bA _bA2, ArrayList<_bH> arrayList, boolean bl, double d, int n, int n2, boolean bl2) {
        _cm_0.pP = v[106];
        _ah_0.drawRect(_aS2.getX() - v[107], (double)_aS2.getY() + d, _aS2.getX() + _aS2.getWidth() + v[108], (double)_aS2.getY() + d + (double)_cm_0.pP, v[109]);
        _ah_0.drawRect(_aS2.getX() - v[110], (double)_aS2.getY() + d + 1.0, _aS2.getX() + _aS2.getWidth() + v[111], (double)_aS2.getY() + d + (double)_cm_0.pP, _bA2.lM ? new _cV(new _cV(_ck_0.pz), bl2 ? v[112] : v[113]).getRGB() : new Color(v[114], v[115], v[116], bl2 ? v[117] : v[118]).getRGB());
        _h_0.drawStringWithShadow(_bA2.getName(), _aS2.getX() + v[119], (float)((double)_aS2.getY() + d + 2.5), v[120]);
        if (arrayList.size() > v[121]) {
            ResourceLocation resourceLocation;
            if (!bl) {
                GL11.glPushMatrix();
                GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
                resourceLocation = new ResourceLocation(u[v[122]], u[v[123]]);
                Minecraft.getMinecraft().getTextureManager().bindTexture(resourceLocation);
                _ah_0.drawModalRectWithCustomSizedTexture(_aS2.getX() + _aS2.getWidth() - v[124], (double)_aS2.getY() + d + 3.0, 0.0f, 0.0f, 10.0, 10.0, 10.0f, 10.0f);
                GL11.glPopMatrix();
            } else {
                GL11.glPushMatrix();
                GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
                resourceLocation = new ResourceLocation(u[v[125]], u[v[126]]);
                Minecraft.getMinecraft().getTextureManager().bindTexture(resourceLocation);
                _ah_0.drawModalRectWithCustomSizedTexture(_aS2.getX() + _aS2.getWidth() - v[127], (double)_aS2.getY() + d + 3.0, 0.0f, 0.0f, 10.0, 10.0, 10.0f, 10.0f);
                GL11.glPopMatrix();
            }
        }
        if (bl && !arrayList.isEmpty()) {
            double d2 = d + (double)_cm_0.pP + 1.0;
            if (bl) {
                _ah_0.drawRect(_aS2.getX() - v[128], (double)_aS2.getY() + d2 - 1.0, _aS2.getX() + _aS2.getWidth() + v[129], (double)_aS2.getY() + d2, v[130]);
            }
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
                    d2 += (double)(_cm_0.pP + (((_ai_0)_bH2).dY ? _cm_0.pP * _cm_0.pS : v[131]));
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

