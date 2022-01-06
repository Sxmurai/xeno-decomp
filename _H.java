/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public abstract class _H {
    public String bw;
    public boolean bx;

    public abstract void drawDescription(String var1, _K var2, int var3, int var4);

    public abstract void drawStringComponent(_cs_0 var1, _ak_0 var2, _v_0 var3, boolean var4, boolean var5, double var6, int var8, double var9, int var11, int var12);

    public abstract void drawMode(_cd_0 var1, _v_0 var2, double var3, int var5, int var6, boolean var7);

    public abstract void drawFrame(ArrayList<_bH> var1, _aL var2, boolean var3, int var4, int var5, int var6, int var7, int var8);

    public void drawScreen() {
        if (_aB.gC.isEnabled()) {
            _as_0.fA.blur((int)_aB.gD.getDoubleValue());
        }
    }

    public abstract void drawColourPicker(_ai_0 var1, _cA var2, double var3, boolean var5, _v_0 var6, int var7, int var8);

    public abstract void drawKeybind(_cO var1, double var2, _v_0 var4, boolean var5, int var6, int var7);

    public abstract void drawButton(_aS var1, _bA var2, ArrayList<_bH> var3, boolean var4, double var5, int var7, int var8, boolean var9);

    public abstract void drawSlider(_cJ var1, _v_0 var2, double var3, int var5, boolean var6, int var7, int var8);

    public abstract void drawBoolean(_k_0 var1, _v_0 var2, double var3, int var5, int var6, boolean var7);

    public _H(String string, boolean bl) {
        this.bw = string;
        this.bx = bl;
    }
}

