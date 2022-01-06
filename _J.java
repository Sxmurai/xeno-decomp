//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.util.text.TextFormatting
 *  org.lwjgl.input.Mouse
 */
import java.io.IOException;
import java.util.ArrayList;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.text.TextFormatting;
import org.lwjgl.input.Mouse;

public class _J
extends GuiScreen {
    public ArrayList<_bk_0> bB = new ArrayList();
    public static TextFormatting bC;
    public static final int[] bE;
    public static final String[] bD;

    public void drawScreen(int n, int n2, float f) {
        for (_bk_0 _bk_02 : this.bB) {
            if (_bk_02 instanceof _am_0) {
                _bk_02.updateComponent(n, n2);
            }
            _bk_02.render(n, n2);
        }
        super.drawScreen(n, n2, f);
    }

    public void mouseClicked(int n, int n2, int n3) throws IOException {
        for (_bk_0 _bk_02 : this.bB) {
            _bk_02.mouseClicked(n, n2, n3);
        }
        super.mouseClicked(n, n2, n3);
    }

    public void keyTyped(char c, int n) throws IOException {
        super.keyTyped(c, n);
    }

    public void mouseReleased(int n, int n2, int n3) {
        if (!Mouse.isButtonDown((int)bE[5])) {
            for (_bk_0 _bk_02 : this.bB) {
                if (!(_bk_02 instanceof _am_0)) continue;
                ((_am_0)_bk_02).setDrag(bE[6]);
            }
        }
        for (_bk_0 _bk_02 : this.bB) {
            if (!(_bk_02 instanceof _am_0)) continue;
            for (_bk_0 _bk_03 : ((_am_0)_bk_02).eA) {
                _bk_03.mouseReleased(n, n2, n3);
            }
        }
        super.mouseReleased(n, n2, n3);
    }

    static {
        bE = new int[]{0, 2, 216, 2, 175, 0, 0, 1, 0};
        String[] stringArray = new String[bE[7]];
        stringArray[_J.bE[8]] = "Xeno Client 1.1";
        bD = stringArray;
        bC = TextFormatting.RED;
    }

    public _J() {
        this.bB.add(new _am_0(bD[bE[0]], _V.getDisplayWidth() / bE[1] - bE[2], _V.getDisplayHeight() / bE[3] - bE[4], 432.0, 336.0));
    }

    public void actionPerformed(GuiButton guiButton) throws IOException {
        super.actionPerformed(guiButton);
    }
}

