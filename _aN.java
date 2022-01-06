//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 */
public class _aN
extends _bk_0 {
    public static final int[] jU = new int[]{-1, 0x70000000, -1879048192, -1};
    public double hR;
    public double hT;
    public _am_0 hV;
    public double hS;
    public _aL hQ;
    public double hU;

    public _aN(_aL _aL2, double d, double d2, double d3, _am_0 _am_02) {
        this.hQ = _aL2;
        this.hR = d;
        this.hS = d2;
        this.hT = d3;
        this.hU = 13.0;
        this.hV = _am_02;
    }

    @Override
    public void mouseClicked(int n, int n2, int n3) {
        if (_cp_0.mouseOver(this.hR, this.hS, this.hR + this.hT, this.hS + this.hU, n, n2) && n3 == 0) {
            this.hV.eK = this.hQ;
            this.hV.refreshModules();
        }
        super.mouseClicked(n, n2, n3);
    }

    @Override
    public void render(int n, int n2) {
        boolean bl = _cp_0.mouseOver(this.hR, this.hS, this.hR + this.hT, this.hS + 13.0, n, n2);
        _cp_0.drawBorderedRect(this.hR, this.hS, this.hT, this.hU, 1.0, jU[0], bl ? jU[1] : jU[2]);
        this.jT.fontRenderer.drawStringWithShadow(this.hQ.name(), (float)(this.hR + 4.0), (float)(this.hS + 3.0), this.hV.eK == this.hQ ? _ck_0.pz : jU[3]);
    }
}

