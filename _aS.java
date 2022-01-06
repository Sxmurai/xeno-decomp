/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.FontRenderer
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import net.minecraft.client.gui.FontRenderer;
import org.lwjgl.opengl.GL11;

public class _aS {
    public int iF;
    public int iA;
    public static final String[] iH;
    public _aL ix;
    public int iC;
    public boolean iD;
    public ArrayList<_bH> iw;
    public int iB;
    public _K iG = new _K();
    public int iE;
    public boolean iy;
    public static final int[] iI;
    public int iz;

    public ArrayList<_bH> getComponents() {
        return this.iw;
    }

    public void renderFrame(FontRenderer fontRenderer, int n, int n2) {
        GL11.glPushMatrix();
        _aR.iq.drawFrame(this.iw, this.ix, this.iy, this.getX(), this.getY(), this.getWidth(), n, n2);
        GL11.glPopMatrix();
    }

    public _aS(_aL _aL2) {
        this.iw = new ArrayList();
        this.ix = _aL2;
        this.iz = _cm_0.pN;
        this.iB = iI[0];
        this.iA = iI[1];
        this.iC = _cm_0.pO;
        this.iE = iI[2];
        this.iy = iI[3];
        this.iD = iI[4];
        double d = (double)this.iC + (_aR.iq.bx ? 2.5 : 0.0);
        for (_bA _bA2 : _as_0.fB.getModulesInCategory(this.ix)) {
            _v_0 _v_02 = new _v_0(_bA2, this, d);
            this.iw.add(_v_02);
            if (_aR.iq instanceof _L) {
                d += (double)_cm_0.pP - 0.5;
                continue;
            }
            d += (double)_cm_0.pP;
        }
        try {
            this.iB = (Integer)_as_0.fG.mb.get(this.ix.name() + iH[iI[5]]);
            this.iA = (Integer)_as_0.fG.mb.get(this.ix.name() + iH[iI[6]]);
            this.iy = (Boolean)_as_0.fG.mb.get(this.ix.name() + iH[iI[7]]);
        }
        catch (NullPointerException nullPointerException) {
            this.setY(iI[8]);
            this.setX(_aR.ip);
            _aR.ip += this.getWidth() + iI[9] + (_aR.iq instanceof _cn_0 ? iI[10] : iI[11]);
        }
    }

    public boolean isOpen() {
        return this.iy;
    }

    public void setY(int n) {
        this.iA = n;
    }

    public int getBarHeight() {
        return this.iC;
    }

    public void setDrag(boolean bl) {
        this.iD = bl;
    }

    public void setX(int n) {
        this.iB = n;
    }

    public int getWidth() {
        return this.iz;
    }

    public void refresh() {
        _v_0 _v_02 = (_v_0)this.iw.get(iI[12]);
        double d = _aR.iq.bx ? _v_02.ay : (double)this.iC;
        for (_bH _bH2 : this.iw) {
            _bH2.setOff(d);
            d += (double)_bH2.getHeight();
        }
    }

    public boolean isWithinHeader(int n, int n2) {
        if (n >= this.iB - iI[13] && n <= this.iB + this.iz + iI[14] && n2 >= this.iA && n2 <= this.iA + this.iC) {
            return iI[15];
        }
        return iI[16];
    }

    public void setOpen(boolean bl) {
        this.iy = bl;
        if (bl) {
            this.open();
        } else {
            this.close();
        }
    }

    public int getY() {
        return this.iA;
    }

    public int getX() {
        return this.iB;
    }

    public void close() {
    }

    static {
        iI = new int[]{5, 5, 0, 0, 0, 0, 1, 2, 10, 6, 4, 0, 0, 2, 2, 1, 0, 3, 0, 1, 2};
        String[] stringArray = new String[iI[17]];
        stringArray[_aS.iI[18]] = "X";
        stringArray[_aS.iI[19]] = "Y";
        stringArray[_aS.iI[20]] = "Open";
        iH = stringArray;
    }

    public void open() {
    }

    public void updatePosition(int n, int n2) {
        if (this.iD) {
            this.setX(n - this.iE);
            this.setY(n2 - this.iF);
        }
    }
}

