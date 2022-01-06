//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonSyntaxException
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.Shader
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class _aW {
    public static final Minecraft iO;
    public final ResourceLocation iP = new ResourceLocation(iV[iW[0]], iV[iW[1]]);
    public static final String[] iV;
    public ShaderGroup iQ;
    public int iU;
    public int iS;
    public int iT;
    public Framebuffer iR;
    public static final int[] iW;

    public final void blur(double d, double d2, double d3, double d4, int n) {
        int n2;
        int n3;
        ScaledResolution scaledResolution = new ScaledResolution(iO);
        int n4 = scaledResolution.getScaleFactor();
        if (this.sizeHasChanged(n4, n3 = scaledResolution.getScaledWidth(), n2 = scaledResolution.getScaledHeight()) || this.iR == null || this.iQ == null) {
            this.init();
        }
        this.iS = n4;
        this.iT = n3;
        this.iU = n2;
        GL11.glEnable((int)iW[12]);
        _ah_0.scissor(d, d2 + 1.0, d3, d4 - 1.0);
        this.iR.bindFramebuffer(iW[13]);
        this.iQ.render(_aW.iO.timer.renderPartialTicks);
        this.setValues(n);
        iO.getFramebuffer().bindFramebuffer(iW[14]);
        GL11.glDisable((int)iW[15]);
    }

    public boolean sizeHasChanged(int n, int n2, int n3) {
        return (this.iS != n || this.iT != n2 || this.iU != n3 ? iW[16] : iW[17]) != 0;
    }

    public void setValues(int n) {
        ((Shader)this.iQ.listShaders.get(iW[2])).getShaderManager().getShaderUniform(iV[iW[3]]).set((float)n);
        ((Shader)this.iQ.listShaders.get(iW[4])).getShaderManager().getShaderUniform(iV[iW[5]]).set((float)n);
        ((Shader)this.iQ.listShaders.get(iW[6])).getShaderManager().getShaderUniform(iV[iW[7]]).set((float)n);
        ((Shader)this.iQ.listShaders.get(iW[8])).getShaderManager().getShaderUniform(iV[iW[9]]).set((float)n);
    }

    public void init() {
        try {
            this.iQ = new ShaderGroup(iO.getTextureManager(), iO.getResourceManager(), iO.getFramebuffer(), this.iP);
            this.iQ.createBindFramebuffers(_aW.iO.displayWidth, _aW.iO.displayHeight);
            this.iR = this.iQ.mainFramebuffer;
        }
        catch (JsonSyntaxException | IOException throwable) {
            throwable.printStackTrace();
        }
    }

    static {
        iW = new int[]{0, 1, 0, 2, 1, 3, 2, 4, 3, 5, 1, 1, 3089, 1, 0, 3089, 1, 0, 6, 0, 1, 2, 3, 4, 5};
        String[] stringArray = new String[iW[18]];
        stringArray[_aW.iW[19]] = "xeno";
        stringArray[_aW.iW[20]] = "shader/blur.json";
        stringArray[_aW.iW[21]] = "Radius";
        stringArray[_aW.iW[22]] = "Radius";
        stringArray[_aW.iW[23]] = "Radius";
        stringArray[_aW.iW[24]] = "Radius";
        iV = stringArray;
        iO = Minecraft.getMinecraft();
    }

    public final void blur(int n) {
        int n2;
        int n3;
        ScaledResolution scaledResolution = new ScaledResolution(iO);
        int n4 = scaledResolution.getScaleFactor();
        if (this.sizeHasChanged(n4, n3 = scaledResolution.getScaledWidth(), n2 = scaledResolution.getScaledHeight()) || this.iR == null || this.iQ == null) {
            this.init();
        }
        this.iS = n4;
        this.iT = n3;
        this.iU = n2;
        this.setValues(n);
        this.iR.bindFramebuffer(iW[10]);
        this.iQ.render(_aW.iO.timer.renderPartialTicks);
        iO.getFramebuffer().bindFramebuffer(iW[11]);
        GlStateManager.enableAlpha();
    }
}

