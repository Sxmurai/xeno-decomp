//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 *  org.lwjgl.input.Mouse
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Mouse;

public class _aR
extends GuiScreen {
    public _K ir = new _K();
    public static final int[] iv = new int[]{0, 2, 6, 2, 0, 20, 6, 1, 0, 2, 6, 2, 0, 20, 6, 1, 1, 14, 2, 13, 3, 15, 4, 0, 2, 3, 2, 3, 1, 0, 2, 2, 0, 1, 0, 1, 1, 1, 1, 0, 2, 3, 2, 3, 1, 1, 1, 0, 0, 0, 0, 2, 2, 0, 2, 3, 2, 3, 0, 2, 1, 3, 3, 1, 3, 3, 2, 3, 2, 3, 2, 5, 0, 1, 2, 3, 4, 15};
    public static int ip;
    public static int io;
    public static int it;
    public boolean is = iv[0];
    public static ArrayList<_aS> in;
    public static _H iq;
    public static final String[] iu;

    static {
        String[] stringArray = new String[iv[71]];
        stringArray[_aR.iv[72]] = "Created ClickGUI";
        stringArray[_aR.iv[73]] = "Xeno";
        stringArray[_aR.iv[74]] = "Plain";
        stringArray[_aR.iv[75]] = "Future";
        stringArray[_aR.iv[76]] = "";
        iu = stringArray;
        io = _cm_0.pQ;
        it = _cm_0.pP * iv[77];
    }

    public void onGuiClosed() {
        for (_bA _bA2 : _D.bg) {
            _as_0.fG.saveModConfig(_bA2);
        }
        _as_0.fG.saveClickGUIConfig();
        super.onGuiClosed();
    }

    public void initGui() {
        for (_aS _aS2 : in) {
            _aS2.refresh();
        }
    }

    public void mouseClicked(int n, int n2, int n3) throws IOException {
        for (_aS _aS2 : in) {
            if (_aS2.isWithinHeader(n, n2) && n3 == 0 && !this.is) {
                _aS2.setDrag(iv[35]);
                _aS2.iE = n - _aS2.getX();
                _aS2.iF = n2 - _aS2.getY();
                this.is = iv[36];
            }
            if (_aS2.isWithinHeader(n, n2) && n3 == iv[37]) {
                if (_aB.gF.N) {
                    _cp_0.clickSound();
                }
                _aS2.setOpen(!_aS2.isOpen() ? iv[38] : iv[39]);
            }
            if (!_aS2.isOpen() || _aR.iq.bx && !this.mouseOver(_aS2.getX() - iv[40], _aS2.getY() + iv[41] + _cm_0.pO, _aS2.getX() + _cm_0.pN + iv[42], _aS2.getY() + iv[43] + _cm_0.pO + it, n, n2) || _aS2.getComponents().isEmpty()) continue;
            for (_bH _bH2 : _aS2.getComponents()) {
                _bH2.mouseClicked(n, n2, n3);
            }
        }
        if (n3 == 0 || n3 == iv[44]) {
            _cp_0.handleButtons(n, n2);
        }
    }

    public void mouseReleased(int n, int n2, int n3) {
        if (!Mouse.isButtonDown((int)iv[47])) {
            for (_aS _aS2 : in) {
                _aS2.setDrag(iv[48]);
            }
            this.is = iv[49];
        }
        for (_aS _aS2 : in) {
            if (!_aS2.isOpen() || _aS2.getComponents().isEmpty()) continue;
            for (_bH _bH2 : _aS2.getComponents()) {
                _bH2.mouseReleased(n, n2, n3);
            }
        }
    }

    public void overlay() {
    }

    public static void reset() {
        int n = _V.getDisplayWidth() / iv[9] - _aL.values().length * (_cm_0.pN + iv[10]) / iv[11];
        in.clear();
        _aL[] _aLArray = _aL.values();
        int n2 = _aLArray.length;
        for (int i = iv[12]; i < n2; ++i) {
            _aL _aL2 = _aLArray[i];
            _aS _aS2 = new _aS(_aL2);
            in.add(_aS2);
        }
        for (_aS _aS3 : in) {
            _aS3.setX(n);
            _aS3.setY(iv[13]);
            n += _cm_0.pN + iv[14];
            _aS3.setOpen(iv[15]);
        }
    }

    public static void themeSwitch() {
        if (_aB.gx.is(iu[iv[16]])) {
            _cm_0.pP = iv[17];
            iq = new _L();
        } else if (_aB.gx.is(iu[iv[18]])) {
            _cm_0.pP = iv[19];
            iq = new _cn_0();
        } else if (_aB.gx.is(iu[iv[20]])) {
            _cm_0.pP = iv[21];
            iq = new _f_0();
        }
        _aB.gG.toggle();
    }

    public void checkMouseWheel(int n, int n2) {
        block13: {
            _v_0 _v_02;
            block11: {
                int n3;
                block12: {
                    if (_aR.iq.bx) break block11;
                    n3 = Mouse.getDWheel();
                    if (n3 >= 0) break block12;
                    for (_aS _aS2 : in) {
                        _aS2.setY(_aS2.getY() + _aS2.getBarHeight() / iv[51]);
                    }
                    break block13;
                }
                if (n3 <= 0) break block13;
                for (_aS _aS3 : in) {
                    _aS3.setY(_aS3.getY() - _aS3.getBarHeight() / iv[52]);
                }
                break block13;
            }
            for (_aS iterator : in) {
                _v_0 _v_03 = (_v_0)iterator.getComponents().get(iv[53]);
                if (!(_v_03.ay > (double)it)) continue;
                _v_03.ay = it;
                iterator.refresh();
                return;
            }
            int n4 = Mouse.getDWheel();
            if (n4 < 0) {
                for (_aS _aS4 : in) {
                    if (!_aS4.isOpen() || !this.mouseOver(_aS4.getX() - iv[54], _aS4.getY() + _cm_0.pO + iv[55], _aS4.getX() + _cm_0.pN + iv[56], _aS4.getY() + _cm_0.pO + iv[57] + it, n, n2)) continue;
                    for (_bH _bH2 : _aS4.iw) {
                        if (!(_bH2 instanceof _v_0)) continue;
                        _v_02 = (_v_0)_bH2;
                        if (((_v_0)_aS4.getComponents().get((int)_aR.iv[58])).ay + 0.5 > (double)_cm_0.pO + 2.5) continue;
                        _v_02.ay += (double)(_cm_0.pP / iv[59]);
                    }
                }
            }
            for (_aS _aS5 : in) {
                Iterator<_bH> iterator = (_v_0)_aS5.getComponents().get(_aS5.iw.size() - iv[60]);
                if (!((_v_0)((Object)iterator)).aB) {
                    if (!(((_v_0)((Object)iterator)).ay < (double)(_cm_0.pO + iv[61]))) continue;
                    ((_v_0)((Object)iterator)).ay = _cm_0.pO + iv[62] + _cm_0.pP;
                    _aS5.refresh();
                    return;
                }
                _Y _Y2 = (_Y)((_v_0)((Object)iterator)).getSubcomponents().get(((_v_0)((Object)iterator)).getSubcomponents().size() - iv[63]);
                if (!(_Y2.cH < (double)(_cm_0.pO + iv[64]))) continue;
                _Y2.cH = _cm_0.pO + iv[65] + _cm_0.pP;
                _aS5.refresh();
                return;
            }
            if (n4 > 0) {
                for (_aS _aS6 : in) {
                    if (!_aS6.isOpen() || !this.mouseOver(_aS6.getX() - iv[66], _aS6.getY() + _cm_0.pO + iv[67], _aS6.getX() + _cm_0.pN + iv[68], _aS6.getY() + _cm_0.pO + iv[69] + it, n, n2)) continue;
                    for (_bH _bH3 : _aS6.iw) {
                        if (!(_bH3 instanceof _v_0)) continue;
                        _v_02 = (_v_0)_bH3;
                        _v_02.ay -= (double)(_cm_0.pP / iv[70]);
                    }
                }
            }
        }
    }

    public void drawScreen(int n, int n2, float f) {
        if (_aB.gz.isEnabled()) {
            this.drawDefaultBackground();
        }
        for (_aS _aS2 : in) {
            _aS2.refresh();
        }
        io = _ck_0.pz;
        iq.drawScreen();
        Object object = iu[iv[22]];
        int n3 = iv[23];
        for (_aS _aS3 : in) {
            _aS3.renderFrame(this.fontRenderer, n, n2);
            _aS3.updatePosition(n, n2);
            for (_bH _bH2 : _aS3.getComponents()) {
                _bH2.updateComponent(n, n2);
                if (!(_bH2 instanceof _v_0) || _aR.iq.bx && !this.mouseOver(_aS3.getX() - iv[24], _aS3.getY() + iv[25] + _cm_0.pO, _aS3.getX() + _cm_0.pN + iv[26], _aS3.getY() + iv[27] + _cm_0.pO + it, n, n2) || !((_v_0)_bH2).isMouseOnButton(n, n2)) continue;
                object = ((_v_0)_bH2).aw.lI;
                n3 = _aB.gH.isEnabled() && _aS3.isOpen() ? iv[28] : iv[29];
            }
            if (!_cm_0.pU) continue;
            if (_aS3.getX() - iv[30] < 0) {
                _aS3.setX(iv[31]);
            }
            if (_aS3.getX() > _V.getDisplayWidth() - _aS3.getWidth()) {
                _aS3.setX(_V.getDisplayWidth() - _aS3.getWidth());
            }
            if (_aS3.getY() <= _V.getDisplayHeight() - _aS3.getBarHeight()) continue;
            _aS3.setY(_V.getDisplayHeight() - _aS3.getBarHeight());
        }
        if (n3 != 0 && this.ir.hasTimeElapsed(1000L, iv[32])) {
            iq.drawDescription((String)object, this.ir, n, n2);
        }
        this.checkMouseWheel(n, n2);
        this.overlay();
        _cp_0.renderButtons(n, n2);
    }

    public boolean doesGuiPauseGame() {
        return iv[50];
    }

    public boolean mouseOver(int n, int n2, int n3, int n4, int n5, int n6) {
        return (n5 >= n && n6 >= n2 && n5 <= n3 && n6 <= n4 ? iv[33] : iv[34]) != 0;
    }

    public _aR() {
        this.themeSwitch();
        in = new ArrayList();
        int n = _V.getDisplayWidth() / iv[1] - _aL.values().length * (_cm_0.pN + iv[2]) / iv[3];
        in.clear();
        _aL[] _aLArray = _aL.values();
        int n2 = _aLArray.length;
        for (int i = iv[4]; i < n2; ++i) {
            _aL _aL2 = _aLArray[i];
            _aS _aS2 = new _aS(_aL2);
            in.add(_aS2);
        }
        for (_aS _aS3 : in) {
            _aS3.setX(n);
            _aS3.setY(iv[5]);
            n += _cm_0.pN + iv[6];
            _aS3.setOpen(iv[7]);
            _aS3.refresh();
        }
        _as_0.fx.info(iu[iv[8]]);
    }

    public void keyTyped(char c, int n) {
        for (_aS _aS2 : in) {
            if (!_aS2.isOpen() || n == iv[45]) continue;
            for (_bH _bH2 : _aS2.getComponents()) {
                _bH2.keyTyped(c, n);
            }
        }
        if (n == iv[46]) {
            this.mc.displayGuiScreen(null);
        }
    }
}

