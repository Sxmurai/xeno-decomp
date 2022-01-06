//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraftforge.common.MinecraftForge
 */
import java.awt.Color;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.common.MinecraftForge;

/*
 * Renamed from _ct
 */
public class _ct_0
implements _cf_0 {
    public int qt;
    public float qv;
    public static final int[] qy = new int[]{0, 0, 0, 1, 0, 0, 0, 0, 0, 50, 0, 0, 2, 0, 1};
    public static final String[] qx;
    public _cb_0 qp;
    public int qs;
    public FontRenderer qm;
    public float qw;
    public String qo;
    public ScaledResolution qn;
    public _bA qq;
    public int qu;
    public int qr;

    public void refresh(int n, int n2) {
        this.qp.setxPosition(n);
        this.qr = n;
        this.qp.setyPosition(n2);
        this.qs = n2;
    }

    public _ct_0(String string, int n, int n2, _bA _bA2) {
        this.qm = _ct_0.pb.fontRenderer;
        this.qn = new ScaledResolution(pb);
        this.qt = qy[0];
        this.qu = qy[1];
        this.qv = 50.0f;
        this.qw = 50.0f;
        this.qt = n;
        this.qu = n2;
        this.qo = string;
        this.qq = _bA2;
        this.sub();
        try {
            this.qr = (Integer)_as_0.fG.lZ.get(string.toLowerCase() + qx[qy[2]]);
            this.qs = (Integer)_as_0.fG.lZ.get(string.toLowerCase() + qx[qy[3]]);
        }
        catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
            this.qr = n;
            this.qs = n2;
        }
        try {
            this.setEnabled(_as_0.fB.getModule((String)_bA2.lH).lM);
        }
        catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
            this.qq.lM = qy[4];
        }
        this.qp = new _cb_0(this.qr, this.qs, this.getWidth(), this.getHeight(), new Color(qy[5], qy[6], qy[7], qy[8]).getRGB(), this);
    }

    public int getWidth() {
        return qy[9];
    }

    static {
        String[] stringArray = new String[qy[12]];
        stringArray[_ct_0.qy[13]] = "X";
        stringArray[_ct_0.qy[14]] = "Y";
        qx = stringArray;
    }

    public void sub() {
        MinecraftForge.EVENT_BUS.register((Object)this);
        _as_0.fy.subscribe((Object)this);
    }

    public void renderDummy(int n, int n2) {
        this.qp.draw(n, n2);
    }

    public int getY() {
        return this.qp.getyPosition();
    }

    public void setHeight(float f) {
        this.qw = f;
    }

    public boolean isEnabled() {
        return this.qq.lM;
    }

    public float getHeight() {
        return this.qw;
    }

    public void update() {
        if (this.qp.getX() < 0) {
            this.qp.setX(qy[10]);
        }
        if ((float)this.qp.getX() > (float)_V.getDisplayWidth() - this.qp.getWidth()) {
            this.qp.setX((int)((float)_V.getDisplayWidth() - this.qp.getWidth()));
        }
        if (this.qp.getY() < 0) {
            this.qp.setY(qy[11]);
        }
        if ((float)this.qp.getY() > (float)_V.getDisplayHeight() - this.qp.getHeight()) {
            this.qp.setY((int)((float)_V.getDisplayHeight() - this.qp.getHeight()));
        }
    }

    public void setEnabled(boolean bl) {
        this.qq.lM = bl;
    }

    public int getX() {
        return this.qp.getxPosition();
    }

    public void draw() {
        this.update();
    }
}

