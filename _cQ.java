//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

public class _cQ {
    public static final int[] sD = new int[]{0, 1, 10, 0, 2, 0, 45, 0, 0, 0, 190, 1, 100, 30, 1, 100, -1879048192, 3, 0, -1, 1, 4, 0, 1, 2, 3};
    public static final String[] sC;

    public static void buttonPress(int n, int n2, int n3) {
        if (n3 == 0 && _cp_0.mouseOver(0.0, 100.0, 75.0, 125.0, n, n2)) {
            Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new _bs_0());
            _cp_0.qa = sD[20];
            _as_0.fG.saveMisc();
        }
    }

    static {
        String[] stringArray = new String[sD[21]];
        stringArray[_cQ.sD[22]] = "In Main Menu";
        stringArray[_cQ.sD[23]] = "Logged in as ";
        stringArray[_cQ.sD[24]] = "Xeno Client";
        stringArray[_cQ.sD[25]] = "Xeno Main\nMenu";
        sC = stringArray;
    }

    public static void render(int n, int n2) {
        _ap_0.update(sC[sD[0]]);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(sC[sD[1]] + Minecraft.getMinecraft().getSession().getUsername());
        arrayList.sort(Comparator.comparingInt(object -> _cX.te.getStringWidth((String)object)).reversed());
        int n3 = _cX.tf.getStringWidth(_as_0.fv) + sD[2];
        if (_cX.te.getStringWidth((String)arrayList.get(sD[3])) > _cX.tf.getStringWidth(sC[sD[4]])) {
            n3 = _cX.te.getStringWidth((String)arrayList.get(sD[5])) + sD[6];
        }
        _ah_0.drawRoundedRect(-10.0, -10.0, n3, 55.0, 10.0, new Color(sD[7], sD[8], sD[9], sD[10]).getRGB());
        _cX.tf.drawRainbowStringWithShadow(_as_0.fv, 10.0f, 10.0f, _M.rainbowWave(4.0f, 1.0f, 1.0f, sD[11]), 3.0f, 0.9f, sD[12]);
        int n4 = sD[13];
        for (String string : arrayList) {
            _cX.te.drawRainbowStringWithShadow(string, 10.0f, n4, _M.rainbowWave(4.0f, 1.0f, 1.0f, sD[14]), 3.0f, 0.9f, sD[15]);
            n4 += 10;
        }
        _ah_0.drawRoundedRect(-10.0, 100.0, 85.0, 25.0, 5.0, sD[16]);
        _cX.te.drawStringWithShadow(sC[sD[17]], 3.0f, 103.0f, _cp_0.mouseOver(0.0, 100.0, 75.0, 125.0, n, n2) ? _M.rainbowWave(4.0f, 1.0f, 1.0f, sD[18]) : sD[19]);
    }
}

