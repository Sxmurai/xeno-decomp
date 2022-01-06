/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class _bJ {
    public long mT;
    public boolean mU;
    public int mS;
    public static final int[] mV = new int[]{0, 0, 1};

    public boolean isDeleted() {
        return this.mU;
    }

    public int getDisplayList() {
        return this.mS;
    }

    public _bJ(int n, long l, boolean bl) {
        this.mU = mV[0];
        this.mS = n;
        this.mT = l;
        this.mU = bl;
    }

    public void setDeleted(boolean bl) {
        this.mU = bl;
    }

    public _bJ(int n, long l) {
        this.mU = mV[1];
        this.mS = n;
        this.mT = l;
    }

    public void finalize() {
        if (!this.mU) {
            GL11.glDeleteLists((int)this.mS, (int)mV[2]);
        }
    }

    public long getLastUsage() {
        return this.mT;
    }

    public void setLastUsage(long l) {
        this.mT = l;
    }
}

