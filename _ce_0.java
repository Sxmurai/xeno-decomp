//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 */
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

/*
 * Renamed from _ce
 */
public class _ce_0 {
    public static final int[] pa = new int[]{3, 0, 1, 2};

    public static double[] interpolate(Entity entity) {
        double d = Minecraft.getMinecraft().getRenderPartialTicks();
        double[] dArray = new double[pa[0]];
        dArray[_ce_0.pa[1]] = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * d;
        dArray[_ce_0.pa[2]] = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * d;
        dArray[_ce_0.pa[3]] = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * d;
        double[] dArray2 = dArray;
        return dArray2;
    }
}

