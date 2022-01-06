/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Dimension;
import java.awt.Toolkit;

public class _V {
    public static final int[] cA = new int[]{2, 2};

    public static int getDisplayWidth() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int n = (int)dimension.getWidth() / cA[0];
        return n;
    }

    public static int getDisplayHeight() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int n = (int)dimension.getHeight() / cA[1];
        return n;
    }
}

