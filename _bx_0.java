/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _bx
 */
public class _bx_0
extends _cv_0 {
    public static double lt;
    public float lx;
    public static double lv;
    public float lw;
    public double lu;
    public boolean ly;

    public void setYaw(float f) {
        this.lw = f;
    }

    public void setX(double d) {
        lt = d;
    }

    public double getY() {
        return this.lu;
    }

    public void setZ(double d) {
        lv = d;
    }

    public void setOnGround(boolean bl) {
        this.ly = bl;
    }

    public float getPitch() {
        return this.lx;
    }

    public boolean isOnGround() {
        return this.ly;
    }

    public void setPitch(float f) {
        this.lx = f;
    }

    public void setY(double d) {
        this.lu = d;
    }

    public float getYaw() {
        return this.lw;
    }

    public double getZ() {
        return lv;
    }

    public _bx_0(double d, double d2, double d3, float f, float f2, boolean bl) {
        lt = d;
        this.lu = d2;
        lv = d3;
        this.lw = f;
        this.lx = f2;
        this.ly = bl;
    }

    public double getX() {
        return lt;
    }
}

