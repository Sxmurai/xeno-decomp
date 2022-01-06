//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class _bU {
    public static final int[] nV = new int[]{-45, 45, 45, -45, 2, 0, 1, 3, 1, 0, 2, 0, 1, 3, 1, 0, 2, 0, 1, 2, 0, 1};

    public static double radToDeg(double d) {
        return d * (double)57.29578f;
    }

    public static double round(double d, int n) {
        if (n < 0) {
            return d;
        }
        return new BigDecimal(d).setScale(n, RoundingMode.HALF_UP).doubleValue();
    }

    public static double linear(double d, double d2, double d3) {
        return d < d2 - d3 ? d + d3 : (d > d2 + d3 ? d - d3 : d2);
    }

    public static double map(double d, double d2, double d3, double d4, double d5) {
        d = (d - d2) / (d3 - d2);
        return d4 + d * (d5 - d4);
    }

    public static double[] directionSpeed(double d) {
        Minecraft minecraft = Minecraft.getMinecraft();
        float f = minecraft.player.movementInput.moveForward;
        float f2 = minecraft.player.movementInput.moveStrafe;
        float f3 = minecraft.player.prevRotationYaw + (minecraft.player.rotationYaw - minecraft.player.prevRotationYaw) * minecraft.getRenderPartialTicks();
        if (f != 0.0f) {
            if (f2 > 0.0f) {
                f3 += (float)(f > 0.0f ? nV[0] : nV[1]);
            } else if (f2 < 0.0f) {
                f3 += (float)(f > 0.0f ? nV[2] : nV[3]);
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
        double[] dArray = new double[nV[4]];
        dArray[_bU.nV[5]] = d4;
        dArray[_bU.nV[6]] = d5;
        return dArray;
    }

    public static Vec3d direction(float f) {
        return new Vec3d(Math.cos(_bU.degToRad(f + 90.0f)), 0.0, Math.sin(_bU.degToRad(f + 90.0f)));
    }

    public static double parabolic(double d, double d2, double d3) {
        return d + (d2 - d) / d3;
    }

    public static float clamp(float f, float f2, float f3) {
        if (f <= f2) {
            f = f2;
        }
        if (f >= f3) {
            f = f3;
        }
        return f;
    }

    public static Vec3d interpolateEntity(Entity entity, float f) {
        return new Vec3d(entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f, entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f, entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f);
    }

    public static double degToRad(double d) {
        return d * 0.01745329238474369;
    }

    public static double getDistance(double d, double d2, double d3, double d4) {
        double d5 = d - d3;
        double d6 = d2 - d4;
        return MathHelper.sqrt((double)(d5 * d5 + d6 * d6));
    }

    public static float wrap(float f) {
        if ((f %= 360.0f) >= 180.0f) {
            f -= 360.0f;
        }
        if (f < -180.0f) {
            f += 360.0f;
        }
        return f;
    }

    public static double[] calcIntersection(double[] dArray, double[] dArray2) {
        double d = dArray[nV[7]] - dArray[nV[8]];
        double d2 = dArray[nV[9]] - dArray[nV[10]];
        double d3 = d * dArray[nV[11]] + d2 * dArray[nV[12]];
        double d4 = dArray2[nV[13]] - dArray2[nV[14]];
        double d5 = dArray2[nV[15]] - dArray2[nV[16]];
        double d6 = d4 * dArray2[nV[17]] + d5 * dArray2[nV[18]];
        double d7 = d * d5 - d4 * d2;
        double[] dArray3 = new double[nV[19]];
        dArray3[_bU.nV[20]] = (d5 * d3 - d2 * d6) / d7;
        dArray3[_bU.nV[21]] = (d * d6 - d4 * d3) / d7;
        return dArray3;
    }
}

