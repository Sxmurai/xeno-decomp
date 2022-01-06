//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiMainMenu
 *  net.minecraft.client.gui.GuiScreen
 */
package me.wolfsurge.mixin.mixins;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiMainMenu.class})
public class MixinGuiMainMenu {
    @Inject(method={"drawScreen"}, at={@At(value="TAIL")}, cancellable=true)
    public void drawScreen(int mouseX, int mouseY, float partialTicks, CallbackInfo ci) {
        if (_cp_0.qa) {
            Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new _bs_0());
            return;
        }
        _cQ.render(mouseX, mouseY);
    }

    @Inject(method={"mouseClicked"}, at={@At(value="HEAD")})
    public void mouseClicked(int mouseX, int mouseY, int mouseButton, CallbackInfo ci) {
        _cQ.buttonPress(mouseX, mouseY, mouseButton);
    }
}

