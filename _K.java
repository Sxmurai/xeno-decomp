/*
 * Decompiled with CFR 0.152.
 */
public class _K {
    public long bF = 0L;
    public static final int[] bG = new int[]{1, 0, 1, 0};

    public long getDifference() {
        return this.getTime() - this.bF;
    }

    public boolean hasTimeElapsed(long l, boolean bl) {
        if (System.currentTimeMillis() - this.bF > l) {
            if (bl) {
                this.reset();
            }
            return bG[0];
        }
        return bG[1];
    }

    public long getTime() {
        return System.nanoTime() / 1000000L;
    }

    public void reset() {
        this.bF = System.currentTimeMillis();
    }

    public boolean delay(float f) {
        return (float)(this.getTime() - this.bF) >= f ? bG[2] : bG[3];
    }

    public void setDifference(long l) {
        this.bF = this.getTime() - l;
    }
}

