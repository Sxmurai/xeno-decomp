//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.ChatAllowedCharacters
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import net.minecraft.util.ChatAllowedCharacters;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _aw
 */
public class _aw_0
extends _bH {
    public static final int[] mK = new int[]{0, 1, 28, 14, 47, 157, 29, 28, 0, 1, 0, 1, 2, 0, 1, 1, 0, 3, 0, 1, 2};
    public boolean fV;
    public boolean fU;
    public _cs_0 fW;
    public _v_0 fX;
    public double fY;
    public static final String[] gc;
    public int fZ;
    public _ak_0 gb = new _ak_0(gc[mK[0]]);
    public double ga;

    public void enterString() {
        if (this.gb.getString().isEmpty()) {
            this.fW.setText(this.fW.getDefaultValue());
        } else {
            this.fW.setText(this.gb.getString());
        }
        this.setString(gc[mK[11]]);
    }

    static {
        String[] stringArray = new String[mK[17]];
        stringArray[_aw_0.mK[18]] = "";
        stringArray[_aw_0.mK[19]] = "";
        stringArray[_aw_0.mK[20]] = "";
        gc = stringArray;
    }

    @Override
    public void keyTyped(char c, int n) {
        if (this.fV) {
            if (n == mK[1]) {
                return;
            }
            if (n == mK[2]) {
                this.enterString();
            } else if (n == mK[3]) {
                this.setString(_aw_0.removeLastChar(this.gb.getString()));
            } else if (n == mK[4] && (Keyboard.isKeyDown((int)mK[5]) || Keyboard.isKeyDown((int)mK[6]))) {
                try {
                    this.setString(this.gb.getString() + Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            } else if (ChatAllowedCharacters.isAllowedCharacter((char)c)) {
                this.setString(this.gb.getString() + c);
            }
            if (n == mK[7]) {
                this.fV = mK[8];
            }
        }
    }

    @Override
    public void mouseClicked(int n, int n2, int n3) {
        if (this.isMouseOnButton(n, n2) && n3 == 0 && this.fX.aB) {
            this.fV = !this.fV ? mK[9] : mK[10];
            int n4 = this.fV ? 1 : 0;
            if (_aB.gF.N) {
                _cp_0.clickSound();
            }
        }
    }

    public _aw_0(_cs_0 _cs_02, _v_0 _v_02, double d) {
        this.fW = _cs_02;
        this.fX = _v_02;
        this.fZ = _v_02.ax.getX() + _v_02.ax.getWidth();
        this.ga = (double)_v_02.ax.getY() + _v_02.ay;
        this.fY = d;
    }

    public static String removeLastChar(String string) {
        String string2 = gc[mK[12]];
        if (string != null && string.length() > 0) {
            string2 = string.substring(mK[13], string.length() - mK[14]);
        }
        return string2;
    }

    @Override
    public void updateComponent(int n, int n2) {
        this.fU = this.isMouseOnButton(n, n2);
        this.ga = (double)this.fX.ax.getY() + this.fY;
        this.fZ = this.fX.ax.getX();
    }

    @Override
    public void renderComponent(int n, int n2) {
        GL11.glPushMatrix();
        _aR.iq.drawStringComponent(this.fW, this.gb, this.fX, this.fV, this.isMouseOnButton(n, n2), this.fY, this.fZ, this.ga, n, n2);
        GL11.glPopMatrix();
    }

    @Override
    public void setOff(double d) {
        this.fY = d;
    }

    @Override
    public int getHeight() {
        return _cm_0.pP;
    }

    public boolean isMouseOnButton(int n, int n2) {
        if (n > this.fZ && n < this.fZ + _cm_0.pN && (double)n2 > this.ga && (double)n2 < this.ga + (double)_cm_0.pP) {
            return mK[15];
        }
        return mK[16];
    }

    public void setString(String string) {
        this.gb = new _ak_0(string);
    }
}

