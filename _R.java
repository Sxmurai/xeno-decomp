//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityPlayerSP
 */
import net.minecraft.client.entity.EntityPlayerSP;

public class _R
implements _cf_0 {
    public static final int[] pd = new int[]{-45, 45, 45, -45, 2, 0, 1, -45, 45, 45, -45, 2, 0, 1, 1, 0, 1, 0};

    public static boolean isMoving() {
        return (_R.pb.player.moveForward != 0.0f || _R.pb.player.moveStrafing != 0.0f ? pd[14] : pd[15]) != 0;
    }

    public static void setMoveSpeed(double d, float f) {
        EntityPlayerSP entityPlayerSP;
        Object object = entityPlayerSP = _R.pb.player.isRiding() ? _R.pb.player.getRidingEntity() : _R.pb.player;
        if (entityPlayerSP != null) {
            float f2 = _R.pb.player.movementInput.moveForward;
            float f3 = _R.pb.player.movementInput.moveStrafe;
            float f4 = _R.pb.player.rotationYaw;
            if (!_R.isMoving()) {
                entityPlayerSP.motionX = 0.0;
                entityPlayerSP.motionZ = 0.0;
            } else if (f2 != 0.0f) {
                if (f3 >= 1.0f) {
                    f4 += (float)(f2 > 0.0f ? pd[0] : pd[1]);
                    f3 = 0.0f;
                } else if (f3 <= -1.0f) {
                    f4 += (float)(f2 > 0.0f ? pd[2] : pd[3]);
                    f3 = 0.0f;
                }
                if (f2 > 0.0f) {
                    f2 = 1.0f;
                } else if (f2 < 0.0f) {
                    f2 = -1.0f;
                }
            }
            double d2 = Math.sin(Math.toRadians(f4 + 90.0f));
            double d3 = Math.cos(Math.toRadians(f4 + 90.0f));
            entityPlayerSP.motionX = (double)f2 * d * d3 + (double)f3 * d * d2;
            entityPlayerSP.motionZ = (double)f2 * d * d2 - (double)f3 * d * d3;
            entityPlayerSP.stepHeight = f;
            if (!_R.isMoving()) {
                entityPlayerSP.motionX = 0.0;
                entityPlayerSP.motionZ = 0.0;
            }
        }
    }

    public static double[] getMoveSpeed(double d) {
        float f = _R.pb.player.movementInput.moveForward;
        float f2 = _R.pb.player.movementInput.moveStrafe;
        float f3 = _R.pb.player.rotationYaw;
        if (!_R.isMoving()) {
            double[] dArray = new double[pd[4]];
            dArray[_R.pd[5]] = 0.0;
            dArray[_R.pd[6]] = 0.0;
            return dArray;
        }
        if (f != 0.0f) {
            if (f2 >= 1.0f) {
                f3 += (float)(f > 0.0f ? pd[7] : pd[8]);
                f2 = 0.0f;
            } else if (f2 <= -1.0f) {
                f3 += (float)(f > 0.0f ? pd[9] : pd[10]);
                f2 = 0.0f;
            }
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
        double[] dArray = new double[pd[11]];
        dArray[_R.pd[12]] = d4;
        dArray[_R.pd[13]] = d5;
        return dArray;
    }

    public static boolean hasMoved() {
        return Math.pow(_R.pb.player.motionX, 2.0) + Math.pow(_R.pb.player.motionY, 2.0) + Math.pow(_R.pb.player.motionZ, 2.0) >= 9.0E-4 ? pd[16] : pd[17];
    }

    public static void stopMotion(double d) {
        EntityPlayerSP entityPlayerSP;
        Object object = entityPlayerSP = _R.pb.player.isRiding() ? _R.pb.player.getRidingEntity() : _R.pb.player;
        if (entityPlayerSP != null) {
            entityPlayerSP.setVelocity(0.0, d, 0.0);
        }
    }
}

