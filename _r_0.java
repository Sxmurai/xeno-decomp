/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.EnumDifficulty
 */
import net.minecraft.world.EnumDifficulty;

/*
 * Renamed from _r
 */
public class _r_0 {
    public static final /* synthetic */ int[] aq;
    public static final int[] ar = new int[]{1, 2, 3};

    static {
        aq = new int[EnumDifficulty.values().length];
        try {
            _r_0.aq[EnumDifficulty.PEACEFUL.ordinal()] = ar[0];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            _r_0.aq[EnumDifficulty.EASY.ordinal()] = ar[1];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            _r_0.aq[EnumDifficulty.HARD.ordinal()] = ar[2];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

