//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.util.text.TextFormatting
 *  org.lwjgl.input.Mouse
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.text.TextFormatting;
import org.lwjgl.input.Mouse;

public class _bI
extends GuiScreen {
    public static int mN;
    public boolean mP = mR[0];
    public static ArrayList<_aS> mM;
    public static final int[] mR;
    public static boolean mL;
    public static int mO;
    public static final String[] mQ;

    public void mouseClicked(int n, int n2, int n3) throws IOException {
        for (_aS _aS2 : mM) {
            if (_aS2.isWithinHeader(n, n2) && n3 == 0 && !this.mP && !mL) {
                _aS2.setDrag(mR[33]);
                _aS2.iE = n - _aS2.getX();
                _aS2.iF = n2 - _aS2.getY();
                this.mP = mR[34];
                mL = mR[35];
            }
            if (_aS2.isWithinHeader(n, n2) && n3 == mR[36]) {
                if (_aB.gF.N) {
                    _cp_0.clickSound();
                }
                _aS2.setOpen(!_aS2.isOpen() ? mR[37] : mR[38]);
            }
            if (!_aS2.isOpen() || _aS2.getComponents().isEmpty()) continue;
            for (_bH _bH2 : _aS2.getComponents()) {
                _bH2.mouseClicked(n, n2, n3);
            }
        }
        if (n3 == 0 || n3 == mR[39]) {
            _cp_0.handleButtons(n, n2);
        }
    }

    public _bI() {
        mM = new ArrayList();
        mO = mR[1];
        _aS _aS2 = new _aS(_aL.hD);
        try {
            _aS2.setX((Integer)_as_0.fG.mb.get(_aS2.ix.name() + mQ[mR[2]]));
            _aS2.setY((Integer)_as_0.fG.mb.get(_aS2.ix.name() + mQ[mR[3]]));
            _aS2.setOpen((Boolean)_as_0.fG.mb.get(_aS2.ix.name() + mQ[mR[4]]));
        }
        catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
            _aS2.setX(mO);
            _aS2.setY(mR[5]);
            _aS2.setOpen(mR[6]);
        }
        mM.add(_aS2);
    }

    public void mouseReleased(int n, int n2, int n3) {
        if (!Mouse.isButtonDown((int)mR[42])) {
            for (_aS _aS2 : mM) {
                _aS2.setDrag(mR[43]);
            }
            this.mP = mR[44];
            mL = mR[45];
        }
        for (_aS _aS2 : mM) {
            if (!_aS2.isOpen() || _aS2.getComponents().isEmpty()) continue;
            for (_bH _bH2 : _aS2.getComponents()) {
                _bH2.mouseReleased(n, n2, n3);
            }
        }
    }

    public void initGui() {
    }

    public void keyTyped(char c, int n) {
        for (_aS _aS2 : mM) {
            if (!_aS2.isOpen() || n == mR[40]) continue;
            for (_bH _bH2 : _aS2.getComponents()) {
                _bH2.keyTyped(c, n);
            }
        }
        if (n == mR[41]) {
            this.mc.displayGuiScreen(null);
        }
    }

    public void drawScreen(int n, int n2, float f) {
        mN = _ck_0.pz;
        String string = mQ[mR[7]];
        int n3 = mR[8];
        this.drawDefaultBackground();
        if (_ax_0.gf.isEnabled()) {
            _as_0.fA.blur(mR[9]);
        }
        for (_ct_0 object : _as_0.fF.iX) {
            if (!object.qq.isEnabled()) continue;
            object.renderDummy(n, n2);
            FontRenderer fontRenderer = Minecraft.getMinecraft().fontRenderer;
            if (object.qp == null || !object.qp.oL) continue;
            String string2 = mQ[mR[10]] + (object.qq.lM ? mQ[mR[11]] + TextFormatting.GREEN + mQ[mR[12]] + TextFormatting.RESET + mQ[mR[13]] : mQ[mR[14]] + TextFormatting.RED + mQ[mR[15]] + TextFormatting.RESET + mQ[mR[16]]);
            _ah_0.drawRoundedRect(n + mR[17], n2 - mR[18], _h_0.getStringWidth(object.qo + string2) + mR[19], 13.0, 5.0, mR[20]);
            _ah_0.drawRoundedOutline(n + mR[21], n2 - mR[22], _h_0.getStringWidth(object.qo + string2) + mR[23], 13.0, 5.0, 2.0, _ck_0.pz);
            _h_0.drawStringWithShadow(object.qo + string2, n + mR[24], n2 - mR[25], mR[26]);
        }
        _w_0.drawArrayList();
        for (_aS _aS2 : mM) {
            _aS2.renderFrame(this.fontRenderer, n, n2);
            _aS2.updatePosition(n, n2);
            for (_bH _bH2 : _aS2.getComponents()) {
                _bH2.updateComponent(n, n2);
                if (!(_bH2 instanceof _v_0) || !((_v_0)_bH2).isMouseOnButton(n, n2)) continue;
                string = ((_v_0)_bH2).aw.lI;
                n3 = _aB.gH.isEnabled() && _aS2.isOpen() ? mR[27] : mR[28];
            }
            if (_aS2.getX() - mR[29] < 0) {
                _aS2.setX(mR[30]);
            }
            if (_aS2.getX() > _V.getDisplayWidth() - _aS2.getWidth()) {
                _aS2.setX(_V.getDisplayWidth() - _aS2.getWidth());
            }
            if (_aS2.getY() <= _V.getDisplayHeight() - _aS2.getBarHeight()) continue;
            _aS2.setY(_V.getDisplayHeight() - _aS2.getBarHeight());
        }
        if (n3 != 0) {
            _K _K2 = new _K();
            _aR.iq.drawDescription(string, _K2, n, n2);
        }
        this.checkMouseWheel(n, n2);
        this.overlay();
        _cp_0.renderButtons(n, n2);
    }

    public boolean mouseOver(int n, int n2, int n3, int n4, int n5, int n6) {
        return (n5 >= n && n6 >= n2 && n5 <= n3 && n6 <= n4 ? mR[31] : mR[32]) != 0;
    }

    static {
        mR = new int[]{0, 200, 0, 1, 2, 20, 1, 3, 0, 3, 4, 5, 6, 7, 8, 9, 10, 14, 6, 7, -1879048192, 14, 6, 7, 17, 5, -1, 1, 0, 2, 2, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 2, 2, 0, 2, 3, 2, 3, 2, 1, 3, 3, 1, 3, 3, 2, 3, 2, 3, 2, 11, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};
        String[] stringArray = new String[mR[66]];
        stringArray[_bI.mR[67]] = "X";
        stringArray[_bI.mR[68]] = "Y";
        stringArray[_bI.mR[69]] = "Open";
        stringArray[_bI.mR[70]] = "";
        stringArray[_bI.mR[71]] = " ";
        stringArray[_bI.mR[72]] = "[";
        stringArray[_bI.mR[73]] = "Enabled";
        stringArray[_bI.mR[74]] = "]";
        stringArray[_bI.mR[75]] = "[";
        stringArray[_bI.mR[76]] = "Disabled";
        stringArray[_bI.mR[77]] = "]";
        mQ = stringArray;
        mL = mR[78];
        mN = _cm_0.pQ;
    }

    public void onGuiClosed() {
        _as_0.fG.saveHudConfig();
        super.onGuiClosed();
    }

    public boolean doesGuiPauseGame() {
        return mR[46];
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
                    for (_aS _aS2 : mM) {
                        _aS2.setY(_aS2.getY() + _aS2.getBarHeight() / mR[47]);
                    }
                    break block13;
                }
                if (n3 <= 0) break block13;
                for (_aS _aS3 : mM) {
                    _aS3.setY(_aS3.getY() - _aS3.getBarHeight() / mR[48]);
                }
                break block13;
            }
            for (_aS iterator : mM) {
                _v_0 _v_03 = (_v_0)iterator.getComponents().get(mR[49]);
                if (!(_v_03.ay > (double)_aR.it)) continue;
                _v_03.ay = _aR.it;
                iterator.refresh();
                return;
            }
            int n4 = Mouse.getDWheel();
            if (n4 < 0) {
                for (_aS _aS4 : mM) {
                    if (!_aS4.isOpen() || !this.mouseOver(_aS4.getX() - mR[50], _aS4.getY() + _cm_0.pO + mR[51], _aS4.getX() + _cm_0.pN + mR[52], _aS4.getY() + _cm_0.pO + mR[53] + _aR.it, n, n2)) continue;
                    for (_bH _bH2 : _aS4.iw) {
                        if (!(_bH2 instanceof _v_0)) continue;
                        _v_02 = (_v_0)_bH2;
                        _v_02.ay += (double)(_cm_0.pP / mR[54]);
                    }
                }
            }
            for (_aS _aS5 : mM) {
                Iterator<_bH> iterator = (_v_0)_aS5.getComponents().get(_aS5.iw.size() - mR[55]);
                if (!((_v_0)((Object)iterator)).aB) {
                    if (!(((_v_0)((Object)iterator)).ay < (double)(_cm_0.pO + mR[56]))) continue;
                    ((_v_0)((Object)iterator)).ay = _cm_0.pO + mR[57] + _cm_0.pP;
                    _aS5.refresh();
                    return;
                }
                _Y _Y2 = (_Y)((_v_0)((Object)iterator)).getSubcomponents().get(((_v_0)((Object)iterator)).getSubcomponents().size() - mR[58]);
                if (!(_Y2.cH < (double)(_cm_0.pO + mR[59]))) continue;
                _Y2.cH = _cm_0.pO + mR[60] + _cm_0.pP;
                _aS5.refresh();
                return;
            }
            if (n4 > 0) {
                for (_aS _aS6 : mM) {
                    if (!_aS6.isOpen() || !this.mouseOver(_aS6.getX() - mR[61], _aS6.getY() + _cm_0.pO + mR[62], _aS6.getX() + _cm_0.pN + mR[63], _aS6.getY() + _cm_0.pO + mR[64] + _aR.it, n, n2)) continue;
                    for (_bH _bH3 : _aS6.iw) {
                        if (!(_bH3 instanceof _v_0)) continue;
                        _v_02 = (_v_0)_bH3;
                        _v_02.ay -= (double)(_cm_0.pP / mR[65]);
                    }
                }
            }
        }
    }

    public void overlay() {
    }
}

