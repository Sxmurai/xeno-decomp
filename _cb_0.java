/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import org.lwjgl.input.Mouse;

/*
 * Renamed from _cb
 */
public class _cb_0 {
    public float oC;
    public int oB;
    public int oH;
    public int oF;
    public float oD;
    public int oG;
    public int oE;
    public boolean oL;
    public boolean oJ;
    public static final int[] oN = new int[]{0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0};
    public int oA;
    public boolean oK = oN[0];
    public int oI;
    public _ct_0 oM;

    public float getHeight() {
        return this.oD;
    }

    public void draw(int n, int n2) {
        this.draggingFix(n, n2);
        int n3 = n >= this.getxPosition() && (float)n <= (float)this.getxPosition() + this.getWidth() ? oN[1] : oN[2];
        int n4 = n2 >= this.getyPosition() && (float)n2 <= (float)this.getyPosition() + this.getHeight() ? oN[3] : oN[4];
        this.oH = n;
        this.oI = n2;
        this.oL = n3 != 0 && n4 != 0 ? oN[5] : oN[6];
        int n5 = this.oL ? 1 : 0;
        if (n3 != 0 && n4 != 0) {
            if (Mouse.isButtonDown((int)oN[7]) && !_bI.mL && !this.oJ) {
                this.oF = this.getX() - n;
                this.oG = this.getY() - n2;
                this.oJ = oN[8];
                _bI.mL = oN[9];
            }
            if (Mouse.isButtonDown((int)oN[10]) && !this.oK) {
                this.oM.qq.lM = !this.oM.qq.lM ? oN[11] : oN[12];
            }
        }
        this.oK = Mouse.isButtonDown((int)oN[13]);
    }

    public void setY(int n) {
        this.oB = n;
    }

    public int getxPosition() {
        return this.getX();
    }

    public void setxPosition(int n) {
        this.setX(n);
    }

    public void draggingFix(int n, int n2) {
        if (this.oJ) {
            this.setX(n + this.oF);
            this.setY(n2 + this.oG);
            if (!Mouse.isButtonDown((int)oN[14])) {
                this.oJ = oN[15];
            }
            this.oM.update();
        }
    }

    public float getWidth() {
        return this.oC;
    }

    public void setWidth(float f) {
        this.oC = f;
    }

    public void setyPosition(int n) {
        this.setY(n);
    }

    public int getX() {
        return this.oA;
    }

    public void setColor(int n) {
        this.oE = n;
    }

    public int getyPosition() {
        return this.getY();
    }

    public _cb_0(int n, int n2, float f, float f2, int n3, _ct_0 _ct_02) {
        this.oC = f;
        this.oD = f2;
        this.setX(n);
        this.setY(n2);
        this.oE = n3;
        this.oM = _ct_02;
    }

    public int getColor() {
        return this.oE;
    }

    public void setHeight(float f) {
        this.oD = f;
    }

    public void setX(int n) {
        this.oA = n;
    }

    public int getY() {
        return this.oB;
    }
}

