//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.renderer.EntityRenderer
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 */
package me.wolfsurge.mixin.mixins;

import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={EntityRenderer.class})
public class MixinEntityRenderer {
    @Redirect(method={"orientCamera"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/multiplayer/WorldClient;rayTraceBlocks(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;"), expect=0)
    private RayTraceResult rayTraceBlocks(WorldClient worldClient, Vec3d start, Vec3d end) {
        _aD event = new _aD();
        _as_0.fy.post(event);
        if (event.isCancelled()) {
            return null;
        }
        return worldClient.rayTraceBlocks(start, end);
    }
}

