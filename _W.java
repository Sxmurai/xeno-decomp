//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 */
public class _W
extends _ct_0 {
    public static final int[] qy = new int[]{0, 0, 20, 1, 2, 1, 3, 1, -7340032, 4, 5, 0, 1, 2, 3, 4};
    public static final String[] qx;

    @Override
    public int getWidth() {
        return _h_0.getStringWidth(qx[qy[9]] + pb.getDebugFPS());
    }

    @Override
    public float getHeight() {
        return 11.0f;
    }

    static {
        String[] stringArray = new String[qy[10]];
        stringArray[_W.qy[11]] = "FPS";
        stringArray[_W.qy[12]] = "FPS";
        stringArray[_W.qy[13]] = "FPS: ";
        stringArray[_W.qy[14]] = "FPS: ";
        stringArray[_W.qy[15]] = "FPS: ";
        qx = stringArray;
    }

    public _W() {
        super(qx[qy[0]], qy[1], qy[2], _as_0.fB.getModule(qx[qy[3]]));
    }

    @Override
    public void draw() {
        _h_0.drawStringWithShadow(qx[qy[4]] + pb.getDebugFPS(), this.getX() + qy[5], this.getY(), _ck_0.pz);
        super.draw();
    }

    @Override
    public void renderDummy(int n, int n2) {
        super.renderDummy(n, n2);
        this.qp.setHeight(this.getHeight());
        this.qp.setWidth(this.getWidth());
        _h_0.drawStringWithShadow(qx[qy[6]] + pb.getDebugFPS(), this.getX() + qy[7], this.getY(), this.qq.lM ? _ck_0.pz : qy[8]);
    }
}

