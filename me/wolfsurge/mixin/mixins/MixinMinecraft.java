//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.world.WorldSettings
 */
package me.wolfsurge.mixin.mixins;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.world.WorldSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Minecraft.class})
public class MixinMinecraft {
    @Inject(method={"init"}, at={@At(value="TAIL")})
    private void displayMainMenu(CallbackInfo ci) {
        if (_cp_0.qa) {
            Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new _bs_0());
        }
    }

    @Inject(method={"launchIntegratedServer"}, at={@At(value="TAIL")})
    public void singlePlayerDiscordRP(String minecraftsessionservice, String gameprofilerepository, WorldSettings playerprofilecache, CallbackInfo ci) {
        _ap_0.update("Playing Singleplayer");
    }
}

