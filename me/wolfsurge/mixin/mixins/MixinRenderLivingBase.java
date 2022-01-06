//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.entity.Render
 *  net.minecraft.client.renderer.entity.RenderLivingBase
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.player.EntityPlayer
 *  org.lwjgl.opengl.GL11
 */
package me.wolfsurge.mixin.mixins;

import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderLivingBase.class})
public abstract class MixinRenderLivingBase<T extends EntityLivingBase>
extends Render<T> {
    @Shadow
    protected ModelBase mainModel;

    protected MixinRenderLivingBase(RenderManager renderManager) {
        super(null);
    }

    @Inject(method={"renderModel"}, at={@At(value="HEAD")})
    protected void renderModel(T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, CallbackInfo g) {
        boolean flag1;
        boolean flag = !entitylivingbaseIn.isInvisible();
        boolean bl = flag1 = !flag && !entitylivingbaseIn.isInvisibleToPlayer((EntityPlayer)Minecraft.getMinecraft().player);
        if (flag || flag1) {
            if (!this.bindEntityTexture((Entity)entitylivingbaseIn)) {
                return;
            }
            if (flag1) {
                GlStateManager.pushMatrix();
                GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)0.15f);
                GlStateManager.depthMask((boolean)false);
                GlStateManager.enableBlend();
                GlStateManager.blendFunc((int)770, (int)771);
                GlStateManager.alphaFunc((int)516, (float)0.003921569f);
            }
            Color passivec = _bc_0.jo.getColor();
            Color mobc = _bc_0.jp.getColor();
            Color playerc = _bc_0.jq.getColor();
            if (_as_0.fB.isModuleEnabled("Chams") && _bc_0.jr.is("Fill")) {
                if (entitylivingbaseIn instanceof EntityLiving && !(entitylivingbaseIn instanceof EntityMob) && _bc_0.jl.N) {
                    GL11.glPushAttrib((int)1048575);
                    GL11.glDisable((int)3008);
                    GL11.glDisable((int)3553);
                    GL11.glDisable((int)2896);
                    GL11.glEnable((int)3042);
                    GL11.glBlendFunc((int)770, (int)771);
                    GL11.glLineWidth((float)1.5f);
                    GL11.glEnable((int)2960);
                    GL11.glDisable((int)2929);
                    GL11.glDepthMask((boolean)false);
                    GL11.glEnable((int)10754);
                    OpenGlHelper.setLightmapTextureCoords((int)OpenGlHelper.lightmapTexUnit, (float)240.0f, (float)240.0f);
                    GL11.glColor3f((float)((float)passivec.getRed() / 255.0f), (float)((float)passivec.getGreen() / 255.0f), (float)((float)passivec.getBlue() / 255.0f));
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    GL11.glEnable((int)2929);
                    GL11.glDepthMask((boolean)true);
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    GL11.glEnable((int)3042);
                    GL11.glEnable((int)2896);
                    GL11.glEnable((int)3553);
                    GL11.glEnable((int)3008);
                    GL11.glPopAttrib();
                }
                if (entitylivingbaseIn instanceof EntityMob && _bc_0.jm.N) {
                    GL11.glPushAttrib((int)1048575);
                    GL11.glDisable((int)3008);
                    GL11.glDisable((int)3553);
                    GL11.glDisable((int)2896);
                    GL11.glEnable((int)3042);
                    GL11.glBlendFunc((int)770, (int)771);
                    GL11.glLineWidth((float)1.5f);
                    GL11.glEnable((int)2960);
                    GL11.glDisable((int)2929);
                    GL11.glDepthMask((boolean)false);
                    GL11.glEnable((int)10754);
                    OpenGlHelper.setLightmapTextureCoords((int)OpenGlHelper.lightmapTexUnit, (float)240.0f, (float)240.0f);
                    GL11.glColor3f((float)((float)mobc.getRed() / 255.0f), (float)((float)mobc.getGreen() / 255.0f), (float)((float)mobc.getBlue() / 255.0f));
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    GL11.glEnable((int)2929);
                    GL11.glDepthMask((boolean)true);
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    GL11.glEnable((int)3042);
                    GL11.glEnable((int)2896);
                    GL11.glEnable((int)3553);
                    GL11.glEnable((int)3008);
                    GL11.glPopAttrib();
                }
                if (entitylivingbaseIn instanceof EntityPlayer && _bc_0.jn.N) {
                    GL11.glPushAttrib((int)1048575);
                    GL11.glDisable((int)3008);
                    GL11.glDisable((int)3553);
                    GL11.glDisable((int)2896);
                    GL11.glEnable((int)3042);
                    GL11.glBlendFunc((int)770, (int)771);
                    GL11.glLineWidth((float)1.5f);
                    GL11.glEnable((int)2960);
                    GL11.glDisable((int)2929);
                    GL11.glDepthMask((boolean)false);
                    GL11.glEnable((int)10754);
                    OpenGlHelper.setLightmapTextureCoords((int)OpenGlHelper.lightmapTexUnit, (float)240.0f, (float)240.0f);
                    GL11.glColor3f((float)((float)playerc.getRed() / 255.0f), (float)((float)playerc.getGreen() / 255.0f), (float)((float)playerc.getBlue() / 255.0f));
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    GL11.glEnable((int)2929);
                    GL11.glDepthMask((boolean)true);
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    GL11.glEnable((int)3042);
                    GL11.glEnable((int)2896);
                    GL11.glEnable((int)3553);
                    GL11.glEnable((int)3008);
                    GL11.glPopAttrib();
                }
            } else {
                this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
            }
            if (_as_0.fB.getModule("ESP") != null && _as_0.fB.getModule("ESP").isEnabled() && _bG.mG.is("Outline")) {
                if (entitylivingbaseIn.isInvisible() && !_bG.mH.N) {
                    return;
                }
                if (entitylivingbaseIn instanceof EntityPlayer && entitylivingbaseIn != Minecraft.getMinecraft().player && _bG.mB.N) {
                    Color n = _bG.mC.getColor();
                    _bi_0.setColor(n);
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    _bi_0.renderOne((float)_bG.mF.getDoubleValue());
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    _bi_0.renderTwo();
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    _bi_0.renderThree();
                    _bi_0.renderFour(n);
                    _bi_0.setColor(n);
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    _bi_0.renderFive();
                } else if (entitylivingbaseIn instanceof EntityLiving && !(entitylivingbaseIn instanceof EntityMob) && _bG.mx.N) {
                    Color n = _bG.my.getColor();
                    _bi_0.setColor(n);
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    _bi_0.renderOne((float)_bG.mF.getDoubleValue());
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    _bi_0.renderTwo();
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    _bi_0.renderThree();
                    _bi_0.renderFour(n);
                    _bi_0.setColor(n);
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    _bi_0.renderFive();
                } else if (entitylivingbaseIn instanceof EntityMob && _bG.mz.N) {
                    Color n = _bG.mA.getColor();
                    _bi_0.setColor(n);
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    _bi_0.renderOne((float)_bG.mF.getDoubleValue());
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    _bi_0.renderTwo();
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    _bi_0.renderThree();
                    _bi_0.renderFour(n);
                    _bi_0.setColor(n);
                    this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
                    _bi_0.renderFive();
                }
                _bi_0.setColor(Color.WHITE);
            }
            this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
            if (flag1) {
                GlStateManager.disableBlend();
                GlStateManager.alphaFunc((int)516, (float)0.1f);
                GlStateManager.popMatrix();
                GlStateManager.depthMask((boolean)true);
            }
        }
    }
}

