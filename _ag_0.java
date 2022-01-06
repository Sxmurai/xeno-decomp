//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector3d
 *  javax.vecmath.Vector4d
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GLAllocation
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.renderer.culling.ICamera
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 */
import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.List;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector4d;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

/*
 * Renamed from _ag
 */
public class _ag_0 {
    public static ICamera dN;
    public static Minecraft dM;
    public static final IntBuffer dQ;
    public static BufferBuilder dP;
    public static final FloatBuffer dR;
    public static final FloatBuffer dT;
    public static final FloatBuffer dS;
    public static final int[] dU;
    public static Tessellator dO;

    public static void drawClawBox(AxisAlignedBB axisAlignedBB, double d, double d2, double d3, Color color) {
        dP.begin(dU[84], DefaultVertexFormats.POSITION_COLOR);
        _ag_0.addChainedClawBoxVertices(dP, axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX + d2, axisAlignedBB.maxY + d, axisAlignedBB.maxZ + d3, color);
        dO.draw();
    }

    public static void solidBlockESPBox(BlockPos blockPos, float f, Color color, float f2) {
        double d = (double)blockPos.getX() - Minecraft.getMinecraft().getRenderManager().viewerPosX;
        double d2 = (double)blockPos.getY() - Minecraft.getMinecraft().getRenderManager().viewerPosY;
        double d3 = (double)blockPos.getZ() - Minecraft.getMinecraft().getRenderManager().viewerPosZ;
        GL11.glBlendFunc((int)dU[31], (int)dU[32]);
        GL11.glEnable((int)dU[33]);
        GL11.glLineWidth((float)f);
        GL11.glColor4d((double)0.0, (double)1.0, (double)0.0, (double)0.15f);
        GL11.glDisable((int)dU[34]);
        GL11.glDisable((int)dU[35]);
        GL11.glDepthMask((boolean)dU[36]);
        GL11.glColor4d((double)0.0, (double)0.0, (double)1.0, (double)f2);
        RenderGlobal.renderFilledBox((AxisAlignedBB)new AxisAlignedBB(d, d2, d3, d + 1.0, d2 + 1.0, d3 + 1.0), (float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)f2);
        GL11.glEnable((int)dU[37]);
        GL11.glEnable((int)dU[38]);
        GL11.glDepthMask((boolean)dU[39]);
        GL11.glDisable((int)dU[40]);
    }

    public static void blockESPBox(BlockPos blockPos, float f, Color color, int n) {
        double d = (double)blockPos.getX() - Minecraft.getMinecraft().getRenderManager().viewerPosX;
        double d2 = (double)blockPos.getY() - Minecraft.getMinecraft().getRenderManager().viewerPosY;
        double d3 = (double)blockPos.getZ() - Minecraft.getMinecraft().getRenderManager().viewerPosZ;
        GL11.glBlendFunc((int)dU[64], (int)dU[65]);
        GL11.glEnable((int)dU[66]);
        GL11.glLineWidth((float)f);
        GL11.glColor4d((double)0.0, (double)1.0, (double)0.0, (double)0.15f);
        GL11.glDisable((int)dU[67]);
        GL11.glDisable((int)dU[68]);
        GL11.glDepthMask((boolean)dU[69]);
        GL11.glColor4d((double)0.0, (double)0.0, (double)1.0, (double)0.5);
        RenderGlobal.drawSelectionBoundingBox((AxisAlignedBB)new AxisAlignedBB(d, d2, d3, d + 1.0, d2 + 1.0, d3 + 1.0), (float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)n);
        GL11.glEnable((int)dU[70]);
        GL11.glEnable((int)dU[71]);
        GL11.glDepthMask((boolean)dU[72]);
        GL11.glDisable((int)dU[73]);
    }

