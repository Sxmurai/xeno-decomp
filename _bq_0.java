//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
import me.wolfsurge.mixin.mixins.accessor.IShaderGroup;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _bq
 */
public class _bq_0
implements _cf_0 {
    public static ShaderGroup kT;
    public static final String[] kY;
    public static Framebuffer kU;
    public static int kV;
    public static int kW;
    public static int kX;
    public static final int[] pd;

    static {
        pd = new int[]{0, 0, 1, 0, 2, 0, 3, 1, 4, 0, 5, 1, 6, 0, 7, 1, 8, 12, 3089, 1, 1, 3089, 770, 771, 0, 1, 0, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        String[] stringArray = new String[pd[27]];
        stringArray[_bq_0.pd[28]] = "shader/blur/blur.json";
        stringArray[_bq_0.pd[29]] = "Radius";
        stringArray[_bq_0.pd[30]] = "Radius";
        stringArray[_bq_0.pd[31]] = "BlurDir";
        stringArray[_bq_0.pd[32]] = "BlurDir";
        stringArray[_bq_0.pd[33]] = "Radius";
        stringArray[_bq_0.pd[34]] = "Radius";
        stringArray[_bq_0.pd[35]] = "BlurDir";
        stringArray[_bq_0.pd[36]] = "BlurDir";
        kY = stringArray;
    }

    public static void blurRect(int n, int n2, int n3, int n4, float f, float f2, float f3) {
        ScaledResolution scaledResolution = new ScaledResolution(pb);
        _bq_0.initShaderAndFrameBuffer();
        int n5 = scaledResolution.getScaleFactor();
        int n6 = scaledResolution.getScaledWidth();
        int n7 = scaledResolution.getScaledHeight();
        if (kV != n5 || kW != n6 || kX != n7 || kU == null || kT == null) {
            _bq_0.initShaderAndFrameBuffer();
        }
        kV = n5;
        kW = n6;
        kX = n7;
        if (!OpenGlHelper.isFramebufferEnabled()) {
            return;
        }
        GL11.glScissor((int)(n * n5), (int)(_bq_0.pb.displayHeight - n2 * n5 - n4 * n5), (int)(n3 * n5), (int)(n4 * n5 - pd[17]));
        GL11.glEnable((int)pd[18]);
        _bq_0.configureShader(f, f2, f3);
        kU.bindFramebuffer(pd[19]);
        kT.render(pb.getRenderPartialTicks());
        pb.getFramebuffer().bindFramebuffer(pd[20]);
        GL11.glDisable((int)pd[21]);
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate((int)pd[22], (int)pd[23], (int)pd[24], (int)pd[25]);
        kU.framebufferRenderExt(_bq_0.pb.displayWidth, _bq_0.pb.displayHeight, pd[26]);
        GlStateManager.disableBlend();
        GL11.glScalef((float)n5, (float)n5, (float)0.0f);
    }

    public static void initShaderAndFrameBuffer() {
        try {
            kT = new ShaderGroup(pb.getTextureManager(), pb.getResourceManager(), pb.getFramebuffer(), new ResourceLocation(kY[pd[0]]));
            kT.createBindFramebuffers(_bq_0.pb.displayWidth, _bq_0.pb.displayHeight);
            kU = ((IShaderGroup)kT).getMainFramebuffer();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void configureShader(float f, float f2, float f3) {
        if (((IShaderGroup)kT).getListShaders().get(pd[1]).getShaderManager().getShaderUniform(kY[pd[2]]) != null && ((IShaderGroup)kT).getListShaders().get(pd[3]).getShaderManager().getShaderUniform(kY[pd[4]]) != null && ((IShaderGroup)kT).getListShaders().get(pd[5]).getShaderManager().getShaderUniform(kY[pd[6]]) != null && ((IShaderGroup)kT).getListShaders().get(pd[7]).getShaderManager().getShaderUniform(kY[pd[8]]) != null) {
            ((IShaderGroup)kT).getListShaders().get(pd[9]).getShaderManager().getShaderUniform(kY[pd[10]]).set(f);
            ((IShaderGroup)kT).getListShaders().get(pd[11]).getShaderManager().getShaderUniform(kY[pd[12]]).set(f);
            ((IShaderGroup)kT).getListShaders().get(pd[13]).getShaderManager().getShaderUniform(kY[pd[14]]).set(f2, f3);
            ((IShaderGroup)kT).getListShaders().get(pd[15]).getShaderManager().getShaderUniform(kY[pd[16]]).set(f3, f2);
        }
    }
}

