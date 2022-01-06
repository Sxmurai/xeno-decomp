//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _am
 */
public class _am_0
extends _bk_0 {
    public ArrayList<_bk_0> eB;
    public boolean eH = jU[0];
    public double eC;
    public ArrayList<_bk_0> eA;
    public static final int[] jU = new int[]{0, 0, 0, 3, 0, 0, 3, 0, -1, -1879048192, -1, 0x50000000, -1879048192, 0, -1, 0, -1, 524288, 3089, 3089, 0, 3, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0};
    public double eI;
    public String eG;
    public static Minecraft jT;
    public double eJ;
    public double eD;
    public double eE;
    public double eF;
    public _aL eK = _aL.hD;
    public static final String[] eL;

    public void refreshModules() {
        this.eA = new ArrayList();
        double d = this.eC + 4.0;
        double d2 = this.eD + 44.0;
        int n = jU[5];
        for (_bA _bA2 : _as_0.fB.getModulesInCategory(this.eK)) {
            this.eA.add(new _bj_0(_bA2, d, d2));
            if (++n == jU[6]) {
                n = jU[7];
                d = this.eC + 4.0;
                d2 += 28.0;
                continue;
            }
            d += 142.0;
        }
    }

    public _am_0(String string, double d, double d2, double d3, double d4) {
        this.eG = string;
        ScaledResolution scaledResolution = new ScaledResolution(jT);
        this.eC = d;
        this.eD = d2;
        this.eE = d3;
        this.eF = d4;
        this.eB = new ArrayList();
        double d5 = this.eE / (double)_aL.values().length - 3.0;
        double d6 = 4.0;
        _aL[] _aLArray = _aL.values();
        int n = _aLArray.length;
        for (int i = jU[1]; i < n; ++i) {
            _aL _aL2 = _aLArray[i];
            this.eB.add(new _aN(_aL2, d + d6, d2 + 26.0, d5, this));
            d6 += d5 + 2.0;
        }
        this.eA = new ArrayList();
        double d7 = d + 4.0;
        double d8 = d2 + 44.0;
        int n2 = jU[2];
        for (_bA _bA2 : _as_0.fB.getModules()) {
            this.eA.add(new _bj_0(_bA2, d7, d8));
            if (++n2 == jU[3]) {
                n2 = jU[4];
                d7 = d + 4.0;
                d8 += 28.0;
                continue;
            }
            d7 += 142.0;
        }
        this.refreshModules();
    }

    @Override
    public void mouseReleased(int n, int n2, int n3) {
        this.setDrag(jU[24]);
        super.mouseReleased(n, n2, n3);
    }

    public void setDrag(boolean bl) {
        this.eH = bl;
    }

    @Override
    public void render(int n, int n2) {
        this.update(n, n2);
        _cp_0.drawBorderedRect(this.eC, this.eD, this.eE, this.eF, 1.0, jU[8], jU[9]);
        GL11.glPushMatrix();
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        _am_0.jT.fontRenderer.drawStringWithShadow(this.eG, (float)(this.eC + 5.0) / 2.0f, (float)(this.eD + 5.0) / 2.0f, _ck_0.pz);
        GL11.glPopMatrix();
        _ah_0.drawRect(this.eC, this.eD + 23.0, this.eC + this.eE, this.eD + 24.0, jU[10]);
        _ah_0.drawRect(this.eC + this.eE - 21.0, this.eD + 2.0, this.eC + this.eE - 2.0, this.eD + 22.0, _cp_0.mouseOver(this.eC + this.eE - 21.0, this.eD + 2.0, this.eC + this.eE - 2.0, this.eD + 22.0, n, n2) ? jU[11] : jU[12]);
        GL11.glPushMatrix();
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        _am_0.jT.fontRenderer.drawString(eL[jU[13]], (float)(this.eC + this.eE - 16.5) / 2.0f, (float)(this.eD + 3.0) / 2.0f, jU[14], jU[15]);
        GL11.glPopMatrix();
        for (_bk_0 _bk_02 : this.eB) {
            _bk_02.render(n, n2);
        }
        _ah_0.drawRect(this.eC, this.eD + 41.0, this.eC + this.eE, this.eD + 42.0, jU[16]);
        GL11.glPushMatrix();
        GL11.glPushAttrib((int)jU[17]);
        _ah_0.scissor(this.eC, this.eD + 44.0, this.eC + this.eE, this.eF - 44.0);
        GL11.glEnable((int)jU[18]);
        for (_bk_0 _bk_02 : this.eA) {
            _bk_02.render(n, n2);
        }
        GL11.glDisable((int)jU[19]);
        GL11.glPopAttrib();
        GL11.glPopMatrix();
        this.handleMouseWheel(n, n2);
    }

    @Override
    public void mouseClicked(int n, int n2, int n3) {
        if (_cp_0.mouseOver(this.eC, this.eD + 2.0, this.eC + this.eE - 22.0, this.eD + 22.0, n, n2)) {
            this.setDrag(jU[23]);
            this.eI = (double)n - this.eC;
            this.eJ = (double)n2 - this.eD;
        }
        if (_cp_0.mouseOver(this.eC + this.eE - 21.0, this.eD + 2.0, this.eC + this.eE - 2.0, this.eD + 22.0, n, n2) && n3 == 0) {
            jT.displayGuiScreen(null);
        }
        for (_bk_0 _bk_02 : this.eA) {
            if (this.eK != ((_bj_0)_bk_02).jP.lL) continue;
            _bk_02.mouseClicked(n, n2, n3);
        }
        for (_bk_0 _bk_02 : this.eB) {
            _bk_02.mouseClicked(n, n2, n3);
        }
    }

    public void handleMouseWheel(int n, int n2) {
        int n3 = Mouse.getDWheel();
        if (n3 < 0) {
            for (_bk_0 _bk_02 : this.eA) {
                _bj_0 _bj_02 = (_bj_0)this.eA.get(this.eA.size() - jU[25]);
                if (!_cp_0.mouseOver(this.eC, this.eD + 44.0, this.eC + this.eE, this.eD + this.eF, n, n2) || !(_bj_02.jR > this.eD + 44.0) || !(_bk_02 instanceof _bj_0)) continue;
                ((_bj_0)_bk_02).jR -= 13.0;
            }
        } else if (n3 > 0) {
            for (_bk_0 _bk_03 : this.eA) {
                if (!_cp_0.mouseOver(this.eC, this.eD + 44.0, this.eC + this.eE, this.eD + this.eF, n, n2) || !(((_bj_0)this.eA.get((int)_am_0.jU[26])).jR < this.eD + this.eF - 10.0)) continue;
                ((_bj_0)_bk_03).jR += 13.0;
            }
        }
        try {
            if (((_bj_0)this.eA.get((int)_am_0.jU[27])).jR > ((_bj_0)this.eA.get((int)_am_0.jU[28])).jR) {
                ((_bj_0)this.eA.get((int)_am_0.jU[29])).jR = ((_bj_0)this.eA.get((int)_am_0.jU[30])).jR;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void update(int n, int n2) {
        if (this.eH) {
            this.eC = (double)n - this.eI;
            this.eD = (double)n2 - this.eJ;
            double d = this.eC + 4.0;
            double d2 = this.eD + 44.0;
            int n3 = jU[20];
            for (_bk_0 _bk_02 : this.eA) {
                if (!(_bk_02 instanceof _bj_0)) continue;
                ((_bj_0)_bk_02).jQ = d;
                ((_bj_0)_bk_02).jR = d2;
                if (++n3 == jU[21]) {
                    n3 = jU[22];
                    d = this.eC + 4.0;
                    d2 += 28.0;
                    continue;
                }
                d += 142.0;
            }
            double d3 = this.eE / (double)_aL.values().length - 3.0;
            double d4 = this.eC + 4.0;
            for (_bk_0 _bk_03 : this.eB) {
                if (!(_bk_03 instanceof _aN)) continue;
                ((_aN)_bk_03).hR = d4;
                ((_aN)_bk_03).hS = this.eD + 26.0;
                d4 += d3 + 2.0;
            }
        }
    }

    static {
        String[] stringArray = new String[jU[31]];
        stringArray[_am_0.jU[32]] = "x";
        eL = stringArray;
        jT = Minecraft.getMinecraft();
    }
}