    static {
        dU = new int[]{1, 1, 0, 1, 2, 770, 771, 0, 1, 0, 2848, 3154, 4354, 3, 2848, 1, 0, 2929, 3008, 3042, 3553, 770, 771, 2848, 3154, 4354, 7425, 3, 0, 361, 7424, 770, 771, 3042, 3553, 2929, 0, 3553, 2929, 1, 3042, 1, 2929, 3553, 3042, 3008, 2848, 24, 255, 16, 255, 8, 255, 255, 770, 771, 3042, 3553, 2929, 0, 3553, 2929, 1, 3042, 770, 771, 3042, 3553, 2929, 0, 3553, 2929, 1, 3042, 1, 1, 1, 144, 144, 0, 255, 5, 3, 7, 3, 8, 0, 1, 2, 3, 4, 5, 6, 7, 0, 0, 2982, 2983, 2978, 0, 1, 2, -1, -1, 2, 16, 16, 16, 4};
        dM = Minecraft.getMinecraft();
        dN = new Frustum();
        dO = Tessellator.getInstance();
        dP = dO.getBuffer();
        dQ = GLAllocation.createDirectIntBuffer((int)dU[105]);
        dR = GLAllocation.createDirectFloatBuffer((int)dU[106]);
        dS = GLAllocation.createDirectFloatBuffer((int)dU[107]);
        dT = GLAllocation.createDirectFloatBuffer((int)dU[108]);
    }

