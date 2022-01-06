//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import net.minecraft.client.gui.ScaledResolution;
import org.lwjgl.opengl.GL11;

public class _I
implements _cf_0 {
    public static final int[] pd = new int[]{70, 64, 20, 10, -1879048192, 100, 0, 10, 70, -1879048192, 0, 100, 1, 10, 98, 0, 100, 2, 90, -1, 64, 64, 3, 0, 1, 2};
    public static final String[] bz;
    public ArrayList<_e_0> by = new ArrayList();

    static {
        String[] stringArray = new String[pd[22]];
        stringArray[_I.pd[23]] = "Xeno Client";
        stringArray[_I.pd[24]] = "Xeno Client";
        stringArray[_I.pd[25]] = "Xeno Client";
        bz = stringArray;
    }

    public void click(int n, int n2, int n3) {
        if (n3 == 0) {
            for (_e_0 _e_02 : this.by) {
                if (!_cp_0.mouseOver(_e_02.p, _e_02.q, _e_02.p + pd[20], _e_02.q + pd[21], n, n2)) continue;
                _e_02.onClick();
            }
        }
    }

    public _I() {
        this.init();
    }

    public void renderTaskbar(int n, int n2) {
        GL11.glPushMatrix();
        ScaledResolution scaledResolution = new ScaledResolution(pb);
        _ah_0.drawRoundedRect(-10.0, scaledResolution.getScaledHeight() - pd[0], this.by.size() * pd[1] + pd[2], scaledResolution.getScaledHeight() + pd[3], 10.0, pd[4]);
        _ah_0.drawRect(0.0, scaledResolution.getScaledHeight() - pd[5], _cX.tf.getStringWidth(bz[pd[6]]) + pd[7], scaledResolution.getScaledHeight() - pd[8], pd[9]);
        _ah_0.drawLeftGradientRect(pd[10], scaledResolution.getScaledHeight() - pd[11], _cX.tf.getStringWidth(bz[pd[12]]) + pd[13], scaledResolution.getScaledHeight() - pd[14], _M.rainbowWave(4.0f, 1.0f, 1.0f, pd[15]), _M.rainbowWave(4.0f, 1.0f, 1.0f, pd[16]));
        _cX.tf.drawStringWithShadow(bz[pd[17]], 5.0f, scaledResolution.getScaledHeight() - pd[18], pd[19]);
        GL11.glPopMatrix();
        for (_e_0 _e_02 : this.by) {
            GL11.glPushMatrix();
            _e_02.update();
            _e_02.render();
            GL11.glPopMatrix();
        }
    }

    public void init() {
        this.by.add(new _d_0());
        this.by.add(new _co_0());
    }
}

