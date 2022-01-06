/*
 * Decompiled with CFR 0.152.
 */
public class _cO
extends _bd_0 {
    public static final String[] sz;
    public int sy;
    public int sx;
    public static final int[] sA;

    public int getKeyCode() {
        return this.sx;
    }

    public void setKeyCode(int n) {
        this.sx = n;
    }

    public _cO(String string, int n) {
        this.ju = string;
        this.sx = n;
        this.sy = n;
    }

    public _cO(int n) {
        this.ju = sz[sA[0]];
        this.sx = n;
        this.sy = n;
    }

    static {
        sA = new int[]{0, 1, 0};
        String[] stringArray = new String[sA[1]];
        stringArray[_cO.sA[2]] = "Key";
        sz = stringArray;
    }
}