    public static void drawTracer(Entity entity, float f, Color color) {
        double[] dArray = _ce_0.interpolate(entity);
        double d = dArray[dU[2]] - _ag_0.dM.getRenderManager().viewerPosX;
        double d2 = dArray[dU[3]] - _ag_0.dM.getRenderManager().viewerPosY;
        double d3 = dArray[dU[4]] - _ag_0.dM.getRenderManager().viewerPosZ;
        Vec3d vec3d = new Vec3d(0.0, 0.0, 1.0).rotatePitch(-((float)Math.toRadians(_ag_0.dM.player.rotationPitch))).rotateYaw(-((float)Math.toRadians(_ag_0.dM.player.rotationYaw)));
        _ag_0.drawLine3D(f, vec3d.x, vec3d.y + (double)_ag_0.dM.player.getEyeHeight(), vec3d.z, d, d2 + (double)(entity.height / 2.0f), d3, new Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).getRGB());
    }

    public static void setColor(Color color) {
        GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
    }

    public static void enableRender3D(boolean bl) {
        if (bl) {
            GL11.glDepthMask((boolean)dU[16]);
            GL11.glDisable((int)dU[17]);
        }
        GL11.glDisable((int)dU[18]);
        GL11.glEnable((int)dU[19]);
        GL11.glDisable((int)dU[20]);
        GL11.glBlendFunc((int)dU[21], (int)dU[22]);
        GL11.glEnable((int)dU[23]);
        GL11.glHint((int)dU[24], (int)dU[25]);
        GL11.glLineWidth((float)0.1f);
    }

    public static void drawCircle(_ar_0 _ar_02, Vec3d vec3d, double d, double d2, Color color) {
        _ag_0.renderCircle(dP, vec3d, d, d2, color);
        _ar_02.build();
    }

    public static void disableRender3D(boolean bl) {
        if (bl) {
            GL11.glDepthMask((boolean)dU[41]);
            GL11.glEnable((int)dU[42]);
        }
        GL11.glEnable((int)dU[43]);
        GL11.glDisable((int)dU[44]);
        GL11.glEnable((int)dU[45]);
        GL11.glDisable((int)dU[46]);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void addChainedFilledBoxVertices(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, Color color) {
        bufferBuilder.pos(d, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
    }

    public static Vector3d project2D(ScaledResolution scaledResolution, double d, double d2, double d3) {
        GL11.glGetFloat((int)dU[96], (FloatBuffer)dR);
        GL11.glGetFloat((int)dU[97], (FloatBuffer)dS);
        GL11.glGetInteger((int)dU[98], (IntBuffer)dQ);
        if (GLU.gluProject((float)((float)d), (float)((float)d2), (float)((float)d3), (FloatBuffer)dR, (FloatBuffer)dS, (IntBuffer)dQ, (FloatBuffer)dT)) {
            return new Vector3d((double)(dT.get(dU[99]) / (float)scaledResolution.getScaleFactor()), (double)(((float)Display.getHeight() - dT.get(dU[100])) / (float)scaledResolution.getScaleFactor()), (double)dT.get(dU[101]));
        }
        return null;
    }

    public static void drawSelectionGlowFilledBox(AxisAlignedBB axisAlignedBB, double d, double d2, double d3, Color color, Color color2) {
        dP.begin(dU[83], DefaultVertexFormats.POSITION_COLOR);
        _ag_0.addChainedGlowBoxVertices(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX + d2, axisAlignedBB.maxY + d, axisAlignedBB.maxZ + d3, color, color2);
        dO.draw();
    }

    public static void drawNametagFromBlockPos(BlockPos blockPos, float f, boolean bl, String string) {
        GlStateManager.pushMatrix();
        _ag_0.glBillboardDistanceScaled((float)blockPos.getX() + 0.5f, (float)blockPos.getY() + f, (float)blockPos.getZ() + 0.5f, (EntityPlayer)_ag_0.dM.player, 1.0f);
        GlStateManager.disableDepth();
        GlStateManager.translate((double)(-((double)_cX.te.getStringWidth(string) / 2.0)), (double)0.0, (double)0.0);
        if (bl) {
            _cX.te.drawStringWithShadow(string, 2.0f, 4.0f, dU[102]);
        } else {
            _ag_0.dM.fontRenderer.drawStringWithShadow(string, 2.0f, 4.0f, dU[103]);
        }
        GlStateManager.popMatrix();
    }

    public static void addChainedClawBoxVertices(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, Color color) {
        bufferBuilder.pos(d, d2, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d, d2, d6 - 0.8).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d, d2, d3 + 0.8).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d4, d2, d6 - 0.8).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d4, d2, d3 + 0.8).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d4 - 0.8, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d4 - 0.8, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d + 0.8, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d + 0.8, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d, d2 + 0.2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d, d2 + 0.2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d4, d2 + 0.2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d4, d2 + 0.2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d, d5, d6 - 0.8).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d, d5, d3 + 0.8).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d4, d5, d6 - 0.8).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d4, d5, d3 + 0.8).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d4 - 0.8, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d4 - 0.8, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d + 0.8, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d + 0.8, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d, d5 - 0.2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d, d5 - 0.2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d4, d5 - 0.2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d4, d5 - 0.2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
    }

    public static void addChainedBoundingBoxVertices(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, Color color) {
        bufferBuilder.pos(d, d2, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d4, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d4, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
    }

    public static void glBillboardDistanceScaled(float f, float f2, float f3, EntityPlayer entityPlayer, float f4) {
        _ag_0.glBillboard(f, f2, f3);
        int n = (int)entityPlayer.getDistance((double)f, (double)f2, (double)f3);
        float f5 = (float)n / 2.0f / (2.0f + (2.0f - f4));
        if (f5 < 1.0f) {
            f5 = 1.0f;
        }
        GlStateManager.scale((float)f5, (float)f5, (float)f5);
    }

    public static void drawSelectionBox(AxisAlignedBB axisAlignedBB, double d, double d2, double d3, Color color) {
        dP.begin(dU[81], DefaultVertexFormats.POSITION_COLOR);
        _ag_0.addChainedFilledBoxVertices(dP, axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX + d2, axisAlignedBB.maxY + d, axisAlignedBB.maxZ + d3, color);
        dO.draw();
    }

    public static void renderCircle(BufferBuilder bufferBuilder, Vec3d vec3d, double d, double d2, Color color) {
        GlStateManager.disableCull();
        GlStateManager.disableAlpha();
        GlStateManager.shadeModel((int)dU[26]);
        dP.begin(dU[27], DefaultVertexFormats.POSITION_COLOR);
        for (int i = dU[28]; i < dU[29]; ++i) {
            bufferBuilder.pos(vec3d.x + Math.sin(Math.toRadians(i)) * d - _ag_0.dM.getRenderManager().viewerPosX, vec3d.y + d2 - _ag_0.dM.getRenderManager().viewerPosY, vec3d.z + Math.cos(Math.toRadians(i)) * d - _ag_0.dM.getRenderManager().viewerPosZ).color((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, 1.0f).endVertex();
        }
        dO.draw();
        GlStateManager.enableCull();
        GlStateManager.enableAlpha();
        GlStateManager.shadeModel((int)dU[30]);
    }

    public static void glBillboard(float f, float f2, float f3) {
        float f4 = 0.02666667f;
        GlStateManager.translate((double)((double)f - _ag_0.dM.getRenderManager().renderPosX), (double)((double)f2 - _ag_0.dM.getRenderManager().renderPosY), (double)((double)f3 - _ag_0.dM.getRenderManager().renderPosZ));
        GlStateManager.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)(-_ag_0.dM.player.rotationYaw), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)_ag_0.dM.player.rotationPitch, (float)(_ag_0.dM.gameSettings.thirdPersonView == dU[104] ? -1.0f : 1.0f), (float)0.0f, (float)0.0f);
        GlStateManager.scale((float)(-f4), (float)(-f4), (float)f4);
    }

    public static void drawLine3D(double d, double d2, double d3, double d4, double d5, double d6, double d7, int n) {
        _ag_0.drawLine3D(d2, d3, d4, d5, d6, d7, n, dU[0], d);
    }

    public static void drawBoxBlockPos(BlockPos blockPos, double d, double d2, double d3, Color color, _bl_0 _bl_02) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB((double)blockPos.getX() - _ag_0.dM.getRenderManager().viewerPosX, (double)blockPos.getY() - _ag_0.dM.getRenderManager().viewerPosY, (double)blockPos.getZ() - _ag_0.dM.getRenderManager().viewerPosZ, (double)(blockPos.getX() + dU[74]) - _ag_0.dM.getRenderManager().viewerPosX, (double)(blockPos.getY() + dU[75]) - _ag_0.dM.getRenderManager().viewerPosY, (double)(blockPos.getZ() + dU[76]) - _ag_0.dM.getRenderManager().viewerPosZ);
        _ar_0.glSetup();
        switch (_cq_0.qg[_bl_02.ordinal()]) {
            case 1: {
                _ag_0.drawSelectionBox(axisAlignedBB, d, d2, d3, color);
                break;
            }
            case 2: {
                _ag_0.drawSelectionBoundingBox(axisAlignedBB, d, d2, d3, new Color(color.getRed(), color.getGreen(), color.getBlue(), dU[77]));
                break;
            }
            case 3: {
                _ag_0.drawSelectionBox(axisAlignedBB, d, d2, d3, color);
                _ag_0.drawSelectionBoundingBox(axisAlignedBB, d, d2, d3, new Color(color.getRed(), color.getGreen(), color.getBlue(), dU[78]));
                break;
            }
            case 4: {
                _ar_0.glPrepare();
                _ag_0.drawSelectionGlowFilledBox(axisAlignedBB, d, d2, d3, color, new Color(color.getRed(), color.getGreen(), color.getBlue(), dU[79]));
                _ar_0.glRestore();
                break;
            }
            case 5: {
                _ag_0.drawClawBox(axisAlignedBB, d, d2, d3, new Color(color.getRed(), color.getGreen(), color.getBlue(), dU[80]));
            }
        }
        _ar_0.glRelease();
    }

    public static void drawSelectionBoundingBox(AxisAlignedBB axisAlignedBB, double d, double d2, double d3, Color color) {
        dP.begin(dU[82], DefaultVertexFormats.POSITION_COLOR);
        _ag_0.addChainedBoundingBoxVertices(dP, axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX + d2, axisAlignedBB.maxY + d, axisAlignedBB.maxZ + d3, color);
        dO.draw();
    }

    public static void draw2D(Entity entity, Color color) {
        GL11.glPushMatrix();
        ScaledResolution scaledResolution = new ScaledResolution(dM);
        double d = (double)scaledResolution.getScaleFactor() / Math.pow(scaledResolution.getScaleFactor(), 2.0);
        GlStateManager.scale((double)d, (double)d, (double)d);
        double d2 = _bv_0.getInterpolatedPos((Entity)entity, (float)_ag_0.dM.getRenderPartialTicks()).x;
        double d3 = _bv_0.getInterpolatedPos((Entity)entity, (float)_ag_0.dM.getRenderPartialTicks()).y;
        double d4 = _bv_0.getInterpolatedPos((Entity)entity, (float)_ag_0.dM.getRenderPartialTicks()).z;
        double d5 = (double)entity.width / 1.5;
        double d6 = (double)entity.height + (entity.isSneaking() ? -0.3 : 0.2);
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(d2 - d5, d3, d4 - d5, d2 + d5, d3 + d6, d4 + d5);
        Vector3d[] vector3dArray = new Vector3d[dU[85]];
        vector3dArray[_ag_0.dU[86]] = new Vector3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ);
        vector3dArray[_ag_0.dU[87]] = new Vector3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ);
        vector3dArray[_ag_0.dU[88]] = new Vector3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ);
        vector3dArray[_ag_0.dU[89]] = new Vector3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ);
        vector3dArray[_ag_0.dU[90]] = new Vector3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ);
        vector3dArray[_ag_0.dU[91]] = new Vector3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        vector3dArray[_ag_0.dU[92]] = new Vector3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ);
        vector3dArray[_ag_0.dU[93]] = new Vector3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        List<Vector3d> list = Arrays.asList(vector3dArray);
        _ag_0.dM.entityRenderer.setupCameraTransform(dM.getRenderPartialTicks(), dU[94]);
        Vector4d vector4d = null;
        for (Vector3d vector3d : list) {
            vector3d = _ag_0.project2D(scaledResolution, vector3d.x - _ag_0.dM.getRenderManager().viewerPosX, vector3d.y - _ag_0.dM.getRenderManager().viewerPosY, vector3d.z - _ag_0.dM.getRenderManager().viewerPosZ);
            if (vector3d == null || !(vector3d.z >= 0.0) || !(vector3d.z < 1.0)) continue;
            if (vector4d == null) {
                vector4d = new Vector4d(vector3d.x, vector3d.y, vector3d.z, 0.0);
            }
            vector4d.x = Math.min(vector3d.x, vector4d.x);
            vector4d.y = Math.min(vector3d.y, vector4d.y);
            vector4d.z = Math.max(vector3d.x, vector4d.z);
            vector4d.w = Math.max(vector3d.y, vector4d.w);
        }
        _ag_0.dM.entityRenderer.setupOverlayRendering();
        if (vector4d != null) {
            double d7 = vector4d.x;
            double d8 = vector4d.y;
            double d9 = vector4d.z;
            double d10 = vector4d.w;
            int n = dU[95];
            _ah_0.drawRect(d7 + 0.5, d8, d7 - 1.0, d8 + (d10 - d8) / 4.0 + 0.5, color.getRGB());
            _ah_0.drawRect(d7 - 1.0, d10, d7 + 0.5, d10 - (d10 - d8) / 4.0 - 0.5, color.getRGB());
            _ah_0.drawRect(d7 - 1.0, d8 - 0.5, d7 + (d9 - d7) / 3.0 + 0.5, d8 + 1.0, color.getRGB());
            _ah_0.drawRect(d9 - (d9 - d7) / 3.0 - 0.5, d8 - 0.5, d9, d8 + 1.0, color.getRGB());
            _ah_0.drawRect(d9 - 1.0, d8, d9 + 0.5, d8 + (d10 - d8) / 4.0 + 0.5, color.getRGB());
            _ah_0.drawRect(d9 - 1.0, d10, d9 + 0.5, d10 - (d10 - d8) / 4.0 - 0.5, color.getRGB());
            _ah_0.drawRect(d7 - 1.0, d10 - 1.0, d7 + (d9 - d7) / 3.0 + 0.5, d10 + 0.5, color.getRGB());
            _ah_0.drawRect(d9 - (d9 - d7) / 3.0 - 0.5, d10 - 1.0, d9 + 0.5, d10 + 0.5, color.getRGB());
            _ah_0.drawRect(d7, d8, d7 - 0.5, d8 + (d10 - d8) / 4.0, n);
            _ah_0.drawRect(d7, d10, d7 - 0.5, d10 - (d10 - d8) / 4.0, n);
            _ah_0.drawRect(d7 - 0.5, d8, d7 + (d9 - d7) / 3.0, d8 + 0.5, n);
            _ah_0.drawRect(d9 - (d9 - d7) / 3.0, d8, d9, d8 + 0.5, n);
            _ah_0.drawRect(d9 - 0.5, d8, d9, d8 + (d10 - d8) / 4.0, n);
            _ah_0.drawRect(d9 - 0.5, d10, d9, d10 - (d10 - d8) / 4.0, n);
            _ah_0.drawRect(d7, d10 - 0.5, d7 + (d9 - d7) / 3.0, d10, n);
            _ah_0.drawRect(d9 - (d9 - d7) / 3.0, d10 - 0.5, d9 - 0.5, d10, n);
        }
        GL11.glPopMatrix();
        GlStateManager.enableBlend();
        _ag_0.dM.entityRenderer.setupOverlayRendering();
    }

    public static void addChainedGlowBoxVertices(double d, double d2, double d3, double d4, double d5, double d6, Color color, Color color2) {
        dP.pos(d, d2, d3).color((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).endVertex();
        dP.pos(d4, d2, d3).color((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).endVertex();
        dP.pos(d4, d2, d6).color((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).endVertex();
        dP.pos(d, d2, d6).color((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).endVertex();
        dP.pos(d, d5, d3).color((float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f, (float)color2.getAlpha() / 255.0f).endVertex();
        dP.pos(d, d5, d6).color((float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f, (float)color2.getAlpha() / 255.0f).endVertex();
        dP.pos(d4, d5, d6).color((float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f, (float)color2.getAlpha() / 255.0f).endVertex();
        dP.pos(d4, d5, d3).color((float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f, (float)color2.getAlpha() / 255.0f).endVertex();
        dP.pos(d, d2, d3).color((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).endVertex();
        dP.pos(d, d5, d3).color((float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f, (float)color2.getAlpha() / 255.0f).endVertex();
        dP.pos(d4, d5, d3).color((float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f, (float)color2.getAlpha() / 255.0f).endVertex();
        dP.pos(d4, d2, d3).color((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).endVertex();
        dP.pos(d4, d2, d3).color((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).endVertex();
        dP.pos(d4, d5, d3).color((float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f, (float)color2.getAlpha() / 255.0f).endVertex();
        dP.pos(d4, d5, d6).color((float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f, (float)color2.getAlpha() / 255.0f).endVertex();
        dP.pos(d4, d2, d6).color((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).endVertex();
        dP.pos(d, d2, d6).color((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).endVertex();
        dP.pos(d4, d2, d6).color((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).endVertex();
        dP.pos(d4, d5, d6).color((float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f, (float)color2.getAlpha() / 255.0f).endVertex();
        dP.pos(d, d5, d6).color((float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f, (float)color2.getAlpha() / 255.0f).endVertex();
        dP.pos(d, d2, d3).color((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).endVertex();
        dP.pos(d, d2, d6).color((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).endVertex();
        dP.pos(d, d5, d6).color((float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f, (float)color2.getAlpha() / 255.0f).endVertex();
        dP.pos(d, d5, d3).color((float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f, (float)color2.getAlpha() / 255.0f).endVertex();
    }

    public static void drawLine3D(double d, double d2, double d3, double d4, double d5, double d6, int n, boolean bl, double d7) {
        _ag_0.enableRender3D(bl);
        _ag_0.setColor(n);
        GL11.glLineWidth((float)((float)d7));
        GL11.glBegin((int)dU[1]);
        GL11.glVertex3d((double)d, (double)d2, (double)d3);
        GL11.glVertex3d((double)d4, (double)d5, (double)d6);
        GL11.glEnd();
        _ag_0.disableRender3D(bl);
    }

    public static void drawBlockOutline(AxisAlignedBB axisAlignedBB, Color color, float f) {
        float f2 = (float)color.getRed() / 255.0f;
        float f3 = (float)color.getGreen() / 255.0f;
        float f4 = (float)color.getBlue() / 255.0f;
        float f5 = (float)color.getAlpha() / 255.0f;
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.tryBlendFuncSeparate((int)dU[5], (int)dU[6], (int)dU[7], (int)dU[8]);
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask((boolean)dU[9]);
        GL11.glEnable((int)dU[10]);
        GL11.glHint((int)dU[11], (int)dU[12]);
        GL11.glLineWidth((float)f);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(dU[13], DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f5).endVertex();
        tessellator.draw();
        GL11.glDisable((int)dU[14]);
        GlStateManager.depthMask((boolean)dU[15]);
        GlStateManager.enableDepth();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public static void setColor(int n) {
        float f = (float)(n >> dU[47] & dU[48]) / 255.0f;
        float f2 = (float)(n >> dU[49] & dU[50]) / 255.0f;
        float f3 = (float)(n >> dU[51] & dU[52]) / 255.0f;
        float f4 = (float)(n & dU[53]) / 255.0f;
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)(f == 0.0f ? 1.0f : f));
    }

    public static void drawESPBox(Entity entity, float f, Color color) {
        GL11.glBlendFunc((int)dU[54], (int)dU[55]);
        GL11.glEnable((int)dU[56]);
        GL11.glLineWidth((float)f);
        GL11.glDisable((int)dU[57]);
        GL11.glDisable((int)dU[58]);
        GL11.glDepthMask((boolean)dU[59]);
        Minecraft.getMinecraft().getRenderManager();
        RenderGlobal.drawSelectionBoundingBox((AxisAlignedBB)new AxisAlignedBB(entity.getEntityBoundingBox().minX - 0.05 - entity.posX + (entity.posX - Minecraft.getMinecraft().getRenderManager().viewerPosX), entity.getEntityBoundingBox().minY - entity.posY + (entity.posY - Minecraft.getMinecraft().getRenderManager().viewerPosY), entity.getEntityBoundingBox().minZ - 0.05 - entity.posZ + (entity.posZ - Minecraft.getMinecraft().getRenderManager().viewerPosZ), entity.getEntityBoundingBox().maxX + 0.05 - entity.posX + (entity.posX - Minecraft.getMinecraft().getRenderManager().viewerPosX), entity.getEntityBoundingBox().maxY + 0.1 - entity.posY + (entity.posY - Minecraft.getMinecraft().getRenderManager().viewerPosY), entity.getEntityBoundingBox().maxZ + 0.05 - entity.posZ + (entity.posZ - Minecraft.getMinecraft().getRenderManager().viewerPosZ)), (float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
        GL11.glEnable((int)dU[60]);
        GL11.glEnable((int)dU[61]);
        GL11.glDepthMask((boolean)dU[62]);
        GL11.glDisable((int)dU[63]);
    }
}

