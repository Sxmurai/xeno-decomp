//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Gui
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.gui.Gui;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _co
 */
public class _co_0
extends _e_0 {
    public static final int[] pZ = new int[]{0, 1, 64, 2, 2, 64, 64, 2, 0, 1};
    public static final String[] pY;

    static {
        String[] stringArray = new String[pZ[7]];
        stringArray[_co_0.pZ[8]] = "HUD";
        stringArray[_co_0.pZ[9]] = "textures/hud.png";
        pY = stringArray;
    }

    public _co_0() {
        super(pY[pZ[0]], pY[pZ[1]], pZ[2]);
    }

    @Override
    public void render() {
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        pb.getTextureManager().bindTexture(this.o);
        Gui.drawModalRectWithCustomSizedTexture((int)(this.p * pZ[3]), (int)(this.q * pZ[4]), (float)0.0f, (float)0.0f, (int)pZ[5], (int)pZ[6], (float)64.0f, (float)64.0f);
    }

    @Override
    public void onClick() {
    }
}

