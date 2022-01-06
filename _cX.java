//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Font;
import java.io.InputStream;

public class _cX
implements _cf_0 {
    public static _C te;
    public static _C th;
    public static _C tg;
    public static final String[] ti;
    public static final int[] tj;
    public static _C tf;

    public static void drawStringWithShadow(String string, float f, float f2, int n) {
        if (_as_0.fB.isModuleEnabled(ti[tj[4]])) {
            te.drawStringWithShadow(string, f, f2, n);
        } else {
            _cX.pb.fontRenderer.drawStringWithShadow(string, f, f2, n);
        }
    }

    static {
        tj = new int[]{0, 1, 2, 3, 4, 5, 6, 0, 0, 7, 0, 8, 0, 1, 2, 3, 4, 5, 6, 7};
        String[] stringArray = new String[tj[11]];
        stringArray[_cX.tj[12]] = "comfortaa";
        stringArray[_cX.tj[13]] = "comfortaa";
        stringArray[_cX.tj[14]] = "aquire";
        stringArray[_cX.tj[15]] = "aquire";
        stringArray[_cX.tj[16]] = "CustomFont";
        stringArray[_cX.tj[17]] = "/assets/xeno/font/";
        stringArray[_cX.tj[18]] = ".ttf";
        stringArray[_cX.tj[19]] = "default";
        ti = stringArray;
    }

    public static int getFontHeight() {
        return _cX.te.FONT_HEIGHT;
    }

    public static Font getFont(String string, float f) {
        try {
            InputStream inputStream = _cX.class.getResourceAsStream(ti[tj[5]] + string + ti[tj[6]]);
            Font font = Font.createFont(tj[7], inputStream);
            font = font.deriveFont(tj[8], f);
            inputStream.close();
            return font;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return new Font(ti[tj[9]], tj[10], (int)f);
        }
    }

    public static int getFontString(String string, float f, float f2, int n) {
        return te.drawStringWithShadow(string, f, f2, n);
    }

    public static void load() {
        te = new _C(_cX.getFont(ti[tj[0]], 50.0f));
        tf = new _C(_cX.getFont(ti[tj[1]], 80.0f));
        th = new _C(_cX.getFont(ti[tj[2]], 50.0f));
        tg = new _C(_cX.getFont(ti[tj[3]], 120.0f));
    }

    public static int getStringWidth(String string) {
        return te.getStringWidth(string);
    }
}

