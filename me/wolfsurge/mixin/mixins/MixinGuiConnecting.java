/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.multiplayer.GuiConnecting
 */
package me.wolfsurge.mixin.mixins;

import net.minecraft.client.multiplayer.GuiConnecting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiConnecting.class})
public class MixinGuiConnecting {
    @Inject(method={"drawScreen"}, at={@At(value="HEAD")})
    public void drawScreen(int mouseX, int mouseY, float partialTicks, CallbackInfo ci) {
        _ap_0.update("Playing Multiplayer");
    }
}

