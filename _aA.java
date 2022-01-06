/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.EnumDifficulty
 */
import net.minecraft.world.EnumDifficulty;

public class _aA {
    public static final int[] gu = new int[]{1, 2, 3};
    public static final /* synthetic */ int[] gt;

    static {
        gt = new int[EnumDifficulty.values().length];
        try {
            _aA.gt[EnumDifficulty.PEACEFUL.ordinal()] = gu[0];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            _aA.gt[EnumDifficulty.EASY.ordinal()] = gu[1];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            _aA.gt[EnumDifficulty.HARD.ordinal()] = gu[2];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

