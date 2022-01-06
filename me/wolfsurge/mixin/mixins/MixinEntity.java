//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 */
package me.wolfsurge.mixin.mixins;

import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={Entity.class})
public class MixinEntity {
    @Redirect(method={"applyEntityCollision"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;addVelocity(DDD)V"))
    public void addVelocityHook(Entity entity, double x, double y, double z) {
        _B event = new _B(entity, x, y, z, true);
        _as_0.fy.post(event);
        if (!event.isCancelled()) {
            entity.motionX += event.aZ;
            entity.motionY += event.ba;
            entity.motionZ += event.bb;
            entity.isAirBorne = event.bc;
        }
    }
}

