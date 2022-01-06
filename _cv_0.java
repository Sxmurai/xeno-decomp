//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
import me.zero.alpine.type.Cancellable;
import net.minecraft.client.Minecraft;

/*
 * Renamed from _cv
 */
public class _cv_0
extends Cancellable {
    public float qE;
    public _aP qD;

    public float getPartialTicks() {
        return this.qE;
    }

    public void setPartialTicks(float f) {
        this.qE = f;
    }

    public void setEra(_aP _aP2) {
        this.qD = _aP2;
    }

    public _cv_0() {
        this.qE = Minecraft.getMinecraft().getRenderPartialTicks();
    }

    public _cv_0(_aP _aP2) {
        this.qD = _aP2;
        this.qE = Minecraft.getMinecraft().getRenderPartialTicks();
    }

    public _aP getEra() {
        return this.qD;
    }
}

