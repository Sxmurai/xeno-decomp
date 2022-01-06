//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _bf
 */
public class _bf_0
extends _ct_0 {
    public static final int[] qy = new int[]{0, 100, 0, 1, 2, 3, 4, 5, -7340032, 6, 7, 8, 0, 1, 2, 3, 4, 5, 6, 7};
    public static final String[] qx;

    @Override
    public int getWidth() {
        return _h_0.getStringWidth(qx[qy[9]] + pb.getSession().getUsername() + qx[qy[10]]);
    }

    public _bf_0() {
        super(qx[qy[0]], qy[1], qy[2], _as_0.fB.getModule(qx[qy[3]]));
    }

    static {
        String[] stringArray = new String[qy[11]];
        stringArray[_bf_0.qy[12]] = "Welcomer";
        stringArray[_bf_0.qy[13]] = "Welcomer";
        stringArray[_bf_0.qy[14]] = "Welcome to Xeno, ";
        stringArray[_bf_0.qy[15]] = "!";
        stringArray[_bf_0.qy[16]] = "Welcome to Xeno, ";
        stringArray[_bf_0.qy[17]] = "!";
        stringArray[_bf_0.qy[18]] = "Welcome to Xeno, ";
        stringArray[_bf_0.qy[19]] = "!";
        qx = stringArray;
    }

    @Override
    public void draw() {
        _h_0.drawStringWithShadow(qx[qy[4]] + pb.getSession().getUsername() + qx[qy[5]], this.getX(), this.getY(), _ck_0.pz);
        super.draw();
    }

    @Override
    public void renderDummy(int n, int n2) {
        super.renderDummy(n, n2);
        this.qp.setHeight(this.getHeight());
        this.qp.setWidth(this.getWidth());
        _h_0.drawStringWithShadow(qx[qy[6]] + pb.getSession().getUsername() + qx[qy[7]], this.getX(), this.getY(), this.qq.lM ? _ck_0.pz : qy[8]);
    }

    @Override
    public float getHeight() {
        return 11.0f;
    }
}

