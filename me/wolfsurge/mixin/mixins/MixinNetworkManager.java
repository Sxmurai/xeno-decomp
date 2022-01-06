/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  _t
 *  io.netty.channel.ChannelHandlerContext
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.Packet
 */
package me.wolfsurge.mixin.mixins;

import io.netty.channel.ChannelHandlerContext;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={NetworkManager.class})
public class MixinNetworkManager {
    @Inject(method={"sendPacket(Lnet/minecraft/network/Packet;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void preSendPacket(Packet<?> packet, CallbackInfo callbackInfo) {
        _bR event = new _bR(packet);
        _as_0.fy.post(event);
        if (event.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"channelRead0"}, at={@At(value="HEAD")}, cancellable=true)
    private void preChannelRead(ChannelHandlerContext context, Packet<?> packet, CallbackInfo callbackInfo) {
        _cy event = new _cy(packet);
        _as_0.fy.post(event);
        if (event.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"sendPacket(Lnet/minecraft/network/Packet;)V"}, at={@At(value="TAIL")}, cancellable=true)
    private void postSendPacket(Packet<?> packet, CallbackInfo callbackInfo) {
        _t event = new _t(packet);
        _as_0.fy.post(event);
        if (event.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"channelRead0"}, at={@At(value="TAIL")}, cancellable=true)
    private void postChannelRead(ChannelHandlerContext context, Packet<?> packet, CallbackInfo callbackInfo) {
        _aI event = new _aI(packet);
        _as_0.fy.post(event);
        if (event.isCancelled()) {
            callbackInfo.cancel();
        }
    }
}

