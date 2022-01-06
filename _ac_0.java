//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

/*
 * Renamed from _ac
 */
public class _ac_0 {
    public static final int[] dc = new int[]{2, 0, 1, -45, 45, 45, -45, 2, 0, 1};

    public static double wrapDegrees(double d) {
        return MathHelper.wrapDegrees((double)d);
    }

    public static int ceil(double d) {
        return MathHelper.ceil((double)d);
    }

    public static double[] directionSpeed(double d) {
        Minecraft minecraft = Minecraft.getMinecraft();
        float f = minecraft.player.movementInput.moveForward;
        float f2 = minecraft.player.movementInput.moveStrafe;
        float f3 = minecraft.player.prevRotationYaw + (minecraft.player.rotationYaw - minecraft.player.prevRotationYaw) * minecraft.getRenderPartialTicks();
        if (f != 0.0f) {
            if (f2 > 0.0f) {
                f3 += (float)(f > 0.0f ? dc[3] : dc[4]);
            } else if (f2 < 0.0f) {
                f3 += (float)(f > 0.0f ? dc[5] : dc[6]);
            }
            f2 = 0.0f;
            if (f > 0.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = -1.0f;
            }
        }
        double d2 = Math.sin(Math.toRadians(f3 + 90.0f));
        double d3 = Math.cos(Math.toRadians(f3 + 90.0f));
        double d4 = (double)f * d * d3 + (double)f2 * d * d2;
        double d5 = (double)f * d * d2 - (double)f2 * d * d3;
        double[] dArray = new double[dc[7]];
        dArray[_ac_0.dc[8]] = d4;
        dArray[_ac_0.dc[9]] = d5;
        return dArray;
    }

    public static double roundToHalf(double d) {
        return (double)Math.round(d * 2.0) / 2.0;
    }

    public static int ceil(float f) {
        return MathHelper.ceil((float)f);
    }

    public static float[] calcAngle(Vec3d vec3d, Vec3d vec3d2) {
        double d = vec3d2.x - vec3d.x;
        double d2 = (vec3d2.y - vec3d.y) * -1.0;
        double d3 = vec3d2.z - vec3d.z;
        double d4 = MathHelper.sqrt((double)(d * d + d3 * d3));
        float[] fArray = new float[dc[0]];
        fArray[_ac_0.dc[1]] = (float)MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(d3, d)) - 90.0));
        fArray[_ac_0.dc[2]] = (float)MathHelper.wrapDegrees((double)Math.toDegrees(Math.atan2(d2, d4)));
        return fArray;
    }

    public static int roundUp(double d) {
        double d2 = 1.0 - d;
        return (int)(d + d2);
    }

    public static int floor(double d) {
        return MathHelper.floor((double)d);
    }

    public static float clamp(float f, float f2, float f3) {
        return f < f2 ? f2 : (f > f3 ? f3 : f);
    }

    public static float cos(float f) {
        return MathHelper.cos((float)f);
    }

    public static double roundAvoid(double d, int n) {
        double d2 = Math.pow(10.0, n);
        return (double)Math.round(d * d2) / d2;
    }

    public static float sin(float f) {
        return MathHelper.sin((float)f);
    }

    public static double square(float f) {
        return f * f;
    }

    public static int floor(float f) {
        return MathHelper.floor((float)f);
    }

    public static int clamp(int n, int n2, int n3) {
        return n < n2 ? n2 : (n > n3 ? n3 : n);
    }

    public static double clamp(double d, double d2, double d3) {
        return d < d2 ? d2 : (d > d3 ? d3 : d);
    }

    public static double roundDouble(double d, int n) {
        BigDecimal bigDecimal = new BigDecimal(d);
        bigDecimal = bigDecimal.setScale(n, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public static float wrapDegrees(float f) {
        return MathHelper.wrapDegrees((float)f);
    }
}

