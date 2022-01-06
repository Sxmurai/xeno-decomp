/*
 * Decompiled with CFR 0.152.
 */
public class _bF
extends _cv_0 {
    public float mt;
    public float mu;
    public float mv;

    public _bF(float f, float f2, float f3) {
        this.mt = f;
        this.mu = f2;
        this.mv = f3;
    }

    public float getStrafe() {
        return this.mt;
    }

    public float getForward() {
        return this.mv;
    }

    public float getVertical() {
        return this.mu;
    }
}

