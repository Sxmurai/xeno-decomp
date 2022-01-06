/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.renderer.entity.RenderPlayer
 *  net.minecraft.entity.Entity
 */
package me.wolfsurge.mixin.mixins;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderPlayer.class})
public class MixinRenderPlayer {
    @Inject(method={"renderEntityName"}, at={@At(value="HEAD")}, cancellable=true)
    public void renderLivingLabel(AbstractClientPlayer entityIn, double x, double y, double z, String name, double distanceSq, CallbackInfo info) {
        if (_as_0.fB.isModuleEnabled("Nametags")) {
            info.cancel();
        }
        _aK event = new _aK((Entity)entityIn, x, y, z, name, distanceSq);
        _as_0.fy.post(event);
        if (event.isCancelled()) {
            info.cancel();
        }
    }
}

