//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.init.Enchantments
 *  net.minecraft.item.ItemStack
 */
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;

/*
 * Renamed from _bg
 */
public class _bg_0 {
    public static final Enchantment jC;
    public static final Enchantment jA;
    public static final Enchantment jG;
    public static final Enchantment jF;
    public static final Enchantment jE;
    public static final Enchantment jD;
    public static final int[] jH;
    public static final Enchantment jB;

    public static int getEnchantmentLevel(Enchantment enchantment, ItemStack itemStack) {
        if (enchantment == null) {
            return jH[0];
        }
        return EnchantmentHelper.getEnchantmentLevel((Enchantment)enchantment, (ItemStack)itemStack);
    }

    static {
        jH = new int[]{0};
        jA = Enchantments.PROTECTION;
        jB = Enchantments.EFFICIENCY;
        jC = Enchantments.SILK_TOUCH;
        jD = Enchantments.LUCK_OF_THE_SEA;
        jE = Enchantments.LURE;
        jF = Enchantments.UNBREAKING;
        jG = Enchantments.MENDING;
    }

    public static boolean hasVanishingCurse(ItemStack itemStack) {
        return EnchantmentHelper.hasVanishingCurse((ItemStack)itemStack);
    }
}

