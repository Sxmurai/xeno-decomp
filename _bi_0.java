//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.shader.Framebuffer
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _bi
 */
public class _bi_0 {
    public static final int[] jO = new int[]{1048575, 3008, 3553, 2896, 3042, 770, 771, 2848, 2960, 1024, 15, 512, 1, 15, 7681, 7681, 7681, 1032, 6913, 512, 0, 15, 7681, 7681, 7681, 1032, 6914, 514, 1, 15, 7680, 7680, 7680, 1032, 6913, 0, 2929, 10754, 10754, 2929, 1, 2960, 2848, 3154, 4352, 3042, 2896, 3553, 3008, -1, -1, 36161, 36161, 34041, 36160, 36128, 36161, 36160, 36096, 36161};

    public static void checkSetupFBO() {
        Framebuffer framebuffer = Minecraft.getMinecraft().getFramebuffer();
        if (framebuffer != null && framebuffer.depthBuffer > jO[49]) {
            _bi_0.setupFBO(framebuffer);
            framebuffer.depthBuffer = jO[50];
        }
    }

    public static void setColor(Color color) {
        GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
    }

    public static void renderFour(Color color) {
        _bi_0.setColor(color);
        GL11.glDepthMask((boolean)jO[35]);
        GL11.glDisable((int)jO[36]);
        GL11.glEnable((int)jO[37]);
        GL11.glPolygonOffset((float)1.0f, (float)-2000000.0f);
        OpenGlHelper.setLightmapTextureCoords((int)OpenGlHelper.lightmapTexUnit, (float)240.0f, (float)240.0f);
    }

    public static void setupFBO(Framebuffer framebuffer) {
        EXTFramebufferObject.glDeleteRenderbuffersEXT((int)framebuffer.depthBuffer);
        int n = EXTFramebufferObject.glGenRenderbuffersEXT();
        EXTFramebufferObject.glBindRenderbufferEXT((int)jO[51], (int)n);
        EXTFramebufferObject.glRenderbufferStorageEXT((int)jO[52], (int)jO[53], (int)Minecraft.getMinecraft().displayWidth, (int)Minecraft.getMinecraft().displayHeight);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)jO[54], (int)jO[55], (int)jO[56], (int)n);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)jO[57], (int)jO[58], (int)jO[59], (int)n);
    }

    public static void renderFive() {
        GL11.glPolygonOffset((float)1.0f, (float)2000000.0f);
        GL11.glDisable((int)jO[38]);
        GL11.glEnable((int)jO[39]);
        GL11.glDepthMask((boolean)jO[40]);
        GL11.glDisable((int)jO[41]);
        GL11.glDisable((int)jO[42]);
        GL11.glHint((int)jO[43], (int)jO[44]);
        GL11.glEnable((int)jO[45]);
        GL11.glEnable((int)jO[46]);
        GL11.glEnable((int)jO[47]);
        GL11.glEnable((int)jO[48]);
        GL11.glPopAttrib();
    }

    public static void renderOne(float f) {
        _bi_0.checkSetupFBO();
        GL11.glPushAttrib((int)jO[0]);
        GL11.glDisable((int)jO[1]);
        GL11.glDisable((int)jO[2]);
        GL11.glDisable((int)jO[3]);
        GL11.glEnable((int)jO[4]);
        GL11.glBlendFunc((int)jO[5], (int)jO[6]);
        GL11.glLineWidth((float)f);
        GL11.glEnable((int)jO[7]);
        GL11.glEnable((int)jO[8]);
        GL11.glClear((int)jO[9]);
        GL11.glClearStencil((int)jO[10]);
        GL11.glStencilFunc((int)jO[11], (int)jO[12], (int)jO[13]);
        GL11.glStencilOp((int)jO[14], (int)jO[15], (int)jO[16]);
        GL11.glPolygonMode((int)jO[17], (int)jO[18]);
    }

    public static void renderTwo() {
        GL11.glStencilFunc((int)jO[19], (int)jO[20], (int)jO[21]);
        GL11.glStencilOp((int)jO[22], (int)jO[23], (int)jO[24]);
        GL11.glPolygonMode((int)jO[25], (int)jO[26]);
    }

    public static void renderThree() {
        GL11.glStencilFunc((int)jO[27], (int)jO[28], (int)jO[29]);
        GL11.glStencilOp((int)jO[30], (int)jO[31], (int)jO[32]);
        GL11.glPolygonMode((int)jO[33], (int)jO[34]);
    }
}

