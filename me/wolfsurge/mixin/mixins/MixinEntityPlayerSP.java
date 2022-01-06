//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 */
package me.wolfsurge.mixin.mixins;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={EntityPlayerSP.class})
public class MixinEntityPlayerSP
implements _cf_0 {
    @Inject(method={"onUpdateWalkingPlayer"}, at={@At(value="TAIL")}, cancellable=true)
    public void hookUWPPost(CallbackInfo ci) {
        Minecraft mc = Minecraft.getMinecraft();
        _bx_0 e = new _bx_0(mc.player.posX, mc.player.getEntityBoundingBox().minY, mc.player.posZ, mc.player.rotationYaw, mc.player.rotationPitch, mc.player.onGround);
        _as_0.fy.post(e);
    }
}

