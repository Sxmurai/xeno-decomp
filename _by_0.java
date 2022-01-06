//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _by
 */
public class _by_0
extends _ct_0 {
    public static final int[] qy = new int[]{0, 0, 40, 1, 2, 1, 3, 1, -7340032, -1, -1, 4, 5, 0, 1, 2, 3, 4};
    public static final String[] qx;

    @Override
    public int getWidth() {
        return _h_0.getStringWidth(qx[qy[11]] + this.getPing());
    }

    public _by_0() {
        super(qx[qy[0]], qy[1], qy[2], _as_0.fB.getModule(qx[qy[3]]));
    }

    @Override
    public void renderDummy(int n, int n2) {
        super.renderDummy(n, n2);
        this.qp.setHeight(this.getHeight());
        this.qp.setWidth(this.getWidth());
        _h_0.drawStringWithShadow(qx[qy[6]] + this.getPing(), this.getX() + qy[7], this.getY(), this.qq.lM ? _ck_0.pz : qy[8]);
    }

    public static int getPing() {
        int n = qy[9];
        n = _by_0.pb.player == null || pb.getConnection() == null || pb.getConnection().getPlayerInfo(_by_0.pb.player.getName()) == null ? qy[10] : pb.getConnection().getPlayerInfo(_by_0.pb.player.getName()).getResponseTime();
        return n;
    }

    @Override
    public void draw() {
        _h_0.drawStringWithShadow(qx[qy[4]] + this.getPing(), this.getX() + qy[5], this.getY(), _ck_0.pz);
        super.draw();
    }

    static {
        String[] stringArray = new String[qy[12]];
        stringArray[_by_0.qy[13]] = "Ping";
        stringArray[_by_0.qy[14]] = "Ping";
        stringArray[_by_0.qy[15]] = "Ping: ";
        stringArray[_by_0.qy[16]] = "Ping: ";
        stringArray[_by_0.qy[17]] = "Ping: ";
        qx = stringArray;
    }

    @Override
    public float getHeight() {
        return 11.0f;
    }
}

