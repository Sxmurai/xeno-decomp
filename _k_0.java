/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _k
 */
public class _k_0
extends _bd_0 {
    public static final int[] P = new int[]{0, 0, 0, 1, 0};
    public boolean N;
    public boolean O;

    public boolean getValue() {
        return this.N;
    }

    public void setEnabled(boolean bl) {
        this.N = bl;
    }

    public _k_0(String string, boolean bl) {
        this.ju = string;
        this.N = bl;
        this.O = P[0];
    }

    public _k_0(Object object, String string, boolean bl) {
        this.ju = string;
        this.N = bl;
        this.O = P[1];
    }

    public _k_0(String string, _bA _bA2, boolean bl) {
        this.ju = string;
        this.N = bl;
        this.O = P[2];
    }

    public boolean isEnabled() {
        return this.N;
    }

    public void toggle() {
        this.N = !this.N ? P[3] : P[4];
    }
}

