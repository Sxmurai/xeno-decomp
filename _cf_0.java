//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
import net.minecraft.client.Minecraft;

/*
 * Renamed from _cf
 */
public interface _cf_0 {
    public static final int[] pd = new int[]{1, 0};
    public static final char pc = '\u00a7';
    public static final Minecraft pb = Minecraft.getMinecraft();

    default public boolean nullCheck() {
        return (_cf_0.pb.world == null || _cf_0.pb.player == null ? pd[0] : pd[1]) != 0;
    }
}

