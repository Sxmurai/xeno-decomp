//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.GuiScreen
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _d
 */
public class _d_0
extends _e_0 {
    public static final int[] pd = new int[]{0, 1, 0, 2, 2, 64, 64, 2, 0, 1};
    public static final String[] r;

    public _d_0() {
        super(r[pd[0]], r[pd[1]], pd[2]);
    }

    @Override
    public void render() {
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        pb.getTextureManager().bindTexture(this.o);
        Gui.drawModalRectWithCustomSizedTexture((int)(this.p * pd[3]), (int)(this.q * pd[4]), (float)0.0f, (float)0.0f, (int)pd[5], (int)pd[6], (float)64.0f, (float)64.0f);
    }

    static {
        String[] stringArray = new String[pd[7]];
        stringArray[_d_0.pd[8]] = "ClickGUI";
        stringArray[_d_0.pd[9]] = "textures/gui.png";
        r = stringArray;
    }

    @Override
    public void onClick() {
        pb.displayGuiScreen((GuiScreen)_as_0.fC);
    }
}

