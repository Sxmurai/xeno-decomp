//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemStack
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/*
 * Renamed from _cg
 */
public class _cg_0 {
    public static final int[] pe = new int[]{1, 0, 1, 0, 2};

    public static boolean isNullOrEmpty(Item item) {
        return item == null ? pe[0] : pe[1];
    }

    public static boolean isNullOrEmpty(ItemStack itemStack) {
        return (itemStack == null || itemStack.isEmpty() ? pe[2] : pe[3]) != 0;
    }

    public static float getArmorToughness(ItemArmor itemArmor) {
        return itemArmor.toughness;
    }

    public static int getArmorType(ItemArmor itemArmor) {
        return itemArmor.armorType.ordinal() - pe[4];
    }
}

